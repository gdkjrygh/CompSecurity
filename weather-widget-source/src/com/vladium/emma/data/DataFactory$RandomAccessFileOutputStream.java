// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

// Referenced classes of package com.vladium.emma.data:
//            DataFactory

private static final class  extends BufferedOutputStream
{

    private long m_count;

    public void close()
    {
    }

    final long getCount()
    {
        return m_count;
    }

    public final void write(int i)
        throws IOException
    {
        super.write(i);
        m_count = m_count + 1L;
    }

    public final void write(byte abyte0[])
        throws IOException
    {
        super.write(abyte0);
        m_count = m_count + (long)abyte0.length;
    }

    public final void write(byte abyte0[], int i, int j)
        throws IOException
    {
        super.write(abyte0, i, j);
        m_count = m_count + (long)j;
    }

    (RandomAccessFile randomaccessfile, int i)
        throws IOException
    {
        super(new (randomaccessfile.getFD()), i);
    }
}
