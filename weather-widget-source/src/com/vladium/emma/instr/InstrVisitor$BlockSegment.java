// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import com.vladium.jcd.compiler.CodeGen;
import com.vladium.util.ByteArrayOStream;
import java.io.IOException;

// Referenced classes of package com.vladium.emma.instr:
//            InstrVisitor

static final class t_var extends t_var
{

    private static final int BLOCK_INIT_CAPACITY = 16;
    private final ByteArrayOStream m_buf;

    void emit(t_var t_var)
    {
        try
        {
            m_buf.writeTo(t_var.);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (t_var t_var)
        {
            return;
        }
    }

    int length()
    {
        return m_buf.size();
    }

    int maxstack()
    {
        return 3;
    }

    public (InstrVisitor instrvisitor, int i, int j)
    {
        super(instrvisitor);
        ByteArrayOStream bytearrayostream = new ByteArrayOStream(16);
        m_buf = bytearrayostream;
        instrvisitor = instrvisitor.m_cls;
        CodeGen.load_local_object_var(bytearrayostream, i);
        CodeGen.push_int_value(bytearrayostream, instrvisitor, j);
        bytearrayostream.write2(4, 84);
    }
}
