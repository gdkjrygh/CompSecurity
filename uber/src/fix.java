// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.ShoppingCartCharges;
import com.ubercab.client.feature.shoppingcart.ShoppingLookingView;
import com.ubercab.client.feature.shoppingcart.model.Store;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.rider.realtime.response.Promotion;
import java.text.DateFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class fix
    implements fip
{

    private icl A;
    int a;
    String b;
    String c;
    int d;
    int e;
    View f;
    ShoppingLookingView g;
    View h;
    Store i;
    DateFormat j;
    private final chp k;
    private final drc l;
    private final hkr m;
    private final gmg n;
    private final String o;
    private final String p;
    private final Resources q;
    private final RiderActivity r;
    private final dak s;
    private final hkm t;
    private final fim u;
    private final fsx v;
    private final fte w;
    private final Set x = new HashSet();
    private ViewGroup y;
    private UberLatLng z;

    public fix(chp chp1, drc drc1, hkr hkr1, gmg gmg1, RiderActivity rideractivity, dak dak1, hkm hkm1, 
            fim fim1, fte fte1, fsx fsx1)
    {
        k = chp1;
        l = drc1;
        m = hkr1;
        n = gmg1;
        r = rideractivity;
        t = hkm1;
        s = dak1;
        u = fim1;
        v = fsx1;
        w = fte1;
        j = DateFormat.getTimeInstance(3);
        q = r.getResources();
        d = q.getDimensionPixelSize(0x7f080220);
        e = q.getDimensionPixelSize(0x7f080221);
        o = q.getString(0x7f0701f2);
        p = q.getString(0x7f0701f3);
    }

    private void A()
    {
        k.a(AnalyticsEvent.create("impression").setName(l.gN).setValue(c).setValuePosition(Long.valueOf(C())));
    }

    private void B()
    {
        k.a(AnalyticsEvent.create("impression").setName(l.gN).setValue(c).setValuePosition(Long.valueOf(C())));
    }

    private long C()
    {
        if (i == null)
        {
            return -1L;
        }
        return !i.isOpen() ? 0L : 1L;
    }

    private boolean D()
    {
        return f != null && f.getVisibility() == 0;
    }

    private boolean E()
    {
        return g != null && g.getVisibility() == 0;
    }

    private boolean F()
    {
        return h != null && h.getVisibility() == 0;
    }

    private void G()
    {
        r.u();
        String s1 = r.getString(0x7f07028a);
        dtp.a(r, 2002, null, s1, r.getString(0x104000a));
    }

    private void H()
    {
        if (f == null)
        {
            f = r.getLayoutInflater().inflate(0x7f0301f7, y, false);
            y.addView(f);
            L();
        }
    }

    private void I()
    {
        if (h == null)
        {
            h = r.getLayoutInflater().inflate(0x7f0301f8, y, false);
            y.addView(h);
            h.setOnClickListener(new android.view.View.OnClickListener() {

                final fix a;

                public final void onClick(View view)
                {
                    a.k();
                    fix.b(a).a(n.hF);
                }

            
            {
                a = fix.this;
                super();
            }
            });
            k.a(l.iG);
            L();
        }
    }

    private void J()
    {
        w.s();
    }

    private void K()
    {
        com.ubercab.client.feature.shoppingcart.model.Page page = i.getHomePage();
        if (page != null && g != null)
        {
            g.a(page, i);
        }
    }

    private void L()
    {
        for (Iterator iterator = x.iterator(); iterator.hasNext(); ((fiy)iterator.next()).l_()) { }
    }

    static fim a(fix fix1)
    {
        return fix1.u;
    }

    private void a(int i1)
    {
        i1;
        JVM INSTR tableswitch 1 2: default 24
    //                   1 56
    //                   2 70;
           goto _L1 _L2 _L3
_L1:
        String s1 = r.getString(0x7f070430);
_L5:
        dtp.a(r, 0, null, s1, r.getString(0x7f070780));
        return;
_L2:
        s1 = r.getString(0x7f07042f);
        continue; /* Loop/switch isn't completed */
_L3:
        s1 = r.getString(0x7f07042e);
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(VehicleView vehicleview)
    {
        if (vehicleview != null)
        {
            b = vehicleview.getId();
            c = vehicleview.getUuid();
        }
    }

    private void a(String s1)
    {
        String s2 = s1;
        if (TextUtils.isEmpty(s1))
        {
            s2 = r.getString(0x7f070419);
        }
        dtp.a(r, 0, null, s2, r.getString(0x7f070780));
    }

    private static boolean a(Store store)
    {
        return store != null && store.hasValidInventory();
    }

    static chp b(fix fix1)
    {
        return fix1.k;
    }

    private boolean b(VehicleView vehicleview)
    {
        return vehicleview != null && vehicleview.getEnableVehicleInventoryView() && !l.k();
    }

    private boolean l()
    {
        if (fte.b(w.f()) && fte.d(w.g())) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (y == null)
        {
            throw new IllegalStateException("RootView cannot be null");
        }
        Object obj = m.b();
        if (obj != null)
        {
            obj = ((City) (obj)).findVehicleViewById(w.m());
        } else
        {
            obj = null;
        }
        if (!b(((VehicleView) (obj))))
        {
            o();
            I();
            return true;
        }
        if (r())
        {
            break; /* Loop/switch isn't completed */
        }
        i = u.c(c);
        if (!a(i)) goto _L1; else goto _L3
_L3:
        s();
        return true;
    }

    private void m()
    {
        n();
        o();
        p();
        q();
    }

    private void n()
    {
        if (f != null)
        {
            y.removeView(f);
            f = null;
        }
    }

    private void o()
    {
        if (g != null)
        {
            y.removeView(g);
            g = null;
        }
    }

    private void p()
    {
        if (h != null)
        {
            y.removeView(h);
            h = null;
        }
    }

    private void q()
    {
        if (A != null && !A.c())
        {
            A.b();
            A = null;
        }
    }

    private boolean r()
    {
        Object obj = s.b();
        if (obj != null)
        {
            z = ((RiderLocation) (obj)).getUberLatLng();
            obj = m.b();
            if (obj != null)
            {
                obj = ((City) (obj)).findVehicleViewById(w.m());
            } else
            {
                obj = null;
            }
            a(((VehicleView) (obj)));
            if (c != null && z != null)
            {
                u.a(z.a(), z.b(), c);
                return true;
            }
        }
        return false;
    }

    private void s()
    {
        if (i != null)
        {
            n();
            p();
            if (g != null)
            {
                g.d(c);
            }
            t();
            u();
            K();
            if (n.a(dbf.bd))
            {
                w();
            } else
            {
                v();
            }
            y();
            z();
            return;
        } else
        {
            o();
            p();
            H();
            return;
        }
    }

    private void t()
    {
        Promotion promotion = u.b(c);
        if (g == null && i != null)
        {
            g = (ShoppingLookingView)r.getLayoutInflater().inflate(0x7f0301f9, y, false);
            y.addView(g);
            g.a(c);
            g.a(this);
            L();
        }
        g.a(promotion);
    }

    private void u()
    {
label0:
        {
            String s1;
label1:
            {
                if (g == null || i == null)
                {
                    break label0;
                }
                boolean flag = i.isOpen();
                String s2 = i.getMenuTagline();
                if (n.a(dbf.aZ))
                {
                    s1 = s2;
                    if (!TextUtils.isEmpty(s2))
                    {
                        break label1;
                    }
                }
                if (flag)
                {
                    s1 = o;
                } else
                {
                    s1 = p;
                }
            }
            g.b(s1);
            if (flag)
            {
                s2 = i.getHoursOpenMessage();
                s1 = s2;
                if (TextUtils.isEmpty(s2))
                {
                    s1 = s2;
                    if (i.getCloseAt() != null)
                    {
                        j.setTimeZone(i.getTimezone());
                        s1 = q.getString(0x7f0701f1, new Object[] {
                            j.format(i.getCloseAt())
                        });
                    }
                }
            } else
            {
                s1 = i.getHoursClosedMessage();
                g.c(s1);
            }
            g.a(s1, flag);
        }
    }

    private void v()
    {
label0:
        {
            if (g != null && i != null)
            {
                int i1 = i.getShoppingCartTotalItemsCount();
                g.c(i1);
                if (i1 != 0)
                {
                    break label0;
                }
                g.a(8);
            }
            return;
        }
        g.a(0);
    }

    private void w()
    {
label0:
        {
            if (g != null && i != null)
            {
                int i1 = i.getShoppingCartTotalItemsCount();
                g.d(i1);
                if (i1 != 0)
                {
                    break label0;
                }
                g.b(8);
            }
            return;
        }
        g.b(0);
    }

    private boolean x()
    {
        return fte.b(w.f()) && fte.d(w.g());
    }

    private void y()
    {
        k.a(AnalyticsEvent.create("impression").setName(l.iw).setValue(c).setValuePosition(Long.valueOf(C())));
    }

    private void z()
    {
        k.a(AnalyticsEvent.create("impression").setName(l.gO).setValue(c).setValuePosition(Long.valueOf(C())));
    }

    public final void a()
    {
        A();
    }

    public final void a(ViewGroup viewgroup)
    {
        y = viewgroup;
    }

    public final void a(fiy fiy1)
    {
        x.add(fiy1);
    }

    public final void a(fjb fjb1)
    {
_L2:
        return;
        if (!x() || !c.equals(fjb1.c()) || i == null) goto _L2; else goto _L1
_L1:
        int j1;
        int i1 = i.getShoppingCartTotalItemsCount();
        i.updateItemCountInCart(fjb1.b(), fjb1.a());
        j1 = i.getShoppingCartTotalItemsCount();
        if (i1 == j1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!n.a(dbf.bd))
        {
            break; /* Loop/switch isn't completed */
        }
        g.d(j1);
        if (j1 == 0 && g.f())
        {
            g.m();
            return;
        }
        if (j1 != 0 && !g.f())
        {
            g.o();
            return;
        }
        if (true) goto _L2; else goto _L3
_L3:
        g.c(j1);
        if (j1 == 0 && g.e())
        {
            g.l();
            return;
        }
        if (j1 != 0 && !g.e())
        {
            g.n();
            return;
        }
        if (true) goto _L2; else goto _L4
_L4:
    }

    public final void a(fjc fjc1)
    {
        if (!x() || g == null || !c.equals(fjc1.b()))
        {
            return;
        } else
        {
            a(fjc1.a());
            ShoppingLookingView.h();
            return;
        }
    }

    public final void a(fje fje1)
    {
        if (!x())
        {
            return;
        } else
        {
            fje1 = fje1.a();
            r.u();
            a(((String) (fje1)));
            return;
        }
    }

    public final void a(fjf fjf1)
    {
        if (!x())
        {
            return;
        }
        r.u();
        i = fjf1.b();
        if (i != null && i.getCartCharges() != null && i.getCartCharges().getFinalCharges() != null && !i.getCartCharges().getFinalCharges().isEmpty())
        {
            J();
            return;
        } else
        {
            a(((String) (null)));
            return;
        }
    }

    public final void a(fjg fjg1)
    {
        if (x())
        {
            Object obj = m.b();
            if (obj != null)
            {
                obj = ((City) (obj)).findVehicleViewById(w.m());
            } else
            {
                obj = null;
            }
            if (!b(((VehicleView) (obj))))
            {
                n();
                o();
                I();
                return;
            }
            if (!c.equals(fjg1.c()))
            {
                a(((VehicleView) (obj)));
            }
            if (c.equals(fjg1.c()))
            {
                n();
                p();
                Store store = fjg1.b();
                if (!a(store))
                {
                    if (store != null)
                    {
                        n();
                        o();
                        I();
                        return;
                    } else
                    {
                        G();
                        return;
                    }
                }
                if (fjg1.a() && i != null)
                {
                    Toast.makeText(r, 0x7f070421, 1).show();
                }
                i = store;
                s();
                return;
            }
        }
    }

    public final void a(fzc fzc1)
    {
        int i1 = a;
        a = fzc1.b();
        if (!fte.b(fzc1.a()) || !fte.e(a) && !fte.d(a))
        {
            m();
            return;
        }
        if (fte.e(a) && g != null)
        {
            g.setVisibility(8);
            return;
        }
        if (fte.e(i1) && fte.d(a) && g != null)
        {
            g.setVisibility(0);
            return;
        } else
        {
            l();
            return;
        }
    }

    public final void a(String s1, long l1)
    {
        u.a(c, s1, l1);
    }

    public final void a(String s1, String s2)
    {
        u.a(c, s1, s2);
    }

    public final void a(String s1, String s2, long l1)
    {
        u.a(c, s1, s2, l1);
    }

    public final void b()
    {
        z();
    }

    public final void b(fiy fiy1)
    {
        x.remove(fiy1);
    }

    public final void b(String s1, String s2)
    {
        A = t.b(s1).a(ico.a()).b(new ick(s2) {

            Promotion a;
            final String b;
            final fix c;

            private void a(List list)
            {
                if (list != null && list.size() > 0)
                {
                    a = (Promotion)list.get(0);
                    fix.a(c).a(b, a);
                }
                if (c.g != null)
                {
                    c.g.a(a);
                }
            }

            public final void a()
            {
            }

            public final volatile void a(Object obj)
            {
                a((List)obj);
            }

            public final void a(Throwable throwable)
            {
                fix.a(c).a(b);
                if (c.g != null)
                {
                    c.g.a(null);
                }
            }

            
            {
                c = fix.this;
                b = s1;
                super();
                a = null;
            }
        });
    }

    public final void c()
    {
        B();
        k.a(n.hC);
    }

    public final void d()
    {
    }

    public final void e()
    {
        while (!x() || i == null || i.getShoppingCartTotalItemsCount() <= 0) 
        {
            return;
        }
        if (i.getCartCharges() != null)
        {
            J();
            return;
        }
        r.b(r.getString(0x7f070296), null);
        Double double1;
        Double double2;
        if (z == null)
        {
            double1 = null;
        } else
        {
            double1 = Double.valueOf(z.a());
        }
        if (z == null)
        {
            double2 = null;
        } else
        {
            double2 = Double.valueOf(z.b());
        }
        if (n.a(dbf.bc))
        {
            u.a(b, c, v.h(), double1, double2);
            return;
        } else
        {
            u.a(b, c);
            return;
        }
    }

    public final void f()
    {
        while (!x() || g == null) 
        {
            return;
        }
        g.j();
    }

    public final void g()
    {
        if (x())
        {
            r();
        }
    }

    public final int h()
    {
        if (!x())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        if (!E()) goto _L2; else goto _L1
_L1:
        int i1 = d;
_L4:
        return i1;
_L2:
        if (!F())
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = h.getMeasuredHeight();
        i1 = j1;
        if (j1 <= e)
        {
            return e;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (D())
        {
            return e;
        }
        return 0;
    }

    public final void i()
    {
        w.r();
    }

    public final boolean j()
    {
        if (!x() || g == null || g.g())
        {
            return false;
        } else
        {
            g.k();
            return true;
        }
    }

    final void k()
    {
        if (r != null)
        {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(r.getString(0x7f0706cc)));
            r.startActivity(intent);
        }
    }
}
