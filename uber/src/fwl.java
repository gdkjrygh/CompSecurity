// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.trip.map.PinEtaView;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.NearbyVehicle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class fwl
    implements gam
{

    private final hkr a;
    private final RiderActivity b;
    private final fte c;
    private ViewGroup d;
    private PinEtaView e;
    private boolean f;
    private Integer g;
    private int h;
    private int i;
    private final Set j = new HashSet();

    public fwl(hkr hkr1, RiderActivity rideractivity, fte fte1)
    {
        a = hkr1;
        b = rideractivity;
        c = fte1;
    }

    private void e()
    {
        if (e == null)
        {
            e = (PinEtaView)b.getLayoutInflater().inflate(0x7f0301ec, d, false);
            d.addView(e);
            e.a(this);
            g = Integer.valueOf(0);
            i();
            j();
        }
    }

    private void f()
    {
        if (e != null)
        {
            g = Integer.valueOf(8);
            i();
            e.b(this);
            d.removeView(e);
            e = null;
            f = false;
            i = 0;
            h = 0;
            g = null;
            j();
        }
    }

    private boolean g()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (c.h() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = fte.b(c.f());
        flag2 = fte.b(c.g());
        return flag && !flag2 && flag1;
    }

    private void h()
    {
        String s1 = null;
        if (!g())
        {
            f();
            return;
        }
        String s2 = c.m();
        e();
        Object obj = a.e();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((Eyeball) (obj)).getNearbyVehicles();
        }
        if (obj == null)
        {
            obj = s1;
        } else
        {
            obj = (NearbyVehicle)((Map) (obj)).get(s2);
        }
        if (obj == null)
        {
            e.b(false);
            return;
        }
        if (((NearbyVehicle) (obj)).getVehiclePaths() == null || ((NearbyVehicle) (obj)).getVehiclePaths().isEmpty() || fte.e(c.g()))
        {
            e.b(false);
            return;
        }
        e.b(true);
        s1 = ((NearbyVehicle) (obj)).getEtaStringShort();
        if (!TextUtils.isEmpty(s1))
        {
            int k = s1.indexOf(" ");
            String s = s1;
            if (k >= 0)
            {
                s = s1.substring(0, k);
            }
            e.a(s);
            return;
        } else
        {
            e.c();
            return;
        }
    }

    private void i()
    {
        if (e == null || g == null || !f)
        {
            return;
        }
        if (g.intValue() == 0)
        {
            e.a();
        } else
        {
            e.b();
        }
        g = null;
    }

    private void j()
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((fwm)iterator.next()).h()) { }
    }

    public final void a()
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((fwm)iterator.next()).A()) { }
    }

    public final void a(int k, int l)
    {
        while (e == null || i == k && h == l) 
        {
            return;
        }
        f = true;
        i = k;
        h = l;
        e.a(i, h, d.getHeight());
        i();
    }

    public final void a(ViewGroup viewgroup)
    {
        d = viewgroup;
    }

    public final void a(fwm fwm1)
    {
        j.add(fwm1);
    }

    public final void b()
    {
        h();
    }

    public final void c()
    {
        h();
    }

    public final void d()
    {
        h();
    }
}
