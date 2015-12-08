// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;

import com.vladium.jcd.cls.attribute.Attribute_info;
import com.vladium.jcd.cls.constant.CONSTANT_Utf8_info;
import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

// Referenced classes of package com.vladium.jcd.cls:
//            IAccessFlags, ElementFactory, IAttributeCollection, ClassDef, 
//            IConstantCollection

public final class Method_info
    implements Cloneable, IAccessFlags
{

    private int m_access_flags;
    private IAttributeCollection m_attributes;
    public int m_descriptor_index;
    public int m_name_index;

    public Method_info(int i, int j, int k, IAttributeCollection iattributecollection)
    {
        m_access_flags = i;
        m_name_index = j;
        m_descriptor_index = k;
        m_attributes = iattributecollection;
    }

    public Method_info(IConstantCollection iconstantcollection, UDataInputStream udatainputstream)
        throws IOException
    {
        m_access_flags = udatainputstream.readU2();
        m_name_index = udatainputstream.readU2();
        m_descriptor_index = udatainputstream.readU2();
        int j = udatainputstream.readU2();
        m_attributes = ElementFactory.newAttributeCollection(j);
        for (int i = 0; i < j; i++)
        {
            Attribute_info attribute_info = Attribute_info.new_Attribute_info(iconstantcollection, udatainputstream);
            m_attributes.add(attribute_info);
        }

    }

    public Object clone()
    {
        Method_info method_info;
        try
        {
            method_info = (Method_info)super.clone();
            method_info.m_attributes = (IAttributeCollection)m_attributes.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new InternalError(clonenotsupportedexception.toString());
        }
        return method_info;
    }

    public final int getAccessFlags()
    {
        return m_access_flags;
    }

    public IAttributeCollection getAttributes()
    {
        return m_attributes;
    }

    public String getDescriptor(ClassDef classdef)
    {
        return ((CONSTANT_Utf8_info)classdef.getConstants().get(m_descriptor_index)).m_value;
    }

    public String getName(ClassDef classdef)
    {
        return ((CONSTANT_Utf8_info)classdef.getConstants().get(m_name_index)).m_value;
    }

    public boolean isAbstract()
    {
        return (m_access_flags & 0x400) != 0;
    }

    public boolean isBridge()
    {
        return (m_access_flags & 0x40) != 0 || m_attributes.hasBridge();
    }

    public boolean isNative()
    {
        return (m_access_flags & 0x100) != 0;
    }

    public boolean isSynthetic()
    {
        return m_attributes.hasSynthetic();
    }

    public final void setAccessFlags(int i)
    {
        m_access_flags = i;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append((new StringBuilder()).append("method_info: [modifiers: 0x").append(Integer.toHexString(m_access_flags)).append(", name_index = ").append(m_name_index).append(", descriptor_index = ").append(m_descriptor_index).append("]\n").toString());
        for (int i = 0; i < m_attributes.size(); i++)
        {
            Attribute_info attribute_info = m_attributes.get(i);
            stringbuffer.append((new StringBuilder()).append("\t[").append(i).append("] attribute: ").append(attribute_info).append("\n").toString());
        }

        return stringbuffer.toString();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        udataoutputstream.writeU2(m_access_flags);
        udataoutputstream.writeU2(m_name_index);
        udataoutputstream.writeU2(m_descriptor_index);
        m_attributes.writeInClassFormat(udataoutputstream);
    }
}
