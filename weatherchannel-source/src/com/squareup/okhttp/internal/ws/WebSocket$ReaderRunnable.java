// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.ws;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.ws:
//            WebSocket, WebSocketReader, WebSocketListener

private class listener extends NamedRunnable
{

    private final WebSocketListener listener;
    private final WebSocketReader reader;
    final WebSocket this$0;

    protected void execute()
    {
_L2:
        if (WebSocket.access$300(WebSocket.this))
        {
            break; /* Loop/switch isn't completed */
        }
        reader.readMessage();
        if (true) goto _L2; else goto _L1
        IOException ioexception;
        ioexception;
        WebSocket.access$400(WebSocket.this, ioexception, listener);
_L1:
    }

    public (String s, WebSocketReader websocketreader, WebSocketListener websocketlistener)
    {
        this$0 = WebSocket.this;
        super((new StringBuilder()).append("WebSocketReader ").append(s).toString(), new Object[0]);
        reader = websocketreader;
        listener = websocketlistener;
    }
}
