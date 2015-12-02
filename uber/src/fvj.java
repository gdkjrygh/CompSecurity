// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.trip.overlay.DestinationTutorialOverlayView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fvj
    implements gck
{

    private final RiderActivity a;
    private final dal b;
    private final fte c;
    private final List d = new ArrayList();
    private DestinationTutorialOverlayView e;
    private ViewGroup f;

    public fvj(RiderActivity rideractivity, dal dal1, fte fte1)
    {
        a = rideractivity;
        b = dal1;
        c = fte1;
    }

    private void d()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((fvk)iterator.next()).x()) { }
    }

    private boolean e()
    {
        return e != null && e.getVisibility() == 0;
    }

    private void f()
    {
        if (e == null)
        {
            return;
        } else
        {
            e.b(this);
            f.removeView(e);
            e = null;
            d();
            return;
        }
    }

    public final void a()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((fvk)iterator.next()).v()) { }
    }

    public final void a(int i)
    {
        if (c.g() != 4 || !fte.a(c.f()) || e() || b.p())
        {
            return;
        }
        if (e == null)
        {
            if (f == null)
            {
                throw new IllegalStateException("RootView cannot be null");
            }
            e = (DestinationTutorialOverlayView)a.getLayoutInflater().inflate(0x7f0301e4, f, false);
            f.addView(e);
            e.a(this);
        }
        e.a(i);
    }

    public final void a(ViewGroup viewgroup)
    {
        f = viewgroup;
    }

    public final void a(fvk fvk1)
    {
        d.add(fvk1);
    }

    public final void a(fzc fzc1)
    {
        if (fzc1.b() != 4 || !fte.a(fzc1.a()) || b.p())
        {
            f();
        }
    }

    public final void b()
    {
        f();
        b.c(true);
    }

    public final void b(fvk fvk1)
    {
        d.remove(fvk1);
    }

    public final void c()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((fvk)iterator.next()).y()) { }
    }
}
