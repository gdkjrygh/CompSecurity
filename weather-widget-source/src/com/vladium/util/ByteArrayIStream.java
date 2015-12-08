// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.io.InputStream;

public final class ByteArrayIStream extends InputStream
{

    private static final int NATIVE_COPY_THRESHOLD = 9;
    private final byte m_buf[];
    private final int m_max;
    private int m_pos;

    public ByteArrayIStream(byte abyte0[])
    {
        this(abyte0, abyte0.length);
    }

    public ByteArrayIStream(byte abyte0[], int i)
    {
        m_buf = abyte0;
        m_max = i;
    }

    public final int available()
    {
        return m_max - m_pos;
    }

    public final void close()
    {
        reset();
    }

    public final int read()
    {
        if (m_pos >= m_max)
        {
            return -1;
        } else
        {
            byte abyte0[] = m_buf;
            int i = m_pos;
            m_pos = i + 1;
            return abyte0[i] & 0xff;
        }
    }

    public final int read(byte abyte0[], int i, int j)
    {
        int l = m_pos;
        int i1 = m_max;
        if (l >= i1)
        {
            return -1;
        }
        int k = j;
        if (l + j > i1)
        {
            k = i1 - l;
        }
        if (k <= 0)
        {
            return 0;
        }
        byte abyte1[] = m_buf;
        if (k < 9)
        {
            for (j = 0; j < k; j++)
            {
                abyte0[i + j] = abyte1[l + j];
            }

        } else
        {
            System.arraycopy(abyte1, l, abyte0, i, k);
        }
        m_pos = m_pos + k;
        return k;
    }

    public final void reset()
    {
        m_pos = 0;
    }

    public final long skip(long l)
    {
        long l1 = l;
        if ((long)m_pos + l > (long)m_max)
        {
            l1 = m_max - m_pos;
        }
        if (l1 < 0L)
        {
            return 0L;
        } else
        {
            m_pos = (int)((long)m_pos + l1);
            return l1;
        }
    }
}
