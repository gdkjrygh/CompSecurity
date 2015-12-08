// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.a;

import com.vividsolutions.jts.c.d.a;

// Referenced classes of package com.vividsolutions.jts.c.a:
//            b

public final class c
{

    private double a;
    private int b;
    private b c;

    public c(b b1)
    {
        a = 0.0D;
        b = 0;
        a(b1);
    }

    private void a(int i, b b1)
    {
        if (i > 1023 || i < -1022)
        {
            throw new IllegalArgumentException("Exponent out of bounds");
        } else
        {
            double d = Double.longBitsToDouble((long)(i + 1023) << 52);
            a = Math.floor(b1.a / d) * d;
            c.a(a, d + a);
            return;
        }
    }

    private void a(b b1)
    {
        b = com.vividsolutions.jts.c.d.a.a(b1.a()) + 1;
        c = new b();
        a(b, b1);
        for (; !c.a(b1); a(b, b1))
        {
            b = b + 1;
        }

    }

    public final int a()
    {
        return b;
    }

    public final b b()
    {
        return c;
    }
}
