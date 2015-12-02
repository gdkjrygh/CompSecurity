// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Trip;
import java.util.List;
import java.util.Map;

public final class hkv
    implements hku
{

    private final ici a;
    private final iit b = iir.m();
    private final iit c = iir.m();
    private final iit d = iir.m();
    private final iit e = iir.m();
    private final iit f = iir.m();
    private final iit g = iir.m();
    private final iit h = iir.m();
    private final iit i = iir.m();

    private hkv(ici ici)
    {
        a = ici;
    }

    public static hkv a(ici ici)
    {
        return new hkv(ici);
    }

    public final ica a()
    {
        return b.c().a(a);
    }

    final void a(City city)
    {
        c.a(gjy.c(city));
    }

    final void a(Client client)
    {
        d.a(gjy.c(client));
    }

    final void a(ClientStatus clientstatus)
    {
        e.a(gjy.c(clientstatus));
    }

    final void a(Eyeball eyeball)
    {
        g.a(gjy.c(eyeball));
    }

    final void a(Trip trip)
    {
        h.a(gjy.c(trip));
    }

    final void a(List list)
    {
        f.a(list);
    }

    final void a(Map map)
    {
        b.a(map);
    }

    public final ica b()
    {
        return c.c().a(a);
    }

    public final ica c()
    {
        return d.c().a(a);
    }

    public final ica d()
    {
        return c().d(new _cls2()).a(new _cls1());
    }

    public final ica e()
    {
        return e.c();
    }

    public final ica f()
    {
        return e().d(new _cls4()).a(new _cls3());
    }

    public final ica g()
    {
        return g.c().a(a);
    }

    public final ica h()
    {
        return h.c().a(a);
    }

    public final ica i()
    {
        return i.c().a(a);
    }

    final void j()
    {
        i.a(null);
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls3 {}

}
