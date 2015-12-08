// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.util.Log;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmartlabs.android.pharmacy.data.ValidatedCart;
import com.walmartlabs.android.pharmacy.service.Cart;
import com.walmartlabs.android.pharmacy.ui.DialogFactory;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyManager, PharmacyResponse

public class AddRefillToCartHelper
{
    public static interface AddRefillToCartCallback
    {

        public abstract void onCancel();

        public abstract void onCoolDown();

        public abstract void onRefillAdded(Cart cart);
    }


    private static final String TAG = com/walmartlabs/android/pharmacy/AddRefillToCartHelper.getSimpleName();
    private Activity mActivity;
    private AddRefillToCartCallback mCallback;
    private final Dialog mGeneralErrorDialog;
    private final Dialog mInvalidRxStoreDialog;
    private final Dialog mNotRefillableOnlineDialog;
    private final Dialog mProgressDialog;
    private int mRxNumber;
    private Presenter mStartPresenter;
    private int mStoreNumber;

    public AddRefillToCartHelper(Activity activity, Presenter presenter, int i, int j, AddRefillToCartCallback addrefilltocartcallback)
    {
        mActivity = activity;
        mStartPresenter = presenter;
        mRxNumber = i;
        mStoreNumber = j;
        mCallback = addrefilltocartcallback;
        mProgressDialog = DialogFactory.onCreateDialog(0x10002, mActivity);
        activity = new android.content.DialogInterface.OnDismissListener() {

            final AddRefillToCartHelper this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                mCallback.onCancel();
            }

            
            {
                this$0 = AddRefillToCartHelper.this;
                super();
            }
        };
        mGeneralErrorDialog = DialogFactory.onCreateDialog(0x10004, mActivity);
        mGeneralErrorDialog.setOnDismissListener(activity);
        mInvalidRxStoreDialog = DialogFactory.onCreateDialog(0x10003, mActivity);
        mInvalidRxStoreDialog.setOnDismissListener(activity);
        mNotRefillableOnlineDialog = DialogFactory.onCreateDialog(0x10001, mActivity);
        mNotRefillableOnlineDialog.setOnDismissListener(activity);
    }

    private void deleteRefillFromCartWithProgress()
    {
        mProgressDialog.show();
        PharmacyManager.get().deleteRefillFromCart(mRxNumber, mStoreNumber, new AsyncCallbackOnThread(new Handler()) {

            final AddRefillToCartHelper this$0;

            private void onDelete()
            {
                try
                {
                    mProgressDialog.dismiss();
                    return;
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    return;
                }
            }

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                onDelete();
                Log.w(AddRefillToCartHelper.TAG, "Failed to remove prescription from cart");
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                onDelete();
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = AddRefillToCartHelper.this;
                super(handler);
            }
        });
    }

    private boolean isPresenterPopped()
    {
        return mStartPresenter != null && mStartPresenter.isPopped();
    }

    private void retry()
    {
        mProgressDialog.show();
        PharmacyManager.get().deleteCart(new AsyncCallbackOnThread(new Handler()) {

            final AddRefillToCartHelper this$0;

            private void handleServerResponse(PharmacyResponse pharmacyresponse)
            {
                mProgressDialog.dismiss();
                if (pharmacyresponse != null && pharmacyresponse.status == 1)
                {
                    addRefillToCart();
                    return;
                } else
                {
                    mGeneralErrorDialog.show();
                    return;
                }
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
                this$0 = AddRefillToCartHelper.this;
                super(handler);
            }
        });
    }

    public void addRefillToCart()
    {
        mProgressDialog.show();
        PharmacyManager.get().addRefillToCart(mRxNumber, mStoreNumber, new AsyncCallbackOnThread(new Handler()) {

            final AddRefillToCartHelper this$0;

            public void handleServerResponse(PharmacyResponse pharmacyresponse)
            {
                mProgressDialog.dismiss();
                if (isPresenterPopped())
                {
                    return;
                }
                if (pharmacyresponse != null)
                {
                    Cart cart;
                    int i;
                    switch (pharmacyresponse.status)
                    {
                    default:
                        Log.w(AddRefillToCartHelper.TAG, (new StringBuilder()).append("Unknown error code received: ").append(pharmacyresponse.status).append(" with message: ").append(pharmacyresponse.message).toString());
                        mGeneralErrorDialog.show();
                        PharmacyManager.get().deleteRefillFromCartSilent(mRxNumber, mStoreNumber);
                        return;

                    case 1008: 
                        mInvalidRxStoreDialog.show();
                        return;

                    case 1071: 
                        retry();
                        return;

                    case 1073: 
                    case 1074: 
                        retry();
                        return;

                    case 1072: 
                        mNotRefillableOnlineDialog.show();
                        return;

                    case 1: // '\001'
                        cart = (Cart)pharmacyresponse.data;
                        i = cart.getStatus(mRxNumber, mStoreNumber);
                        break;
                    }
                    if (i == 0 || i == 1)
                    {
                        if (cart.canBeRefilled(mRxNumber, mStoreNumber))
                        {
                            mCallback.onRefillAdded((Cart)pharmacyresponse.data);
                            return;
                        } else
                        {
                            mNotRefillableOnlineDialog.show();
                            PharmacyManager.get().deleteRefillFromCartSilent(mRxNumber, mStoreNumber);
                            return;
                        }
                    }
                    if (i == 2)
                    {
                        DialogFactory.showDobDialog(mActivity, new com.walmartlabs.android.pharmacy.ui.DialogFactory.DobDialogListener() {

                            final _cls2 this$1;

                            public void onCancel()
                            {
                                deleteRefillFromCartWithProgress();
                                mCallback.onCancel();
                            }

                            public void onDateEntered(String s)
                            {
                                validateDob(s);
                            }

            
            {
                this$1 = _cls2.this;
                super();
            }
                        });
                        return;
                    } else
                    {
                        mInvalidRxStoreDialog.show();
                        PharmacyManager.get().deleteRefillFromCartSilent(mRxNumber, mStoreNumber);
                        return;
                    }
                } else
                {
                    mGeneralErrorDialog.show();
                    return;
                }
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
                this$0 = AddRefillToCartHelper.this;
                super(handler);
            }
        });
    }

    public void dimissAllNonTransientDialogs()
    {
        if (mGeneralErrorDialog.isShowing())
        {
            mGeneralErrorDialog.dismiss();
        }
        if (mInvalidRxStoreDialog.isShowing())
        {
            mInvalidRxStoreDialog.dismiss();
        }
        if (mNotRefillableOnlineDialog.isShowing())
        {
            mNotRefillableOnlineDialog.dismiss();
        }
    }

    protected void validateDob(String s)
    {
        mProgressDialog.show();
        PharmacyManager.get().validateRefillInCart(mRxNumber, mStoreNumber, s, new AsyncCallbackOnThread(new Handler()) {

            final AddRefillToCartHelper this$0;

            public void handleServerResponse(PharmacyResponse pharmacyresponse)
            {
                mProgressDialog.dismiss();
                if (!isPresenterPopped()) goto _L2; else goto _L1
_L1:
                return;
_L2:
                Object obj;
                if (pharmacyresponse == null)
                {
                    break MISSING_BLOCK_LABEL_433;
                }
                obj = null;
                pharmacyresponse.status;
                JVM INSTR lookupswitch 5: default 80
            //                           1: 340
            //                           1001: 260
            //                           1002: 294
            //                           1008: 184
            //                           1072: 222;
                   goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
                Log.w(AddRefillToCartHelper.TAG, (new StringBuilder()).append("Unknown error code received: ").append(pharmacyresponse.status).append(" with message: ").append(pharmacyresponse.message).toString());
                mGeneralErrorDialog.show();
                PharmacyManager.get().deleteRefillFromCartSilent(mRxNumber, mStoreNumber);
                pharmacyresponse = obj;
_L9:
                if (pharmacyresponse != null)
                {
                    Bus bus = MessageBus.getBus();
                    if (pharmacyresponse.booleanValue())
                    {
                        pharmacyresponse = "successDob";
                    } else
                    {
                        pharmacyresponse = "wrongDob";
                    }
                    bus.post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder(pharmacyresponse));
                    return;
                }
                if (true) goto _L1; else goto _L7
_L7:
                mInvalidRxStoreDialog.show();
                PharmacyManager.get().deleteRefillFromCartSilent(mRxNumber, mStoreNumber);
                pharmacyresponse = Boolean.valueOf(true);
                  goto _L9
_L8:
                mNotRefillableOnlineDialog.show();
                PharmacyManager.get().deleteRefillFromCartSilent(mRxNumber, mStoreNumber);
                pharmacyresponse = Boolean.valueOf(true);
                  goto _L9
_L5:
                DialogFactory.showInvalidDobDialog(mActivity, new android.content.DialogInterface.OnClickListener() {

                    final _cls3 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        DialogFactory.showDobDialog(mActivity, new com.walmartlabs.android.pharmacy.ui.DialogFactory.DobDialogListener() {

                            final _cls1 this$2;

                            public void onCancel()
                            {
                                deleteRefillFromCartWithProgress();
                                mCallback.onCancel();
                            }

                            public void onDateEntered(String s)
                            {
                                validateDob(s);
                            }

            
            {
                this$2 = _cls1.this;
                super();
            }
                        });
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                }, new android.content.DialogInterface.OnCancelListener() {

                    final _cls3 this$1;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        deleteRefillFromCartWithProgress();
                        mCallback.onCancel();
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                });
                pharmacyresponse = Boolean.valueOf(false);
                  goto _L9
_L6:
                DialogFactory.showCoolDownDialog(mActivity, ((ValidatedCart)pharmacyresponse.data).dobVerificationAttempted, ((ValidatedCart)pharmacyresponse.data).coolDownTimeInSeconds, new android.content.DialogInterface.OnClickListener() {

                    final _cls3 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        deleteRefillFromCartWithProgress();
                        mCallback.onCoolDown();
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                });
                pharmacyresponse = Boolean.valueOf(false);
                  goto _L9
_L4:
                if (((ValidatedCart)pharmacyresponse.data).canBeRefilled(mRxNumber, mStoreNumber))
                {
                    mCallback.onRefillAdded((Cart)pharmacyresponse.data);
                } else
                {
                    mNotRefillableOnlineDialog.show();
                    PharmacyManager.get().deleteRefillFromCartSilent(mRxNumber, mStoreNumber);
                }
                pharmacyresponse = Boolean.valueOf(true);
                  goto _L9
                mGeneralErrorDialog.show();
                PharmacyManager.get().deleteRefillFromCartSilent(mRxNumber, mStoreNumber);
                return;
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
                this$0 = AddRefillToCartHelper.this;
                super(handler);
            }
        });
    }













}
