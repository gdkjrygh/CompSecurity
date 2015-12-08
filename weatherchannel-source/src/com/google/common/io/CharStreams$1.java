// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

// Referenced classes of package com.google.common.io:
//            CharStreams

static final class val.readable extends Reader
{

    final Readable val$readable;

    public void close()
        throws IOException
    {
        if (val$readable instanceof Closeable)
        {
            ((Closeable)val$readable).close();
        }
    }

    public int read(CharBuffer charbuffer)
        throws IOException
    {
        return val$readable.read(charbuffer);
    }

    public int read(char ac[], int i, int j)
        throws IOException
    {
        return read(CharBuffer.wrap(ac, i, j));
    }

    (Readable readable1)
    {
        val$readable = readable1;
        super();
    }
}
