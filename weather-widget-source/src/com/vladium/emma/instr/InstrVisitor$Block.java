// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import com.vladium.util.ByteArrayOStream;

// Referenced classes of package com.vladium.emma.instr:
//            InstrVisitor

private static final class <init>
{

    public  m_branch;
    int m_first;
    public gment m_insertion;
    int m_instrCount;
    int m_length;

    void emit(x x, byte abyte0[])
    {
        ByteArrayOStream bytearrayostream = x.m_out;
        int j = m_first;
        m_first = bytearrayostream.size();
        int i = 0;
        for (int k = m_length; i < k; i++)
        {
            bytearrayostream.write(abyte0[j + i]);
        }

        if (m_insertion != null)
        {
            m_insertion.emit(x);
        }
        if (m_branch != null)
        {
            m_branch.emit(x);
        }
    }

    private x()
    {
    }

    x(x x)
    {
        this();
    }
}
