// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.client;

import com.mixpanel.android.java_websocket.WebSocketImpl;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.mixpanel.android.java_websocket.client:
//            WebSocketClient

private class <init>
    implements Runnable
{

    final WebSocketClient this$0;

    public void run()
    {
        Thread.currentThread().setName("WebsocketWriteThread");
_L1:
        ByteBuffer bytebuffer;
        try
        {
            if (Thread.interrupted())
            {
                return;
            }
        }
        catch (IOException ioexception)
        {
            WebSocketClient.access$0(WebSocketClient.this).eot();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        bytebuffer = (ByteBuffer)WebSocketClient.access$0(WebSocketClient.this).outQueue.take();
        WebSocketClient.access$1(WebSocketClient.this).write(bytebuffer.array(), 0, bytebuffer.limit());
        WebSocketClient.access$1(WebSocketClient.this).flush();
          goto _L1
    }

    private ()
    {
        this$0 = WebSocketClient.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
