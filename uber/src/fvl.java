// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.trip.dispatch.CancelView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fvl
    implements fvr, fxu
{

    private final RiderActivity a;
    private final fte b;
    private final ewm c;
    private final List d = new ArrayList();
    private ViewGroup e;
    private CancelView f;

    public fvl(RiderActivity rideractivity, fte fte1, ewm ewm1)
    {
        a = rideractivity;
        b = fte1;
        c = ewm1;
    }

    private void d()
    {
        if (b.g() != 4)
        {
            e();
        } else
        {
            if (f == null)
            {
                f = (CancelView)a.getLayoutInflater().inflate(0x7f0301e1, e, false);
                e.addView(f);
                f.a(this);
            }
            if (c.l())
            {
                f.a(c.k());
                return;
            }
        }
    }

    private void e()
    {
        if (f != null)
        {
            f.b(this);
            e.removeView(f);
            f = null;
        }
    }

    final void a()
    {
        d();
    }

    final void a(ViewGroup viewgroup)
    {
        e = viewgroup;
    }

    final void a(fvm fvm1)
    {
        d.add(fvm1);
    }

    public final void a(boolean flag)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((fvm)iterator.next()).a(flag)) { }
    }

    final void b()
    {
        d();
    }

    final void b(fvm fvm1)
    {
        d.remove(fvm1);
    }

    final void c()
    {
        d();
    }

    public final boolean m()
    {
        return f != null;
    }

    public final int n()
    {
        int i = 0;
        if (m())
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec(e.getWidth(), 0x40000000);
            int j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            f.measure(i, j);
            i = f.getMeasuredHeight();
        }
        return i;
    }

    public final int o()
    {
        return 0;
    }
}
