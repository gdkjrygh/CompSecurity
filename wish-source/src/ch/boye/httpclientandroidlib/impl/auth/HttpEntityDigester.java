// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.auth;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

class HttpEntityDigester extends OutputStream
{

    private boolean closed;
    private byte digest[];
    private final MessageDigest digester;

    HttpEntityDigester(MessageDigest messagedigest)
    {
        digester = messagedigest;
        digester.reset();
    }

    public void close()
        throws IOException
    {
        if (closed)
        {
            return;
        } else
        {
            closed = true;
            digest = digester.digest();
            super.close();
            return;
        }
    }

    public byte[] getDigest()
    {
        return digest;
    }

    public void write(int i)
        throws IOException
    {
        if (closed)
        {
            throw new IOException("Stream has been already closed");
        } else
        {
            digester.update((byte)i);
            return;
        }
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        if (closed)
        {
            throw new IOException("Stream has been already closed");
        } else
        {
            digester.update(abyte0, i, j);
            return;
        }
    }
}
