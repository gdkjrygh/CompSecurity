// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.client;

import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.WebSocketAdapter;
import com.mixpanel.android.java_websocket.WebSocketImpl;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.drafts.Draft_17;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.handshake.HandshakeImpl1Client;
import com.mixpanel.android.java_websocket.handshake.Handshakedata;
import com.mixpanel.android.java_websocket.handshake.ServerHandshake;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;

public abstract class WebSocketClient extends WebSocketAdapter
    implements Runnable, WebSocket
{
    private class WebsocketWriteThread
        implements Runnable
    {

        final WebSocketClient this$0;

        public void run()
        {
            Thread.currentThread().setName("WebsocketWriteThread");
_L1:
            ByteBuffer bytebuffer;
            try
            {
                if (Thread.interrupted())
                {
                    return;
                }
            }
            catch (IOException ioexception)
            {
                engine.eot();
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
            bytebuffer = (ByteBuffer)engine.outQueue.take();
            ostream.write(bytebuffer.array(), 0, bytebuffer.limit());
            ostream.flush();
              goto _L1
        }

        private WebsocketWriteThread()
        {
            this$0 = WebSocketClient.this;
            super();
        }

        WebsocketWriteThread(WebsocketWriteThread websocketwritethread)
        {
            this();
        }
    }


    static final boolean $assertionsDisabled;
    private CountDownLatch closeLatch;
    private CountDownLatch connectLatch;
    private int connectTimeout;
    private Draft draft;
    private WebSocketImpl engine;
    private Map headers;
    private InputStream istream;
    private OutputStream ostream;
    private Proxy proxy;
    private Socket socket;
    protected URI uri;
    private Thread writeThread;

    public WebSocketClient(URI uri1)
    {
        this(uri1, ((Draft) (new Draft_17())));
    }

    public WebSocketClient(URI uri1, Draft draft1)
    {
        this(uri1, draft1, null, 0);
    }

    public WebSocketClient(URI uri1, Draft draft1, Map map, int i)
    {
        uri = null;
        engine = null;
        socket = null;
        proxy = Proxy.NO_PROXY;
        connectLatch = new CountDownLatch(1);
        closeLatch = new CountDownLatch(1);
        connectTimeout = 0;
        if (uri1 == null)
        {
            throw new IllegalArgumentException();
        }
        if (draft1 == null)
        {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        } else
        {
            uri = uri1;
            draft = draft1;
            headers = map;
            connectTimeout = i;
            engine = new WebSocketImpl(this, draft1);
            return;
        }
    }

    private int getPort()
    {
        String s;
label0:
        {
            int j = uri.getPort();
            int i = j;
            if (j == -1)
            {
                s = uri.getScheme();
                if (!s.equals("wss"))
                {
                    break label0;
                }
                i = 443;
            }
            return i;
        }
        if (s.equals("ws"))
        {
            return 80;
        } else
        {
            throw new RuntimeException((new StringBuilder("unkonow scheme")).append(s).toString());
        }
    }

    private void sendHandshake()
        throws InvalidHandshakeException
    {
        Object obj;
        Object obj1;
        obj = uri.getPath();
        Object obj2 = uri.getQuery();
        if (obj == null || ((String) (obj)).length() == 0)
        {
            obj = "/";
        }
        obj1 = obj;
        if (obj2 != null)
        {
            obj1 = (new StringBuilder(String.valueOf(obj))).append("?").append(((String) (obj2))).toString();
        }
        int i = getPort();
        obj2 = new StringBuilder(String.valueOf(uri.getHost()));
        if (i != 80)
        {
            obj = (new StringBuilder(":")).append(i).toString();
        } else
        {
            obj = "";
        }
        obj2 = ((StringBuilder) (obj2)).append(((String) (obj))).toString();
        obj = new HandshakeImpl1Client();
        ((HandshakeImpl1Client) (obj)).setResourceDescriptor(((String) (obj1)));
        ((HandshakeImpl1Client) (obj)).put("Host", ((String) (obj2)));
        if (headers == null) goto _L2; else goto _L1
_L1:
        obj1 = headers.entrySet().iterator();
_L5:
        if (((Iterator) (obj1)).hasNext()) goto _L3; else goto _L2
_L2:
        engine.startHandshake(((com.mixpanel.android.java_websocket.handshake.ClientHandshakeBuilder) (obj)));
        return;
_L3:
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
        ((HandshakeImpl1Client) (obj)).put((String)entry.getKey(), (String)entry.getValue());
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void close()
    {
        if (writeThread != null)
        {
            engine.close(1000);
        }
    }

    public void close(int i)
    {
        engine.close();
    }

    public void close(int i, String s)
    {
        engine.close(i, s);
    }

    public void closeBlocking()
        throws InterruptedException
    {
        close();
        closeLatch.await();
    }

    public void closeConnection(int i, String s)
    {
        engine.closeConnection(i, s);
    }

    public void connect()
    {
        if (writeThread != null)
        {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        } else
        {
            writeThread = new Thread(this);
            writeThread.start();
            return;
        }
    }

    public boolean connectBlocking()
        throws InterruptedException
    {
        connect();
        connectLatch.await();
        return engine.isOpen();
    }

    public WebSocket getConnection()
    {
        return engine;
    }

    public Draft getDraft()
    {
        return draft;
    }

    public InetSocketAddress getLocalSocketAddress()
    {
        return engine.getLocalSocketAddress();
    }

    public InetSocketAddress getLocalSocketAddress(WebSocket websocket)
    {
        if (socket != null)
        {
            return (InetSocketAddress)socket.getLocalSocketAddress();
        } else
        {
            return null;
        }
    }

    public com.mixpanel.android.java_websocket.WebSocket.READYSTATE getReadyState()
    {
        return engine.getReadyState();
    }

    public InetSocketAddress getRemoteSocketAddress()
    {
        return engine.getRemoteSocketAddress();
    }

    public InetSocketAddress getRemoteSocketAddress(WebSocket websocket)
    {
        if (socket != null)
        {
            return (InetSocketAddress)socket.getRemoteSocketAddress();
        } else
        {
            return null;
        }
    }

    public String getResourceDescriptor()
    {
        return uri.getPath();
    }

    public URI getURI()
    {
        return uri;
    }

    public boolean hasBufferedData()
    {
        return engine.hasBufferedData();
    }

    public boolean isClosed()
    {
        return engine.isClosed();
    }

    public boolean isClosing()
    {
        return engine.isClosing();
    }

    public boolean isConnecting()
    {
        return engine.isConnecting();
    }

    public boolean isFlushAndClose()
    {
        return engine.isFlushAndClose();
    }

    public boolean isOpen()
    {
        return engine.isOpen();
    }

    public abstract void onClose(int i, String s, boolean flag);

    public void onCloseInitiated(int i, String s)
    {
    }

    public void onClosing(int i, String s, boolean flag)
    {
    }

    public abstract void onError(Exception exception);

    public void onFragment(Framedata framedata)
    {
    }

    public abstract void onMessage(String s);

    public void onMessage(ByteBuffer bytebuffer)
    {
    }

    public abstract void onOpen(ServerHandshake serverhandshake);

    public final void onWebsocketClose(WebSocket websocket, int i, String s, boolean flag)
    {
        connectLatch.countDown();
        closeLatch.countDown();
        if (writeThread != null)
        {
            writeThread.interrupt();
        }
        try
        {
            if (socket != null)
            {
                socket.close();
            }
        }
        // Misplaced declaration of an exception variable
        catch (WebSocket websocket)
        {
            onWebsocketError(this, websocket);
        }
        onClose(i, s, flag);
    }

    public void onWebsocketCloseInitiated(WebSocket websocket, int i, String s)
    {
        onCloseInitiated(i, s);
    }

    public void onWebsocketClosing(WebSocket websocket, int i, String s, boolean flag)
    {
        onClosing(i, s, flag);
    }

    public final void onWebsocketError(WebSocket websocket, Exception exception)
    {
        onError(exception);
    }

    public final void onWebsocketMessage(WebSocket websocket, String s)
    {
        onMessage(s);
    }

    public final void onWebsocketMessage(WebSocket websocket, ByteBuffer bytebuffer)
    {
        onMessage(bytebuffer);
    }

    public void onWebsocketMessageFragment(WebSocket websocket, Framedata framedata)
    {
        onFragment(framedata);
    }

    public final void onWebsocketOpen(WebSocket websocket, Handshakedata handshakedata)
    {
        connectLatch.countDown();
        onOpen((ServerHandshake)handshakedata);
    }

    public final void onWriteDemand(WebSocket websocket)
    {
    }

    public void run()
    {
        if (socket != null) goto _L2; else goto _L1
_L1:
        socket = new Socket(proxy);
_L5:
        if (!socket.isBound())
        {
            socket.connect(new InetSocketAddress(uri.getHost(), getPort()), connectTimeout);
        }
        istream = socket.getInputStream();
        ostream = socket.getOutputStream();
        sendHandshake();
        Object obj;
        writeThread = new Thread(new WebsocketWriteThread(null));
        writeThread.start();
        obj = new byte[WebSocketImpl.RCVBUF];
_L6:
        int i;
        if (isClosed())
        {
            break MISSING_BLOCK_LABEL_141;
        }
        i = istream.read(((byte []) (obj)));
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        try
        {
            engine.eot();
        }
        catch (IOException ioexception)
        {
            engine.eot();
        }
        catch (RuntimeException runtimeexception)
        {
            onError(runtimeexception);
            engine.closeConnection(1006, runtimeexception.getMessage());
        }
        if (!$assertionsDisabled && !socket.isClosed())
        {
            throw new AssertionError();
        }
          goto _L3
_L2:
        if (!socket.isClosed()) goto _L5; else goto _L4
_L4:
        throw new IOException();
        obj;
        onWebsocketError(engine, ((Exception) (obj)));
        engine.closeConnection(-1, ((Exception) (obj)).getMessage());
_L3:
        return;
        engine.decode(ByteBuffer.wrap(((byte []) (obj)), 0, i));
          goto _L6
    }

    public void send(String s)
        throws NotYetConnectedException
    {
        engine.send(s);
    }

    public void send(ByteBuffer bytebuffer)
        throws IllegalArgumentException, NotYetConnectedException
    {
        engine.send(bytebuffer);
    }

    public void send(byte abyte0[])
        throws NotYetConnectedException
    {
        engine.send(abyte0);
    }

    public void sendFragmentedFrame(com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode, ByteBuffer bytebuffer, boolean flag)
    {
        engine.sendFragmentedFrame(opcode, bytebuffer, flag);
    }

    public void sendFrame(Framedata framedata)
    {
        engine.sendFrame(framedata);
    }

    public void setProxy(Proxy proxy1)
    {
        if (proxy1 == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            proxy = proxy1;
            return;
        }
    }

    public void setSocket(Socket socket1)
    {
        if (socket != null)
        {
            throw new IllegalStateException("socket has already been set");
        } else
        {
            socket = socket1;
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/mixpanel/android/java_websocket/client/WebSocketClient.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }


}
