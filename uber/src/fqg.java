// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.event.ClientEvent;
import com.ubercab.client.core.model.event.FareInfoEvent;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.FareEstimateRange;
import com.ubercab.rider.realtime.model.FareInfo;
import com.ubercab.rider.realtime.model.Itinerary;
import com.ubercab.rider.realtime.model.Metadata;
import com.ubercab.rider.realtime.model.UpfrontFare;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.Map;

public final class fqg
{

    private final cev a;
    private final hkr b;
    private final hku c;
    private final gmg d;
    private final dpg e;
    private final fte f;
    private icl g;
    private Itinerary h;
    private FareInfo i;
    private String j;
    private String k;
    private String l;
    private boolean m;
    private long n;
    private RiderLocation o;
    private RiderLocation p;
    private int q;
    private String r;

    public fqg(cev cev1, hkr hkr1, hku hku1, gmg gmg1, dpg dpg1, fte fte1)
    {
        j = "";
        q = 0x80000000;
        a = cev1;
        b = hkr1;
        c = hku1;
        d = gmg1;
        e = dpg1;
        f = fte1;
    }

    private static long a(UberLatLng uberlatlng, UberLatLng uberlatlng1, FareInfo fareinfo, String s)
    {
        int l1 = 0;
        int i1;
        int j1;
        int k1;
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
        if (fareinfo != null)
        {
            k1 = fareinfo.hashCode();
        } else
        {
            k1 = 0;
        }
        if (s != null)
        {
            l1 = s.hashCode();
        }
        return (long)(l1 + (k1 + (j1 + i1 * 31) * 31) * 31);
    }

    public static String a(FareEstimateRange fareestimaterange, double d1)
    {
        double d2;
        float f2;
label0:
        {
            Object obj = null;
            float f1 = fareestimaterange.getMinFare();
            f2 = fareestimaterange.getMaxFare();
            fareestimaterange = obj;
            if (!dud.a(f1, 0.0F))
            {
                fareestimaterange = obj;
                if (!dud.a(f2, 0.0F))
                {
                    d2 = (double)f1 * d1;
                    if (!dud.a(f1, f2))
                    {
                        break label0;
                    }
                    fareestimaterange = String.format("%.0f", new Object[] {
                        Double.valueOf(d2)
                    });
                }
            }
            return fareestimaterange;
        }
        return String.format("%.0f - %.0f", new Object[] {
            Double.valueOf(d2), Double.valueOf((double)f2 * d1)
        });
    }

    private void a(Client client)
    {
        if (client != null)
        {
            client = client.getLastEstimatedTrip();
        } else
        {
            client = null;
        }
        h = client;
        a.c(produceFareEvent());
    }

    static void a(fqg fqg1, Client client)
    {
        fqg1.a(client);
    }

    private static boolean a(Itinerary itinerary)
    {
        return itinerary != null && itinerary.getPickupLocation() != null && itinerary.getDestination() != null && itinerary.getVehicleViewId() != null && itinerary.getFareId() != null;
    }

    private void g()
    {
        if (f.i() != null && !fte.b(f.g()))
        {
            a.c(produceFareEvent());
            if (h() && !l())
            {
                n = a(p.getUberLatLng(), o.getUberLatLng(), i, r);
                a.c(new fyl());
                return;
            }
        }
    }

    private boolean h()
    {
        return r != null && p != null && o != null && j != null && i();
    }

    private boolean i()
    {
        return !d.a(dbf.cK) || !m || f.l();
    }

    private boolean j()
    {
        if (a(h) && h())
        {
            RiderLocation riderlocation = RiderLocation.create(h.getPickupLocation());
            RiderLocation riderlocation1 = RiderLocation.create(h.getDestination());
            boolean flag = riderlocation.equals(p);
            boolean flag1 = riderlocation1.equals(o);
            boolean flag2 = h.getVehicleViewId().equals(r);
            if (h.getFareId().equals(j) && flag2 && flag && flag1)
            {
                return true;
            }
        }
        return false;
    }

