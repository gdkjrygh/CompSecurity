// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.server;

import com.mixpanel.android.java_websocket.WebSocketAdapter;
import com.mixpanel.android.java_websocket.WebSocketFactory;
import com.mixpanel.android.java_websocket.WebSocketImpl;
import com.mixpanel.android.java_websocket.drafts.Draft;
import java.io.IOException;
import java.net.Socket;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;

// Referenced classes of package com.mixpanel.android.java_websocket.server:
//            WebSocketServer

public static interface 
    extends WebSocketFactory
{

    public abstract WebSocketImpl createWebSocket(WebSocketAdapter websocketadapter, Draft draft, Socket socket);

    public abstract WebSocketImpl createWebSocket(WebSocketAdapter websocketadapter, List list, Socket socket);

    public abstract ByteChannel wrapChannel(SocketChannel socketchannel, SelectionKey selectionkey)
        throws IOException;
}
