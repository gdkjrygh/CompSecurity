// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

public class DemuxOutputStream extends OutputStream
{

    private final InheritableThreadLocal m_streams = new InheritableThreadLocal();

    public DemuxOutputStream()
    {
    }

    public OutputStream bindStream(OutputStream outputstream)
    {
        OutputStream outputstream1 = (OutputStream)m_streams.get();
        m_streams.set(outputstream);
        return outputstream1;
    }

    public void close()
        throws IOException
    {
        OutputStream outputstream = (OutputStream)m_streams.get();
        if (outputstream != null)
        {
            outputstream.close();
        }
    }

    public void flush()
        throws IOException
    {
        OutputStream outputstream = (OutputStream)m_streams.get();
        if (outputstream != null)
        {
            outputstream.flush();
        }
    }

    public void write(int i)
        throws IOException
    {
        OutputStream outputstream = (OutputStream)m_streams.get();
        if (outputstream != null)
        {
            outputstream.write(i);
        }
    }
}
