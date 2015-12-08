// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;


// Referenced classes of package com.android.a:
//            p, t, g

class i
    implements Runnable
{

    final g a;
    private final p b;
    private final t c;
    private final Runnable d;

    public i(g g, p p1, t t1, Runnable runnable)
    {
        a = g;
        super();
        b = p1;
        c = t1;
        d = runnable;
    }

    public void run()
    {
        if (b.h())
        {
            b.b("canceled-at-delivery");
        } else
        {
            if (c.a())
            {
                b.b(c.a);
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
