// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.MusicProviderOfferIneligibleFragment;

public final class ehh
    implements eiz
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private ehh(ehi ehi1)
    {
        if (!a && ehi1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ehi1);
            return;
        }
    }

    ehh(ehi ehi1, byte byte0)
    {
        this(ehi1);
    }

    public static ehi a()
    {
        return new ehi((byte)0);
    }

    private void a(ehi ehi1)
    {
        b = new hst(ehi1) {

            final ehi a;
            final ehh b;

            private cev b()
            {
                cev cev = ehi.a(a).D();
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
                b = ehh.this;
                a = ehi1;
                super();
            }
        };
        c = hsw.a(djd.a(ehi.b(ehi1), b));
        d = new hst(ehi1) {

            final ehi a;
            final ehh b;

            private chp b()
            {
                chp chp = ehi.a(a).e();
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
                b = ehh.this;
                a = ehi1;
                super();
            }
        };
        e = hsw.a(djc.a(ehi.b(ehi1), d));
        f = hsw.a(dje.a(ehi.b(ehi1), c, e));
        g = czc.a(hsu.a(), f);
        h = eja.a(g, b);
    }

    public final void a(MusicProviderOfferIneligibleFragment musicproviderofferineligiblefragment)
    {
        h.injectMembers(musicproviderofferineligiblefragment);
    }

    static 
    {
        boolean flag;
        if (!ehh.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
