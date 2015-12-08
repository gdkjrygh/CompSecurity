// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.content.Context;
import android.content.res.Resources;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import java.util.regex.Pattern;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ae, ac

public class x extends ae
{

    public x()
    {
    }

    public int a()
    {
        return 110;
    }

    public Pattern a(Context context)
    {
        return Pattern.compile((new StringBuilder()).append(".*").append(context.getResources().getString(0x7f080167)).append(". * ").toString());
    }

    public ac b(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        webview = new ac();
        if (WFApp.d())
        {
            webview.a(false);
            webview.b(true);
            basewebviewactivity.returnWithError(basewebviewactivity.getString(0x7f080057), basewebviewactivity.getString(0x7f080056), 1, 0x7f0200fb);
        }
        return webview;
    }
}
