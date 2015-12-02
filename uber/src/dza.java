// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.emergency.EmergencyFragment;

public final class dza
    implements dze
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

    private dza(dzb dzb1)
    {
        if (!a && dzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(dzb1);
            return;
        }
    }

    dza(dzb dzb1, byte byte0)
    {
        this(dzb1);
    }

    public static dzb a()
    {
        return new dzb((byte)0);
    }

    private void a(dzb dzb1)
    {
        b = new hst(dzb1) {

            final dzb a;
            final dza b;

            private cev b()
            {
                cev cev = dzb.a(a).D();
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
                b = dza.this;
                a = dzb1;
                super();
            }
        };
        c = hsw.a(diy.a(dzb.b(dzb1), b));
        d = new hst(dzb1) {

            final dzb a;
            final dza b;

            private chp b()
            {
                chp chp = dzb.a(a).e();
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
                b = dza.this;
                a = dzb1;
                super();
            }
        };
        e = hsw.a(dix.a(dzb.b(dzb1), d));
        f = hsw.a(diz.a(dzb.b(dzb1), c, e));
        g = cza.a(hsu.a(), f);
        h = new hst(dzb1) {

            final dzb a;
            final dza b;

            private drc b()
            {
                drc drc = dzb.a(a).aN();
                if (drc == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return drc;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dza.this;
                a = dzb1;
                super();
            }
        };
        i = new hst(dzb1) {

            final dzb a;
            final dza b;

            private dzi b()
            {
                dzi dzi = dzb.a(a).J();
                if (dzi == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dzi;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dza.this;
                a = dzb1;
                super();
            }
        };
        j = new hst(dzb1) {

            final dzb a;
            final dza b;

            private gmg b()
            {
                gmg gmg = dzb.a(a).f();
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
                b = dza.this;
                a = dzb1;
                super();
            }
        };
        k = dzf.a(g, d, h, i, j);
    }

    public final void a(EmergencyFragment emergencyfragment)
    {
        k.injectMembers(emergencyfragment);
    }

    static 
    {
        boolean flag;
        if (!dza.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
