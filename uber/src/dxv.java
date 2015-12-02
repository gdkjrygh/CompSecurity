// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public final class dxv
    implements dxn
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;
    private hzb i;
    private hzb j;
    private hzb k;
    private hzb l;
    private hsr m;

    private dxv(dxw dxw1)
    {
        if (!a && dxw1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(dxw1);
            return;
        }
    }

    dxv(dxw dxw1, byte byte0)
    {
        this(dxw1);
    }

    public static dxw a()
    {
        return new dxw((byte)0);
    }

    private void a(dxw dxw1)
    {
        b = new hst(dxw1) {

            final dxw a;
            final dxv b;

            private cev b()
            {
                cev cev = dxw.a(a).D();
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
                b = dxv.this;
                a = dxw1;
                super();
            }
        };
        c = hsw.a(djd.a(dxw.b(dxw1), b));
        d = new hst(dxw1) {

            final dxw a;
            final dxv b;

            private chp b()
            {
                chp chp = dxw.a(a).e();
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
                b = dxv.this;
                a = dxw1;
                super();
            }
        };
        e = hsw.a(djc.a(dxw.b(dxw1), d));
        f = hsw.a(dje.a(dxw.b(dxw1), c, e));
        g = czc.a(hsu.a(), f);
        h = eef.a(g, b);
        i = new hst(dxw1) {

            final dxw a;
            final dxv b;

            private Application b()
            {
                Application application = dxw.a(a).C();
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
                b = dxv.this;
                a = dxw1;
                super();
            }
        };
        j = new hst(dxw1) {

            final dxw a;
            final dxv b;

            private hku b()
            {
                hku hku = dxw.a(a).aS();
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
                b = dxv.this;
                a = dxw1;
                super();
            }
        };
        k = new hst(dxw1) {

            final dxw a;
            final dxv b;

            private dpg b()
            {
                dpg dpg = dxw.a(a).ba();
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
                b = dxv.this;
                a = dxw1;
                super();
            }
        };
        l = new hst(dxw1) {

            final dxw a;
            final dxv b;

            private dak b()
            {
                dak dak = dxw.a(a).aj();
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
                b = dxv.this;
                a = dxw1;
                super();
            }
        };
        m = dxq.a(h, i, j, k, l);
    }

    public final void a(dxm dxm)
    {
        m.injectMembers(dxm);
    }

    static 
    {
        boolean flag;
        if (!dxv.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
