// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;


// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            p

final class o extends p
{

    private final int a;
    private final int b;

    o(int i, int j, int k)
    {
        super(i);
        a = j;
        b = k;
        if (a < 0 || a > 10)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid firstDigit: ")).append(j).toString());
        }
        if (b < 0 || b > 10)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid secondDigit: ")).append(k).toString());
        } else
        {
            return;
        }
    }

    final int a()
    {
        return a;
    }

    final int b()
    {
        return b;
    }

    final boolean c()
    {
        return a == 10;
    }

    final boolean d()
    {
        return b == 10;
    }
}
