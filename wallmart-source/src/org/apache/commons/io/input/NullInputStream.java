// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class NullInputStream extends InputStream
{

    private boolean eof;
    private long mark;
    private final boolean markSupported;
    private long position;
    private long readlimit;
    private final long size;
    private final boolean throwEofException;

    public NullInputStream(long l)
    {
        this(l, true, false);
    }

    public NullInputStream(long l, boolean flag, boolean flag1)
    {
        mark = -1L;
        size = l;
        markSupported = flag;
        throwEofException = flag1;
    }

    private int doEndOfFile()
        throws EOFException
    {
        eof = true;
        if (throwEofException)
        {
            throw new EOFException();
        } else
        {
            return -1;
        }
    }

    public int available()
    {
        long l = size - position;
        if (l <= 0L)
        {
            return 0;
        }
        if (l > 0x7fffffffL)
        {
            return 0x7fffffff;
        } else
        {
            return (int)l;
        }
    }

    public void close()
        throws IOException
    {
        eof = false;
        position = 0L;
        mark = -1L;
    }

    public long getPosition()
    {
        return position;
    }

    public long getSize()
    {
        return size;
    }

    public void mark(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (!markSupported)
        {
            throw new UnsupportedOperationException("Mark not supported");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        mark = position;
        readlimit = i;
        this;
        JVM INSTR monitorexit ;
    }

    public boolean markSupported()
    {
        return markSupported;
    }

    protected int processByte()
    {
        return 0;
    }

    protected void processBytes(byte abyte0[], int i, int j)
    {
    }

    public int read()
        throws IOException
    {
        if (eof)
        {
            throw new IOException("Read after end of file");
        }
        if (position == size)
        {
            return doEndOfFile();
        } else
        {
            position = position + 1L;
            return processByte();
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
        if (eof)
        {
            throw new IOException("Read after end of file");
        }
        if (position == size)
        {
            return doEndOfFile();
        }
        position = position + (long)j;
        int k = j;
        if (position > size)
        {
            k = j - (int)(position - size);
            position = size;
        }
        processBytes(abyte0, i, k);
        return k;
    }

    public void reset()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (!markSupported)
        {
            throw new UnsupportedOperationException("Mark not supported");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (mark < 0L)
        {
            throw new IOException("No position has been marked");
        }
        if (position > mark + readlimit)
        {
            throw new IOException((new StringBuilder()).append("Marked position [").append(mark).append("] is no longer valid - passed the read limit [").append(readlimit).append("]").toString());
        }
        position = mark;
        eof = false;
        this;
        JVM INSTR monitorexit ;
    }

    public long skip(long l)
        throws IOException
    {
        if (eof)
        {
            throw new IOException("Skip after end of file");
        }
        long l1;
        if (position == size)
        {
            l1 = doEndOfFile();
        } else
        {
            position = position + l;
            l1 = l;
            if (position > size)
            {
                long l2 = position;
                long l3 = size;
                position = size;
                return l - (l2 - l3);
            }
        }
        return l1;
    }
}
