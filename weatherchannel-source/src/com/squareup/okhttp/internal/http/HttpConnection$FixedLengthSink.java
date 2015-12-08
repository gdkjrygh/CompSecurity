// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.net.ProtocolException;
import okio.Buffer;
import okio.BufferedSink;
import okio.Sink;
import okio.Timeout;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            HttpConnection

private final class <init>
    implements Sink
{

    private long bytesRemaining;
    private boolean closed;
    final HttpConnection this$0;

    public void close()
        throws IOException
    {
        if (closed)
        {
            return;
        }
        closed = true;
        if (bytesRemaining > 0L)
        {
            throw new ProtocolException("unexpected end of stream");
        } else
        {
            HttpConnection.access$402(HttpConnection.this, 3);
            return;
        }
    }

    public void flush()
        throws IOException
    {
        if (closed)
        {
            return;
        } else
        {
            HttpConnection.access$300(HttpConnection.this).flush();
            return;
        }
    }

    public Timeout timeout()
    {
        return HttpConnection.access$300(HttpConnection.this).timeout();
    }

    public void write(Buffer buffer, long l)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        Util.checkOffsetAndCount(buffer.size(), 0L, l);
        if (l > bytesRemaining)
        {
            throw new ProtocolException((new StringBuilder()).append("expected ").append(bytesRemaining).append(" bytes but received ").append(l).toString());
        } else
        {
            HttpConnection.access$300(HttpConnection.this).write(buffer, l);
            bytesRemaining = bytesRemaining - l;
            return;
        }
    }

    private (long l)
    {
        this$0 = HttpConnection.this;
        super();
        bytesRemaining = l;
    }

    bytesRemaining(long l, bytesRemaining bytesremaining)
    {
        this(l);
    }
}
