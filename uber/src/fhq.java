// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.share.ShareFragment;

public final class fhq
    implements fif
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

    private fhq(fhr fhr1)
    {
        if (!a && fhr1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fhr1);
            return;
        }
    }

    fhq(fhr fhr1, byte byte0)
    {
        this(fhr1);
    }

    public static fhr a()
    {
        return new fhr((byte)0);
    }

    private void a(fhr fhr1)
    {
        b = new hst(fhr1) {

            final fhr a;
            final fhq b;

            private cev b()
            {
                cev cev = fhr.a(a).D();
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
                b = fhq.this;
                a = fhr1;
                super();
            }
        };
        c = hsw.a(djd.a(fhr.b(fhr1), b));
        d = new hst(fhr1) {

            final fhr a;
            final fhq b;

            private chp b()
            {
                chp chp = fhr.a(a).e();
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
                b = fhq.this;
                a = fhr1;
                super();
            }
        };
        e = hsw.a(djc.a(fhr.b(fhr1), d));
        f = hsw.a(dje.a(fhr.b(fhr1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(fhr1) {

            final fhr a;
            final fhq b;

            private hku b()
            {
                hku hku = fhr.a(a).aS();
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
                b = fhq.this;
                a = fhr1;
                super();
            }
        };
        i = new hst(fhr1) {

            final fhr a;
            final fhq b;

            private gmg b()
            {
                gmg gmg = fhr.a(a).f();
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
                b = fhq.this;
                a = fhr1;
                super();
            }
        };
        j = new hst(fhr1) {

            final fhr a;
            final fhq b;

            private dkc b()
            {
                dkc dkc = fhr.a(a).P();
                if (dkc == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dkc;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fhq.this;
                a = fhr1;
                super();
            }
        };
        k = new hst(fhr1) {

            final fhr a;
            final fhq b;

            private cgh b()
            {
                cgh cgh = fhr.a(a).Z();
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
                b = fhq.this;
                a = fhr1;
                super();
            }
        };
        l = new hst(fhr1) {

            final fhr a;
            final fhq b;

            private dpg b()
            {
                dpg dpg = fhr.a(a).ba();
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
                b = fhq.this;
                a = fhr1;
                super();
            }
        };
        m = new hst(fhr1) {

            final fhr a;
            final fhq b;

            private czf b()
            {
                czf czf = fhr.a(a).am();
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
                b = fhq.this;
                a = fhr1;
                super();
            }
        };
        n = fig.a(g, d, h, i, j, k, l, m);
    }

    public final void a(ShareFragment sharefragment)
    {
        n.injectMembers(sharefragment);
    }

    static 
    {
        boolean flag;
        if (!fhq.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
