// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.MusicControlFragment;

public final class egt
    implements eik
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

    private egt(egu egu1)
    {
        if (!a && egu1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(egu1);
            return;
        }
    }

    egt(egu egu1, byte byte0)
    {
        this(egu1);
    }

    public static egu a()
    {
        return new egu((byte)0);
    }

    private void a(egu egu1)
    {
        b = new hst(egu1) {

            final egu a;
            final egt b;

            private cev b()
            {
                cev cev = egu.a(a).D();
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
                b = egt.this;
                a = egu1;
                super();
            }
        };
        c = hsw.a(djd.a(egu.b(egu1), b));
        d = new hst(egu1) {

            final egu a;
            final egt b;

            private chp b()
            {
                chp chp = egu.a(a).e();
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
                b = egt.this;
                a = egu1;
                super();
            }
        };
        e = hsw.a(djc.a(egu.b(egu1), d));
        f = hsw.a(dje.a(egu.b(egu1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(egu1) {

            final egu a;
            final egt b;

            private gmg b()
            {
                gmg gmg = egu.a(a).f();
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
                b = egt.this;
                a = egu1;
                super();
            }
        };
        i = eil.a(g, d, b, h);
    }

    public final void a(MusicControlFragment musiccontrolfragment)
    {
        i.injectMembers(musiccontrolfragment);
    }

    static 
    {
        boolean flag;
        if (!egt.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
