// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rds.feature.support.SupportFormActivity;

public final class hfd
    implements hfr
{

    static final boolean a;
    private hzb b;
    private hsr c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hzb g;
    private hsr h;

    private hfd(hfe hfe1)
    {
        if (!a && hfe1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(hfe1);
            return;
        }
    }

    hfd(hfe hfe1, byte byte0)
    {
        this(hfe1);
    }

    public static hfe a()
    {
        return new hfe((byte)0);
    }

    private void a(hfe hfe1)
    {
        b = hcc.a(hfe.a(hfe1));
        c = hbq.a(hsu.a(), b);
        d = hbu.a(hfe.a(hfe1));
        e = hbz.a(hfe.a(hfe1));
        f = hcd.a(hfe.a(hfe1));
        g = hcf.a(hfe.a(hfe1));
        h = hfs.a(c, d, e, b, f, g);
    }

    public final void a(SupportFormActivity supportformactivity)
    {
        h.injectMembers(supportformactivity);
    }

    static 
    {
        boolean flag;
        if (!hfd.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
