// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.feature.pickup.network.GuidedPickupApi;
import java.util.concurrent.TimeUnit;

public final class ewx
    implements eww
{

    private static final long a;
    private final GuidedPickupApi b;
    private final cev c;
    private final gmg d;
    private final ewz e;
    private final exb f;

    public ewx(GuidedPickupApi guidedpickupapi, cev cev, gju gju, gmg gmg1)
    {
        b = guidedpickupapi;
        c = cev;
        d = gmg1;
        e = new ewz(c, gju);
        f = new exb(c, gju);
    }

    static long a()
    {
        return a;
    }

    public final void a(UberLatLng uberlatlng)
    {
        b.geocodeRegion(uberlatlng.a(), uberlatlng.b(), 250D, new ewy(c, uberlatlng));
    }

    public final void a(com.ubercab.client.feature.pickup.model.GuidedPickupSnap.Location location)
    {
        if (e.a(location))
        {
            return;
        }
        exa exa1 = new exa(e, location);
        if (d.a(dbf.bG))
        {
            b.snap(location.getLatitude().doubleValue(), location.getLongitude().doubleValue(), exa1);
            return;
        } else
        {
            b.snap(cwt.a(), location.getLatitude().doubleValue(), location.getLongitude().doubleValue(), exa1);
            return;
        }
    }

    public final void a(String s)
    {
        if (f.a(s))
        {
            return;
        }
        exc exc1 = new exc(f, s);
        if (d.a(dbf.bG))
        {
            b.venues(s, exc1);
            return;
        } else
        {
            b.venues(cwt.a(), s, exc1);
            return;
        }
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(30L);
    }
}
