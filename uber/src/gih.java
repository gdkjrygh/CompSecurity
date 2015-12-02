// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.verification.MobileVerificationChangeNumberFragment;

public final class gih
    implements giv
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

    private gih(gii gii1)
    {
        if (!a && gii1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gii1);
            return;
        }
    }

    gih(gii gii1, byte byte0)
    {
        this(gii1);
    }

    public static gii a()
    {
        return new gii((byte)0);
    }

    private void a(gii gii1)
    {
        b = new hst(gii1) {

            final gii a;
            final gih b;

            private cev b()
            {
                cev cev = gii.a(a).D();
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
                b = gih.this;
                a = gii1;
                super();
            }
        };
        c = hsw.a(djd.a(gii.b(gii1), b));
        d = new hst(gii1) {

            final gii a;
            final gih b;

            private chp b()
            {
                chp chp = gii.a(a).e();
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
                b = gih.this;
                a = gii1;
                super();
            }
        };
        e = hsw.a(djc.a(gii.b(gii1), d));
        f = hsw.a(dje.a(gii.b(gii1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(gii1) {

            final gii a;
            final gih b;

            private djx b()
            {
                djx djx = gii.a(a).A();
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
                b = gih.this;
                a = gii1;
                super();
            }
        };
        i = new hst(gii1) {

            final gii a;
            final gih b;

            private hkr b()
            {
                hkr hkr = gii.a(a).aP();
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
                b = gih.this;
                a = gii1;
                super();
            }
        };
        j = new hst(gii1) {

            final gii a;
            final gih b;

            private gmg b()
            {
                gmg gmg = gii.a(a).f();
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
                b = gih.this;
                a = gii1;
                super();
            }
        };
        k = new hst(gii1) {

            final gii a;
            final gih b;

            private dkn b()
            {
                dkn dkn = gii.a(a).ai();
                if (dkn == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dkn;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = gih.this;
                a = gii1;
                super();
            }
        };
        l = new hst(gii1) {

            final gii a;
            final gih b;

            private dal b()
            {
                dal dal = gii.a(a).ap();
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
                b = gih.this;
                a = gii1;
                super();
            }
        };
        m = new hst(gii1) {

            final gii a;
            final gih b;

            private dri b()
            {
                dri dri = gii.a(a).at();
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
                b = gih.this;
                a = gii1;
                super();
            }
        };
        n = giw.a(g, h, d, b, i, j, k, l, m);
    }

    public final void a(MobileVerificationChangeNumberFragment mobileverificationchangenumberfragment)
    {
        n.injectMembers(mobileverificationchangenumberfragment);
    }

    static 
    {
        boolean flag;
        if (!gih.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
