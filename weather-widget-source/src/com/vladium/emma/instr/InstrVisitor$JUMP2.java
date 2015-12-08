// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import com.vladium.util.ByteArrayOStream;

// Referenced classes of package com.vladium.emma.instr:
//            InstrVisitor

static final class  extends 
{

    void emit(x x)
    {
        ByteArrayOStream bytearrayostream = x.m_out;
        int i = m_targets[0];
        int j = bytearrayostream.size();
        bytearrayostream.write(m_opcode);
        emitJumpOffset2(x, j, i);
    }

    int maxlength()
    {
        return 5;
    }

    x(int i, int j)
    {
        super(i, new int[] {
            j
        });
    }
}
