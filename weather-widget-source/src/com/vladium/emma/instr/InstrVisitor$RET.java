// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import com.vladium.util.ByteArrayOStream;

// Referenced classes of package com.vladium.emma.instr:
//            InstrVisitor

static final class m_varindex extends ch
{

    final int m_varindex;

    void emit(Ctx ctx)
    {
        ctx = ctx.m_out;
        if (m_varindex <= 255)
        {
            ctx.write2(m_opcode, m_varindex);
            return;
        } else
        {
            ctx.write4(196, m_opcode, m_varindex >>> 8, m_varindex);
            return;
        }
    }

    int length()
    {
        return m_varindex > 255 ? 3 : 2;
    }

    Ctx(int i, int j)
    {
        super(i, null);
        m_varindex = j;
    }
}
