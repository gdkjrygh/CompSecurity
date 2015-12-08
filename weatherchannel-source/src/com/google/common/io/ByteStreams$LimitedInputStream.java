// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.common.io:
//            ByteStreams

private static final class left extends FilterInputStream
{

    private long left;
    private long mark;

    public int available()
        throws IOException
    {
        return (int)Math.min(in.available(), left);
    }

    public void mark(int i)
    {
        this;
        JVM INSTR monitorenter ;
        in.mark(i);
        mark = left;
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
        int i;
        if (left == 0L)
        {
            i = -1;
        } else
        {
            int j = in.read();
            i = j;
            if (j != -1)
            {
                left = left - 1L;
                return j;
            }
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (left == 0L)
        {
            i = -1;
        } else
        {
            j = (int)Math.min(j, left);
            j = in.read(abyte0, i, j);
            i = j;
            if (j != -1)
            {
                left = left - (long)j;
                return j;
            }
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
        left = mark;
        this;
        JVM INSTR monitorexit ;
    }

    public long skip(long l)
        throws IOException
    {
        l = Math.min(l, left);
        l = in.skip(l);
        left = left - l;
        return l;
    }

    _cls9(InputStream inputstream, long l)
    {
        super(inputstream);
        mark = -1L;
        Preconditions.checkNotNull(inputstream);
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "limit must be non-negative");
        left = l;
    }
}
