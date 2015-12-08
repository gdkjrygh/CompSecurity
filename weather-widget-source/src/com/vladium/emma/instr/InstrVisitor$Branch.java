// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import com.vladium.util.ByteArrayOStream;
import java.util.List;

// Referenced classes of package com.vladium.emma.instr:
//            InstrVisitor

static abstract class m_targets
{

    final byte m_opcode;
    int m_parentBlockID;
    final int m_targets[];

    abstract void emit( );

    protected final void emitJumpOffset2( , int i, int j)
    {
        ByteArrayOStream bytearrayostream = .m_out;
        if (j <= m_parentBlockID)
        {
            i = ((m_parentBlockID).m_blocks.m_blocks.get(j))._first - i;
            bytearrayostream.write2(i >>> 8, i);
            return;
        } else
        {
            int k = bytearrayostream.size();
            bytearrayostream.write2(0, 0);
            .m_backpatchQueue.add(new int[] {
                2, k, i, j
            });
            return;
        }
    }

    protected final void emitJumpOffset4( , int i, int j)
    {
        ByteArrayOStream bytearrayostream = .m_out;
        if (j <= m_parentBlockID)
        {
            i = ((m_parentBlockID).m_blocks.m_blocks.get(j))._first - i;
            bytearrayostream.write4(i >>> 24, i >>> 16, i >>> 8, i);
            return;
        } else
        {
            int k = bytearrayostream.size();
            bytearrayostream.write4(0, 0, 0, 0);
            .m_backpatchQueue.add(new int[] {
                4, k, i, j
            });
            return;
        }
    }

    int maxlength()
    {
        return 1;
    }

    protected (int i, int ai[])
    {
        m_opcode = (byte)i;
        m_targets = ai;
    }
}
