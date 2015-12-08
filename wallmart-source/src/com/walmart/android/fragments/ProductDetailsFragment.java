// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.app.main.AppIndexManager;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.fragments:
//            WalmartPresenterFragment

public class ProductDetailsFragment extends WalmartPresenterFragment
{

    private static final String TAG = com/walmart/android/fragments/ProductDetailsFragment.getSimpleName();
    private final AppIndexManager mAppIndexManager = new AppIndexManager();
    private String mItemId;

    public ProductDetailsFragment()
    {
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
    }

    public void onCreate(Bundle bundle)
    {
        WLog.v(TAG, "onCreate");
        super.onCreate(bundle);
        mAppIndexManager.create(getActivity());
    }

    public void onDestroy()
    {
        WLog.v(TAG, "onDestroy");
        super.onDestroy();
        mAppIndexManager.destroy();
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

    public void onPresenterPopped(Presenter presenter)
    {
        if (mPresenterStack.getCount() == 1)
        {
            mAppIndexManager.setCurrentSource(presenter);
        } else
        {
            mAppIndexManager.setCurrentSource(null);
        }
        super.onPresenterPopped(presenter);
    }

    public void onPresenterPushed(Presenter presenter)
    {
        if (mPresenterStack.getCount() == 1)
        {
            mAppIndexManager.setCurrentSource(presenter);
        } else
        {
            mAppIndexManager.setCurrentSource(null);
        }
        super.onPresenterPushed(presenter);
    }

    public void onResume()
    {
        WLog.v(TAG, "onResume");
        super.onResume();
    }

    public void onStart()
    {
        WLog.v(TAG, "onStart");
        mAppIndexManager.start();
        super.onStart();
    }

    public void onStop()
    {
        WLog.v(TAG, "onStop");
        super.onStop();
        mAppIndexManager.stop();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        WLog.v(TAG, "onViewCreated");
        super.onViewCreated(view, bundle);
        view = getDynamicArguments();
        if (view != null)
        {
            view = view.getString("item_id");
            if (!TextUtils.isEmpty(view))
            {
                mPresenterStack.popToRoot();
                if (!view.equals(mItemId))
                {
                    mItemId = view;
                    mPresenterStack.pushAndReplacePresenter(new ItemDetailsPresenter(getActivity(), view), false);
                }
            }
        }
        setDynamicArguments(null);
    }

}
