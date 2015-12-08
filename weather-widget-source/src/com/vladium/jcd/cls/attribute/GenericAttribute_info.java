// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;

import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

// Referenced classes of package com.vladium.jcd.cls.attribute:
//            Attribute_info, IAttributeVisitor

public final class GenericAttribute_info extends Attribute_info
{

    private static final byte EMPTY_BYTE_ARRAY[] = new byte[0];
    public byte m_info[];

    GenericAttribute_info(int i, long l, UDataInputStream udatainputstream)
        throws IOException
    {
        super(i, l);
        m_info = new byte[(int)m_attribute_length];
        udatainputstream.readFully(m_info);
    }

    public GenericAttribute_info(int i, byte abyte0[])
    {
        int j;
        if (abyte0 != null)
        {
            j = abyte0.length;
        } else
        {
            j = 0;
        }
        super(i, j);
        if (abyte0 == null)
        {
            abyte0 = EMPTY_BYTE_ARRAY;
        }
        m_info = abyte0;
    }

    public void accept(IAttributeVisitor iattributevisitor, Object obj)
    {
        iattributevisitor.visit(this, obj);
    }

    public Object clone()
    {
        GenericAttribute_info genericattribute_info = (GenericAttribute_info)super.clone();
        byte abyte0[];
        if (m_info.length == 0)
        {
            abyte0 = EMPTY_BYTE_ARRAY;
        } else
        {
            abyte0 = (byte[])(byte[])m_info.clone();
        }
        genericattribute_info.m_info = abyte0;
        return genericattribute_info;
    }

    public long length()
    {
        return (long)(m_info.length + 6);
    }

    public String toString()
    {
        return (new StringBuilder()).append("generic attribute_info: [attribute_name_index = ").append(m_name_index).append(", attribute_length = ").append(m_attribute_length).append(']').toString();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        super.writeInClassFormat(udataoutputstream);
        udataoutputstream.write(m_info, 0, m_info.length);
    }

}
