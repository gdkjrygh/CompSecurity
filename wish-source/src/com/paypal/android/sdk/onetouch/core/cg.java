// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            bq, cl, cd, bl

final class cg extends bq
{

    private final cl a;
    private cd b;

    private cg(cd cd1, cl cl1)
    {
        b = cd1;
        super();
        a = cl1;
    }

    cg(cd cd1, cl cl1, byte byte0)
    {
        this(cd1, cl1);
    }

    public final void a(String s, String s1)
    {
        a.b(s);
        cd.a();
        (new StringBuilder()).append(a.n()).append(" success");
    }

    public final void a(Throwable throwable, String s)
    {
        a.b(s);
        if (throwable instanceof NoHttpResponseException)
        {
            cd.e(b).a().getConnectionManager().closeExpiredConnections();
            b.b(a);
            return;
        } else
        {
            cd.a();
            (new StringBuilder()).append(a.n()).append(" failure: ").append(throwable.getMessage());
            return;
        }
    }
}
