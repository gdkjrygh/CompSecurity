// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

public abstract class ThresholdingOutputStream extends OutputStream
{

    private final int threshold;
    private boolean thresholdExceeded;
    private long written;

    public ThresholdingOutputStream(int i)
    {
        threshold = i;
    }

    protected void checkThreshold(int i)
        throws IOException
    {
        if (!thresholdExceeded && written + (long)i > (long)threshold)
        {
            thresholdExceeded = true;
            thresholdReached();
        }
    }

    public void close()
        throws IOException
    {
        try
        {
            flush();
        }
        catch (IOException ioexception) { }
        getStream().close();
    }

    public void flush()
        throws IOException
    {
        getStream().flush();
    }

    public long getByteCount()
    {
        return written;
    }

    protected abstract OutputStream getStream()
        throws IOException;

    public int getThreshold()
    {
        return threshold;
    }

    public boolean isThresholdExceeded()
    {
        return written > (long)threshold;
    }

    protected void resetByteCount()
    {
        thresholdExceeded = false;
        written = 0L;
    }

    protected abstract void thresholdReached()
        throws IOException;

    public void write(int i)
        throws IOException
    {
        checkThreshold(1);
        getStream().write(i);
        written = written + 1L;
    }

    public void write(byte abyte0[])
        throws IOException
    {
        checkThreshold(abyte0.length);
        getStream().write(abyte0);
        written = written + (long)abyte0.length;
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        checkThreshold(j);
        getStream().write(abyte0, i, j);
        written = written + (long)j;
    }
}
