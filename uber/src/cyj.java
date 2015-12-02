// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.NetworkErrorFragment;
import com.ubercab.client.core.app.RiderApplication;

public final class cyj
    implements cyq
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

    private cyj(cyk cyk1)
    {
        if (!a && cyk1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(cyk1);
            return;
        }
    }

    cyj(cyk cyk1, byte byte0)
    {
        this(cyk1);
    }

    public static cyk a()
    {
        return new cyk((byte)0);
    }

    private void a(cyk cyk1)
    {
        b = new hst(cyk1) {

            final cyk a;
            final cyj b;

            private cev b()
            {
                cev cev = cyk.a(a).D();
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
                b = cyj.this;
                a = cyk1;
                super();
            }
        };
        c = hsw.a(diy.a(cyk.b(cyk1), b));
        d = new hst(cyk1) {

            final cyk a;
            final cyj b;

            private chp b()
            {
                chp chp = cyk.a(a).e();
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
                b = cyj.this;
                a = cyk1;
                super();
            }
        };
        e = hsw.a(dix.a(cyk.b(cyk1), d));
        f = hsw.a(diz.a(cyk.b(cyk1), c, e));
        g = cza.a(hsu.a(), f);
        h = new hst(cyk1) {

            final cyk a;
            final cyj b;

            private dkn b()
            {
                dkn dkn = cyk.a(a).ai();
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
                b = cyj.this;
                a = cyk1;
                super();
            }
        };
        i = new hst(cyk1) {

            final cyk a;
            final cyj b;

            private dal b()
            {
                dal dal = cyk.a(a).ap();
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
                b = cyj.this;
                a = cyk1;
                super();
            }
        };
        j = new hst(cyk1) {

            final cyk a;
            final cyj b;

            private RiderApplication b()
            {
                RiderApplication riderapplication = cyk.a(a).ag();
                if (riderapplication == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return riderapplication;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = cyj.this;
                a = cyk1;
                super();
            }
        };
        k = cyr.a(g, h, d, i, j);
    }

    public final void a(NetworkErrorFragment networkerrorfragment)
    {
        k.injectMembers(networkerrorfragment);
    }

    static 
    {
        boolean flag;
        if (!cyj.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
