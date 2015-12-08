// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.android.pharmacy.data.CartCheckoutData;
import com.walmartlabs.android.pharmacy.data.CoolDownData;
import com.walmartlabs.android.pharmacy.data.LinkAccountData;
import com.walmartlabs.android.pharmacy.data.TransferRxData;
import com.walmartlabs.android.pharmacy.data.ValidateAccountData;
import com.walmartlabs.android.pharmacy.events.ServiceSuspendedEvent;
import com.walmartlabs.android.pharmacy.events.SessionEndedEvent;
import com.walmartlabs.android.pharmacy.service.PharmacyService;
import com.walmartlabs.android.pharmacy.ui.DialogFactory;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreFinderConfigurator;
import com.walmartlabs.utils.WLog;
import java.util.Locale;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacySession, PharmacyResponse, PharmacyAuthenticator, PharmacyStoreHelper

public class PharmacyManager
{
    public static interface HasRxEnabledAccountCallback
    {

        public abstract void onResult(HasRxEnabledAccountResult hasrxenabledaccountresult);
    }

    public static final class HasRxEnabledAccountResult extends Enum
    {

        private static final HasRxEnabledAccountResult $VALUES[];
        public static final HasRxEnabledAccountResult NO;
        public static final HasRxEnabledAccountResult UNKNOWN;
        public static final HasRxEnabledAccountResult YES;

        public static HasRxEnabledAccountResult valueOf(String s)
        {
            return (HasRxEnabledAccountResult)Enum.valueOf(com/walmartlabs/android/pharmacy/PharmacyManager$HasRxEnabledAccountResult, s);
        }

        public static HasRxEnabledAccountResult[] values()
        {
            return (HasRxEnabledAccountResult[])$VALUES.clone();
        }

        static 
        {
            UNKNOWN = new HasRxEnabledAccountResult("UNKNOWN", 0);
            NO = new HasRxEnabledAccountResult("NO", 1);
            YES = new HasRxEnabledAccountResult("YES", 2);
            $VALUES = (new HasRxEnabledAccountResult[] {
                UNKNOWN, NO, YES
            });
        }

