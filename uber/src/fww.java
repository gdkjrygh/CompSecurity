// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.trip.ridepool.RideHijackView;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.FareHijackVehicleViewInfo;
import com.ubercab.rider.realtime.model.FareInfo;
import com.ubercab.rider.realtime.model.Metadata;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.rider.realtime.response.FareEstimateResponse;
import com.ubercab.rider.realtime.response.RidepoolAds;
import java.util.Calendar;
import java.util.Map;

public final class fww
    implements fvr, gdi, gej
{

    private final chp a;
    private final hkr b;
    private final gmg c;
    private final LayoutInflater d;
    private final hkg e;
    private final fqg f;
    private final RiderActivity g;
    private final dak h;
    private final eyy i;
    private final dal j;
    private final gei k;
    private final fte l;
    private RideHijackView m;
    private ViewGroup n;
    private fwx o;
    private fwy p;
    private VehicleView q;
    private FareHijackVehicleViewInfo r;
    private RiderLocation s;
    private icl t;
    private VehicleView u;

    public fww(chp chp1, hkr hkr1, gmg gmg1, hkg hkg1, fqg fqg1, RiderActivity rideractivity, dak dak1, 
            eyy eyy1, dal dal1, gei gei1, fte fte1)
    {
        a = chp1;
        b = hkr1;
        c = gmg1;
        d = (LayoutInflater)gjz.a(rideractivity.getLayoutInflater());
        e = hkg1;
        f = fqg1;
        g = rideractivity;
        h = dak1;
        i = eyy1;
        j = dal1;
        k = gei1;
        l = fte1;
    }

    private void A()
    {
        if (u == null || u.getDescription() == null || s == null || s.getUberLatLng() == null)
        {
            return;
        } else
        {
            UberLatLng uberlatlng = s.getUberLatLng();
            t = e.a(uberlatlng.a(), uberlatlng.b(), Calendar.getInstance().get(11), u.getDescription().toLowerCase()).a(ico.a()).b(new ick() {

                final fww a;

                private void a(RidepoolAds ridepoolads)
                {
                    fww.a(a, ridepoolads.getMessage());
                }

                public final void a()
                {
                }

                public final volatile void a(Object obj)
                {
                    a((RidepoolAds)obj);
                }

                public final void a(Throwable throwable)
                {
                    fww.a(a, null);
                }

            
            {
                a = fww.this;
                super();
            }
            });
            return;
        }
    }

    private void B()
    {
        VehicleView vehicleview = b(l.m());
        if (vehicleview != null && vehicleview.getHijackVehicleViewId() != null && r != null)
        {
            if (h())
            {
                if (r.getFareInfo() == null)
                {
                    if (j.T())
                    {
                        a(r.getErrorMessage());
                        return;
                    } else
                    {
                        t();
                        return;
                    }
                } else
                {
                    a(r);
                    return;
                }
            }
            if (r.getFareInfo() != null)
            {
                b(true);
                a(r);
                return;
            }
        }
    }

    private void a(FareHijackVehicleViewInfo farehijackvehicleviewinfo)
    {
        byte byte0 = 8;
        e((new StringBuilder()).append(farehijackvehicleviewinfo.getHijackVehicleSavingTagline()).append(": ").append(farehijackvehicleviewinfo.getVehicleSavingTagline()).toString());
        m.b(8);
        m.d(farehijackvehicleviewinfo.getVehicleSavingTagline());
        m.b(farehijackvehicleviewinfo.getHijackVehicleSavingTagline());
        RideHijackView ridehijackview = m;
        if (!k.e())
        {
            byte0 = 0;
        }
        ridehijackview.a(byte0);
        if (j.T())
        {
            m.d();
            a(q);
            b(farehijackvehicleviewinfo);
        } else
        {
            m.e();
            a(u);
            b(((FareHijackVehicleViewInfo) (null)));
        }
        if (farehijackvehicleviewinfo.getFareInfo() != null)
        {
            a.a(AnalyticsEvent.create("impression").setName(l.ff).setValue(farehijackvehicleviewinfo.getFareInfo().getMetadata().getFormattedFare()));
        }
    }

    private void a(VehicleView vehicleview)
    {
        m.a(vehicleview, c(vehicleview));
    }

    static void a(fww fww1, String s1)
    {
        fww1.c(s1);
    }

    private void a(String s1)
    {
        (new android.app.AlertDialog.Builder(g)).setMessage(s1).setPositiveButton(0x7f0702f8, null).show();
        b(false);
    }

    private VehicleView b(String s1)
    {
        City city = b.b();
        if (city != null)
        {
            return city.findVehicleViewById(s1);
        } else
        {
            return null;
        }
    }

    private void b(FareHijackVehicleViewInfo farehijackvehicleviewinfo)
    {
        fqg fqg1 = f;
        if (farehijackvehicleviewinfo == null)
        {
            farehijackvehicleviewinfo = null;
        } else
        {
            farehijackvehicleviewinfo = farehijackvehicleviewinfo.getFareInfo();
        }
        fqg1.a(farehijackvehicleviewinfo);
    }

    private void b(VehicleView vehicleview)
    {
        Object obj = b.e();
        if (obj != null)
        {
            obj = ((Eyeball) (obj)).getNearbyVehicles();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            m.a(((Map) (obj)), vehicleview);
        }
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            v();
        } else
        {
            w();
            j.e(false);
        }
        o.b(flag);
    }

    private void c(String s1)
    {
        if (s1 == null)
        {
            if (u != null)
            {
                s1 = u.getHijackTipTagline();
            } else
            {
                s1 = g.getString(0x7f0703af);
            }
        }
        m.e(s1);
        e(s1);
    }

    private boolean c(VehicleView vehicleview)
    {
        DynamicFare dynamicfare = null;
        if (c.a(dbf.aT) && vehicleview.getAllowRidepool() && f.b() != null)
        {
            return f.b().isFareElevated();
        }
        Object obj = b.e();
        boolean flag;
        if (obj != null)
        {
            obj = ((Eyeball) (obj)).getDynamicFares();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            dynamicfare = (DynamicFare)((Map) (obj)).get(vehicleview.getId());
        }
        if (dynamicfare != null && dynamicfare.getMultiplier() > 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && vehicleview.getAllowedToSurge();
    }

    private void d(String s1)
    {
        gjz.a(s1);
        a.a(AnalyticsEvent.create("tap").setName(n.dm).setValue(s1));
    }

    private void e(String s1)
    {
        a.a(AnalyticsEvent.create("impression").setName(l.fb).setValue(s1));
    }

    private boolean q()
    {
        return m != null;
    }

    private void r()
    {
        m = (RideHijackView)d.inflate(0x7f0301f1, n, false);
        n.addView(m);
        m.a(this);
        if (!c.a(dbf.d))
        {
            m.g();
        }
        if (k.c(true))
        {
            m.h();
            m.i();
            k.a((ViewGroup)m.findViewById(0x7f0e061e));
            k.a(this);
            k.a(false, true, false);
            l.b(true);
        }
    }

    private boolean s()
    {
        return k.c(true) && l.j() && l.l();
    }

    private void t()
    {
        if (u == null || q == null)
        {
            u();
            return;
        }
        if (!l.j())
        {
            m.b(0);
            s = h.b();
            if (s != null && z())
            {
                A();
            } else
            {
                m.e(u.getHijackTipTagline());
            }
        } else
        {
            m.e(u.getHijackTipTagline());
            m.b(8);
        }
        b(((FareHijackVehicleViewInfo) (null)));
        m.a(8);
        m.a(q.getDescription());
        m.c(u.getDescription());
        m.b(q.getHijackSavingTagline());
        m.d(u.getHijackSavingTagline());
        m.a(q.getHijackSharingTagline(), u.getHijackSharingTagline());
        m.c();
        a(u);
    }

    private void u()
    {
        if (t != null && !t.c())
        {
            t.b();
            t = null;
        }
        if (u != null && q != null)
        {
            String s1;
            if (r != null)
            {
                s1 = (new StringBuilder()).append(r.getHijackVehicleSavingTagline()).append(": ").append(r.getVehicleSavingTagline()).toString();
            } else
            {
                s1 = (new StringBuilder()).append(q.getHijackSavingTagline()).append(": ").append(u.getHijackSavingTagline()).toString();
            }
            e(s1);
        }
        if (q())
        {
            m.a();
            m = null;
            u = null;
            q = null;
        }
    }

    private void v()
    {
        m.setVisibility(0);
    }

    private void w()
    {
        m.setVisibility(8);
    }

    private int x()
    {
        int i1 = 0;
        if (h())
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(n.getWidth(), 0x40000000);
            int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            m.measure(i1, j1);
            i1 = m.getMeasuredHeight();
        }
        return i1;
    }

    private boolean y()
    {
        return l.g() == 3 && c.a(dbf.c) && !i.f();
    }

    private boolean z()
    {
        return l.g() == 3 && c.a(dbf.d);
    }

    public final void a()
    {
        StringBuilder stringbuilder = new StringBuilder("opt_in: ");
        String s1;
        if (r != null && r.getFareInfo() != null)
        {
            s1 = r.getHijackVehicleSavingTagline();
        } else
        {
            s1 = q.getHijackSavingTagline();
        }
        d(stringbuilder.append(s1).toString());
        m.d();
        if (r != null && r.getFareInfo() == null)
        {
            a(r.getErrorMessage());
            return;
        }
        if (c.a(dbf.cK) && !l.l() && o != null)
        {
            o.j();
        } else
        if (!l.j())
        {
            p.p();
        } else
        {
            b(r);
        }
        j.e(true);
        a(q);
        b(q);
        k.a(false, true, false);
    }

    public final void a(int i1)
    {
        if (m != null)
        {
            k.a(i1);
            if (!l.j())
            {
                p.p();
                return;
            }
            if (s())
            {
                k.a(false, true, false);
                m.i();
                return;
            }
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        n = (ViewGroup)gjz.a(viewgroup);
    }

    final void a(FareEstimateResponse fareestimateresponse)
    {
label0:
        {
            if (y())
            {
                com.ubercab.rider.realtime.model.Client client = b.c();
                if (fareestimateresponse != null && client != null)
                {
                    break label0;
                }
            }
            return;
        }
        r = fareestimateresponse.getHijackVehicleViewInfo();
        B();
    }

    public final void a(daq daq1)
    {
        while (!z() || s != null && s.getUberLatLng() != null && s.getUberLatLng().equals(daq1.a().getUberLatLng())) 
        {
            return;
        }
        s = daq1.a();
        A();
    }

    public final void a(dnf dnf1)
    {
label0:
        {
            if (y())
            {
                dnf1 = (Ping)dnf1.g();
                if (dnf1 != null && dnf1.getClient() != null)
                {
                    break label0;
                }
            }
            return;
        }
        r = dnf1.getHijackVehicleViewInfo();
        B();
    }

    public final void a(fwx fwx1)
    {
        o = fwx1;
    }

    public final void a(fwy fwy1)
    {
        p = fwy1;
    }

    public final void a(fyi fyi1)
    {
        if (y())
        {
            boolean flag = j.T();
            if (fyi1.a() == null)
            {
                fyi1 = b(l.m());
                if (fyi1 == null)
                {
                    fyi1 = null;
                } else
                {
                    fyi1 = fyi1.getHijackVehicleViewId();
                }
                if (fyi1 != null && q())
                {
                    j.e(false);
                    b(true);
                    t();
                }
                r = null;
                return;
            }
            if (flag && m != null)
            {
                if (c.a(dbf.cK) && !l.l() && o != null)
                {
                    o.j();
                    return;
                }
                if (l.l() && s())
                {
                    k.a(false, true, false);
                    m.i();
                    return;
                }
            }
        }
    }

    public final void a(boolean flag)
    {
        if (p != null)
        {
            p.k();
        }
    }

    public final void b()
    {
        StringBuilder stringbuilder = new StringBuilder("opt_out: ");
        String s1;
        if (r != null && r.getFareInfo() != null)
        {
            s1 = r.getVehicleSavingTagline();
        } else
        {
            s1 = u.getHijackSavingTagline();
        }
        d(stringbuilder.append(s1).toString());
        j.e(false);
        if (r != null && r.getFareInfo() != null)
        {
            b(((FareHijackVehicleViewInfo) (null)));
        }
        m.e();
        a(u);
        b(u);
        k.a(false, true, false);
    }

    public final void c()
    {
        d((new StringBuilder("opt_in: ")).append(m.f()).toString());
        if (!l.j())
        {
            p.p();
        }
    }

    public final void d()
    {
        p.n();
    }

    public final void e()
    {
        if (m != null)
        {
            m.onRightItemViewClick();
        }
    }

    public final void f()
    {
        k.f();
    }

    public final void g()
    {
        if (!h() && y())
        {
            j();
        } else
        if (h() && !y())
        {
            u();
            return;
        }
    }

    public final boolean h()
    {
        return q() && m.getVisibility() == 0;
    }

    public final void i()
    {
        p = null;
    }

    public final void j()
    {
        VehicleView vehicleview = b(l.m());
        Object obj;
        if (vehicleview == null)
        {
            obj = null;
        } else
        {
            obj = vehicleview.getHijackVehicleViewId();
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = b(((String) (obj)));
        u = vehicleview;
        q = ((VehicleView) (obj));
        if (!q())
        {
            r();
        }
        t();
        b(true);
        e((new StringBuilder()).append(q.getHijackSavingTagline()).append(": ").append(u.getHijackSavingTagline()).toString());
        if (z())
        {
            e(u.getHijackTipTagline());
        }
_L4:
        j.e(false);
        return;
_L2:
        if (q())
        {
            w();
            u = null;
            q = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void k()
    {
        if (p != null)
        {
            p.s();
        }
    }

    public final void l()
    {
        if (o != null)
        {
            o.j();
        }
    }

    public final boolean m()
    {
        return h();
    }

    public final int n()
    {
        return x();
    }

    public final int o()
    {
        return x();
    }

    public final boolean p()
    {
        j.e(false);
        return false;
    }
}
