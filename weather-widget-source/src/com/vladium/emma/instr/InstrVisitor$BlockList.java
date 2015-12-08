// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vladium.emma.instr:
//            InstrVisitor

private static final class m_blocks
{

    final List m_blocks;
    t m_header;

    t()
    {
        m_blocks = new ArrayList();
    }

    m_blocks(int i)
    {
        m_blocks = new ArrayList(i);
    }
}
