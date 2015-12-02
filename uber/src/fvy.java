// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.pickup.model.RegionGroupData;
import com.ubercab.client.feature.pickup.view.HotspotSelectFooterView;
import com.ubercab.rider.realtime.response.LocationDescription;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fvy
    implements evo, ewi, exd, fvr
{

    private final chp a;
    private final evn b;
    private final ewg c;
    private final ewh d;
    private final ewj e;
    private final RiderActivity f;
    private final fta g;
    private final fte h;
    private final Set i = new HashSet();
    private ViewGroup j;
    private HotspotSelectFooterView k;

    public fvy(chp chp1, evn evn1, ewg ewg1, ewh ewh1, ewj ewj1, RiderActivity rideractivity, fta fta1, 
            fte fte1)
    {
        a = chp1;
        b = evn1;
        c = ewg1;
        d = ewh1;
        e = ewj1;
        f = rideractivity;
        g = fta1;
        h = fte1;
    }

    private void h()
    {
        if (h.g() != 2)
        {
            j();
            return;
        } else
        {
            i();
            return;
        }
    }

    private void i()
    {
        if (k != null)
        {
            return;
        }
        k = (HotspotSelectFooterView)f.getLayoutInflater().inflate(0x7f0301e5, j, false);
        j.addView(k);
        k.a(this);
        d.a(this);
        b.a(this);
        Object obj = d.f();
        chp chp1;
        AnalyticsEvent analyticsevent;
        if (obj == null)
        {
            k.a();
        } else
        {
            b.a(((com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation) (obj)).getLatLng());
        }
        obj = g.c();
        chp1 = a;
        analyticsevent = AnalyticsEvent.create("impression").setName(l.hV);
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((ftd) (obj)).a();
        }
        chp1.a(analyticsevent.setValue(((String) (obj))));
    }

    private void j()
    {
        if (k != null)
        {
            k.b(this);
            b.b(this);
            d.b(this);
            j.removeView(k);
            k = null;
        }
    }

    private int k()
    {
        int i1 = 0;
        if (m())
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(j.getWidth(), 0x40000000);
            int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            k.measure(i1, j1);
            i1 = k.getMeasuredHeight();
        }
        return i1;
    }

    public final void a()
    {
        k.a();
    }

    final void a(ViewGroup viewgroup)
    {
        j = viewgroup;
    }

    public final void a(com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation pickuplocation)
    {
        b.a(pickuplocation.getLatLng());
    }

    public final void a(RegionGroupData regiongroupdata, com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation pickuplocation)
    {
        b.a(pickuplocation.getLatLng());
    }

    public final void a(LocationDescription locationdescription)
    {
        HotspotSelectFooterView hotspotselectfooterview = k;
        if (locationdescription == null)
        {
            locationdescription = null;
        } else
        {
            locationdescription = locationdescription.getAddressComponent("rider_msg");
        }
        hotspotselectfooterview.a(locationdescription);
    }

    final void a(fvz fvz1)
    {
        i.add(fvz1);
    }

    public final void b()
    {
        k.a(null);
    }

    final void b(fvz fvz1)
    {
        i.remove(fvz1);
    }

    public final void c()
    {
        k.a();
    }

    public final void d()
    {
        if (c.e())
        {
            e.a();
            return;
        }
        d.e();
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((fvz)iterator.next()).m()) { }
        a.a(n.gZ);
    }

    public final void e()
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((fvz)iterator.next()).m()) { }
        a.a(n.ha);
    }

    public final boolean f()
    {
        if (k == null)
        {
            return false;
        } else
        {
            h.r();
            return true;
        }
    }

    final void g()
    {
        h();
    }

    public final boolean m()
    {
        return k != null;
    }

    public final int n()
    {
        return k();
    }

    public final int o()
    {
        return k();
    }
}
