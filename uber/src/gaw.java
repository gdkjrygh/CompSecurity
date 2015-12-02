// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.feature.pickup.model.RegionGroupData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gaw extends ees
    implements evu, ewk
{

    private final chp a;
    private final cev b;
    private final cyg c;
    private final gmg d;
    private final evt e;
    private final ewg f;
    private final ewh g;
    private final gbc h;
    private final ewj i;
    private final cjn j;
    private final hzb k;
    private final dak l;
    private final Handler m = new Handler(Looper.getMainLooper());
    private final Runnable n = new Runnable() {

        final gaw a;

        public final void run()
        {
            a.h();
        }

            
            {
                a = gaw.this;
                super();
            }
    };
    private final Runnable o = new Runnable() {

        final gaw a;

        public final void run()
        {
            a.j();
        }

            
            {
                a = gaw.this;
                super();
            }
    };
    private final Runnable p = new Runnable() {

        final gaw a;

        public final void run()
        {
            a.i();
        }

            
            {
                a = gaw.this;
                super();
            }
    };
    private final boolean q;
    private cjg r;
    private boolean s;
    private boolean t;
    private gbj u;
    private gbj v;
    private RegionGroupData w;
    private ckb x;
    private int y;
    private float z;

    public gaw(chp chp1, cev cev1, cyg cyg1, gmg gmg1, evt evt1, ewg ewg1, ewh ewh, 
            gbc gbc1, ewj ewj1, RiderActivity rideractivity, dak dak1, cjn cjn1, hzb hzb1)
    {
        a = chp1;
        b = cev1;
        c = cyg1;
        d = gmg1;
        e = evt1;
        f = ewg1;
        g = ewh;
        h = gbc1;
        i = ewj1;
        l = dak1;
        j = cjn1;
        k = hzb1;
        q = a(c, d);
        if (j == null)
        {
            chp1 = null;
        } else
        {
            chp1 = j.a();
        }
        r = chp1;
        y = rideractivity.getResources().getColor(0x7f0d0081);
        z = rideractivity.getResources().getDimension(0x7f0800c6);
    }

    private gbj a(RegionGroupData regiongroupdata, int i1)
    {
        gbj gbj1 = (gbj)k.a();
        boolean flag = h.a(r).b(s);
        gbj1.a(regiongroupdata, i1, q, flag, h.a(r).d());
        return gbj1;
    }

    private void a(int i1)
    {
        m.removeCallbacks(n);
        m.postDelayed(n, i1);
    }

    private void a(UberLatLng uberlatlng)
    {
        RiderLocation riderlocation = l.b();
        if (riderlocation == null)
        {
            return;
        }
        if (x != null)
        {
            x.b();
        }
        uberlatlng = gke.a(riderlocation.getUberLatLng(), uberlatlng);
        uberlatlng = (new ckc()).a(uberlatlng).a(z).a(y);
        x = j.a(uberlatlng);
    }

    private void a(RegionGroupData regiongroupdata)
    {
        gbj gbj1 = v;
        v = a(regiongroupdata, gbg.b);
        if (gbj1 != null)
        {
            regiongroupdata = new AnimatorSet();
            regiongroupdata.playTogether(new Animator[] {
                gbj1.g(), v.f()
            });
            regiongroupdata.setStartDelay(200L);
            regiongroupdata.start();
            return;
        } else
        {
            a(v);
            return;
        }
    }

    static void a(gaw gaw1)
    {
        gaw1.s();
    }

    private void a(gax gax1)
    {
        String s1 = gax1.b().b();
        gax1 = gax1.a();
        a.a(AnalyticsEvent.create("tap").setName(n.aC).setValue(String.format("%s::%s", new Object[] {
            s1, gax1.getProperties().getId()
        })));
    }

    private void a(gbj gbj1)
    {
        if (gbj1.d())
        {
            return;
        }
        gbj1.o();
        Animator animator = gbj1.f();
        if (h.a(r).d() && gbj1.e())
        {
            animator.addListener(new AnimatorListenerAdapter() {

                final gaw a;

                public final void onAnimationCancel(Animator animator1)
                {
                    gaw.a(a);
                }

                public final void onAnimationEnd(Animator animator1)
                {
                    gaw.a(a);
                }

            
            {
                a = gaw.this;
                super();
            }
            });
            a(gbj1.l());
        }
        animator.start();
        n();
    }

    static void a(List list)
    {
        b(list);
    }

    private void a(boolean flag, int i1)
    {
        if (!o())
        {
            return;
        }
        q();
        r();
        ArrayList arraylist = new ArrayList();
        List list = p();
        for (Iterator iterator = list.iterator(); iterator.hasNext(); arraylist.add(((gbj)iterator.next()).g())) { }
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(arraylist);
        animatorset.setStartDelay(i1);
        animatorset.addListener(new AnimatorListenerAdapter(list) {

            final List a;
            final gaw b;

            public final void onAnimationCancel(Animator animator)
            {
                gaw.a(a);
            }

            public final void onAnimationEnd(Animator animator)
            {
                gaw.a(a);
            }

            public final void onAnimationStart(Animator animator)
            {
                gaw.b(b).a(false);
            }

            
            {
                b = gaw.this;
                a = list;
                super();
            }
        });
        if (!flag)
        {
            animatorset.setDuration(0L);
        }
        animatorset.start();
        u = null;
        v = null;
    }

    private static boolean a(cyg cyg1, gmg gmg1)
    {
        return !gmg1.a(dbf.bL) || cyg1.a() > 2013;
    }

    static ewj b(gaw gaw1)
    {
        return gaw1.i;
    }

    private gax b(UberLatLng uberlatlng)
    {
        for (Iterator iterator = p().iterator(); iterator.hasNext();)
        {
            gbj gbj1 = (gbj)iterator.next();
            if (gbj1.d())
            {
                com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation pickuplocation = gbj1.b(uberlatlng);
                if (pickuplocation != null)
                {
                    return new gax(gbj1, pickuplocation);
                }
            }
        }

        return null;
    }

    private void b(gbj gbj1)
    {
        gbj1.n();
        Animator animator = gbj1.g();
        animator.addListener(new AnimatorListenerAdapter(gbj1) {

            final gbj a;
            final gaw b;

            public final void onAnimationCancel(Animator animator1)
            {
                a.h();
            }

            public final void onAnimationEnd(Animator animator1)
            {
                a.h();
            }

            
            {
                b = gaw.this;
                a = gbj1;
                super();
            }
        });
        animator.start();
        n();
    }

    private static void b(List list)
    {
        for (list = list.iterator(); list.hasNext(); ((gbj)list.next()).h()) { }
    }

    private static void c(gbj gbj1)
    {
        if (gbj1.e())
        {
            return;
        } else
        {
            gbj1.i().start();
            return;
        }
    }

    private boolean k()
    {
        return f.d() || f.c() && f.e();
    }

    private boolean l()
    {
        return j != null && j.c() != null && j.c().a();
    }

    private ckd m()
    {
        if (j != null)
        {
            return j.b();
        } else
        {
            return null;
        }
    }

    private void n()
    {
        i.a(o());
    }

    private boolean o()
    {
        for (Iterator iterator = p().iterator(); iterator.hasNext();)
        {
            if (((gbj)iterator.next()).d())
            {
                return true;
            }
        }

        return false;
    }

    private List p()
    {
        ArrayList arraylist = new ArrayList();
        if (u != null)
        {
            arraylist.add(u);
        }
        if (v != null)
        {
            arraylist.add(v);
        }
        return arraylist;
    }

    private void q()
    {
        for (Iterator iterator = p().iterator(); iterator.hasNext(); ((gbj)iterator.next()).n()) { }
    }

    private void r()
    {
        m.removeCallbacks(o);
        if (u != null)
        {
            u.p();
        }
    }

    private void s()
    {
        m.removeCallbacks(o);
        m.postDelayed(o, 300L);
    }

    public final void a(Point point)
    {
        if (l())
        {
            s = false;
            m.removeCallbacks(n);
            if (r != null)
            {
                Object obj = r.b();
                b.c(new gce());
                if (e.e() == evv.a)
                {
                    gax gax1 = b(((UberLatLng) (obj)));
                    ckd ckd1 = m();
                    obj = gax1;
                    if (gax1 == null)
                    {
                        obj = gax1;
                        if (h.a(r).c())
                        {
                            obj = gax1;
                            if (ckd1 != null)
                            {
                                obj = b(ckd1.a(point));
                            }
                        }
                    }
                    if (obj != null)
                    {
                        a(((gax) (obj)));
                        point = RiderLocation.create("hotspot", ((gax) (obj)).a().getLatLng());
                        b.c(new gaq(point));
                        a(true, 0);
                        return;
                    }
                }
                if (h.a(r).b())
                {
                    a(true, 200);
                    return;
                }
                if (v != null)
                {
                    i();
                    return;
                }
            }
        }
    }

    public final void a(cjg cjg1)
    {
        r = cjg1;
        a(300);
    }

    public final void b(Point point)
    {
        if (l())
        {
            s = true;
            if (h.a(r).a())
            {
                b.c(new gcd());
                a(300);
            }
            if (u != null)
            {
                i.b(false);
                if (u != null)
                {
                    u.p();
                    return;
                }
            }
        }
    }

    public final void d()
    {
        if (!l())
        {
            return;
        } else
        {
            m.removeCallbacks(n);
            return;
        }
    }

    public final void e()
    {
        if (t || !k())
        {
            return;
        } else
        {
            t = true;
            b.a(this);
            e.a(this);
            i.a(this);
            return;
        }
    }

    public final void f()
    {
        if (!t)
        {
            return;
        } else
        {
            t = false;
            b.b(this);
            a(false, 0);
            w = null;
            e.b(this);
            i.b(this);
            return;
        }
    }

    public final void g()
    {
        com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation pickuplocation;
        if (u == null)
        {
            pickuplocation = null;
        } else
        {
            pickuplocation = u.k();
        }
        if (pickuplocation != null)
        {
            b.c(new gaq(RiderLocation.create("hotspot", pickuplocation.getLatLng())));
            a(new gax(u, pickuplocation));
            a(true, 0);
        }
    }

    final void h()
    {
        boolean flag = true;
        if (h.a(r).a()) goto _L2; else goto _L1
_L1:
        a(true, 0);
_L4:
        return;
_L2:
        if (!s && h.a(r).b())
        {
            a(true, 200);
            return;
        }
        if (r == null) goto _L4; else goto _L3
_L3:
        UberLatLng uberlatlng;
        uberlatlng = r.b();
        String s2 = h.a(r).a(s);
        String s1;
        if (w == null)
        {
            s1 = null;
        } else
        {
            s1 = w.getSubtype();
        }
        if (s2 == null || s1 == null || !s2.equals(s1))
        {
            flag = false;
        }
        if (!evt.a(uberlatlng, w) || !flag)
        {
            w = e.a(uberlatlng, s2);
        }
        if (w == null) goto _L4; else goto _L5
_L5:
        if (u != null && !u.a(uberlatlng))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (u == null)
        {
            u = a(w, gbg.a);
            a(u);
        }
        if (v == null) goto _L4; else goto _L6
_L6:
        b(v);
        v = null;
        return;
        if (v != null && v.a(uberlatlng)) goto _L4; else goto _L7
_L7:
        a(w);
        m.removeCallbacks(p);
        m.postDelayed(p, 3000L);
        return;
    }

    final void i()
    {
        if (r == null || v == null || !v.a(r.b()))
        {
            return;
        }
        if (u != null)
        {
            b(u);
        }
        u = v;
        c(u);
        v = null;
    }

    final void j()
    {
        if (u != null && u.l() != null)
        {
            i.b(true);
            Animator animator = u.j();
            if (animator != null && q)
            {
                animator.start();
                return;
            }
        }
    }

    public final void onTripUiStateChanged(fzc fzc1)
    {
        if (fzc1.b() != 2)
        {
            i.b(false);
            if (x != null)
            {
                x.b();
                x = null;
            }
        }
    }

    public final void w_()
    {
        a(1000);
    }

    public final void x_()
    {
        a(false, 0);
    }

    public final void y_()
    {
        if (l()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        r = j.a();
        if (r != null)
        {
            UberLatLng uberlatlng = r.b();
            Iterator iterator = p().iterator();
            while (iterator.hasNext()) 
            {
                ((gbj)iterator.next()).c(uberlatlng);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
