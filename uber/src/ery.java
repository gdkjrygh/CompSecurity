// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.expense.ExpenseInfoFragment;

public final class ery
    implements esd
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

    private ery(erz erz1)
    {
        if (!a && erz1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(erz1);
            return;
        }
    }

    ery(erz erz1, byte byte0)
    {
        this(erz1);
    }

    public static erz a()
    {
        return new erz((byte)0);
    }

    private void a(erz erz1)
    {
        b = new hst(erz1) {

            final erz a;
            final ery b;

            private cev b()
            {
                cev cev = erz.a(a).D();
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
                b = ery.this;
                a = erz1;
                super();
            }
        };
        c = hsw.a(djd.a(erz.b(erz1), b));
        d = new hst(erz1) {

            final erz a;
            final ery b;

            private chp b()
            {
                chp chp = erz.a(a).e();
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
                b = ery.this;
                a = erz1;
                super();
            }
        };
        e = hsw.a(djc.a(erz.b(erz1), d));
        f = hsw.a(dje.a(erz.b(erz1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(erz1) {

            final erz a;
            final ery b;

            private hkr b()
            {
                hkr hkr = erz.a(a).aP();
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
                b = ery.this;
                a = erz1;
                super();
            }
        };
        i = new hst(erz1) {

            final erz a;
            final ery b;

            private gmg b()
            {
                gmg gmg = erz.a(a).f();
                if (gmg == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return gmg;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ery.this;
                a = erz1;
                super();
            }
        };
        j = new hst(erz1) {

            final erz a;
            final ery b;

            private dal b()
            {
                dal dal = erz.a(a).ap();
                if (dal == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dal;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ery.this;
                a = erz1;
                super();
            }
        };
        k = ese.a(g, d, b, h, i, j);
    }

    public final void a(ExpenseInfoFragment expenseinfofragment)
    {
        k.injectMembers(expenseinfofragment);
    }

    static 
    {
        boolean flag;
        if (!ery.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
