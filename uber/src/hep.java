// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rds.feature.password.ForgotPasswordActivity;

public final class hep
    implements hev
{

    static final boolean a;
    private hzb b;
    private hsr c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;

    private hep(heq heq1)
    {
        if (!a && heq1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(heq1);
            return;
        }
    }

    hep(heq heq1, byte byte0)
    {
        this(heq1);
    }

    public static heq a()
    {
        return new heq((byte)0);
    }

    private void a(heq heq1)
    {
        b = hcc.a(heq.a(heq1));
        c = hbq.a(hsu.a(), b);
        d = hbu.a(heq.a(heq1));
        e = hce.a(heq.a(heq1));
        f = hcg.a(heq.a(heq1), e);
        g = hew.a(c, d, b, f);
    }

    public final void a(ForgotPasswordActivity forgotpasswordactivity)
    {
        g.injectMembers(forgotpasswordactivity);
    }

    static 
    {
        boolean flag;
        if (!hep.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
