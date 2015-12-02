// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class se
{

    private final sk a;
    private final sn b = null;
    private final sl c;
    private final so d = null;
    private final ArrayList e;
    private final String f;

    public transient se(String s, sk sk, sl sl, Scope ascope[])
    {
        wn.a(sk, "Cannot construct an Api with a null ClientBuilder");
        wn.a(sl, "Cannot construct an Api with a null ClientKey");
        f = s;
        a = sk;
        c = sl;
        e = new ArrayList(Arrays.asList(ascope));
    }

    public final sk a()
    {
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wn.a(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return a;
    }

    public final sn b()
    {
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wn.a(flag, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return b;
    }

    public final List c()
    {
        return e;
    }

    public final sl d()
    {
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wn.a(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return c;
    }

    public final boolean e()
    {
        return d != null;
    }
}
