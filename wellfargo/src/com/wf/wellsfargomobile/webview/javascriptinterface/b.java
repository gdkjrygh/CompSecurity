// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface;

import com.wf.wellsfargomobile.BaseWebViewActivity;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface:
//            a

class b
    implements Runnable
{

    final String a;
    final a b;

    b(a a1, String s)
    {
        b = a1;
        a = s;
        super();
    }

    public void run()
    {
        com.wf.wellsfargomobile.webview.javascriptinterface.a.a(b).walletSignOff(a);
    }
}
