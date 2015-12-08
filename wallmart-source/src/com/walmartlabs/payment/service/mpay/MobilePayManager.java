// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.mpay;

import android.content.Context;
import android.location.Location;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.kangaroo.Callback;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.msco.service.StoreModeEvent;
import com.walmartlabs.payment.service.PaymentServices;
import com.walmartlabs.payment.service.customer.CustomerService;
import com.walmartlabs.payment.service.customer.MetaHeader;
import com.walmartlabs.payment.service.payment.CreateUserRequest;
import com.walmartlabs.payment.service.payment.PairRequest;
import com.walmartlabs.payment.service.pin.PinPreferences;
import com.walmartlabs.utils.LocationUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.walmartlabs.payment.service.mpay:
//            MobilePayEvent, MobilePayPreferences, PilotRegion

public class MobilePayManager
{
    private class AvailabilityState
    {

        private boolean mEnabled;
        private String mInStoreId;
        private boolean mManuallyEnabled;
        private boolean mMobilePayAvailable;
        private boolean mPilot;
        private final Set mPilotRegions;
        private final Set mPilotStores;
        private String mPreferredStoreId;
        final MobilePayManager this$0;

        private void checkMobilePayAvailable()
        {
            boolean flag2 = isEnabled();
            boolean flag1 = flag2;
            if (flag2)
            {
                flag1 = flag2;
                if (isPilot())
                {
                    flag1 = isInPilotStore() | preferPilotStore() | isInPilotArea() | isManuallyEnabled();
                }
            }
            boolean flag;
            if (mMobilePayAvailable != flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mMobilePayAvailable = flag1;
            if (flag)
            {
                MobilePayPreferences.setMobilePayAvailable(mContext, mMobilePayAvailable);
                MessageBus.getBus().post(produceMobilePayEvent());
            }
        }

        private boolean isEnabled()
        {
            return mEnabled;
        }

        private boolean isInPilotArea()
        {
label0:
            {
                Location location = LocationUtils.getLastKnownLocation(mContext);
                if (location == null)
                {
                    break label0;
                }
                Iterator iterator = mPilotRegions.iterator();
                PilotRegion pilotregion;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    pilotregion = (PilotRegion)iterator.next();
                } while (location.distanceTo(pilotregion.mLocation) >= (float)pilotregion.mRadius);
                return true;
            }
            return false;
        }

        private boolean isInPilotStore()
        {
            return mInStoreId != null && mPilotStores.contains(mInStoreId);
        }

        private boolean isManuallyEnabled()
        {
            return mManuallyEnabled;
        }

        private boolean isPilot()
        {
            return mPilot;
        }

        private boolean preferPilotStore()
        {
            return mPreferredStoreId != null && mPilotStores.contains(mPreferredStoreId);
        }

        private void setEnabled(boolean flag)
        {
            mEnabled = flag;
            checkMobilePayAvailable();
        }

        private void setInStoreId(String s)
        {
            mInStoreId = s;
            checkMobilePayAvailable();
        }

        private void setManuallyEnabled(boolean flag)
        {
            mManuallyEnabled = flag;
            MobilePayPreferences.setMobilePayManuallyEnabled(mContext, mManuallyEnabled);
            checkMobilePayAvailable();
        }

        private void setPilot(boolean flag)
        {
            mPilot = flag;
            checkMobilePayAvailable();
        }

        private void setPilotStores(String as[])
        {
            mPilotStores.clear();
            if (as != null)
            {
                mPilotStores.addAll(Arrays.asList(as));
            }
            checkMobilePayAvailable();
        }

        private void setPreferredStore(String s)
        {
            mPreferredStoreId = s;
            checkMobilePayAvailable();
        }

        public void init()
        {
            mMobilePayAvailable = MobilePayPreferences.isMobilePayAvailable(mContext);
            mManuallyEnabled = MobilePayPreferences.isMobilePayManuallyEnabled(mContext);
        }

        public void setPilotRegions(Set set)
        {
            mPilotRegions.clear();
            if (set != null)
            {
                mPilotRegions.addAll(set);
            }
            checkMobilePayAvailable();
        }









