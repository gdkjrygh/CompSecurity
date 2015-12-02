// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.share.LegacyShareFragment;

public final class fhi
    implements fhu
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

    private fhi(fhj fhj1)
    {
        if (!a && fhj1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fhj1);
            return;
        }
    }

    fhi(fhj fhj1, byte byte0)
    {
        this(fhj1);
    }

    public static fhj a()
    {
        return new fhj((byte)0);
    }

    private void a(fhj fhj1)
    {
        b = new hst(fhj1) {

            final fhj a;
            final fhi b;

            private cev b()
            {
                cev cev = fhj.a(a).D();
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
                b = fhi.this;
                a = fhj1;
                super();
            }
        };
        c = hsw.a(djd.a(fhj.b(fhj1), b));
        d = new hst(fhj1) {

            final fhj a;
            final fhi b;

            private chp b()
            {
                chp chp = fhj.a(a).e();
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
                b = fhi.this;
                a = fhj1;
                super();
            }
        };
        e = hsw.a(djc.a(fhj.b(fhj1), d));
        f = hsw.a(dje.a(fhj.b(fhj1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(fhj1) {

            final fhj a;
            final fhi b;

            private gmg b()
            {
                gmg gmg = fhj.a(a).f();
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
                b = fhi.this;
                a = fhj1;
                super();
            }
        };
        i = fhv.a(g, d, h);
    }

    public final void a(LegacyShareFragment legacysharefragment)
    {
        i.injectMembers(legacysharefragment);
    }

    static 
    {
        boolean flag;
        if (!fhi.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
