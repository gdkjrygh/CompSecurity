// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.faresplit.minion.FareSplitInvitationFragment;

public final class ecj
    implements eco
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

    private ecj(eck eck1)
    {
        if (!a && eck1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(eck1);
            return;
        }
    }

    ecj(eck eck1, byte byte0)
    {
        this(eck1);
    }

    public static eck a()
    {
        return new eck((byte)0);
    }

    private void a(eck eck1)
    {
        b = new hst(eck1) {

            final eck a;
            final ecj b;

            private cev b()
            {
                cev cev = eck.a(a).D();
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
                b = ecj.this;
                a = eck1;
                super();
            }
        };
        c = hsw.a(diy.a(eck.b(eck1), b));
        d = new hst(eck1) {

            final eck a;
            final ecj b;

            private chp b()
            {
                chp chp = eck.a(a).e();
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
                b = ecj.this;
                a = eck1;
                super();
            }
        };
        e = hsw.a(dix.a(eck.b(eck1), d));
        f = hsw.a(diz.a(eck.b(eck1), c, e));
        g = cza.a(hsu.a(), f);
        h = new hst(eck1) {

            final eck a;
            final ecj b;

            private hku b()
            {
                hku hku = eck.a(a).aS();
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
                b = ecj.this;
                a = eck1;
                super();
            }
        };
        i = new hst(eck1) {

            final eck a;
            final ecj b;

            private cgh b()
            {
                cgh cgh = eck.a(a).Z();
                if (cgh == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return cgh;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ecj.this;
                a = eck1;
                super();
            }
        };
        j = new hst(eck1) {

            final eck a;
            final ecj b;

            private dpg b()
            {
                dpg dpg = eck.a(a).ba();
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
                b = ecj.this;
                a = eck1;
                super();
            }
        };
        k = new hst(eck1) {

            final eck a;
            final ecj b;

            private dkn b()
            {
                dkn dkn = eck.a(a).ai();
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
                b = ecj.this;
                a = eck1;
                super();
            }
        };
        l = new hst(eck1) {

            final eck a;
            final ecj b;

            private hkm b()
            {
                hkm hkm = eck.a(a).bb();
                if (hkm == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hkm;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ecj.this;
                a = eck1;
                super();
            }
        };
        m = ecp.a(g, d, b, h, i, j, k, l);
    }

    public final void a(FareSplitInvitationFragment faresplitinvitationfragment)
    {
        m.injectMembers(faresplitinvitationfragment);
    }

    static 
    {
        boolean flag;
        if (!ecj.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
