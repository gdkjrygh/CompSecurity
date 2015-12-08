// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.a;

import java.util.Collection;

// Referenced classes of package com.vividsolutions.jts.c.a:
//            f, b

public final class a
{

    private f a;
    private double b;

    public a()
    {
        b = 1.0D;
        a = new f();
    }

    public final void a(b b1, Object obj)
    {
        double d = b1.a();
        if (d < b && d > 0.0D)
        {
            b = d;
        }
        double d5 = b;
        double d3 = b1.a;
        double d4 = b1.b;
        if (d3 == d4)
        {
            double d2 = d4;
            double d1 = d3;
            if (d3 == d4)
            {
                d1 = d3 - d5 / 2D;
                d2 = d5 / 2D + d1;
            }
            b1 = new b(d1, d2);
        }
        a.a(b1, obj);
    }

    public final void a(b b1, Collection collection)
    {
        a.a(b1, collection);
    }
}
