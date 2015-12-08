// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            cj, dp, bi

public final class do
    implements cj
{

    private dp a;

    public do(dp dp1)
    {
        a = dp1;
    }

    public static List e()
    {
        ArrayList arraylist = new ArrayList();
        dp adp[] = dp.values();
        int j = adp.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new do(adp[i]));
        }

        return arraylist;
    }

    public final String a()
    {
        return a.name();
    }

    public final bi b()
    {
        return a.a();
    }

    public final String c()
    {
        return a.b();
    }

    public final boolean d()
    {
        return a.c();
    }
}
