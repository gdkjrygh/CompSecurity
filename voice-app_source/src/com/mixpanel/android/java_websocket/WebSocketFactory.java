// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket;

import com.mixpanel.android.java_websocket.drafts.Draft;
import java.net.Socket;
import java.util.List;

// Referenced classes of package com.mixpanel.android.java_websocket:
//            WebSocketAdapter, WebSocket

public interface WebSocketFactory
{

    public abstract WebSocket createWebSocket(WebSocketAdapter websocketadapter, Draft draft, Socket socket);

    public abstract WebSocket createWebSocket(WebSocketAdapter websocketadapter, List list, Socket socket);
}
