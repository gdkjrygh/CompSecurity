// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.profiles.OnBoardingFinishedFragment;

public final class exr
    implements eyl
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

    private exr(exs exs1)
    {
        if (!a && exs1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(exs1);
            return;
        }
    }

    exr(exs exs1, byte byte0)
    {
        this(exs1);
    }

    public static exs a()
    {
        return new exs((byte)0);
    }

    private void a(exs exs1)
    {
        b = new hst(exs1) {

            final exs a;
            final exr b;

            private cev b()
            {
                cev cev = exs.a(a).D();
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
                b = exr.this;
                a = exs1;
                super();
            }
        };
        c = hsw.a(djd.a(exs.b(exs1), b));
        d = new hst(exs1) {

            final exs a;
            final exr b;

            private chp b()
            {
                chp chp = exs.a(a).e();
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
                b = exr.this;
                a = exs1;
                super();
            }
        };
        e = hsw.a(djc.a(exs.b(exs1), d));
        f = hsw.a(dje.a(exs.b(exs1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(exs1) {

            final exs a;
            final exr b;

            private hkr b()
            {
                hkr hkr = exs.a(a).aP();
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
                b = exr.this;
                a = exs1;
                super();
            }
        };
        i = new hst(exs1) {

            final exs a;
            final exr b;

            private cgh b()
            {
                cgh cgh = exs.a(a).Z();
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
                b = exr.this;
                a = exs1;
                super();
            }
        };
        j = new hst(exs1) {

            final exs a;
            final exr b;

            private eyy b()
            {
                eyy eyy = exs.a(a).al();
                if (eyy == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return eyy;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = exr.this;
                a = exs1;
                super();
            }
        };
        k = eym.a(g, d, b, h, i, j);
    }

    public final void a(OnBoardingFinishedFragment onboardingfinishedfragment)
    {
        k.injectMembers(onboardingfinishedfragment);
    }

    static 
    {
        boolean flag;
        if (!exr.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
