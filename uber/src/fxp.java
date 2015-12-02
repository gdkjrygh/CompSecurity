// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.pickup.model.GuidedPickupVenueDetails;
import com.ubercab.client.feature.pickup.model.GuidedPickupVenueSelection;
import com.ubercab.client.feature.pickup.view.VenueSelectionFooterView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fxp
    implements evw, exf, fvr
{

    private final RiderActivity a;
    private final gmg b;
    private final fte c;
    private final List d = new ArrayList();
    private final evt e;
    private ViewGroup f;
    private VenueSelectionFooterView g;

    fxp(RiderActivity rideractivity, gmg gmg1, fte fte1, evt evt1)
    {
        a = rideractivity;
        b = gmg1;
        c = fte1;
        e = evt1;
    }

    private void g()
    {
        if (c.g() != 1)
        {
            i();
            return;
        } else
        {
            h();
            return;
        }
    }

    private void h()
    {
        if (g != null)
        {
            return;
        }
        e.o();
        g = (VenueSelectionFooterView)a.getLayoutInflater().inflate(0x7f030209, f, false);
        f.addView(g);
        g.a(this);
        e.a(this);
        GuidedPickupVenueSelection guidedpickupvenueselection = e.h().getVenueSelection();
        if (guidedpickupvenueselection == null || guidedpickupvenueselection.getSelectedPickup() == null || guidedpickupvenueselection.getIsSuggestion())
        {
            GuidedPickupVenueSelection guidedpickupvenueselection1 = e.i();
            if (guidedpickupvenueselection1 != null)
            {
                e.a(guidedpickupvenueselection1);
            }
        }
        k();
    }

    private void i()
    {
        if (g != null)
        {
            e.b(this);
            g.b(this);
            f.removeView(g);
            g = null;
        }
    }

    private int j()
    {
        int l = 0;
        if (m())
        {
            l = android.view.View.MeasureSpec.makeMeasureSpec(f.getWidth(), 0x40000000);
            int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            g.measure(l, i1);
            l = g.getMeasuredHeight();
        }
        return l;
    }

    private void k()
    {
        Object obj1 = null;
        if (g == null)
        {
            return;
        }
        Object obj = e.h();
        com.ubercab.client.feature.pickup.model.GuidedPickupVenue.VenueFeature venuefeature = ((GuidedPickupVenueDetails) (obj)).getVenueFeature();
        GuidedPickupVenueSelection guidedpickupvenueselection = ((GuidedPickupVenueDetails) (obj)).getVenueSelection();
        String s;
        if (venuefeature != null && venuefeature.getProperties() != null)
        {
            obj = venuefeature.getProperties().getLocationSelectionTitle();
        } else
        {
            obj = null;
        }
        s = obj1;
        if (venuefeature != null)
        {
            s = obj1;
            if (venuefeature.getProperties() != null)
            {
                s = venuefeature.getProperties().getLocationSelectionDescription();
            }
        }
        g.a(((String) (obj)), s);
        g.a(venuefeature, guidedpickupvenueselection);
    }

    public final void a()
    {
        k();
    }

    final void a(ViewGroup viewgroup)
    {
        f = viewgroup;
    }

    public final void a(GuidedPickupVenueDetails guidedpickupvenuedetails)
    {
        k();
    }

    public final void a(GuidedPickupVenueSelection guidedpickupvenueselection)
    {
        e.a(guidedpickupvenueselection);
    }

    final void a(fxq fxq1)
    {
        d.add(fxq1);
    }

    public final void b()
    {
        GuidedPickupVenueSelection guidedpickupvenueselection = e.h().getVenueSelection();
        if (guidedpickupvenueselection == null || guidedpickupvenueselection.getSelectedPickup() == null && !b.a(dbf.bS, dbx.c))
        {
            g.a();
            return;
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((fxq)iterator.next()).m()) { }
        e.l();
    }

    final void b(fxq fxq1)
    {
        d.remove(fxq1);
    }

    public final boolean c()
    {
        if (g == null)
        {
            return false;
        } else
        {
            c.r();
            e.m();
            return true;
        }
    }

    final void d()
    {
        g();
    }

    final void e()
    {
        g();
    }

    final void f()
    {
        g();
    }

    public final boolean m()
    {
        return g != null;
    }

    public final int n()
    {
        return j();
    }

    public final int o()
    {
        return j();
    }
}
