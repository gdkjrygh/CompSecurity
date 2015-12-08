// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.util.Log;
import com.mixpanel.android.java_websocket.client.WebSocketClient;
import com.mixpanel.android.java_websocket.drafts.Draft_17;
import com.mixpanel.android.java_websocket.exceptions.NotSendableException;
import com.mixpanel.android.java_websocket.exceptions.WebsocketNotConnectedException;
import com.mixpanel.android.java_websocket.handshake.ServerHandshake;
import com.mixpanel.android.mpmetrics.MPConfig;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;

class EditorConnection
{
    public static interface Editor
    {

        public abstract void bindEvents(JSONObject jsonobject);

        public abstract void cleanup();

        public abstract void clearEdits(JSONObject jsonobject);

        public abstract void performEdit(JSONObject jsonobject);

        public abstract void sendDeviceInfo();

        public abstract void sendSnapshot(JSONObject jsonobject);

        public abstract void setTweaks(JSONObject jsonobject);
    }

    private class EditorClient extends WebSocketClient
    {

        final EditorConnection this$0;

        public void onClose(int i, String s, boolean flag)
        {
            if (MPConfig.DEBUG)
            {
                Log.v("MixpanelAPI.EditorCnctn", (new StringBuilder("WebSocket closed. Code: ")).append(i).append(", reason: ").append(s).append("\nURI: ").append(mURI).toString());
            }
            mService.cleanup();
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
                    mService.sendDeviceInfo();
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
                mService.sendSnapshot(((JSONObject) (obj)));
                return;
            }
            if (s1.equals("change_request"))
            {
                mService.performEdit(((JSONObject) (obj)));
                return;
            }
            if (s1.equals("event_binding_request"))
            {
                mService.bindEvents(((JSONObject) (obj)));
                return;
            }
            if (s1.equals("clear_request"))
            {
                mService.clearEdits(((JSONObject) (obj)));
                return;
            }
            if (s1.equals("tweak_request"))
            {
                mService.setTweaks(((JSONObject) (obj)));
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

        public EditorClient(URI uri, int i, Socket socket)
            throws InterruptedException
        {
            this$0 = EditorConnection.this;
            super(uri, new Draft_17(), null, i);
            setSocket(socket);
        }
    }

    public class EditorConnectionException extends IOException
    {

        private static final long serialVersionUID = 0xe5d74d12ed411d3cL;
        final EditorConnection this$0;

        public EditorConnectionException(Throwable throwable)
        {
            this$0 = EditorConnection.this;
            super(throwable.getMessage());
        }
    }

    private class WebSocketOutputStream extends OutputStream
    {

        final EditorConnection this$0;

        public void close()
            throws EditorConnectionException
        {
            try
            {
                mClient.sendFragmentedFrame(com.mixpanel.android.java_websocket.framing.Framedata.Opcode.TEXT, EditorConnection.EMPTY_BYTE_BUFFER, true);
                return;
            }
            catch (WebsocketNotConnectedException websocketnotconnectedexception)
            {
                throw new EditorConnectionException(websocketnotconnectedexception);
            }
            catch (NotSendableException notsendableexception)
            {
                throw new EditorConnectionException(notsendableexception);
            }
        }

        public void write(int i)
            throws EditorConnectionException
        {
            write(new byte[] {
                (byte)i
            }, 0, 1);
        }

        public void write(byte abyte0[])
            throws EditorConnectionException
        {
            write(abyte0, 0, abyte0.length);
        }

        public void write(byte abyte0[], int i, int j)
            throws EditorConnectionException
        {
            abyte0 = ByteBuffer.wrap(abyte0, i, j);
            try
            {
                mClient.sendFragmentedFrame(com.mixpanel.android.java_websocket.framing.Framedata.Opcode.TEXT, abyte0, false);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new EditorConnectionException(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new EditorConnectionException(abyte0);
            }
        }

        private WebSocketOutputStream()
        {
            this$0 = EditorConnection.this;
            super();
        }

        WebSocketOutputStream(WebSocketOutputStream websocketoutputstream)
        {
            this();
        }
    }


    private static final int CONNECT_TIMEOUT = 5000;
    private static final ByteBuffer EMPTY_BYTE_BUFFER = ByteBuffer.allocate(0);
    private static final String LOGTAG = "MixpanelAPI.EditorCnctn";
    private final EditorClient mClient;
    private final Editor mService;
    private final URI mURI;

    public EditorConnection(URI uri, Editor editor, Socket socket)
        throws EditorConnectionException
    {
        mService = editor;
        mURI = uri;
        try
        {
            mClient = new EditorClient(uri, 5000, socket);
            mClient.connectBlocking();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (URI uri)
        {
            throw new EditorConnectionException(uri);
        }
    }

    public BufferedOutputStream getBufferedOutputStream()
    {
        return new BufferedOutputStream(new WebSocketOutputStream(null));
    }

    public boolean isValid()
    {
        return !mClient.isClosed() && !mClient.isClosing() && !mClient.isFlushAndClose();
    }





}
