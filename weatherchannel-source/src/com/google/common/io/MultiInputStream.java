// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

// Referenced classes of package com.google.common.io:
//            ByteSource

final class MultiInputStream extends InputStream
{

    private InputStream in;
    private Iterator it;

    public MultiInputStream(Iterator iterator)
        throws IOException
    {
        it = (Iterator)Preconditions.checkNotNull(iterator);
        advance();
    }

    private void advance()
        throws IOException
    {
        close();
        if (it.hasNext())
        {
            in = ((ByteSource)it.next()).openStream();
        }
    }

    public int available()
        throws IOException
    {
        if (in == null)
        {
            return 0;
        } else
        {
            return in.available();
        }
    }

    public void close()
        throws IOException
    {
        if (in == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        in.close();
        in = null;
        return;
        Exception exception;
        exception;
        in = null;
        throw exception;
    }

    public boolean markSupported()
    {
        return false;
    }

    public int read()
        throws IOException
    {
        int i;
        if (in == null)
        {
            i = -1;
        } else
        {
            int j = in.read();
            i = j;
            if (j == -1)
            {
                advance();
                return read();
            }
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        int k;
        if (in == null)
        {
            k = -1;
        } else
        {
            int l = in.read(abyte0, i, j);
            k = l;
            if (l == -1)
            {
                advance();
                return read(abyte0, i, j);
            }
        }
        return k;
    }

    public long skip(long l)
        throws IOException
    {
        long l1;
        if (in == null || l <= 0L)
        {
            l1 = 0L;
        } else
        {
            long l2 = in.skip(l);
            l1 = l2;
            if (l2 == 0L)
            {
                if (read() == -1)
                {
                    return 0L;
                } else
                {
                    return 1L + in.skip(l - 1L);
                }
            }
        }
        return l1;
    }
}
