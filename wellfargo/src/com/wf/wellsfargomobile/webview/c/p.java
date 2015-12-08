// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ae, ac

public class p extends ae
{

    public p()
    {
    }

    public int a()
    {
        return 110;
    }

    public ac b(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        webview = new ac();
        try
        {
            s = new URL(s);
            if (s.getPath().contains(basewebviewactivity.getString(0x7f080168)) && s.getQuery().contains(basewebviewactivity.getString(0x7f080169)) && s.getQuery().contains(basewebviewactivity.getString(0x7f08016a)))
            {
                webview.a(false);
                webview.b(true);
                basewebviewactivity.returnWithErrorWithIcon(basewebviewactivity.getString(0x7f080105), basewebviewactivity.getString(0x7f0800ff, new Object[] {
                    WFApp.ag()
                }), 0x7f0200fb);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            webview.a(false);
            webview.b(true);
            basewebviewactivity.returnWithError(basewebviewactivity.getString(0x7f0800b2), basewebviewactivity.getString(0x7f0800ae));
            return webview;
        }
        return webview;
    }
}
