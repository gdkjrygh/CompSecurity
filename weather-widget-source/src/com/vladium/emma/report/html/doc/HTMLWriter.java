// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;

import com.vladium.emma.EMMARuntimeException;
import com.vladium.util.IConstants;
import java.io.IOException;
import java.io.Writer;

public final class HTMLWriter
{

    private Writer m_out;

    public HTMLWriter(Writer writer)
    {
        if (writer == null)
        {
            throw new IllegalArgumentException("null input: out");
        } else
        {
            m_out = writer;
            return;
        }
    }

    public void close()
    {
        if (m_out != null)
        {
            try
            {
                m_out.close();
            }
            catch (IOException ioexception) { }
            m_out = null;
        }
    }

    public void eol()
    {
        if (m_out == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        m_out.write(IConstants.EOL);
        return;
        IOException ioexception;
        ioexception;
        throw new EMMARuntimeException("REPORT_IO_FAILURE", ioexception);
    }

    public void flush()
    {
        if (m_out == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        m_out.flush();
        return;
        IOException ioexception;
        ioexception;
        throw new EMMARuntimeException("REPORT_IO_FAILURE", ioexception);
    }

    public void write(char c)
    {
        if (m_out == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        m_out.write(c);
        return;
        IOException ioexception;
        ioexception;
        throw new EMMARuntimeException("REPORT_IO_FAILURE", ioexception);
    }

    public void write(String s)
    {
        if (m_out == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        m_out.write(s);
        return;
        s;
        throw new EMMARuntimeException("REPORT_IO_FAILURE", s);
    }
}
