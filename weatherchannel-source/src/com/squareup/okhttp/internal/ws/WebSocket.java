// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.ws;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.NamedRunnable;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.net.ProtocolException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;

// Referenced classes of package com.squareup.okhttp.internal.ws:
//            WebSocketWriter, WebSocketListener, WebSocketReader

public final class WebSocket
{
    public static final class PayloadType extends Enum
    {

        private static final PayloadType $VALUES[];
        public static final PayloadType BINARY;
        public static final PayloadType TEXT;

        public static PayloadType valueOf(String s)
        {
            return (PayloadType)Enum.valueOf(com/squareup/okhttp/internal/ws/WebSocket$PayloadType, s);
        }

        public static PayloadType[] values()
        {
            return (PayloadType[])$VALUES.clone();
        }

        static 
        {
            TEXT = new PayloadType("TEXT", 0);
            BINARY = new PayloadType("BINARY", 1);
            $VALUES = (new PayloadType[] {
                TEXT, BINARY
            });
        }

        private PayloadType(String s, int i)
        {
            super(s, i);
        }
    }

    private class ReaderRunnable extends NamedRunnable
    {

        private final WebSocketListener listener;
        private final WebSocketReader reader;
        final WebSocket this$0;

        protected void execute()
        {
_L2:
            if (readerClosed)
            {
                break; /* Loop/switch isn't completed */
            }
            reader.readMessage();
            if (true) goto _L2; else goto _L1
            IOException ioexception;
            ioexception;
            readerErrorClose(ioexception, listener);
_L1:
        }

        public ReaderRunnable(String s, WebSocketReader websocketreader, WebSocketListener websocketlistener)
        {
            this$0 = WebSocket.this;
            super((new StringBuilder()).append("WebSocketReader ").append(s).toString(), new Object[0]);
            reader = websocketreader;
            listener = websocketlistener;
        }
    }


    private static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    private static final int CLOSE_PROTOCOL_EXCEPTION = 1002;
    private final OkHttpClient client;
    private final Object closeLock;
    private boolean connected;
    private Connection connection;
    private final String key;
    private final Executor pongExecutor;
    private final Random random;
    private volatile boolean readerClosed;
    private final Request request;
    private WebSocketWriter writer;
    private volatile boolean writerClosed;

    WebSocket(OkHttpClient okhttpclient, Request request1, Random random1)
    {
        closeLock = new Object();
        client = okhttpclient;
        random = random1;
        okhttpclient = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque());
        okhttpclient.allowCoreThreadTimeOut(true);
        pongExecutor = okhttpclient;
        if (!"GET".equals(request1.method()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Request must be GET: ").append(request1.method()).toString());
        }
        okhttpclient = request1.urlString();
        if (!okhttpclient.startsWith("ws://")) goto _L2; else goto _L1
_L1:
        okhttpclient = (new StringBuilder()).append("http://").append(okhttpclient.substring(5)).toString();
_L4:
        byte abyte0[] = new byte[16];
        random1.nextBytes(abyte0);
        key = ByteString.of(abyte0).base64();
        request = request1.newBuilder().url(okhttpclient).header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", key).header("Sec-WebSocket-Version", "13").build();
        return;
_L2:
        if (!okhttpclient.startsWith("wss://"))
        {
            break; /* Loop/switch isn't completed */
        }
        okhttpclient = (new StringBuilder()).append("https://").append(okhttpclient.substring(6)).toString();
        if (true) goto _L4; else goto _L3
_L3:
        if (!okhttpclient.startsWith("http://") && !okhttpclient.startsWith("https://")) goto _L5; else goto _L4
_L5:
        throw new IllegalArgumentException((new StringBuilder()).append("Request url must use 'ws', 'wss', 'http', or 'https' scheme: ").append(okhttpclient).toString());
    }

    private void closeConnection()
        throws IOException
    {
        Internal.instance.connectionCloseIfOwnedBy(connection, this);
        connection = null;
    }

    public static WebSocket newWebSocket(OkHttpClient okhttpclient, Request request1)
    {
        okhttpclient = okhttpclient.clone();
        okhttpclient.setProtocols(Collections.singletonList(Protocol.HTTP_1_1));
        return new WebSocket(okhttpclient, request1, new SecureRandom());
    }

    private void peerClose(Buffer buffer)
        throws IOException
    {
        boolean flag;
        synchronized (closeLock)
        {
            readerClosed = true;
            flag = writerClosed;
            writerClosed = true;
        }
        if (flag)
        {
            closeConnection();
            return;
        } else
        {
            writer.writeClose(buffer);
            return;
        }
        buffer;
        obj;
        JVM INSTR monitorexit ;
        throw buffer;
    }

