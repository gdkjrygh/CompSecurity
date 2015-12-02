// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.trip.address.MultiAddressFlowLayout;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.VehicleView;

public class fua
    implements fub
{

    static final boolean a;
    private final ftm b;
    private final ftn c;
    private final drc d;
    private final hkr e;
    private final gmg f;
    private final RiderActivity g;
    private final fta h;
    private final fte i;
    private MultiAddressFlowLayout j;
    private ViewGroup k;
    private final ftu l = ftu.a();
    private final ftu m = ftu.a();

    public fua(ftm ftm1, ftn ftn1, drc drc1, hkr hkr1, gmg gmg1, RiderActivity rideractivity, fta fta1, 
            fte fte1)
    {
        b = ftm1;
        c = ftn1;
        d = drc1;
        e = hkr1;
        f = gmg1;
        g = rideractivity;
        h = fta1;
        i = fte1;
    }

    private boolean a(String s)
    {
        City city = e.b();
        if (city != null && !d.k())
        {
            if ((s = city.findVehicleViewById(s)) != null && s.getEnableVehicleInventoryView())
            {
                return true;
            }
        }
        return false;
    }

    private void j()
    {
        if (!n())
        {
            o();
        } else
        {
            if (k == null)
            {
                throw new IllegalStateException("Root view cannot be null");
            }
            if (j == null)
            {
                j = (MultiAddressFlowLayout)g.getLayoutInflater().inflate(0x7f030033, k, false);
                if (!a && j == null)
                {
                    throw new AssertionError();
                } else
                {
                    k.addView(j);
                    j.a(this);
                    return;
                }
            }
        }
    }

    private void k()
    {
        Object obj = i.h();
        if (i.g() == 0 && obj == null)
        {
            m.a(g.getString(0x7f0703d0));
        } else
        {
            String s;
            if (h.d())
            {
                obj = c.a(((com.ubercab.client.core.location.RiderLocation) (obj)));
            } else
            {
                obj = null;
            }
            m.c(((String) (obj)));
            s = ((String) (obj));
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                s = g.getString(0x7f07025a);
            }
            m.a(s);
        }
        if (p())
        {
            m.b(g.getString(0x7f0701d5));
        } else
        {
            m.b(g.getString(0x7f070358));
        }
        if (j != null)
        {
            j.a(m);
        }
    }

    private void l()
    {
        Object obj = i.i();
        obj = c.a(((com.ubercab.client.core.location.RiderLocation) (obj)));
        l.a(((String) (obj)));
        l.c(((String) (obj)));
        l.b(g.getString(0x7f0701d9));
        if (j != null)
        {
            j.b(l);
        }
    }

    private void m()
    {
        boolean flag1 = true;
        if (j != null)
        {
            int j1 = b.c();
            int k1 = b.b();
            MultiAddressFlowLayout multiaddressflowlayout;
            int i1;
            boolean flag;
            if (k1 == 0 || j1 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 1;
            }
            j.d(i1);
            j.e(i1);
            i1 = b.a();
            j.a(i1);
            j.b(flag);
            j.b(k1);
            j.c(j1);
            if (i1 == 3 || i1 == 4)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            multiaddressflowlayout = j;
            if (i.i() == null || i1 != 0 || j1 == 2)
            {
                flag1 = false;
            }
            multiaddressflowlayout.a(flag1);
            j.e();
            if (!flag)
            {
                j.f();
                return;
            }
        }
    }

    private boolean n()
    {
        return f.a(dbf.bQ);
    }

    private void o()
    {
        if (j != null && k != null)
        {
            k.removeView(j);
            j = null;
        }
    }

    private boolean p()
    {
        return a(i.m()) || fte.b(i.f());
    }

    public final void a()
    {
        b.a(1);
        m();
    }

    public final void a(ViewGroup viewgroup)
    {
        k = viewgroup;
    }

    public final void b()
    {
        b.a(2);
        m();
    }

    public final void c()
    {
        b.a(0);
        m();
        l();
        k();
    }

    public final void d()
    {
        j();
        m();
        l();
        k();
    }

    public final void e()
    {
        m();
        l();
    }

    public final void f()
    {
        k();
    }

    public final void g()
    {
        j();
        m();
        l();
        k();
    }

    public final void h()
    {
        j();
        m();
        k();
        l();
    }

    public final void i()
    {
        m();
    }

    static 
    {
        boolean flag;
        if (!fua.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
