// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.signup.paytm.SignupPaytmOrCcFragment;

public final class fns
    implements foa
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

    private fns(fnt fnt1)
    {
        if (!a && fnt1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fnt1);
            return;
        }
    }

    fns(fnt fnt1, byte byte0)
    {
        this(fnt1);
    }

    public static fnt a()
    {
        return new fnt((byte)0);
    }

    private void a(fnt fnt1)
    {
        b = new hst(fnt1) {

            final fnt a;
            final fns b;

            private cev b()
            {
                cev cev = fnt.a(a).D();
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
                b = fns.this;
                a = fnt1;
                super();
            }
        };
        c = hsw.a(djd.a(fnt.b(fnt1), b));
        d = new hst(fnt1) {

            final fnt a;
            final fns b;

            private chp b()
            {
                chp chp = fnt.a(a).e();
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
                b = fns.this;
                a = fnt1;
                super();
            }
        };
        e = hsw.a(djc.a(fnt.b(fnt1), d));
        f = hsw.a(dje.a(fnt.b(fnt1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(fnt1) {

            final fnt a;
            final fns b;

            private dkn b()
            {
                dkn dkn = fnt.a(a).ai();
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
                b = fns.this;
                a = fnt1;
                super();
            }
        };
        i = new hst(fnt1) {

            final fnt a;
            final fns b;

            private dkr b()
            {
                dkr dkr = fnt.a(a).as();
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
                b = fns.this;
                a = fnt1;
                super();
            }
        };
        j = fob.a(g, d, b, h, i);
    }

    public final void a(SignupPaytmOrCcFragment signuppaytmorccfragment)
    {
        j.injectMembers(signuppaytmorccfragment);
    }

    static 
    {
        boolean flag;
        if (!fns.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
