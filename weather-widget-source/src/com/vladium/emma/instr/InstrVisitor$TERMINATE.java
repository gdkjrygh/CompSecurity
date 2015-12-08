// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import com.vladium.util.ByteArrayOStream;

// Referenced classes of package com.vladium.emma.instr:
//            InstrVisitor

static final class it> extends it>
{

    void emit(it> it>)
    {
        it>.out.write(m_opcode);
    }

    int length()
    {
        return 1;
    }

    (int i)
    {
        super(i, null);
    }
}
