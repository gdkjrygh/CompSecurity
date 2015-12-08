// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.io;

import ch.boye.httpclientandroidlib.ConnectionClosedException;
import ch.boye.httpclientandroidlib.io.BufferInfo;
import ch.boye.httpclientandroidlib.io.SessionInputBuffer;
import java.io.IOException;
import java.io.InputStream;

public class ContentLengthInputStream extends InputStream
{

    private static final int BUFFER_SIZE = 2048;
    private boolean closed;
    private long contentLength;
    private SessionInputBuffer in;
    private long pos;

    public ContentLengthInputStream(SessionInputBuffer sessioninputbuffer, long l)
    {
        pos = 0L;
        closed = false;
        in = null;
        if (sessioninputbuffer == null)
        {
            throw new IllegalArgumentException("Input stream may not be null");
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException("Content length may not be negative");
        } else
        {
            in = sessioninputbuffer;
            contentLength = l;
            return;
        }
    }

    public int available()
        throws IOException
    {
        if (in instanceof BufferInfo)
        {
            return Math.min(((BufferInfo)in).length(), (int)(contentLength - pos));
        } else
        {
            return 0;
        }
    }

    public void close()
        throws IOException
    {
        if (closed)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        byte abyte0[];
        if (pos >= contentLength)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        abyte0 = new byte[2048];
        int i;
        do
        {
            i = read(abyte0);
        } while (i >= 0);
        closed = true;
        return;
        Exception exception;
        exception;
        closed = true;
        throw exception;
    }

    public int read()
        throws IOException
    {
        if (closed)
        {
            throw new IOException("Attempted read from closed stream.");
        }
        int i;
        if (pos >= contentLength)
        {
            i = -1;
        } else
        {
            i = in.read();
            if (i == -1)
            {
                if (pos < contentLength)
                {
                    throw new ConnectionClosedException((new StringBuilder()).append("Premature end of Content-Length delimited message body (expected: ").append(contentLength).append("; received: ").append(pos).toString());
                }
            } else
            {
                pos = pos + 1L;
                return i;
            }
        }
        return i;
    }

    public int read(byte abyte0[])
        throws IOException
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (closed)
        {
            throw new IOException("Attempted read from closed stream.");
        }
        if (pos >= contentLength)
        {
            i = -1;
        } else
        {
            int k = j;
            if (pos + (long)j > contentLength)
            {
                k = (int)(contentLength - pos);
            }
            j = in.read(abyte0, i, k);
            if (j == -1 && pos < contentLength)
            {
                throw new ConnectionClosedException((new StringBuilder()).append("Premature end of Content-Length delimited message body (expected: ").append(contentLength).append("; received: ").append(pos).toString());
            }
            i = j;
            if (j > 0)
            {
                pos = pos + (long)j;
                return j;
            }
        }
        return i;
    }

    public long skip(long l)
        throws IOException
    {
        if (l > 0L) goto _L2; else goto _L1
_L1:
        long l2 = 0L;
_L4:
        return l2;
_L2:
        byte abyte0[];
        long l1;
        abyte0 = new byte[2048];
        l1 = Math.min(l, contentLength - pos);
        l = 0L;
_L6:
        l2 = l;
        if (l1 <= 0L) goto _L4; else goto _L3
_L3:
        int i;
        i = read(abyte0, 0, (int)Math.min(2048L, l1));
        l2 = l;
        if (i == -1) goto _L4; else goto _L5
_L5:
        l += i;
        l1 -= i;
          goto _L6
    }
}
