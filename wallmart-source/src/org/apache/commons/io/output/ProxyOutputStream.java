// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ProxyOutputStream extends FilterOutputStream
{

    public ProxyOutputStream(OutputStream outputstream)
    {
        super(outputstream);
    }

    protected void afterWrite(int i)
        throws IOException
    {
    }

    protected void beforeWrite(int i)
        throws IOException
    {
    }

    public void close()
        throws IOException
    {
        try
        {
            out.close();
            return;
        }
        catch (IOException ioexception)
        {
            handleIOException(ioexception);
        }
    }

    public void flush()
        throws IOException
    {
        try
        {
            out.flush();
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

    public void write(int i)
        throws IOException
    {
        try
        {
            beforeWrite(1);
            out.write(i);
            afterWrite(1);
            return;
        }
        catch (IOException ioexception)
        {
            handleIOException(ioexception);
        }
    }

    public void write(byte abyte0[])
        throws IOException
    {
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        int i = abyte0.length;
_L1:
        beforeWrite(i);
        out.write(abyte0);
        afterWrite(i);
        return;
        i = 0;
          goto _L1
        abyte0;
        handleIOException(abyte0);
        return;
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        try
        {
            beforeWrite(j);
            out.write(abyte0, i, j);
            afterWrite(j);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            handleIOException(abyte0);
        }
    }
}
