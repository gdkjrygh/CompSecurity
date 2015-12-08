// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.a.a;
import com.wf.wellsfargomobile.util.v;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ae, ac

public class i extends ae
{

    public i()
    {
    }

    public int a()
    {
        return 40;
    }

    public ac b(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        ac ac1;
label0:
        {
            ac1 = new ac();
            String as[] = com.wf.wellsfargomobile.a.a.l();
            String as1[] = webview.getContext().getResources().getStringArray(0x7f0d0001);
            webview = webview.getContext().getResources().getStringArray(0x7f0d0000);
            String as2[] = com.wf.wellsfargomobile.a.a.n();
            if (v.a(s, WFApp.e(), as, false, as1, webview, as2))
            {
                boolean flag = v.b(s);
                ac1.a(false);
                ac1.b(true);
                if (!flag)
                {
                    break label0;
                }
                webview = new com.wf.wellsfargomobile.i();
                webview.a(s);
                webview.show(basewebviewactivity.getSupportFragmentManager(), "Open Url in Browser Confirmation");
            }
            return ac1;
        }
        basewebviewactivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
        return ac1;
    }
}
