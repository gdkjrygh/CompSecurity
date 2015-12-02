// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.trip.capacity.CapacityPopupWindow;
import com.ubercab.client.feature.trip.event.PanelSlideEvent;
import com.ubercab.client.feature.trip.ridepool.CapacityActionSheetViewBinder;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.ArrayList;
import java.util.List;

public final class fvd
    implements fui, fwp, gdh
{

    protected CapacityActionSheetViewBinder a;
    CapacityPopupWindow b;
    private final chp c;
    private final cev d;
    private final hkr e;
    private final gmg f;
    private final fqg g;
    private final fwo h;
    private final RiderActivity i;
    private final fww j;
    private final dal k;
    private final gei l;
    private final fte m;
    private final duq n = new duq(com/ubercab/client/feature/trip/event/PanelSlideEvent);
    private boolean o;
    private fve p;
    private ViewGroup q;

    public fvd(chp chp1, cev cev1, RiderActivity rideractivity, hkr hkr1, gmg gmg1, fwo fwo1, fqg fqg1, 
            fww fww1, dal dal1, gei gei1, fte fte1)
    {
        c = chp1;
        d = cev1;
        e = hkr1;
        f = gmg1;
        h = fwo1;
        g = fqg1;
        i = rideractivity;
        j = fww1;
        k = dal1;
        m = fte1;
        l = gei1;
        h.a(this);
    }

    public static List a(Resources resources, VehicleView vehicleview)
    {
        ArrayList arraylist = new ArrayList();
        for (int i1 = 1; i1 < vehicleview.getCapacity() + 1; i1++)
        {
            arraylist.add(resources.getQuantityString(0x7f0f0000, i1, new Object[] {
                Integer.valueOf(i1)
            }));
        }

        return arraylist;
    }

    private void b(float f1, int i1)
    {
        if (f.b(dbf.bz))
        {
            return;
        } else
        {
            PanelSlideEvent panelslideevent = ((PanelSlideEvent)n.a()).a(i1, f1);
            d.c(panelslideevent);
            return;
        }
    }

    private void i()
    {
        if (!f.a(dbf.by)) goto _L2; else goto _L1
_L1:
        if (o) goto _L4; else goto _L3
_L3:
        return;
_L4:
        j();
        return;
_L2:
        if (q != null)
        {
            if (a == null)
            {
                a = k();
            }
            if (a != null && !a.c())
            {
                c.a(l.eO);
                a.a();
                return;
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void j()
    {
        if (b == null || !b.isShowing())
        {
            City city = e.b();
            VehicleView vehicleview;
            if (city != null)
            {
                vehicleview = city.findVehicleViewById(m.m());
            } else
            {
                vehicleview = null;
            }
            if (vehicleview != null && !vehicleview.getAllowRidepool())
            {
                String s;
                if (TextUtils.isEmpty(vehicleview.getHijackVehicleViewId()))
                {
                    s = vehicleview.getLinkedVehicleViewId();
                } else
                {
                    s = vehicleview.getHijackVehicleViewId();
                }
                if (!TextUtils.isEmpty(s))
                {
                    vehicleview = city.findVehicleViewById(s);
                }
            }
            if (vehicleview != null && vehicleview.getAllowRidepool())
            {
                b = new CapacityPopupWindow(i, d, vehicleview);
                b.a(this);
                b.d();
                return;
            }
        }
    }

    private CapacityActionSheetViewBinder k()
    {
        Resources resources = i.getResources();
        resources.getString(0x7f070362);
        resources.getString(0x7f070361);
        City city = e.b();
        VehicleView vehicleview;
        VehicleView vehicleview1;
        if (city != null)
        {
            vehicleview = city.findVehicleViewById(m.m());
        } else
        {
            vehicleview = null;
        }
        vehicleview1 = vehicleview;
        if (vehicleview != null)
        {
            vehicleview1 = vehicleview;
            if (!vehicleview.getAllowRidepool())
            {
                String s;
                if (TextUtils.isEmpty(vehicleview.getHijackVehicleViewId()))
                {
                    s = vehicleview.getLinkedVehicleViewId();
                } else
                {
                    s = vehicleview.getHijackVehicleViewId();
                }
                vehicleview1 = vehicleview;
                if (!TextUtils.isEmpty(s))
                {
                    vehicleview1 = city.findVehicleViewById(s);
                }
            }
        }
        if (vehicleview1 == null)
        {
            return null;
        } else
        {
            return new CapacityActionSheetViewBinder(i, q, this, a(resources, vehicleview1));
        }
    }

    public final void A()
    {
    }

    public final void B()
    {
        if (b())
        {
            i();
        }
    }

    public final void a()
    {
        if (!m.l())
        {
            if (j.h() && k.T())
            {
                j.e();
                return;
            }
            if (p != null)
            {
                p.C();
                return;
            }
        }
    }

    public final void a(float f1, int i1)
    {
        b(f1, i1);
    }

    public final void a(int i1)
    {
        i1++;
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.dd).setValue(Integer.valueOf(i1));
        c.a(analyticsevent);
        m.h(i1);
        l.a(i1);
        j.a(i1);
        c();
        if (a != null && a.c())
        {
            a.b();
        }
        g.a();
        if (b != null && b.isShowing())
        {
            b.c();
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        q = viewgroup;
    }

    public final void a(fve fve1)
    {
        p = (fve)gjz.a(fve1);
    }

    public final void a(boolean flag)
    {
        o = flag;
    }

    public final boolean b()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (f.a(dbf.cK))
        {
            Object obj = e.b();
            if (obj != null)
            {
                obj = ((City) (obj)).findVehicleViewById(m.m());
            } else
            {
                obj = null;
            }
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (((VehicleView) (obj)).getAllowRidepool())
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final void c()
    {
        if (b())
        {
            boolean flag = m.l();
            boolean flag1 = m.j();
            if (!flag)
            {
                i();
                return;
            }
            if (!flag1 && !m.n())
            {
                h.a(m.k());
                return;
            } else
            {
                h.q();
                return;
            }
        } else
        {
            h.q();
            return;
        }
    }

    public final boolean d()
    {
        if (!f.b(dbf.bw))
        {
            if (a != null && a.c())
            {
                a.b();
                if (p != null)
                {
                    p.C();
                }
                return true;
            }
            if (b != null && b.isShowing())
            {
                b.c();
                return true;
            }
        }
        return false;
    }

    public final void e()
    {
        if (m.g() == 3)
        {
            c();
        }
    }

    public final void f()
    {
        if (f.a(dbf.cK))
        {
            i();
        }
    }

    public final void g()
    {
        if (a != null)
        {
            a.b();
        }
        if (b != null && b.isShowing())
        {
            b.a(null);
            b.c();
        }
    }

    public final void h()
    {
        if (m.g() == 3)
        {
            c();
        }
    }
}
