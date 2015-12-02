// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.MusicSearchFragment;

public final class ehj
    implements ejc
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

    private ehj(ehk ehk1)
    {
        if (!a && ehk1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ehk1);
            return;
        }
    }

    ehj(ehk ehk1, byte byte0)
    {
        this(ehk1);
    }

    public static ehk a()
    {
        return new ehk((byte)0);
    }

    private void a(ehk ehk1)
    {
        b = new hst(ehk1) {

            final ehk a;
            final ehj b;

            private cev b()
            {
                cev cev = ehk.a(a).D();
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
                b = ehj.this;
                a = ehk1;
                super();
            }
        };
        c = hsw.a(djd.a(ehk.b(ehk1), b));
        d = new hst(ehk1) {

            final ehk a;
            final ehj b;

            private chp b()
            {
                chp chp = ehk.a(a).e();
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
                b = ehj.this;
                a = ehk1;
                super();
            }
        };
        e = hsw.a(djc.a(ehk.b(ehk1), d));
        f = hsw.a(dje.a(ehk.b(ehk1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(ehk1) {

            final ehk a;
            final ehj b;

            private hkr b()
            {
                hkr hkr = ehk.a(a).aP();
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
                b = ehj.this;
                a = ehk1;
                super();
            }
        };
        i = new hst(ehk1) {

            final ehk a;
            final ehj b;

            private cgh b()
            {
                cgh cgh = ehk.a(a).Z();
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
                b = ehj.this;
                a = ehk1;
                super();
            }
        };
        j = new hst(ehk1) {

            final ehk a;
            final ehj b;

            private dkv b()
            {
                dkv dkv = ehk.a(a).az();
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
                b = ehj.this;
                a = ehk1;
                super();
            }
        };
        k = ejd.a(g, d, b, h, i, j);
    }

    public final void a(MusicSearchFragment musicsearchfragment)
    {
        k.injectMembers(musicsearchfragment);
    }

    static 
    {
        boolean flag;
        if (!ehj.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
