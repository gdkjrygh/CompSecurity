// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            Request, m, e

final class g
    implements Runnable
{

    final e a;
    private final Request b;
    private final m c;
    private final Runnable d;

    public g(e e, Request request, m m1, Runnable runnable)
    {
        a = e;
        super();
        b = request;
        c = m1;
        d = runnable;
    }

    public final void run()
    {
        if (b.g())
        {
            b.b("canceled-at-delivery");
        } else
        {
            boolean flag;
            if (c.c == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                b.a(c.a);
            } else
            {
                b.b(c.c);
            }
            if (c.d)
            {
                b.a("intermediate-response");
            } else
            {
                b.b("done");
            }
            if (d != null)
            {
                d.run();
                return;
            }
        }
    }
}
