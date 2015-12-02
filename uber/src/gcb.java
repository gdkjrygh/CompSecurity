// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Trip;

final class gcb
    implements ide
{

    final gca a;

    private gcb(gca gca1)
    {
        a = gca1;
        super();
    }

    gcb(gca gca1, byte byte0)
    {
        this(gca1);
    }

    private void a(gcc gcc1)
    {
        java.util.Map map = null;
        City city = (City)gcc1.a.d();
        ClientStatus clientstatus = (ClientStatus)gcc1.b.d();
        Eyeball eyeball = (Eyeball)gcc1.c.d();
        Trip trip = (Trip)gcc1.d.d();
        if (clientstatus != null && eyeball != null)
        {
            if (clientstatus.getStatus().equals("OnTrip"))
            {
                gby.a(gca.a(a).a(com.ubercab.client.core.config.AppConfigKey.Rider.b));
            } else
            {
                gby.a(gca.a(a).a(com.ubercab.client.core.config.AppConfigKey.Rider.c));
            }
            map = eyeball.getNearbyVehicles();
            gcc1 = clientstatus.getStatus();
        } else
        {
            gcc1 = null;
        }
        if (!gca.b(a))
        {
            gca.a(a, city, map, trip, gcc1);
        }
    }

    public final void call(Object obj)
    {
        a((gcc)obj);
    }
}
