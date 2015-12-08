// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.config.FragmentConfig;
import com.walmart.android.events.PresenterStackUpdatedEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.ui.PresenterFragment;

public class WalmartPresenterFragment extends PresenterFragment
    implements com.walmart.android.ui.PresenterStack.Listener
{

    private int mOrientation;
    private boolean mStarted;

    public WalmartPresenterFragment()
    {
        mOrientation = 0;
    }

    protected void createPresenterStack()
    {
        mPresenterStack = new PresenterStack(mViewStackContainer);
        mPresenterStack.setListener(this);
    }

    protected com.walmart.android.config.FragmentConfig.FragmentName getFragmentName()
    {
        return FragmentConfig.getFragmentName(getClass().getName());
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        mOrientation = configuration.orientation;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (mOrientation != 0)
        {
            viewgroup = getResources().getConfiguration();
            if (mOrientation != ((Configuration) (viewgroup)).orientation)
            {
                onConfigurationChanged(viewgroup);
            }
        }
        return layoutinflater;
    }

    public boolean onInterceptPresenterPush(Presenter presenter, boolean flag, boolean flag1)
    {
        return false;
    }

    public void onPresenterPopped(Presenter presenter)
    {
        MessageBus.getBus().post(new PresenterStackUpdatedEvent(presenter, getFragmentName()));
    }

    public void onPresenterPushed(Presenter presenter)
    {
        MessageBus.getBus().post(new PresenterStackUpdatedEvent(presenter, getFragmentName()));
    }

    public void onPresenterRestartAsTop(Presenter presenter)
    {
    }

    public void onPresenterTitleUpdated(Presenter presenter)
    {
        MessageBus.getBus().post(new PresenterStackUpdatedEvent(presenter, getFragmentName()));
    }

    public void onStart()
    {
        Presenter presenter = null;
        if (mPresenterStack != null)
        {
            presenter = mPresenterStack.peek();
        }
        if (mStarted && presenter != null)
        {
            presenter.onRestartAsTop();
            onPresenterRestartAsTop(presenter);
        }
        super.onStart();
        if (presenter != null)
        {
            MessageBus.getBus().post(new PresenterStackUpdatedEvent(presenter, getFragmentName()));
        }
        mStarted = true;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (mViewStackContainer != null && mPresenterStack == null)
        {
            mPresenterStack = new PresenterStack(mViewStackContainer);
        }
        if (mPresenterStack != null)
        {
            mPresenterStack.setListener(this);
        }
    }
}
