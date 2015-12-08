// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.walmart.android.analytics.AnalyticsHelper;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;

public class PrivacyPolicyPresenter extends Presenter
{

    private ViewGroup mView;
    private WebView mWebView;

    public PrivacyPolicyPresenter(Context context)
    {
        mView = (ViewGroup)ViewUtil.inflate(context, 0x7f040096);
        mWebView = (WebView)ViewUtil.findViewById(mView, 0x7f100205);
        mWebView.setWebViewClient(new WebViewClient() {

            final PrivacyPolicyPresenter this$0;

            public void onPageFinished(WebView webview, String s)
            {
                super.onPageFinished(webview, s);
                mView.findViewById(0x7f1001bb).setVisibility(8);
                mWebView.setVisibility(0);
            }

            
            {
                this$0 = PrivacyPolicyPresenter.this;
                super();
            }
        });
        mWebView.setScrollBarStyle(0);
    }

    public String getTitleText()
    {
        return "Privacy Policy";
    }

    public View getView()
    {
        return mView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        mView.removeAllViews();
        mWebView.destroy();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        mWebView.loadUrl("http://www.walmartstores.com/PrivacySecurity/9243.aspx");
    }

    protected void onPageView()
    {
        AnalyticsHelper.post(AnalyticsHelper.preparePrivacyPolicyPageViewEvent());
    }


}
