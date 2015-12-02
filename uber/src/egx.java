// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.MusicProviderAuthorizationFragment;

public final class egx
    implements eio
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

    private egx(egy egy1)
    {
        if (!a && egy1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(egy1);
            return;
        }
    }

    egx(egy egy1, byte byte0)
    {
        this(egy1);
    }

    public static egy a()
    {
        return new egy((byte)0);
    }

    private void a(egy egy1)
    {
        b = new hst(egy1) {

            final egy a;
            final egx b;

            private cev b()
            {
                cev cev = egy.a(a).D();
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
                b = egx.this;
                a = egy1;
                super();
            }
        };
        c = hsw.a(djd.a(egy.b(egy1), b));
        d = new hst(egy1) {

            final egy a;
            final egx b;

            private chp b()
            {
                chp chp = egy.a(a).e();
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
                b = egx.this;
                a = egy1;
                super();
            }
        };
        e = hsw.a(djc.a(egy.b(egy1), d));
        f = hsw.a(dje.a(egy.b(egy1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(egy1) {

            final egy a;
            final egx b;

            private hkr b()
            {
                hkr hkr = egy.a(a).aP();
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
                b = egx.this;
                a = egy1;
                super();
            }
        };
        i = eip.a(g, d, b, h);
    }

    public final void a(MusicProviderAuthorizationFragment musicproviderauthorizationfragment)
    {
        i.injectMembers(musicproviderauthorizationfragment);
    }

    static 
    {
        boolean flag;
        if (!egx.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