        private HasRxEnabledAccountResult(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface OnFlowCompleted
    {

        public abstract void onFlowCompleted();
    }

    public static interface VerifySessionCallback
    {

        public abstract void onSessionAvailable();

        public abstract void onSessionUnavailable();
    }


    private static final String TAG = com/walmartlabs/android/pharmacy/PharmacyManager.getSimpleName();
    private static PharmacyManager sInstance;
    private PharmacyAuthenticator mAuthenticator;
    private final Context mContext;
    private boolean mHasCleanedDanglingServiceSession;
    private PharmacyService mService;
    private PharmacySession mSession;
    private PharmacyStoreHelper mStoreHelper;

    private PharmacyManager(Context context)
    {
        mContext = context;
    }

    public static PharmacyManager create(Context context)
    {
        if (sInstance == null)
        {
            sInstance = new PharmacyManager(context.getApplicationContext());
            sInstance.init();
        }
        return sInstance;
    }

    public static PharmacyManager get()
    {
        return sInstance;
    }

    private void handleServiceSessionTimeout()
    {
        WLog.i(TAG, "Pharmacy service session has timed out");
        if (mSession != null)
        {
            mSession.timeOut();
        }
    }

    private void handleServiceSuspended()
    {
        WLog.i(TAG, "Pharmacy service has been suspended");
        MessageBus.getBus().post(new ServiceSuspendedEvent());
    }

    private void handleWrappedFailure(AsyncCallbackOnThread asynccallbackonthread, Integer integer, PharmacyResponse pharmacyresponse)
    {
        if (pharmacyresponse == null) goto _L2; else goto _L1
_L1:
        pharmacyresponse.status;
        JVM INSTR lookupswitch 2: default 36
    //                   1000: 52
    //                   1009: 43;
           goto _L2 _L3 _L4
_L2:
        asynccallbackonthread.onFailure(integer, pharmacyresponse);
        return;
_L4:
        handleServiceSuspended();
        asynccallbackonthread.onCancelled();
        return;
_L3:
        handleServiceSessionTimeout();
        asynccallbackonthread.onCancelled();
        return;
    }

    private void init()
    {
        MessageBus.getBus().register(this);
        mSession = new PharmacySession();
    }

    private void revalidateServiceSession(Activity activity, OnFlowCompleted onflowcompleted)
    {
        Dialog dialog = DialogFactory.onCreateDialog(0x10002, activity);
        activity = new AsyncCallbackOnThread(onflowcompleted) {

            final PharmacyManager this$0;
            final Activity val$activity;
            final OnFlowCompleted val$listener;
            final Dialog val$progressDialog;

            public void handleServiceResponse(PharmacyResponse pharmacyresponse)
            {
                progressDialog.dismiss();
                if (pharmacyresponse == null)
                {
                    WLog.w(PharmacyManager.TAG, "could not revalidate session with services, empty response");
                    DialogFactory.showDialog(0x10004, activity);
                    return;
                }
                if (pharmacyresponse.status != 1)
                {
                    WLog.w(PharmacyManager.TAG, (new StringBuilder()).append("could not revalidate session with services, unexpected error: ").append(pharmacyresponse.status).toString());
                    DialogFactory.showDialog(0x10004, activity);
                    return;
                } else
                {
                    WLog.i(PharmacyManager.TAG, "costumer session revalidated with services");
                    listener.onFlowCompleted();
                    return;
                }
            }

            public void onCancelledSameThread()
            {
                handleServiceResponse(null);
            }

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleServiceResponse(pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                handleServiceResponse(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = PharmacyManager.this;
                progressDialog = dialog;
                activity = activity1;
                listener = onflowcompleted;
                super(final_handler);
            }
        };
        validateAccount(new ValidateAccountData(get().getSession().getCustomerDOB()), activity);
        dialog.show();
    }

    private void validateAccount(final Activity startActivity, final PresenterStack presenterStack, final OnFlowCompleted listener)
    {
        DialogFactory.showDobDialog(startActivity, new com.walmartlabs.android.pharmacy.ui.dob.DateInputDialogBuilder.OnDateSetListener() {

            final PharmacyManager this$0;
            final OnFlowCompleted val$listener;
            final PresenterStack val$presenterStack;
            final Activity val$startActivity;

            public void onCancel()
            {
            }

            public void onDateSet(int i, int j, int k)
            {
                Object obj = DialogFactory.onCreateDialog(0x10004, startActivity);
                Dialog dialog = DialogFactory.onCreateDialog(0x10002, startActivity);
                String s = String.format(Locale.US, "%02d%02d%04d", new Object[] {
                    Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i)
                });
                ValidateAccountData validateaccountdata = new ValidateAccountData(s);
                obj = s. new AsyncCallbackOnThread(((Dialog) (obj))) {

                    final _cls6 this$1;
                    final String val$dob;
                    final Dialog val$errorDialog;
                    final Dialog val$validateProgress;

                    private void handleServerResponse(PharmacyResponse pharmacyresponse)
                    {
                        validateProgress.dismiss();
                        if (pharmacyresponse != null)
                        {
                            switch (pharmacyresponse.status)
                            {
                            default:
                                errorDialog.show();
                                return;

                            case 1: // '\001'
                                mSession.startCustomerSession(dob);
                                listener.onFlowCompleted();
                                return;

                            case 50: // '2'
                                errorDialog.show();
                                return;

                            case 1001: 
                                DialogFactory.showInvalidDobDialog(startActivity, new android.content.DialogInterface.OnClickListener() {

                                    final _cls1 this$2;

                                    public void onClick(DialogInterface dialoginterface, int i)
                                    {
                                        validateAccount(startActivity, presenterStack, listener);
                                    }

            
            {
                this$2 = _cls1.this;
                super();
            }
                                }, new android.content.DialogInterface.OnCancelListener() {

                                    final _cls1 this$2;

                                    public void onCancel(DialogInterface dialoginterface)
                                    {
                                        presenterStack.popToRoot();
                                    }

            
            {
                this$2 = _cls1.this;
                super();
            }
                                });
                                return;

                            case 1002: 
                                DialogFactory.showCoolDownDialog(startActivity, ((CoolDownData)pharmacyresponse.data).dobVerificationAttempted, ((CoolDownData)pharmacyresponse.data).coolDownTimeInSeconds, new android.content.DialogInterface.OnClickListener() {

                                    final _cls1 this$2;

                                    public void onClick(DialogInterface dialoginterface, int i)
                                    {
                                        presenterStack.popToRoot();
                                    }

            
            {
                this$2 = _cls1.this;
                super();
            }
                                });
                                return;

                            case 1003: 
                                errorDialog.show();
                                return;

                            case 1000: 
                            case 1007: 
                                WLog.w(PharmacyManager.TAG, (new StringBuilder()).append("Unexpected State: ").append(pharmacyresponse.status).toString());
                                errorDialog.show();
                                return;
                            }
                        } else
                        {
                            errorDialog.show();
                            return;
                        }
                    }

                    public void onCancelledSameThread()
                    {
                        handleServerResponse(null);
                    }

                    public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
                    {
                        handleServerResponse(pharmacyresponse);
                    }

                    public volatile void onFailureSameThread(Object obj, Object obj1)
                    {
                        onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
                    }

                    public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
                    {
                        handleServerResponse(pharmacyresponse);
                    }

                    public volatile void onSuccessSameThread(Object obj)
                    {
                        onSuccessSameThread((PharmacyResponse)obj);
                    }

            
            {
                this$1 = final__pcls6;
                validateProgress = dialog;
                dob = String.this;
                errorDialog = dialog1;
                super(final_handler);
            }
                };
                validateAccount(validateaccountdata, ((AsyncCallbackOnThread) (obj)));
                dialog.show();
            }

            
            {
                this$0 = PharmacyManager.this;
                startActivity = activity;
                listener = onflowcompleted;
                presenterStack = presenterstack;
                super();
            }
        });
    }

    private AsyncCallbackOnThread wrappedCallback(AsyncCallbackOnThread asynccallbackonthread)
    {
        return new AsyncCallbackOnThread(asynccallbackonthread) {

            final PharmacyManager this$0;
            final AsyncCallbackOnThread val$callback;

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleWrappedFailure(callback, integer, pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                callback.onSuccess(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = PharmacyManager.this;
                callback = asynccallbackonthread;
                super(final_handler);
            }
        };
    }

    public void accessPharmacyAuthRequiredFlow(Activity activity, PresenterStack presenterstack, OnFlowCompleted onflowcompleted)
    {
        if (get().getSession().hasActiveCustomerSession())
        {
            revalidateServiceSession(activity, onflowcompleted);
            return;
        } else
        {
            verifySignIn(activity, presenterstack, onflowcompleted);
            return;
        }
    }

    public void addRefillToCart(int i, int j, AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.addRefillToCart(i, j, wrappedCallback(asynccallbackonthread));
    }

    public void cleanDanglingServiceSession()
    {
        if (!mHasCleanedDanglingServiceSession)
        {
            mHasCleanedDanglingServiceSession = true;
            logout();
        }
    }

    public Presenter createAppAccount(Activity activity, OnFlowCompleted onflowcompleted)
    {
        return createAppAccount(activity, null, null, null, onflowcompleted);
    }

    public Presenter createAppAccount(Activity activity, String s, String s1, String s2, OnFlowCompleted onflowcompleted)
    {
        if (mAuthenticator != null)
        {
            return mAuthenticator.createAppAccount(activity, s, s1, s2, onflowcompleted);
        } else
        {
            return null;
        }
    }

    public void deleteCart(AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.deleteCart(wrappedCallback(asynccallbackonthread));
    }

    public void deleteRefillFromCart(int i, int j, AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.deleteRefillFromCart(i, j, wrappedCallback(asynccallbackonthread));
    }

    public void deleteRefillFromCartSilent(int i, int j)
    {
        deleteRefillFromCart(i, j, new AsyncCallbackOnThread(new Handler()) {

            final PharmacyManager this$0;

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                WLog.w(PharmacyManager.TAG, "Failed to remove prescription from cart");
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = PharmacyManager.this;
                super(handler);
            }
        });
    }

    public void endSession()
    {
        if (mSession != null)
        {
            mSession.endSession();
        }
    }

    public void getAccountProfile(AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.getAccountProfile(wrappedCallback(asynccallbackonthread));
    }

    public void getCart(AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.getCart(wrappedCallback(asynccallbackonthread));
    }

    public String getHomeDeliveryPhoneNumber()
    {
        if (mStoreHelper != null)
        {
            return mStoreHelper.getHomeDeliveryPhoneNumber();
        } else
        {
            return null;
        }
    }

    public void getKillSwitchStatus(AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.getKillSwitchStatus(asynccallbackonthread);
    }

    public String getPharmacyPhoneNumber(StoreData storedata)
    {
        if (mStoreHelper != null)
        {
            return mStoreHelper.getPharmacyPhoneNumber(storedata);
        } else
        {
            return null;
        }
    }

    public void getPickupTimes(int i, AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.getPickupTimes(i, wrappedCallback(asynccallbackonthread));
    }

    public PharmacySession getSession()
    {
        return mSession;
    }

    public Presenter getStoreDetailPresenter(Activity activity, StoreData storedata)
    {
        if (mStoreHelper != null)
        {
            return mStoreHelper.getStoreDetailPresenter(activity, storedata);
        } else
        {
            return null;
        }
    }

    public StoreFinderConfigurator getStoreFinderConfigurator()
    {
        if (mStoreHelper != null)
        {
            return mStoreHelper.getStoreFinderConfigurator(mContext);
        } else
        {
            return null;
        }
    }

    public void hasRxEnabledAccount(AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.hasRxEnabledAccount(wrappedCallback(asynccallbackonthread));
    }

    public void hasRxEnabledAccount(HasRxEnabledAccountCallback hasrxenabledaccountcallback)
    {
        hasRxEnabledAccount(((AsyncCallbackOnThread) (new AsyncCallbackOnThread(hasrxenabledaccountcallback) {

            final PharmacyManager this$0;
            final HasRxEnabledAccountCallback val$callback;

            private void handleServerResponse(PharmacyResponse pharmacyresponse)
            {
                if (pharmacyresponse != null)
                {
                    switch (pharmacyresponse.status)
                    {
                    default:
                        callback.onResult(HasRxEnabledAccountResult.UNKNOWN);
                        return;

                    case 1: // '\001'
                        callback.onResult(HasRxEnabledAccountResult.YES);
                        return;

                    case 1007: 
                        callback.onResult(HasRxEnabledAccountResult.NO);
                        break;
                    }
                    return;
                } else
                {
                    callback.onResult(HasRxEnabledAccountResult.UNKNOWN);
                    return;
                }
            }

            public void onCancelledSameThread()
            {
                handleServerResponse(null);
            }

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = PharmacyManager.this;
                callback = hasrxenabledaccountcallback;
                super(final_handler);
            }
        })));
    }

