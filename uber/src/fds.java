// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.safetynet.SafetyNetConfiguredShareTripFragment;

public final class fds
    implements fee
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

    private fds(fdt fdt1)
    {
        if (!a && fdt1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fdt1);
            return;
        }
    }

    fds(fdt fdt1, byte byte0)
    {
        this(fdt1);
    }

    public static fdt a()
    {
        return new fdt((byte)0);
    }

    private void a(fdt fdt1)
    {
        b = new hst(fdt1) {

            final fdt a;
            final fds b;

            private cev b()
            {
                cev cev = fdt.a(a).D();
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
                b = fds.this;
                a = fdt1;
                super();
            }
        };
        c = hsw.a(djd.a(fdt.b(fdt1), b));
        d = new hst(fdt1) {

            final fdt a;
            final fds b;

            private chp b()
            {
                chp chp = fdt.a(a).e();
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
                b = fds.this;
                a = fdt1;
                super();
            }
        };
        e = hsw.a(djc.a(fdt.b(fdt1), d));
        f = hsw.a(dje.a(fdt.b(fdt1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(fdt1) {

            final fdt a;
            final fds b;

            private fei b()
            {
                fei fei = fdt.a(a).ao();
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
                b = fds.this;
                a = fdt1;
                super();
            }
        };
        i = fef.a(g, b, h);
    }

    public final void a(SafetyNetConfiguredShareTripFragment safetynetconfiguredsharetripfragment)
    {
        i.injectMembers(safetynetconfiguredsharetripfragment);
    }

    static 
    {
        boolean flag;
        if (!fds.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
