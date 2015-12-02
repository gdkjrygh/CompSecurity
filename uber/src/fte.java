// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.LocationSearchResult;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.event.NoPingEvent;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.ProductGroup;
import com.ubercab.rider.realtime.model.ReverseGeocode;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.rider.realtime.model.TripVehicle;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class fte
{

    private RiderLocation A;
    private final chp a;
    private final cyi b;
    private final cev c;
    private final Context d;
    private final hkr e;
    private final hku f;
    private final gmg g;
    private final evt h;
    private final ewh i;
    private final dkd j;
    private final dpg k;
    private final dak l;
    private final dal m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private String t;
    private boolean u;
    private boolean v;
    private int w;
    private icl x;
    private RiderLocation y;
    private RiderLocation z;

    public fte(chp chp1, cyi cyi1, cev cev1, Application application, hkr hkr1, hku hku1, evt evt1, 
            ewh ewh1, dkd dkd1, dpg dpg1, dak dak1, dal dal1, gmg gmg1)
    {
        t = "";
        w = 0x80000000;
        a = chp1;
        b = cyi1;
        c = cev1;
        d = application;
        e = hkr1;
        f = hku1;
        g = gmg1;
        h = evt1;
        i = ewh1;
        j = dkd1;
        k = dpg1;
        l = dak1;
        m = dal1;
    }

    private int a(ClientStatus clientstatus)
    {
        if (clientstatus != null)
        {
            clientstatus = clientstatus.getStatus();
        } else
        {
            clientstatus = null;
        }
        if (clientstatus == null)
        {
            return 0x80000000;
        }
        if (s)
        {
            clientstatus = "Dispatching";
        }
        clientstatus.hashCode();
        JVM INSTR lookupswitch 4: default 80
    //                   -1978426120: 143
    //                   -1929061692: 157
    //                   -1561136888: 129
    //                   2014441667: 115;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        byte byte0 = -1;
_L12:
        byte0;
        JVM INSTR tableswitch 0 3: default 112
    //                   0 171
    //                   1 243
    //                   2 245
    //                   3 309;
           goto _L6 _L7 _L8 _L9 _L10
_L6:
        return 0x80000000;
_L5:
        if (!clientstatus.equals("Looking")) goto _L1; else goto _L11
_L11:
        byte0 = 0;
          goto _L12
_L4:
        if (!clientstatus.equals("Dispatching")) goto _L1; else goto _L13
_L13:
        byte0 = 1;
          goto _L12
_L2:
        if (!clientstatus.equals("WaitingForPickup")) goto _L1; else goto _L14
_L14:
        byte0 = 2;
          goto _L12
_L3:
        if (!clientstatus.equals("OnTrip")) goto _L1; else goto _L15
_L15:
        byte0 = 3;
          goto _L12
_L7:
        if (u && h.g())
        {
            return 1;
        }
        if (u && i.a(w))
        {
            return 2;
        }
        u = false;
        if (p)
        {
            return !o() ? 3 : 4;
        } else
        {
            c(false);
            return 0;
        }
_L8:
        return 4;
_L9:
        clientstatus = e.f();
        String s1;
        if (clientstatus != null)
        {
            clientstatus = clientstatus.getDriver();
        } else
        {
            clientstatus = null;
        }
        if (clientstatus != null)
        {
            s1 = clientstatus.getStatus();
        } else
        {
            s1 = null;
        }
        if (clientstatus != null && s1 != null)
        {
            return !"Arrived".equals(s1) ? 5 : 6;
        }
          goto _L6
_L10:
        return 7;
          goto _L12
    }

    private static VehicleView a(Map map, String s1, List list)
    {
        if (TextUtils.isEmpty(s1) || map == null || map.isEmpty() || list == null)
        {
            return null;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            VehicleView vehicleview = (VehicleView)map.get((String)list.next());
            if (vehicleview != null && s1.equals(vehicleview.getProductGroupUuid()))
            {
                return vehicleview;
            }
        }

        return null;
    }

    static dpg a(fte fte1)
    {
        return fte1.k;
    }

    private void a(City city)
    {
        String s1 = m.D();
        if (city.findVehicleViewById(s1) != null)
        {
            m.g(s1);
            return;
        } else
        {
            city = city.getDefaultVehicleViewId();
            m.g(city);
            return;
        }
    }

    private void a(City city, ProductGroup productgroup)
    {
        t = productgroup.getGroupType();
        String s1 = productgroup.getUuid();
        city = city.findVehicleViewById(m());
        boolean flag;
        if (city == null || TextUtils.isEmpty(s1) || !s1.equals(city.getProductGroupUuid()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            m.g("");
            a(productgroup, t);
            c.c(produceTripUiStateChangedEvent());
        }
    }

    private void a(City city, Trip trip, String s1)
    {
        ProductGroup productgroup = city.findFirstProductGroupByType(s1);
        if (productgroup != null)
        {
            a(productgroup);
            return;
        }
        if (b(s1))
        {
            c("");
            return;
        } else
        {
            m.B();
            t = "";
            b(city, trip);
            return;
        }
    }

    private void a(ProductGroup productgroup, City city)
    {
        productgroup = a(city.getVehicleViews(), productgroup.getUuid(), city.getVehicleViewsOrder());
        if (productgroup != null)
        {
            m.g(productgroup.getId());
            return;
        } else
        {
            m.g("");
            return;
        }
    }

    private void a(Trip trip)
    {
        boolean flag1 = true;
        RiderLocation riderlocation = i();
        z = null;
        n = 0x80000000;
        if (trip.getDestination() != null)
        {
            trip = trip.getDestination();
            RiderLocation riderlocation1 = RiderLocation.create(trip);
            if (!riderlocation1.equals(A))
            {
                boolean flag;
                if (!TextUtils.isEmpty(trip.getLanguage()) && !Locale.getDefault().getLanguage().equalsIgnoreCase(trip.getLanguage()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (TextUtils.isEmpty(trip.getReference()) || TextUtils.isEmpty(trip.getReferenceType()))
                {
                    flag1 = false;
                }
                if (flag && flag1)
                {
                    if (A == null || !gjx.a(A.getReference(), trip.getReference()))
                    {
                        riderlocation1 = RiderLocation.create(new UberLatLng(trip.getLatitude(), trip.getLongitude()));
                        riderlocation1.setReference(trip.getReference(), trip.getReferenceType());
                        riderlocation1.setTitle(null);
                        A = riderlocation1;
                        j.a(trip.getReference(), trip.getReferenceType());
                    }
                } else
                {
                    A = riderlocation1;
                }
            }
        } else
        {
            A = null;
        }
        t();
        if (!gjx.a(riderlocation, i()))
        {
            c.c(produceDestinationChangedEvent());
        }
    }

    static void a(fte fte1, Trip trip)
    {
        fte1.a(trip);
    }

    public static boolean a(int i1)
    {
        return i1 == 0 || i1 == 1 || i1 == 2 || i1 == 3 || i1 == 4;
    }

    private boolean a(ProductGroup productgroup, String s1)
    {
        City city = e.b();
        boolean flag;
        if (city != null && city.getVehicleViews() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return false;
        }
        if (a(s1))
        {
            m.f(m.E());
        }
        if (!a(t))
        {
            a(productgroup, city);
        } else
        {
            a(city);
        }
        v();
        c.c(produceVehicleViewSelectedEvent());
        return true;
    }

    public static boolean a(String s1)
    {
        return "".equals(s1) || "ride".equals(s1);
    }

    private static boolean a(Map map, String s1)
    {
label0:
        {
            if (TextUtils.isEmpty(s1))
            {
                break label0;
            }
            map = map.values().iterator();
            do
            {
                if (!map.hasNext())
                {
                    break label0;
                }
            } while (!s1.equals(((VehicleView)map.next()).getLinkedVehicleViewId()));
            return true;
        }
        return false;
    }

    static RiderLocation b(fte fte1)
    {
        fte1.A = null;
        return null;
    }

    private void b(City city, Trip trip)
    {
        if (city != null && city.getProductGroups() != null && !city.getProductGroups().isEmpty())
        {
            a((ProductGroup)city.getProductGroups().get(0));
            return;
        } else
        {
            c(city, trip);
            c.c(produceTripUiStateChangedEvent());
            return;
        }
    }

    public static boolean b(int i1)
    {
        return i1 == 4 || i1 == 5 || i1 == 6 || i1 == 7;
    }

    public static boolean b(String s1)
    {
        return "eats".equals(s1);
    }

    private void c(City city, Trip trip)
    {
        String s1 = m.E();
        if (trip != null && trip.getVehicle() != null)
        {
            trip = trip.getVehicle().getVehicleViewId();
        } else
        {
            trip = null;
        }
        if (!TextUtils.isEmpty(trip) && !trip.equals(s1))
        {
            m.g(trip);
            c.c(produceVehicleViewSelectedEvent());
        } else
        if (city != null && city.getVehicleViews() != null && (city.findVehicleViewById(s1) == null || a(city.getVehicleViews(), s1)))
        {
            m.g(city.getDefaultVehicleViewId());
            c.c(produceVehicleViewSelectedEvent());
            if (p)
            {
                r();
                return;
            }
        }
    }

    public static boolean c(int i1)
    {
        return i1 == 5 || i1 == 6 || i1 == 7;
    }

    static boolean c(fte fte1)
    {
        fte1.s = false;
        return false;
    }

    public static boolean d(int i1)
    {
        return i1 == 0;
    }

    private boolean d(String s1)
    {
        City city = e.b();
        if (city != null)
        {
            s1 = city.findVehicleViewById(s1);
        } else
        {
            s1 = null;
        }
        return s1 != null && s1.getAllowRidepool();
    }

    public static boolean e(int i1)
    {
        return i1 == 3;
    }

    public static boolean f(int i1)
    {
        return i1 == 2;
    }

    public static boolean g(int i1)
    {
        return i1 == 0x80000000;
    }

    private String u()
    {
        return m.C();
    }

    private void v()
    {
        String s1;
        if (b.a())
        {
            s1 = "product_detail_shown";
        } else
        {
            s1 = "product_detail_hidden";
        }
        a.a(AnalyticsEvent.create("impression").setName(l.fp).setValue(s1));
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            p = bundle.getBoolean("com.ubercab.HAS_SELECTED_VEHICLE", false);
            u = bundle.getBoolean("com.ubercab.IS_SELECTING_LOCATION", false);
            o = bundle.getBoolean("com.ubercab.FARE_DETAILS_SHOWING", false);
            s = bundle.getBoolean("com.ubercab.PICKUP_REQUEST_PENDING", false);
            z = (RiderLocation)bundle.getParcelable("com.ubercab.LOCATION_DESTINATION_PRE_TRIP");
            n = bundle.getInt("com.ubercab.CAPACITY_SELECTION", 0x80000000);
            q = bundle.getBoolean("com.ubercab.ONE_TAP_ENABLED", false);
        }
    }

    public final void a(RiderLocation riderlocation)
    {
        z = riderlocation;
        m.b(riderlocation);
        c.c(produceDestinationChangedEvent());
    }

    final void a(City city, Trip trip)
    {
        if (!d(w) && !g(w) || city == null)
        {
            c(city, trip);
            return;
        }
        Object obj = u();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            b(city, trip);
            return;
        }
        obj = city.findProductGroupByUuid(((String) (obj)));
        if (obj != null)
        {
            a(city, ((ProductGroup) (obj)));
            return;
        } else
        {
            a(city, trip, t);
            return;
        }
    }

    public final void a(boolean flag)
    {
        o = flag;
    }

    public final void a(boolean flag, Boolean boolean1)
    {
        u = flag;
        if (boolean1 != null && boolean1.booleanValue() != p)
        {
            d(boolean1.booleanValue());
            return;
        } else
        {
            t();
            return;
        }
    }

    public final boolean a()
    {
        Object obj;
        if (w == 3)
        {
            if ((obj = e.b()) != null && ((obj = ((City) (obj)).findVehicleViewById(m())) != null && ((VehicleView) (obj)).getLinkedVehicleViewId() == null))
            {
                if (((VehicleView) (obj)).getHijackVehicleViewId() != null && g.a(dbf.c))
                {
                    return true;
                }
                if ("FareEstimateTagline".equals(((VehicleView) (obj)).getConfirmationType()) || ((VehicleView) (obj)).getAllowRidepool())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(ProductGroup productgroup)
    {
        if ((d(w) || g(w)) && productgroup != null)
        {
            String s1 = t;
            t = productgroup.getGroupType();
            m.e(productgroup.getUuid());
            a(productgroup, s1);
            c.c(produceProductGroupSelectedEvent());
            c.c(produceTripUiStateChangedEvent());
            return true;
        } else
        {
            return false;
        }
    }

    public final void b(Bundle bundle)
    {
        bundle.putBoolean("com.ubercab.HAS_SELECTED_VEHICLE", p);
        bundle.putBoolean("com.ubercab.IS_SELECTING_LOCATION", u);
        bundle.putBoolean("com.ubercab.FARE_DETAILS_SHOWING", o);
        bundle.putBoolean("com.ubercab.PICKUP_REQUEST_PENDING", s);
        bundle.putParcelable("com.ubercab.LOCATION_DESTINATION_PRE_TRIP", z);
        bundle.putInt("com.ubercab.CAPACITY_SELECTION", n);
        bundle.putBoolean("com.ubercab.ONE_TAP_ENABLED", q);
    }

    public final void b(RiderLocation riderlocation)
    {
        y = riderlocation;
        m.b(riderlocation);
        c.c(produceDestinationChangedEvent());
    }

    public final void b(boolean flag)
    {
        r = flag;
    }

    public final boolean b()
    {
        Object obj;
        obj = l.b();
        break MISSING_BLOCK_LABEL_8;
        if (obj != null && ((RiderLocation) (obj)).hasReverseGeocodeData())
        {
            obj = ((RiderLocation) (obj)).getUberLatLng();
            if (obj != null)
            {
                Object obj1 = e.e();
                if (obj1 != null)
                {
                    obj1 = ((Eyeball) (obj1)).getReverseGeocode();
                    if (obj1 == null)
                    {
                        return true;
                    } else
                    {
                        return (new UberLatLng(((ReverseGeocode) (obj1)).getLatitude(), ((ReverseGeocode) (obj1)).getLongitude())).b(((UberLatLng) (obj)));
                    }
                }
            }
        }
        return false;
    }

    public final void c(String s1)
    {
        v();
        m.g(s1);
        c.c(produceVehicleViewSelectedEvent());
        c.c(produceTripUiStateChangedEvent());
    }

    public final void c(boolean flag)
    {
        q = flag;
    }

    public final boolean c()
    {
        return o;
    }

    public final void d()
    {
        if (!v)
        {
            w = a(e.d());
            x = f.i().a(ica.a(f.b(), f.e(), f.h(), new ftg((byte)0)), new idj() {

                final fte a;

                private static ftg a(ftg ftg1)
                {
                    return ftg1;
                }

                public final volatile Object a(Object obj, Object obj1)
                {
                    return a((ftg)obj1);
                }

            
            {
                a = fte.this;
                super();
            }
            }).a(ico.a()).c(new ftf(this, (byte)0));
            c.a(this);
            v = true;
            a(e.b(), e.f());
        }
    }

    public final void d(boolean flag)
    {
        Object obj = e.b();
        if (obj != null)
        {
            obj = ((City) (obj)).findVehicleViewById(m());
        } else
        {
            obj = null;
        }
        if (flag && obj == null)
        {
            return;
        } else
        {
            p = flag;
            t();
            return;
        }
    }

    public final void e()
    {
        if (v)
        {
            c.b(this);
            if (x != null)
            {
                x.b();
            }
            v = false;
        }
    }

    public final void e(boolean flag)
    {
        s = flag;
        t();
    }

    public final String f()
    {
        return t;
    }

    public final int g()
    {
        return w;
    }

    public final RiderLocation h()
    {
        Object obj = e.f();
        if (obj != null) goto _L2; else goto _L1
_L1:
        RiderLocation riderlocation = l.b();
_L4:
        return riderlocation;
_L2:
        riderlocation = m.G();
        obj = ((Trip) (obj)).getPickupLocation();
        UberLatLng uberlatlng;
        if (obj != null)
        {
            obj = RiderLocation.create(((Location) (obj)));
        } else
        {
            obj = null;
        }
        if (riderlocation == null || obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        uberlatlng = riderlocation.getUberLatLng();
        if (riderlocation.hasReverseGeocodeData() && uberlatlng != null && uberlatlng.equals(((RiderLocation) (obj)).getUberLatLng())) goto _L4; else goto _L3
_L3:
        return ((RiderLocation) (obj));
    }

    public final void h(int i1)
    {
        n = i1;
    }

    public final RiderLocation i()
    {
        if (e.f() != null) goto _L2; else goto _L1
_L1:
        RiderLocation riderlocation = z;
_L4:
        return riderlocation;
_L2:
        UberLatLng uberlatlng;
        if (y != null)
        {
            return y;
        }
        riderlocation = m.H();
        if (riderlocation == null || A == null)
        {
            break; /* Loop/switch isn't completed */
        }
        uberlatlng = riderlocation.getUberLatLng();
        if (riderlocation.hasReverseGeocodeData() && uberlatlng != null && uberlatlng.equals(A.getUberLatLng())) goto _L4; else goto _L3
_L3:
        return A;
    }

    public final boolean j()
    {
        return i() != null;
    }

    public final int k()
    {
        return n;
    }

    public final boolean l()
    {
        return k() > 0;
    }

    public final String m()
    {
        return m.E();
    }

    public final boolean n()
    {
        return r;
    }

    public final boolean o()
    {
        while (!m.k() || q || h.g() || !a(f()) || d(m()) || era.a(e.c())) 
        {
            return false;
        }
        return g.a(dbf.bZ);
    }

    public final void onLocationDetailResponseEvent(dmd dmd1)
    {
        if (A == null || !gjx.a(dmd1.a(), A.getReference()))
        {
            return;
        }
        if (!dmd1.i())
        {
            A.setTitle(d.getString(0x7f0701d6));
            return;
        } else
        {
            A.update((LocationSearchResult)dmd1.g());
            m.b(A);
            c.c(produceDestinationChangedEvent());
            return;
        }
    }

    public final void onNoPingEvent(NoPingEvent nopingevent)
    {
        if (k.n())
        {
            return;
        } else
        {
            t();
            return;
        }
    }

    public final void onPickupCancelClientResponseEvent(dmp dmp)
    {
        e(false);
    }

    public final void onPickupResponseEvent(dmq dmq)
    {
        s = false;
    }

    public final void onPinLocationEvent(daq daq1)
    {
        m.a(daq1.a());
    }

    public final void onPingEvent(dar dar1)
    {
        if (k.n())
        {
            return;
        }
        Object obj = dar1.a();
        if (!k.l())
        {
            s = false;
        }
        if (obj == null || ((Ping) (obj)).getClient() == null || TextUtils.isEmpty(((Ping) (obj)).getClient().getUuid()) || !"Looking".equals(((Ping) (obj)).getClient().getStatus()))
        {
            r();
        }
        if (obj == null)
        {
            dar1 = null;
        } else
        {
            dar1 = ((Ping) (obj)).getCity();
        }
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((Ping) (obj)).getTrip();
        }
        a(dar1, ((Trip) (obj)));
        if (obj == null)
        {
            A = null;
            t();
            return;
        } else
        {
            a(((Trip) (obj)));
            return;
        }
    }

    public final void onSetDestinationResponseEvent(dnf dnf)
    {
        y = null;
        c.c(produceDestinationChangedEvent());
    }

    public final boolean p()
    {
        while (a() && j() || w == 2 || !drd.a(e.d()) || b(w)) 
        {
            return false;
        }
        return true;
    }

    public final fyi produceDestinationChangedEvent()
    {
        return new fyi(i());
    }

    public final fyu produceProductGroupSelectedEvent()
    {
        return new fyu(t, m.C(), m.E());
    }

    public final fzc produceTripUiStateChangedEvent()
    {
        return new fzc(t, w);
    }

    public final fzf produceVehicleViewSelectedEvent()
    {
        String s1 = m.E();
        if (s1 != null)
        {
            return new fzf(s1);
        } else
        {
            return null;
        }
    }

    public final void q()
    {
        A = null;
        z = null;
        y = null;
        c.c(produceDestinationChangedEvent());
    }

    public final void r()
    {
        u = false;
        d(false);
    }

    public final void s()
    {
        u = false;
        d(true);
    }

    final void t()
    {
        int i1 = w;
        w = a(e.d());
        if (i1 != w)
        {
            c.c(produceTripUiStateChangedEvent());
        }
    }
}
