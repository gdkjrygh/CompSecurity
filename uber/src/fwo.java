// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.feature.trip.map.PinView;
import com.ubercab.client.feature.trip.map.PopularPickupCelebrationView;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.NearbyVehicle;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class fwo
    implements com.ubercab.client.feature.trip.map.PopularPickupCelebrationView.Listener, ewr, gan
{

    private final chp a;
    private final gmg b;
    private final hkr c;
    private final RiderActivity d;
    private final fta e;
    private final fte f;
    private final ewm g;
    private PopularPickupCelebrationView h;
    private ViewGroup i;
    private PinView j;
    private int k;
    private boolean l;
    private boolean m;
    private Integer n;
    private int o;
    private int p;
    private float q;
    private final Set r = new HashSet();
    private final Set s = new HashSet();
    private final Handler t = new Handler();
    private final Runnable u = new Runnable() {

        final fwo a;

        public final void run()
        {
            if (fwo.a(a) != null && fwo.b(a))
            {
                fwo.a(a).a(false);
            }
        }

            
            {
                a = fwo.this;
                super();
            }
    };
    private final Runnable v = new Runnable() {

        final fwo a;

        public final void run()
        {
            if (fwo.a(a) != null && !fwo.b(a))
            {
                fwo.a(a).g();
            }
        }

            
            {
                a = fwo.this;
                super();
            }
    };

    public fwo(chp chp1, gmg gmg1, fta fta1, hkr hkr1, RiderActivity rideractivity, fte fte1, ewm ewm1)
    {
        a = chp1;
        b = gmg1;
        c = hkr1;
        e = fta1;
        d = rideractivity;
        f = fte1;
        g = ewm1;
        g.a(this);
    }

    private void A()
    {
        if (j == null || n == null || !m)
        {
            return;
        }
        if (n.intValue() == 0)
        {
            j.e();
        } else
        {
            j.f();
        }
        n = null;
    }

    private void B()
    {
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((fwp)iterator.next()).h()) { }
    }

    private void C()
    {
        if (j != null)
        {
            PinView pinview = j;
            boolean flag;
            if (!f.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            pinview.c(flag);
        }
    }

    static PinView a(fwo fwo1)
    {
        return fwo1.j;
    }

    private void a(String s1)
    {
        Object obj1 = c.b();
        Object obj = c.e();
        if (obj == null)
        {
            j.a(true);
            return;
        }
        obj = ((Eyeball) (obj)).getNearbyVehicles();
        boolean flag;
        if (!((Map) (obj)).isEmpty() && ((Map) (obj)).get(s1) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag || l && x())
        {
            j.a(true);
            return;
        }
        if (obj1 != null)
        {
            s1 = ((City) (obj1)).findVehicleViewById(s1);
        } else
        {
            s1 = null;
        }
        if (s1 == null)
        {
            j.a(true);
            return;
        }
        j.g();
        obj = (NearbyVehicle)((Map) (obj)).get(s1.getId());
        if (((NearbyVehicle) (obj)).getVehiclePaths() == null || ((NearbyVehicle) (obj)).getVehiclePaths().isEmpty())
        {
            j.a(8);
            j.a(s1.getNoneAvailableString());
            return;
        }
        j.a(0);
        Context context = d.getApplicationContext();
        obj1 = ((NearbyVehicle) (obj)).getEtaStringShort();
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            int i1 = ((String) (obj1)).indexOf(" ");
            obj = obj1;
            if (i1 >= 0)
            {
                obj = ((String) (obj1)).substring(0, i1);
            }
            j.a(((String) (obj)), context.getString(0x7f0702b3).toUpperCase());
        } else
        {
            j.i();
        }
        obj1 = context.getString(0x7f0703e2).toUpperCase();
        obj = s1.getSetPickupLocationString();
        s1 = ((String) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            s1 = ((String) (obj1));
        }
        obj = s1;
        if (((String) (obj1)).equalsIgnoreCase(s1))
        {
            obj = s1;
            if (f.o())
            {
                obj = context.getString(0x7f07048f).toUpperCase();
            }
        }
        j.a(((String) (obj)));
    }

    private void a(boolean flag)
    {
        Handler handler = t;
        Runnable runnable;
        if (flag)
        {
            runnable = v;
        } else
        {
            runnable = u;
        }
        handler.postDelayed(runnable, 300L);
    }

    static boolean b(fwo fwo1)
    {
        return fwo1.l;
    }

    private void s()
    {
        if (h == null)
        {
            h = (PopularPickupCelebrationView)d.getLayoutInflater().inflate(0x7f03013c, i, false);
            i.addView(h, 0);
            h.a(p, o);
            h.a(this);
        }
        if (!h.c())
        {
            h.a();
        }
    }

    private void t()
    {
        while (k != 3 || j == null) 
        {
            return;
        }
        j.d();
    }

    private void u()
    {
        if (j == null)
        {
            j = (PinView)d.getLayoutInflater().inflate(0x7f0301eb, i, false);
            i.addView(j);
            j.a(this);
            n = Integer.valueOf(0);
            A();
            B();
        }
    }

    private void v()
    {
        if (j != null)
        {
            n = Integer.valueOf(8);
            A();
            j.b(this);
            i.removeView(j);
            j = null;
            m = false;
            p = 0;
            o = 0;
            n = null;
            if (h != null)
            {
                i.removeView(h);
                h = null;
            }
            B();
        }
    }

    private boolean w()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        if (f.h() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f.i() != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = f.a();
        flag3 = fte.e(k);
        flag4 = fte.a(f.f());
        flag5 = fte.f(k);
        return flag && !fte.b(k) && (!flag3 || !flag1 || !flag2) && flag4 && !flag5;
    }

    private boolean x()
    {
        return b.a(dbf.bO) && b.a(dbf.bK);
    }

    private void y()
    {
        String s1;
        boolean flag;
        flag = true;
        s1 = f.m();
        if (!w())
        {
            v();
            return;
        }
        u();
        k;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 89
    //                   1 155
    //                   2 60
    //                   3 104;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        if (g.l())
        {
            j.d(g.k());
        }
        C();
        return;
_L2:
        a(s1);
        j.d();
        continue; /* Loop/switch isn't completed */
_L4:
        if (b.b(dbf.bR))
        {
            boolean flag1 = e.b();
            PinView pinview = j;
            if (flag1)
            {
                flag = false;
            }
            pinview.a(flag);
            if (flag1)
            {
                z();
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        j.a(true);
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void z()
    {
        if (j == null)
        {
            return;
        } else
        {
            j.c();
            a.a(l.cE);
            return;
        }
    }

    public final float a(int i1, int j1)
    {
        if (j == null)
        {
            return q;
        }
        if (p == i1 && o == j1)
        {
            return q;
        }
        m = true;
        p = i1;
        o = j1;
        q = j.a(p, o, i.getHeight());
        if (h != null)
        {
            h.a(p, o);
        }
        A();
        return q;
    }

    public final void a(int i1)
    {
        if (j != null && !g.k())
        {
            a.a(l.eQ);
            j.b(i1);
            j.h();
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        i = viewgroup;
    }

    public final void a(UberLatLng uberlatlng)
    {
        int i1 = f.g();
        if (fte.d(i1) || fte.e(i1))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (e.a(uberlatlng) && i1)
        {
            s();
        }
    }

    public final void a(daq daq1)
    {
        daq1 = daq1.a().getType();
        boolean flag;
        if (!"manual".equals(daq1) && !"geocodmanual".equals(daq1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && h != null)
        {
            h.b();
        }
        C();
    }

    public final void a(fwp fwp1)
    {
        r.add(fwp1);
    }

    public final void a(fwq fwq1)
    {
        s.add(fwq1);
    }

    public final void a(fzc fzc1)
    {
        k = fzc1.b();
        y();
    }

    public final void c()
    {
        B();
    }

    public final void d()
    {
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((fwp)iterator.next()).A()) { }
    }

    public final void e()
    {
        for (Iterator iterator = s.iterator(); iterator.hasNext(); ((fwq)iterator.next()).l()) { }
    }

    public final void f()
    {
        for (Iterator iterator = s.iterator(); iterator.hasNext(); ((fwq)iterator.next()).m()) { }
    }

    public final void g()
    {
        a.a(n.df);
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((fwp)iterator.next()).B()) { }
    }

    public final void h()
    {
        y();
    }

    public final void i()
    {
        y();
    }

    public final void j()
    {
        l = false;
        if (fte.d(k) && x())
        {
            a(true);
        }
    }

    public final void k()
    {
        l = true;
        if (fte.d(k) && x())
        {
            a(false);
        }
        t();
        if (h != null)
        {
            h.b();
        }
    }

    public final void l()
    {
        if (x())
        {
            l = false;
            t.removeCallbacks(u);
            t.removeCallbacks(v);
        }
    }

    public final void m()
    {
        y();
    }

    public final void n()
    {
        t();
        if (h != null)
        {
            h.b();
        }
    }

    public final int o()
    {
        boolean flag1 = false;
        boolean flag;
        int i1;
        if (k == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = ((flag1) ? 1 : 0);
        if (j != null)
        {
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                i1 = j.b();
            }
        }
        return i1;
    }

    public final int p()
    {
        if (j == null)
        {
            return 0;
        } else
        {
            return j.a();
        }
    }

    public final void q()
    {
        if (j != null)
        {
            j.b(true);
        }
    }

    public final Point r()
    {
        if (j == null || !j.k())
        {
            return null;
        }
        int ai[] = new int[2];
        View view = j.j();
        if (view != null)
        {
            view.getLocationInWindow(ai);
            int i1 = ai[1];
            ai[1] = view.getHeight() / 2 + i1;
        }
        return new Point(ai[0], ai[1]);
    }

    public final void u_()
    {
        y();
    }

    public final void v_()
    {
        y();
    }
}
