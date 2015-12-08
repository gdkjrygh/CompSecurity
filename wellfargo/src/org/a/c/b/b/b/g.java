// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.b;

import org.a.c.a.d;
import org.a.c.a.e;
import org.a.c.b.b.i;
import org.a.c.c;
import org.a.c.c.a;

// Referenced classes of package org.a.c.b.b.b:
//            a

public class g extends org.a.c.b.b.b.a
{

    public g(int j, String s)
    {
        super(j, 8, s);
    }

    public final byte[] a(Object obj, int j)
    {
        boolean flag = false;
        int k = 0;
        if (obj instanceof d)
        {
            return a((d)obj, j);
        }
        if (obj instanceof d[])
        {
            return a((d[])obj, j);
        }
        if (obj instanceof Number)
        {
            return a(e.a(((Number)obj).doubleValue()), j);
        }
        if (obj instanceof Number[])
        {
            obj = (Number[])obj;
            d ad[] = new d[obj.length];
            do
            {
                if (k >= obj.length)
                {
                    return a(ad, j);
                }
                ad[k] = e.a(obj[k].doubleValue());
                k++;
            } while (true);
        }
        if (obj instanceof double[])
        {
            obj = (double[])obj;
            d ad1[] = new d[obj.length];
            int l = ((flag) ? 1 : 0);
            do
            {
                if (l >= obj.length)
                {
                    return a(ad1, j);
                }
                ad1[l] = e.a(obj[l]);
                l++;
            } while (true);
        } else
        {
            throw new c((new StringBuilder("Invalid data: ")).append(obj).append(" (").append(org.a.c.c.a.a(obj)).append(")").toString());
        }
    }

    public final Object c(i j)
    {
        if (j.f == 1)
        {
            return a((new StringBuilder(String.valueOf(d))).append(" (").append(j.a.a).append(")").toString(), j.i, j.j);
        } else
        {
            return a((new StringBuilder(String.valueOf(d))).append(" (").append(j.a.a).append(")").toString(), b(j), j.f, j.j);
        }
    }
}
