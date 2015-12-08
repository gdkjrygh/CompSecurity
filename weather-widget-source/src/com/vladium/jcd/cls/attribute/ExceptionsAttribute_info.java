// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;

import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

// Referenced classes of package com.vladium.jcd.cls.attribute:
//            Attribute_info, DeclaredExceptionTable, IDeclaredExceptionTable, IAttributeVisitor

public final class ExceptionsAttribute_info extends Attribute_info
{

    private IDeclaredExceptionTable m_exceptions;

    ExceptionsAttribute_info(int i, long l, UDataInputStream udatainputstream)
        throws IOException
    {
        super(i, l);
        int j = udatainputstream.readU2();
        m_exceptions = new DeclaredExceptionTable(j);
        for (i = 0; i < j; i++)
        {
            int k = udatainputstream.readU2();
            m_exceptions.add(k);
        }

    }

    public ExceptionsAttribute_info(int i, IDeclaredExceptionTable ideclaredexceptiontable)
    {
        super(i, ideclaredexceptiontable.length());
        m_exceptions = ideclaredexceptiontable;
    }

    public void accept(IAttributeVisitor iattributevisitor, Object obj)
    {
        iattributevisitor.visit(this, obj);
    }

    public Object clone()
    {
        ExceptionsAttribute_info exceptionsattribute_info = (ExceptionsAttribute_info)super.clone();
        exceptionsattribute_info.m_exceptions = (IDeclaredExceptionTable)m_exceptions.clone();
        return exceptionsattribute_info;
    }

    public IDeclaredExceptionTable getDeclaredExceptions()
    {
        return m_exceptions;
    }

    public long length()
    {
        return 6L + m_exceptions.length();
    }

    public String toString()
    {
        return (new StringBuilder()).append("ExceptionsAttribute_info: [attribute_name_index = ").append(m_name_index).append(", attribute_length = ").append(m_attribute_length).append(']').toString();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        super.writeInClassFormat(udataoutputstream);
        m_exceptions.writeInClassFormat(udataoutputstream);
    }
}