        private AvailabilityState()
        {
            this$0 = MobilePayManager.this;
            super();
            mPilotStores = new HashSet();
            mPilotRegions = new HashSet();
        }

    }

    private class MetaState
    {

        private final String mAppId;
        private final Long mAppInstallDate;
        private final String mDeviceId;
        final MobilePayManager this$0;




        private MetaState(String s, String s1, Long long1)
        {
            this$0 = MobilePayManager.this;
            super();
            mAppId = s;
            mAppInstallDate = long1;
            mDeviceId = s1;
        }

    }

    public static interface UserInfoInterface
    {

        public abstract void onGetUserInfo(boolean flag);
    }


    private static MobilePayManager sInstance;
    private final AvailabilityState mAvailabilityState = new AvailabilityState();
    private final Context mContext;
    private String mCurrentCid;
    private boolean mHasUserPayStatus;
    private final List mInFlightRequests = new ArrayList();
    private MetaState mMetaState;
    private boolean mUserHasPay;

    protected MobilePayManager(Context context)
    {
        mContext = context.getApplicationContext();
    }

    private void cancelInFlightRequests()
    {
        for (Iterator iterator = mInFlightRequests.iterator(); iterator.hasNext(); ((Request)iterator.next()).cancel()) { }
        mInFlightRequests.clear();
    }

