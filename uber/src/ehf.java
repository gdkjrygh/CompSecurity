// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.MusicProviderOfferFragment;

public final class ehf
    implements eix
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

    private ehf(ehg ehg1)
    {
        if (!a && ehg1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ehg1);
            return;
        }
    }

    ehf(ehg ehg1, byte byte0)
    {
        this(ehg1);
    }

    public static ehg a()
    {
        return new ehg((byte)0);
    }

    private void a(ehg ehg1)
    {
        b = new hst(ehg1) {

            final ehg a;
            final ehf b;

            private cev b()
            {
                cev cev = ehg.a(a).D();
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
                b = ehf.this;
                a = ehg1;
                super();
            }
        };
        c = hsw.a(djd.a(ehg.b(ehg1), b));
        d = new hst(ehg1) {

            final ehg a;
            final ehf b;

            private chp b()
            {
                chp chp = ehg.a(a).e();
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
                b = ehf.this;
                a = ehg1;
                super();
            }
        };
        e = hsw.a(djc.a(ehg.b(ehg1), d));
        f = hsw.a(dje.a(ehg.b(ehg1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(ehg1) {

            final ehg a;
            final ehf b;

            private hkr b()
            {
                hkr hkr = ehg.a(a).aP();
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
                b = ehf.this;
                a = ehg1;
                super();
            }
        };
        i = new hst(ehg1) {

            final ehg a;
            final ehf b;

            private dkv b()
            {
                dkv dkv = ehg.a(a).az();
                if (dkv == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dkv;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = ehf.this;
                a = ehg1;
                super();
            }
        };
        j = eiy.a(g, b, h, i);
    }

    public final void a(MusicProviderOfferFragment musicproviderofferfragment)
    {
        j.injectMembers(musicproviderofferfragment);
    }

    static 
    {
        boolean flag;
        if (!ehf.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
