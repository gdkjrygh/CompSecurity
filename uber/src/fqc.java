// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.FareEstimateLocation;
import com.ubercab.client.core.model.FareEstimateResponse;
import com.ubercab.client.core.model.FareEstimateVehicleViewData;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.vehicleview.Shape_VehicleView;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.Eyeball;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class fqc
{

    private final cev a;
    private final hkr b;
    private final hku c;
    private final dkb d;
    private final dpg e;
    private final fte f;
    private icl g;
    private FareEstimateResponse h;
    private int i;
    private long j;
    private RiderLocation k;
    private RiderLocation l;
    private float m;
    private String n;
    private Map o;

    public fqc(cev cev1, hkr hkr1, hku hku1, dkb dkb1, dpg dpg1, fte fte1)
    {
        o = new HashMap();
        a = cev1;
        b = hkr1;
        c = hku1;
        d = dkb1;
        e = dpg1;
        f = fte1;
    }

    static float a(fqc fqc1, float f1)
    {
        fqc1.m = f1;
        return f1;
    }

    private static long a(UberLatLng uberlatlng, UberLatLng uberlatlng1, Map map)
    {
        int k1 = 0;
        int i1;
        int j1;
        if (uberlatlng != null)
        {
            i1 = uberlatlng.hashCode();
        } else
        {
            i1 = 0;
        }
        if (uberlatlng1 != null)
        {
            j1 = uberlatlng1.hashCode();
        } else
        {
            j1 = 0;
        }
        if (map != null)
        {
            k1 = map.hashCode();
        }
        return (long)(k1 + (j1 + i1 * 31) * 31);
    }

    static String a(fqc fqc1)
    {
        return fqc1.n;
    }

    private static Map a(Set set, Map map)
    {
        HashMap hashmap = new HashMap();
        set = set.iterator();
        while (set.hasNext()) 
        {
            String s = (String)set.next();
            DynamicFare dynamicfare = (DynamicFare)map.get(s);
            float f1;
            if (dynamicfare != null)
            {
                f1 = dynamicfare.getMultiplier();
            } else
            {
                f1 = 1.0F;
            }
            hashmap.put(s, Float.valueOf(f1));
        }
        return hashmap;
    }

    private void a(int i1)
    {
        i = i1;
        a.c(produceFareEstimateEvent());
    }

    private void a(Map map)
    {
        i = 0;
        j = a(l.getUberLatLng(), k.getUberLatLng(), map);
        UberLatLng uberlatlng = l.getUberLatLng();
        UberLatLng uberlatlng1 = k.getUberLatLng();
        d.a(uberlatlng, uberlatlng1, map, j);
    }

    private Set g()
    {
        City city = b.b();
        if (city == null || city.getVehicleViews() == null)
        {
            return Collections.emptySet();
        } else
        {
            return city.getVehicleViews().keySet();
        }
    }

    private boolean h()
    {
        return l != null && k != null;
    }

    private boolean i()
    {
        Object obj = b.e();
        long l1;
        if (obj != null)
        {
            obj = ((Eyeball) (obj)).getDynamicFares();
        } else
        {
            obj = Collections.emptyMap();
        }
        l1 = a(l.getUberLatLng(), k.getUberLatLng(), a(g(), ((Map) (obj))));
        return j == l1;
    }

    private boolean j()
    {
        if (h == null || h.getVehicleViews() == null)
        {
            return false;
        }
        FareEstimateLocation fareestimatelocation = h.getPickupLocation();
        FareEstimateLocation fareestimatelocation1 = h.getDestinationLocation();
        FareEstimateVehicleViewData fareestimatevehicleviewdata = (FareEstimateVehicleViewData)h.getVehicleViews().get(n);
        boolean flag1 = FareEstimateLocation.isLocationEqual(fareestimatelocation, l);
        boolean flag2 = FareEstimateLocation.isLocationEqual(fareestimatelocation1, k);
        boolean flag;
        if (fareestimatevehicleviewdata != null && fareestimatevehicleviewdata.getSurgeMultiplier() == m)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag1 && flag2 && flag;
    }

    private void k()
    {
        h = null;
        o.clear();
    }

    public final int a()
    {
        return i;
    }

    public final Map b()
    {
        return o;
    }

    public final void c()
    {
        if (g == null || g.c())
        {
            g = ica.a(c.b(), c.g(), new fqe((byte)0)).a(ico.a()).c(new fqd(this, (byte)0));
        }
        a.a(this);
    }

    public final void d()
    {
        if (g != null)
        {
            g.b();
        }
        a.b(this);
    }

    final void e()
    {
        int i1;
        if (!h() || !i())
        {
            if ((i1 = f.g()) == 0 || i1 == 3)
            {
                a(0);
                Set set = g();
                if (h() && !set.isEmpty())
                {
                    Object obj = b.e();
                    if (obj != null)
                    {
                        obj = ((Eyeball) (obj)).getDynamicFares();
                    } else
                    {
                        obj = Collections.emptyMap();
                    }
                    a(a(set, ((Map) (obj))));
                    return;
                }
            }
        }
    }

    final boolean f()
    {
        if (h == null || h.getVehicleViews() == null)
        {
            return false;
        }
        Map map = h.getVehicleViews();
        if (!map.containsKey(n))
        {
            return false;
        }
        return ((FareEstimateVehicleViewData)map.get(n)).getSurgeMultiplier() == m;
    }

    public final void onDestinationChangedEvent(fyi fyi1)
    {
        UberLatLng uberlatlng = null;
        RiderLocation riderlocation = fyi1.a();
        if (k != null)
        {
            fyi1 = k.getUberLatLng();
        } else
        {
            fyi1 = null;
        }
        if (riderlocation != null)
        {
            uberlatlng = riderlocation.getUberLatLng();
        }
        if (gjx.a(fyi1, uberlatlng))
        {
            return;
        } else
        {
            k = riderlocation;
            e();
            return;
        }
    }

    public final void onFareEstimateResponse(dlq dlq1)
    {
        if (j != dlq1.a())
        {
            return;
        }
        if (!dlq1.i()) goto _L2; else goto _L1
_L1:
        o.clear();
        h = (FareEstimateResponse)dlq1.g();
        dlq1 = h.getVehicleViews();
        if (dlq1 == null || dlq1.isEmpty()) goto _L2; else goto _L3
_L3:
        int i1;
        String s;
        for (Iterator iterator = dlq1.keySet().iterator(); iterator.hasNext(); o.put(s, ((FareEstimateVehicleViewData)dlq1.get(s)).getFareString()))
        {
            s = (String)iterator.next();
        }

        i1 = 1;
_L5:
        a(i1);
        return;
_L2:
        i1 = 2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void onPinLocationEvent(daq daq1)
    {
        if (l != null && l.getUberLatLng().equals(daq1.a().getUberLatLng()))
        {
            return;
        } else
        {
            l = daq1.a();
            e();
            return;
        }
    }

    public final void onPingEvent(dar dar1)
    {
        if (!e.n())
        {
            dar1 = dar1.a();
            if (n != null && dul.b(dar1, n))
            {
                dar1 = dar1.getCity().findVehicleViewById(n);
                float f1;
                if (dar1 instanceof Shape_VehicleView)
                {
                    dar1 = ((Shape_VehicleView)dar1).getSurge();
                } else
                {
                    dar1 = null;
                }
                if (dar1 != null)
                {
                    f1 = dar1.getMultiplier();
                } else
                {
                    f1 = 1.0F;
                }
                m = f1;
                if (!f())
                {
                    e();
                    return;
                }
            }
        }
    }

    public final void onVehicleViewSelectedEvent(fzf fzf1)
    {
        DynamicFare dynamicfare = null;
        String s = fzf1.a();
        fzf1 = b.b();
        if (fzf1 != null)
        {
            fzf1 = fzf1.findVehicleViewById(s);
        } else
        {
            fzf1 = null;
        }
        if (fzf1 != null)
        {
            n = s;
            fzf1 = b.e();
            float f1;
            if (fzf1 != null)
            {
                fzf1 = fzf1.getDynamicFares();
            } else
            {
                fzf1 = null;
            }
            if (fzf1 != null)
            {
                dynamicfare = (DynamicFare)fzf1.get(n);
            }
            if (dynamicfare != null)
            {
                f1 = dynamicfare.getMultiplier();
            } else
            {
                f1 = 1.0F;
            }
            m = f1;
            if (!f())
            {
                e();
                return;
            }
        }
    }

    public final fyq produceFareEstimateEvent()
    {
        if (!j())
        {
            k();
            return new fyq(null, i);
        } else
        {
            return new fyq(o, i);
        }
    }
}
