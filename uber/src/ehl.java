// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.PlayableItemGridFragment;

public final class ehl
    implements ejh
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
    private hzb j;
    private hsr k;

    private ehl(ehm ehm1)
    {
        if (!a && ehm1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ehm1);
            return;
        }
    }

    ehl(ehm ehm1, byte byte0)
    {
        this(ehm1);
    }

    public static ehm a()
    {
        return new ehm((byte)0);
    }

    private void a(ehm ehm1)
    {
        b = new hst(ehm1) {

            final ehm a;
            final ehl b;

            private cev b()
            {
                cev cev = ehm.a(a).D();
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
                b = ehl.this;
                a = ehm1;
                super();
            }
        };
        c = hsw.a(djd.a(ehm.b(ehm1), b));
        d = new hst(ehm1) {

            final ehm a;
            final ehl b;

            private chp b()
            {
                chp chp = ehm.a(a).e();
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
                b = ehl.this;
                a = ehm1;
                super();
            }
        };
        e = hsw.a(djc.a(ehm.b(ehm1), d));
        f = hsw.a(dje.a(ehm.b(ehm1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(ehm1) {

            final ehm a;
            final ehl b;

            private cgh b()
            {
                cgh cgh = ehm.a(a).Z();
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
                b = ehl.this;
                a = ehm1;
                super();
            }
        };
        i = ejm.a(g, b, h);
        j = new hst(ehm1) {

            final ehm a;
            final ehl b;

            private gmg b()
            {
                gmg gmg = ehm.a(a).f();
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
                b = ehl.this;
                a = ehm1;
                super();
            }
        };
        k = eji.a(i, d, j);
    }

    public final void a(PlayableItemGridFragment playableitemgridfragment)
    {
        k.injectMembers(playableitemgridfragment);
    }

    static 
    {
        boolean flag;
        if (!ehl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
