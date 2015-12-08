// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;

import com.vladium.jcd.compiler.IClassFormatOutput;
import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

public final class InnerClass_info
    implements Cloneable, IClassFormatOutput
{

    public int m_inner_access_flags;
    public int m_inner_class_index;
    public int m_inner_name_index;
    public int m_outer_class_index;

    public InnerClass_info(int i, int j, int k, int l)
    {
        m_outer_class_index = i;
        m_inner_class_index = j;
        m_inner_name_index = k;
        m_inner_access_flags = l;
    }

    InnerClass_info(UDataInputStream udatainputstream)
        throws IOException
    {
        m_inner_class_index = udatainputstream.readU2();
        m_outer_class_index = udatainputstream.readU2();
        m_inner_name_index = udatainputstream.readU2();
        m_inner_access_flags = udatainputstream.readU2();
    }

    public Object clone()
    {
        Object obj;
        try
        {
            obj = super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new InternalError(clonenotsupportedexception.toString());
        }
        return obj;
    }

    public String toString()
    {
        return (new StringBuilder()).append("innerclass_info: [m_outer_class_index = ").append(m_outer_class_index).append(", m_inner_class_index = ").append(m_inner_class_index).append(", m_inner_name_index = ").append(m_inner_name_index).append(", m_inner_access_flags = ").append(m_inner_access_flags).append("]").toString();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        udataoutputstream.writeU2(m_inner_class_index);
        udataoutputstream.writeU2(m_outer_class_index);
        udataoutputstream.writeU2(m_inner_name_index);
        udataoutputstream.writeU2(m_inner_access_flags);
    }
}
