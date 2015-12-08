// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;

// Referenced classes of package com.wf.wellsfargomobile.webview:
//            c

public class b
{

    private c a;
    private int b;
    private String c;
    private String d;
    private SslErrorHandler e;
    private SslError f;

    public b(int i, String s, String s1)
    {
        a = c.a;
        b = i;
        c = s;
        d = s1;
    }

    public b(SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        a = c.b;
        e = sslerrorhandler;
        f = sslerror;
    }

    public c a()
    {
        return a;
    }
}
