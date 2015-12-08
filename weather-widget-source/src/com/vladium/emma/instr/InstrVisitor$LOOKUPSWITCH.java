// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import com.vladium.util.ByteArrayOStream;

// Referenced classes of package com.vladium.emma.instr:
//            InstrVisitor

static final class m_keys extends m_keys
{

    final int m_keys[];

    void emit(m_keys m_keys1)
    {
        ByteArrayOStream bytearrayostream = m_keys1.;
        int l = bytearrayostream.size();
        bytearrayostream.write(m_opcode);
        for (int i = 0; i < 3 - (l & 3); i++)
        {
            bytearrayostream.write(0);
        }

        emitJumpOffset4(m_keys1, l, m_targets[0]);
        int j = m_keys.length;
        bytearrayostream.write4(j >>> 24, j >>> 16, j >>> 8, j);
        for (int k = 1; k < m_targets.length; k++)
        {
            int i1 = m_keys[k - 1];
            bytearrayostream.write4(i1 >>> 24, i1 >>> 16, i1 >>> 8, i1);
            emitJumpOffset4(m_keys1, l, m_targets[k]);
        }

    }

    int maxlength()
    {
        return (m_keys.length << 3) + 12;
    }

    (int ai[], int ai1[])
    {
        super(171, ai1);
        m_keys = ai;
    }
}
