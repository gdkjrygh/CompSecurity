// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.passwordreset.PasswordResetNewPasswordFragment;

public final class emj
    implements ene
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

    private emj(emk emk1)
    {
        if (!a && emk1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(emk1);
            return;
        }
    }

    emj(emk emk1, byte byte0)
    {
        this(emk1);
    }

    public static emk a()
    {
        return new emk((byte)0);
    }

    private void a(emk emk1)
    {
        b = new hst(emk1) {

            final emk a;
            final emj b;

            private cev b()
            {
                cev cev = emk.a(a).c();
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
                b = emj.this;
                a = emk1;
                super();
            }
        };
        c = hsw.a(djd.a(emk.b(emk1), b));
        d = new hst(emk1) {

            final emk a;
            final emj b;

            private chp b()
            {
                chp chp = emk.a(a).b();
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
                b = emj.this;
                a = emk1;
                super();
            }
        };
        e = hsw.a(djc.a(emk.b(emk1), d));
        f = hsw.a(dje.a(emk.b(emk1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(emk1) {

            final emk a;
            final emj b;

            private dkf b()
            {
                dkf dkf = emk.a(a).d();
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
                b = emj.this;
                a = emk1;
                super();
            }
        };
        i = new hst(emk1) {

            final emk a;
            final emj b;

            private emu b()
            {
                emu emu = emk.a(a).e();
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
                b = emj.this;
                a = emk1;
                super();
            }
        };
        j = enf.a(g, d, h, i);
    }

    public final void a(PasswordResetNewPasswordFragment passwordresetnewpasswordfragment)
    {
        j.injectMembers(passwordresetnewpasswordfragment);
    }

    static 
    {
        boolean flag;
        if (!emj.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
