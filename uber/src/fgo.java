// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.settings.EditAccountFragment;

public final class fgo
    implements fgw
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
    private hsr o;

    private fgo(fgp fgp1)
    {
        if (!a && fgp1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fgp1);
            return;
        }
    }

    fgo(fgp fgp1, byte byte0)
    {
        this(fgp1);
    }

    public static fgp a()
    {
        return new fgp((byte)0);
    }

    private void a(fgp fgp1)
    {
        b = new hst(fgp1) {

            final fgp a;
            final fgo b;

            private cev b()
            {
                cev cev = fgp.a(a).D();
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
                b = fgo.this;
                a = fgp1;
                super();
            }
        };
        c = hsw.a(djd.a(fgp.b(fgp1), b));
        d = new hst(fgp1) {

            final fgp a;
            final fgo b;

            private chp b()
            {
                chp chp = fgp.a(a).e();
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
                b = fgo.this;
                a = fgp1;
                super();
            }
        };
        e = hsw.a(djc.a(fgp.b(fgp1), d));
        f = hsw.a(dje.a(fgp.b(fgp1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(fgp1) {

            final fgp a;
            final fgo b;

            private djx b()
            {
                djx djx = fgp.a(a).A();
                if (djx == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return djx;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fgo.this;
                a = fgp1;
                super();
            }
        };
        i = new hst(fgp1) {

            final fgp a;
            final fgo b;

            private gmg b()
            {
                gmg gmg = fgp.a(a).f();
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
                b = fgo.this;
                a = fgp1;
                super();
            }
        };
        j = new hst(fgp1) {

            final fgp a;
            final fgo b;

            private hoi b()
            {
                hoi hoi = fgp.a(a).p();
                if (hoi == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hoi;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fgo.this;
                a = fgp1;
                super();
            }
        };
        k = new hst(fgp1) {

            final fgp a;
            final fgo b;

            private cgh b()
            {
                cgh cgh = fgp.a(a).Z();
                if (cgh == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return cgh;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fgo.this;
                a = fgp1;
                super();
            }
        };
        l = new hst(fgp1) {

            final fgp a;
            final fgo b;

            private dce b()
            {
                dce dce = fgp.a(a).af();
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
                b = fgo.this;
                a = fgp1;
                super();
            }
        };
        m = new hst(fgp1) {

            final fgp a;
            final fgo b;

            private dal b()
            {
                dal dal = fgp.a(a).ap();
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
                b = fgo.this;
                a = fgp1;
                super();
            }
        };
        n = new hst(fgp1) {

            final fgp a;
            final fgo b;

            private dri b()
            {
                dri dri = fgp.a(a).at();
                if (dri == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dri;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fgo.this;
                a = fgp1;
                super();
            }
        };
        o = fgx.a(g, h, d, i, j, k, l, m, n);
    }

    public final void a(EditAccountFragment editaccountfragment)
    {
        o.injectMembers(editaccountfragment);
    }

    static 
    {
        boolean flag;
        if (!fgo.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
