// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.ubercab.client.feature.about.OtherFragment;

public final class dxx
    implements dyb
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

    private dxx(dxy dxy1)
    {
        if (!a && dxy1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(dxy1);
            return;
        }
    }

    dxx(dxy dxy1, byte byte0)
    {
        this(dxy1);
    }

    public static dxy a()
    {
        return new dxy((byte)0);
    }

    private void a(dxy dxy1)
    {
        b = new hst(dxy1) {

            final dxy a;
            final dxx b;

            private cev b()
            {
                cev cev = dxy.a(a).D();
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
                b = dxx.this;
                a = dxy1;
                super();
            }
        };
        c = hsw.a(djd.a(dxy.b(dxy1), b));
        d = new hst(dxy1) {

            final dxy a;
            final dxx b;

            private chp b()
            {
                chp chp = dxy.a(a).e();
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
                b = dxx.this;
                a = dxy1;
                super();
            }
        };
        e = hsw.a(djc.a(dxy.b(dxy1), d));
        f = hsw.a(dje.a(dxy.b(dxy1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(dxy1) {

            final dxy a;
            final dxx b;

            private Application b()
            {
                Application application = dxy.a(a).C();
                if (application == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return application;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dxx.this;
                a = dxy1;
                super();
            }
        };
        i = new hst(dxy1) {

            final dxy a;
            final dxx b;

            private hkr b()
            {
                hkr hkr = dxy.a(a).aP();
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
                b = dxx.this;
                a = dxy1;
                super();
            }
        };
        j = new hst(dxy1) {

            final dxy a;
            final dxx b;

            private dak b()
            {
                dak dak = dxy.a(a).aj();
                if (dak == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dak;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dxx.this;
                a = dxy1;
                super();
            }
        };
        k = dyc.a(g, h, b, i, j);
    }

    public final void a(OtherFragment otherfragment)
    {
        k.injectMembers(otherfragment);
    }

    static 
    {
        boolean flag;
        if (!dxx.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
