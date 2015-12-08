// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;

import com.vladium.jcd.cls.ElementFactory;
import com.vladium.jcd.cls.IAttributeCollection;
import com.vladium.jcd.cls.IConstantCollection;
import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

// Referenced classes of package com.vladium.jcd.cls.attribute:
//            Attribute_info, IExceptionHandlerTable, AttributeElementFactory, Exception_info, 
//            IAttributeVisitor

public final class CodeAttribute_info extends Attribute_info
{

    private static final boolean DEBUG = false;
    public static final byte EMPTY_BYTE_ARRAY[] = new byte[0];
    private IAttributeCollection m_attributes;
    private byte m_code[];
    private int m_codeSize;
    private IExceptionHandlerTable m_exceptionHandlerTable;
    public int m_max_locals;
    public int m_max_stack;

    public CodeAttribute_info(int i, int j, int k, byte abyte0[], IExceptionHandlerTable iexceptionhandlertable, IAttributeCollection iattributecollection)
    {
        int l;
        if (abyte0 != null)
        {
            l = abyte0.length;
        } else
        {
            l = 0;
        }
        super(i, (long)(l + 8) + iexceptionhandlertable.length() + iattributecollection.length());
        m_max_stack = j;
        m_max_locals = k;
        if (abyte0 == null)
        {
            abyte0 = EMPTY_BYTE_ARRAY;
        }
        m_code = abyte0;
        m_codeSize = m_code.length;
        m_exceptionHandlerTable = iexceptionhandlertable;
        m_attributes = iattributecollection;
    }

    CodeAttribute_info(IConstantCollection iconstantcollection, int i, long l, UDataInputStream udatainputstream)
        throws IOException
    {
        super(i, l);
        m_max_stack = udatainputstream.readU2();
        m_max_locals = udatainputstream.readU2();
        l = udatainputstream.readU4();
        m_code = new byte[(int)l];
        udatainputstream.readFully(m_code);
        m_codeSize = (int)l;
        int j = udatainputstream.readU2();
        m_exceptionHandlerTable = AttributeElementFactory.newExceptionHandlerTable(j);
        for (i = 0; i < j; i++)
        {
            Exception_info exception_info = new Exception_info(udatainputstream);
            m_exceptionHandlerTable.add(exception_info);
        }

        j = udatainputstream.readU2();
        m_attributes = ElementFactory.newAttributeCollection(j);
        for (i = 0; i < j; i++)
        {
            Attribute_info attribute_info = Attribute_info.new_Attribute_info(iconstantcollection, udatainputstream);
            m_attributes.add(attribute_info);
        }

    }

    public void accept(IAttributeVisitor iattributevisitor, Object obj)
    {
        iattributevisitor.visit(this, obj);
    }

    public Object clone()
    {
        CodeAttribute_info codeattribute_info = (CodeAttribute_info)super.clone();
        byte abyte0[];
        if (m_codeSize == 0)
        {
            abyte0 = EMPTY_BYTE_ARRAY;
        } else
        {
            abyte0 = (byte[])(byte[])m_code.clone();
        }
        codeattribute_info.m_code = abyte0;
        codeattribute_info.m_exceptionHandlerTable = (IExceptionHandlerTable)m_exceptionHandlerTable.clone();
        codeattribute_info.m_attributes = (IAttributeCollection)m_attributes.clone();
        return codeattribute_info;
    }

    public IAttributeCollection getAttributes()
    {
        return m_attributes;
    }

    public final byte[] getCode()
    {
        return m_code;
    }

    public final int getCodeSize()
    {
        return m_codeSize;
    }

    public IExceptionHandlerTable getExceptionTable()
    {
        return m_exceptionHandlerTable;
    }

    public long length()
    {
        return (long)(m_codeSize + 14) + m_exceptionHandlerTable.length() + m_attributes.length();
    }

    public void setCode(byte abyte0[], int i)
    {
        m_code = abyte0;
        m_codeSize = i;
    }

    public String toString()
    {
        String s = System.getProperty("line.separator");
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append((new StringBuilder()).append("CodeAttribute_info: [attribute_name_index = ").append(m_name_index).append(", attribute_length = ").append(m_attribute_length).append("]").append(s).toString());
        stringbuffer.append((new StringBuilder()).append("    max_stack/max_locals = ").append(m_max_stack).append('/').append(m_max_locals).append(s).toString());
        stringbuffer.append((new StringBuilder()).append("    code [length ").append(m_codeSize).append("]").append(s).toString());
        for (int i = 0; i < m_attributes.size(); i++)
        {
            stringbuffer.append((new StringBuilder()).append("         ").append(m_attributes.get(i)).append(s).toString());
        }

        return stringbuffer.toString();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        super.writeInClassFormat(udataoutputstream);
        udataoutputstream.writeU2(m_max_stack);
        udataoutputstream.writeU2(m_max_locals);
        udataoutputstream.writeU4(m_codeSize);
        udataoutputstream.write(m_code, 0, m_codeSize);
        m_exceptionHandlerTable.writeInClassFormat(udataoutputstream);
        m_attributes.writeInClassFormat(udataoutputstream);
    }

}
