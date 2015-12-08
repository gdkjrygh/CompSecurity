// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            ad

public final class ac
{

    private final String a;
    private final String b;
    private final double c;
    private final double d;
    private final double e;

    private ac(ad ad1)
    {
        a = ad.a(ad1);
        c = ad.b(ad1);
        b = ad.c(ad1);
        d = ad.d(ad1);
        e = ad.e(ad1);
    }

    ac(ad ad1, byte byte0)
    {
        this(ad1);
    }

    final String a()
    {
        return a;
    }

    final String b()
    {
        return b;
    }

    final double c()
    {
        return c;
    }

    final double d()
    {
        return d;
    }

    final double e()
    {
        return e;
    }
}
