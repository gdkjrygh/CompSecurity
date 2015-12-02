// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.about.WebViewFragment;

public final class dxz
    implements dyd
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private dxz(dya dya1)
    {
        if (!a && dya1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(dya1);
            return;
        }
    }

    dxz(dya dya1, byte byte0)
    {
        this(dya1);
    }

    public static dya a()
    {
        return new dya((byte)0);
    }

    private void a(dya dya1)
    {
        b = new hst(dya1) {

            final dya a;
            final dxz b;

            private cev b()
            {
                cev cev = dya.a(a).D();
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
                b = dxz.this;
                a = dya1;
                super();
            }
        };
        c = hsw.a(djd.a(dya.b(dya1), b));
        d = new hst(dya1) {

            final dya a;
            final dxz b;

            private chp b()
            {
                chp chp = dya.a(a).e();
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
                b = dxz.this;
                a = dya1;
                super();
            }
        };
        e = hsw.a(djc.a(dya.b(dya1), d));
        f = hsw.a(dje.a(dya.b(dya1), c, e));
        g = czc.a(hsu.a(), f);
        h = hsu.a(g);
    }

    public final void a(WebViewFragment webviewfragment)
    {
        h.injectMembers(webviewfragment);
    }

    static 
    {
        boolean flag;
        if (!dxz.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
