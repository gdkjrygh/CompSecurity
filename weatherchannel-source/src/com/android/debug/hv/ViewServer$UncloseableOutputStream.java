// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.debug.hv;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.android.debug.hv:
//            ViewServer

private static class mStream extends OutputStream
{

    private final OutputStream mStream;

    public void close()
        throws IOException
    {
    }

    public boolean equals(Object obj)
    {
        return mStream.equals(obj);
    }

    public void flush()
        throws IOException
    {
        mStream.flush();
    }

    public int hashCode()
    {
        return mStream.hashCode();
    }

    public String toString()
    {
        return mStream.toString();
    }

    public void write(int i)
        throws IOException
    {
        mStream.write(i);
    }

    public void write(byte abyte0[])
        throws IOException
    {
        mStream.write(abyte0);
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        mStream.write(abyte0, i, j);
    }

    (OutputStream outputstream)
    {
        mStream = outputstream;
    }
}
