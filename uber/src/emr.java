// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.network.PasswordResetApi;

public final class emr
    implements hst
{

    static final boolean a;
    private final emq b;
    private final hzb c;

    private emr(emq emq1, hzb hzb1)
    {
        if (!a && emq1 == null)
        {
            throw new AssertionError();
        }
        b = emq1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(emq emq1, hzb hzb1)
    {
        return new emr(emq1, hzb1);
    }

    private PasswordResetApi b()
    {
        PasswordResetApi passwordresetapi = emq.a((grs)c.a());
        if (passwordresetapi == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return passwordresetapi;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!emr.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
