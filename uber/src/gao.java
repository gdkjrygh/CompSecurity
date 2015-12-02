// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.vendor.google.model.DirectionsResponse;
import com.ubercab.client.core.vendor.google.model.OverviewPolyline;
import com.ubercab.client.core.vendor.google.model.Route;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.List;

public final class gao extends ees
{

    private final cev a;
    private final dwt b;
    private final fzl c;
    private final eel d;
    private final dak e;
    private final fte f;
    private final hkr g;
    private final cjn h;
    private String i;
    private ckb j;

    public gao(cev cev1, dwt dwt1, fzl fzl1, eel eel1, dak dak1, fte fte1, hkr hkr1, 
            cjn cjn1)
    {
        a = cev1;
        b = dwt1;
        c = fzl1;
        d = eel1;
        e = dak1;
        f = fte1;
        g = hkr1;
        h = cjn1;
    }

    private void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            h();
        } else
        if (i == null || !i.equals(s))
        {
            h();
            List list = een.a(s);
            if (list != null && !list.isEmpty())
            {
                i = s;
                s = (new ckc()).a(list).a(d.c()).a(d.a());
                j = h.a(s);
                c.b();
                return;
            }
        }
    }

    private void g()
    {
        boolean flag = f.a();
        RiderLocation riderlocation = f.i();
        RiderLocation riderlocation1 = e.b();
        if (riderlocation1 != null && riderlocation1.getUberLatLng() != null && riderlocation != null && riderlocation.getUberLatLng() != null && flag)
        {
            b.a(riderlocation1, riderlocation);
            return;
        } else
        {
            h();
            return;
        }
    }

    private void h()
    {
        if (j == null)
        {
            return;
        } else
        {
            j.b();
            j = null;
            i = null;
            return;
        }
    }

    private boolean i()
    {
        VehicleView vehicleview = g.b().findVehicleViewById(f.m());
        return vehicleview != null && vehicleview.getHijackVehicleViewId() == null;
    }

    public final List a()
    {
        if (j == null || j.a() == null || j.a().isEmpty())
        {
            return null;
        } else
        {
            return gkk.a(gki.a(j.a(), new gjv() {

                final gao a;

                private static UberLatLng a(UberLatLng uberlatlng)
                {
                    return new UberLatLng(uberlatlng.a(), uberlatlng.b());
                }

                public final Object apply(Object obj)
                {
                    return a((UberLatLng)obj);
                }

            
            {
                a = gao.this;
                super();
            }
            }));
        }
    }

    public final void e()
    {
        a.a(this);
    }

    public final void f()
    {
        a.b(this);
    }

    public final void onDestinationChangedEvent(fyi fyi)
    {
        g();
    }

    public final void onDirectionResponseEvent(dwu dwu1)
    {
        if (!dwu1.i() || f.g() != 3)
        {
            h();
            return;
        }
        dwu1 = ((DirectionsResponse)dwu1.g()).getRoutes();
        if (dwu1 != null && !dwu1.isEmpty())
        {
            dwu1 = ((Route)dwu1.get(0)).getOverviewPolyline();
            if (dwu1 != null && !TextUtils.isEmpty(dwu1.getPoints()) && i())
            {
                a(dwu1.getPoints());
                return;
            }
        }
        h();
    }

    public final void onPinLocationEvent(daq daq)
    {
        g();
    }

    public final void onTripUiStateChangedEvent(fzc fzc)
    {
        g();
    }
}
