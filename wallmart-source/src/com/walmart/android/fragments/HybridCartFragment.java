// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.app.Activity;
import com.walmart.android.app.bridge.HybridPresenter;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmart.android.fragments:
//            WebFragment

public class HybridCartFragment extends WebFragment
{

    private static final String DEFAULT_URL = "https://www.walmart.com/cart/";
    private static final String TAG = com/walmart/android/fragments/HybridCartFragment.getSimpleName();
    private HybridPresenter mPresenter;

    public HybridCartFragment()
    {
    }

    private void createPresenter(Activity activity)
    {
        if (mPresenter == null)
        {
            String s = getUrl(activity);
            WebFragment.ActionBarState actionbarstate = getInitialActionBarState(activity);
            mPresenter = new HybridPresenter(activity);
            mPresenter.setInitialActionbarState(actionbarstate.title, actionbarstate.showSearch, actionbarstate.showCart);
            mPresenter.setUrl(s);
            mPresenter.setCallback(new com.walmart.android.app.bridge.HybridPresenter.FragmentCallback() {

                final HybridCartFragment this$0;

                public boolean isResumed()
                {
                    return HybridCartFragment.this.isResumed();
                }

            
            {
                this$0 = HybridCartFragment.this;
                super();
            }
            });
            mPresenter.setListener(new com.walmart.android.app.bridge.HybridPresenter.Listener() {

                final HybridCartFragment this$0;

                public void onRestart()
                {
                    HybridCartFragment.this.onRestart();
                }

            
            {
                this$0 = HybridCartFragment.this;
                super();
            }
            });
            mPresenter.loadPage();
        }
    }

    protected WebFragment.ActionBarState getInitialActionBarState(Activity activity)
    {
        return new WebFragment.ActionBarState(this, activity.getString(0x7f0900a9), false, true);
    }

    protected String getUrl(Activity activity)
    {
        return "https://www.walmart.com/cart/";
    }

    public Presenter onCreatePresenter()
    {
        createPresenter(getActivity());
        return mPresenter;
    }

    public void onStart()
    {
        setLockPortrait(true);
        super.onStart();
    }

    public void preload(Activity activity)
    {
        createPresenter(activity);
    }

    public void reload()
    {
        mPresenter.reload();
    }

    protected void restart()
    {
        if (mPresenterStack.getCount() > 1)
        {
            mPresenterStack.popToRoot();
            return;
        } else
        {
            mPresenterStack.clear();
            onCreatePresenter();
            mPresenter.reload();
            mPresenterStack.pushPresenter(mPresenter, false);
            return;
        }
    }

}
