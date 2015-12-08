// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.b;

import org.a.c.c;
import org.a.c.c.a;

// Referenced classes of package org.a.c.b.b.b:
//            a

public class i extends org.a.c.b.b.b.a
{

    public i()
    {
        super(-1, 1, "Unknown");
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
            throw new c((new StringBuilder("Invalid data: ")).append(obj).append(" (").append(org.a.c.c.a.a(obj)).append(")").toString());
        }
    }

    public final Object c(org.a.c.b.b.i j)
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
