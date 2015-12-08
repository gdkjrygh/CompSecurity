// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            c

final class d
{

    private final int a;
    private final String b;
    private final String c;
    private final int d;

    public d(int i, String s, String s1, int j)
    {
        if (j != 1 && j != 2 && j != 3)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid Scope:")).append(j).toString());
        }
        if (i <= 0 || i > 50)
        {
            throw new IllegalArgumentException("Index must be between 1 and 50, inclusive.");
        }
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("Invalid argument for name:  Cannot be empty");
        }
        if (s1 == null || s1.length() == 0)
        {
            throw new IllegalArgumentException("Invalid argument for value:  Cannot be empty");
        }
        int k = com.google.android.apps.analytics.c.a((new StringBuilder()).append(s).append(s1).toString(), "UTF-8").length();
        if (k > 64)
        {
            throw new IllegalArgumentException((new StringBuilder("Encoded form of name and value must not exceed 64 characters combined.  Character length: ")).append(k).toString());
        } else
        {
            d = i;
            a = j;
            b = s;
            c = s1;
            return;
        }
    }

    public final int a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final int d()
    {
        return d;
    }
}
