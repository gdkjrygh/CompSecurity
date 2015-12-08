// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;

import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vladium.jcd.cls.attribute:
//            Attribute_info, LineNumber_info, IAttributeVisitor

public final class LineNumberTableAttribute_info extends Attribute_info
{

    private List m_lines;

    LineNumberTableAttribute_info(int i, long l, UDataInputStream udatainputstream)
        throws IOException
    {
        super(i, l);
        int j = udatainputstream.readU2();
        m_lines = new ArrayList(j);
        for (i = 0; i < j; i++)
        {
            m_lines.add(new LineNumber_info(udatainputstream));
        }

    }

    public void accept(IAttributeVisitor iattributevisitor, Object obj)
    {
        iattributevisitor.visit(this, obj);
    }

    public Object clone()
    {
        LineNumberTableAttribute_info linenumbertableattribute_info = (LineNumberTableAttribute_info)super.clone();
        int j = m_lines.size();
        linenumbertableattribute_info.m_lines = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            linenumbertableattribute_info.m_lines.add(((LineNumber_info)m_lines.get(i)).clone());
        }

        return linenumbertableattribute_info;
    }

    public LineNumber_info get(int i)
    {
        return (LineNumber_info)m_lines.get(i);
    }

    public long length()
    {
        return (long)((m_lines.size() << 2) + 8);
    }

    public int size()
    {
        return m_lines.size();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer((new StringBuilder()).append("LineNumberTableAttribute_info: [attribute_name_index = ").append(m_name_index).append(", attribute_length = ").append(length()).append("]\n").toString());
        for (int i = 0; i < size(); i++)
        {
            stringbuffer.append((new StringBuilder()).append("            ").append(get(i)).toString());
            stringbuffer.append("\n");
        }

        return stringbuffer.toString();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        super.writeInClassFormat(udataoutputstream);
        int j = m_lines.size();
        udataoutputstream.writeU2(j);
        for (int i = 0; i < j; i++)
        {
            ((LineNumber_info)m_lines.get(i)).writeInClassFormat(udataoutputstream);
        }

    }
}
