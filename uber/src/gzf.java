// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class gzf extends WebViewClient
{

    private boolean a;

    public gzf()
    {
        a = false;
    }

    public final boolean a()
    {
        return a;
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        a = false;
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        a = true;
    }
}
