// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.upgrade.UpgradeFragment;

public final class ghx
    implements ghz
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

    private ghx(ghy ghy1)
    {
        if (!a && ghy1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ghy1);
            return;
        }
    }

    ghx(ghy ghy1, byte byte0)
    {
        this(ghy1);
    }

    public static ghy a()
    {
        return new ghy((byte)0);
    }

    private void a(ghy ghy1)
    {
        b = new hst(ghy1) {

            final ghy a;
            final ghx b;

            private cev b()
            {
                cev cev = ghy.a(a).D();
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
                b = ghx.this;
                a = ghy1;
                super();
            }
        };
        c = hsw.a(diy.a(ghy.b(ghy1), b));
        d = new hst(ghy1) {

            final ghy a;
            final ghx b;

            private chp b()
            {
                chp chp = ghy.a(a).e();
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
                b = ghx.this;
                a = ghy1;
                super();
            }
        };
        e = hsw.a(dix.a(ghy.b(ghy1), d));
        f = hsw.a(diz.a(ghy.b(ghy1), c, e));
        g = cza.a(hsu.a(), f);
        h = new hst(ghy1) {

            final ghy a;
            final ghx b;

            private czf b()
            {
                czf czf = ghy.a(a).am();
                if (czf == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return czf;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ghx.this;
                a = ghy1;
                super();
            }
        };
        i = gia.a(g, h);
    }

    public final void a(UpgradeFragment upgradefragment)
    {
        i.injectMembers(upgradefragment);
    }

    static 
    {
        boolean flag;
        if (!ghx.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
