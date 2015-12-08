// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class ProxyInputStream extends FilterInputStream
{

    public ProxyInputStream(InputStream inputstream)
    {
        super(inputstream);
    }

    protected void afterRead(int i)
        throws IOException
    {
    }

    public int available()
        throws IOException
    {
        int i;
        try
        {
            i = super.available();
        }
        catch (IOException ioexception)
        {
            handleIOException(ioexception);
            return 0;
        }
        return i;
    }

    protected void beforeRead(int i)
        throws IOException
    {
    }

    public void close()
        throws IOException
    {
        try
        {
            in.close();
            return;
        }
        catch (IOException ioexception)
        {
            handleIOException(ioexception);
        }
    }

    protected void handleIOException(IOException ioexception)
        throws IOException
    {
        throw ioexception;
    }

    public void mark(int i)
    {
        this;
        JVM INSTR monitorenter ;
        in.mark(i);
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
        int i = 1;
        int j;
        try
        {
            beforeRead(1);
            j = in.read();
        }
        catch (IOException ioexception)
        {
            handleIOException(ioexception);
            return -1;
        }
        if (j == -1)
        {
            i = -1;
        }
        afterRead(i);
        return j;
    }

    public int read(byte abyte0[])
        throws IOException
    {
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        int i = abyte0.length;
_L1:
        beforeRead(i);
        i = in.read(abyte0);
        afterRead(i);
        return i;
        i = 0;
          goto _L1
        abyte0;
        handleIOException(abyte0);
        return -1;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        try
        {
            beforeRead(j);
            i = in.read(abyte0, i, j);
            afterRead(i);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            handleIOException(abyte0);
            return -1;
        }
        return i;
    }

    public void reset()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        in.reset();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        handleIOException(((IOException) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    public long skip(long l)
        throws IOException
    {
        try
        {
            l = in.skip(l);
        }
        catch (IOException ioexception)
        {
            handleIOException(ioexception);
            return 0L;
        }
        return l;
    }
}
