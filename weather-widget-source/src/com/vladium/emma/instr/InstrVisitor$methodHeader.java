// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import com.vladium.jcd.compiler.CodeGen;
import com.vladium.util.ByteArrayOStream;
import java.io.IOException;

// Referenced classes of package com.vladium.emma.instr:
//            InstrVisitor

static final class ct_var extends ct_var
{

    private static final int HEADER_INIT_CAPACITY = 16;
    private final ByteArrayOStream m_buf;

    void emit(ct_var ct_var)
    {
        try
        {
            m_buf.writeTo(ct_var.);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ct_var ct_var)
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
        return 2;
    }

    (InstrVisitor instrvisitor, int i)
    {
        super(instrvisitor);
        ByteArrayOStream bytearrayostream = new ByteArrayOStream(16);
        m_buf = bytearrayostream;
        com.vladium.jcd.cls.ClassDef classdef = instrvisitor.m_cls;
        int j = instrvisitor.m_coverageFieldrefIndex;
        int k = instrvisitor.m_preclinitMethodrefIndex;
        bytearrayostream.write4(178, j >>> 8, j, 89);
        bytearrayostream.write3(199, 0, 7);
        bytearrayostream.write4(87, 184, k >>> 8, k);
        CodeGen.push_int_value(bytearrayostream, classdef, instrvisitor.m_methodID);
        bytearrayostream.write(50);
        CodeGen.store_local_object_var(bytearrayostream, i);
    }
}
