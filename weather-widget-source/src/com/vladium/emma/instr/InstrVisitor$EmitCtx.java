// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import com.vladium.util.ByteArrayOStream;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vladium.emma.instr:
//            InstrVisitor

static final class m_out
{

    final List m_backpatchQueue = new ArrayList();
    final t m_blocks;
    final ByteArrayOStream m_out;

    t(t t, ByteArrayOStream bytearrayostream)
    {
        m_blocks = t;
        m_out = bytearrayostream;
    }
}
