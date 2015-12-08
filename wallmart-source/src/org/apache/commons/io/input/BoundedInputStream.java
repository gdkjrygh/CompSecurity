// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

public class BoundedInputStream extends InputStream
{

    private final InputStream in;
    private long mark;
    private final long max;
    private long pos;
    private boolean propagateClose;

    public BoundedInputStream(InputStream inputstream)
    {
        this(inputstream, -1L);
    }

    public BoundedInputStream(InputStream inputstream, long l)
    {
        pos = 0L;
        mark = -1L;
        propagateClose = true;
        max = l;
        in = inputstream;
    }

    public int available()
        throws IOException
    {
        if (max >= 0L && pos >= max)
        {
            return 0;
        } else
        {
            return in.available();
        }
    }

    public void close()
        throws IOException
    {
        if (propagateClose)
        {
            in.close();
        }
    }

    public boolean isPropagateClose()
    {
        return propagateClose;
    }

    public void mark(int i)
    {
        this;
        JVM INSTR monitorenter ;
        in.mark(i);
        mark = pos;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean markSupported()
    {
        return in.markSupported();
    }

    public int read()
        throws IOException
    {
        if (max >= 0L && pos >= max)
        {
            return -1;
        } else
        {
            int i = in.read();
            pos = pos + 1L;
            return i;
        }
    }

    public int read(byte abyte0[])
        throws IOException
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (max >= 0L && pos >= max)
        {
            return -1;
        }
        long l;
        if (max >= 0L)
        {
            l = Math.min(j, max - pos);
        } else
        {
            l = j;
        }
        i = in.read(abyte0, i, (int)l);
        if (i == -1)
        {
            return -1;
        } else
        {
            pos = pos + (long)i;
            return i;
        }
    }

    public void reset()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        in.reset();
        pos = mark;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setPropagateClose(boolean flag)
    {
        propagateClose = flag;
    }

    public long skip(long l)
        throws IOException
    {
        if (max >= 0L)
        {
            l = Math.min(l, max - pos);
        }
        l = in.skip(l);
        pos = pos + l;
        return l;
    }

    public String toString()
    {
        return in.toString();
    }
}
