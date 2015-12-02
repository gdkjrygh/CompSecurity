// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

final class ifv extends icj
{

    private final igm a = new igm();
    private final iiy b = new iiy();
    private final igm c;
    private final ifx d;

    ifv(ifx ifx1)
    {
        c = new igm(new icl[] {
            a, b
        });
        d = ifx1;
    }

    public final icl a(idd idd)
    {
        if (c())
        {
            return ijd.b();
        } else
        {
            return d.a(idd, a);
        }
    }

    public final icl a(idd idd, long l, TimeUnit timeunit)
    {
        if (c())
        {
            return ijd.b();
        } else
        {
            return d.a(idd, l, timeunit, b);
        }
    }

    public final void b()
    {
        c.b();
    }

    public final boolean c()
    {
        return c.c();
    }
}
