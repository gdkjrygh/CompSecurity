// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.rt;

import com.vladium.util.ByteArrayOStream;

// Referenced classes of package com.vladium.emma.rt:
//            InstrClassLoader

private static final class m_buf
{

    ByteArrayOStream m_baos;
    final byte m_buf[];

    void trim(int i, int j)
    {
        if (m_baos.capacity() > j)
        {
            m_baos = new ByteArrayOStream(i);
        }
    }

    (int i, int j)
    {
        m_baos = new ByteArrayOStream(i);
        m_buf = new byte[j];
    }
}
