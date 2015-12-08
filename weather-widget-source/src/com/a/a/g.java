// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.a.a:
//            d, j, h, a

public class g
{

    final d a;
    private j b;

    g(d d1, a a1)
    {
        a = d1;
        super();
        b = (j)d.b(d1).get(a1);
        if (b == null)
        {
            b = new j(a1);
            d.b(d1).put(a1, b);
            d.d(d1).add(b);
        }
    }

    public g a(a a1)
    {
        j j2 = (j)d.b(a).get(a1);
        j j1 = j2;
        if (j2 == null)
        {
            j1 = new j(a1);
            d.b(a).put(a1, j1);
            d.d(a).add(j1);
        }
        j1.a(new h(b, 0));
        return this;
    }

    public g b(a a1)
    {
        j j2 = (j)d.b(a).get(a1);
        j j1 = j2;
        if (j2 == null)
        {
            j1 = new j(a1);
            d.b(a).put(a1, j1);
            d.d(a).add(j1);
        }
        j1.a(new h(b, 1));
        return this;
    }
}
