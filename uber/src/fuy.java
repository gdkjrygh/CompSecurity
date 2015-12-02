// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.trip.overlay.AccessibilityDeafOverlayView;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fuy
    implements gcg
{

    private final hkr a;
    private final gmg b;
    private final RiderActivity c;
    private final dal d;
    private final List e = new ArrayList();
    private AccessibilityDeafOverlayView f;
    private ViewGroup g;

    public fuy(hkr hkr1, gmg gmg1, RiderActivity rideractivity, dal dal1)
    {
        a = hkr1;
        b = gmg1;
        c = rideractivity;
        d = dal1;
    }

    private boolean d()
    {
        return f != null && f.getVisibility() == 0;
    }

    private void e()
    {
        if (f == null)
        {
            return;
        } else
        {
            f.b(this);
            g.removeView(f);
            f = null;
            return;
        }
    }

    public final void a()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((fuz)iterator.next()).v()) { }
    }

    public final void a(ViewGroup viewgroup)
    {
        g = viewgroup;
    }

    public final void a(fuz fuz1)
    {
        e.add(fuz1);
    }

    public final void a(fzc fzc1)
    {
        if (fzc1.b() != 5 || !fte.a(fzc1.a()))
        {
            e();
        } else
        if (!d())
        {
            fzc1 = a.f();
            boolean flag;
            if (fzc1 != null && fzc1.getDriver() != null && fzc1.getDriver().getIsAccessibilityTripViewEnabled())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && b.a(dbf.bW))
            {
                if (d.S().equals(fzc1.getUuid()))
                {
                    e();
                    return;
                }
                if (g == null)
                {
                    throw new IllegalStateException("RootView cannot be null");
                }
                if (f == null)
                {
                    f = (AccessibilityDeafOverlayView)c.getLayoutInflater().inflate(0x7f03002c, g, false);
                    g.addView(f);
                    f.a(this);
                    d.m(fzc1.getUuid());
                }
                f.a(fzc1);
                return;
            }
        }
    }

    public final void b()
    {
        e();
    }

    public final void b(fuz fuz1)
    {
        e.remove(fuz1);
    }

    public final void c()
    {
        Trip trip;
        if (f != null)
        {
            if ((trip = a.f()) != null)
            {
                f.a(trip);
                return;
            }
        }
    }
}
