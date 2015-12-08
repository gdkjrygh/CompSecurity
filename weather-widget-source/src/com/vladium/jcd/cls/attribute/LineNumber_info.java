// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;

import com.vladium.jcd.compiler.IClassFormatOutput;
import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

public final class LineNumber_info
    implements Cloneable, IClassFormatOutput
{

    public int m_line_number;
    public int m_start_pc;

    public LineNumber_info(int i, int j)
    {
        m_start_pc = i;
        m_line_number = j;
    }

    LineNumber_info(UDataInputStream udatainputstream)
        throws IOException
    {
        m_start_pc = udatainputstream.readU2();
        m_line_number = udatainputstream.readU2();
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
        return (new StringBuilder()).append("line_number_info: [start_pc = ").append(m_start_pc).append(", line_number = ").append(m_line_number).append("]").toString();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        udataoutputstream.writeU2(m_start_pc);
        udataoutputstream.writeU2(m_line_number);
    }
}
