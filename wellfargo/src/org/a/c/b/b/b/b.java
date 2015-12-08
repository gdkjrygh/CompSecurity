// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.b;

import org.a.c.b.b.i;
import org.a.c.c;

// Referenced classes of package org.a.c.b.b.b:
//            a

public class b extends a
{

    public b(String s)
    {
        super(2, 1, s);
    }

    public final byte[] a(Object obj, int i)
    {
        byte abyte0[];
        if (obj instanceof byte[])
        {
            obj = (byte[])obj;
        } else
        if (obj instanceof String)
        {
            obj = ((String)obj).getBytes();
        } else
        {
            throw new c((new StringBuilder("Unknown data type: ")).append(obj).toString());
        }
        abyte0 = new byte[obj.length + 1];
        System.arraycopy(obj, 0, abyte0, 0, obj.length);
        return abyte0;
    }

    public final Object c(i i)
    {
        i = b(i);
        return new String(i, 0, i.length - 1);
    }
}
