// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.ubercab.client.feature.payment.paytm.PaytmOrCcFragment;

public final class etg
    implements eub
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
    private hzb k;
    private hzb l;
    private hsr m;

    private etg(eth eth1)
    {
        if (!a && eth1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(eth1);
            return;
        }
    }

    etg(eth eth1, byte byte0)
    {
        this(eth1);
    }

    public static eth a()
    {
        return new eth((byte)0);
    }

    private void a(eth eth1)
    {
        b = new hst(eth1) {

            final eth a;
            final etg b;

            private cev b()
            {
                cev cev = eth.a(a).d();
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
                b = etg.this;
                a = eth1;
                super();
            }
        };
        c = hsw.a(djd.a(eth.b(eth1), b));
        d = new hst(eth1) {

            final eth a;
            final etg b;

            private chp b()
            {
                chp chp = eth.a(a).a();
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
                b = etg.this;
                a = eth1;
                super();
            }
        };
        e = hsw.a(djc.a(eth.b(eth1), d));
        f = hsw.a(dje.a(eth.b(eth1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(eth1) {

            final eth a;
            final etg b;

            private Application b()
            {
                Application application = eth.a(a).b();
                if (application == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return application;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = etg.this;
                a = eth1;
                super();
            }
        };
        i = new hst(eth1) {

            final eth a;
            final etg b;

            private hku b()
            {
                hku hku = eth.a(a).e();
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
                b = etg.this;
                a = eth1;
                super();
            }
        };
        j = new hst(eth1) {

            final eth a;
            final etg b;

            private hkj b()
            {
                hkj hkj = eth.a(a).h();
                if (hkj == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hkj;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = etg.this;
                a = eth1;
                super();
            }
        };
        k = new hst(eth1) {

            final eth a;
            final etg b;

            private dpg b()
            {
                dpg dpg = eth.a(a).j();
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
                b = etg.this;
                a = eth1;
                super();
            }
        };
        l = new hst(eth1) {

            final eth a;
            final etg b;

            private dkn b()
            {
                dkn dkn = eth.a(a).l();
                if (dkn == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dkn;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = etg.this;
                a = eth1;
                super();
            }
        };
        m = euc.a(g, d, h, b, i, j, k, l);
    }

    public final void a(PaytmOrCcFragment paytmorccfragment)
    {
        m.injectMembers(paytmorccfragment);
    }

    static 
    {
        boolean flag;
        if (!etg.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