    private void readerErrorClose(IOException ioexception, WebSocketListener websocketlistener)
    {
        boolean flag = true;
        Object obj = closeLock;
        obj;
        JVM INSTR monitorenter ;
        readerClosed = true;
        if (writerClosed)
        {
            flag = false;
        }
        writerClosed = true;
        if (flag)
        {
            if (ioexception instanceof ProtocolException)
            {
                try
                {
                    writer.writeClose(1002, null);
                }
                catch (IOException ioexception2) { }
            }
            try
            {
                closeConnection();
            }
            catch (IOException ioexception1) { }
        }
        websocketlistener.onFailure(ioexception);
        return;
        ioexception;
        obj;
        JVM INSTR monitorexit ;
        throw ioexception;
    }

    public void close(int i, String s)
        throws IOException
    {
label0:
        {
            synchronized (closeLock)
            {
                if (!writerClosed)
                {
                    break label0;
                }
            }
            return;
        }
        boolean flag;
        writerClosed = true;
        flag = readerClosed;
        obj;
        JVM INSTR monitorexit ;
        writer.writeClose(i, s);
        writer = null;
        if (flag)
        {
            closeConnection();
            return;
        } else
        {
            return;
        }
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public Response connect(WebSocketListener websocketlistener)
        throws IOException
    {
        if (connected)
        {
            throw new IllegalStateException("Already connected");
        }
        if (writerClosed)
        {
            throw new IllegalStateException("Closed");
        }
        com.squareup.okhttp.Call call = Internal.instance.newCall(client, request);
        Response response = Internal.instance.callGetResponse(call, true);
        if (response.code() != 101)
        {
            Internal.instance.callEngineReleaseConnection(call);
            return response;
        }
        String s = response.header("Connection");
        if (!"Upgrade".equalsIgnoreCase(s))
        {
            throw new ProtocolException((new StringBuilder()).append("Expected 'Connection' header value 'Upgrade' but was: ").append(s).toString());
        }
        s = response.header("Upgrade");
        if (!"websocket".equalsIgnoreCase(s))
        {
            throw new ProtocolException((new StringBuilder()).append("Expected 'Upgrade' header value 'websocket' but was: ").append(s).toString());
        }
        s = response.header("Sec-WebSocket-Accept");
        String s1 = Util.shaBase64((new StringBuilder()).append(key).append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11").toString());
        if (!s1.equals(s))
        {
            throw new ProtocolException((new StringBuilder()).append("Expected 'Sec-WebSocket-Accept' header value '").append(s1).append("' but was: ").append(s).toString());
        }
        connection = Internal.instance.callEngineGetConnection(call);
        if (!Internal.instance.connectionClearOwner(connection))
        {
            throw new IllegalStateException("Unable to take ownership of connection.");
        } else
        {
            Internal.instance.connectionSetOwner(connection, this);
            connected = true;
            Object obj = connection.getSocket();
            writer = new WebSocketWriter(true, Okio.buffer(Okio.sink(((java.net.Socket) (obj)))), random);
            obj = new WebSocketReader(true, Okio.buffer(Okio.source(((java.net.Socket) (obj)))), websocketlistener, new WebSocketReader.FrameCallback() {

                final WebSocket this$0;

                public void onClose(Buffer buffer)
                    throws IOException
                {
                    peerClose(buffer);
                }

                public void onPing(Buffer buffer)
                {
                    pongExecutor.execute("WebSocket PongWriter". new NamedRunnable(new Object[0], buffer) {

                        final _cls1 this$1;
                        final Buffer val$buffer;

                        protected void execute()
                        {
                            try
                            {
                                writer.writePong(buffer);
                                return;
                            }
                            catch (IOException ioexception)
                            {
                                return;
                            }
                        }

            transient 
            {
                this$1 = final__pcls1;
                buffer = buffer1;
                super(String.this, aobj);
            }
                    });
                }

            
            {
                this$0 = WebSocket.this;
                super();
            }
            });
            (new Thread(new ReaderRunnable(request.urlString(), ((WebSocketReader) (obj)), websocketlistener))).start();
            return response;
        }
    }

    public boolean isClosed()
    {
        return writerClosed;
    }

    public BufferedSink newMessageSink(PayloadType payloadtype)
    {
        if (writerClosed)
        {
            throw new IllegalStateException("Closed");
        }
        if (!connected)
        {
            throw new IllegalStateException("Not connected");
        } else
        {
            return writer.newMessageSink(payloadtype);
        }
    }

    public Request request()
    {
        return request;
    }

    public void sendMessage(PayloadType payloadtype, Buffer buffer)
        throws IOException
    {
        if (writerClosed)
        {
            throw new IllegalStateException("Closed");
        }
        if (!connected)
        {
            throw new IllegalStateException("Not connected");
        } else
        {
            writer.sendMessage(payloadtype, buffer);
            return;
        }
    }





}
