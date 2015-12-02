// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.partner.external.PartnerOnboardingFinishedFragment;

public final class els
    implements elw
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private els(elt elt1)
    {
        if (!a && elt1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(elt1);
            return;
        }
    }

    els(elt elt1, byte byte0)
    {
        this(elt1);
    }

    public static elt a()
    {
        return new elt((byte)0);
    }

    private void a(elt elt1)
    {
        b = new hst(elt1) {

            final elt a;
            final els b;

            private cev b()
            {
                cev cev = elt.a(a).D();
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
                b = els.this;
                a = elt1;
                super();
            }
        };
        c = hsw.a(djd.a(elt.b(elt1), b));
        d = new hst(elt1) {

            final elt a;
            final els b;

            private chp b()
            {
                chp chp = elt.a(a).e();
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
                b = els.this;
                a = elt1;
                super();
            }
        };
        e = hsw.a(djc.a(elt.b(elt1), d));
        f = hsw.a(dje.a(elt.b(elt1), c, e));
        g = czc.a(hsu.a(), f);
        h = elx.a(g, d);
    }

    public final void a(PartnerOnboardingFinishedFragment partneronboardingfinishedfragment)
    {
        h.injectMembers(partneronboardingfinishedfragment);
    }

    static 
    {
        boolean flag;
        if (!els.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
