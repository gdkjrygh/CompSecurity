// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.DisconnectMusicProviderFragment;

public final class egj
    implements ehu
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private egj(egk egk1)
    {
        if (!a && egk1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(egk1);
            return;
        }
    }

    egj(egk egk1, byte byte0)
    {
        this(egk1);
    }

    public static egk a()
    {
        return new egk((byte)0);
    }

    private void a(egk egk1)
    {
        b = new hst(egk1) {

            final egk a;
            final egj b;

            private cev b()
            {
                cev cev = egk.a(a).D();
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
                b = egj.this;
                a = egk1;
                super();
            }
        };
        c = hsw.a(djd.a(egk.b(egk1), b));
        d = new hst(egk1) {

            final egk a;
            final egj b;

            private chp b()
            {
                chp chp = egk.a(a).e();
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
                b = egj.this;
                a = egk1;
                super();
            }
        };
        e = hsw.a(djc.a(egk.b(egk1), d));
        f = hsw.a(dje.a(egk.b(egk1), c, e));
        g = czc.a(hsu.a(), f);
        h = ehv.a(g, b);
    }

    public final void a(DisconnectMusicProviderFragment disconnectmusicproviderfragment)
    {
        h.injectMembers(disconnectmusicproviderfragment);
    }

    static 
    {
        boolean flag;
        if (!egj.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
