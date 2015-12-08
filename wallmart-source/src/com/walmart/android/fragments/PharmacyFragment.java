// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.app.pharmacy.WalmartPharmacyHomePresenter;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.utils.Criteria;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.android.pharmacy.PharmacyManager;
import com.walmartlabs.android.pharmacy.PharmacySession;
import com.walmartlabs.android.pharmacy.PrescriptionPresenter;
import com.walmartlabs.android.pharmacy.ReviewOrderPresenter;
import com.walmartlabs.android.pharmacy.UserInteractionObservable;
import com.walmartlabs.android.pharmacy.events.ServiceSuspendedEvent;
import com.walmartlabs.android.pharmacy.events.SessionEndedEvent;
import com.walmartlabs.android.pharmacy.ui.DialogFactory;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.fragments:
//            WalmartPresenterFragment

public class PharmacyFragment extends WalmartPresenterFragment
{

    private static final String TAG = com/walmart/android/fragments/PharmacyFragment.getSimpleName();
    static final Criteria sSecuredPresenterCriteria = new Criteria() {

        public boolean fullfilled(Presenter presenter)
        {
            return PharmacyFragment.sSecuredPresenters.contains(presenter.getClass());
        }

        public volatile boolean fullfilled(Object obj)
        {
            return fullfilled((Presenter)obj);
        }

    };
    static final ArrayList sSecuredPresenters;
    private boolean mIsVisible;
    private final com.walmartlabs.android.pharmacy.UserInteractionObservable.OnUserInteractionObserver mOnUserInteractionCallback = new com.walmartlabs.android.pharmacy.UserInteractionObservable.OnUserInteractionObserver() {

        final PharmacyFragment this$0;

        public void onUserInteraction()
        {
            PharmacyManager.get().getSession().reportUserInteraction();
        }

            
            {
                this$0 = PharmacyFragment.this;
                super();
            }
    };
    private ResetPresenterStackOnSignout mResetPresenterStackOnSignout;
    private boolean mShowTimeoutDialog;

    public PharmacyFragment()
    {
    }

    private void showTimedOutDialog()
    {
        PharmacyManager.get().getSession().clearTimeout();
        DialogFactory.showDialog(0x10000, getActivity());
    }

    public View getView()
    {
        return getView();
    }

    public void onAttach(Activity activity)
    {
        onAttach(activity);
    }

    public void onClientSessionEnded(SessionEndedEvent sessionendedevent)
    {
label0:
        {
            if (mPresenterStack.isInStack(sSecuredPresenterCriteria))
            {
                mPresenterStack.popToRoot();
                if (sessionendedevent.timeOut)
                {
                    if (!mIsVisible)
                    {
                        break label0;
                    }
                    showTimedOutDialog();
                }
            }
            return;
        }
        mShowTimeoutDialog = true;
    }

    public void onCreate(Bundle bundle)
    {
        onCreate(bundle);
        MessageBus.getBus().register(this);
        mShowTimeoutDialog = PharmacyManager.get().getSession().hasTimedOut();
        setDisplayEventsEnabled(true);
    }

    public Presenter onCreatePresenter()
    {
        return null;
    }

    public void onDestroy()
    {
        onDestroy();
        MessageBus.getBus().unregister(this);
        if (mResetPresenterStackOnSignout != null)
        {
            MessageBus.getBus().unregister(mResetPresenterStackOnSignout);
            mResetPresenterStackOnSignout = null;
        }
    }

    public void onDestroyView()
    {
        onDestroyView();
    }

    public void onDetach()
    {
        onDetach();
    }

    public void onHiddenChanged(boolean flag)
    {
        onHiddenChanged(flag);
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        onPause();
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity instanceof UserInteractionObservable)
        {
            ((UserInteractionObservable)fragmentactivity).setOnUserInteractionObserver(null);
        }
    }

    public void onResume()
    {
        onResume();
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity instanceof UserInteractionObservable)
        {
            ((UserInteractionObservable)fragmentactivity).setOnUserInteractionObserver(mOnUserInteractionCallback);
        }
    }

    public void onServiceSuspended(ServiceSuspendedEvent servicesuspendedevent)
    {
        if (mIsVisible)
        {
            DialogFactory.showDialog(65535, getActivity(), new com.walmartlabs.android.pharmacy.ui.DialogFactory.DialogListener() {

                final PharmacyFragment this$0;

                public void onClicked(int i, int j, Object aobj[])
                {
                    popToRoot();
                }

            
            {
                this$0 = PharmacyFragment.this;
                super();
            }
            });
        }
    }

    public void onStart()
    {
        onStart();
        mIsVisible = true;
        if (mResetPresenterStackOnSignout != null)
        {
            MessageBus.getBus().unregister(mResetPresenterStackOnSignout);
            mResetPresenterStackOnSignout = null;
        }
        if (mShowTimeoutDialog)
        {
            showTimedOutDialog();
            mShowTimeoutDialog = false;
        }
        PharmacyManager.get().getSession().reportUserInteraction();
    }

    public void onStop()
    {
        onStop();
        mIsVisible = false;
        if (mResetPresenterStackOnSignout == null && Services.get().getAuthentication().hasCredentials())
        {
            mResetPresenterStackOnSignout = new ResetPresenterStackOnSignout();
            MessageBus.getBus().register(mResetPresenterStackOnSignout);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        onViewCreated(view, bundle);
        view = mPresenterStack.peek();
        if (view != null)
        {
            view.onRestartAsTop();
            return;
        } else
        {
            view = new WalmartPharmacyHomePresenter(getActivity());
            mPresenterStack.pushPresenter(view, false);
            return;
        }
    }

    static 
    {
        sSecuredPresenters = new ArrayList();
        sSecuredPresenters.add(com/walmartlabs/android/pharmacy/PrescriptionPresenter);
        sSecuredPresenters.add(com/walmartlabs/android/pharmacy/ReviewOrderPresenter);
    }

}
