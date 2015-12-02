// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.trip.slider.VehicleSlideUpPanel;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Eyeball;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class fwb
    implements fvr, gec
{

    private final drc a;
    private final hkr b;
    private final RiderActivity c;
    private final fte d;
    private final ewm e;
    private final List f = new ArrayList();
    private ViewGroup g;
    private VehicleSlideUpPanel h;

    public fwb(drc drc1, hkr hkr1, RiderActivity rideractivity, fte fte1, ewm ewm1)
    {
        a = drc1;
        b = hkr1;
        c = rideractivity;
        d = fte1;
        e = ewm1;
    }

    private boolean a(City city)
    {
        return !fte.a(d.f()) || d.g() != 0 || d.h() == null || city.getVehicleViews() == null || city.getVehicleViews().isEmpty();
    }

    private void k()
    {
        Map map1 = null;
        City city = b.b();
        if (city == null || a(city))
        {
            l();
        } else
        {
            if (h == null)
            {
                h = (VehicleSlideUpPanel)c.getLayoutInflater().inflate(0x7f030208, g, false);
            }
            if (h.getParent() == null)
            {
                h.a(this);
                g.addView(h);
            }
            Eyeball eyeball = b.e();
            Map map;
            if (eyeball == null)
            {
                map = null;
            } else
            {
                map = eyeball.getNearbyVehicles();
            }
            if (eyeball != null)
            {
                map1 = eyeball.getDynamicFares();
            }
            h.a(city, map1, map, b.f(), a.c());
            h.b(d.m());
            if (e.l())
            {
                h.b(e.k());
                return;
            }
        }
    }

    private void l()
    {
label0:
        {
            if (h != null)
            {
                h.b(this);
                g.removeView(h);
                if (!fte.b(d.g()))
                {
                    break label0;
                }
                h = null;
            }
            return;
        }
        h.a(false);
    }

    public final void a()
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((fwc)iterator.next()).q()) { }
    }

    final void a(ViewGroup viewgroup)
    {
        g = viewgroup;
    }

    final void a(fwc fwc1)
    {
        f.add(fwc1);
    }

    public final void a(String s)
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((fwc)iterator.next()).d(s)) { }
    }

    public final void a(List list)
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((fwc)iterator.next()).a(list)) { }
    }

    public final void b()
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((fwc)iterator.next()).r()) { }
    }

    final void b(fwc fwc1)
    {
        f.remove(fwc1);
    }

    public final void b(String s)
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((fwc)iterator.next()).e(s)) { }
    }

    final void c()
    {
        k();
    }

    final void d()
    {
        k();
    }

    final void e()
    {
        k();
    }

    final void f()
    {
        k();
    }

    final void g()
    {
        if (h != null)
        {
            h.e();
        }
    }

    final void h()
    {
        if (h != null)
        {
            h.f();
        }
    }

    final boolean i()
    {
        if (h != null && h.d())
        {
            h.a(true);
            return true;
        } else
        {
            return false;
        }
    }

    public final void j()
    {
        k();
    }

    public final boolean m()
    {
        return h != null && h.getParent() != null;
    }

    public final int n()
    {
        if (m())
        {
            return h.h();
        } else
        {
            return 0;
        }
    }

    public final int o()
    {
        if (m())
        {
            return h.g();
        } else
        {
            return 0;
        }
    }
}
