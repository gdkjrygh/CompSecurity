// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.trip.map.layer.pins.PoolSurgeDialogFragment;

public final class gbl
    implements gbq
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private gbl(gbm gbm1)
    {
        if (!a && gbm1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gbm1);
            return;
        }
    }

    gbl(gbm gbm1, byte byte0)
    {
        this(gbm1);
    }

    public static gbm a()
    {
        return new gbm((byte)0);
    }

    private void a(gbm gbm1)
    {
        b = new hst(gbm1) {

            final gbm a;
            final gbl b;

            private cev b()
            {
                cev cev = gbm.a(a).D();
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
                b = gbl.this;
                a = gbm1;
                super();
            }
        };
        c = hsw.a(diy.a(gbm.b(gbm1), b));
        d = new hst(gbm1) {

            final gbm a;
            final gbl b;

            private chp b()
            {
                chp chp = gbm.a(a).e();
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
                b = gbl.this;
                a = gbm1;
                super();
            }
        };
        e = hsw.a(dix.a(gbm.b(gbm1), d));
        f = hsw.a(diz.a(gbm.b(gbm1), c, e));
        g = cza.a(hsu.a(), f);
        h = hsu.a(g);
    }

    public final void a(PoolSurgeDialogFragment poolsurgedialogfragment)
    {
        h.injectMembers(poolsurgedialogfragment);
    }

    static 
    {
        boolean flag;
        if (!gbl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
