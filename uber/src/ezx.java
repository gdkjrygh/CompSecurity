// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.profiles.onboarding.OnBoardingIntroImageFragment;

public final class ezx
    implements fae
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

    private ezx(ezy ezy1)
    {
        if (!a && ezy1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ezy1);
            return;
        }
    }

    ezx(ezy ezy1, byte byte0)
    {
        this(ezy1);
    }

    public static ezy a()
    {
        return new ezy((byte)0);
    }

    private void a(ezy ezy1)
    {
        b = new hst(ezy1) {

            final ezy a;
            final ezx b;

            private cev b()
            {
                cev cev = ezy.a(a).D();
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
                b = ezx.this;
                a = ezy1;
                super();
            }
        };
        c = hsw.a(djd.a(ezy.b(ezy1), b));
        d = new hst(ezy1) {

            final ezy a;
            final ezx b;

            private chp b()
            {
                chp chp = ezy.a(a).e();
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
                b = ezx.this;
                a = ezy1;
                super();
            }
        };
        e = hsw.a(djc.a(ezy.b(ezy1), d));
        f = hsw.a(dje.a(ezy.b(ezy1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(ezy1) {

            final ezy a;
            final ezx b;

            private cgh b()
            {
                cgh cgh = ezy.a(a).Z();
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
                b = ezx.this;
                a = ezy1;
                super();
            }
        };
        i = faf.a(g, h);
    }

    public final void a(OnBoardingIntroImageFragment onboardingintroimagefragment)
    {
        i.injectMembers(onboardingintroimagefragment);
    }

    static 
    {
        boolean flag;
        if (!ezx.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
