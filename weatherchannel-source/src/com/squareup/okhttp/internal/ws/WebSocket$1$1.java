// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.ws;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;
import java.util.concurrent.Executor;
import okio.Buffer;

// Referenced classes of package com.squareup.okhttp.internal.ws:
//            WebSocket, WebSocketWriter

class it> extends NamedRunnable
{

    final val.buffer this$1;
    final Buffer val$buffer;

    protected void execute()
    {
        try
        {
            WebSocket.access$000(_fld0).writePong(val$buffer);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    transient is._cls0(Object aobj[], Buffer buffer1)
    {
        this$1 = final__pcls0;
        val$buffer = buffer1;
        super(String.this, aobj);
    }

    // Unreferenced inner class com/squareup/okhttp/internal/ws/WebSocket$1

/* anonymous class */
    class WebSocket._cls1
        implements WebSocketReader.FrameCallback
    {

        final WebSocket this$0;

        public void onClose(Buffer buffer1)
            throws IOException
        {
            WebSocket.access$200(WebSocket.this, buffer1);
        }

        public void onPing(Buffer buffer1)
        {
            WebSocket.access$100(WebSocket.this).execute("WebSocket PongWriter". new WebSocket._cls1._cls1(new Object[0], buffer1));
        }

            
            {
                this$0 = WebSocket.this;
                super();
            }
    }

}
