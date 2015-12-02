// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.receipt.MealReceiptFragment;

public final class fce
    implements fcz
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

    private fce(fcf fcf1)
    {
        if (!a && fcf1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fcf1);
            return;
        }
    }

    fce(fcf fcf1, byte byte0)
    {
        this(fcf1);
    }

    public static fcf a()
    {
        return new fcf((byte)0);
    }

    private void a(fcf fcf1)
    {
        b = new hst(fcf1) {

            final fcf a;
            final fce b;

            private cev b()
            {
                cev cev = fcf.a(a).D();
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
                b = fce.this;
                a = fcf1;
                super();
            }
        };
        c = hsw.a(djd.a(fcf.b(fcf1), b));
        d = new hst(fcf1) {

            final fcf a;
            final fce b;

            private chp b()
            {
                chp chp = fcf.a(a).e();
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
                b = fce.this;
                a = fcf1;
                super();
            }
        };
        e = hsw.a(djc.a(fcf.b(fcf1), d));
        f = hsw.a(dje.a(fcf.b(fcf1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(fcf1) {

            final fcf a;
            final fce b;

            private cgh b()
            {
                cgh cgh = fcf.a(a).Z();
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
                b = fce.this;
                a = fcf1;
                super();
            }
        };
        i = fdb.a(g, d, h);
    }

    public final void a(MealReceiptFragment mealreceiptfragment)
    {
        i.injectMembers(mealreceiptfragment);
    }

    static 
    {
        boolean flag;
        if (!fce.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
