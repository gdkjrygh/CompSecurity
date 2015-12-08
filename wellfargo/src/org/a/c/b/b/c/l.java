// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.c;

import org.a.c.a.c;

// Referenced classes of package org.a.c.b.b.c:
//            k

public class l extends k
{

    private final byte a[];
    private final String b;

    public l(String s, byte abyte0[])
    {
        b = s;
        a = abyte0;
    }

    public final void a(c c1)
    {
        c1.write(a);
    }

    public final void a(byte abyte0[])
    {
        if (a.length != abyte0.length)
        {
            throw new org.a.c.c((new StringBuilder("Updated data size mismatch: ")).append(a.length).append(" vs. ").append(abyte0.length).toString());
        } else
        {
            System.arraycopy(abyte0, 0, a, 0, abyte0.length);
            return;
        }
    }

    public final int c()
    {
        return a.length;
    }
}
