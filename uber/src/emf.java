// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.passwordreset.PasswordResetConfirmTripsFailedFragment;

public final class emf
    implements emy
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

    private emf(emg emg1)
    {
        if (!a && emg1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(emg1);
            return;
        }
    }

    emf(emg emg1, byte byte0)
    {
        this(emg1);
    }

    public static emg a()
    {
        return new emg((byte)0);
    }

    private void a(emg emg1)
    {
        b = new hst(emg1) {

            final emg a;
            final emf b;

            private cev b()
            {
                cev cev = emg.a(a).c();
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
                b = emf.this;
                a = emg1;
                super();
            }
        };
        c = hsw.a(djd.a(emg.b(emg1), b));
        d = new hst(emg1) {

            final emg a;
            final emf b;

            private chp b()
            {
                chp chp = emg.a(a).b();
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
                b = emf.this;
                a = emg1;
                super();
            }
        };
        e = hsw.a(djc.a(emg.b(emg1), d));
        f = hsw.a(dje.a(emg.b(emg1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(emg1) {

            final emg a;
            final emf b;

            private dkf b()
            {
                dkf dkf = emg.a(a).d();
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
                b = emf.this;
                a = emg1;
                super();
            }
        };
        i = new hst(emg1) {

            final emg a;
            final emf b;

            private emu b()
            {
                emu emu = emg.a(a).e();
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
                b = emf.this;
                a = emg1;
                super();
            }
        };
        j = emz.a(g, d, h, i);
    }

    public final void a(PasswordResetConfirmTripsFailedFragment passwordresetconfirmtripsfailedfragment)
    {
        j.injectMembers(passwordresetconfirmtripsfailedfragment);
    }

    static 
    {
        boolean flag;
        if (!emf.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
