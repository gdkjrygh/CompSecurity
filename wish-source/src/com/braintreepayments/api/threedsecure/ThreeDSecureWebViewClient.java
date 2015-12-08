// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.threedsecure;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.braintreepayments.api.models.ThreeDSecureAuthenticationResponse;

// Referenced classes of package com.braintreepayments.api.threedsecure:
//            ThreeDSecureWebViewActivity

public class ThreeDSecureWebViewClient extends WebViewClient
{

    private ThreeDSecureWebViewActivity mActivity;

    public ThreeDSecureWebViewClient(ThreeDSecureWebViewActivity threedsecurewebviewactivity)
    {
        mActivity = threedsecurewebviewactivity;
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        mActivity.setActionBarTitle(webview.getTitle());
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        if (s.contains("html/authentication_complete_frame"))
        {
            webview.stopLoading();
            webview = Uri.parse(s).getQueryParameter("auth_response");
            mActivity.finishWithResult(ThreeDSecureAuthenticationResponse.fromJson(webview));
            return;
        } else
        {
            super.onPageStarted(webview, s, bitmap);
            return;
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        webview.stopLoading();
        mActivity.finishWithResult(ThreeDSecureAuthenticationResponse.fromException(s));
    }

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        sslerrorhandler.cancel();
        webview.stopLoading();
        mActivity.finishWithResult(ThreeDSecureAuthenticationResponse.fromException(sslerror.toString()));
    }
}
