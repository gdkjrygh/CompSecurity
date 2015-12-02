// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.feature.trip.map.MapFragment;

public final class fzg
    implements fzp
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hzb h;
    private hzb i;
    private hzb j;
    private hzb k;
    private hzb l;
    private hzb m;
    private hzb n;
    private hzb o;
    private hzb p;
    private hzb q;
    private hzb r;
    private hzb s;
    private hzb t;
    private hzb u;
    private hzb v;
    private hzb w;
    private hzb x;
    private hsr y;

    private fzg(fzh fzh1)
    {
        if (!a && fzh1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fzh1);
            return;
        }
    }

    fzg(fzh fzh1, byte byte0)
    {
        this(fzh1);
    }

    public static fzh a()
    {
        return new fzh((byte)0);
    }

    private void a(fzh fzh1)
    {
        b = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private cev b()
            {
                cev cev = fzh.a(a).D();
                if (cev == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return cev;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        c = hsw.a(djd.a(fzh.b(fzh1), b));
        d = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private chp b()
            {
                chp chp = fzh.a(a).e();
                if (chp == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return chp;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        e = hsw.a(djc.a(fzh.b(fzh1), d));
        f = hsw.a(dje.a(fzh.b(fzh1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private gmg b()
            {
                gmg gmg = fzh.a(a).f();
                if (gmg == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return gmg;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        i = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private ewg b()
            {
                ewg ewg = fzh.a(a).N();
                if (ewg == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return ewg;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        j = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private dak b()
            {
                dak dak = fzh.a(a).aj();
                if (dak == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dak;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        k = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private fta b()
            {
                fta fta = fzh.a(a).ax();
                if (fta == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return fta;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        l = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private fte b()
            {
                fte fte = fzh.a(a).ay();
                if (fte == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return fte;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        m = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private dce b()
            {
                dce dce = fzh.a(a).af();
                if (dce == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dce;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        n = hsw.a(fzr.a(fzh.c(fzh1), d, b, k));
        o = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private Application b()
            {
                Application application = fzh.a(a).C();
                if (application == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return application;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        p = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private hkr b()
            {
                hkr hkr = fzh.a(a).aP();
                if (hkr == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hkr;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        q = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private hku b()
            {
                hku hku = fzh.a(a).aS();
                if (hku == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hku;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        r = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private evt b()
            {
                evt evt = fzh.a(a).M();
                if (evt == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return evt;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        s = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private dpg b()
            {
                dpg dpg = fzh.a(a).ba();
                if (dpg == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dpg;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        t = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private czf b()
            {
                czf czf = fzh.a(a).am();
                if (czf == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return czf;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        u = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private dal b()
            {
                dal dal = fzh.a(a).ap();
                if (dal == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dal;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        v = hsw.a(fzs.a(fzh.c(fzh1), o, b, p, q, h, r, s, j, t, u, k, l));
        w = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private RiderApplication b()
            {
                RiderApplication riderapplication = fzh.a(a).ag();
                if (riderapplication == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return riderapplication;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        x = new hst(fzh1) {

            final fzh a;
            final fzg b;

            private ewm b()
            {
                ewm ewm = fzh.a(a).aC();
                if (ewm == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return ewm;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fzg.this;
                a = fzh1;
                super();
            }
        };
        y = fzt.a(g, d, b, h, i, j, k, l, m, n, v, w, x);
    }

    public final void a(MapFragment mapfragment)
    {
        y.injectMembers(mapfragment);
    }

    static 
    {
        boolean flag;
        if (!fzg.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
