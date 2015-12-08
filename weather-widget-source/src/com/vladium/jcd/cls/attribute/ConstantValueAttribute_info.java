// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;

import com.vladium.jcd.cls.ClassDef;
import com.vladium.jcd.cls.IConstantCollection;
import com.vladium.jcd.cls.constant.CONSTANT_literal_info;
import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

// Referenced classes of package com.vladium.jcd.cls.attribute:
//            Attribute_info, IAttributeVisitor

public final class ConstantValueAttribute_info extends Attribute_info
{

    private static final boolean DEBUG = false;
    public int m_value_index;

    public ConstantValueAttribute_info(int i, int j)
    {
        super(i, 2L);
        m_value_index = j;
    }

    ConstantValueAttribute_info(int i, long l, UDataInputStream udatainputstream)
        throws IOException
    {
        super(i, l);
        m_value_index = udatainputstream.readU2();
    }

    public void accept(IAttributeVisitor iattributevisitor, Object obj)
    {
        iattributevisitor.visit(this, obj);
    }

    public Object clone()
    {
        return super.clone();
    }

    public CONSTANT_literal_info getValue(ClassDef classdef)
    {
        return (CONSTANT_literal_info)classdef.getConstants().get(m_value_index);
    }

    public long length()
    {
        return 8L;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ConstantValueAttribute_info: [attribute_name_index = ").append(m_name_index).append(", attribute_length = ").append(m_attribute_length).append(']').toString();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        super.writeInClassFormat(udataoutputstream);
        udataoutputstream.writeU2(m_value_index);
    }
}
