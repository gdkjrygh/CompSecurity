// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.verification.MobileVerificationDialogFragment;

public final class gij
    implements gix
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private gij(gik gik1)
    {
        if (!a && gik1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gik1);
            return;
        }
    }

    gij(gik gik1, byte byte0)
    {
        this(gik1);
    }

    public static gik a()
    {
        return new gik((byte)0);
    }

    private void a(gik gik1)
    {
        b = new hst(gik1) {

            final gik a;
            final gij b;

            private cev b()
            {
                cev cev = gik.a(a).D();
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
                b = gij.this;
                a = gik1;
                super();
            }
        };
        c = hsw.a(diy.a(gik.b(gik1), b));
        d = new hst(gik1) {

            final gik a;
            final gij b;

            private chp b()
            {
                chp chp = gik.a(a).e();
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
                b = gij.this;
                a = gik1;
                super();
            }
        };
        e = hsw.a(dix.a(gik.b(gik1), d));
        f = hsw.a(diz.a(gik.b(gik1), c, e));
        g = cza.a(hsu.a(), f);
        h = hsu.a(g);
    }

    public final void a(MobileVerificationDialogFragment mobileverificationdialogfragment)
    {
        h.injectMembers(mobileverificationdialogfragment);
    }

    static 
    {
        boolean flag;
        if (!gij.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
