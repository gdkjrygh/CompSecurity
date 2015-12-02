// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rds.feature.support.SupportPhotoActivity;

public final class hfp
    implements hgq
{

    static final boolean a;
    private hzb b;
    private hsr c;
    private hsr d;

    private hfp(hfq hfq1)
    {
        if (!a && hfq1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(hfq1);
            return;
        }
    }

    hfp(hfq hfq1, byte byte0)
    {
        this(hfq1);
    }

    public static hfq a()
    {
        return new hfq((byte)0);
    }

    private void a(hfq hfq1)
    {
        b = hcc.a(hfq.a(hfq1));
        c = hbq.a(hsu.a(), b);
        d = hsu.a(c);
    }

    public final void a(SupportPhotoActivity supportphotoactivity)
    {
        d.injectMembers(supportphotoactivity);
    }

    static 
    {
        boolean flag;
        if (!hfp.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