    public Presenter linkAccount(Activity activity, int i, int j, OnFlowCompleted onflowcompleted)
    {
        if (mAuthenticator != null)
        {
            return mAuthenticator.linkAccount(activity, i, j, onflowcompleted);
        } else
        {
            return null;
        }
    }

    public Presenter linkAccount(Activity activity, OnFlowCompleted onflowcompleted)
    {
        return linkAccount(activity, -1, -1, onflowcompleted);
    }

    public void linkAccount(LinkAccountData linkaccountdata, AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.linkAccount(linkaccountdata, new AsyncCallbackOnThread(linkaccountdata) {

            final PharmacyManager this$0;
            final AsyncCallbackOnThread val$callback;
            final LinkAccountData val$data;

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleWrappedFailure(callback, integer, pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                if (pharmacyresponse.status == 1)
                {
                    mSession.startCustomerSession(data.dob);
                    MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("successPharmacyAcctCreate"));
                }
                callback.onSuccess(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = PharmacyManager.this;
                callback = asynccallbackonthread;
                data = linkaccountdata;
                super(final_handler);
            }
        });
    }

    public void loadOrderDetails(int i, int j, AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.getRefillDetails(i, j, wrappedCallback(asynccallbackonthread));
    }

    public void loadOrderHistory(AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.getRefillHistory("fillDate", "last24Months", wrappedCallback(asynccallbackonthread));
    }

