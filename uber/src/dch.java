// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.LocationHistoryResponse;
import com.ubercab.client.core.model.Ping;
import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.Trip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class dch
{

    public static final Map a;
    private final dcj b = new dcj((byte)0);
    private final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    private final cev d;
    private final hkr e;
    private final hku f;
    private final gmg g;
    private final dkd h;
    private final dak i;
    private final dpg j;
    private List k;

    public dch(cev cev1, hkr hkr1, hku hku1, gmg gmg1, dkd dkd1, dpg dpg1, dak dak1)
    {
        k = new ArrayList();
        d = cev1;
        e = hkr1;
        f = hku1;
        g = gmg1;
        h = dkd1;
        i = dak1;
        j = dpg1;
    }

    static gmg a(dch dch1)
    {
        return dch1.g;
    }

    private void a(UberLatLng uberlatlng)
    {
        dck dck1 = dcj.a(b, uberlatlng);
        if (dck1 != null && dck1.a() != dcl.c)
        {
            return;
        } else
        {
            dcj.a(b, uberlatlng, new dck());
            h.a(uberlatlng.a(), uberlatlng.b());
            return;
        }
    }

    static void a(dch dch1, UberLatLng uberlatlng)
    {
        dch1.a(uberlatlng);
    }

    static boolean a(UberLatLng uberlatlng, UberLatLng uberlatlng1)
    {
        return b(uberlatlng, uberlatlng1);
    }

    private void b(UberLatLng uberlatlng)
    {
        dck dck1;
        UberLatLng uberlatlng1;
        dck1 = dcj.a(b, uberlatlng);
        uberlatlng1 = d();
        if ((uberlatlng1 == null || b(uberlatlng1, uberlatlng)) && dck1 != null && dck1.a() != dcl.a) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (dck1.a() != dcl.c)
        {
            break; /* Loop/switch isn't completed */
        }
        uberlatlng = c.iterator();
        while (uberlatlng.hasNext()) 
        {
            ((dcm)uberlatlng.next()).a();
        }
        if (true) goto _L1; else goto _L3
_L3:
        uberlatlng = c.iterator();
        while (uberlatlng.hasNext()) 
        {
            ((dcm)uberlatlng.next()).a(dck1.b());
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private static boolean b(UberLatLng uberlatlng, UberLatLng uberlatlng1)
    {
        return uberlatlng != null && uberlatlng1 != null && UberLatLng.a(uberlatlng, uberlatlng1) < 100D;
    }

    private UberLatLng d()
    {
        Object obj = null;
        UberLatLng uberlatlng;
        if (i.b() != null)
        {
            uberlatlng = i.b().getUberLatLng();
        } else
        {
            Object obj1 = e.f();
            uberlatlng = obj;
            if (obj1 != null)
            {
                obj1 = ((Trip) (obj1)).getPickupLocation();
                uberlatlng = obj;
                if (obj1 != null)
                {
                    return new UberLatLng(((Location) (obj1)).getLatitude(), ((Location) (obj1)).getLongitude());
                }
            }
        }
        return uberlatlng;
    }

    public final void a()
    {
        f.h().c(new dcn(this, (byte)0));
        d.a(this);
    }

    public final void a(dcm dcm1)
    {
        c.remove(dcm1);
    }

    public final void b()
    {
        if (!g.a(dbf.bM))
        {
            return;
        } else
        {
            b.evictAll();
            return;
        }
    }

    public final void b(dcm dcm1)
    {
        c.add(dcm1);
        UberLatLng uberlatlng = d();
        dcm1 = uberlatlng;
        if (uberlatlng == null)
        {
            dcm1 = new UberLatLng(0.0D, 0.0D);
        }
        if (dcj.a(b, dcm1) != null)
        {
            b(((UberLatLng) (dcm1)));
        } else
        if (b.size() == 0)
        {
            a(dcm1);
            return;
        }
    }

    public final List c()
    {
        return k;
    }

    public final void onLocationHistoryResponseEvent(dme dme1)
    {
        if (g.a(dbf.bM))
        {
            UberLatLng uberlatlng = new UberLatLng(dme1.b(), dme1.a());
            dck dck1 = dcj.a(b, uberlatlng);
            if (dck1 != null)
            {
                LocationHistoryResponse locationhistoryresponse = (LocationHistoryResponse)dme1.g();
                if (!dme1.i() || locationhistoryresponse == null)
                {
                    dck.a(dck1, dcl.c);
                    return;
                } else
                {
                    k = locationhistoryresponse.getTagged();
                    dck.a(dck1, locationhistoryresponse);
                    dck.a(dck1, dcl.b);
                    b(uberlatlng);
                    return;
                }
            }
        }
    }

    public final void onPinLocationEvent(daq daq1)
    {
        Object obj;
        if (g.a(dbf.bM))
        {
            if ((obj = i.b()) != null && e.f() == null)
            {
                obj = ((RiderLocation) (obj)).getUberLatLng();
                daq1 = daq1.a().getUberLatLng();
                if (daq1 != null && daq1.a(((UberLatLng) (obj))))
                {
                    a(daq1);
                    return;
                }
            }
        }
    }

    public final void onPingEvent(dar dar1)
    {
        if (!j.n() && g.a(dbf.bM))
        {
            dar1 = dar1.a();
            if (dul.i(dar1) && dar1.getTrip() != null)
            {
                dar1 = dar1.getTrip().getPickupLocation();
                a(new UberLatLng(dar1.getLatitude(), dar1.getLongitude()));
                return;
            }
        }
    }

    static 
    {
        a = gkg.a(null, dci.a, "", dci.a, "home", dci.b, "work", dci.c);
    }
}
