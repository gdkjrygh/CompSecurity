// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.app.account.AccountActivity;
import com.walmart.android.app.order.OrderListPresenter;
import com.walmart.android.events.CloseFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.auth.AuthenticationStatusEvent;

// Referenced classes of package com.walmart.android.fragments:
//            WalmartPresenterFragment

public class OrderFragment extends WalmartPresenterFragment
{

    private static final int REQUEST_LOGIN = 1;
    private static final String TAG = com/walmart/android/fragments/OrderFragment.getSimpleName();
    private boolean mStartedAccountActivity;

    public OrderFragment()
    {
    }

    private void launchAccountActivity()
    {
        Intent intent = new Intent(getActivity(), com/walmart/android/app/account/AccountActivity);
        getActivity().startActivityForResult(intent, 1);
        getActivity().overridePendingTransition(0x7f05002c, 0x7f050033);
        mStartedAccountActivity = true;
    }

    public View getView()
    {
        return super.getView();
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

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    public void onAuthenticationStatusEvent(AuthenticationStatusEvent authenticationstatusevent)
    {
        if (!authenticationstatusevent.hasCredentials && !mStartedAccountActivity)
        {
            mPresenterStack.popToRoot();
            MessageBus.getBus().post(new CloseFragmentEvent());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public Presenter onCreatePresenter()
    {
        return null;
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
    }

    public void onDetach()
    {
        super.onDetach();
    }

    public void onHiddenChanged(boolean flag)
    {
        super.onHiddenChanged(flag);
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }

    public void onStart()
    {
        super.onStart();
        if (!mStartedAccountActivity && !Services.get().getAuthentication().hasCredentials())
        {
            launchAccountActivity();
        }
        MessageBus.getBus().register(this);
    }

    public void onStop()
    {
        super.onStop();
        MessageBus.getBus().unregister(this);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = mPresenterStack.peek();
        if (view == null)
        {
            view = new OrderListPresenter(getActivity());
            mPresenterStack.pushPresenter(view, false);
            return;
        } else
        {
            view.reloadData();
            return;
        }
    }

}
