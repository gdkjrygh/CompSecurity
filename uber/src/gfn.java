// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Trip;

public final class gfn
{

    private final chp a;
    private final cev b;
    private final hkr c;
    private final fsx d;

    public gfn(chp chp1, cev cev1, hkr hkr1, fsx fsx1)
    {
        a = chp1;
        b = cev1;
        c = hkr1;
        d = fsx1;
    }

    public final void a()
    {
        b.c(new fza());
        a.a(n.ao);
    }

    public final void b()
    {
        Object obj = c.f();
        if (obj != null)
        {
            obj = ((Trip) (obj)).getPaymentProfileUUID();
        } else
        {
            obj = "";
        }
        b.c(new fyf(((String) (obj)), d.b()));
        a.a(n.bZ);
    }

    public final void c()
    {
        b.c(new fyd());
        a.a(n.hw);
    }

    public final void d()
    {
        b.c(new fyn());
        a.a(n.eD);
    }

    public final void e()
    {
        b.c(new fyw());
    }

    public final void f()
    {
        b.c(new fyx());
    }

    public final void g()
    {
        b.c(new gfo());
    }
}
