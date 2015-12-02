// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.rider.realtime.model.TripDriverCapabilities;
import java.util.Map;

final class ghd
    implements ide
{

    final ghc a;

    private ghd(ghc ghc1)
    {
        a = ghc1;
        super();
    }

    ghd(ghc ghc1, byte byte0)
    {
        this(ghc1);
    }

    private void a(ghe ghe1)
    {
        Object obj = (City)ghe1.a.d();
        Client client = ghe1.b;
        ClientStatus clientstatus = (ClientStatus)ghe1.c.d();
        Trip trip = (Trip)ghe1.d.d();
        if (client == null || TextUtils.isEmpty(client.getUuid()))
        {
            a.e.c(new ekb());
        } else
        {
            boolean flag;
            if (clientstatus == null)
            {
                ghe1 = null;
            } else
            {
                ghe1 = clientstatus.getStatus();
            }
            if ("Looking".equals(ghe1))
            {
                ghc.a(a);
                ghc.b(a);
            }
            a.a(client.getThirdPartyIdentities());
            if (obj != null && trip != null && !TextUtils.isEmpty(((City) (obj)).getCityName()) && trip.getDriver() != null && trip.getDriver().getCapabilities() != null && trip.getDriver().getCapabilities().getMusic() && a(client) && !TextUtils.isEmpty(trip.getUuid()) && !trip.getUuid().equals(ghc.c(a)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                ghe1 = ((City) (obj)).getCityName();
                obj = ((City) (obj)).getCountryIso2();
                if (a.h.a(dbf.bp))
                {
                    a.j.a("rdio", Boolean.valueOf(false), ghe1, ((String) (obj)));
                }
                if (a.h.a(dbf.bq))
                {
                    a.j.a("spotify", Boolean.valueOf(true), ghe1, ((String) (obj)));
                    if (!a.h.a(dbf.bo))
                    {
                        ghc.a(a, "spotify");
                        return;
                    }
                }
            } else
            {
                a.e.c(new ekb());
                return;
            }
        }
    }

    private static boolean a(Client client)
    {
        for (client = client.getThirdPartyIdentities(); client == null || !client.containsKey("spotify") && !client.containsKey("rdio");)
        {
            return false;
        }

        return true;
    }

    public final void call(Object obj)
    {
        a((ghe)obj);
    }
}
