// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fhm
    implements fhy
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;
    private hzb i;
    private hzb j;
    private hsr k;

    private fhm(fhn fhn1)
    {
        if (!a && fhn1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fhn1);
            return;
        }
    }

    fhm(fhn fhn1, byte byte0)
    {
        this(fhn1);
    }

    public static fhn a()
    {
        return new fhn((byte)0);
    }

    private void a(fhn fhn1)
    {
        b = new hst(fhn1) {

            final fhn a;
            final fhm b;

            private cev b()
            {
                cev cev = fhn.a(a).D();
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
                b = fhm.this;
                a = fhn1;
                super();
            }
        };
        c = hsw.a(djd.a(fhn.b(fhn1), b));
        d = new hst(fhn1) {

            final fhn a;
            final fhm b;

            private chp b()
            {
                chp chp = fhn.a(a).e();
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
                b = fhm.this;
                a = fhn1;
                super();
            }
        };
        e = hsw.a(djc.a(fhn.b(fhn1), d));
        f = hsw.a(dje.a(fhn.b(fhn1), c, e));
        g = czc.a(hsu.a(), f);
        h = hsu.a(g);
        i = new hst(fhn1) {

            final fhn a;
            final fhm b;

            private dkc b()
            {
                dkc dkc = fhn.a(a).P();
                if (dkc == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dkc;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fhm.this;
                a = fhn1;
                super();
            }
        };
        j = new hst(fhn1) {

            final fhn a;
            final fhm b;

            private cgh b()
            {
                cgh cgh = fhn.a(a).Z();
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
                b = fhm.this;
                a = fhn1;
                super();
            }
        };
        k = fhz.a(h, d, i, j);
    }

    public final void a(fhx fhx)
    {
        k.injectMembers(fhx);
    }

    static 
    {
        boolean flag;
        if (!fhm.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
