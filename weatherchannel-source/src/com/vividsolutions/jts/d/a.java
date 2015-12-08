// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.d;

import java.io.IOException;

// Referenced classes of package com.vividsolutions.jts.d:
//            b

public final class a
{

    private int a;
    private b b;
    private byte c[];
    private byte d[];
    private byte e[];

    public a()
    {
        a = 1;
        c = new byte[1];
        d = new byte[4];
        e = new byte[8];
        b = null;
    }

    public final byte a()
        throws IOException
    {
        b.a(c);
        return c[0];
    }

    public final void a(int i)
    {
        a = i;
    }

    public final void a(b b1)
    {
        b = b1;
    }

    public final int b()
        throws IOException
    {
        b.a(d);
        byte abyte0[] = d;
        if (a == 1)
        {
            byte byte0 = abyte0[0];
            byte byte2 = abyte0[1];
            byte byte4 = abyte0[2];
            return abyte0[3] & 0xff | ((byte0 & 0xff) << 24 | (byte2 & 0xff) << 16 | (byte4 & 0xff) << 8);
        } else
        {
            byte byte1 = abyte0[3];
            byte byte3 = abyte0[2];
            byte byte5 = abyte0[1];
            return abyte0[0] & 0xff | ((byte1 & 0xff) << 24 | (byte3 & 0xff) << 16 | (byte5 & 0xff) << 8);
        }
    }

    public final double c()
        throws IOException
    {
        b.a(e);
        byte abyte0[] = e;
        long l;
        if (a == 1)
        {
            l = abyte0[0] & 0xff;
            long l1 = abyte0[1] & 0xff;
            long l3 = abyte0[2] & 0xff;
            long l5 = abyte0[3] & 0xff;
            long l7 = abyte0[4] & 0xff;
            long l9 = abyte0[5] & 0xff;
            long l11 = abyte0[6] & 0xff;
            l = (long)(abyte0[7] & 0xff) | (l << 56 | l1 << 48 | l3 << 40 | l5 << 32 | l7 << 24 | l9 << 16 | l11 << 8);
        } else
        {
            l = abyte0[7] & 0xff;
            long l2 = abyte0[6] & 0xff;
            long l4 = abyte0[5] & 0xff;
            long l6 = abyte0[4] & 0xff;
            long l8 = abyte0[3] & 0xff;
            long l10 = abyte0[2] & 0xff;
            long l12 = abyte0[1] & 0xff;
            l = (long)(abyte0[0] & 0xff) | (l << 56 | l2 << 48 | l4 << 40 | l6 << 32 | l8 << 24 | l10 << 16 | l12 << 8);
        }
        return Double.longBitsToDouble(l);
    }
}
