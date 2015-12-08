// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.webview.b;
import com.wf.wellsfargomobile.webview.c;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ae, ac

public class e extends ae
{

    public e()
    {
    }

    public int a()
    {
        return 20;
    }

    public ac a(BaseWebViewActivity basewebviewactivity, WebView webview, b b1)
    {
        webview = new ac();
        webview.a(true);
        if (b1.a() == c.b && b1.toString().trim().endsWith("/oam/static/unavailable.html"))
        {
            webview.a(false);
            basewebviewactivity.returnWithErrorWithIcon(basewebviewactivity.getString(0x7f080105), basewebviewactivity.getString(0x7f080102, new Object[] {
                WFApp.ag()
            }), 0x7f0200fb);
        }
        return webview;
    }
}
