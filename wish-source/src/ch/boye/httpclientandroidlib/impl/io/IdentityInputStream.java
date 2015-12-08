// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.io;

import ch.boye.httpclientandroidlib.io.BufferInfo;
import ch.boye.httpclientandroidlib.io.SessionInputBuffer;
import java.io.IOException;
import java.io.InputStream;

public class IdentityInputStream extends InputStream
{

    private boolean closed;
    private final SessionInputBuffer in;

    public IdentityInputStream(SessionInputBuffer sessioninputbuffer)
    {
        closed = false;
        if (sessioninputbuffer == null)
        {
            throw new IllegalArgumentException("Session input buffer may not be null");
        } else
        {
            in = sessioninputbuffer;
            return;
        }
    }

    public int available()
        throws IOException
    {
        if (in instanceof BufferInfo)
        {
            return ((BufferInfo)in).length();
        } else
        {
            return 0;
        }
    }

    public void close()
        throws IOException
    {
        closed = true;
    }

    public int read()
        throws IOException
    {
        if (closed)
        {
            return -1;
        } else
        {
            return in.read();
        }
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (closed)
        {
            return -1;
        } else
        {
            return in.read(abyte0, i, j);
        }
    }
}
