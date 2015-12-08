// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.apache.commons.io.output:
//            ProxyOutputStream

public class TeeOutputStream extends ProxyOutputStream
{

    protected OutputStream branch;

    public TeeOutputStream(OutputStream outputstream, OutputStream outputstream1)
    {
        super(outputstream);
        branch = outputstream1;
    }

    public void close()
        throws IOException
    {
        super.close();
        branch.close();
        return;
        Exception exception;
        exception;
        branch.close();
        throw exception;
    }

    public void flush()
        throws IOException
    {
        super.flush();
        branch.flush();
    }

    public void write(int i)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        super.write(i);
        branch.write(i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void write(byte abyte0[])
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        super.write(abyte0);
        branch.write(abyte0);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        super.write(abyte0, i, j);
        branch.write(abyte0, i, j);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }
}
