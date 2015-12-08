// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.ws;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

// Referenced classes of package com.squareup.okhttp.internal.ws:
//            WebSocketReader, Protocol

private final class <init>
    implements Source
{

    final WebSocketReader this$0;

    public void close()
        throws IOException
    {
        if (!WebSocketReader.access$200(WebSocketReader.this)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        WebSocketReader.access$202(WebSocketReader.this, true);
        if (!WebSocketReader.access$100(WebSocketReader.this))
        {
            WebSocketReader.access$1000(WebSocketReader.this).skip(WebSocketReader.access$400(WebSocketReader.this) - WebSocketReader.access$300(WebSocketReader.this));
            while (!WebSocketReader.access$500(WebSocketReader.this)) 
            {
                WebSocketReader.access$600(WebSocketReader.this);
                WebSocketReader.access$1000(WebSocketReader.this).skip(WebSocketReader.access$400(WebSocketReader.this));
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public long read(Buffer buffer, long l)
        throws IOException
    {
        if (WebSocketReader.access$100(WebSocketReader.this))
        {
            throw new IOException("Closed");
        }
        if (WebSocketReader.access$200(WebSocketReader.this))
        {
            throw new IllegalStateException("Closed");
        }
        if (WebSocketReader.access$300(WebSocketReader.this) == WebSocketReader.access$400(WebSocketReader.this))
        {
            if (WebSocketReader.access$500(WebSocketReader.this))
            {
                return -1L;
            }
            WebSocketReader.access$600(WebSocketReader.this);
            if (WebSocketReader.access$700(WebSocketReader.this) != 0)
            {
                throw new ProtocolException((new StringBuilder()).append("Expected continuation opcode. Got: ").append(Integer.toHexString(WebSocketReader.access$700(WebSocketReader.this))).toString());
            }
        }
        l = Math.min(l, WebSocketReader.access$400(WebSocketReader.this) - WebSocketReader.access$300(WebSocketReader.this));
        if (WebSocketReader.access$800(WebSocketReader.this))
        {
            l = Math.min(l, WebSocketReader.access$900(WebSocketReader.this).length);
            l = WebSocketReader.access$1000(WebSocketReader.this).read(WebSocketReader.access$900(WebSocketReader.this), 0, (int)l);
            if (l == -1L)
            {
                throw new EOFException();
            }
            Protocol.toggleMask(WebSocketReader.access$900(WebSocketReader.this), l, WebSocketReader.access$1100(WebSocketReader.this), WebSocketReader.access$300(WebSocketReader.this));
            buffer.write(WebSocketReader.access$900(WebSocketReader.this), 0, (int)l);
        } else
        {
            long l1 = WebSocketReader.access$1000(WebSocketReader.this).read(buffer, l);
            l = l1;
            if (l1 == -1L)
            {
                throw new EOFException();
            }
        }
        WebSocketReader.access$302(WebSocketReader.this, WebSocketReader.access$300(WebSocketReader.this) + l);
        return l;
    }

    public Timeout timeout()
    {
        return WebSocketReader.access$1000(WebSocketReader.this).timeout();
    }

    private I()
    {
        this$0 = WebSocketReader.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
