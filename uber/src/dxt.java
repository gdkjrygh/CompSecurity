// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.ubercab.client.feature.about.AboutFragment;

public final class dxt
    implements dxj
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
    private hsr n;

    private dxt(dxu dxu1)
    {
        if (!a && dxu1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(dxu1);
            return;
        }
    }

    dxt(dxu dxu1, byte byte0)
    {
        this(dxu1);
    }

    public static dxu a()
    {
        return new dxu((byte)0);
    }

    private void a(dxu dxu1)
    {
        b = new hst(dxu1) {

            final dxu a;
            final dxt b;

            private cev b()
            {
                cev cev = dxu.a(a).D();
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
                b = dxt.this;
                a = dxu1;
                super();
            }
        };
        c = hsw.a(djd.a(dxu.b(dxu1), b));
        d = new hst(dxu1) {

            final dxu a;
            final dxt b;

            private chp b()
            {
                chp chp = dxu.a(a).e();
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
                b = dxt.this;
                a = dxu1;
                super();
            }
        };
        e = hsw.a(djc.a(dxu.b(dxu1), d));
        f = hsw.a(dje.a(dxu.b(dxu1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(dxu1) {

            final dxu a;
            final dxt b;

            private Application b()
            {
                Application application = dxu.a(a).C();
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
                b = dxt.this;
                a = dxu1;
                super();
            }
        };
        i = new hst(dxu1) {

            final dxu a;
            final dxt b;

            private dai b()
            {
                dai dai = dxu.a(a).G();
                if (dai == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dai;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dxt.this;
                a = dxu1;
                super();
            }
        };
        j = new hst(dxu1) {

            final dxu a;
            final dxt b;

            private drc b()
            {
                drc drc = dxu.a(a).aN();
                if (drc == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return drc;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dxt.this;
                a = dxu1;
                super();
            }
        };
        k = new hst(dxu1) {

            final dxu a;
            final dxt b;

            private hku b()
            {
                hku hku = dxu.a(a).aS();
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
                b = dxt.this;
                a = dxu1;
                super();
            }
        };
        l = new hst(dxu1) {

            final dxu a;
            final dxt b;

            private dpg b()
            {
                dpg dpg = dxu.a(a).ba();
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
                b = dxt.this;
                a = dxu1;
                super();
            }
        };
        m = new hst(dxu1) {

            final dxu a;
            final dxt b;

            private dak b()
            {
                dak dak = dxu.a(a).aj();
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
                b = dxt.this;
                a = dxu1;
                super();
            }
        };
        n = dxl.a(g, h, i, j, b, k, l, m);
    }

    public final void a(AboutFragment aboutfragment)
    {
        n.injectMembers(aboutfragment);
    }

    static 
    {
        boolean flag;
        if (!dxt.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
