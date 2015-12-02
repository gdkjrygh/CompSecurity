// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.amex.AmexRewardInfoFragment;

public final class erd
    implements eqy
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hzb h;
    private hsr i;

    private erd(ere ere1)
    {
        if (!a && ere1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ere1);
            return;
        }
    }

    erd(ere ere1, byte byte0)
    {
        this(ere1);
    }

    public static ere a()
    {
        return new ere((byte)0);
    }

    private void a(ere ere1)
    {
        b = new hst(ere1) {

            final ere a;
            final erd b;

            private cev b()
            {
                cev cev = ere.a(a).D();
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
                b = erd.this;
                a = ere1;
                super();
            }
        };
        c = hsw.a(djd.a(ere.b(ere1), b));
        d = new hst(ere1) {

            final ere a;
            final erd b;

            private chp b()
            {
                chp chp = ere.a(a).e();
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
                b = erd.this;
                a = ere1;
                super();
            }
        };
        e = hsw.a(djc.a(ere.b(ere1), d));
        f = hsw.a(dje.a(ere.b(ere1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(ere1) {

            final ere a;
            final erd b;

            private dkn b()
            {
                dkn dkn = ere.a(a).ai();
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
                b = erd.this;
                a = ere1;
                super();
            }
        };
        i = eqz.a(g, h);
    }

    public final void a(AmexRewardInfoFragment amexrewardinfofragment)
    {
        i.injectMembers(amexrewardinfofragment);
    }

    static 
    {
        boolean flag;
        if (!erd.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
