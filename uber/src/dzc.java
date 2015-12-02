// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.emergency.EmergencyHelpChooserFragment;

public final class dzc
    implements dzg
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
    private hsr j;

    private dzc(dzd dzd1)
    {
        if (!a && dzd1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(dzd1);
            return;
        }
    }

    dzc(dzd dzd1, byte byte0)
    {
        this(dzd1);
    }

    public static dzd a()
    {
        return new dzd((byte)0);
    }

    private void a(dzd dzd1)
    {
        b = new hst(dzd1) {

            final dzd a;
            final dzc b;

            private cev b()
            {
                cev cev = dzd.a(a).D();
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
                b = dzc.this;
                a = dzd1;
                super();
            }
        };
        c = hsw.a(diy.a(dzd.b(dzd1), b));
        d = new hst(dzd1) {

            final dzd a;
            final dzc b;

            private chp b()
            {
                chp chp = dzd.a(a).e();
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
                b = dzc.this;
                a = dzd1;
                super();
            }
        };
        e = hsw.a(dix.a(dzd.b(dzd1), d));
        f = hsw.a(diz.a(dzd.b(dzd1), c, e));
        g = cza.a(hsu.a(), f);
        h = new hst(dzd1) {

            final dzd a;
            final dzc b;

            private hkr b()
            {
                hkr hkr = dzd.a(a).aP();
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
                b = dzc.this;
                a = dzd1;
                super();
            }
        };
        i = new hst(dzd1) {

            final dzd a;
            final dzc b;

            private gmg b()
            {
                gmg gmg = dzd.a(a).f();
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
                b = dzc.this;
                a = dzd1;
                super();
            }
        };
        j = dzh.a(g, d, h, i);
    }

    public final void a(EmergencyHelpChooserFragment emergencyhelpchooserfragment)
    {
        j.injectMembers(emergencyhelpchooserfragment);
    }

    static 
    {
        boolean flag;
        if (!dzc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
