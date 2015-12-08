// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSource;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            HttpConnection

private class endOfInput extends endOfInput
{

    private long bytesRemaining;
    final HttpConnection this$0;

    public void close()
        throws IOException
    {
        if (closed)
        {
            return;
        }
        if (bytesRemaining != 0L && !Util.discard(this, 100, TimeUnit.MILLISECONDS))
        {
            unexpectedEndOfInput();
        }
        closed = true;
    }

    public long read(Buffer buffer, long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l).toString());
        }
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        if (bytesRemaining == 0L)
        {
            l = -1L;
        } else
        {
            long l1 = HttpConnection.access$500(HttpConnection.this).read(buffer, Math.min(bytesRemaining, l));
            if (l1 == -1L)
            {
                unexpectedEndOfInput();
                throw new ProtocolException("unexpected end of stream");
            }
            bytesRemaining = bytesRemaining - l1;
            l = l1;
            if (bytesRemaining == 0L)
            {
                endOfInput(true);
                return l1;
            }
        }
        return l;
    }

    public (long l)
        throws IOException
    {
        this$0 = HttpConnection.this;
        super(HttpConnection.this, null);
        bytesRemaining = l;
        if (bytesRemaining == 0L)
        {
            endOfInput(true);
        }
    }
}
