// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.messagecenter.view;

import android.os.Handler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.gau.go.launcherex.gowidget.messagecenter.view:
//            MessageCenterWebView, f

class e extends WebChromeClient
{

    final MessageCenterWebView a;

    e(MessageCenterWebView messagecenterwebview)
    {
        a = messagecenterwebview;
        super();
    }

    public void onConsoleMessage(String s, int i, String s1)
    {
    }

    public void onProgressChanged(WebView webview, int i)
    {
        super.onProgressChanged(webview, i);
        MessageCenterWebView.f(a).post(new f(this, i));
    }
}
