// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.threedsecure;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.braintreepayments.api.threedsecure:
//            ThreeDSecureWebViewActivity, ThreeDSecureWebView

public class ThreeDSecureWebChromeClient extends WebChromeClient
{

    private ThreeDSecureWebViewActivity mActivity;

    public ThreeDSecureWebChromeClient(ThreeDSecureWebViewActivity threedsecurewebviewactivity)
    {
        mActivity = threedsecurewebviewactivity;
    }

    public void onCloseWindow(WebView webview)
    {
        mActivity.popCurrentWebView();
    }

    public boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
    {
        webview = new ThreeDSecureWebView(mActivity);
        webview.init(mActivity);
        mActivity.pushNewWebView(webview);
        ((android.webkit.WebView.WebViewTransport)message.obj).setWebView(webview);
        message.sendToTarget();
        return true;
    }

    public void onProgressChanged(WebView webview, int i)
    {
        super.onProgressChanged(webview, i);
        if (i < 100)
        {
            mActivity.setProgress(i);
            mActivity.setProgressBarVisibility(true);
            return;
        } else
        {
            mActivity.setProgressBarVisibility(false);
            return;
        }
    }
}
