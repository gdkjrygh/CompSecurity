// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.b;

import org.a.c.b.b.i;
import org.a.c.c.a;

// Referenced classes of package org.a.c.b.b.b:
//            a

public class c extends org.a.c.b.b.b.a
{

    public c(int j, String s)
    {
        super(j, 1, s);
    }

    public final byte[] a(Object obj, int j)
    {
        if (obj instanceof Byte)
        {
            return (new byte[] {
                ((Byte)obj).byteValue()
            });
        }
        if (obj instanceof byte[])
        {
            return (byte[])obj;
        } else
        {
            throw new org.a.c.c((new StringBuilder("Invalid data: ")).append(obj).append(" (").append(org.a.c.c.a.a(obj)).append(")").toString());
        }
    }

    public final Object c(i j)
    {
        if (j.f == 1)
        {
            return new Byte(j.h[0]);
        } else
        {
            return b(j);
        }
    }
}
