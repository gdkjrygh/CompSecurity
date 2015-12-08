// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.walmart.android.app.hybrid.WebPresenter;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.fragments:
//            WalmartPresenterFragment

public class WebFragment extends WalmartPresenterFragment
{
    public class ActionBarState
    {

        public boolean showCart;
        public boolean showSearch;
        final WebFragment this$0;
        public String title;

        public ActionBarState(String s, boolean flag, boolean flag1)
        {
            this$0 = WebFragment.this;
            super();
            title = s;
            showSearch = flag;
            showCart = flag1;
        }
    }


    private static final String TAG = com/walmart/android/fragments/WebFragment.getSimpleName();
    private boolean mLockPortrait;
    private int mSavedOrientation;

    public WebFragment()
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

    protected ActionBarState getInitialActionBarState()
    {
        return new ActionBarState("", false, true);
    }

    protected String getUrl()
    {
        return getDynamicArguments().getString("webview_url");
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

    protected void onCookiesCleared(WebView webview)
    {
    }

    public void onCreate(Bundle bundle)
    {
        WLog.v(TAG, "onCreate");
        super.onCreate(bundle);
    }

    public Presenter onCreatePresenter()
    {
        String s = getUrl();
        ActionBarState actionbarstate = getInitialActionBarState();
        WebPresenter webpresenter = new WebPresenter(getActivity());
        webpresenter.setInitialActionbarState(actionbarstate.title, actionbarstate.showSearch, actionbarstate.showCart);
        webpresenter.setUrl(s);
        webpresenter.setListener(new com.walmart.android.app.hybrid.WebPresenter.Listener() {

            final WebFragment this$0;

            public void onCookiesCleared(WebView webview)
            {
                WebFragment.this.onCookiesCleared(webview);
            }

            public void onRestart()
            {
                restart();
            }

            
            {
                this$0 = WebFragment.this;
                super();
            }
        });
        webpresenter.setWebFragmentCallbacks(new com.walmart.android.app.hybrid.WebPresenter.WebFragmentCallback() {

            final WebFragment this$0;

            public boolean isResumed()
            {
                return WebFragment.this.isResumed();
            }

            
            {
                this$0 = WebFragment.this;
                super();
            }
        });
        return webpresenter;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (mFragmentRootView != null) goto _L2; else goto _L1
_L1:
        super.onCreateView(layoutinflater, viewgroup, bundle);
_L4:
        return mFragmentRootView;
_L2:
        layoutinflater = getDynamicArguments();
        if (layoutinflater != null && layoutinflater.getBoolean("reload"))
        {
            restart();
        }
        if (true) goto _L4; else goto _L3
_L3:
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

    public void onRestart()
    {
        restart();
    }

    public void onResume()
    {
        WLog.v(TAG, "onResume");
        super.onResume();
    }

    public void onStart()
    {
        WLog.v(TAG, "onStart");
        super.onStart();
        if (mLockPortrait)
        {
            lockPortrait();
        }
    }

    public void onStop()
    {
        WLog.v(TAG, "onStop");
        super.onStop();
        if (mLockPortrait)
        {
            restoreOrientation();
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        WLog.v(TAG, "onViewCreated");
        super.onViewCreated(view, bundle);
    }

    protected void restart()
    {
        mPresenterStack.clear();
        Presenter presenter = onCreatePresenter();
        mPresenterStack.pushPresenter(presenter, false);
    }

    public void setLockPortrait(boolean flag)
    {
        mLockPortrait = flag;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT < 19);
    }
}
