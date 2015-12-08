// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ae, ac

public class l extends ae
{

    public l()
    {
    }

    public int a()
    {
        return 70;
    }

    public ac b(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        webview = new ac();
        if (s.endsWith("/auth/static/wfa/unavailable.html"))
        {
            webview.a(false);
            webview.b(true);
            basewebviewactivity.returnWithErrorWithIcon(basewebviewactivity.getString(0x7f080105), basewebviewactivity.getString(0x7f080104, new Object[] {
                WFApp.ag()
            }), 0x7f0200fb);
        }
        return webview;
    }
}
