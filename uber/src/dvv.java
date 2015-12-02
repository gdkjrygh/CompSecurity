// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.vendor.baidu.BaiduAuthorizationFragment;

public final class dvv
    implements dvr
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private dvv(dvw dvw1)
    {
        if (!a && dvw1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(dvw1);
            return;
        }
    }

    dvv(dvw dvw1, byte byte0)
    {
        this(dvw1);
    }

    public static dvw a()
    {
        return new dvw((byte)0);
    }

    private void a(dvw dvw1)
    {
        b = new hst(dvw1) {

            final dvw a;
            final dvv b;

            private cev b()
            {
                cev cev = dvw.a(a).D();
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
                b = dvv.this;
                a = dvw1;
                super();
            }
        };
        c = hsw.a(djd.a(dvw.b(dvw1), b));
        d = new hst(dvw1) {

            final dvw a;
            final dvv b;

            private chp b()
            {
                chp chp = dvw.a(a).e();
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
                b = dvv.this;
                a = dvw1;
                super();
            }
        };
        e = hsw.a(djc.a(dvw.b(dvw1), d));
        f = hsw.a(dje.a(dvw.b(dvw1), c, e));
        g = czc.a(hsu.a(), f);
        h = dvs.a(g, b);
    }

    public final void a(BaiduAuthorizationFragment baiduauthorizationfragment)
    {
        h.injectMembers(baiduauthorizationfragment);
    }

    static 
    {
        boolean flag;
        if (!dvv.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
