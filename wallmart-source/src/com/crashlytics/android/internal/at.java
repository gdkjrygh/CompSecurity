// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

// Referenced classes of package com.crashlytics.android.internal:
//            as, aq

final class at extends InputStream
{

    private int a;
    private int b;
    private aq c;

    private at(aq aq1, as as1)
    {
        c = aq1;
        super();
        a = aq.a(aq1, as1.b + 4);
        b = as1.c;
    }

    at(aq aq1, as as1, byte byte0)
    {
        this(aq1, as1);
    }

    public final int read()
        throws IOException
    {
        if (b == 0)
        {
            return -1;
        } else
        {
            aq.a(c).seek(a);
            int i = aq.a(c).read();
            a = aq.a(c, a + 1);
            b = b - 1;
            return i;
        }
    }

    public final int read(byte abyte0[], int i, int j)
        throws IOException
    {
        aq.a(abyte0, "buffer");
        if ((i | j) < 0 || j > abyte0.length - i)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (b > 0)
        {
            int k = j;
            if (j > b)
            {
                k = b;
            }
            aq.a(c, a, abyte0, i, k);
            a = aq.a(c, a + k);
            b = b - k;
            return k;
        } else
        {
            return -1;
        }
    }
}
