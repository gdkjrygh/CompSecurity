// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rds.feature.support.SupportHomeActivity;

public final class hfh
    implements hga
{

    static final boolean a;
    private hzb b;
    private hsr c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hzb g;
    private hzb h;
    private hsr i;

    private hfh(hfi hfi1)
    {
        if (!a && hfi1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(hfi1);
            return;
        }
    }

    hfh(hfi hfi1, byte byte0)
    {
        this(hfi1);
    }

    public static hfi a()
    {
        return new hfi((byte)0);
    }

    private void a(hfi hfi1)
    {
        b = hcc.a(hfi.a(hfi1));
        c = hbq.a(hsu.a(), b);
        d = hbu.a(hfi.a(hfi1));
        e = hbx.a(hfi.a(hfi1));
        f = hbz.a(hfi.a(hfi1));
        g = hcd.a(hfi.a(hfi1));
        h = hcf.a(hfi.a(hfi1));
        i = hgb.a(c, d, e, f, b, g, h);
    }

    public final void a(SupportHomeActivity supporthomeactivity)
    {
        i.injectMembers(supporthomeactivity);
    }

    static 
    {
        boolean flag;
        if (!hfh.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