    private static MetaHeader createMetaHeader(Context context, MetaState metastate)
    {
        MetaHeader metaheader = new MetaHeader();
        context = LocationUtils.getLastKnownLocation(context);
        boolean flag;
        if (context != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        metaheader.locationEnabled = flag;
        if (context != null)
        {
            metaheader.latitude = Double.valueOf(context.getLatitude());
            metaheader.longitude = Double.valueOf(context.getLongitude());
        }
        if (metastate != null)
        {
            metaheader.appInstallDate = metastate.mAppInstallDate;
            metaheader.appId = metastate.mAppId;
            metaheader.deviceId = metastate.mDeviceId;
        }
        return metaheader;
    }

    public static MobilePayManager get()
    {
        return sInstance;
    }

    protected static void setInstance(MobilePayManager mobilepaymanager)
    {
        sInstance = mobilepaymanager;
    }

    private void updateUserPayState(Result result, String s)
    {
        boolean flag1 = true;
        boolean flag;
        if (result.successful() && !result.hasError() && result.hasData())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mUserHasPay = flag;
        if (mUserHasPay && mCurrentCid != null && mCurrentCid.equals(s))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mHasUserPayStatus = flag;
    }

    public void createUser(CreateUserRequest createuserrequest, final Callback callback)
    {
        final String cid = mCurrentCid;
        mHasUserPayStatus = false;
        mInFlightRequests.add(PaymentServices.get().getCustomerService().createUser(createuserrequest).addCallback(new CallbackSameThread() {

            final MobilePayManager this$0;
            final Callback val$callback;
            final String val$cid;

            public void onResultSameThread(Request request, Result result)
            {
                mInFlightRequests.remove(request);
                updateUserPayState(result, cid);
                if (callback != null)
                {
                    callback.onResult(request, result);
                }
            }

            
            {
                this$0 = MobilePayManager.this;
                cid = s;
                callback = callback1;
                super();
            }
        }));
    }

    protected Context getContext()
    {
        return mContext;
    }

    public Request getUserCards()
    {
        Request request = PaymentServices.get().getCustomerService().userCards(createMetaHeader(mContext, mMetaState)).addCallback(new CallbackSameThread() {

            final MobilePayManager this$0;

            public void onResultSameThread(Request request1, Result result)
            {
                mInFlightRequests.remove(request1);
            }

            
            {
                this$0 = MobilePayManager.this;
                super();
            }
        });
        mInFlightRequests.add(request);
        return request;
    }

    public void getUserInfo(final UserInfoInterface userInfoInterface)
    {
        final String cid = mCurrentCid;
        if (mHasUserPayStatus)
        {
            if (userInfoInterface != null)
            {
                userInfoInterface.onGetUserInfo(mUserHasPay);
            }
            return;
        } else
        {
            mInFlightRequests.add(PaymentServices.get().getCustomerService().user(createMetaHeader(mContext, mMetaState)).addCallback(new CallbackSameThread() {

                final MobilePayManager this$0;
                final String val$cid;
                final UserInfoInterface val$userInfoInterface;

                public void onResultSameThread(Request request, Result result)
                {
                    mInFlightRequests.remove(request);
                    updateUserPayState(result, cid);
                    if (userInfoInterface != null)
                    {
                        userInfoInterface.onGetUserInfo(mUserHasPay);
                    }
                }

            
            {
                this$0 = MobilePayManager.this;
                cid = s;
                userInfoInterface = userinfointerface;
                super();
            }
            }));
            return;
        }
    }

    public Request getUserTransaction()
    {
        Request request = PaymentServices.get().getCustomerService().getUserTransaction(createMetaHeader(mContext, mMetaState)).addCallback(new CallbackSameThread() {

            final MobilePayManager this$0;

            public void onResultSameThread(Request request1, Result result)
            {
                mInFlightRequests.remove(request1);
            }

            
            {
                this$0 = MobilePayManager.this;
                super();
            }
        });
        mInFlightRequests.add(request);
        return request;
    }

    protected void init()
    {
        mAvailabilityState.init();
        MessageBus.getBus().register(this);
    }

    protected void innerDestroy()
    {
        cancelInFlightRequests();
        MessageBus.getBus().unregister(this);
    }

    public boolean isManuallyEnabled()
    {
        return mAvailabilityState.isManuallyEnabled();
    }

    public boolean isMobilePayAvailable()
    {
        return mAvailabilityState.mMobilePayAvailable;
    }

    public void onAuthenticationStatusEvent(AuthenticationStatusEvent authenticationstatusevent)
    {
        mHasUserPayStatus = false;
        mUserHasPay = false;
        if (authenticationstatusevent.loggedIn && authenticationstatusevent.hasCredentials)
        {
            mCurrentCid = authenticationstatusevent.cid;
            getUserInfo(null);
            return;
        }
        if (mCurrentCid != null)
        {
            PinPreferences.resetPinPassed(mContext, mCurrentCid);
        }
        mCurrentCid = null;
        cancelInFlightRequests();
    }

    public void onStoreModeEvent(StoreModeEvent storemodeevent)
    {
        mAvailabilityState.setInStoreId(storemodeevent.getStoreId());
    }

    public Request pairUser(PairRequest pairrequest)
    {
        pairrequest = PaymentServices.get().getCustomerService().pairUser(pairrequest, createMetaHeader(mContext, mMetaState)).addCallback(new CallbackSameThread() {

            final MobilePayManager this$0;

            public void onResultSameThread(Request request, Result result)
            {
                mInFlightRequests.remove(request);
            }

            
            {
                this$0 = MobilePayManager.this;
                super();
            }
        });
        mInFlightRequests.add(pairrequest);
        return pairrequest;
    }

    public MobilePayEvent produceMobilePayEvent()
    {
        return new MobilePayEvent(isMobilePayAvailable());
    }

    public void setEnabled(boolean flag)
    {
        mAvailabilityState.setEnabled(flag);
    }

    public void setManuallyEnabled(boolean flag)
    {
        mAvailabilityState.setManuallyEnabled(flag);
    }

    protected void setMetaData(String s, String s1, long l)
    {
        mMetaState = new MetaState(s, s1, Long.valueOf(l));
    }

    public void setPilot(boolean flag)
    {
        mAvailabilityState.setPilot(flag);
    }

    protected void setPilotRegions(Set set)
    {
        mAvailabilityState.setPilotRegions(set);
    }

    public void setPilotStores(String as[])
    {
        mAvailabilityState.setPilotStores(as);
    }

    protected void setPreferredStore(String s)
    {
        mAvailabilityState.setPreferredStore(s);
    }




}
