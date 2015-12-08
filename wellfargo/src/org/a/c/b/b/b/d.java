// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.b;

import org.a.c.b.b.i;
import org.a.c.c;
import org.a.c.c.a;

// Referenced classes of package org.a.c.b.b.b:
//            a

public class d extends org.a.c.b.b.b.a
{

    public d()
    {
        super(12, 8, "Double");
    }

    public final byte[] a(Object obj, int i)
    {
        int j = 0;
        if (obj instanceof Double)
        {
            double d1 = ((Double)obj).doubleValue();
            obj = new byte[8];
            long l = Double.doubleToRawLongBits(d1);
            if (i == 77)
            {
                obj[0] = (byte)(int)(l >> 0 & 255L);
                obj[1] = (byte)(int)(l >> 8 & 255L);
                obj[2] = (byte)(int)(l >> 16 & 255L);
                obj[3] = (byte)(int)(l >> 24 & 255L);
                obj[4] = (byte)(int)(l >> 32 & 255L);
                obj[5] = (byte)(int)(l >> 40 & 255L);
                obj[6] = (byte)(int)(l >> 48 & 255L);
                obj[7] = (byte)(int)(l >> 56 & 255L);
            } else
            {
                obj[7] = (byte)(int)(l >> 0 & 255L);
                obj[6] = (byte)(int)(l >> 8 & 255L);
                obj[5] = (byte)(int)(l >> 16 & 255L);
                obj[4] = (byte)(int)(l >> 24 & 255L);
                obj[3] = (byte)(int)(l >> 32 & 255L);
                obj[2] = (byte)(int)(l >> 40 & 255L);
                obj[1] = (byte)(int)(l >> 48 & 255L);
                obj[0] = (byte)(int)(l >> 56 & 255L);
            }
            return ((byte []) (obj));
        }
        if (obj instanceof double[])
        {
            return a((double[])obj, i);
        }
        if (obj instanceof Double[])
        {
            obj = (Double[])obj;
            double ad[] = new double[obj.length];
            do
            {
                if (j >= ad.length)
                {
                    return a(ad, i);
                }
                ad[j] = obj[j].doubleValue();
                j++;
            } while (true);
        } else
        {
            throw new c((new StringBuilder("Invalid data: ")).append(obj).append(" (").append(org.a.c.c.a.a(obj)).append(")").toString());
        }
    }

    public final Object c(i i)
    {
        return "?";
    }
}
