// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.vladium.util:
//            ByteArrayIStream

public final class ByteArrayOStream extends OutputStream
{

    private static final int NATIVE_COPY_THRESHOLD = 9;
    private byte m_buf[];
    private int m_pos;

    public ByteArrayOStream(int i)
    {
        m_buf = new byte[i];
    }

    public final int capacity()
    {
        return m_buf.length;
    }

    public final void close()
    {
        reset();
    }

    public final byte[] copyByteArray()
    {
        int j = m_pos;
        byte abyte0[] = new byte[j];
        byte abyte1[] = m_buf;
        if (j < 9)
        {
            for (int i = 0; i < j; i++)
            {
                abyte0[i] = abyte1[i];
            }

        } else
        {
            System.arraycopy(abyte1, 0, abyte0, 0, j);
        }
        return abyte0;
    }

    public final byte[] getByteArray()
    {
        return m_buf;
    }

    public final void reset()
    {
        m_pos = 0;
    }

    public final int size()
    {
        return m_pos;
    }

    public final ByteArrayIStream toByteIStream()
    {
        return new ByteArrayIStream(m_buf, m_pos);
    }

    public final void write(int i)
    {
        int l = m_pos;
        int i1 = l + 1;
        byte abyte1[] = m_buf;
        int j = abyte1.length;
        byte abyte0[] = abyte1;
        if (j < i1)
        {
            byte abyte2[] = new byte[Math.max(j << 1, i1)];
            if (l < 9)
            {
                for (int k = 0; k < l; k++)
                {
                    abyte2[k] = abyte1[k];
                }

            } else
            {
                System.arraycopy(abyte1, 0, abyte2, 0, l);
            }
            abyte0 = abyte2;
            m_buf = abyte2;
        }
        abyte0[l] = (byte)i;
        m_pos = i1;
    }

    public final void write(byte abyte0[], int i, int j)
    {
        int j1 = m_pos;
        int k1 = j1 + j;
        byte abyte2[] = m_buf;
        int k = abyte2.length;
        byte abyte1[] = abyte2;
        if (k < k1)
        {
            byte abyte3[] = new byte[Math.max(k << 1, k1)];
            if (j1 < 9)
            {
                for (int l = 0; l < j1; l++)
                {
                    abyte3[l] = abyte2[l];
                }

            } else
            {
                System.arraycopy(abyte2, 0, abyte3, 0, j1);
            }
            abyte1 = abyte3;
            m_buf = abyte3;
        }
        if (j < 9)
        {
            for (int i1 = 0; i1 < j; i1++)
            {
                abyte1[j1 + i1] = abyte0[i + i1];
            }

        } else
        {
            System.arraycopy(abyte0, i, abyte1, j1, j);
        }
        m_pos = k1;
    }

    public final void write2(int i, int j)
    {
        int i1 = m_pos;
        int j1 = i1 + 2;
        byte abyte1[] = m_buf;
        int k = abyte1.length;
        byte abyte0[] = abyte1;
        if (k < j1)
        {
            byte abyte2[] = new byte[Math.max(k << 1, j1)];
            if (i1 < 9)
            {
                for (int l = 0; l < i1; l++)
                {
                    abyte2[l] = abyte1[l];
                }

            } else
            {
                System.arraycopy(abyte1, 0, abyte2, 0, i1);
            }
            abyte0 = abyte2;
            m_buf = abyte2;
        }
        abyte0[i1] = (byte)i;
        abyte0[i1 + 1] = (byte)j;
        m_pos = j1;
    }

    public final void write3(int i, int j, int k)
    {
        int j1 = m_pos;
        int k1 = j1 + 3;
        byte abyte1[] = m_buf;
        int l = abyte1.length;
        byte abyte0[] = abyte1;
        if (l < k1)
        {
            byte abyte2[] = new byte[Math.max(l << 1, k1)];
            if (j1 < 9)
            {
                for (int i1 = 0; i1 < j1; i1++)
                {
                    abyte2[i1] = abyte1[i1];
                }

            } else
            {
                System.arraycopy(abyte1, 0, abyte2, 0, j1);
            }
            abyte0 = abyte2;
            m_buf = abyte2;
        }
        abyte0[j1] = (byte)i;
        abyte0[j1 + 1] = (byte)j;
        abyte0[j1 + 2] = (byte)k;
        m_pos = k1;
    }

    public final void write4(int i, int j, int k, int l)
    {
        int k1 = m_pos;
        int l1 = k1 + 4;
        byte abyte1[] = m_buf;
        int i1 = abyte1.length;
        byte abyte0[] = abyte1;
        if (i1 < l1)
        {
            byte abyte2[] = new byte[Math.max(i1 << 1, l1)];
            if (k1 < 9)
            {
                for (int j1 = 0; j1 < k1; j1++)
                {
                    abyte2[j1] = abyte1[j1];
                }

            } else
            {
                System.arraycopy(abyte1, 0, abyte2, 0, k1);
            }
            abyte0 = abyte2;
            m_buf = abyte2;
        }
        abyte0[k1] = (byte)i;
        abyte0[k1 + 1] = (byte)j;
        abyte0[k1 + 2] = (byte)k;
        abyte0[k1 + 3] = (byte)l;
        m_pos = l1;
    }

    public final void writeTo(OutputStream outputstream)
        throws IOException
    {
        outputstream.write(m_buf, 0, m_pos);
    }
}
