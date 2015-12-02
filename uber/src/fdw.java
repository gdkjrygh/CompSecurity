// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.safetynet.SafetyNetNotConfiguredShareTripFragment;

public final class fdw
    implements fel
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
    private hsr l;

    private fdw(fdx fdx1)
    {
        if (!a && fdx1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fdx1);
            return;
        }
    }

    fdw(fdx fdx1, byte byte0)
    {
        this(fdx1);
    }

    public static fdx a()
    {
        return new fdx((byte)0);
    }

    private void a(fdx fdx1)
    {
        b = new hst(fdx1) {

            final fdx a;
            final fdw b;

            private cev b()
            {
                cev cev = fdx.a(a).D();
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
                b = fdw.this;
                a = fdx1;
                super();
            }
        };
        c = hsw.a(djd.a(fdx.b(fdx1), b));
        d = new hst(fdx1) {

            final fdx a;
            final fdw b;

            private chp b()
            {
                chp chp = fdx.a(a).e();
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
                b = fdw.this;
                a = fdx1;
                super();
            }
        };
        e = hsw.a(djc.a(fdx.b(fdx1), d));
        f = hsw.a(dje.a(fdx.b(fdx1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(fdx1) {

            final fdx a;
            final fdw b;

            private gmg b()
            {
                gmg gmg = fdx.a(a).f();
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
                b = fdw.this;
                a = fdx1;
                super();
            }
        };
        i = new hst(fdx1) {

            final fdx a;
            final fdw b;

            private cys b()
            {
                cys cys = fdx.a(a).X();
                if (cys == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return cys;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fdw.this;
                a = fdx1;
                super();
            }
        };
        j = new hst(fdx1) {

            final fdx a;
            final fdw b;

            private cgh b()
            {
                cgh cgh = fdx.a(a).Z();
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
                b = fdw.this;
                a = fdx1;
                super();
            }
        };
        k = new hst(fdx1) {

            final fdx a;
            final fdw b;

            private fei b()
            {
                fei fei = fdx.a(a).ao();
                if (fei == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return fei;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fdw.this;
                a = fdx1;
                super();
            }
        };
        l = fem.a(g, d, b, h, i, j, k);
    }

    public final void a(SafetyNetNotConfiguredShareTripFragment safetynetnotconfiguredsharetripfragment)
    {
        l.injectMembers(safetynetnotconfiguredsharetripfragment);
    }

    static 
    {
        boolean flag;
        if (!fdw.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
