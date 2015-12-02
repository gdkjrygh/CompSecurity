// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;

public final class fqx
    implements hst
{

    static final boolean a;
    private final fqq b;
    private final hzb c;
    private final hzb d;

    private fqx(fqq fqq1, hzb hzb1, hzb hzb2)
    {
        if (!a && fqq1 == null)
        {
            throw new AssertionError();
        }
        b = fqq1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        } else
        {
            d = hzb2;
            return;
        }
    }

    public static hst a(fqq fqq1, hzb hzb1, hzb hzb2)
    {
        return new fqx(fqq1, hzb1, hzb2);
    }

    private fws b()
    {
        return fqq.a((fwd)c.a(), (RiderActivity)d.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fqx.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
