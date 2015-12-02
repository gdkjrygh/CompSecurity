// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rds.feature.password.ResetPasswordActivity;

public final class het
    implements hfb
{

    static final boolean a;
    private hzb b;
    private hsr c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hzb g;
    private hsr h;

    private het(heu heu1)
    {
        if (!a && heu1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(heu1);
            return;
        }
    }

    het(heu heu1, byte byte0)
    {
        this(heu1);
    }

    public static heu a()
    {
        return new heu((byte)0);
    }

    private void a(heu heu1)
    {
        b = hcc.a(heu.a(heu1));
        c = hbq.a(hsu.a(), b);
        d = hbu.a(heu.a(heu1));
        e = hcd.a(heu.a(heu1));
        f = hce.a(heu.a(heu1));
        g = hcg.a(heu.a(heu1), f);
        h = hfc.a(c, d, b, e, g);
    }

    public final void a(ResetPasswordActivity resetpasswordactivity)
    {
        h.injectMembers(resetpasswordactivity);
    }

    static 
    {
        boolean flag;
        if (!het.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
