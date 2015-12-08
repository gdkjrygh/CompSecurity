// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice.fastpickup;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.app.fastpickup.FastPickupUtil;
import com.walmart.android.app.storelocator.LocationCompletedEvent;
import com.walmart.android.data.FastPickupOrder;
import com.walmart.android.data.FastPickupUserStatus;
import com.walmart.android.events.FastPickupOrderReadyEvent;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.wmservice.fastpickup:
//            FastPickupLocalNotification, FastPickupService

public class FastPickupManager
{
    static class Model
    {

        private static final long LONG_SCHEDULE_INTERVAL = 0x1499700L;
        private static final long SHORT_SCHEDULE_INTERVAL = 0x1d4c0L;
        private boolean mChanged;
        private FastPickupOrderReadyEvent mCurrentEvent;
        private String mCustomerId;
        private HashMap mCustomerStatus;
        private int mError;
        private boolean mInStore;
        private long mLastServerUpdate;
        private boolean mLocationEnabled;
        private FastPickupOrder mOrders;
        private String mStoreId;

        private boolean updateEvent()
        {
            boolean flag = mChanged;
            if (mChanged)
            {
                mChanged = false;
                mCurrentEvent = new FastPickupOrderReadyEvent(mStoreId, mCustomerId, mOrders, mInStore, mLocationEnabled, mCustomerStatus);
                WLog.d(FastPickupManager.TAG, (new StringBuilder()).append("updateEvent(): mCurrentEvent=").append(mCurrentEvent).toString());
            }
            return flag;
        }

        public FastPickupOrderReadyEvent getCurrentEvent()
        {
            return mCurrentEvent;
        }

        public String getCustomerId()
        {
            return mCustomerId;
        }

        public int getError()
        {
            return mError;
        }

        public long getLastServerUpdate()
        {
            return mLastServerUpdate;
        }

        public FastPickupOrder getOrders()
        {
            return mOrders;
        }

        public long getScheduleInterval()
        {
            long l;
label0:
            {
                long l1 = 0x1499700L;
                l = l1;
                if (mOrders == null)
                {
                    break label0;
                }
                l = l1;
                if (!mInStore)
                {
                    break label0;
                }
                Iterator iterator = mOrders.getStores().iterator();
                com.walmart.android.data.FastPickupOrder.Store store;
                do
                {
                    l = l1;
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    store = (com.walmart.android.data.FastPickupOrder.Store)iterator.next();
                } while (!isCheckedIn(store.number) || mOrders.getCount(store.number) <= 0);
                l = 0x1d4c0L;
            }
            return l;
        }

        public String getStoreId()
        {
            return mStoreId;
        }

        public boolean isCheckedIn(String s)
        {
            s = (Integer)mCustomerStatus.get(s);
            return s != null && (1 == s.intValue() || 2 == s.intValue() || 3 == s.intValue());
        }

        public boolean isInStore()
        {
            return mInStore;
        }

        public boolean isLoggedIn()
        {
            return !TextUtils.isEmpty(mCustomerId);
        }

        public void reset()
        {
            if (mOrders != null || !TextUtils.isEmpty(mCustomerId))
            {
                mCustomerId = null;
                mOrders = null;
                mChanged = true;
            }
        }

        public void setCustomerId(String s)
        {
            mChanged = mChanged | FastPickupUtil.fieldChanged(mCustomerId, s);
            mCustomerId = s;
        }

        public void setCustomerStatus(String s, int i)
        {
            int j = ((Integer)mCustomerStatus.get(s)).intValue();
            boolean flag = mChanged;
            if (j != i)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            mChanged = j | flag;
            mCustomerStatus.put(s, Integer.valueOf(i));
        }

        public void setError(int i)
        {
            mError = i;
        }

