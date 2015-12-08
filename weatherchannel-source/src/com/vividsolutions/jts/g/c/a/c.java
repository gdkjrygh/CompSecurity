// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.c.a;

import com.vividsolutions.jts.g.c.e;
import com.vividsolutions.jts.geom.i;

// Referenced classes of package com.vividsolutions.jts.g.c.a:
//            d

public final class c
{

    private i a[];

    private c(i j, i k)
    {
        a = new i[2];
        a[0] = j;
        a[1] = k;
    }

    private i a(int j)
    {
        RuntimeException runtimeexception1;
        boolean flag;
        runtimeexception1 = null;
        flag = false;
        i k = e.a(a[0], a[1], j);
        flag = true;
_L1:
        if (!flag)
        {
            try
            {
                k = (new d(a[0], a[1])).a(j);
            }
            catch (RuntimeException runtimeexception)
            {
                throw runtimeexception1;
            }
        }
        return k;
        runtimeexception1;
        k = null;
          goto _L1
    }

    public static i a(i j, i k, int l)
    {
        return (new c(j, k)).a(l);
    }
}
