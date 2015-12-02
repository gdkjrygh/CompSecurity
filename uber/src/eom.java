// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.EditDelegatePaymentProfileFragment;

public final class eom
    implements epg
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

    private eom(eon eon1)
    {
        if (!a && eon1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(eon1);
            return;
        }
    }

    eom(eon eon1, byte byte0)
    {
        this(eon1);
    }

    public static eon a()
    {
        return new eon((byte)0);
    }

    private void a(eon eon1)
    {
        b = new hst(eon1) {

            final eon a;
            final eom b;

            private cev b()
            {
                cev cev = eon.a(a).D();
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
                b = eom.this;
                a = eon1;
                super();
            }
        };
        c = hsw.a(djd.a(eon.b(eon1), b));
        d = new hst(eon1) {

            final eon a;
            final eom b;

            private chp b()
            {
                chp chp = eon.a(a).e();
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
                b = eom.this;
                a = eon1;
                super();
            }
        };
        e = hsw.a(djc.a(eon.b(eon1), d));
        f = hsw.a(dje.a(eon.b(eon1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(eon1) {

            final eon a;
            final eom b;

            private hkr b()
            {
                hkr hkr = eon.a(a).aP();
                if (hkr == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hkr;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = eom.this;
                a = eon1;
                super();
            }
        };
        i = new hst(eon1) {

            final eon a;
            final eom b;

            private hku b()
            {
                hku hku = eon.a(a).aS();
                if (hku == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hku;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = eom.this;
                a = eon1;
                super();
            }
        };
        j = new hst(eon1) {

            final eon a;
            final eom b;

            private dpg b()
            {
                dpg dpg = eon.a(a).ba();
                if (dpg == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dpg;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = eom.this;
                a = eon1;
                super();
            }
        };
        k = eph.a(g, b, h, i, j);
    }

    public final void a(EditDelegatePaymentProfileFragment editdelegatepaymentprofilefragment)
    {
        k.injectMembers(editdelegatepaymentprofilefragment);
    }

    static 
    {
        boolean flag;
        if (!eom.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
