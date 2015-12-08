// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.walmart.android.app.home.HomePresenter;
import com.walmart.android.ui.Presenter;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.fragments:
//            WalmartPresenterFragment

public class HomeFragment extends WalmartPresenterFragment
{

    private static final long DELAY_BEFORE_EXIT = 1000L;
    private static final String TAG = com/walmart/android/fragments/HomeFragment.getSimpleName();
    private boolean mIsTablet;
    private long mResumeTime;
    private int mSavedOrientation;

    public HomeFragment()
    {
    }

    private void lockPortrait()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        mSavedOrientation = fragmentactivity.getRequestedOrientation();
        fragmentactivity.setRequestedOrientation(1);
    }

    private void restoreOrientation()
    {
        getActivity().setRequestedOrientation(mSavedOrientation);
    }

    public View getView()
    {
        WLog.v(TAG, "getView");
        return super.getView();
    }

    public void onAttach(Activity activity)
    {
        WLog.v(TAG, "onAttach");
        super.onAttach(activity);
        mIsTablet = activity.getResources().getBoolean(0x7f0c0003);
    }

    public boolean onBackPressed()
    {
        if (System.currentTimeMillis() - mResumeTime < 1000L)
        {
            return true;
        } else
        {
            return super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle)
    {
        WLog.v(TAG, "onCreate");
        super.onCreate(bundle);
    }

    public Presenter onCreatePresenter()
    {
        return new HomePresenter(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        WLog.v(TAG, "onCreateView");
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        WLog.v(TAG, "onDestroy");
        super.onDestroy();
    }

    public void onDestroyView()
    {
        WLog.v(TAG, "onDestroyView");
        super.onDestroyView();
    }

    public void onDetach()
    {
        WLog.v(TAG, "onDetach");
        super.onDetach();
    }

    public void onHiddenChanged(boolean flag)
    {
        WLog.v(TAG, "onHiddenChanged");
        super.onHiddenChanged(flag);
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        WLog.v(TAG, "onInflate");
        super.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        WLog.v(TAG, "onPause");
        super.onPause();
    }

    public void onResume()
    {
        mResumeTime = System.currentTimeMillis();
        WLog.v(TAG, "onResume");
        super.onResume();
    }

    public void onStart()
    {
        WLog.v(TAG, "onStart");
        super.onStart();
        if (!mIsTablet)
        {
            lockPortrait();
        }
    }

    public void onStop()
    {
        WLog.v(TAG, "onStop");
        super.onStop();
        if (!mIsTablet)
        {
            restoreOrientation();
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        WLog.v(TAG, "onViewCreated");
        super.onViewCreated(view, bundle);
    }

}
