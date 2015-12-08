// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.a.a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.a.c.a.a:
//            a

public class b extends a
{

    private final byte c[];

    public b(byte abyte0[])
    {
        c = abyte0;
    }

    public final InputStream a()
    {
        return new ByteArrayInputStream(c);
    }

    public final long b()
    {
        return (long)c.length;
    }

    public final byte[] b(int i, int j)
    {
        if (i + j > c.length)
        {
            throw new IOException((new StringBuilder("Could not read block (block start: ")).append(i).append(", block length: ").append(j).append(", data length: ").append(c.length).append(").").toString());
        } else
        {
            byte abyte0[] = new byte[j];
            System.arraycopy(c, i, abyte0, 0, j);
            return abyte0;
        }
    }
}
