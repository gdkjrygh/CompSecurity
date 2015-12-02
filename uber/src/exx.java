// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.profiles.ReportIntervalFragment;

public final class exx
    implements eyw
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

    private exx(exy exy1)
    {
        if (!a && exy1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(exy1);
            return;
        }
    }

    exx(exy exy1, byte byte0)
    {
        this(exy1);
    }

    public static exy a()
    {
        return new exy((byte)0);
    }

    private void a(exy exy1)
    {
        b = new hst(exy1) {

            final exy a;
            final exx b;

            private cev b()
            {
                cev cev = exy.a(a).D();
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
                b = exx.this;
                a = exy1;
                super();
            }
        };
        c = hsw.a(djd.a(exy.b(exy1), b));
        d = new hst(exy1) {

            final exy a;
            final exx b;

            private chp b()
            {
                chp chp = exy.a(a).e();
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
                b = exx.this;
                a = exy1;
                super();
            }
        };
        e = hsw.a(djc.a(exy.b(exy1), d));
        f = hsw.a(dje.a(exy.b(exy1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(exy1) {

            final exy a;
            final exx b;

            private eyy b()
            {
                eyy eyy = exy.a(a).al();
                if (eyy == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return eyy;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = exx.this;
                a = exy1;
                super();
            }
        };
        i = eyx.a(g, d, b, h);
    }

    public final void a(ReportIntervalFragment reportintervalfragment)
    {
        i.injectMembers(reportintervalfragment);
    }

    static 
    {
        boolean flag;
        if (!exx.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
