// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.squareup.otto.Bus;
import com.walmart.android.app.account.AccountActivity;
import com.walmart.android.app.payment.PaymentMethodsPresenter;
import com.walmart.android.events.CloseFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.fragments:
//            WalmartPresenterFragment

public class PaymentFragment extends WalmartPresenterFragment
{

    private static final int REQUEST_LOGIN = 1;
    private static final String TAG = com/walmart/android/fragments/PaymentFragment.getSimpleName();
    private boolean mStartedAccountActivity;

    public PaymentFragment()
    {
        mStartedAccountActivity = false;
    }

    private void launchAccountActivity()
    {
        Intent intent = new Intent(getActivity(), com/walmart/android/app/account/AccountActivity);
        getActivity().startActivityForResult(intent, 1);
        getActivity().overridePendingTransition(0x7f05002c, 0x7f050033);
        mStartedAccountActivity = true;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        popToRoot();
        mStartedAccountActivity = false;
        if (j != 0) goto _L2; else goto _L1
_L1:
        MessageBus.getBus().post(new CloseFragmentEvent());
_L4:
        return;
_L2:
        intent = mPresenterStack.peek();
        if (intent == null) goto _L4; else goto _L3
_L3:
        intent.reloadData();
        return;
        super.onActivityResult(i, j, intent);
        return;
    }

    public void onAuthenticationStatusEvent(AuthenticationStatusEvent authenticationstatusevent)
    {
        if (!authenticationstatusevent.hasCredentials && !mStartedAccountActivity)
        {
            mPresenterStack.popToRoot();
            MessageBus.getBus().post(new CloseFragmentEvent());
        }
    }

    public Presenter onCreatePresenter()
    {
        return new PaymentMethodsPresenter(getActivity());
    }

    public void onStart()
    {
        super.onStart();
        Authentication authentication = Services.get().getAuthentication();
        if (!mStartedAccountActivity)
        {
            authentication.renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                final PaymentFragment this$0;

                public void onFailure(int i)
                {
                    WLog.e(PaymentFragment.TAG, "Unable to renew session");
                    launchAccountActivity();
                }

                public void onSuccess()
                {
                    WLog.d(PaymentFragment.TAG, "Successfully renewed session");
                }

            
            {
                this$0 = PaymentFragment.this;
                super();
            }
            });
        }
        MessageBus.getBus().register(this);
    }

    public void onStop()
    {
        super.onStop();
        MessageBus.getBus().unregister(this);
    }



}
