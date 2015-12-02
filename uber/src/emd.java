// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.passwordreset.PasswordResetConfirmMobileTokenFragment;

public final class emd
    implements emw
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

    private emd(eme eme1)
    {
        if (!a && eme1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(eme1);
            return;
        }
    }

    emd(eme eme1, byte byte0)
    {
        this(eme1);
    }

    public static eme a()
    {
        return new eme((byte)0);
    }

    private void a(eme eme1)
    {
        b = new hst(eme1) {

            final eme a;
            final emd b;

            private cev b()
            {
                cev cev = eme.a(a).c();
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
                b = emd.this;
                a = eme1;
                super();
            }
        };
        c = hsw.a(djd.a(eme.b(eme1), b));
        d = new hst(eme1) {

            final eme a;
            final emd b;

            private chp b()
            {
                chp chp = eme.a(a).b();
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
                b = emd.this;
                a = eme1;
                super();
            }
        };
        e = hsw.a(djc.a(eme.b(eme1), d));
        f = hsw.a(dje.a(eme.b(eme1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(eme1) {

            final eme a;
            final emd b;

            private dkf b()
            {
                dkf dkf = eme.a(a).d();
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
                b = emd.this;
                a = eme1;
                super();
            }
        };
        i = new hst(eme1) {

            final eme a;
            final emd b;

            private emu b()
            {
                emu emu = eme.a(a).e();
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
                b = emd.this;
                a = eme1;
                super();
            }
        };
        j = emx.a(g, d, h, i);
    }

    public final void a(PasswordResetConfirmMobileTokenFragment passwordresetconfirmmobiletokenfragment)
    {
        j.injectMembers(passwordresetconfirmmobiletokenfragment);
    }

    static 
    {
        boolean flag;
        if (!emd.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
