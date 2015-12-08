// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class CountingInputStream extends FilterInputStream
{

    private long count;
    private long mark;

    public CountingInputStream(InputStream inputstream)
    {
        super(inputstream);
        mark = -1L;
    }

    public long getCount()
    {
        return count;
    }

    public void mark(int i)
    {
        this;
        JVM INSTR monitorenter ;
        in.mark(i);
        mark = count;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int read()
        throws IOException
    {
        int i = in.read();
        if (i != -1)
        {
            count = count + 1L;
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        i = in.read(abyte0, i, j);
        if (i != -1)
        {
            count = count + (long)i;
        }
        return i;
    }

    public void reset()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (!in.markSupported())
        {
            throw new IOException("Mark not supported");
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (mark == -1L)
        {
            throw new IOException("Mark not set");
        }
        in.reset();
        count = mark;
        this;
        JVM INSTR monitorexit ;
    }

    public long skip(long l)
        throws IOException
    {
        l = in.skip(l);
        count = count + l;
        return l;
    }
}
