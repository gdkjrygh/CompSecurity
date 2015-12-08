// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.walmart.android.utils.ViewUtil;

public class WebViewFragment extends Fragment
{

    private static final String ARG_TITLE = "TITLE";
    private static final String ARG_URL = "URL";
    private WebView mWebView;

    public WebViewFragment()
    {
    }

    public static WebViewFragment newInstance(String s, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("TITLE", s);
        bundle.putString("URL", s1);
        s = new WebViewFragment();
        s.setArguments(bundle);
        return s;
    }

    public View onCreateView(final LayoutInflater rootView, ViewGroup viewgroup, Bundle bundle)
    {
        rootView = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (rootView != null)
        {
            rootView.setTitle(getArguments().getString("TITLE"));
        }
        rootView = ViewUtil.inflate(getActivity(), com.walmartlabs.android.payment.R.layout.loading_webview);
        mWebView = (WebView)ViewUtil.findViewById(rootView, com.walmartlabs.android.payment.R.id.webView);
        mWebView.loadUrl(getArguments().getString("URL"));
        mWebView.setScrollBarStyle(0);
        mWebView.setWebViewClient(new WebViewClient() {

            final WebViewFragment this$0;
            final View val$rootView;

            public void onPageFinished(WebView webview, String s)
            {
                super.onPageFinished(webview, s);
                ViewUtil.findViewById(rootView, com.walmartlabs.android.payment.R.id.loading).setVisibility(8);
                mWebView.setVisibility(0);
            }

            
            {
                this$0 = WebViewFragment.this;
                rootView = view;
                super();
            }
        });
        return rootView;
    }

    public void onDestroy()
    {
        if (mWebView != null)
        {
            mWebView.destroy();
            mWebView = null;
        }
        super.onDestroy();
    }

    public void onPause()
    {
        super.onPause();
        mWebView.onPause();
    }

    public void onResume()
    {
        mWebView.onResume();
        super.onResume();
    }

}