    public void loadPrescriptions(AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.getPrescriptions("lastRefillDate", "all", wrappedCallback(asynccallbackonthread));
    }

    public void logout()
    {
        logout(((AsyncCallbackOnThread) (new AsyncCallbackOnThread(new Handler()) {

            final PharmacyManager this$0;

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                WLog.d(PharmacyManager.TAG, (new StringBuilder()).append("failed to log out: ").append(integer).toString());
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                WLog.d(PharmacyManager.TAG, "successfully logged out");
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = PharmacyManager.this;
                super(handler);
            }
        })));
    }

    public void logout(AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.logout(asynccallbackonthread);
    }

    public void onAuthStatusChanged(AuthenticationStatusEvent authenticationstatusevent)
    {
        if (!authenticationstatusevent.loggedIn && !authenticationstatusevent.accountCreated)
        {
            endSession();
        }
    }

    public void onClientSessionEnded(SessionEndedEvent sessionendedevent)
    {
        logout();
    }

    public void setAuthenticator(PharmacyAuthenticator pharmacyauthenticator)
    {
        mAuthenticator = pharmacyauthenticator;
    }

    public void setPharmacyService(PharmacyService pharmacyservice)
    {
        mService = pharmacyservice;
    }

    public void setPickupDetails(int i, String s, String s1, AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.setPickupDetails(i, s, s1, wrappedCallback(asynccallbackonthread));
    }