        public boolean setInStore(boolean flag)
        {
            boolean flag1;
            if (mInStore != flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            mChanged = mChanged | flag1;
            mInStore = flag;
            if (flag1 && mInStore)
            {
                mStoreId = null;
            }
            return flag1;
        }

        public void setLocationEnabled(boolean flag)
        {
            boolean flag2 = mChanged;
            boolean flag1;
            if (mLocationEnabled != flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            mChanged = flag1 | flag2;
            mLocationEnabled = flag;
        }

        public void setStoreId(String s)
        {
            mChanged = mChanged | FastPickupUtil.fieldChanged(mStoreId, s);
            mStoreId = s;
        }

        public void updateServerState(FastPickupOrder fastpickuporder, int i)
        {
            WLog.d(FastPickupManager.TAG, "Model.updateServerState()");
            mLastServerUpdate = System.currentTimeMillis();
            if (FastPickupUtil.fieldChanged(mOrders, fastpickuporder))
            {
                WLog.d(FastPickupManager.TAG, "Model.updateServerState() order changed");
                WLog.d(FastPickupManager.TAG, (new StringBuilder()).append("current order: ").append(mOrders).toString());
                WLog.d(FastPickupManager.TAG, (new StringBuilder()).append("new order: ").append(fastpickuporder).toString());
                mChanged = true;
                mOrders = fastpickuporder;
            }
            if (FastPickupUtil.fieldChanged(Integer.valueOf(mError), Integer.valueOf(i)))
            {
                mError = i;
                mChanged = true;
            }
            if (fastpickuporder != null)
            {
                fastpickuporder = fastpickuporder.getCustomerStatus();
            } else
            {
                fastpickuporder = new HashMap();
            }
            if (FastPickupUtil.fieldChanged(mCustomerStatus, fastpickuporder))
            {
                WLog.d(FastPickupManager.TAG, "Model.updateServerState() customer state changed");
                mCustomerStatus = fastpickuporder;
                mChanged = true;
            }
        }



        Model()
        {
            mCustomerStatus = new HashMap();
            mCurrentEvent = new FastPickupOrderReadyEvent();
            mChanged = false;
        }
    }


    private static final String TAG = com/walmart/android/wmservice/fastpickup/FastPickupManager.getSimpleName();
    private static FastPickupManager sInstance;
    private final Context mContext;
    private final FastPickupLocalNotification mFastPickupLocalNotification;
    private final Handler mHandler = new Handler();
    private ArrayList mListeners;
    private final Model mModel = new Model();

    public FastPickupManager(Context context)
    {
        mListeners = new ArrayList();
        mContext = context.getApplicationContext();
        if (SharedPreferencesUtil.isStoreFeatureNotificationsEnabled(mContext))
        {
            mFastPickupLocalNotification = FastPickupLocalNotification.create(mContext);
            return;
        } else
        {
            mFastPickupLocalNotification = null;
            return;
        }
    }

    public static FastPickupManager create(Context context)
    {
        WLog.d(TAG, (new StringBuilder()).append("create() ").append(sInstance).toString());
        if (sInstance == null)
        {
            sInstance = new FastPickupManager(context);
            sInstance.init();
        }
        return sInstance;
    }

    public static void destroy()
    {
        WLog.d(TAG, (new StringBuilder()).append("destroy() ").append(sInstance).toString());
        if (sInstance != null)
        {
            sInstance.innerDestroy();
            sInstance = null;
        }
    }

    private void init()
    {
        MessageBus.getBus().register(this);
    }

    private void innerDestroy()
    {
        MessageBus.getBus().unregister(this);
        if (mFastPickupLocalNotification != null)
        {
            mFastPickupLocalNotification.destroy();
        }
    }

    private void updateStatus(AsyncCallback asynccallback)
    {
        if (mModel.updateEvent())
        {
            if (asynccallback != null)
            {
                if (mModel.getError() == 0)
                {
                    asynccallback.onSuccess(mModel.getCurrentEvent());
                } else
                {
                    asynccallback.onFailure(Integer.valueOf(mModel.getError()), mModel.getCurrentEvent());
                }
            }
            WLog.d(TAG, (new StringBuilder()).append("updateStatus(): ").append(mModel.getCurrentEvent()).toString());
            MessageBus.getBus().post(mModel.getCurrentEvent());
        }
    }

    public boolean checkin(String s, AsyncCallback asynccallback)
    {
        String s1 = TAG;
        StringBuilder stringbuilder = (new StringBuilder()).append("checkin() ").append(s).append(", ").append(mModel.getOrders()).append(", ");
        Object obj;
        if (mModel.getOrders() != null)
        {
            obj = Integer.valueOf(mModel.getOrders().getCount(s));
        } else
        {
            obj = "";
        }
        WLog.d(s1, stringbuilder.append(obj).toString());
        if (mModel.isLoggedIn() && mModel.getOrders() != null && mModel.getOrders().getCount(s) > 0)
        {
            asynccallback = new AsyncCallbackOnThread(s) {

                final FastPickupManager this$0;
                final String val$storeId;
                final AsyncCallback val$uiCallback;

                public void onFailureSameThread(Integer integer, FastPickupUserStatus fastpickupuserstatus)
                {
                    WLog.d(FastPickupManager.TAG, (new StringBuilder()).append("onFailureSameThread error=").append(integer).append(" data=").append(fastpickupuserstatus).toString());
                    if (uiCallback != null)
                    {
                        uiCallback.onFailure(integer, null);
                    }
                }

                public volatile void onFailureSameThread(Object obj1, Object obj2)
                {
                    onFailureSameThread((Integer)obj1, (FastPickupUserStatus)obj2);
                }

                public void onSuccessSameThread(FastPickupUserStatus fastpickupuserstatus)
                {
                    WLog.d(FastPickupManager.TAG, (new StringBuilder()).append("onSuccessSameThread data=").append(fastpickupuserstatus).toString());
                    if (fastpickupuserstatus != null && fastpickupuserstatus.status == 0 && fastpickupuserstatus.data != null)
                    {
                        mModel.setCustomerStatus(storeId, fastpickupuserstatus.data.getUserStatus());
                        WLog.d(FastPickupManager.TAG, (new StringBuilder()).append("onSuccessSameThread() store:").append(storeId).append(" status=").append(0).toString());
                        updateStatus(uiCallback);
                        return;
                    }
                    int i;
                    if (fastpickupuserstatus != null)
                    {
                        i = fastpickupuserstatus.status;
                    } else
                    {
                        i = 0x15f91;
                    }
                    onFailureSameThread(Integer.valueOf(i), fastpickupuserstatus);
                }

                public volatile void onSuccessSameThread(Object obj1)
                {
                    onSuccessSameThread((FastPickupUserStatus)obj1);
                }

            
            {
                this$0 = FastPickupManager.this;
                uiCallback = asynccallback;
                storeId = s;
                super(final_handler);
            }
            };
            Services.get().getWalmartService().setFastPickupUserStatus(s, "checkedin", asynccallback);
            return true;
        } else
        {
            return false;
        }
    }

    public FastPickupOrderReadyEvent getFastPickupOrderReadyEvent()
    {
        WLog.d(TAG, (new StringBuilder()).append("getFastPickupOrderReadyEvent() ").append(mModel.getCurrentEvent()).toString());
        return mModel.getCurrentEvent();
    }

    Model getModel()
    {
        return mModel;
    }

    public void onAuthenticationStatusEvent(AuthenticationStatusEvent authenticationstatusevent)
    {
        WLog.d(TAG, (new StringBuilder()).append("onAuthenticationStatusEvent :").append(authenticationstatusevent.customerId).append(", loggedIn: ").append(authenticationstatusevent.loggedIn).append(", hasCredentials:").append(authenticationstatusevent.hasCredentials).toString());
        if (!FastPickupUtil.isUseStorePickup()) goto _L2; else goto _L1
_L1:
        if (authenticationstatusevent.loggedIn) goto _L4; else goto _L3
_L3:
        mModel.reset();
_L6:
        updateStatus(null);
_L2:
        return;
_L4:
        if (!mModel.isLoggedIn() && mModel.getOrders() == null)
        {
            refresh(true);
        }
        if (FastPickupUtil.fieldChanged(mModel.getCustomerId(), authenticationstatusevent.customerId))
        {
            mModel.setCustomerId(authenticationstatusevent.customerId);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onLocationCompletedEvent(LocationCompletedEvent locationcompletedevent)
    {
        WLog.d(TAG, (new StringBuilder()).append("onLocationCompletedEvent() ").append(locationcompletedevent).toString());
        mModel.setLocationEnabled(locationcompletedevent.mLocationEnabled);
        mModel.setInStore(locationcompletedevent.isInStore());
        LocationCompletedEvent locationcompletedevent1 = null;
        if (mModel.isInStore())
        {
            locationcompletedevent = locationcompletedevent.mClosestStoreData.getId();
            locationcompletedevent1 = locationcompletedevent;
            if (mModel.mOrders == null)
            {
                WLog.d(TAG, "onLocationCompletedEvent() refresh order");
                refresh(false);
                locationcompletedevent1 = locationcompletedevent;
            }
        }
        if (FastPickupUtil.fieldChanged(mModel.getStoreId(), locationcompletedevent1))
        {
            mModel.setStoreId(locationcompletedevent1);
            WLog.d(TAG, (new StringBuilder()).append("onLocationCompletedEvent() set new store:").append(mModel.getStoreId()).toString());
        }
        updateStatus(null);
    }

    public void refresh(AsyncCallback asynccallback, boolean flag)
    {
        WLog.d(TAG, "refresh()");
        if (FastPickupUtil.isUseStorePickup())
        {
            if (asynccallback != null)
            {
                mListeners.add(asynccallback);
            }
            FastPickupService.refresh(mContext, flag);
        }
    }

    public void refresh(boolean flag)
    {
        refresh(null, flag);
    }

    public void resetServerState()
    {
        updateServerState(null, 0);
    }

    void updateServerState(FastPickupOrder fastpickuporder, int i)
    {
        mModel.updateServerState(fastpickuporder, i);
        if (mModel.updateEvent())
        {
            while (!mListeners.isEmpty()) 
            {
                fastpickuporder = (AsyncCallback)mListeners.remove(0);
                if (mModel.getError() == 0)
                {
                    fastpickuporder.onSuccess(mModel.getCurrentEvent());
                } else
                {
                    fastpickuporder.onFailure(Integer.valueOf(mModel.getError()), mModel.getCurrentEvent());
                }
            }
            WLog.d(TAG, (new StringBuilder()).append("updateServerState(): ").append(mModel.getCurrentEvent()).toString());
            MessageBus.getBus().post(mModel.getCurrentEvent());
        }
    }




}
