// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.webview.b;
import com.wf.wellsfargomobile.webview.c;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ae, ac

public class z extends ae
{

    public z()
    {
    }

    public int a()
    {
        return 9999;
    }

    public ac a(BaseWebViewActivity basewebviewactivity, WebView webview, b b1)
    {
        webview = new ac();
        webview.a(true);
        if (b1.a() == c.b)
        {
            webview.a(false);
            basewebviewactivity.returnWithErrorWithIcon(basewebviewactivity.getString(0x7f0800b2), basewebviewactivity.getString(0x7f0800b0), 0x7f0200fb);
        }
        return webview;
    }
}
