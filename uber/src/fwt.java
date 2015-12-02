// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.ui.TextView;

public final class fwt
{

    private final chp a;
    private final gmg b;
    private final hkr c;
    private final RiderActivity d;
    private final dal e;
    private final fte f;
    private final ewm g;
    private ViewGroup h;
    private ViewGroup i;

    public fwt(chp chp1, gmg gmg1, hkr hkr1, RiderActivity rideractivity, dal dal1, fte fte1, ewm ewm1)
    {
        a = chp1;
        b = gmg1;
        c = hkr1;
        d = rideractivity;
        f = fte1;
        e = dal1;
        g = ewm1;
    }

    private boolean a(String s)
    {
        String s2 = null;
        City city = c.b();
        if (city != null)
        {
            s = city.findVehicleViewById(s);
        } else
        {
            s = null;
        }
        if (s == null)
        {
            return false;
        }
        Object obj = s;
        if (e.T())
        {
            String s1;
            if (s.getLinkedVehicleViewId() != null)
            {
                s1 = "LinkedVehicleView";
            } else
            {
                s1 = "HijackVehicleView";
            }
            if (s.getLinkedVehicleViewId() != null)
            {
                obj = city.findVehicleViewById(s.getLinkedVehicleViewId());
                s2 = s1;
            } else
            {
                s2 = s1;
                obj = s;
                if (s.getHijackVehicleViewId() != null)
                {
                    obj = city.findVehicleViewById(s.getHijackVehicleViewId());
                    s2 = s1;
                }
            }
        }
        if (obj == null)
        {
            ijg.d(new Exception(), (new StringBuilder("Error: no ")).append(s2).append(" given existing ").append(s2).append("Id @ cityId = ").append(city.getCityId()).append(" city name = ").append(city.getCityName()).toString(), new Object[0]);
            return false;
        } else
        {
            return ((VehicleView) (obj)).getAllowRidepool();
        }
    }

    private void b()
    {
        String s = f.m();
        if (fte.a(f.f()) && f.g() == 4 && a(s))
        {
            if (i == null && !g.k())
            {
                i = (ViewGroup)d.getLayoutInflater().inflate(0x7f0301ed, h, false);
                c();
                h.addView(i);
                a.a(l.iI);
            }
            return;
        } else
        {
            e();
            return;
        }
    }

    private void c()
    {
        ((TextView)i.findViewById(0x7f0e0610)).setText(i.getResources().getString(0x7f07062f, new Object[] {
            Integer.valueOf(d())
        }));
    }

    private int d()
    {
        if (b.a(dbf.cK) && f.l())
        {
            return f.k();
        } else
        {
            return 2;
        }
    }

    private void e()
    {
        if (i != null)
        {
            h.removeView(i);
            i = null;
        }
    }

    public final void a()
    {
        b();
    }

    public final void a(ViewGroup viewgroup)
    {
        h = viewgroup;
    }

    public final void a(dnj dnj1)
    {
        if (dnj1.i())
        {
            b();
        }
    }
}
