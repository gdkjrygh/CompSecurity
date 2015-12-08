// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.au;

// Referenced classes of package com.google.android.gms.common.api:
//            g, k, i, l

public final class a
{

    private final g a;
    private final k b = null;
    private final i c;
    private final l d = null;
    private final String e;

    public a(String s, g g, i i)
    {
        au.a(g, "Cannot construct an Api with a null ClientBuilder");
        au.a(i, "Cannot construct an Api with a null ClientKey");
        e = s;
        a = g;
        c = i;
    }

    public g a()
    {
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.a(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return a;
    }

    public k b()
    {
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.a(flag, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return b;
    }

    public i c()
    {
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.a(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return c;
    }

    public boolean d()
    {
        return d != null;
    }

    public String e()
    {
        return e;
    }
}
