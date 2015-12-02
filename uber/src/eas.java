// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.estimate.RewardPointsFareEstimateFragment;

public final class eas
    implements eba
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private eas(eat eat1)
    {
        if (!a && eat1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(eat1);
            return;
        }
    }

    eas(eat eat1, byte byte0)
    {
        this(eat1);
    }

    public static eat a()
    {
        return new eat((byte)0);
    }

    private void a(eat eat1)
    {
        b = new hst(eat1) {

            final eat a;
            final eas b;

            private cev b()
            {
                cev cev = eat.a(a).D();
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
                b = eas.this;
                a = eat1;
                super();
            }
        };
        c = hsw.a(diy.a(eat.b(eat1), b));
        d = new hst(eat1) {

            final eat a;
            final eas b;

            private chp b()
            {
                chp chp = eat.a(a).e();
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
                b = eas.this;
                a = eat1;
                super();
            }
        };
        e = hsw.a(dix.a(eat.b(eat1), d));
        f = hsw.a(diz.a(eat.b(eat1), c, e));
        g = cza.a(hsu.a(), f);
        h = hsu.a(g);
    }

    public final void a(RewardPointsFareEstimateFragment rewardpointsfareestimatefragment)
    {
        h.injectMembers(rewardpointsfareestimatefragment);
    }

    static 
    {
        boolean flag;
        if (!eas.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
