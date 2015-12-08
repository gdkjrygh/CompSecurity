// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket;

import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.framing.FramedataImpl1;
import com.mixpanel.android.java_websocket.handshake.ClientHandshake;
import com.mixpanel.android.java_websocket.handshake.HandshakeImpl1Server;
import com.mixpanel.android.java_websocket.handshake.ServerHandshake;
import com.mixpanel.android.java_websocket.handshake.ServerHandshakeBuilder;
import java.net.InetSocketAddress;

// Referenced classes of package com.mixpanel.android.java_websocket:
//            WebSocketListener, WebSocket

public abstract class WebSocketAdapter
    implements WebSocketListener
{

    public WebSocketAdapter()
    {
    }

    public String getFlashPolicy(WebSocket websocket)
        throws InvalidDataException
    {
        websocket = websocket.getLocalSocketAddress();
        if (websocket == null)
        {
            throw new InvalidHandshakeException("socket not bound");
        } else
        {
            StringBuffer stringbuffer = new StringBuffer(90);
            stringbuffer.append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"");
            stringbuffer.append(websocket.getPort());
            stringbuffer.append("\" /></cross-domain-policy>\0");
            return stringbuffer.toString();
        }
    }

    public void onWebsocketHandshakeReceivedAsClient(WebSocket websocket, ClientHandshake clienthandshake, ServerHandshake serverhandshake)
        throws InvalidDataException
    {
    }

    public ServerHandshakeBuilder onWebsocketHandshakeReceivedAsServer(WebSocket websocket, Draft draft, ClientHandshake clienthandshake)
        throws InvalidDataException
    {
        return new HandshakeImpl1Server();
    }

    public void onWebsocketHandshakeSentAsClient(WebSocket websocket, ClientHandshake clienthandshake)
        throws InvalidDataException
    {
    }

    public void onWebsocketMessageFragment(WebSocket websocket, Framedata framedata)
    {
    }

    public void onWebsocketPing(WebSocket websocket, Framedata framedata)
    {
        framedata = new FramedataImpl1(framedata);
        framedata.setOptcode(com.mixpanel.android.java_websocket.framing.Framedata.Opcode.PONG);
        websocket.sendFrame(framedata);
    }

    public void onWebsocketPong(WebSocket websocket, Framedata framedata)
    {
    }
}
