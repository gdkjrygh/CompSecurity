// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.b.a;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ae, ac

public class d extends ae
{

    public d()
    {
    }

    public int a()
    {
        return 10;
    }

    public ac b(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        ac ac1 = new ac();
        if (s.startsWith("native://wallet/"))
        {
            c(basewebviewactivity, webview, s);
            ac1.a(false);
            ac1.b(true);
        } else
        {
            if (basewebviewactivity.isWalletSignOn())
            {
                ac1.a(false);
                ac1.b(true);
                basewebviewactivity.loadURL((new StringBuilder()).append(basewebviewactivity.getString(0x7f080173)).append("?viewid=").append(basewebviewactivity.walletCallbackViewID).append("&nonce=").append(WFApp.o()).toString());
                return ac1;
            }
            if (s.startsWith("native://mba/"))
            {
                c(basewebviewactivity, webview, s);
                ac1.a(false);
                ac1.b(true);
                return ac1;
            }
        }
        return ac1;
    }

    protected void c(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        String s1;
        s1 = URLDecoder.decode(s, "UTF-8");
        if (s.startsWith("native://wallet/"))
        {
            return;
        }
        try
        {
            if (s.startsWith("native://mba/"))
            {
                basewebviewactivity.getMBANativeRequestManager().a(s1, webview);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (BaseWebViewActivity basewebviewactivity) { }
        return;
    }
}
