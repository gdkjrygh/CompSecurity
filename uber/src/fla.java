// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.signup.SignupPendingFragment;

public final class fla
    implements fmp
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private fla(flb flb1)
    {
        if (!a && flb1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(flb1);
            return;
        }
    }

    fla(flb flb1, byte byte0)
    {
        this(flb1);
    }

    public static flb a()
    {
        return new flb((byte)0);
    }

    private void a(flb flb1)
    {
        b = new hst(flb1) {

            final flb a;
            final fla b;

            private cev b()
            {
                cev cev = flb.a(a).D();
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
                b = fla.this;
                a = flb1;
                super();
            }
        };
        c = hsw.a(djd.a(flb.b(flb1), b));
        d = new hst(flb1) {

            final flb a;
            final fla b;

            private chp b()
            {
                chp chp = flb.a(a).e();
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
                b = fla.this;
                a = flb1;
                super();
            }
        };
        e = hsw.a(djc.a(flb.b(flb1), d));
        f = hsw.a(dje.a(flb.b(flb1), c, e));
        g = czc.a(hsu.a(), f);
        h = fmq.a(g, b);
    }

    public final void a(SignupPendingFragment signuppendingfragment)
    {
        h.injectMembers(signuppendingfragment);
    }

    static 
    {
        boolean flag;
        if (!fla.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
