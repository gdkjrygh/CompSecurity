// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.location.UberLatLngBounds;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.feature.pickup.model.GuidedPickupVenueDetails;
import com.ubercab.client.feature.pickup.model.GuidedPickupVenueSelection;
import com.ubercab.client.feature.trip.map.MapFragment;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.NearbyVehicle;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.rider.realtime.model.TripDriverLocation;
import com.ubercab.rider.realtime.model.VehiclePathPoint;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class fzl
{

    private final int a;
    private final cev b;
    private final hkr c;
    private final hku d;
    private final gmg e;
    private final evt f;
    private final dpg g;
    private final dak h;
    private final eer i;
    private final czf j;
    private final dal k;
    private final fta l;
    private final fte m;
    private boolean n;
    private RiderLocation o;
    private fzm p;
    private String q;
    private int r;
    private icl s;

    public fzl(Application application, cev cev1, hkr hkr1, hku hku1, gmg gmg1, evt evt1, dpg dpg1, 
            dak dak1, eer eer1, czf czf1, dal dal1, fta fta1, fte fte1)
    {
        n = true;
        b = cev1;
        c = hkr1;
        d = hku1;
        e = gmg1;
        f = evt1;
        h = dak1;
        i = eer1;
        g = dpg1;
        j = czf1;
        k = dal1;
        l = fta1;
        m = fte1;
        a = application.getResources().getDimensionPixelSize(0x7f0800d7);
    }

    private UberLatLngBounds a(UberLatLng uberlatlng, UberLatLng uberlatlng1)
    {
        uberlatlng = (new ciq()).a(uberlatlng);
        if (uberlatlng1 == null)
        {
            return uberlatlng.a();
        }
        uberlatlng.a(uberlatlng1);
        for (uberlatlng1 = i.j().iterator(); uberlatlng1.hasNext(); uberlatlng.a((UberLatLng)uberlatlng1.next())) { }
        for (uberlatlng1 = i.k().iterator(); uberlatlng1.hasNext(); uberlatlng.a((UberLatLng)uberlatlng1.next())) { }
        return uberlatlng.a();
    }

    private UberLatLngBounds a(Map map, UberLatLng uberlatlng)
    {
        double d1 = 0.0D;
        map = (NearbyVehicle)map.get(k.E());
        double d3;
        double d4;
        if (map != null && map.getVehiclePaths() != null && map.getVehiclePaths().isEmpty())
        {
            map = map.getVehiclePaths().values().iterator();
            double d2 = 0.0D;
            do
            {
                d4 = d1;
                d3 = d2;
                if (!map.hasNext())
                {
                    break;
                }
                VehiclePathPoint vehiclepathpoint = (VehiclePathPoint)gki.b((List)map.next());
                d2 = Math.max(d2, Math.abs(uberlatlng.a() - vehiclepathpoint.getLatitude()));
                d1 = Math.max(d1, Math.abs(uberlatlng.b() - vehiclepathpoint.getLongitude()));
            } while (true);
        } else
        {
            d3 = 0.0D;
            d4 = d1;
        }
        return (new ciq()).a(uberlatlng).a(new UberLatLng(uberlatlng.a() - d3, uberlatlng.b() - d4)).a(new UberLatLng(d3 + uberlatlng.a(), d4 + uberlatlng.b())).a();
    }

    private eep a(int i1)
    {
        boolean flag = true;
        if (!n || c.f() == null)
        {
            return null;
        }
        Object obj = o();
        Object obj1 = l();
        if (obj == null || obj1 == null)
        {
            obj = (UberLatLng)gjy.c(obj).a(gjy.c(obj1)).d();
            if (obj == null)
            {
                return null;
            }
            obj = eep.a().a(((UberLatLng) (obj))).a(15F);
            if (i1 != fzn.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return ((eeq) (obj)).a(flag).a();
        }
        obj1 = (new ciq()).a(((UberLatLng) (obj))).a(((UberLatLng) (obj1))).a();
        obj = eep.a().a(((UberLatLngBounds) (obj1)), ((UberLatLng) (obj)), 15F, a);
        if (i1 == fzn.a)
        {
            flag = false;
        }
        return ((eeq) (obj)).a(flag).a();
    }

    private eep a(boolean flag, boolean flag1)
    {
        boolean flag5 = false;
        RiderLocation riderlocation = h.b();
        RiderLocation riderlocation1 = o;
        o = m.i();
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag6;
        boolean flag7;
        if (!gjx.a(riderlocation1, o))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag6 = m.a();
        riderlocation1 = m.i();
        if (riderlocation != null && riderlocation.isLocationSearchResult())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (riderlocation1 != null && flag6)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        flag7 = l.g();
        if (riderlocation == null || !flag && !flag2 && !flag4 && !flag1 && !flag3 && !flag7 && !n)
        {
            return null;
        }
        eeq eeq1 = eep.a().a(riderlocation.getUberLatLng());
        if (flag || !flag4)
        {
            flag5 = true;
        }
        eeq1 = eeq1.a(flag5);
        if (flag || flag1 || flag3 || flag2 || n)
        {
            eeq1.a(17F);
        }
        if (flag6 && riderlocation1 != null)
        {
            eeq1.a(a(riderlocation.getUberLatLng(), riderlocation1.getUberLatLng()), riderlocation.getUberLatLng(), 17F, a);
        }
        return eeq1.a();
    }

    private eep a(boolean flag, boolean flag1, boolean flag2)
    {
        Object obj;
        RiderLocation riderlocation;
label0:
        {
            boolean flag6 = false;
            riderlocation = h.b();
            boolean flag3;
            boolean flag4;
            boolean flag5;
            boolean flag7;
            if (riderlocation != null && riderlocation.isLocationSearchResult())
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            flag7 = l.g();
            if (flag || flag1)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if (flag2 && !e.a(dbf.aG))
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            if (!flag3)
            {
                flag3 = flag6;
                if (!flag7)
                {
                    break label0;
                }
            }
            flag3 = true;
        }
        if (riderlocation != null)
        {
            obj = riderlocation.getUberLatLng();
        } else
        {
            obj = null;
        }
        if (obj == null || !flag4 && !n && !flag3 && !flag5)
        {
            return null;
        }
        Eyeball eyeball = c.e();
        if (!j.v() || eyeball == null || eyeball.getNearbyVehicles().isEmpty())
        {
            obj = eep.a().a(((UberLatLng) (obj))).a(true);
            if (riderlocation.isLocationSearchResult() || n || flag)
            {
                ((eeq) (obj)).a(15F);
            }
            return ((eeq) (obj)).a();
        } else
        {
            UberLatLngBounds uberlatlngbounds = a(eyeball.getNearbyVehicles(), ((UberLatLng) (obj)));
            return eep.a().a(uberlatlngbounds, ((UberLatLng) (obj))).a(true).a();
        }
    }

    private static boolean a(UberLatLngBounds uberlatlngbounds)
    {
        UberLatLng uberlatlng = uberlatlngbounds.b();
        if (uberlatlngbounds.a(ecx.a(uberlatlng, 75D, 90F)))
        {
            return true;
        } else
        {
            return uberlatlngbounds.a(ecx.a(uberlatlng, 75D, 0.0F));
        }
    }

    private void b(boolean flag)
    {
        Object obj;
        int i1;
        boolean flag1;
        boolean flag2;
        flag2 = true;
        i1 = r;
        obj = q;
        r = e();
        q = k.E();
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[fzn.a().length];
                try
                {
                    a[fzn.c - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[fzn.b - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[fzn.e - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[fzn.d - 1] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[fzn.f - 1] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[fzn.g - 1] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[fzn.h - 1] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[fzn.i - 1] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (!gjx.a(obj, q))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i1 == r)
        {
            flag2 = false;
        }
        _cls1.a[r - 1];
        JVM INSTR tableswitch 1 8: default 112
    //                   1 141
    //                   2 154
    //                   3 161
    //                   4 169
    //                   5 177
    //                   6 189
    //                   7 198
    //                   8 206;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        obj = null;
_L11:
        if (obj != null)
        {
            i.a(((eep) (obj)));
        }
        return;
_L2:
        obj = a(flag2, flag1, flag);
        continue; /* Loop/switch isn't completed */
_L3:
        obj = g();
        continue; /* Loop/switch isn't completed */
_L4:
        obj = k();
        continue; /* Loop/switch isn't completed */
_L5:
        obj = h();
        continue; /* Loop/switch isn't completed */
_L6:
        obj = a(flag2, flag1);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = a(i1);
        continue; /* Loop/switch isn't completed */
_L8:
        obj = i();
        continue; /* Loop/switch isn't completed */
_L9:
        obj = j();
        if (true) goto _L11; else goto _L10
_L10:
    }

    private static eep g()
    {
        return eep.a().a(MapFragment.c).a(0.0F).a();
    }

    private eep h()
    {
        RiderLocation riderlocation;
        riderlocation = h.b();
        break MISSING_BLOCK_LABEL_8;
        if (riderlocation != null && riderlocation.getUberLatLng() != null)
        {
            Object obj1 = i.k();
            if (((List) (obj1)).size() != 0)
            {
                Object obj = new ciq();
                ((ciq) (obj)).a(riderlocation.getUberLatLng());
                for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((ciq) (obj)).a((UberLatLng)((Iterator) (obj1)).next())) { }
                obj = ((ciq) (obj)).a();
                obj1 = eep.a().a(18F).a(riderlocation.getUberLatLng()).a(true);
                if (a(((UberLatLngBounds) (obj))))
                {
                    ((eeq) (obj1)).a(((UberLatLngBounds) (obj)), riderlocation.getUberLatLng(), 18F, a);
                }
                return ((eeq) (obj1)).a();
            }
        }
        return null;
    }

    private eep i()
    {
        if (!n)
        {
            return null;
        }
        UberLatLng uberlatlng1 = o();
        UberLatLng uberlatlng = n();
        if (uberlatlng == null || uberlatlng1 == null)
        {
            uberlatlng = (UberLatLng)gjy.c(uberlatlng1).a(gjy.c(uberlatlng)).d();
            if (uberlatlng == null)
            {
                return null;
            } else
            {
                return eep.a().a(uberlatlng).a(15F).a();
            }
        } else
        {
            double d1 = Math.abs(uberlatlng.a() - uberlatlng1.a()) * 1.75D;
            double d2 = Math.abs(uberlatlng.b() - uberlatlng1.b()) * 1.75D;
            Object obj = new UberLatLng(uberlatlng1.a() + d1, uberlatlng1.b() + d2);
            uberlatlng1 = new UberLatLng(uberlatlng1.a() - d1, uberlatlng1.b() - d2);
            obj = (new ciq()).a(((UberLatLng) (obj))).a(uberlatlng1).a();
            return eep.a().a(((UberLatLngBounds) (obj)), uberlatlng).a(true).a();
        }
    }

    private eep j()
    {
        if (!n)
        {
            return null;
        }
        UberLatLng uberlatlng = n();
        Object obj = l();
        if (uberlatlng == null || obj == null)
        {
            uberlatlng = (UberLatLng)gjy.c(obj).a(gjy.c(uberlatlng)).d();
            if (uberlatlng == null)
            {
                return null;
            } else
            {
                return eep.a().a(uberlatlng).a(15F).a(true).a();
            }
        } else
        {
            obj = a(uberlatlng, ((UberLatLng) (obj)));
            return eep.a().a(((UberLatLngBounds) (obj)), uberlatlng, 15F, a).a(true).a();
        }
    }

    private eep k()
    {
        Object obj = f.h();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((GuidedPickupVenueDetails) (obj)).getVenueSelection();
        }
        if (obj != null)
        {
            eeq eeq1 = eep.a();
            RiderLocation riderlocation = h.b();
            if (riderlocation != null && riderlocation.getType().equals("venue"))
            {
                eeq1.a(riderlocation.getUberLatLng());
                if (((GuidedPickupVenueSelection) (obj)).getSelectedPickup() == null)
                {
                    eeq1.a(15F);
                } else
                {
                    eeq1.a(17F);
                }
                return eeq1.a(true).a();
            }
        }
        return null;
    }

    private UberLatLng l()
    {
        Object obj = m.i();
        if (obj != null)
        {
            if (!((UberLatLng) (obj = ((RiderLocation) (obj)).getUberLatLng())).equals(MapFragment.c))
            {
                return ((UberLatLng) (obj));
            }
        }
        return null;
    }

    private boolean m()
    {
        int i1 = e();
        return i1 == fzn.g || i1 == fzn.h || i1 == fzn.i;
    }

    private UberLatLng n()
    {
        Object obj = c.f();
        TripDriver tripdriver;
        if (obj != null)
        {
            tripdriver = ((Trip) (obj)).getDriver();
        } else
        {
            tripdriver = null;
        }
        if (tripdriver != null)
        {
            UberLatLng uberlatlng;
            if (p != null)
            {
                uberlatlng = p.A_();
            } else
            {
                uberlatlng = null;
            }
            if (uberlatlng != null && !uberlatlng.equals(MapFragment.c))
            {
                return uberlatlng;
            }
            obj = ((Trip) (obj)).getDriver().getLocation();
            if (obj != null)
            {
                obj = new UberLatLng(((TripDriverLocation) (obj)).getLatitude(), ((TripDriverLocation) (obj)).getLongitude());
                if (!((UberLatLng) (obj)).equals(MapFragment.c) && uberlatlng == null)
                {
                    return ((UberLatLng) (obj));
                }
            }
        }
        return null;
    }

    private UberLatLng o()
    {
        Object obj = c.f();
        if (obj != null)
        {
            if ((obj = ((Trip) (obj)).getPickupLocation()) != null && !((UberLatLng) (obj = new UberLatLng(((Location) (obj)).getLatitude(), ((Location) (obj)).getLongitude()))).equals(MapFragment.c))
            {
                return ((UberLatLng) (obj));
            }
        }
        return null;
    }

    public final void a()
    {
        b(true);
    }

    public final void a(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            n = bundle.getBoolean("com.ubercab.CAMERA_TRACKING", true);
            return;
        }
    }

    public final void a(fzm fzm1)
    {
        p = fzm1;
    }

    public final void a(boolean flag)
    {
        n = flag;
        i.i();
        if (m())
        {
            b();
        }
    }

    public final void b()
    {
        b(false);
    }

    public final void b(Bundle bundle)
    {
        bundle.putBoolean("com.ubercab.CAMERA_TRACKING", n);
    }

    public final void c()
    {
        r = e();
        b.a(this);
        if (s == null || s.c())
        {
            s = d.h().c(new fzo(this, (byte)0));
        }
    }

    public final void d()
    {
        b.b(this);
        if (s != null)
        {
            s.b();
        }
    }

    public final int e()
    {
        switch (m.g())
        {
        default:
            return fzn.a;

        case 1: // '\001'
            return fzn.e;

        case 2: // '\002'
            return fzn.d;

        case 0: // '\0'
            if (h.b() == null)
            {
                return fzn.b;
            } else
            {
                return fzn.c;
            }

        case 3: // '\003'
            return fzn.f;

        case 4: // '\004'
            return fzn.g;

        case 5: // '\005'
        case 6: // '\006'
            return fzn.h;

        case 7: // '\007'
            return fzn.i;
        }
    }

    public final boolean f()
    {
        return n;
    }

    public final void onPinLocationEvent(daq daq)
    {
        b();
    }

    public final void onPingEvent(dar dar1)
    {
        while (g.n() || !dul.f(dar1.a())) 
        {
            return;
        }
        b();
    }

    public final void onTripUiStateChangedEvent(fzc fzc)
    {
        b();
    }
}
