// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.b;

import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.m;

// Referenced classes of package com.vividsolutions.jts.c.b:
//            a

public class b
{

    h a;
    h b;
    private m c;
    private m d;

    public b()
    {
        a = new h();
        b = new h();
        c = new m();
        d = new m();
    }

    public void a(a a1, int i, a a2, int j)
    {
        a1.a(i, c);
        a2.a(j, d);
        a1 = c;
        a1 = d;
    }
}
