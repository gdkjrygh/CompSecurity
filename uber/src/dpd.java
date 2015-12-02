// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.Ping;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Trip;
import java.util.Map;

public final class dpd
    implements hkr
{

    private final hkr a;
    private final bjw b;
    private final daj c;
    private final dpg d;
    private dpc e;
    private dpf f;

    public dpd(hkr hkr1, bjw bjw1, daj daj1, dpg dpg1)
    {
        a = hkr1;
        b = bjw1;
        c = daj1;
        d = dpg1;
    }

    public final Map a()
    {
        if (d.n())
        {
            return a.a();
        }
        Object obj = c.b();
        if (obj == null || ((Ping) (obj)).getAppConfig() == null)
        {
            return null;
        } else
        {
            obj = b.a(((Ping) (obj)).getAppConfig(), (new bmj() {

                final dpd a;

            
            {
                a = dpd.this;
                super();
            }
            }).getType());
            return (Map)b.a(((String) (obj)), (new bmj() {

                final dpd a;

            
            {
                a = dpd.this;
                super();
            }
            }).getType());
        }
    }

    public final City b()
    {
        if (d.n())
        {
            return a.b();
        }
        Ping ping = c.b();
        if (dul.d(ping))
        {
            return ping.getCity();
        } else
        {
            return null;
        }
    }

    public final Client c()
    {
        if (d.n())
        {
            return a.c();
        }
        Ping ping = c.b();
        if (dul.a(ping))
        {
            return ping.getClient();
        } else
        {
            return null;
        }
    }

    public final ClientStatus d()
    {
        if (d.n())
        {
            return a.d();
        }
        if (c.b() == null)
        {
            return null;
        }
        if (e == null)
        {
            e = new dpc(c);
        }
        return e;
    }

    public final Eyeball e()
    {
        if (d.n())
        {
            return a.e();
        }
        if (c.b() == null)
        {
            return null;
        }
        if (f == null)
        {
            f = new dpf(c);
        }
        return f;
    }

    public final Trip f()
    {
        if (d.n())
        {
            return a.f();
        }
        Ping ping = c.b();
        if (dul.f(ping))
        {
            return ping.getTrip();
        } else
        {
            return null;
        }
    }
}
