// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.text.TextUtils;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.NearbyVehicle;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.rider.realtime.model.TripDriverLocation;
import com.ubercab.rider.realtime.model.TripVehicle;
import com.ubercab.rider.realtime.model.VehiclePathPoint;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class gca extends ees
    implements fzm
{

    final Map a = new ConcurrentHashMap();
    boolean b;
    private final Application c;
    private final dqt d;
    private final cjf e;
    private final cev f;
    private final gju g;
    private final hkr h;
    private final hku i;
    private final gmg j;
    private final evt k;
    private final cjn l;
    private final fzl m;
    private final cgh n;
    private final hzb o;
    private final dpg p;
    private final czf q;
    private final dal r;
    private final fte s;
    private boolean t;
    private boolean u;
    private icl v;

    public gca(Application application, dqt dqt, cjf cjf, cev cev1, gju gju1, hkr hkr1, hku hku1, 
            gmg gmg1, evt evt1, cjn cjn, fzl fzl1, cgh cgh, hzb hzb, dpg dpg1, 
            czf czf1, dal dal1, fte fte1)
    {
        b = false;
        c = application;
        d = dqt;
        e = cjf;
        f = cev1;
        g = gju1;
        h = hkr1;
        i = hku1;
        j = gmg1;
        k = evt1;
        l = cjn;
        m = fzl1;
        n = cgh;
        o = hzb;
        p = dpg1;
        q = czf1;
        r = dal1;
        s = fte1;
    }

    static dqt a(gca gca1)
    {
        return gca1.d;
    }

    private gby a(Trip trip)
    {
        Object obj = trip.getVehicle();
        if (obj == null)
        {
            return null;
        }
        String s1 = ((TripVehicle) (obj)).getVehicleViewId();
        if (s1 == null)
        {
            if (!b)
            {
                trip = (new StringBuilder("jbb_T100427 : Null Vehicle View Id on trip: ")).append(trip.getUuid()).toString();
                obj = new NullPointerException(trip);
                ijg.a(dbf.bN.name()).b(((Throwable) (obj)), trip, new Object[0]);
                b = true;
            }
            return null;
        }
        trip = (Map)a.get(s1);
        obj = ((TripVehicle) (obj)).getUuid();
        if (trip != null)
        {
            return (gby)trip.get(obj);
        } else
        {
            return null;
        }
    }

    private Long a(Trip trip, String s1)
    {
        if (trip != null && !TextUtils.isEmpty(s1) && !"Looking".equals(s1))
        {
            if ((trip = a(trip)) != null)
            {
                return trip.e();
            }
        }
        return null;
    }

    private void a(City city, Trip trip)
    {
        List list = null;
        if (trip != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1;
        String s2;
        Object obj;
        obj = trip.getVehicle();
        Iterator iterator;
        if (obj != null)
        {
            s1 = ((TripVehicle) (obj)).getVehicleViewId();
        } else
        {
            s1 = null;
        }
        if (obj != null)
        {
            s2 = ((TripVehicle) (obj)).getUuid();
        } else
        {
            s2 = null;
        }
        for (iterator = a.keySet().iterator(); iterator.hasNext();)
        {
            Object obj1 = (String)iterator.next();
            if (!((String) (obj1)).equals(s1))
            {
                b(((String) (obj1)));
                a.remove(obj1);
            } else
            {
                obj1 = (Map)a.get(obj1);
                Iterator iterator1 = ((Map) (obj1)).keySet().iterator();
                while (iterator1.hasNext()) 
                {
                    String s3 = (String)iterator1.next();
                    if (!s3.equals(s2))
                    {
                        ((gby)((Map) (obj1)).get(s3)).a(true);
                        iterator1.remove();
                    }
                }
            }
        }

        if (obj != null)
        {
            list = ((TripVehicle) (obj)).getVehiclePath();
        }
        if (list != null)
        {
            obj = list;
            if (list.size() != 0)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        trip = trip.getDriver();
        if (trip == null || trip.getLocation() == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        trip = trip.getLocation();
        trip = new UberLatLng(trip.getLatitude(), trip.getLongitude());
        obj = Arrays.asList(new VehiclePathPoint[] {
            new com.ubercab.client.core.model.VehiclePathPoint(gju.a(), trip, 0.0F)
        });
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        a(city, s1, s2, ((List) (obj)), true, true);
        return;
    }

    private void a(City city, String s1, String s2, List list, boolean flag, boolean flag1)
    {
        if (city != null && city.findVehicleViewById(s1) != null)
        {
            if (!a.containsKey(s1))
            {
                a.put(s1, new ConcurrentHashMap());
            }
            boolean flag2 = j.a(dbf.bJ);
            Map map = (Map)a.get(s1);
            Object obj = (gby)map.get(s2);
            if (obj == null)
            {
                city = city.findVehicleViewById(s1);
                s1 = c;
                obj = n;
                cjn cjn = l;
                cjf cjf = e;
                hzb hzb = o;
                gju gju1 = g;
                if (flag1 && flag2)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                city = new gby(s1, ((cgh) (obj)), city, s2, list, cjn, cjf, hzb, gju1, flag1);
                map.put(s2, city);
            } else
            {
                ((gby) (obj)).a(list);
                city = ((City) (obj));
            }
            if (flag && !city.a())
            {
                city.d();
                return;
            }
        }
    }

    private void a(City city, Map map)
    {
        if (map == null || map.isEmpty())
        {
            a(true);
            a.clear();
        } else
        {
            a(map);
            if (city != null)
            {
                Iterator iterator = map.keySet().iterator();
                while (iterator.hasNext()) 
                {
                    String s1 = (String)iterator.next();
                    if (city.findVehicleViewById(s1) != null)
                    {
                        Map map1 = ((NearbyVehicle)map.get(s1)).getVehiclePaths();
                        if (map1 != null)
                        {
                            Iterator iterator1 = map1.keySet().iterator();
                            while (iterator1.hasNext()) 
                            {
                                String s2 = (String)iterator1.next();
                                a(city, s1, s2, (List)map1.get(s2), false, false);
                            }
                        }
                    }
                }
            }
        }
    }

    private void a(City city, Map map, Trip trip, String s1)
    {
        switch (s.g())
        {
        default:
            return;

        case -2147483648: 
        case 0: // '\0'
        case 3: // '\003'
            a(city, map);
            a(r.E());
            return;

        case 4: // '\004'
            a(true);
            return;

        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            a(city, trip);
            break;
        }
        k.a(a(trip, s1));
    }

    static void a(gca gca1, City city, Map map, Trip trip, String s1)
    {
        gca1.a(city, map, trip, s1);
    }

    private void a(String s1)
    {
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext();)
        {
            String s2 = (String)iterator.next();
            if (!s1.equals(s2) && !u)
            {
                b(s2);
            } else
            {
                c(s2);
            }
        }

    }

    private void a(Map map)
    {
        Object obj = new HashSet();
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext();)
        {
            Object obj1 = (String)iterator.next();
            if (!map.containsKey(obj1) || ((NearbyVehicle)map.get(obj1)).getVehiclePaths() == null)
            {
                b(((String) (obj1)));
                ((Set) (obj)).add(obj1);
            } else
            {
                Map map1 = (Map)a.get(obj1);
                obj1 = ((NearbyVehicle)map.get(obj1)).getVehiclePaths();
                HashSet hashset = new HashSet();
                Iterator iterator1 = map1.keySet().iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    String s1 = (String)iterator1.next();
                    if (!((Map) (obj1)).containsKey(s1))
                    {
                        ((gby)map1.get(s1)).a(true);
                        hashset.add(s1);
                    }
                } while (true);
                obj1 = hashset.iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    map1.remove((String)((Iterator) (obj1)).next());
                }
            }
        }

        for (map = ((Set) (obj)).iterator(); map.hasNext(); a.remove(obj))
        {
            obj = (String)map.next();
        }

    }

    private void a(boolean flag)
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((Map)iterator.next()).values().iterator();
            while (iterator1.hasNext()) 
            {
                gby gby1 = (gby)iterator1.next();
                if (gby1.a())
                {
                    gby1.a(flag);
                }
            }
        }

    }

    private void b(String s1)
    {
        if (a.containsKey(s1))
        {
            s1 = ((Map)a.get(s1)).values().iterator();
            while (s1.hasNext()) 
            {
                gby gby1 = (gby)s1.next();
                if (gby1.a())
                {
                    gby1.a(true);
                }
            }
        }
    }

    static boolean b(gca gca1)
    {
        return gca1.t;
    }

    private void c(String s1)
    {
        if (a.containsKey(s1))
        {
            s1 = ((Map)a.get(s1)).values().iterator();
            while (s1.hasNext()) 
            {
                gby gby1 = (gby)s1.next();
                if (!gby1.a())
                {
                    gby1.d();
                }
            }
        }
    }

    private void g()
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((Map)iterator.next()).values().iterator();
            while (iterator1.hasNext()) 
            {
                gby gby1 = (gby)iterator1.next();
                if (gby1.a())
                {
                    gby1.c();
                }
            }
        }

    }

    public final UberLatLng A_()
    {
        Object obj = h.f();
        if (obj == null)
        {
            return null;
        }
        Object obj1 = ((Trip) (obj)).getVehicle();
        obj = ((TripVehicle) (obj1)).getVehicleViewId();
        obj1 = ((TripVehicle) (obj1)).getUuid();
        if (obj == null)
        {
            return null;
        }
        obj = (Map)a.get(obj);
        if (obj == null)
        {
            return null;
        }
        if (obj1 == null)
        {
            return null;
        }
        obj = (gby)((Map) (obj)).get(obj1);
        if (obj == null)
        {
            return null;
        } else
        {
            return ((gby) (obj)).b();
        }
    }

    public final List a()
    {
        return null;
    }

    public final void e()
    {
        m.a(this);
        u = q.o();
        f.a(this);
        if (v != null && !v.c())
        {
            v.b();
        }
        v = ica.a(i.b(), i.e(), i.g(), i.h(), new gcc((byte)0)).a(ico.a()).c(new gcb(this, (byte)0));
    }

    public final void f()
    {
        a(false);
        m.a(null);
        f.b(this);
        if (v != null)
        {
            v.b();
            v = null;
        }
    }

    public final void onPauseVehicleAnimationsEvent(gcd gcd)
    {
        t = true;
        g();
    }

    public final void onPingEvent(dar dar1)
    {
        if (!p.n())
        {
            Ping ping = dar1.a();
            gby.a(ping.getMapFittingMobileAppDelayWindowMs());
            if (!t)
            {
                Map map = ping.getNearbyVehicles();
                dar1 = ping.getClient();
                if (dar1 == null || TextUtils.isEmpty(dar1.getUuid()))
                {
                    dar1 = null;
                } else
                {
                    dar1 = dar1.getStatus();
                }
                a(ping.getCity(), map, ping.getTrip(), dar1);
                return;
            }
        }
    }

    public final void onResumeVehicleAnimationsEvent(gce gce)
    {
        String s1 = null;
        t = false;
        ClientStatus clientstatus = h.d();
        gce = h.e();
        if (gce == null)
        {
            gce = null;
        } else
        {
            gce = gce.getNearbyVehicles();
        }
        if (clientstatus != null)
        {
            s1 = clientstatus.getStatus();
        }
        a(h.b(), gce, h.f(), s1);
    }

    public final void onVehicleViewEvent(fzf fzf1)
    {
        Object obj = h.d();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((ClientStatus) (obj)).getStatus();
        }
        if ("Looking".equals(obj))
        {
            a(fzf1.a());
        }
    }
}
