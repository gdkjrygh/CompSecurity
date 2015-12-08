// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket;

import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.handshake.ClientHandshake;
import com.mixpanel.android.java_websocket.handshake.Handshakedata;
import com.mixpanel.android.java_websocket.handshake.ServerHandshake;
import com.mixpanel.android.java_websocket.handshake.ServerHandshakeBuilder;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

// Referenced classes of package com.mixpanel.android.java_websocket:
//            WebSocket

public interface WebSocketListener
{

    public abstract String getFlashPolicy(WebSocket websocket)
        throws InvalidDataException;

    public abstract InetSocketAddress getLocalSocketAddress(WebSocket websocket);

    public abstract InetSocketAddress getRemoteSocketAddress(WebSocket websocket);

    public abstract void onWebsocketClose(WebSocket websocket, int i, String s, boolean flag);

    public abstract void onWebsocketCloseInitiated(WebSocket websocket, int i, String s);

    public abstract void onWebsocketClosing(WebSocket websocket, int i, String s, boolean flag);

    public abstract void onWebsocketError(WebSocket websocket, Exception exception);

    public abstract void onWebsocketHandshakeReceivedAsClient(WebSocket websocket, ClientHandshake clienthandshake, ServerHandshake serverhandshake)
        throws InvalidDataException;

    public abstract ServerHandshakeBuilder onWebsocketHandshakeReceivedAsServer(WebSocket websocket, Draft draft, ClientHandshake clienthandshake)
        throws InvalidDataException;

    public abstract void onWebsocketHandshakeSentAsClient(WebSocket websocket, ClientHandshake clienthandshake)
        throws InvalidDataException;

    public abstract void onWebsocketMessage(WebSocket websocket, String s);

    public abstract void onWebsocketMessage(WebSocket websocket, ByteBuffer bytebuffer);

    public abstract void onWebsocketMessageFragment(WebSocket websocket, Framedata framedata);

    public abstract void onWebsocketOpen(WebSocket websocket, Handshakedata handshakedata);

    public abstract void onWebsocketPing(WebSocket websocket, Framedata framedata);

    public abstract void onWebsocketPong(WebSocket websocket, Framedata framedata);

    public abstract void onWriteDemand(WebSocket websocket);
}
