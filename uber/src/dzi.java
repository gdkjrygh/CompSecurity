// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import java.util.concurrent.TimeUnit;

public final class dzi
    implements dka
{

    private final cev a;
    private final gju b;
    private final hkr c;
    private final djz d;
    private final gmg e;
    private final dak f;
    private final hkm g;
    private final ici h;
    private final dal i;
    private icl j;
    private boolean k;
    private boolean l;

    public dzi(cev cev1, gju gju1, hkr hkr1, djz djz1, gmg gmg1, hkm hkm1, dak dak1, 
            ici ici, dal dal1)
    {
        a = cev1;
        b = gju1;
        c = hkr1;
        d = djz1;
        e = gmg1;
        g = hkm1;
        f = dak1;
        h = ici;
        i = dal1;
    }

    static dal a(dzi dzi1)
    {
        return dzi1.i;
    }

    private void f()
    {
        l = false;
        i.l(null);
        a.c(new dzl(l));
    }

    private boolean g()
    {
        return e.a(dbf.cd);
    }

    public final void a()
    {
        if (!k)
        {
            k = true;
            a.a(this);
        }
    }

    public final void a(String s)
    {
        i.l(s);
    }

    public final void b()
    {
        if (k)
        {
            k = false;
            a.b(this);
        }
    }

    public final void c()
    {
        Double double1 = null;
        if (!l)
        {
            l = true;
            a.c(new dzl(true));
            Object obj = c.c();
            if (obj != null)
            {
                String s4 = ((Client) (obj)).getUuid();
                String s5 = ((Client) (obj)).getFormattedName();
                Object obj2 = "";
                String s3 = "";
                String s = "";
                Object obj3 = c.f();
                String s1 = s3;
                obj = obj2;
                if (obj3 != null)
                {
                    String s2 = ((Trip) (obj3)).getUuid();
                    obj3 = ((Trip) (obj3)).getDriver();
                    s = s2;
                    s1 = s3;
                    obj = obj2;
                    if (obj3 != null)
                    {
                        obj = ((TripDriver) (obj3)).getUuid();
                        s1 = ((TripDriver) (obj3)).getName();
                        s = s2;
                    }
                }
                Object obj1 = f.c();
                if (obj1 != null)
                {
                    obj1 = ((RiderLocation) (obj1)).getUberLatLng();
                } else
                {
                    obj1 = null;
                }
                if (obj1 != null)
                {
                    obj2 = Double.valueOf(((UberLatLng) (obj1)).a());
                } else
                {
                    obj2 = null;
                }
                if (obj1 != null)
                {
                    double1 = Double.valueOf(((UberLatLng) (obj1)).b());
                }
                if (g())
                {
                    j = g.a(s4, s, s5, s1, ((String) (obj)), ((Double) (obj2)), double1, Long.valueOf(gju.a())).h(dvf.b(TimeUnit.SECONDS, h)).a(new dzj(this, s));
                    return;
                } else
                {
                    d.a(this);
                    d.a(s, s5, s4, s1, ((String) (obj)));
                    return;
                }
            }
        }
    }

    public final void d()
    {
        Client client;
label0:
        {
            if (g())
            {
                if (j != null)
                {
                    j.b();
                    j = null;
                }
            } else
            {
                d.a(null);
            }
            f();
            client = c.c();
            if (client != null)
            {
                if (!g())
                {
                    break label0;
                }
                g.a(client.getUuid(), Long.valueOf(gju.a())).h(dvf.b(TimeUnit.SECONDS, h)).b(duo.a());
            }
            return;
        }
        d.a(client.getUuid());
    }

    public final boolean e()
    {
        boolean flag = true;
        if (l)
        {
            return true;
        }
        Trip trip = c.f();
        if (trip != null)
        {
            String s = i.R();
            if (s == null || !s.equals(trip.getUuid()))
            {
                flag = false;
            }
            l = flag;
        } else
        {
            l = false;
        }
        return l;
    }

    public final void onTripUiStateChangedEvent(fzc fzc1)
    {
        if (l && 7 != fzc1.b())
        {
            f();
        }
    }

    public final dzl produceEmergencyStateUpdated()
    {
        return new dzl(e());
    }
}
