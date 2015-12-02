// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.PlaylistFragment;

public final class ehn
    implements ejj
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private ehn(eho eho1)
    {
        if (!a && eho1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(eho1);
            return;
        }
    }

    ehn(eho eho1, byte byte0)
    {
        this(eho1);
    }

    public static eho a()
    {
        return new eho((byte)0);
    }

    private void a(eho eho1)
    {
        b = new hst(eho1) {

            final eho a;
            final ehn b;

            private cev b()
            {
                cev cev = eho.a(a).D();
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
                b = ehn.this;
                a = eho1;
                super();
            }
        };
        c = hsw.a(djd.a(eho.b(eho1), b));
        d = new hst(eho1) {

            final eho a;
            final ehn b;

            private chp b()
            {
                chp chp = eho.a(a).e();
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
                b = ehn.this;
                a = eho1;
                super();
            }
        };
        e = hsw.a(djc.a(eho.b(eho1), d));
        f = hsw.a(dje.a(eho.b(eho1), c, e));
        g = czc.a(hsu.a(), f);
        h = ejk.a(g, d, b);
    }

    public final void a(PlaylistFragment playlistfragment)
    {
        h.injectMembers(playlistfragment);
    }

    static 
    {
        boolean flag;
        if (!ehn.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
