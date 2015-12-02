// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.feature.trip.address.AddressView;
import com.ubercab.client.feature.trip.address.MultiAddressView;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.rider.realtime.response.LocationDescription;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fvb
    implements ewl, ewp, fuc
{

    private final Set a = new HashSet();
    private final drc b;
    private final hkr c;
    private final gmg d;
    private final fvs e;
    private final evn f;
    private final ewj g;
    private final dce h;
    private final RiderActivity i;
    private final dal j;
    private final fta k;
    private final fte l;
    private ViewGroup m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private MultiAddressView r;

    public fvb(drc drc1, hkr hkr1, gmg gmg1, evn evn1, ewj ewj1, dce dce1, RiderActivity rideractivity, 
            dal dal1, fta fta1, fte fte1, fvs fvs1, ewm ewm1)
    {
        b = drc1;
        c = hkr1;
        d = gmg1;
        f = evn1;
        g = ewj1;
        h = dce1;
        i = rideractivity;
        j = dal1;
        k = fta1;
        l = fte1;
        e = fvs1;
        g.a(this);
        ewm1.a(this);
        n = i.getString(0x7f07036a);
        o = i.getString(0x7f070369);
        p = i.getString(0x7f07066c).toUpperCase();
        q = i.getString(0x7f07066b).toUpperCase();
    }

    private boolean a(City city, String s1)
    {
        if (city != null && !b.k())
        {
            if ((city = city.findVehicleViewById(s1)) != null && city.getEnableVehicleInventoryView() || fte.b(l.f()))
            {
                return true;
            }
        }
        return false;
    }

    private void s()
    {
        if (!v())
        {
            x();
            return;
        }
        if (r == null)
        {
            r = (MultiAddressView)i.getLayoutInflater().inflate(0x7f0301e6, m, false);
            r.c(i.getString(0x7f0703df));
            r.b(i.getString(0x7f0701d9));
            r.a(w());
            m.addView(r);
            r.a(this);
        }
        t();
        Object obj = c.b();
        String s1 = l.m();
        int i1 = l.g();
        RiderLocation riderlocation = l.h();
        boolean flag;
        boolean flag1;
        if (i1 == 0 && riderlocation == null)
        {
            r.a(i.getString(0x7f0703d0));
        } else
        {
            r.a(i.getString(0x7f07025a));
        }
        if (obj != null)
        {
            obj = ((City) (obj)).findVehicleViewById(s1);
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            flag1 = ((VehicleView) (obj)).isDestinationEnabled();
            flag = j.U();
            if (i1 == 3)
            {
                if (((VehicleView) (obj)).isDestinationRequired() || ((VehicleView) (obj)).isDestinationPreferred() && !flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = ((VehicleView) (obj)).isDestinationRequired();
            }
        } else
        {
            flag = false;
            flag1 = false;
        }
        if (k.d())
        {
            obj = riderlocation;
        } else
        {
            obj = null;
        }
        r.a(i1, ((RiderLocation) (obj)), l.i(), flag1, flag);
    }

    private void t()
    {
        Object obj2 = null;
        if (r == null)
        {
            return;
        }
        Object obj = l.h();
        Object obj1;
        boolean flag;
        if (obj == null)
        {
            obj1 = null;
        } else
        {
            obj1 = ((RiderLocation) (obj)).getUberLatLng();
        }
        obj = obj2;
        if (obj1 != null)
        {
            obj1 = f.b(((com.ubercab.android.location.UberLatLng) (obj1)));
            obj = obj2;
            if (obj1 != null)
            {
                obj = ((LocationDescription) (obj1)).getAddressComponent("subtitle");
            }
        }
        if (a(c.b(), l.m()))
        {
            obj = i.getString(0x7f0701d4);
            flag = false;
        } else
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            flag = true;
        } else
        {
            obj = i.getString(0x7f070357);
            flag = false;
        }
        r.a(((String) (obj)), flag);
    }

    private void u()
    {
        while (d.a(dbf.bQ) || !d.a(dbf.bK)) 
        {
            return;
        }
        e.a(fvt.a, n, o);
    }

    private boolean v()
    {
        if (!d.a(dbf.bQ))
        {
            Object obj = c.e();
            com.ubercab.rider.realtime.model.ClientStatus clientstatus = c.d();
            com.ubercab.rider.realtime.model.Trip trip = c.f();
            int i1 = l.g();
            obj = dre.a(clientstatus, ((com.ubercab.rider.realtime.model.Eyeball) (obj)), trip);
            if (fte.c(i1) && dre.a(((com.ubercab.rider.realtime.model.FareSplit) (obj))) || fte.a(i1))
            {
                return true;
            }
        }
        return false;
    }

    private boolean w()
    {
        for (String s1 = h.a(); s1 == null || !s1.equals("CHINA") && !s1.equals("JAPAN") && !s1.equals("SOUTH_KOREA");)
        {
            return false;
        }

        return true;
    }

    private void x()
    {
        if (r != null)
        {
            m.removeView(r);
            r.b(this);
            r = null;
        }
    }

    public final void a()
    {
        int i1 = l.g();
        if (fte.d(i1) || fte.e(i1))
        {
            u();
        }
    }

    public final void a(int i1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((fvc)iterator.next()).b(i1)) { }
    }

    public final void a(ViewGroup viewgroup)
    {
        m = viewgroup;
        e.a(viewgroup);
    }

    public final void a(fvc fvc1)
    {
        a.add(fvc1);
    }

    public final void a(fzc fzc1)
    {
        s();
        if (fte.b(fzc1.b()))
        {
            e.f();
        }
        if (fzc1.b() != 3)
        {
            j.f(false);
        }
    }

    public final void b()
    {
        e.a(fvt.a);
    }

    public final void b(fvc fvc1)
    {
        a.remove(fvc1);
    }

    public final void c()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((fvc)iterator.next()).t()) { }
    }

    public final void d()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((fvc)iterator.next()).u()) { }
    }

    public final void e()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((fvc)iterator.next()).v()) { }
    }

    public final void f()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((fvc)iterator.next()).w()) { }
    }

    public final void g()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((fvc)iterator.next()).z()) { }
    }

    public final void h()
    {
        if (r != null)
        {
            r.b();
        }
    }

    public final void i()
    {
        s();
    }

    public final void j()
    {
        e.a(fvt.b, p, q);
    }

    public final void k()
    {
        e.a(fvt.b);
    }

    public final void l()
    {
    }

    public final void m()
    {
        s();
    }

    public final void n()
    {
        s();
    }

    public final void o()
    {
        s();
    }

    public final int p()
    {
        if (r != null)
        {
            int i1 = android.view.View.MeasureSpec.makeMeasureSpec(m.getWidth(), 0x40000000);
            int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            r.measure(i1, j1);
            return r.a();
        } else
        {
            return e.e();
        }
    }

    public final int q()
    {
        if (r == null)
        {
            return 0;
        } else
        {
            return r.c().getTop();
        }
    }

    public final void r()
    {
        s();
    }
}
