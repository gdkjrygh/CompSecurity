// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterDisplayedEvent;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.ui.ViewStackLayout;
import java.util.HashMap;

public class PresenterFragment extends Fragment
{

    private Bundle mDynamicArguments;
    private boolean mEnableDisplayEvents;
    protected View mFragmentRootView;
    private HashMap mParameters;
    protected PresenterStack mPresenterStack;
    protected ViewStackLayout mViewStackContainer;

    public PresenterFragment()
    {
        mParameters = new HashMap();
    }

    public void addStringParam(String s, String s1)
    {
        mParameters.put(s, s1);
    }

    public Bundle getDynamicArguments()
    {
        return mDynamicArguments;
    }

    public String getStringParam(String s)
    {
        return (String)mParameters.remove(s);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        Presenter presenter = mPresenterStack.peek();
        if (presenter != null)
        {
            presenter.onActivityResultAsTop(i, j, intent);
        }
    }

    public boolean onBackPressed()
    {
        for (Presenter presenter = mPresenterStack.peek(); presenter != null && presenter.interceptBack() || mPresenterStack.popPresenter() != null;)
        {
            return true;
        }

        return false;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        mPresenterStack.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        if (mPresenterStack != null)
        {
            Presenter presenter = mPresenterStack.peek();
            if (presenter != null)
            {
                presenter.onCreateMenu(menu, menuinflater);
            }
        }
    }

    public Presenter onCreatePresenter()
    {
        return null;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (mFragmentRootView == null)
        {
            mFragmentRootView = layoutinflater.inflate(com.walmart.lib.R.layout.presenter_container, viewgroup, false);
            mFragmentRootView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            mViewStackContainer = (ViewStackLayout)mFragmentRootView;
            mPresenterStack = new PresenterStack(mViewStackContainer);
            layoutinflater = onCreatePresenter();
            if (layoutinflater != null)
            {
                mPresenterStack.pushPresenter(layoutinflater, false);
            }
        }
        return mFragmentRootView;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (mPresenterStack != null)
        {
            mPresenterStack.cleanUp();
        }
    }

    public void onDestroyView()
    {
        ViewGroup viewgroup = (ViewGroup)mFragmentRootView.getParent();
        if (viewgroup != null)
        {
            viewgroup.removeView(mFragmentRootView);
        }
        super.onDestroyView();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (mPresenterStack != null)
        {
            Presenter presenter = mPresenterStack.peek();
            if (presenter != null)
            {
                return presenter.onOptionsMenuItemSelected(menuitem, getActivity());
            }
        }
        return super.onOptionsItemSelected(menuitem);
    }

    public void onPause()
    {
        super.onPause();
        Presenter presenter = mPresenterStack.peek();
        if (presenter != null)
        {
            presenter.onPauseAsTop();
        }
    }

    public void onRestart()
    {
        popToRoot();
    }

    public void onResume()
    {
        super.onResume();
        Presenter presenter = mPresenterStack.peek();
        if (presenter != null)
        {
            presenter.onResumeAsTop();
            mPresenterStack.setDisplayEventsEnabled(mEnableDisplayEvents);
            if (mEnableDisplayEvents)
            {
                MessageBus.getBus().post(new PresenterDisplayedEvent(presenter));
            }
        }
    }

    public void onStart()
    {
        super.onStart();
        Presenter presenter = mPresenterStack.peek();
        if (presenter != null)
        {
            presenter.onStartAsTop();
        }
    }

    public void onStop()
    {
        super.onStop();
        Presenter presenter = mPresenterStack.peek();
        if (presenter != null)
        {
            presenter.onStopAsTop();
        }
        mPresenterStack.finishCurrentOperation();
    }

    public void popToRoot()
    {
        mPresenterStack.popToRoot();
    }

    void reset()
    {
        popToRoot();
    }

    public void setDisplayEventsEnabled(boolean flag)
    {
        mEnableDisplayEvents = flag;
    }

    public void setDynamicArguments(Bundle bundle)
    {
        mDynamicArguments = bundle;
    }
}
