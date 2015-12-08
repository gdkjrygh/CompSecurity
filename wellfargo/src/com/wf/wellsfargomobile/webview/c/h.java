// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.content.Context;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import java.util.regex.Pattern;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ae, ac

public class h extends ae
{

    public h()
    {
    }

    public int a()
    {
        return 30;
    }

    public Pattern a(Context context)
    {
        return Pattern.compile("data:text/html,.*");
    }

    public ac b(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        webview = new ac();
        if (s.startsWith("data:text/html,") && s.contains("/signOn/appSignon.action"))
        {
            basewebviewactivity.loadURL("/accounts/accountList.action");
            webview.a(false);
            webview.b(true);
        }
        return webview;
    }
}
