// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.vendor.facebook.FacebookAuthorizationFragment;

public final class dwb
    implements dwe
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private dwb(dwc dwc1)
    {
        if (!a && dwc1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(dwc1);
            return;
        }
    }

    dwb(dwc dwc1, byte byte0)
    {
        this(dwc1);
    }

    public static dwc a()
    {
        return new dwc((byte)0);
    }

    private void a(dwc dwc1)
    {
        b = new hst(dwc1) {

            final dwc a;
            final dwb b;

            private cev b()
            {
                cev cev = dwc.a(a).D();
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
                b = dwb.this;
                a = dwc1;
                super();
            }
        };
        c = hsw.a(djd.a(dwc.b(dwc1), b));
        d = new hst(dwc1) {

            final dwc a;
            final dwb b;

            private chp b()
            {
                chp chp = dwc.a(a).e();
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
                b = dwb.this;
                a = dwc1;
                super();
            }
        };
        e = hsw.a(djc.a(dwc.b(dwc1), d));
        f = hsw.a(dje.a(dwc.b(dwc1), c, e));
        g = czc.a(hsu.a(), f);
        h = dwf.a(g, b);
    }

    public final void a(FacebookAuthorizationFragment facebookauthorizationfragment)
    {
        h.injectMembers(facebookauthorizationfragment);
    }

    static 
    {
        boolean flag;
        if (!dwb.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