    public void setStoreHelper(PharmacyStoreHelper pharmacystorehelper)
    {
        mStoreHelper = pharmacystorehelper;
    }

    public void submitCart(CartCheckoutData cartcheckoutdata, AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.submitCart(cartcheckoutdata, wrappedCallback(asynccallbackonthread));
    }

    public void transferRxExternal(TransferRxData transferrxdata, AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.transferRxExternal(transferrxdata, wrappedCallback(asynccallbackonthread));
    }

    public void updateAccountProfile(com.walmartlabs.android.pharmacy.data.ProfileData.Communication communication, AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.updateAccountProfile(communication, wrappedCallback(asynccallbackonthread));
    }

    public void validateAccount(ValidateAccountData validateaccountdata, AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.validateAccount(validateaccountdata, new AsyncCallbackOnThread(asynccallbackonthread) {

            final PharmacyManager this$0;
            final AsyncCallbackOnThread val$callback;

            private void handleServiceResponse(PharmacyResponse pharmacyresponse)
            {
                if (pharmacyresponse == null || pharmacyresponse.status != 1)
                {
                    endSession();
                    MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("wrongDob"));
                } else
                if (!getSession().hasActiveCustomerSession())
                {
                    MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("successDob"));
                    return;
                }
            }

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleServiceResponse(pharmacyresponse);
                handleWrappedFailure(callback, integer, pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                handleServiceResponse(pharmacyresponse);
                callback.onSuccess(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = PharmacyManager.this;
                callback = asynccallbackonthread;
                super(final_handler);
            }
        });
    }

    public void validateRefillInCart(int i, int j, String s, AsyncCallbackOnThread asynccallbackonthread)
    {
        mService.validateRefillInCart(i, j, s, new AsyncCallbackOnThread(asynccallbackonthread) {

            final PharmacyManager this$0;
            final AsyncCallbackOnThread val$callback;

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleWrappedFailure(callback, integer, pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                if (pharmacyresponse.status == 1)
                {
                    mSession.startSession();
                }
                callback.onSuccess(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = PharmacyManager.this;
                callback = asynccallbackonthread;
                super(final_handler);
            }
        });
    }

    public void verifyLinkedAccount(final Activity startActivity, final PresenterStack presenterStack, final OnFlowCompleted listener)
    {
        final Dialog errorDialog = DialogFactory.onCreateDialog(0x10004, startActivity);
        final Dialog checkProgress = DialogFactory.onCreateDialog(0x10002, startActivity);
        hasRxEnabledAccount(new HasRxEnabledAccountCallback() {

            final PharmacyManager this$0;
            final Dialog val$checkProgress;
            final Dialog val$errorDialog;
            final OnFlowCompleted val$listener;
            final PresenterStack val$presenterStack;
            final Activity val$startActivity;

            public void onResult(HasRxEnabledAccountResult hasrxenabledaccountresult)
            {
                checkProgress.dismiss();
                static class _cls12
                {

                    static final int $SwitchMap$com$walmartlabs$android$pharmacy$PharmacyManager$HasRxEnabledAccountResult[];

                    static 
                    {
                        $SwitchMap$com$walmartlabs$android$pharmacy$PharmacyManager$HasRxEnabledAccountResult = new int[HasRxEnabledAccountResult.values().length];
                        try
                        {
                            $SwitchMap$com$walmartlabs$android$pharmacy$PharmacyManager$HasRxEnabledAccountResult[HasRxEnabledAccountResult.YES.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$walmartlabs$android$pharmacy$PharmacyManager$HasRxEnabledAccountResult[HasRxEnabledAccountResult.NO.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$walmartlabs$android$pharmacy$PharmacyManager$HasRxEnabledAccountResult[HasRxEnabledAccountResult.UNKNOWN.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls12..SwitchMap.com.walmartlabs.android.pharmacy.PharmacyManager.HasRxEnabledAccountResult[hasrxenabledaccountresult.ordinal()];
                JVM INSTR tableswitch 1 2: default 36
            //                           1 44
            //                           2 64;
                   goto _L1 _L2 _L3
_L1:
                errorDialog.show();
_L5:
                return;
_L2:
                validateAccount(startActivity, presenterStack, listener);
                return;
_L3:
                hasrxenabledaccountresult = linkAccount(startActivity, listener);
                if (hasrxenabledaccountresult != null)
                {
                    presenterStack.popToRoot();
                    presenterStack.pushPresenter(hasrxenabledaccountresult, true);
                    return;
                }
                if (true) goto _L5; else goto _L4
_L4:
            }

            
            {
                this$0 = PharmacyManager.this;
                checkProgress = dialog;
                startActivity = activity;
                presenterStack = presenterstack;
                listener = onflowcompleted;
                errorDialog = dialog1;
                super();
            }
        });
        checkProgress.show();
    }

    public void verifySession(VerifySessionCallback verifysessioncallback)
    {
        if (mAuthenticator != null)
        {
            mAuthenticator.verifySession(verifysessioncallback);
        }
    }

    public void verifySignIn(final Activity startActivity, final PresenterStack presenterStack, final OnFlowCompleted listener)
    {
        if (mAuthenticator != null)
        {
            final Dialog checkProgress = DialogFactory.onCreateDialog(0x10002, startActivity);
            startActivity = new VerifySessionCallback() {

                final PharmacyManager this$0;
                final Dialog val$checkProgress;
                final OnFlowCompleted val$listener;
                final PresenterStack val$presenterStack;
                final Activity val$startActivity;

                public void onSessionAvailable()
                {
                    checkProgress.dismiss();
                    verifyLinkedAccount(startActivity, presenterStack, listener);
                }

                public void onSessionUnavailable()
                {
                    checkProgress.dismiss();
                    Presenter presenter = mAuthenticator.signIn(startActivity, listener);
                    presenterStack.pushPresenter(presenter, true);
                }

            
            {
                this$0 = PharmacyManager.this;
                checkProgress = dialog;
                startActivity = activity;
                presenterStack = presenterstack;
                listener = onflowcompleted;
                super();
            }
            };
            checkProgress.show();
            mAuthenticator.verifySession(startActivity);
        }
    }






}
