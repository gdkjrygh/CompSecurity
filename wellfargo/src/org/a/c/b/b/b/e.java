// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.b;

import org.a.c.b.b.i;
import org.a.c.c;
import org.a.c.c.a;

// Referenced classes of package org.a.c.b.b.b:
//            a

public class e extends org.a.c.b.b.b.a
{

    public e()
    {
        super(11, 4, "Float");
    }

    public final byte[] a(Object obj, int j)
    {
        int k = 0;
        if (obj instanceof Float)
        {
            float f = ((Float)obj).floatValue();
            obj = new byte[4];
            k = Float.floatToRawIntBits(f);
            if (j == 77)
            {
                obj[0] = (byte)(k >> 0 & 0xff);
                obj[1] = (byte)(k >> 8 & 0xff);
                obj[2] = (byte)(k >> 16 & 0xff);
                obj[3] = (byte)(k >> 24 & 0xff);
            } else
            {
                obj[3] = (byte)(k >> 0 & 0xff);
                obj[2] = (byte)(k >> 8 & 0xff);
                obj[1] = (byte)(k >> 16 & 0xff);
                obj[0] = (byte)(k >> 24 & 0xff);
            }
            return ((byte []) (obj));
        }
        if (obj instanceof float[])
        {
            return a((float[])obj, j);
        }
        if (obj instanceof Float[])
        {
            obj = (Float[])obj;
            float af[] = new float[obj.length];
            do
            {
                if (k >= af.length)
                {
                    return a(af, j);
                }
                af[k] = obj[k].floatValue();
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
            (new StringBuilder(String.valueOf(d))).append(" (").append(j.a.a).append(")").toString();
            return new Float(a(j.h, j.j));
        } else
        {
            return d((new StringBuilder(String.valueOf(d))).append(" (").append(j.a.a).append(")").toString(), b(j), j.f, j.j);
        }
    }
}
