// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.io.EOFException;
import java.io.InputStream;

public class bv extends InputStream
{

    InputStream a;

    public bv(InputStream inputstream)
    {
        a = inputstream;
    }

    public int available()
    {
        return a.available();
    }

    public void close()
    {
        a.close();
    }

    public void mark(int i)
    {
        this;
        JVM INSTR monitorenter ;
        a.mark(i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean markSupported()
    {
        return a.markSupported();
    }

    public int read()
    {
        int i = a.read();
        if (i == -1)
        {
            throw new EOFException();
        } else
        {
            return i;
        }
    }

    public int read(byte abyte0[])
    {
        int i = a.read(abyte0);
        if (i == -1)
        {
            throw new EOFException();
        } else
        {
            return i;
        }
    }

    public int read(byte abyte0[], int i, int j)
    {
        i = a.read(abyte0, i, j);
        if (i == -1)
        {
            throw new EOFException();
        } else
        {
            return i;
        }
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        a.reset();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long skip(long l)
    {
        return a.skip(l);
    }
}
