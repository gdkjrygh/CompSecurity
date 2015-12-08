// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.xml;

import com.vladium.util.IConstants;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

// Referenced classes of package com.vladium.emma.report.xml:
//            ReportGenerator

private static final class m_indent extends BufferedWriter
{

    private static final int INDENT_INCREMENT = 2;
    private int m_indent;
    private transient String m_sindent;
    private int m_state;

    private void indent()
        throws IOException
    {
        if (m_state == 0)
        {
            String s = getIndent();
            super.write(s, 0, s.length());
            m_state = 1;
        }
    }

    void decIndent()
    {
        decIndent(2);
    }

    void decIndent(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("delta be non-negative: ").append(i).toString());
        }
        if (i > m_indent)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("delta = ").append(i).append(", current indent = ").append(m_indent).toString());
        } else
        {
            m_indent = m_indent - i;
            return;
        }
    }

    String getIndent()
    {
        if (m_indent <= 0)
        {
            return "";
        }
        if (m_sindent == null || m_sindent.length() < m_indent)
        {
            char ac[] = new char[m_indent];
            for (int i = 0; i < m_indent; i++)
            {
                ac[i] = ' ';
            }

            m_sindent = new String(ac);
            return m_sindent;
        } else
        {
            return m_sindent.substring(0, m_indent);
        }
    }

    void incIndent()
    {
        incIndent(2);
    }

    void incIndent(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("delta be non-negative: ").append(i).toString());
        } else
        {
            m_indent = m_indent + i;
            return;
        }
    }

    public void newLine()
        throws IOException
    {
        m_state = 0;
        super.write(IConstants.EOL, 0, IConstants.EOL.length());
    }

    public void write(int i)
        throws IOException
    {
        indent();
        super.write(i);
    }

    public void write(String s, int i, int j)
        throws IOException
    {
        indent();
        super.write(s, i, j);
    }

    public void write(char ac[], int i, int j)
        throws IOException
    {
        indent();
        super.write(ac, i, j);
    }

    A(Writer writer, int i, int j)
    {
        super(writer, i);
        m_indent = j;
    }
}
