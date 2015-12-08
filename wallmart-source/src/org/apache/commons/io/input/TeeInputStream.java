// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package org.apache.commons.io.input:
//            ProxyInputStream

public class TeeInputStream extends ProxyInputStream
{

    private final OutputStream branch;
    private final boolean closeBranch;

    public TeeInputStream(InputStream inputstream, OutputStream outputstream)
    {
        this(inputstream, outputstream, false);
    }

    public TeeInputStream(InputStream inputstream, OutputStream outputstream, boolean flag)
    {
        super(inputstream);
        branch = outputstream;
        closeBranch = flag;
    }

    public void close()
        throws IOException
    {
        super.close();
        if (closeBranch)
        {
            branch.close();
        }
        return;
        Exception exception;
        exception;
        if (closeBranch)
        {
            branch.close();
        }
        throw exception;
    }

    public int read()
        throws IOException
    {
        int i = super.read();
        if (i != -1)
        {
            branch.write(i);
        }
        return i;
    }

    public int read(byte abyte0[])
        throws IOException
    {
        int i = super.read(abyte0);
        if (i != -1)
        {
            branch.write(abyte0, 0, i);
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        j = super.read(abyte0, i, j);
        if (j != -1)
        {
            branch.write(abyte0, i, j);
        }
        return j;
    }
}
