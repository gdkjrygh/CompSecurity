// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.b;

import org.a.c.b.b.a.e;
import org.a.c.b.b.i;
import org.a.c.c;
import org.a.c.c.a;

// Referenced classes of package org.a.c.b.b.b:
//            a

public class f extends org.a.c.b.b.b.a
{

    public f(int j, String s)
    {
        super(j, 4, s);
    }

    public final byte[] a(Object obj, int j)
    {
        int k = 0;
        if (obj instanceof Integer)
        {
            return a(new int[] {
                ((Integer)obj).intValue()
            }, j);
        }
        if (obj instanceof int[])
        {
            return a((int[])obj, j);
        }
        if (obj instanceof Integer[])
        {
            obj = (Integer[])obj;
            int ai[] = new int[obj.length];
            do
            {
                if (k >= ai.length)
                {
                    return a(ai, j);
                }
                ai[k] = obj[k].intValue();
                k++;
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
            return new Integer(b((new StringBuilder(String.valueOf(d))).append(" (").append(j.a.a).append(")").toString(), j.h, j.j));
        } else
        {
            return b((new StringBuilder(String.valueOf(d))).append(" (").append(j.a.a).append(")").toString(), b(j), j.f, j.j);
        }
    }
}
