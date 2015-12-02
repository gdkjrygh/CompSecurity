// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.location.UberLatLngBounds;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.Ping;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.DynamicPickup;
import com.ubercab.rider.realtime.model.DynamicPickupsResponse;
import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ewm
{

    static final boolean d;
    private int A;
    private UberLatLng B;
    private Trip C;
    private boolean D;
    private Integer E;
    private icl F;
    UberLatLng a;
    UberLatLng b;
    boolean c;
    private final chp e;
    private final cev f;
    private final Context g;
    private final evk h;
    private final hkd i;
    private final gmg j;
    private final fwd k;
    private final List l = new CopyOnWriteArrayList();
    private final List m = new CopyOnWriteArrayList();
    private final List n = new CopyOnWriteArrayList();
    private final List o = new CopyOnWriteArrayList();
    private final hkr p;
    private final hku q;
    private final fte r;
    private cjq s;
    private List t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public ewm(Context context, chp chp1, cev cev1, hkr hkr1, hku hku1, evk evk1, hkd hkd1, 
            gmg gmg1, fwd fwd1, fte fte1)
    {
        g = (Context)gjz.a(context);
        e = (chp)gjz.a(chp1);
        f = (cev)gjz.a(cev1);
        p = (hkr)gjz.a(hkr1);
        q = (hku)gjz.a(hku1);
        h = (evk)gjz.a(evk1);
        i = (hkd)gjz.a(hkd1);
        j = (gmg)gjz.a(gmg1);
        k = (fwd)gjz.a(fwd1);
        r = (fte)gjz.a(fte1);
    }

    private static UberLatLng a(Location location)
    {
        return new UberLatLng(location.getLatitude(), location.getLongitude());
    }

    private static UberLatLngBounds a(UberLatLng uberlatlng, int i1)
    {
        UberLatLng uberlatlng1 = ecx.a(uberlatlng, i1, 90F);
        uberlatlng = ecx.a(uberlatlng, i1, 270F);
        return (new ciq()).a(uberlatlng1).a(uberlatlng).a();
    }

    private static Integer a(DynamicPickupsResponse dynamicpickupsresponse)
    {
        return dynamicpickupsresponse.getMaximumWalkingRadius();
    }

    private void a(UberLatLng uberlatlng)
    {
        boolean flag = b(uberlatlng);
        if (z != flag)
        {
            if (!flag)
            {
                z = false;
                t.clear();
                for (uberlatlng = l.iterator(); uberlatlng.hasNext(); ((ewr)uberlatlng.next()).v_()) { }
            } else
            {
                z = true;
                ewr ewr1;
                for (uberlatlng = l.iterator(); uberlatlng.hasNext(); ewr1.u_())
                {
                    ewr1 = (ewr)uberlatlng.next();
                    E.intValue();
                }

            }
        }
    }

    private void a(UberLatLng uberlatlng, int i1, DynamicPickupsResponse dynamicpickupsresponse)
    {
        gjz.a(dynamicpickupsresponse);
        if (dynamicpickupsresponse.getPickupLocations() == null)
        {
            ijg.d("Got response with no pickup locations.", new Object[0]);
        } else
        {
            E = a(dynamicpickupsresponse);
            h.a(uberlatlng, i1, dynamicpickupsresponse);
            dynamicpickupsresponse = new CopyOnWriteArrayList(dynamicpickupsresponse.getPickupLocations().getFeatures());
            if (D && gjx.a(a, uberlatlng))
            {
                a(((List) (dynamicpickupsresponse)), uberlatlng);
                a(a);
                return;
            }
        }
    }

    private void a(Trip trip)
    {
        C = trip;
        if (C != null && l())
        {
            if (C.getDynamicPickup() != null && C.getDynamicPickup().getOriginalPickupLocation() != null)
            {
                B = a(C.getDynamicPickup().getOriginalPickupLocation());
            }
            trip = o.iterator();
            while (trip.hasNext()) 
            {
                ((ewo)trip.next()).i();
            }
        }
    }

    static void a(ewm ewm1, UberLatLng uberlatlng, int i1, DynamicPickupsResponse dynamicpickupsresponse)
    {
        ewm1.a(uberlatlng, i1, dynamicpickupsresponse);
    }

    static void a(ewm ewm1, Trip trip)
    {
        ewm1.a(trip);
    }

    private void a(List list, UberLatLng uberlatlng)
    {
        if (!d && E == null)
        {
            throw new AssertionError();
        }
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.ubercab.rider.realtime.model.DynamicPickupsResponse.PickupLocation pickuplocation = (com.ubercab.rider.realtime.model.DynamicPickupsResponse.PickupLocation)iterator.next();
            if (fwd.a(uberlatlng, ecx.a(pickuplocation)) >= (double)E.intValue())
            {
                list.remove(pickuplocation);
            }
        } while (true);
        if (t == null || !a.equals(b) || a(t, list))
        {
            t = list;
            list = m.iterator();
            while (list.hasNext()) 
            {
                ((ewp)list.next()).l();
            }
        }
    }

    private static boolean a(City city, String s1)
    {
        if (city != null)
        {
            if ((city = city.findVehicleViewById(s1)) != null && city.getAllowRidepool())
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(List list, List list1)
    {
        if (list1.size() > list.size())
        {
            return true;
        }
        for (list1 = list1.iterator(); list1.hasNext();)
        {
            if (!list.contains((com.ubercab.rider.realtime.model.DynamicPickupsResponse.PickupLocation)list1.next()))
            {
                return true;
            }
        }

        return false;
    }

    private boolean b(UberLatLng uberlatlng)
    {
        return uberlatlng != null && E != null && D && h.a(uberlatlng, E.intValue()) && h.a(uberlatlng, E.intValue()) != null;
    }

    private void c(UberLatLng uberlatlng)
    {
        i.a(uberlatlng.a(), uberlatlng.b()).a(ico.a()).b(new ick(uberlatlng) {

            final UberLatLng a;
            final int b = 500;
            final ewm c;

            private void a(DynamicPickupsResponse dynamicpickupsresponse)
            {
                gjz.a(dynamicpickupsresponse);
                ewm.a(c, a, b, dynamicpickupsresponse);
            }

            public final void a()
            {
            }

            public final volatile void a(Object obj)
            {
                a((DynamicPickupsResponse)obj);
            }

            public final void a(Throwable throwable)
            {
            }

            
            {
                c = ewm.this;
                a = uberlatlng;
                super();
            }
        });
    }

    private boolean d(UberLatLng uberlatlng)
    {
        return E != null && uberlatlng != null && h.a(uberlatlng, E.intValue());
    }

    private boolean q()
    {
        if (a == null)
        {
            return false;
        }
        if (!d(a))
        {
            c(a);
            return false;
        }
        if (E != null)
        {
            java.util.Set set = h.a(a, E.intValue());
            if (set != null)
            {
                a(new ArrayList(set), a);
            }
        }
        return true;
    }

    private boolean r()
    {
        return v && r.j();
    }

    private void s()
    {
        if (v())
        {
            u();
        }
        w = false;
        v = false;
    }

    private void t()
    {
        if (r.j() && r.g() != 4)
        {
            y = true;
            for (Iterator iterator = n.iterator(); iterator.hasNext(); ((ewn)iterator.next()).h()) { }
        } else
        if (y)
        {
            y = false;
            u();
        }
        v = true;
        w = true;
    }

    private void u()
    {
        for (Iterator iterator = n.iterator(); iterator.hasNext(); ((ewn)iterator.next()).g()) { }
    }

    private boolean v()
    {
        return w && y;
    }

    private boolean w()
    {
        return D && l();
    }

    public final List a()
    {
        return t;
    }

    public final void a(int i1)
    {
        A = i1;
    }

    public final void a(cjg cjg)
    {
        if (s != null)
        {
            s.a(cjg);
        }
    }

    public final void a(cjq cjq1)
    {
        s = cjq1;
    }

    public final void a(ewn ewn1)
    {
        gjz.a(ewn1);
        n.add(ewn1);
    }

    public final void a(ewo ewo1)
    {
        gjz.a(ewo1);
        o.add(ewo1);
    }

    public final void a(ewp ewp1)
    {
        gjz.a(ewp1);
        m.add(ewp1);
    }

    public final void a(ewr ewr1)
    {
        gjz.a(ewr1);
        l.add(ewr1);
    }

    public final boolean a(List list)
    {
        if (t == null)
        {
            return true;
        } else
        {
            return a(list, t);
        }
    }

    public final void b()
    {
        if (w() && !r() && k() && !c)
        {
            c = true;
            Iterator iterator = m.iterator();
            while (iterator.hasNext()) 
            {
                ((ewp)iterator.next()).j();
            }
        }
    }

    public final void b(ewn ewn1)
    {
        gjz.a(ewn1);
        n.remove(ewn1);
    }

    public final void b(ewo ewo1)
    {
        gjz.a(ewo1);
        o.remove(ewo1);
    }

    public final void b(ewp ewp1)
    {
        gjz.a(ewp1);
        m.remove(ewp1);
    }

    public final void b(ewr ewr1)
    {
        gjz.a(ewr1);
        l.remove(ewr1);
    }

    public final void c()
    {
        if (w() && !r() && k())
        {
            Iterator iterator = m.iterator();
            while (iterator.hasNext()) 
            {
                ((ewp)iterator.next()).k();
            }
        }
    }

    public final void d()
    {
        if (c)
        {
            c = false;
        }
        for (Iterator iterator = m.iterator(); iterator.hasNext(); ((ewp)iterator.next()).l()) { }
    }

    public final double e()
    {
        if (E != null)
        {
            return (double)E.intValue();
        } else
        {
            return 0.0D;
        }
    }

    public final void f()
    {
        if (w())
        {
            x = true;
            if (r.g() != 4)
            {
                t();
                return;
            }
        }
    }

    public final void g()
    {
        while (!w() || !x || r.g() != 3) 
        {
            return;
        }
        t();
        x = false;
    }

    public final int h()
    {
        return A;
    }

    public final void i()
    {
        if (!u && l())
        {
            u = true;
            f.a(this);
            F = q.h().c(new ewq(this, (byte)0));
        }
    }

    public final void j()
    {
        if (u)
        {
            f.b(this);
            u = false;
            z = false;
            if (t != null)
            {
                t.clear();
            }
            if (F != null && !F.c())
            {
                F.b();
            }
        }
    }

    public final boolean k()
    {
        return z && D;
    }

    public final boolean l()
    {
        return j.a(dbf.x);
    }

    public final UberLatLngBounds m()
    {
        return a(a, E.intValue());
    }

    public final UberLatLng n()
    {
        return B;
    }

    public final Trip o()
    {
        return C;
    }

    public void onPinLocationEvent(daq daq1)
    {
        UberLatLng uberlatlng = daq1.a().getUberLatLng();
        if (uberlatlng == null)
        {
            ijg.d("Got null UberLatLng from %s", new Object[] {
                daq1.getClass().getSimpleName()
            });
        } else
        {
            b = a;
            a = uberlatlng;
            if (w() && !r())
            {
                if (c)
                {
                    c = false;
                }
                if (q())
                {
                    a(a);
                    return;
                }
            }
        }
    }

    public void onPingEvent(dar dar1)
    {
        a(dar1.a().getTrip());
    }

    public void onTripUiStateChanged(fzc fzc1)
    {
        if (!w())
        {
            return;
        }
        switch (fzc1.b())
        {
        case 1: // '\001'
        case 2: // '\002'
        default:
            return;

        case 0: // '\0'
            s();
            return;

        case 3: // '\003'
            t();
            break;
        }
    }

    public void onVehicleViewSelectedEvent(fzf fzf1)
    {
        if (l())
        {
            D = a(p.b(), fzf1.a());
            a(a);
            if (D)
            {
                q();
                return;
            }
        }
    }

    public final boolean p()
    {
        return w() && b(a);
    }

    static 
    {
        boolean flag;
        if (!ewm.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }
}
