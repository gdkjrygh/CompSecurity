// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface;

import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.a.a;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface:
//            a

class g
    implements Runnable
{

    final com.wf.wellsfargomobile.webview.javascriptinterface.a a;

    g(com.wf.wellsfargomobile.webview.javascriptinterface.a a1)
    {
        a = a1;
        super();
    }

    public void run()
    {
        com.wf.wellsfargomobile.webview.javascriptinterface.a.a(a).loadAbsoluteURL(com.wf.wellsfargomobile.a.a.f());
    }
}
