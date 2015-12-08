// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface;

import android.webkit.CookieManager;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface:
//            a

class h
    implements Runnable
{

    final String a;
    final String b;
    final String c;
    final a d;

    h(a a1, String s, String s1, String s2)
    {
        d = a1;
        a = s;
        b = s1;
        c = s2;
        super();
    }

    public void run()
    {
        Object obj;
label0:
        {
            String s = a;
            if (s != null)
            {
                obj = s;
                if (!"".equals(s.trim()))
                {
                    break label0;
                }
            }
            obj = com.wf.wellsfargomobile.webview.javascriptinterface.a.a(d).webview.getUrl();
        }
        StringBuilder stringbuilder;
        if (WFApp.z().getCookie(((String) (obj))).contains(b))
        {
            obj = Boolean.valueOf(true);
        } else
        {
            obj = Boolean.valueOf(false);
        }
        stringbuilder = new StringBuilder(c);
        stringbuilder.append("('").append(((Boolean) (obj)).toString()).append("')");
        com.wf.wellsfargomobile.webview.javascriptinterface.a.a(d).loadJavaScript(stringbuilder.toString());
    }
}
