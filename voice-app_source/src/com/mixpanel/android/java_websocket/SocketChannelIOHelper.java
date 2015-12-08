// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket;

import com.mixpanel.android.java_websocket.drafts.Draft;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.mixpanel.android.java_websocket:
//            WebSocketImpl, WrappedByteChannel

public class SocketChannelIOHelper
{

    public SocketChannelIOHelper()
    {
    }

    public static boolean batch(WebSocketImpl websocketimpl, ByteChannel bytechannel)
        throws IOException
    {
        Object obj;
        WrappedByteChannel wrappedbytechannel;
        ByteBuffer bytebuffer;
        bytebuffer = (ByteBuffer)websocketimpl.outQueue.peek();
        wrappedbytechannel = null;
        obj = bytebuffer;
        if (bytebuffer != null) goto _L2; else goto _L1
_L1:
        obj = wrappedbytechannel;
        if (bytechannel instanceof WrappedByteChannel)
        {
            wrappedbytechannel = (WrappedByteChannel)bytechannel;
            obj = wrappedbytechannel;
            if (wrappedbytechannel.isNeedWrite())
            {
                wrappedbytechannel.writeMore();
                obj = wrappedbytechannel;
            }
        }
_L9:
        if (!websocketimpl.outQueue.isEmpty() || !websocketimpl.isFlushAndClose() || websocketimpl.getDraft().getRole() != WebSocket.Role.SERVER) goto _L4; else goto _L3
_L3:
        websocketimpl;
        JVM INSTR monitorenter ;
        websocketimpl.closeConnection();
        websocketimpl;
        JVM INSTR monitorexit ;
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        if (!((WrappedByteChannel)bytechannel).isNeedWrite())
        {
            break; /* Loop/switch isn't completed */
        }
_L6:
        return false;
_L2:
        bytechannel.write(((ByteBuffer) (obj)));
        if (((ByteBuffer) (obj)).remaining() > 0) goto _L6; else goto _L5
_L5:
        websocketimpl.outQueue.poll();
        bytebuffer = (ByteBuffer)websocketimpl.outQueue.peek();
        obj = bytebuffer;
        if (bytebuffer != null) goto _L2; else goto _L7
_L7:
        obj = wrappedbytechannel;
        if (true) goto _L9; else goto _L8
        bytechannel;
        websocketimpl;
        JVM INSTR monitorexit ;
        throw bytechannel;
_L8:
        return true;
        return true;
    }

    public static boolean read(ByteBuffer bytebuffer, WebSocketImpl websocketimpl, ByteChannel bytechannel)
        throws IOException
    {
        bytebuffer.clear();
        int i = bytechannel.read(bytebuffer);
        bytebuffer.flip();
        if (i == -1)
        {
            websocketimpl.eot();
        } else
        if (i != 0)
        {
            return true;
        }
        return false;
    }

    public static boolean readMore(ByteBuffer bytebuffer, WebSocketImpl websocketimpl, WrappedByteChannel wrappedbytechannel)
        throws IOException
    {
        bytebuffer.clear();
        int i = wrappedbytechannel.readMore(bytebuffer);
        bytebuffer.flip();
        if (i == -1)
        {
            websocketimpl.eot();
            return false;
        } else
        {
            return wrappedbytechannel.isNeedRead();
        }
    }
}
