// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.apache.commons.io.input:
//            ProxyInputStream

public class CountingInputStream extends ProxyInputStream
{

    private long count;

    public CountingInputStream(InputStream inputstream)
    {
        super(inputstream);
    }

    protected void afterRead(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_18;
        }
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

    public long skip(long l)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        l = super.skip(l);
        count = count + l;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }
}
