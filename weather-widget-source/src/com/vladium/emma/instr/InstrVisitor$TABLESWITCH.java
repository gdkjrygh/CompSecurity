// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import com.vladium.util.ByteArrayOStream;

// Referenced classes of package com.vladium.emma.instr:
//            InstrVisitor

static final class m_high extends m_high
{

    final int m_high;
    final int m_low;

    void emit(m_high m_high1)
    {
        ByteArrayOStream bytearrayostream = m_high1.t;
        int l = bytearrayostream.size();
        bytearrayostream.write(m_opcode);
        for (int i = 0; i < 3 - (l & 3); i++)
        {
            bytearrayostream.write(0);
        }

        emitJumpOffset4(m_high1, l, m_targets[0]);
        int j = m_low;
        bytearrayostream.write4(j >>> 24, j >>> 16, j >>> 8, j);
        j = m_high;
        bytearrayostream.write4(j >>> 24, j >>> 16, j >>> 8, j);
        for (int k = 1; k < m_targets.length; k++)
        {
            emitJumpOffset4(m_high1, l, m_targets[k]);
        }

    }

    int maxlength()
    {
        return (m_targets.length << 2) + 12;
    }

    (int i, int j, int ai[])
    {
        super(170, ai);
        m_low = i;
        m_high = j;
    }
}
