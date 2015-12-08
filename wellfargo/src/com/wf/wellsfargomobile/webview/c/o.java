// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.WebViewActivity;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ae, ac

public class o extends ae
{

    public o()
    {
    }

    public int a()
    {
        return 90;
    }

    public ac b(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
label0:
        {
label1:
            {
                webview = new ac();
                if (s.contains(basewebviewactivity.getString(0x7f080166)))
                {
                    if (!(basewebviewactivity instanceof WebViewActivity))
                    {
                        break label0;
                    }
                    if (!WFApp.d())
                    {
                        break label1;
                    }
                    webview.a(false);
                    webview.b(true);
                    basewebviewactivity.signOff();
                }
                return webview;
            }
            webview.a(true);
            return webview;
        }
        webview.a(false);
        webview.b(true);
        basewebviewactivity.returnWithError(basewebviewactivity.getString(0x7f0800b2), basewebviewactivity.getString(0x7f0800ae));
        return webview;
    }
}
