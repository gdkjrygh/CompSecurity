// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.d;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.webview.a.c;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.d:
//            i

public class b extends c
{

    public b()
    {
    }

    public int a()
    {
        return 50;
    }

    public com.wf.wellsfargomobile.webview.a.b a(int j, int k, Intent intent, BaseWebViewActivity basewebviewactivity)
    {
        String s;
        com.wf.wellsfargomobile.webview.a.b b1;
        b1 = new com.wf.wellsfargomobile.webview.a.b();
        switch (j)
        {
        default:
            return b1;

        case 10001: 
            if (i.isDefaultPaymentApp(basewebviewactivity))
            {
                intent = new StringBuilder("defaultWalletWithHceRes");
                intent.append("('").append(com.wf.wellsfargomobile.hcewallet.b.b.buildJson(true, "", "")).append("');");
                basewebviewactivity.loadJavaScript(intent.toString());
            } else
            {
                basewebviewactivity.onBackPressed();
            }
            b1.a(false);
            return b1;

        case 10002: 
            s = "WH";
            break;
        }
        if (intent == null) goto _L2; else goto _L1
_L1:
        Bundle bundle = intent.getExtras();
        if (bundle == null) goto _L2; else goto _L3
_L3:
        boolean flag;
        boolean flag1;
        s = bundle.getString("HCE_WALLET_VIEW_ID");
        flag1 = bundle.containsKey("HCE_WALLET_WAC_AUTH_SESSION");
        flag = intent.getExtras().containsKey("HCE_WALLET_AUTH_SESSION");
        intent = s;
_L5:
        if (flag1)
        {
            basewebviewactivity.webview.loadUrl("about:blank");
            basewebviewactivity.loadURL((new StringBuilder()).append(basewebviewactivity.getString(0x7f080173)).append("?viewid=").append(intent).append("&nonce=").append(WFApp.o()).toString());
            basewebviewactivity.showCurtain();
            basewebviewactivity.setLoadingText(0x7f080088);
        } else
        {
            basewebviewactivity.walletHCEShowView(intent, "", flag);
        }
        b1.a(false);
        return b1;
_L2:
        flag = false;
        flag1 = false;
        intent = s;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public int[] b()
    {
        return new int[0];
    }

    public int[] c()
    {
        return (new int[] {
            10001, 10002
        });
    }
}
