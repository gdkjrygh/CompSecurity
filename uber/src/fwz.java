// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.trip.ridepool.RidepoolToggleView;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.FareInfo;
import com.ubercab.rider.realtime.model.FareLinkedVehicleViewInfo;
import com.ubercab.rider.realtime.model.Itinerary;
import com.ubercab.rider.realtime.model.Metadata;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.rider.realtime.response.FareEstimate;
import com.ubercab.rider.realtime.response.FareEstimateResponse;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class fwz
    implements gdk
{

    private final chp a;
    private final hkr b;
    private final gmg c;
    private final LayoutInflater d;
    private final fqg e;
    private final RiderActivity f;
    private final dal g;
    private final fte h;
    private AlertDialog i;
    private FareInfo j;
    private RidepoolToggleView k;
    private ViewGroup l;
    private final List m = new CopyOnWriteArrayList();

    public fwz(hkr hkr1, RiderActivity rideractivity, fte fte1, gmg gmg1, chp chp1, dal dal1, fqg fqg1)
    {
        b = hkr1;
        f = rideractivity;
        a = chp1;
        g = dal1;
        d = (LayoutInflater)gjz.a(f.getLayoutInflater());
        h = fte1;
        c = gmg1;
        e = fqg1;
    }

    private VehicleView a(String s)
    {
        City city = b.b();
        if (city != null)
        {
            return city.findVehicleViewById(s);
        } else
        {
            return null;
        }
    }

    private void a(Itinerary itinerary, FareLinkedVehicleViewInfo farelinkedvehicleviewinfo)
    {
        Object obj = i();
        if (k == null || farelinkedvehicleviewinfo == null || itinerary == null || obj == null || ((VehicleView) (obj)).getLinkedVehicleViewId() == null)
        {
            j();
            return;
        }
        j = farelinkedvehicleviewinfo.getFareInfo();
        obj = e;
        if (g.T())
        {
            farelinkedvehicleviewinfo = j;
        } else
        {
            farelinkedvehicleviewinfo = null;
        }
        ((fqg) (obj)).a(farelinkedvehicleviewinfo);
        k.a(j.getMetadata().getFormattedFare());
        k.d(itinerary.getFareEstimateString());
        a.a(AnalyticsEvent.create("impression").setName(l.ff).setValue(j.getMetadata().getFormattedFare()));
    }

    private void a(VehicleView vehicleview, VehicleView vehicleview1)
    {
        k.c(vehicleview1.getCapacityTagline());
        k.b(vehicleview1.getSharingTagline());
        k.f(vehicleview.getCapacityTagline());
        k.e(vehicleview.getSharingTagline());
    }

    private void a(FareEstimate fareestimate, FareLinkedVehicleViewInfo farelinkedvehicleviewinfo)
    {
        Object obj = i();
        if (k == null || farelinkedvehicleviewinfo == null || fareestimate == null || obj == null || ((VehicleView) (obj)).getLinkedVehicleViewId() == null)
        {
            j();
            return;
        }
        j = farelinkedvehicleviewinfo.getFareInfo();
        obj = e;
        if (g.T())
        {
            farelinkedvehicleviewinfo = j;
        } else
        {
            farelinkedvehicleviewinfo = null;
        }
        ((fqg) (obj)).a(farelinkedvehicleviewinfo);
        k.a(j.getMetadata().getFormattedFare());
        k.d(fareestimate.getFareEstimateString());
        a.a(AnalyticsEvent.create("impression").setName(l.ff).setValue(j.getMetadata().getFormattedFare()));
    }

    private void b(VehicleView vehicleview, VehicleView vehicleview1)
    {
        if (e())
        {
            return;
        }
        if (l == null)
        {
            ijg.d(new Exception(), "Error: Calling %s.initToggleView(). mRootView is null", new Object[] {
                getClass().getSimpleName()
            });
            return;
        } else
        {
            k = (RidepoolToggleView)d.inflate(0x7f0301f4, l, false);
            l.addView(k);
            k.a(this);
            a(vehicleview, vehicleview1);
            k.onClickLeftToggleItem();
            a.a(l.fc);
            g.e(true);
            return;
        }
    }

    private ProgressDialog f()
    {
        Resources resources = f.getResources();
        return dtg.a(f, resources.getString(0x7f0703ab));
    }

    private void g()
    {
        if (i == null)
        {
            i = f();
            i.show();
        }
    }

    private void h()
    {
        if (i != null)
        {
            i.dismiss();
            i = null;
        }
    }

    private VehicleView i()
    {
        return a(h.m());
    }

    private void j()
    {
        if (e())
        {
            l.removeView(k);
            g.e(false);
            k = null;
        }
    }

    public final void a()
    {
        a.a(AnalyticsEvent.create("tap").setName(n.dn).setValue("opt_in"));
        g.e(true);
        e.a(j);
        for (Iterator iterator = m.iterator(); iterator.hasNext(); ((fxa)iterator.next()).i()) { }
    }

    public final void a(ViewGroup viewgroup)
    {
        l = (ViewGroup)gjz.a(viewgroup);
    }

    final void a(FareEstimateResponse fareestimateresponse)
    {
        if (!c.a(dbf.b))
        {
            return;
        }
        h();
        if (fareestimateresponse == null)
        {
            j();
            return;
        } else
        {
            a(fareestimateresponse.getEstimate(), ((FareLinkedVehicleViewInfo) (fareestimateresponse.getLinkedVehicleViewInfo())));
            return;
        }
    }

    public final void a(dnf dnf1)
    {
        if (!c.a(dbf.b))
        {
            return;
        }
        h();
        dnf1 = (Ping)dnf1.g();
        if (dnf1 == null || dnf1.getClient() == null)
        {
            j();
            return;
        } else
        {
            a(((Itinerary) (dnf1.getClient().getLastEstimatedTrip())), ((FareLinkedVehicleViewInfo) (dnf1.getLinkedVehicleViewInfo())));
            return;
        }
    }

    public final void a(fxa fxa1)
    {
        m.add(fxa1);
    }

    public final void a(fyi fyi1)
    {
        while (!c.a(dbf.b) || fyi1.a() != null) 
        {
            return;
        }
        j();
    }

    public final void a(fzc fzc1)
    {
        while (!c.a(dbf.b) || fzc1.b() == 3) 
        {
            return;
        }
        j();
    }

    public final void b()
    {
        a.a(AnalyticsEvent.create("tap").setName(n.dn).setValue("opt_out"));
        g.e(false);
        e.a(null);
        for (Iterator iterator = m.iterator(); iterator.hasNext(); ((fxa)iterator.next()).i()) { }
    }

    public final void c()
    {
        if (c.a(dbf.b) && 3 == h.g())
        {
            VehicleView vehicleview = i();
            Object obj;
            if (vehicleview == null)
            {
                obj = null;
            } else
            {
                obj = vehicleview.getLinkedVehicleViewId();
            }
            obj = a(((String) (obj)));
            if (vehicleview != null && obj != null)
            {
                if (c.b(dbf.cK) || h.l() || e())
                {
                    b(vehicleview, ((VehicleView) (obj)));
                    g();
                    return;
                }
                obj = m.iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    ((fxa)((Iterator) (obj)).next()).j();
                }
            } else
            {
                j();
                return;
            }
        }
    }

    public final String d()
    {
        if (e())
        {
            VehicleView vehicleview1 = i();
            VehicleView vehicleview = vehicleview1;
            if (g.T())
            {
                vehicleview = a(vehicleview1.getLinkedVehicleViewId());
            }
            if (vehicleview != null)
            {
                return vehicleview.getId();
            }
        }
        return null;
    }

    public final boolean e()
    {
        return k != null;
    }
}
