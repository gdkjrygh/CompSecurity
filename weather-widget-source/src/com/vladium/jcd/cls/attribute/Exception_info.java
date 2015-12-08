// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;

import com.vladium.jcd.compiler.IClassFormatOutput;
import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

public final class Exception_info
    implements Cloneable, IClassFormatOutput
{

    public int m_catch_type;
    public int m_end_pc;
    public int m_handler_pc;
    public int m_start_pc;

    public Exception_info(int i, int j, int k, int l)
    {
        m_start_pc = i;
        m_end_pc = j;
        m_handler_pc = k;
        m_catch_type = l;
    }

    Exception_info(UDataInputStream udatainputstream)
        throws IOException
    {
        m_start_pc = udatainputstream.readU2();
        m_end_pc = udatainputstream.readU2();
        m_handler_pc = udatainputstream.readU2();
        m_catch_type = udatainputstream.readU2();
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
        return (new StringBuilder()).append("exception_info: [start_pc/end_pc = ").append(m_start_pc).append('/').append(m_end_pc).append(", handler_pc = ").append(m_handler_pc).append(", catch_type = ").append(m_catch_type).append(']').toString();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        udataoutputstream.writeU2(m_start_pc);
        udataoutputstream.writeU2(m_end_pc);
        udataoutputstream.writeU2(m_handler_pc);
        udataoutputstream.writeU2(m_catch_type);
    }
}
