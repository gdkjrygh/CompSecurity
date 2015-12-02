// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.LinkMusicProviderFragment;

public final class egn
    implements ehz
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
    private hzb k;
    private hzb l;
    private hzb m;
    private hsr n;

    private egn(ego ego1)
    {
        if (!a && ego1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ego1);
            return;
        }
    }

    egn(ego ego1, byte byte0)
    {
        this(ego1);
    }

    public static ego a()
    {
        return new ego((byte)0);
    }

    private void a(ego ego1)
    {
        b = new hst(ego1) {

            final ego a;
            final egn b;

            private cev b()
            {
                cev cev = ego.a(a).D();
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
                b = egn.this;
                a = ego1;
                super();
            }
        };
        c = hsw.a(djd.a(ego.b(ego1), b));
        d = new hst(ego1) {

            final ego a;
            final egn b;

            private chp b()
            {
                chp chp = ego.a(a).e();
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
                b = egn.this;
                a = ego1;
                super();
            }
        };
        e = hsw.a(djc.a(ego.b(ego1), d));
        f = hsw.a(dje.a(ego.b(ego1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(ego1) {

            final ego a;
            final egn b;

            private dqt b()
            {
                dqt dqt = ego.a(a).aM();
                if (dqt == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dqt;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = egn.this;
                a = ego1;
                super();
            }
        };
        i = new hst(ego1) {

            final ego a;
            final egn b;

            private hkr b()
            {
                hkr hkr = ego.a(a).aP();
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
                b = egn.this;
                a = ego1;
                super();
            }
        };
        j = new hst(ego1) {

            final ego a;
            final egn b;

            private dpg b()
            {
                dpg dpg = ego.a(a).ba();
                if (dpg == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dpg;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = egn.this;
                a = ego1;
                super();
            }
        };
        k = new hst(ego1) {

            final ego a;
            final egn b;

            private dkn b()
            {
                dkn dkn = ego.a(a).ai();
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
                b = egn.this;
                a = ego1;
                super();
            }
        };
        l = new hst(ego1) {

            final ego a;
            final egn b;

            private dkv b()
            {
                dkv dkv = ego.a(a).az();
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
                b = egn.this;
                a = ego1;
                super();
            }
        };
        m = new hst(ego1) {

            final ego a;
            final egn b;

            private hkp b()
            {
                hkp hkp = ego.a(a).bd();
                if (hkp == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hkp;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = egn.this;
                a = ego1;
                super();
            }
        };
        n = eia.a(g, d, h, i, j, k, l, m);
    }

    public final void a(LinkMusicProviderFragment linkmusicproviderfragment)
    {
        n.injectMembers(linkmusicproviderfragment);
    }

    static 
    {
        boolean flag;
        if (!egn.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
