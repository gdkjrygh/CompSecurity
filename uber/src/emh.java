// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.passwordreset.PasswordResetConfirmTripsFragment;

public final class emh
    implements ena
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

    private emh(emi emi1)
    {
        if (!a && emi1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(emi1);
            return;
        }
    }

    emh(emi emi1, byte byte0)
    {
        this(emi1);
    }

    public static emi a()
    {
        return new emi((byte)0);
    }

    private void a(emi emi1)
    {
        b = new hst(emi1) {

            final emi a;
            final emh b;

            private cev b()
            {
                cev cev = emi.a(a).c();
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
                b = emh.this;
                a = emi1;
                super();
            }
        };
        c = hsw.a(djd.a(emi.b(emi1), b));
        d = new hst(emi1) {

            final emi a;
            final emh b;

            private chp b()
            {
                chp chp = emi.a(a).b();
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
                b = emh.this;
                a = emi1;
                super();
            }
        };
        e = hsw.a(djc.a(emi.b(emi1), d));
        f = hsw.a(dje.a(emi.b(emi1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(emi1) {

            final emi a;
            final emh b;

            private dkf b()
            {
                dkf dkf = emi.a(a).d();
                if (dkf == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dkf;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = emh.this;
                a = emi1;
                super();
            }
        };
        i = new hst(emi1) {

            final emi a;
            final emh b;

            private emu b()
            {
                emu emu = emi.a(a).e();
                if (emu == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return emu;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = emh.this;
                a = emi1;
                super();
            }
        };
        j = enc.a(emi.c(emi1));
        k = end.a(g, d, h, i, j);
    }

    public final void a(PasswordResetConfirmTripsFragment passwordresetconfirmtripsfragment)
    {
        k.injectMembers(passwordresetconfirmtripsfragment);
    }

    static 
    {
        boolean flag;
        if (!emh.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
