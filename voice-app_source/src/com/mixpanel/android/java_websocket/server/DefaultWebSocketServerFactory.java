// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.server;

import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.WebSocketAdapter;
import com.mixpanel.android.java_websocket.WebSocketImpl;
import com.mixpanel.android.java_websocket.drafts.Draft;
import java.io.IOException;
import java.net.Socket;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;

public class DefaultWebSocketServerFactory
    implements WebSocketServer.WebSocketServerFactory
{

    public DefaultWebSocketServerFactory()
    {
    }

    public volatile WebSocket createWebSocket(WebSocketAdapter websocketadapter, Draft draft, Socket socket)
    {
        return createWebSocket(websocketadapter, draft, socket);
    }

    public volatile WebSocket createWebSocket(WebSocketAdapter websocketadapter, List list, Socket socket)
    {
        return createWebSocket(websocketadapter, list, socket);
    }

    public WebSocketImpl createWebSocket(WebSocketAdapter websocketadapter, Draft draft, Socket socket)
    {
        return new WebSocketImpl(websocketadapter, draft);
    }

    public WebSocketImpl createWebSocket(WebSocketAdapter websocketadapter, List list, Socket socket)
    {
        return new WebSocketImpl(websocketadapter, list);
    }

    public volatile ByteChannel wrapChannel(SocketChannel socketchannel, SelectionKey selectionkey)
        throws IOException
    {
        return wrapChannel(socketchannel, selectionkey);
    }

    public SocketChannel wrapChannel(SocketChannel socketchannel, SelectionKey selectionkey)
    {
        return socketchannel;
    }
}
