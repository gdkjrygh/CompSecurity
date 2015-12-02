// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            da, gd

final class dr extends da
{

    private final int b;
    private final int c;

    dr(int i, int j, int k)
    {
        super(i);
        if (j < 0 || j > 10 || k < 0 || k > 10)
        {
            throw gd.a();
        } else
        {
            b = j;
            c = k;
            return;
        }
    }

    int b()
    {
        return b;
    }

    boolean c()
    {
        return c == 10;
    }

    boolean d()
    {
        return b == 10;
    }

    int e()
    {
        return c;
    }
}
