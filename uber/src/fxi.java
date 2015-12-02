// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.trip.overlay.ToolbarTutorialOverlayView;
import com.ubercab.ui.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fxi
    implements gcq
{

    protected ToolbarTutorialOverlayView a;
    private final List b = new ArrayList();
    private final RiderActivity c;
    private final dal d;
    private ViewGroup e;
    private ViewGroup f;
    private ViewGroup g;

    public fxi(RiderActivity rideractivity, dal dal1)
    {
        c = rideractivity;
        d = dal1;
    }

    private boolean f()
    {
        if (e == null || a == null)
        {
            return false;
        } else
        {
            return e.equals(a.getParent());
        }
    }

    private void g()
    {
        if (a == null)
        {
            return;
        } else
        {
            a.b(this);
            g.removeView(f);
            e.removeView(a);
            g = null;
            a = null;
            return;
        }
    }

    public final void a()
    {
        b();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((fxj)iterator.next()).f()) { }
    }

    public final void a(ViewGroup viewgroup)
    {
        e = viewgroup;
    }

    public final void a(fxj fxj1)
    {
        b.add(fxj1);
    }

    public final void b()
    {
        g();
        d.s();
    }

    public final void b(ViewGroup viewgroup)
    {
        f = viewgroup;
    }

    public final void c()
    {
        if (d() || !e())
        {
            return;
        }
        if (a == null)
        {
            if (e == null)
            {
                throw new IllegalStateException("RootView cannot be null");
            }
            a = (ToolbarTutorialOverlayView)c.getLayoutInflater().inflate(0x7f0301b7, e, false);
            g = (ViewGroup)a.findViewById(0x7f0e0526);
            g.addView(f);
            ((TextView)a.findViewById(0x7f0e0528)).setText(0x7f070495);
            e.addView(a);
            a.a(this);
        }
        e.bringToFront();
        a.a();
    }

    public final boolean d()
    {
        return a != null && a.getVisibility() == 0 && f();
    }

    public final boolean e()
    {
        return !d.t();
    }
}
