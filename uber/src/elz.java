// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.passwordreset.PasswordResetAccountInputFragment;

public final class elz
    implements eml
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

    private elz(ema ema1)
    {
        if (!a && ema1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ema1);
            return;
        }
    }

    elz(ema ema1, byte byte0)
    {
        this(ema1);
    }

    public static ema a()
    {
        return new ema((byte)0);
    }

    private void a(ema ema1)
    {
        b = new hst(ema1) {

            final ema a;
            final elz b;

            private cev b()
            {
                cev cev = ema.a(a).c();
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
                b = elz.this;
                a = ema1;
                super();
            }
        };
        c = hsw.a(djd.a(ema.b(ema1), b));
        d = new hst(ema1) {

            final ema a;
            final elz b;

            private chp b()
            {
                chp chp = ema.a(a).b();
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
                b = elz.this;
                a = ema1;
                super();
            }
        };
        e = hsw.a(djc.a(ema.b(ema1), d));
        f = hsw.a(dje.a(ema.b(ema1), c, e));
        g = czc.a(hsu.a(), f);
        h = hsw.a(emn.a(ema.c(ema1)));
        i = new hst(ema1) {

            final ema a;
            final elz b;

            private dkf b()
            {
                dkf dkf = ema.a(a).d();
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
                b = elz.this;
                a = ema1;
                super();
            }
        };
        j = new hst(ema1) {

            final ema a;
            final elz b;

            private emu b()
            {
                emu emu = ema.a(a).e();
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
                b = elz.this;
                a = ema1;
                super();
            }
        };
        k = emo.a(g, d, h, i, j);
    }

    public final void a(PasswordResetAccountInputFragment passwordresetaccountinputfragment)
    {
        k.injectMembers(passwordresetaccountinputfragment);
    }

    static 
    {
        boolean flag;
        if (!elz.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
