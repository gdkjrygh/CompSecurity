// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.constant;

import com.vladium.jcd.cls.ClassDef;
import com.vladium.jcd.cls.IConstantCollection;
import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

// Referenced classes of package com.vladium.jcd.cls.constant:
//            CONSTANT_info, ICONSTANTVisitor, CONSTANT_Utf8_info

public final class CONSTANT_Class_info extends CONSTANT_info
{

    public static final byte TAG = 7;
    public int m_name_index;

    public CONSTANT_Class_info(int i)
    {
        m_name_index = i;
    }

    protected CONSTANT_Class_info(UDataInputStream udatainputstream)
        throws IOException
    {
        m_name_index = udatainputstream.readU2();
    }

    public Object accept(ICONSTANTVisitor iconstantvisitor, Object obj)
    {
        return iconstantvisitor.visit(this, obj);
    }

    public String getName(ClassDef classdef)
    {
        return ((CONSTANT_Utf8_info)classdef.getConstants().get(m_name_index)).m_value;
    }

    public final byte tag()
    {
        return 7;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CONSTANT_Class: [name_index = ").append(m_name_index).append(']').toString();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        super.writeInClassFormat(udataoutputstream);
        udataoutputstream.writeU2(m_name_index);
    }
}
