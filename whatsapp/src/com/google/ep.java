// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            ek, gh, d6, fw

public final class ep extends ek
{

    public static int d;
    private final int c;
    private final boolean e;
    private final int f;

    public ep(d6 d6, fw afw[], boolean flag, int i, int j)
    {
        int k = d;
        super(d6, afw);
        e = flag;
        c = i;
        f = j;
        if (gh.a != 0)
        {
            d = k + 1;
        }
    }

    public int a()
    {
        return c;
    }

    public int b()
    {
        return f;
    }

    public boolean c()
    {
        return e;
    }
}
