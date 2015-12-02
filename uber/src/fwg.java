// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.trip.tray.TripTrayView;

public final class fwg
    implements fvr
{

    private final RiderActivity a;
    private final fte b;
    private ViewGroup c;
    private TripTrayView d;

    public fwg(RiderActivity rideractivity, fte fte1)
    {
        a = rideractivity;
        b = fte1;
    }

    private void g()
    {
        if (d != null)
        {
            c.removeView(d);
            d = null;
        }
    }

    private int h()
    {
        if (m())
        {
            return d.b();
        } else
        {
            return 0;
        }
    }

    final void a()
    {
        e();
    }

    final void a(ViewGroup viewgroup)
    {
        c = viewgroup;
    }

    final void b()
    {
        e();
    }

    final void c()
    {
        e();
    }

    final void d()
    {
        e();
    }

    final void e()
    {
        boolean flag;
        if (b.g() == 5 || b.g() == 6 || b.g() == 7)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            g();
            return;
        }
        if (d == null)
        {
            d = (TripTrayView)a.getLayoutInflater().inflate(0x7f0301fb, c, false);
            c.addView(d);
        }
        d.c();
    }

    final boolean f()
    {
        return d != null && d.a();
    }

    public final boolean m()
    {
        return d != null;
    }

    public final int n()
    {
        return h();
    }

    public final int o()
    {
        return h();
    }
}
