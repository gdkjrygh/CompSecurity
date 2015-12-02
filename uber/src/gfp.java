// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.config.AppConfigKey;
import com.ubercab.client.feature.trip.event.PanelSlideEvent;
import com.ubercab.client.feature.trip.slider.SlidePanelLayout;
import com.ubercab.client.feature.trip.tray.TrayWrapperLayout;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.rider.realtime.model.TripDriverCapabilities;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class gfp
    implements gdp
{

    public static gfq a = null;
    private static final gfk b;
    private static final gfk c;
    private final chp d;
    private final dqt e;
    private final drc f;
    private final cev g;
    private final gju h;
    private final Context i;
    private final dzw j;
    private final eyy k;
    private final dal l;
    private final duq m = new duq(com/ubercab/client/feature/trip/event/PanelSlideEvent);
    private final duq n = new duq(gfk);
    private final SlidePanelLayout o;
    private final TrayWrapperLayout p;
    private gfq q;
    private gfq r;
    private boolean s;
    private gfj t;
    private gdr u;
    private long v;
    private boolean w;

    public gfp(chp chp1, dqt dqt1, drc drc1, cev cev1, gju gju1, Context context, dzw dzw, 
            dal dal, SlidePanelLayout slidepanellayout, TrayWrapperLayout traywrapperlayout, eyy eyy1)
    {
        q = gfq.a;
        t = new gfj(null, null, null, null, null, null, 0x80000000);
        v = -1L;
        d = chp1;
        e = dqt1;
        f = drc1;
        g = cev1;
        h = gju1;
        i = context;
        j = dzw;
        l = dal;
        o = slidepanellayout;
        p = traywrapperlayout;
        k = eyy1;
        g();
        h();
    }

    static SlidePanelLayout a(gfp gfp1)
    {
        return gfp1.o;
    }

    private static gfi a(View view)
    {
        gfi gfi1 = (gfi)view.getTag(0x7f0e000a);
        Object obj = gfi1;
        if (gfi1 == null)
        {
            obj = new gfm(view);
            a(view, ((gfi) (obj)));
        }
        return ((gfi) (obj));
    }

    private void a(float f1, int i1)
    {
        if (w || f1 < 0.0F)
        {
            return;
        } else
        {
            PanelSlideEvent panelslideevent = ((PanelSlideEvent)m.a()).a(i1, f1);
            g.c(panelslideevent);
            return;
        }
    }

    public static void a(View view, gfi gfi1)
    {
        if (view.getTag(0x7f0e000a) != null)
        {
            throw new IllegalStateException("Presenter already initialized for this view");
        } else
        {
            view.setTag(0x7f0e000a, gfi1);
            return;
        }
    }

    private void a(gdq gdq1)
    {
        final class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[gdq.values().length];
                try
                {
                    a[gdq.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[gdq.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[gdq.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls5.a[gdq1.ordinal()];
        JVM INSTR tableswitch 2 3: default 32
    //                   2 56
    //                   3 69;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Percent is required for: ")).append(gdq1).toString());
_L2:
        gdq1 = c.a();
_L5:
        a(((gfk) (gdq1)));
        return;
_L3:
        gdq1 = b.a();
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(gfk gfk1)
    {
        for (Iterator iterator = p.a().iterator(); iterator.hasNext(); a((View)iterator.next()).a(gfk1)) { }
    }

    static void a(gfp gfp1, gdq gdq1)
    {
        gfp1.a(gdq1);
    }

    static boolean a(Trip trip)
    {
        if (trip != null)
        {
            boolean flag;
            boolean flag1;
            if (trip.getEntities() != null && !trip.getEntities().isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (trip.getExtraStates() != null && !trip.getExtraStates().isEmpty())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag && flag1)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(eyy eyy1)
    {
        return eyy1.f();
    }

    private gfq b(gfj gfj1)
    {
        if (a != null)
        {
            return a;
        }
        if (e())
        {
            return r;
        }
        if (!c(gfj1))
        {
            return gfq.a;
        }
        boolean flag;
        if (gfj1.g() == 7)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f.g())
        {
            if (flag)
            {
                return gfq.f;
            } else
            {
                return gfq.e;
            }
        }
        gfj1 = gfj1.f();
        if (a(gfj1))
        {
            if (flag)
            {
                return gfq.h;
            } else
            {
                return gfq.d;
            }
        }
        if (b(((Trip) (gfj1))))
        {
            if (flag)
            {
                return gfq.g;
            } else
            {
                return gfq.c;
            }
        }
        if (a(k) && !flag)
        {
            return gfq.i;
        }
        if (flag)
        {
            return gfq.f;
        } else
        {
            return gfq.b;
        }
    }

    static void b(gfp gfp1)
    {
        gfp1.l();
    }

    static TrayWrapperLayout c(gfp gfp1)
    {
        return gfp1.p;
    }

    private static boolean c(gfj gfj1)
    {
        if (gfj1 == null)
        {
            return false;
        }
        switch (gfj1.g())
        {
        default:
            return false;

        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            return true;
        }
    }

    static void d(gfp gfp1)
    {
        gfp1.i();
    }

    static cev e(gfp gfp1)
    {
        return gfp1.g;
    }

    private boolean e()
    {
        return r != null;
    }

    private void f()
    {
        o.d();
        o.postDelayed(new Runnable() {

            final gfp a;

            public final void run()
            {
                a.a(true);
            }

            
            {
                a = gfp.this;
                super();
            }
        }, 250L);
    }

    private void g()
    {
        gfk gfk1 = c;
        List list = p.a();
        int j1 = list.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            gfi gfi3 = a((View)list.get(i1));
            gfi gfi1;
            gfi gfi2;
            if (i1 > 0)
            {
                gfi1 = a((View)list.get(i1 - 1));
            } else
            {
                gfi1 = null;
            }
            if (i1 < j1 - 1)
            {
                gfi2 = a((View)list.get(i1 + 1));
            } else
            {
                gfi2 = null;
            }
            gfi3.a(this);
            gfi3.a(gfi1, gfi2);
            gfi3.a(gfk1);
            i1++;
        }
    }

    private void h()
    {
        a(gdq.a);
        p.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final gfp a;

            private void a()
            {
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    gfp.c(a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                } else
                {
                    gfp.c(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    return;
                }
            }

            public final void onGlobalLayout()
            {
                if (gfp.c(a).getHeight() <= 0)
                {
                    return;
                } else
                {
                    gfp.d(a);
                    gfp.a(a, gdq.b);
                    gfp.a(a).d();
                    gfp.a(a).a(a);
                    a();
                    return;
                }
            }

            
            {
                a = gfp.this;
                super();
            }
        });
    }

    private void i()
    {
        j();
        a(u);
        w = false;
        k();
    }

    private void j()
    {
        for (Iterator iterator = p.a().iterator(); iterator.hasNext(); a((View)iterator.next()).a(t)) { }
    }

    private void k()
    {
        int i2 = i.getResources().getDimensionPixelSize(0x7f080298);
        int i1 = p.getPaddingTop();
        Iterator iterator = p.a().iterator();
        int j1;
        int k1;
        for (j1 = i1; iterator.hasNext(); j1 = k1 + j1)
        {
            gfi gfi1 = a((View)iterator.next());
            k1 = gfi1.b();
            i1 = gfi1.a() + i1;
        }

        int l1 = i1;
        if (i1 < i2)
        {
            l1 = i2;
        }
        p.setMinimumHeight(j1);
        if (o.b() != l1)
        {
            o.a(l1);
            o.postDelayed(new Runnable() {

                final gfp a;

                public final void run()
                {
                    gfp.e(a).c(new fzd());
                }

            
            {
                a = gfp.this;
                super();
            }
            }, 100L);
        }
    }

    private void l()
    {
        if (q != null && q != gfq.a) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        if (u == null)
        {
            obj = gdq.b;
        } else
        {
            obj = u.a();
        }
        switch (_cls5.a[((gdq) (obj)).ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            break;

        case 2: // '\002'
            d.a(l.ir);
            return;

        case 3: // '\003'
            obj = AnalyticsEvent.create("impression").setName(l.iq).setValue(q.c());
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        d.a(((AnalyticsEvent) (obj)));
        return;
    }

    public final void a()
    {
        switch (_cls5.a[o.e().ordinal()])
        {
        default:
            return;

        case 2: // '\002'
            o.d();
            s = true;
            return;

        case 3: // '\003'
            o.c();
            break;
        }
        s = true;
    }

    public final void a(gdr gdr1)
    {
        boolean flag;
        boolean flag1;
        boolean flag2 = true;
        if (gdr1 == null)
        {
            a(b);
            return;
        }
        if (u == null || u.a() != gdr1.a() || e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u = gdr1;
        flag1 = flag2;
        if (!s)
        {
            if (gdr1.d())
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
        }
        _cls5.a[gdr1.a().ordinal()];
        JVM INSTR tableswitch 1 3: default 108
    //                   1 149
    //                   2 189
    //                   3 189;
           goto _L1 _L2 _L3 _L3
_L1:
        a(((gfk)n.a()).a(gdr1.a(), gdr1.b(), gdr1.c(), flag1));
        return;
_L2:
        if (flag)
        {
            g.c(new gcd());
        }
        if (flag1)
        {
            a(gdr1.b(), o.b());
        }
        continue; /* Loop/switch isn't completed */
_L3:
        s = false;
        if (flag1)
        {
            l();
        }
        if (flag)
        {
            g.c(new gce());
            g.c(new fys());
        }
        a(gdr1.b(), o.b());
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(gfj gfj1)
    {
        gfq gfq1;
        boolean flag;
        boolean flag2;
        boolean flag3;
        boolean flag5 = c(gfj1);
        boolean flag6 = c(t);
        gfq1 = b(gfj1);
        boolean flag1;
        boolean flag4;
        if (gfq1 != q)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag6 && !flag5)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag5 && !flag6)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (t == null || t.g() == 0x80000000)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (o.e() == gdq.b)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (!flag3 && (flag2 || flag) && flag4)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        t = gfj1;
        if (!flag1) goto _L2; else goto _L1
_L1:
        o.d();
        w = false;
        v = -1L;
_L4:
        if (w)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (flag2 && v == -1L)
        {
            v = gju.a();
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (flag3)
        {
            w = true;
            f();
            return;
        }
        if (flag)
        {
            q = gfq1;
            l();
            i();
            return;
        } else
        {
            j();
            return;
        }
    }

    public final void a(boolean flag)
    {
        q = b(t);
        i();
        if (flag || u == null || u.a() == gdq.b)
        {
            o.postDelayed(new Runnable() {

                final gfp a;

                public final void run()
                {
                    gfp.a(a).d();
                    gfp.b(a);
                }

            
            {
                a = gfp.this;
                super();
            }
            }, 250L);
        }
    }

    final void b()
    {
        k();
        o.d();
    }

    final boolean b(Trip trip)
    {
        if (trip != null)
        {
            trip = trip.getDriver();
        } else
        {
            trip = null;
        }
        if (trip != null)
        {
            if ((trip = trip.getCapabilities()) != null && trip.getMusic())
            {
                return e.a(AppConfigKey.g, false);
            }
        }
        return false;
    }

    final long c()
    {
        return v;
    }

    final gfq d()
    {
        return q;
    }

    static 
    {
        b = (new gfk()).a(gdq.b, 0.0F, 0, false);
        c = (new gfk()).a(gdq.a, 1.0F, 0, false);
    }
}
