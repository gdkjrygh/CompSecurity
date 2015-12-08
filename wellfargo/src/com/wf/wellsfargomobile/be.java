// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.app.Activity;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class be extends WebChromeClient
{

    private Activity a;

    public be(Activity activity)
    {
        a = activity;
    }

    public boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        return true;
    }

    public void onGeolocationPermissionsShowPrompt(String s, android.webkit.GeolocationPermissions.Callback callback)
    {
        callback.invoke(s, true, false);
    }

    public void onProgressChanged(WebView webview, int i)
    {
        super.onProgressChanged(webview, i);
        if (a != null)
        {
            a.setProgress(i * 100);
        }
    }

    public void onReceivedTitle(WebView webview, String s)
    {
        super.onReceivedTitle(webview, s);
    }
}
