// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.ws;

import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.BufferedSink;
import okio.Sink;
import okio.Timeout;

// Referenced classes of package com.squareup.okhttp.internal.ws:
//            WebSocketWriter

private final class <init>
    implements Sink
{

    private boolean isFirstFrame;
    private isFirstFrame payloadType;
    final WebSocketWriter this$0;

    public void close()
        throws IOException
    {
        BufferedSink bufferedsink = WebSocketWriter.access$400(WebSocketWriter.this);
        bufferedsink;
        JVM INSTR monitorenter ;
        WebSocketWriter.access$400(WebSocketWriter.this).writeByte(128);
        if (!WebSocketWriter.access$500(WebSocketWriter.this))
        {
            break MISSING_BLOCK_LABEL_113;
        }
        WebSocketWriter.access$400(WebSocketWriter.this).writeByte(128);
        WebSocketWriter.access$700(WebSocketWriter.this).nextBytes(WebSocketWriter.access$600(WebSocketWriter.this));
        WebSocketWriter.access$400(WebSocketWriter.this).write(WebSocketWriter.access$600(WebSocketWriter.this));
_L1:
        WebSocketWriter.access$400(WebSocketWriter.this).flush();
        WebSocketWriter.access$802(WebSocketWriter.this, false);
        return;
        WebSocketWriter.access$400(WebSocketWriter.this).writeByte(0);
          goto _L1
        Exception exception;
        exception;
        bufferedsink;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void flush()
        throws IOException
    {
        synchronized (WebSocketWriter.access$400(WebSocketWriter.this))
        {
            WebSocketWriter.access$400(WebSocketWriter.this).flush();
        }
        return;
        exception;
        bufferedsink;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Timeout timeout()
    {
        return WebSocketWriter.access$400(WebSocketWriter.this).timeout();
    }

    public void write(Buffer buffer, long l)
        throws IOException
    {
        WebSocketWriter.access$300(WebSocketWriter.this, payloadType, buffer, l, isFirstFrame, false);
        isFirstFrame = false;
    }


/*
    static  access$102( ,  1)
    {
        .payloadType = 1;
        return 1;
    }

*/


/*
    static boolean access$202(payloadType payloadtype, boolean flag)
    {
        payloadtype.isFirstFrame = flag;
        return flag;
    }

*/

    private isFirstFrame()
    {
        this$0 = WebSocketWriter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
