// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Note;
import com.ubercab.client.feature.trip.confirm.ConfirmationView;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.FareInfo;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.RewardInfo;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.rider.realtime.response.FareEstimateResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class fvf
    implements fun, fvr, fwv, fwx, fxa, gej
{

    private final fva a;
    private final fvd b;
    private final hkr c;
    private final gmg d;
    private final List e = new ArrayList();
    private final fqg f;
    private final fwu g;
    private final fww h;
    private final fwz i;
    private final RiderActivity j;
    private final eyy k;
    private final dal l;
    private final fxe m;
    private final fsx n;
    private final gei o;
    private final fte p;
    private ConfirmationView q;
    private boolean r;
    private Note s;
    private ViewGroup t;

    public fvf(fva fva1, fvd fvd1, hkr hkr1, gmg gmg1, fqg fqg1, fwu fwu1, fww fww1, 
            eyy eyy1, fwz fwz1, RiderActivity rideractivity, dal dal1, fxe fxe1, fsx fsx1, gei gei1, 
            fte fte1)
    {
        a = fva1;
        b = fvd1;
        c = hkr1;
        d = gmg1;
        g = fwu1;
        h = fww1;
        i = fwz1;
        j = rideractivity;
        l = dal1;
        m = fxe1;
        n = fsx1;
        p = fte1;
        k = eyy1;
        f = fqg1;
        o = gei1;
    }

    private void A()
    {
        o.a((ViewGroup)q.findViewById(0x7f0e05ce));
        o.a(this);
    }

    private int B()
    {
        int i1 = 0;
        if (m())
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(t.getWidth(), 0x40000000);
            int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            q.measure(i1, j1);
            i1 = q.getMeasuredHeight();
        }
        return i1;
    }

    private boolean C()
    {
        return d.a(dbf.aE);
    }

    private Rect D()
    {
        if (q == null)
        {
            return null;
        } else
        {
            return q.c();
        }
    }

    static ConfirmationView a(fvf fvf1)
    {
        return fvf1.q;
    }

    private void a(City city, Client client)
    {
        boolean flag;
        if (C())
        {
            flag = n.c();
        } else
        {
            if (client != null)
            {
                client = client.getCreditBalances();
            } else
            {
                client = null;
            }
            if (dtv.a(city.getCurrencyCode(), client) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        q.a(n.d(), flag);
    }

    private void a(Client client)
    {
        if (client != null)
        {
            client = client.getPaymentProfiles();
        } else
        {
            client = null;
        }
        if (k.f() && !dui.a(client).isEmpty() && m != null && m.a())
        {
            a(((fwh) (m)));
        }
    }

    private void a(Client client, PaymentProfile paymentprofile)
    {
        if (client != null)
        {
            client = client.getPaymentProfiles();
        } else
        {
            client = null;
        }
        a(paymentprofile, ((List) (client)));
        q.a(paymentprofile, client);
    }

    private void a(PaymentProfile paymentprofile)
    {
        if (paymentprofile != null)
        {
            q.a(dui.b(paymentprofile), n.m());
        }
    }

    private void a(PaymentProfile paymentprofile, List list)
    {
        if (!d.b(dbf.V)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        flag = d.a(dbf.W);
        if (paymentprofile != null || list != null && !list.isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            q.a(true);
            return;
        }
        if (a == null || !a.a()) goto _L1; else goto _L3
_L3:
        a(((fwh) (a)));
        return;
        if (!flag) goto _L1; else goto _L4
_L4:
        q.a(false);
        return;
    }

    private void a(fwh fwh)
    {
        q.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(fwh) {

            final fwh a;
            final fvf b;

            public final boolean onPreDraw()
            {
                a.a(fvf.a(b).b());
                fvf.a(b).getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }

            
            {
                b = fvf.this;
                a = fwh1;
                super();
            }
        });
    }

    private void a(String s1)
    {
        s1 = esh.a(j.getResources(), s1);
        q.a(n.l(), s1);
    }

    private void a(boolean flag, boolean flag1)
    {
        b.a(t);
        h.a(this);
        i.a((ViewGroup)q.findViewById(0x7f0e05cd));
        i.a(this);
        if (flag1)
        {
            A();
        }
        if (flag)
        {
            g.a(t, (ViewGroup)q.findViewById(0x7f0e05c9));
            g.a(this);
        }
    }

    private boolean a(VehicleView vehicleview)
    {
        return vehicleview.getHijackVehicleViewId() != null && d.a(dbf.c) && !g.d();
    }

    private DynamicFare b(String s1)
    {
        DynamicFare dynamicfare = null;
        Object obj = c.e();
        if (obj != null)
        {
            obj = ((Eyeball) (obj)).getDynamicFares();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            dynamicfare = (DynamicFare)((Map) (obj)).get(s1);
        }
        return dynamicfare;
    }

    private static String b(Client client)
    {
        if (client == null || client.getThirdPartyIdentities() == null)
        {
            return null;
        }
        for (client = client.getThirdPartyIdentities().keySet().iterator(); client.hasNext();)
        {
            String s1 = (String)client.next();
            if (esf.a(s1))
            {
                return s1;
            }
        }

        return null;
    }

    private boolean b(VehicleView vehicleview)
    {
        boolean flag1 = true;
        if (d.a(dbf.aT) && vehicleview.getAllowRidepool() && f.b() != null)
        {
            flag1 = f.b().isFareElevated();
        } else
        {
            DynamicFare dynamicfare = b(vehicleview.getId());
            boolean flag;
            if (dynamicfare != null && dynamicfare.getMultiplier() > 1.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag || !vehicleview.getAllowedToSurge())
            {
                return false;
            }
        }
        return flag1;
    }

    private void c(boolean flag)
    {
        if (q != null)
        {
            q.b(this);
            t.removeView(q);
            r = false;
            if (fte.b(p.g()))
            {
                q = null;
            }
        }
        if (!flag)
        {
            b.g();
        }
    }

    private void z()
    {
        Rect rect;
        if (d.a(dbf.cb, dbr.a))
        {
            if ((rect = D()) != null && !l.r())
            {
                for (Iterator iterator = e.iterator(); iterator.hasNext(); ((fvg)iterator.next()).a(rect)) { }
                l.q();
                return;
            }
        }
    }

    public final void a()
    {
        a(((Note) (null)));
    }

    final void a(ViewGroup viewgroup)
    {
        t = viewgroup;
    }

    public final void a(Note note)
    {
        if (d.a(dbf.cb, dbr.a))
        {
            s = note;
            if (q != null)
            {
                q.a(s);
                return;
            }
        }
    }

    final void a(FareEstimateResponse fareestimateresponse)
    {
        i.a(fareestimateresponse);
        if (!i.e())
        {
            o.b(h.h());
        }
    }

    final void a(dnf dnf)
    {
        i.a(dnf);
        if (!i.e())
        {
            o.a(h.h());
        }
    }

    final void a(fvg fvg1)
    {
        e.add(fvg1);
    }

    public final void a(fyi fyi)
    {
        i.a(fyi);
        b.e();
        o.a(fyi, g.f());
    }

    final void a(fzc fzc)
    {
        w();
        i.a(fzc);
    }

    public final void a(boolean flag)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext();)
        {
            fvg fvg1 = (fvg)iterator.next();
            if (flag)
            {
                fvg1.k();
            } else
            {
                fvg1.p();
            }
        }

    }

    public final void b()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((fvg)iterator.next()).i()) { }
        w();
    }

    final void b(fvg fvg1)
    {
        e.remove(fvg1);
    }

    public final void b(boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        r = flag;
        w();
    }

    public final void c()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((fvg)iterator.next()).l()) { }
    }

    public final void d()
    {
        if (d.a(dbf.cb, dbr.a))
        {
            Iterator iterator = e.iterator();
            while (iterator.hasNext()) 
            {
                ((fvg)iterator.next()).a(s);
            }
        }
    }

    public final void e()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((fvg)iterator.next()).o()) { }
    }

    public final void f()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((fvg)iterator.next()).n()) { }
    }

    public final void g()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((fvg)iterator.next()).s()) { }
    }

    public final void h()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((fvg)iterator.next()).j()) { }
        w();
    }

    public final void i()
    {
        w();
    }

    public final void j()
    {
        b.f();
    }

    public final void k()
    {
        g();
    }

    public final void l()
    {
        j();
    }

    public final boolean m()
    {
        return q != null && q.getParent() != null;
    }

    public final int n()
    {
        return B();
    }

    public final int o()
    {
        return B();
    }

    public final void p()
    {
        b.B();
    }

    final void q()
    {
        w();
    }

    final void r()
    {
        w();
    }

    final void s()
    {
        i.c();
    }

    final void t()
    {
        w();
    }

    final void u()
    {
        g.e();
    }

    final void v()
    {
        q.a();
    }

    final void w()
    {
        boolean flag4 = true;
        if (p.g() != 3)
        {
            if (p.g() == 7)
            {
                a(((Note) (null)));
            }
            c(false);
            return;
        }
        City city = c.b();
        if (city == null)
        {
            c(false);
            return;
        }
        VehicleView vehicleview = city.findVehicleViewById(p.m());
        if (vehicleview == null)
        {
            c(false);
            return;
        }
        boolean flag3;
        if (r || !a(vehicleview))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (h.h() && !flag3)
        {
            c(true);
            return;
        }
        boolean flag5 = g.d();
        boolean flag6 = o.c(false);
        if (q == null)
        {
            q = (ConfirmationView)j.getLayoutInflater().inflate(0x7f0301e2, t, false);
            a(flag5, flag6);
        }
        if (q.getParent() == null)
        {
            t.addView(q);
            q.a(this);
        }
        Object obj;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag7;
        if (i.e())
        {
            obj = city.findVehicleViewById(i.d());
            flag = false;
        } else
        if (vehicleview.getLinkedVehicleViewId() != null)
        {
            flag = true;
            obj = null;
        } else
        {
            flag = false;
            obj = null;
        }
        if (!flag)
        {
            ConfirmationView confirmationview = q;
            if (obj == null)
            {
                obj = vehicleview;
            }
            confirmationview.a(((VehicleView) (obj)), b(vehicleview));
        } else
        {
            q.a(null, false);
        }
        obj = c.e();
        if (obj != null)
        {
            obj = ((Eyeball) (obj)).getNearbyVehicles();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            q.a(((Map) (obj)), vehicleview);
        }
        flag7 = a(vehicleview);
        if (!flag7)
        {
            r = false;
            if (h.h())
            {
                h.j();
            }
        }
        if (!flag3 && !h.h())
        {
            h.j();
        }
        if (flag5 && !b.b())
        {
            a(c.c());
            flag1 = false;
        } else
        {
            obj = n.a();
            Client client = c.c();
            a(client, ((PaymentProfile) (obj)));
            if (obj != null)
            {
                RewardInfo rewardinfo = ((PaymentProfile) (obj)).getRewardInfo();
                if (rewardinfo != null && rewardinfo.isEnrolled() && !rewardinfo.isEarnOnly() && !rewardinfo.usePointsDisabled() && era.a(city.getCountryIso2()))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                flag2 = flag1;
                if (flag1)
                {
                    q.a(n.e(), ((PaymentProfile) (obj)));
                    flag2 = flag1;
                }
            } else
            {
                flag2 = false;
            }
            a(city, client);
            a(((PaymentProfile) (obj)));
            a(b(client));
            flag1 = flag2;
        }
        if (!p.a() && vehicleview.getLinkedVehicleViewId() == null)
        {
            flag2 = flag4;
        } else
        {
            flag2 = false;
        }
        q.a(flag2, flag1, flag5, flag3, flag6, vehicleview);
        b.c();
        if (!flag6) goto _L2; else goto _L1
_L1:
        if (!o.e())
        {
            A();
        }
        o.a(flag5, false, i.e());
_L4:
        if (flag5)
        {
            g.a(flag2, flag6);
        }
        a(s);
        z();
        return;
_L2:
        if (!flag7)
        {
            o.d();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final boolean x()
    {
        a(((Note) (null)));
        if (!a.h() && !m.h())
        {
            h.p();
            return false;
        } else
        {
            return true;
        }
    }

    public final Note y()
    {
        if (!d.a(dbf.cb, dbr.a))
        {
            return null;
        } else
        {
            return s;
        }
    }
}
