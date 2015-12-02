// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.PlaylistListFragment;

public final class ehp
    implements ejn
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
    private hsr j;

    private ehp(ehq ehq1)
    {
        if (!a && ehq1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ehq1);
            return;
        }
    }

    ehp(ehq ehq1, byte byte0)
    {
        this(ehq1);
    }

    public static ehq a()
    {
        return new ehq((byte)0);
    }

    private void a(ehq ehq1)
    {
        b = new hst(ehq1) {

            final ehq a;
            final ehp b;

            private cev b()
            {
                cev cev = ehq.a(a).D();
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
                b = ehp.this;
                a = ehq1;
                super();
            }
        };
        c = hsw.a(djd.a(ehq.b(ehq1), b));
        d = new hst(ehq1) {

            final ehq a;
            final ehp b;

            private chp b()
            {
                chp chp = ehq.a(a).e();
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
                b = ehp.this;
                a = ehq1;
                super();
            }
        };
        e = hsw.a(djc.a(ehq.b(ehq1), d));
        f = hsw.a(dje.a(ehq.b(ehq1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(ehq1) {

            final ehq a;
            final ehp b;

            private cgh b()
            {
                cgh cgh = ehq.a(a).Z();
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
                b = ehp.this;
                a = ehq1;
                super();
            }
        };
        i = ejm.a(g, b, h);
        j = ejo.a(i, d, b);
    }

    public final void a(PlaylistListFragment playlistlistfragment)
    {
        j.injectMembers(playlistlistfragment);
    }

    static 
    {
        boolean flag;
        if (!ehp.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
