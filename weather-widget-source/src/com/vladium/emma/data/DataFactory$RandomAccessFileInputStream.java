// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

// Referenced classes of package com.vladium.emma.data:
//            DataFactory

private static final class  extends BufferedInputStream
{

    private long m_count;

    public void close()
    {
    }

    final long getCount()
    {
        return m_count;
    }

    public final int read()
        throws IOException
    {
        int i = super.read();
        if (i >= 0)
        {
            m_count = m_count + 1L;
        }
        return i;
    }

    public final int read(byte abyte0[])
        throws IOException
    {
        int i = super.read(abyte0);
        if (i >= 0)
        {
            m_count = m_count + (long)i;
        }
        return i;
    }

    public final int read(byte abyte0[], int i, int j)
        throws IOException
    {
        i = super.read(abyte0, i, j);
        if (i >= 0)
        {
            m_count = m_count + (long)i;
        }
        return i;
    }

    (RandomAccessFile randomaccessfile, int i)
        throws IOException
    {
        super(new (randomaccessfile.getFD()), i);
    }
}
