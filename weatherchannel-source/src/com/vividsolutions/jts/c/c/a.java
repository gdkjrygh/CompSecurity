// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.c;


// Referenced classes of package com.vividsolutions.jts.c.c:
//            c

public final class a extends c
{

    private c c;
    private c d;

    public a(c c1, c c2)
    {
        c = c1;
        d = c2;
        c1 = c;
        c2 = d;
        a = Math.min(c1.a, c2.a);
        b = Math.max(c1.b, c2.b);
    }

    public final void a(double d1, double d2, com.vividsolutions.jts.c.a a1)
    {
        if (a(d1, d2))
        {
            if (c != null)
            {
                c.a(d1, d2, a1);
            }
            if (d != null)
            {
                d.a(d1, d2, a1);
                return;
            }
        }
    }
}
