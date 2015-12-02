// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.settings.VerifyPasswordDialogFragment;

public final class fgu
    implements fhf
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

    private fgu(fgv fgv1)
    {
        if (!a && fgv1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fgv1);
            return;
        }
    }

    fgu(fgv fgv1, byte byte0)
    {
        this(fgv1);
    }

    public static fgv a()
    {
        return new fgv((byte)0);
    }

    private void a(fgv fgv1)
    {
        b = new hst(fgv1) {

            final fgv a;
            final fgu b;

            private cev b()
            {
                cev cev = fgv.a(a).D();
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
                b = fgu.this;
                a = fgv1;
                super();
            }
        };
        c = hsw.a(diy.a(fgv.b(fgv1), b));
        d = new hst(fgv1) {

            final fgv a;
            final fgu b;

            private chp b()
            {
                chp chp = fgv.a(a).e();
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
                b = fgu.this;
                a = fgv1;
                super();
            }
        };
        e = hsw.a(dix.a(fgv.b(fgv1), d));
        f = hsw.a(diz.a(fgv.b(fgv1), c, e));
        g = cza.a(hsu.a(), f);
        h = new hst(fgv1) {

            final fgv a;
            final fgu b;

            private djx b()
            {
                djx djx = fgv.a(a).A();
                if (djx == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return djx;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fgu.this;
                a = fgv1;
                super();
            }
        };
        i = fhg.a(g, h, d, b);
    }

    public final void a(VerifyPasswordDialogFragment verifypassworddialogfragment)
    {
        i.injectMembers(verifypassworddialogfragment);
    }

    static 
    {
        boolean flag;
        if (!fgu.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
