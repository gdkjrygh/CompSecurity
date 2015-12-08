// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.DialogFactory;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.controller.CallbackFragment;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.payment.view.OnSingleClickListener;

public class MoreInfoFragment extends CallbackFragment
{
    public static interface Callback
    {

        public abstract void onSetup();
    }


    private static final String ARG_FAQ_URL = "URL";
    public static final String TAG_FAQ = "faq";
    public static final String TAG_HOWTO = "howto";
    private String mCurrentTag;
    private TabHost mTabHost;

    public MoreInfoFragment()
    {
        super(com/walmartlabs/payment/controller/mpay/MoreInfoFragment$Callback);
    }

    public static MoreInfoFragment newInstance(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("URL", s);
        s = new MoreInfoFragment();
        s.setArguments(bundle);
        return s;
    }

    public View onCreateView(final LayoutInflater rootView, ViewGroup viewgroup, Bundle bundle)
    {
        rootView = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (rootView != null)
        {
            rootView.setTitle(com.walmartlabs.android.payment.R.string.mpay_info_title);
        }
        rootView = ViewUtil.inflate(getActivity(), com.walmartlabs.android.payment.R.layout.mpay_info, viewgroup, false);
        viewgroup = new android.widget.TabHost.TabContentFactory() {

            final MoreInfoFragment this$0;
            final View val$rootView;

            public View createTabContent(String s)
            {
                if ("howto".equals(s))
                {
                    s = ViewUtil.inflate(getActivity(), com.walmartlabs.android.payment.R.layout.mpay_info_how_to, (ViewGroup)getView(), false);
                    ViewUtil.findViewById(s, com.walmartlabs.android.payment.R.id.mpay_value_button).setOnClickListener(new OnSingleClickListener() {

                        final _cls1 this$1;

                        public void onSingleClick(View view)
                        {
                            MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("mobilePayGetStarted"));
                            ((Callback)this$0).onSetup();
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    ViewUtil.findViewById(s, com.walmartlabs.android.payment.R.id.mpay_info_link_safe).setOnClickListener(new OnSingleClickListener() {

                        final _cls1 this$1;

                        public void onSingleClick(View view)
                        {
                            DialogFactory.createAlertDialog(getString(com.walmartlabs.android.payment.R.string.mpay_info_how_safe_title), getString(com.walmartlabs.android.payment.R.string.mpay_info_how_safe_body), getActivity()).show();
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    MobilePayManager.get().getUserInfo(s. new com.walmartlabs.payment.service.mpay.MobilePayManager.UserInfoInterface() {

                        final _cls1 this$1;
                        final View val$tab;

                        public void onGetUserInfo(boolean flag)
                        {
                            if (flag)
                            {
                                ViewUtil.findViewById(tab, com.walmartlabs.android.payment.R.id.mpay_value_button_container).setVisibility(8);
                                ViewUtil.findViewById(tab, com.walmartlabs.android.payment.R.id.mpay_value_button_shadow).setVisibility(8);
                            }
                        }

            
            {
                this$1 = final__pcls1;
                tab = View.this;
                super();
            }
                    });
                    return s;
                } else
                {
                    s = ViewUtil.inflate(getActivity(), com.walmartlabs.android.payment.R.layout.loading_webview, (ViewGroup)getView(), false);
                    WebView webview = (WebView)s.findViewById(com.walmartlabs.android.payment.R.id.webView);
                    webview.setWebViewClient(webview. new WebViewClient() {

                        final _cls1 this$1;
                        final WebView val$webView;

                        public void onPageFinished(WebView webview, String s)
                        {
                            super.onPageFinished(webview, s);
                            rootView.findViewById(com.walmartlabs.android.payment.R.id.loading).setVisibility(8);
                            webView.setVisibility(0);
                        }

                        public boolean shouldOverrideUrlLoading(WebView webview, String s)
                        {
                            webview = new Intent("android.intent.action.VIEW");
                            webview.setData(Uri.parse(s));
                            if (webview.resolveActivity(getActivity().getPackageManager()) != null)
                            {
                                getActivity().startActivity(webview);
                                return true;
                            } else
                            {
                                return false;
                            }
                        }

            
            {
                this$1 = final__pcls1;
                webView = WebView.this;
                super();
            }
                    });
                    webview.loadUrl(getArguments().getString("URL"));
                    return s;
                }
            }

            
            {
                this$0 = MoreInfoFragment.this;
                rootView = view;
                super();
            }
        };
        mTabHost = (TabHost)ViewUtil.findViewById(rootView, com.walmartlabs.android.payment.R.id.tabhost);
        mTabHost.setup();
        bundle = mTabHost.newTabSpec("howto");
        bundle.setContent(viewgroup);
        bundle.setIndicator(getString(com.walmartlabs.android.payment.R.string.mpay_info_how_title));
        mTabHost.addTab(bundle);
        bundle = mTabHost.newTabSpec("faq");
        bundle.setContent(viewgroup);
        bundle.setIndicator(getString(com.walmartlabs.android.payment.R.string.mpay_info_faq_title));
        mTabHost.addTab(bundle);
        if (android.os.Build.VERSION.SDK_INT < 16 && "htc".equalsIgnoreCase(Build.MANUFACTURER))
        {
            viewgroup = (TabWidget)rootView.findViewById(0x1020013);
            if (viewgroup != null)
            {
                for (int i = 0; i < viewgroup.getTabCount(); i++)
                {
                    bundle = (TextView)viewgroup.getChildTabViewAt(i).findViewById(0x1020016);
                    if (bundle != null)
                    {
                        bundle.setTextColor(getResources().getColor(com.walmartlabs.android.payment.R.color.black));
                    }
                }

            }
        }
        return rootView;
    }

    public void onPause()
    {
        super.onPause();
        mCurrentTag = mTabHost.getCurrentTabTag();
    }

    public void onResume()
    {
        super.onResume();
        if (mCurrentTag != null)
        {
            mTabHost.setCurrentTabByTag(mCurrentTag);
        }
    }

    public void onStart()
    {
        super.onStart();
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "how to use mobile pay").putString("section", "mobile pay"));
    }

}
