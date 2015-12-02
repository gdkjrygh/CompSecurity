// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.estimate.FareEstimateFragment;

public final class eaq
    implements eaw
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
    private hsr m;

    private eaq(ear ear1)
    {
        if (!a && ear1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ear1);
            return;
        }
    }

    eaq(ear ear1, byte byte0)
    {
        this(ear1);
    }

    public static ear a()
    {
        return new ear((byte)0);
    }

    private void a(ear ear1)
    {
        b = new hst(ear1) {

            final ear a;
            final eaq b;

            private cev b()
            {
                cev cev = ear.a(a).D();
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
                b = eaq.this;
                a = ear1;
                super();
            }
        };
        c = hsw.a(djd.a(ear.b(ear1), b));
        d = new hst(ear1) {

            final ear a;
            final eaq b;

            private chp b()
            {
                chp chp = ear.a(a).e();
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
                b = eaq.this;
                a = ear1;
                super();
            }
        };
        e = hsw.a(djc.a(ear.b(ear1), d));
        f = hsw.a(dje.a(ear.b(ear1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(ear1) {

            final ear a;
            final eaq b;

            private hkr b()
            {
                hkr hkr = ear.a(a).aP();
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
                b = eaq.this;
                a = ear1;
                super();
            }
        };
        i = new hst(ear1) {

            final ear a;
            final eaq b;

            private dpg b()
            {
                dpg dpg = ear.a(a).ba();
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
                b = eaq.this;
                a = ear1;
                super();
            }
        };
        j = new hst(ear1) {

            final ear a;
            final eaq b;

            private dkn b()
            {
                dkn dkn = ear.a(a).ai();
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
                b = eaq.this;
                a = ear1;
                super();
            }
        };
        k = new hst(ear1) {

            final ear a;
            final eaq b;

            private hkm b()
            {
                hkm hkm = ear.a(a).bb();
                if (hkm == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hkm;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = eaq.this;
                a = ear1;
                super();
            }
        };
        l = new hst(ear1) {

            final ear a;
            final eaq b;

            private dal b()
            {
                dal dal = ear.a(a).ap();
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
                b = eaq.this;
                a = ear1;
                super();
            }
        };
        m = eay.a(g, b, h, i, j, k, l);
    }

    public final void a(FareEstimateFragment fareestimatefragment)
    {
        m.injectMembers(fareestimatefragment);
    }

    static 
    {
        boolean flag;
        if (!eaq.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
