// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

public abstract class ProxyReader extends FilterReader
{

    public ProxyReader(Reader reader)
    {
        super(reader);
    }

    protected void afterRead(int i)
        throws IOException
    {
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
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        in.mark(i);
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

    public int read(CharBuffer charbuffer)
        throws IOException
    {
        if (charbuffer == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        int i = charbuffer.length();
_L1:
        beforeRead(i);
        i = in.read(charbuffer);
        afterRead(i);
        return i;
        i = 0;
          goto _L1
        charbuffer;
        handleIOException(charbuffer);
        return -1;
    }

    public int read(char ac[])
        throws IOException
    {
        if (ac == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        int i = ac.length;
_L1:
        beforeRead(i);
        i = in.read(ac);
        afterRead(i);
        return i;
        i = 0;
          goto _L1
        ac;
        handleIOException(ac);
        return -1;
    }

    public int read(char ac[], int i, int j)
        throws IOException
    {
        try
        {
            beforeRead(j);
            i = in.read(ac, i, j);
            afterRead(i);
        }
        // Misplaced declaration of an exception variable
        catch (char ac[])
        {
            handleIOException(ac);
            return -1;
        }
        return i;
    }

    public boolean ready()
        throws IOException
    {
        boolean flag;
        try
        {
            flag = in.ready();
        }
        catch (IOException ioexception)
        {
            handleIOException(ioexception);
            return false;
        }
        return flag;
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
