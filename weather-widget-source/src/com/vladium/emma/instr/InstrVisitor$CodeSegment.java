// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;


// Referenced classes of package com.vladium.emma.instr:
//            InstrVisitor

static abstract class m_visitor
{

    final InstrVisitor m_visitor;

    abstract void emit(m_visitor m_visitor1);

    abstract int length();

    abstract int maxstack();

    (InstrVisitor instrvisitor)
    {
        m_visitor = instrvisitor;
    }
}
