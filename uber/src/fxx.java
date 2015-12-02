// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.feature.trip.estimate.TripTimeEstimateDialogFragment;

public final class fxx
    implements fya
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

    private fxx(fxy fxy1)
    {
        if (!a && fxy1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fxy1);
            return;
        }
    }

    fxx(fxy fxy1, byte byte0)
    {
        this(fxy1);
    }

    public static fxy a()
    {
        return new fxy((byte)0);
    }

    private void a(fxy fxy1)
    {
        b = new hst(fxy1) {

            final fxy a;
            final fxx b;

            private cev b()
            {
                cev cev = fxy.a(a).D();
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
                b = fxx.this;
                a = fxy1;
                super();
            }
        };
        c = hsw.a(diy.a(fxy.b(fxy1), b));
        d = new hst(fxy1) {

            final fxy a;
            final fxx b;

            private chp b()
            {
                chp chp = fxy.a(a).e();
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
                b = fxx.this;
                a = fxy1;
                super();
            }
        };
        e = hsw.a(dix.a(fxy.b(fxy1), d));
        f = hsw.a(diz.a(fxy.b(fxy1), c, e));
        g = cza.a(hsu.a(), f);
        h = new hst(fxy1) {

            final fxy a;
            final fxx b;

            private RiderApplication b()
            {
                RiderApplication riderapplication = fxy.a(a).ag();
                if (riderapplication == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return riderapplication;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fxx.this;
                a = fxy1;
                super();
            }
        };
        i = new hst(fxy1) {

            final fxy a;
            final fxx b;

            private dce b()
            {
                dce dce = fxy.a(a).af();
                if (dce == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dce;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fxx.this;
                a = fxy1;
                super();
            }
        };
        j = new hst(fxy1) {

            final fxy a;
            final fxx b;

            private fte b()
            {
                fte fte = fxy.a(a).ay();
                if (fte == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return fte;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fxx.this;
                a = fxy1;
                super();
            }
        };
        k = fyb.a(g, h, i, j);
    }

    public final void a(TripTimeEstimateDialogFragment triptimeestimatedialogfragment)
    {
        k.injectMembers(triptimeestimatedialogfragment);
    }

    static 
    {
        boolean flag;
        if (!fxx.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
