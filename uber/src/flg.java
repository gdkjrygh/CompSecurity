// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.signup.VerifyFacebookProfileFragment;

public final class flg
    implements fmy
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
    private hsr j;

    private flg(flh flh1)
    {
        if (!a && flh1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(flh1);
            return;
        }
    }

    flg(flh flh1, byte byte0)
    {
        this(flh1);
    }

    public static flh a()
    {
        return new flh((byte)0);
    }

    private void a(flh flh1)
    {
        b = new hst(flh1) {

            final flh a;
            final flg b;

            private cev b()
            {
                cev cev = flh.a(a).D();
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
                b = flg.this;
                a = flh1;
                super();
            }
        };
        c = hsw.a(djd.a(flh.b(flh1), b));
        d = new hst(flh1) {

            final flh a;
            final flg b;

            private chp b()
            {
                chp chp = flh.a(a).e();
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
                b = flg.this;
                a = flh1;
                super();
            }
        };
        e = hsw.a(djc.a(flh.b(flh1), d));
        f = hsw.a(dje.a(flh.b(flh1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(flh1) {

            final flh a;
            final flg b;

            private gmg b()
            {
                gmg gmg = flh.a(a).f();
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
                b = flg.this;
                a = flh1;
                super();
            }
        };
        i = new hst(flh1) {

            final flh a;
            final flg b;

            private dkr b()
            {
                dkr dkr = flh.a(a).as();
                if (dkr == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dkr;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = flg.this;
                a = flh1;
                super();
            }
        };
        j = fmz.a(g, d, b, h, i);
    }

    public final void a(VerifyFacebookProfileFragment verifyfacebookprofilefragment)
    {
        j.injectMembers(verifyfacebookprofilefragment);
    }

    static 
    {
        boolean flag;
        if (!flg.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
