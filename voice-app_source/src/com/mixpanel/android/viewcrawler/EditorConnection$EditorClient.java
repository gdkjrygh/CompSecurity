// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.util.Log;
import com.mixpanel.android.java_websocket.client.WebSocketClient;
import com.mixpanel.android.java_websocket.drafts.Draft_17;
import com.mixpanel.android.java_websocket.handshake.ServerHandshake;
import com.mixpanel.android.mpmetrics.MPConfig;
import java.net.Socket;
import java.net.URI;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            EditorConnection

private class setSocket extends WebSocketClient
{

    final EditorConnection this$0;

    public void onClose(int i, String s, boolean flag)
    {
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.EditorCnctn", (new StringBuilder("WebSocket closed. Code: ")).append(i).append(", reason: ").append(s).append("\nURI: ").append(EditorConnection.access$1(EditorConnection.this)).toString());
        }
        EditorConnection.access$0(EditorConnection.this).p();
    }

    public void onError(Exception exception)
    {
        if (exception != null && exception.getMessage() != null)
        {
            Log.e("MixpanelAPI.EditorCnctn", (new StringBuilder("Websocket Error: ")).append(exception.getMessage()).toString());
            return;
        } else
        {
            Log.e("MixpanelAPI.EditorCnctn", "Unknown websocket error occurred");
            return;
        }
    }

    public void onMessage(String s)
    {
        Object obj;
        String s1;
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.EditorCnctn", (new StringBuilder("Received message from editor:\n")).append(s).toString());
        }
        try
        {
            obj = new JSONObject(s);
            s1 = ((JSONObject) (obj)).getString("type");
            if (s1.equals("device_info_request"))
            {
                EditorConnection.access$0(EditorConnection.this).viceInfo();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.EditorCnctn", (new StringBuilder("Bad JSON received:")).append(s).toString(), ((Throwable) (obj)));
            return;
        }
        if (s1.equals("snapshot_request"))
        {
            EditorConnection.access$0(EditorConnection.this).apshot(((JSONObject) (obj)));
            return;
        }
        if (s1.equals("change_request"))
        {
            EditorConnection.access$0(EditorConnection.this).mEdit(((JSONObject) (obj)));
            return;
        }
        if (s1.equals("event_binding_request"))
        {
            EditorConnection.access$0(EditorConnection.this).ents(((JSONObject) (obj)));
            return;
        }
        if (s1.equals("clear_request"))
        {
            EditorConnection.access$0(EditorConnection.this).dits(((JSONObject) (obj)));
            return;
        }
        if (s1.equals("tweak_request"))
        {
            EditorConnection.access$0(EditorConnection.this).aks(((JSONObject) (obj)));
        }
        return;
    }

    public void onOpen(ServerHandshake serverhandshake)
    {
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.EditorCnctn", "Websocket connected");
        }
    }

    public (URI uri, int i, Socket socket)
        throws InterruptedException
    {
        this$0 = EditorConnection.this;
        super(uri, new Draft_17(), null, i);
        setSocket(socket);
    }
}