    private boolean k()
    {
        boolean flag1 = true;
        if (i == null || !h())
        {
            flag1 = false;
        } else
        {
            Object obj = i.getUpfrontFare();
            UberLatLng uberlatlng = new UberLatLng(((UpfrontFare) (obj)).getOriginLat(), ((UpfrontFare) (obj)).getOriginLng());
            obj = new UberLatLng(((UpfrontFare) (obj)).getDestinationLat(), ((UpfrontFare) (obj)).getDestinationLng());
            String s = i.getVehicleViewId();
            boolean flag3 = uberlatlng.b(p.getUberLatLng());
            boolean flag2 = ((UberLatLng) (obj)).b(o.getUberLatLng());
            boolean flag;
            if (s != null && (s.equals(r) || s.equals(k) || s.equals(l)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag || !flag3 || !flag2)
            {
                return false;
            }
        }
        return flag1;
    }

    private boolean l()
    {
        long l1 = a(p.getUberLatLng(), o.getUberLatLng(), i, r);
        return n == l1;
    }

    public final void a()
    {
        n = -1L;
        i = null;
        g();
    }

    public final void a(FareInfo fareinfo)
    {
        i = fareinfo;
        a.c(produceFareEvent());
    }

    public final FareInfo b()
    {
        if (k())
        {
            return i;
        } else
        {
            return null;
        }
    }

    public final String c()
    {
        if (h == null)
        {
            return null;
        } else
        {
            return h.getFareEstimateString();
        }
    }

    public final UpfrontFare d()
    {
        if (k())
        {
            return i.getUpfrontFare();
        } else
        {
            return null;
        }
    }

    public final void e()
    {
        if (g == null || g.c())
        {
            g = c.d().c(new fqh(this, (byte)0));
        }
        a.a(this);
    }

    public final void f()
    {
        if (g != null && !g.c())
        {
            g.b();
        }
        a.b(this);
    }

    public final void onClientEvent(ClientEvent clientevent)
    {
        if (e.n())
        {
            return;
        } else
        {
            a(clientevent.getClient());
            return;
        }
    }

    public final void onDestinationChangedEvent(fyi fyi1)
    {
        UberLatLng uberlatlng1 = null;
        UberLatLng uberlatlng;
        if (o != null)
        {
            uberlatlng = o.getUberLatLng();
        } else
        {
            uberlatlng = null;
        }
        if (fyi1.a() != null)
        {
            uberlatlng1 = fyi1.a().getUberLatLng();
        }
        if (gjx.a(uberlatlng, uberlatlng1))
        {
            return;
        } else
        {
            o = fyi1.a();
            g();
            return;
        }
    }

    public final void onFareInfoEvent(FareInfoEvent fareinfoevent)
    {
        if (fareinfoevent.getFareInfo() == null)
        {
            return;
        } else
        {
            i = fareinfoevent.getFareInfo();
            fareinfoevent = produceFareEvent();
            a.c(fareinfoevent);
            return;
        }
    }

    public final void onPinLocationEvent(daq daq1)
    {
        if (p != null && p.getUberLatLng().equals(daq1.a().getUberLatLng()))
        {
            return;
        } else
        {
            p = daq1.a();
            g();
            return;
        }
    }

    public final void onTripUiStateChanged(fzc fzc1)
    {
        int i1 = fzc1.b();
        if (i1 != q && i1 == 3)
        {
            n = 0L;
            g();
        }
        q = i1;
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
            Object obj = b.e();
            long l1;
            boolean flag;
            boolean flag1;
            if (obj != null)
            {
                obj = ((Eyeball) (obj)).getDynamicFares();
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                dynamicfare = (DynamicFare)((Map) (obj)).get(s);
            }
            if (dynamicfare != null)
            {
                l1 = dynamicfare.getFareId();
            } else
            {
                l1 = 0L;
            }
            if (l1 > 0L)
            {
                obj = String.valueOf(l1);
            } else
            {
                obj = "";
            }
            flag = gjx.a(r, s);
            flag1 = gjx.a(j, obj);
            if (!flag || !flag1)
            {
                r = s;
                k = fzf1.getHijackVehicleViewId();
                l = fzf1.getLinkedVehicleViewId();
                j = ((String) (obj));
                m = fzf1.getAllowRidepool();
                g();
                return;
            }
        }
    }

    public final fyk produceFareEvent()
    {
        if (k())
        {
            return new fyk(i.getMetadata().getFormattedFare(), null, i.getMetadata().getTagline());
        }
        if (j())
        {
            return new fyk(h.getFareEstimateString(), h.getFareEstimateRange(), h.getFareEstimateTagline());
        } else
        {
            return new fyk(null, null, null);
        }
    }
}
