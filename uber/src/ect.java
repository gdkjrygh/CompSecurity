// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.forceupgrade.ForceUpgradeFragment;

public final class ect
    implements ecw
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private ect(ecu ecu1)
    {
        if (!a && ecu1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ecu1);
            return;
        }
    }

    ect(ecu ecu1, byte byte0)
    {
        this(ecu1);
    }

    public static ecu a()
    {
        return new ecu((byte)0);
    }

    private void a(ecu ecu1)
    {
        b = new hst(ecu1) {

            final ecu a;
            final ect b;

            private cev b()
            {
                cev cev = ecu.a(a).D();
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
                b = ect.this;
                a = ecu1;
                super();
            }
        };
        c = hsw.a(djd.a(ecu.b(ecu1), b));
        d = new hst(ecu1) {

            final ecu a;
            final ect b;

            private chp b()
            {
                chp chp = ecu.a(a).e();
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
                b = ect.this;
                a = ecu1;
                super();
            }
        };
        e = hsw.a(djc.a(ecu.b(ecu1), d));
        f = hsw.a(dje.a(ecu.b(ecu1), c, e));
        g = czc.a(hsu.a(), f);
        h = hsu.a(g);
    }

    public final void a(ForceUpgradeFragment forceupgradefragment)
    {
        h.injectMembers(forceupgradefragment);
    }

    static 
    {
        boolean flag;
        if (!ect.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
