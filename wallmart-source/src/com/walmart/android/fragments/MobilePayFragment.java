// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.app.account.AccountActivity;
import com.walmart.android.app.payment.MobilePayScannerActivity;
import com.walmart.android.events.CloseFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.ui.ViewStackLayout;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.payment.controller.mpay.MobilePayController;
import com.walmartlabs.payment.controller.pin.MobilePayPinController;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.payment.service.mpay.MobilePayPreferences;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.fragments:
//            WalmartPresenterFragment

public class MobilePayFragment extends WalmartPresenterFragment
{

    private static final int REQUEST_CONFIRMATION = 7;
    private static final int REQUEST_MPAY_SCANNER = 1;
    private static final int REQUEST_PAIR = 5;
    private static final int REQUEST_PASSCODE = 2;
    private static final int REQUEST_SETUP = 3;
    private static final int REQUEST_VALUE_PROP = 4;
    private static final int REQUEST_VERIFY = 6;
    private static final String TAG = com/walmart/android/fragments/MobilePayFragment.getSimpleName();
    private boolean mSuppressPage;

    public MobilePayFragment()
    {
    }

    private void setupPage()
    {
        if (!mSuppressPage)
        {
            Services.get().getAuthentication().renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                final MobilePayFragment this$0;

                public void onFailure(int i)
                {
                    MobilePayController.startValueProposition(MobilePayFragment.this, 4);
                }

                public void onSuccess()
                {
                    MobilePayManager.get().getUserInfo(new com.walmartlabs.payment.service.mpay.MobilePayManager.UserInfoInterface() {

                        final _cls1 this$1;

                        public void onGetUserInfo(boolean flag)
                        {
                            WLog.d(MobilePayFragment.TAG, (new StringBuilder()).append("User isSetup = ").append(flag).toString());
                            if (flag)
                            {
                                Bundle bundle = getDynamicArguments();
                                if (bundle != null && bundle.getString("transaction_id") != null)
                                {
                                    WLog.d(MobilePayFragment.TAG, "Transaction id is non-null");
                                    com.walmartlabs.payment.service.payment.Transaction transaction = MobilePayPreferences.getSavedTransaction(getActivity());
                                    if (transaction != null)
                                    {
                                        WLog.d(MobilePayFragment.TAG, "Saved transaction found");
                                        MobilePayController.startTransactionConfirmation(_fld0, 7, transaction, bundle.getString("transaction_id"));
                                        MobilePayPreferences.clearSavedTransaction(getActivity());
                                        return;
                                    } else
                                    {
                                        WLog.d(MobilePayFragment.TAG, "Saved transaction not found");
                                        MessageBus.getBus().post(new CloseFragmentEvent());
                                        return;
                                    }
                                } else
                                {
                                    MobilePayPinController.launchPin(_fld0, 2);
                                    return;
                                }
                            } else
                            {
                                MobilePayController.startValueProposition(_fld0, 4);
                                return;
                            }
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                }

            
            {
                this$0 = MobilePayFragment.this;
                super();
            }
            });
        }
        mSuppressPage = false;
    }

    private void startScanner()
    {
        Intent intent = new Intent(getActivity(), com/walmart/android/app/payment/MobilePayScannerActivity);
        intent.putExtra("mode", 4);
        startActivityForResult(intent, 1);
    }

    private void verifyAccount()
    {
        Intent intent = new Intent(getActivity(), com/walmart/android/app/account/AccountActivity);
        intent.putExtra("from", "Other");
        if (Services.get().getAuthentication().hasCredentials())
        {
            intent.putExtra("mode", 2);
        }
        startActivityForResult(intent, 6);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 2) goto _L2; else goto _L1
_L1:
        mSuppressPage = true;
        popToRoot();
        if (j == -1) goto _L4; else goto _L3
_L3:
        MessageBus.getBus().post(new CloseFragmentEvent());
_L6:
        return;
_L4:
        startScanner();
        return;
_L2:
        if (i == 1)
        {
            mSuppressPage = true;
            if (j != -1)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (intent != null)
            {
                String s = intent.getStringExtra("qrcode");
                String s1 = intent.getStringExtra("credit_card_id");
                boolean flag = intent.getBooleanExtra("use_assoc_discount", false);
                boolean flag1 = intent.getBooleanExtra("use_gift_cards", true);
                MobilePayController.startPairDevice(this, 5, s, Services.get().getAuthentication().getFirstName(), s1, flag, flag1);
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_132;
        if (j != 0) goto _L6; else goto _L5
_L5:
        MessageBus.getBus().post(new CloseFragmentEvent());
        return;
        if (i != 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j != 10)
        {
            mSuppressPage = true;
            MessageBus.getBus().post(new CloseFragmentEvent());
            return;
        }
        if (true) goto _L6; else goto _L7
_L7:
        if (i == 4)
        {
            mSuppressPage = true;
            if (j == 10)
            {
                verifyAccount();
                return;
            } else
            {
                MessageBus.getBus().post(new CloseFragmentEvent());
                return;
            }
        }
        if (i == 5)
        {
            mSuppressPage = true;
            if (j == 11)
            {
                startScanner();
                return;
            } else
            {
                MessageBus.getBus().post(new CloseFragmentEvent());
                return;
            }
        }
        if (i == 6)
        {
            mSuppressPage = true;
            if (j == 1)
            {
                MobilePayManager.get().getUserInfo(new com.walmartlabs.payment.service.mpay.MobilePayManager.UserInfoInterface() {

                    final MobilePayFragment this$0;

                    public void onGetUserInfo(boolean flag2)
                    {
                        if (flag2)
                        {
                            MobilePayPinController.launchPin(MobilePayFragment.this, 2);
                            return;
                        } else
                        {
                            MobilePayController.startSetup(MobilePayFragment.this, 3);
                            return;
                        }
                    }

            
            {
                this$0 = MobilePayFragment.this;
                super();
            }
                });
                return;
            } else
            {
                MessageBus.getBus().post(new CloseFragmentEvent());
                return;
            }
        }
        if (true) goto _L6; else goto _L8
_L8:
    }

    public Presenter onCreatePresenter()
    {
        return null;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (mFragmentRootView == null)
        {
            mFragmentRootView = layoutinflater.inflate(0x7f04009e, viewgroup, false);
            mFragmentRootView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            mViewStackContainer = (ViewStackLayout)mFragmentRootView.findViewById(0x7f100212);
            mPresenterStack = new PresenterStack(mViewStackContainer);
        }
        return mFragmentRootView;
    }

    public void onResume()
    {
        super.onResume();
        setupPage();
    }


}
