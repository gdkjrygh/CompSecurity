// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.OutputStream;

// Referenced classes of package org.apache.commons.io.output:
//            ProxyOutputStream

public class CountingOutputStream extends ProxyOutputStream
{

    private long count;

    public CountingOutputStream(OutputStream outputstream)
    {
        super(outputstream);
        count = 0L;
    }

    protected void beforeWrite(int i)
    {
        this;
        JVM INSTR monitorenter ;
        count = count + (long)i;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long getByteCount()
    {
        this;
        JVM INSTR monitorenter ;
        long l = count;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public int getCount()
    {
        long l = getByteCount();
        if (l > 0x7fffffffL)
        {
            throw new ArithmeticException((new StringBuilder()).append("The byte count ").append(l).append(" is too large to be converted to an int").toString());
        } else
        {
            return (int)l;
        }
    }

    public long resetByteCount()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        l = count;
        count = 0L;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public int resetCount()
    {
        long l = resetByteCount();
        if (l > 0x7fffffffL)
        {
            throw new ArithmeticException((new StringBuilder()).append("The byte count ").append(l).append(" is too large to be converted to an int").toString());
        } else
        {
            return (int)l;
        }
    }
}
