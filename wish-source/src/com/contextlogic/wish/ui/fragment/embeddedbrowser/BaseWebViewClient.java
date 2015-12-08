// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.embeddedbrowser;

import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;

public class BaseWebViewClient extends WebViewClient
{

    public BaseWebViewClient()
    {
    }

    public void onReceivedHttpAuthRequest(WebView webview, HttpAuthHandler httpauthhandler, String s, String s1)
    {
        if (WishApplication.getAppInstance().isDeveloperBuild() && WishApi.getInstance().getConfig().getApiBaseUrlString().equals("testing.wish.com"))
        {
            httpauthhandler.proceed("", "");
            return;
        }
        if (WishApi.getInstance().getConfig().getApiBaseUrlString().equals("sandbox.wish.com"))
        {
            httpauthhandler.proceed("wish", "$andb0x111");
            return;
        } else
        {
            super.onReceivedHttpAuthRequest(webview, httpauthhandler, s, s1);
            return;
        }
    }
}
