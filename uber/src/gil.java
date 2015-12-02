// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.verification.MobileVerificationSmsFragment;

public final class gil
    implements gjb
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
    private hsr k;

    private gil(gim gim1)
    {
        if (!a && gim1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gim1);
            return;
        }
    }

    gil(gim gim1, byte byte0)
    {
        this(gim1);
    }

    public static gim a()
    {
        return new gim((byte)0);
    }

    private void a(gim gim1)
    {
        b = new hst(gim1) {

            final gim a;
            final gil b;

            private cev b()
            {
                cev cev = gim.a(a).D();
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
                b = gil.this;
                a = gim1;
                super();
            }
        };
        c = hsw.a(djd.a(gim.b(gim1), b));
        d = new hst(gim1) {

            final gim a;
            final gil b;

            private chp b()
            {
                chp chp = gim.a(a).e();
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
                b = gil.this;
                a = gim1;
                super();
            }
        };
        e = hsw.a(djc.a(gim.b(gim1), d));
        f = hsw.a(dje.a(gim.b(gim1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(gim1) {

            final gim a;
            final gil b;

            private hku b()
            {
                hku hku = gim.a(a).aS();
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
                b = gil.this;
                a = gim1;
                super();
            }
        };
        i = new hst(gim1) {

            final gim a;
            final gil b;

            private dpg b()
            {
                dpg dpg = gim.a(a).ba();
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
                b = gil.this;
                a = gim1;
                super();
            }
        };
        j = new hst(gim1) {

            final gim a;
            final gil b;

            private dkn b()
            {
                dkn dkn = gim.a(a).ai();
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
                b = gil.this;
                a = gim1;
                super();
            }
        };
        k = gjc.a(g, d, b, h, i, j);
    }

    public final void a(MobileVerificationSmsFragment mobileverificationsmsfragment)
    {
        k.injectMembers(mobileverificationsmsfragment);
    }

    static 
    {
        boolean flag;
        if (!gil.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
