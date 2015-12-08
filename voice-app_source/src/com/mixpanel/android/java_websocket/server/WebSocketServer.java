// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.server;

import com.mixpanel.android.java_websocket.SocketChannelIOHelper;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.WebSocketAdapter;
import com.mixpanel.android.java_websocket.WebSocketFactory;
import com.mixpanel.android.java_websocket.WebSocketImpl;
import com.mixpanel.android.java_websocket.WrappedByteChannel;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.handshake.ClientHandshake;
import com.mixpanel.android.java_websocket.handshake.Handshakedata;
import com.mixpanel.android.java_websocket.handshake.ServerHandshakeBuilder;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.mixpanel.android.java_websocket.server:
//            DefaultWebSocketServerFactory

public abstract class WebSocketServer extends WebSocketAdapter
    implements Runnable
{
    public static interface WebSocketServerFactory
        extends WebSocketFactory
    {

        public abstract WebSocketImpl createWebSocket(WebSocketAdapter websocketadapter, Draft draft, Socket socket);

        public abstract WebSocketImpl createWebSocket(WebSocketAdapter websocketadapter, List list, Socket socket);

        public abstract ByteChannel wrapChannel(SocketChannel socketchannel, SelectionKey selectionkey)
            throws IOException;
    }

    public class WebSocketWorker extends Thread
    {

        static final boolean $assertionsDisabled;
        private BlockingQueue iqueue;
        final WebSocketServer this$0;

        public void put(WebSocketImpl websocketimpl)
            throws InterruptedException
        {
            iqueue.put(websocketimpl);
        }

        public void run()
        {
            Object obj = null;
_L2:
            Object obj1 = (WebSocketImpl)iqueue.take();
            obj = obj1;
            ByteBuffer bytebuffer = (ByteBuffer)((WebSocketImpl) (obj1)).inQueue.poll();
            obj = obj1;
            if (!$assertionsDisabled && bytebuffer == null)
            {
                obj = obj1;
                try
                {
                    throw new AssertionError();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    handleFatal(((WebSocket) (obj)), ((Exception) (obj1)));
                }
                break; /* Loop/switch isn't completed */
            }
            ((WebSocketImpl) (obj1)).decode(bytebuffer);
            obj = obj1;
            pushBuffer(bytebuffer);
            obj = obj1;
            if (true) goto _L2; else goto _L1
_L1:
            return;
            Exception exception;
            exception;
            obj = obj1;
            pushBuffer(bytebuffer);
            obj = obj1;
            throw exception;
        }

        static 
        {
            boolean flag;
            if (!com/mixpanel/android/java_websocket/server/WebSocketServer.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

        public WebSocketWorker()
        {
            this$0 = WebSocketServer.this;
            super();
            iqueue = new LinkedBlockingQueue();
            setName((new StringBuilder("WebSocketWorker-")).append(getId()).toString());
            setUncaughtExceptionHandler(new _cls1());
        }
    }


    static final boolean $assertionsDisabled;
    public static int DECODERS = Runtime.getRuntime().availableProcessors();
    private final InetSocketAddress address;
    private BlockingQueue buffers;
    private final Collection connections;
    private List decoders;
    private List drafts;
    private List iqueue;
    private volatile AtomicBoolean isclosed;
    private int queueinvokes;
    private AtomicInteger queuesize;
    private Selector selector;
    private Thread selectorthread;
    private ServerSocketChannel server;
    private WebSocketServerFactory wsf;

    public WebSocketServer()
        throws UnknownHostException
    {
        this(new InetSocketAddress(80), DECODERS, null);
    }

    public WebSocketServer(InetSocketAddress inetsocketaddress)
    {
        this(inetsocketaddress, DECODERS, null);
    }

    public WebSocketServer(InetSocketAddress inetsocketaddress, int i)
    {
        this(inetsocketaddress, i, null);
    }

    public WebSocketServer(InetSocketAddress inetsocketaddress, int i, List list)
    {
        this(inetsocketaddress, i, list, ((Collection) (new HashSet())));
    }

    public WebSocketServer(InetSocketAddress inetsocketaddress, int i, List list, Collection collection)
    {
        isclosed = new AtomicBoolean(false);
        queueinvokes = 0;
        queuesize = new AtomicInteger(0);
        wsf = new DefaultWebSocketServerFactory();
        if (inetsocketaddress == null || i < 1 || collection == null)
        {
            throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
        }
        int j;
        if (list == null)
        {
            drafts = Collections.emptyList();
        } else
        {
            drafts = list;
        }
        address = inetsocketaddress;
        connections = collection;
        iqueue = new LinkedList();
        decoders = new ArrayList(i);
        buffers = new LinkedBlockingQueue();
        j = 0;
        do
        {
            if (j >= i)
            {
                return;
            }
            inetsocketaddress = new WebSocketWorker();
            decoders.add(inetsocketaddress);
            inetsocketaddress.start();
            j++;
        } while (true);
    }

    public WebSocketServer(InetSocketAddress inetsocketaddress, List list)
    {
        this(inetsocketaddress, DECODERS, list);
    }

    private Socket getSocket(WebSocket websocket)
    {
        return ((SocketChannel)((WebSocketImpl)websocket).key.channel()).socket();
    }

    private void handleFatal(WebSocket websocket, Exception exception)
    {
        onError(websocket, exception);
        try
        {
            stop();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WebSocket websocket)
        {
            onError(null, websocket);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WebSocket websocket)
        {
            Thread.currentThread().interrupt();
        }
        onError(null, websocket);
    }

    private void handleIOException(SelectionKey selectionkey, WebSocket websocket, IOException ioexception)
    {
        if (websocket != null)
        {
            websocket.closeConnection(1006, ioexception.getMessage());
        } else
        if (selectionkey != null)
        {
            selectionkey = selectionkey.channel();
            if (selectionkey != null && selectionkey.isOpen())
            {
                try
                {
                    selectionkey.close();
                }
                // Misplaced declaration of an exception variable
                catch (SelectionKey selectionkey) { }
                if (WebSocketImpl.DEBUG)
                {
                    System.out.println((new StringBuilder("Connection closed because of")).append(ioexception).toString());
                    return;
                }
            }
        }
    }

    private void pushBuffer(ByteBuffer bytebuffer)
        throws InterruptedException
    {
        if (buffers.size() > queuesize.intValue())
        {
            return;
        } else
        {
            buffers.put(bytebuffer);
            return;
        }
    }

    private void queue(WebSocketImpl websocketimpl)
        throws InterruptedException
    {
        if (websocketimpl.workerThread == null)
        {
            websocketimpl.workerThread = (WebSocketWorker)decoders.get(queueinvokes % decoders.size());
            queueinvokes = queueinvokes + 1;
        }
        websocketimpl.workerThread.put(websocketimpl);
    }

    private ByteBuffer takeBuffer()
        throws InterruptedException
    {
        return (ByteBuffer)buffers.take();
    }

    protected boolean addConnection(WebSocket websocket)
    {
        if (isclosed.get())
        {
            break MISSING_BLOCK_LABEL_55;
        }
        Collection collection = connections;
        collection;
        JVM INSTR monitorenter ;
        boolean flag = connections.add(websocket);
        if ($assertionsDisabled || flag)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        throw new AssertionError();
        websocket;
        collection;
        JVM INSTR monitorexit ;
        throw websocket;
        collection;
        JVM INSTR monitorexit ;
        return flag;
        websocket.close(1001);
        return true;
    }

    protected void allocateBuffers(WebSocket websocket)
        throws InterruptedException
    {
        if (queuesize.get() >= decoders.size() * 2 + 1)
        {
            return;
        } else
        {
            queuesize.incrementAndGet();
            buffers.put(createBuffer());
            return;
        }
    }

    public Collection connections()
    {
        return connections;
    }

    public ByteBuffer createBuffer()
    {
        return ByteBuffer.allocate(WebSocketImpl.RCVBUF);
    }

    public InetSocketAddress getAddress()
    {
        return address;
    }

    public List getDraft()
    {
        return Collections.unmodifiableList(drafts);
    }

    protected String getFlashSecurityPolicy()
    {
        return (new StringBuilder("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"")).append(getPort()).append("\" /></cross-domain-policy>").toString();
    }

    public InetSocketAddress getLocalSocketAddress(WebSocket websocket)
    {
        return (InetSocketAddress)getSocket(websocket).getLocalSocketAddress();
    }

    public int getPort()
    {
        int j = getAddress().getPort();
        int i = j;
        if (j == 0)
        {
            i = j;
            if (server != null)
            {
                i = server.socket().getLocalPort();
            }
        }
        return i;
    }

    public InetSocketAddress getRemoteSocketAddress(WebSocket websocket)
    {
        return (InetSocketAddress)getSocket(websocket).getRemoteSocketAddress();
    }

    public final WebSocketFactory getWebSocketFactory()
    {
        return wsf;
    }

    public abstract void onClose(WebSocket websocket, int i, String s, boolean flag);

    public void onCloseInitiated(WebSocket websocket, int i, String s)
    {
    }

    public void onClosing(WebSocket websocket, int i, String s, boolean flag)
    {
    }

    protected boolean onConnect(SelectionKey selectionkey)
    {
        return true;
    }

    public abstract void onError(WebSocket websocket, Exception exception);

    public void onFragment(WebSocket websocket, Framedata framedata)
    {
    }

    public abstract void onMessage(WebSocket websocket, String s);

    public void onMessage(WebSocket websocket, ByteBuffer bytebuffer)
    {
    }

    public abstract void onOpen(WebSocket websocket, ClientHandshake clienthandshake);

    public final void onWebsocketClose(WebSocket websocket, int i, String s, boolean flag)
    {
        selector.wakeup();
        if (removeConnection(websocket))
        {
            onClose(websocket, i, s, flag);
        }
        try
        {
            releaseBuffers(websocket);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WebSocket websocket)
        {
            Thread.currentThread().interrupt();
        }
        break MISSING_BLOCK_LABEL_56;
        s;
        try
        {
            releaseBuffers(websocket);
        }
        // Misplaced declaration of an exception variable
        catch (WebSocket websocket)
        {
            Thread.currentThread().interrupt();
        }
        throw s;
    }

    public void onWebsocketCloseInitiated(WebSocket websocket, int i, String s)
    {
        onCloseInitiated(websocket, i, s);
    }

    public void onWebsocketClosing(WebSocket websocket, int i, String s, boolean flag)
    {
        onClosing(websocket, i, s, flag);
    }

    public final void onWebsocketError(WebSocket websocket, Exception exception)
    {
        onError(websocket, exception);
    }

    public ServerHandshakeBuilder onWebsocketHandshakeReceivedAsServer(WebSocket websocket, Draft draft, ClientHandshake clienthandshake)
        throws InvalidDataException
    {
        return super.onWebsocketHandshakeReceivedAsServer(websocket, draft, clienthandshake);
    }

    public final void onWebsocketMessage(WebSocket websocket, String s)
    {
        onMessage(websocket, s);
    }

    public final void onWebsocketMessage(WebSocket websocket, ByteBuffer bytebuffer)
    {
        onMessage(websocket, bytebuffer);
    }

    public void onWebsocketMessageFragment(WebSocket websocket, Framedata framedata)
    {
        onFragment(websocket, framedata);
    }

    public final void onWebsocketOpen(WebSocket websocket, Handshakedata handshakedata)
    {
        if (addConnection(websocket))
        {
            onOpen(websocket, (ClientHandshake)handshakedata);
        }
    }

    public final void onWriteDemand(WebSocket websocket)
    {
        websocket = (WebSocketImpl)websocket;
        try
        {
            ((WebSocketImpl) (websocket)).key.interestOps(5);
        }
        catch (CancelledKeyException cancelledkeyexception)
        {
            ((WebSocketImpl) (websocket)).outQueue.clear();
        }
        selector.wakeup();
    }

    protected void releaseBuffers(WebSocket websocket)
        throws InterruptedException
    {
    }

    protected boolean removeConnection(WebSocket websocket)
    {
        Collection collection = connections;
        collection;
        JVM INSTR monitorenter ;
        boolean flag = connections.remove(websocket);
        if ($assertionsDisabled || flag)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        throw new AssertionError();
        websocket;
        collection;
        JVM INSTR monitorexit ;
        throw websocket;
        collection;
        JVM INSTR monitorexit ;
        if (isclosed.get() && connections.size() == 0)
        {
            selectorthread.interrupt();
        }
        return flag;
    }

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        if (selectorthread != null)
        {
            throw new IllegalStateException((new StringBuilder(String.valueOf(getClass().getName()))).append(" can only be started once.").toString());
        }
        break MISSING_BLOCK_LABEL_48;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        selectorthread = Thread.currentThread();
        if (!isclosed.get())
        {
            break MISSING_BLOCK_LABEL_68;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        Object obj1;
        selectorthread.setName((new StringBuilder("WebsocketSelector")).append(selectorthread.getId()).toString());
        boolean flag;
        try
        {
            server = ServerSocketChannel.open();
            server.configureBlocking(false);
            ServerSocket serversocket = server.socket();
            serversocket.setReceiveBufferSize(WebSocketImpl.RCVBUF);
            serversocket.bind(address);
            selector = Selector.open();
            server.register(selector, server.validOps());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            handleFatal(null, ((Exception) (obj1)));
            return;
        }
_L24:
        flag = selectorthread.isInterrupted();
        if (!flag) goto _L2; else goto _L1
_L1:
        if (decoders == null) goto _L4; else goto _L3
_L3:
        obj1 = decoders.iterator();
_L22:
        if (((Iterator) (obj1)).hasNext()) goto _L5; else goto _L4
_L4:
        if (server != null)
        {
            try
            {
                server.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                onError(null, ((Exception) (obj1)));
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj5 = null;
        obj4 = null;
        obj6 = null;
        obj2 = null;
        obj1 = obj6;
        obj3 = obj5;
        selector.select();
        obj1 = obj6;
        obj3 = obj5;
        Iterator iterator = selector.selectedKeys().iterator();
_L9:
        obj1 = obj2;
        obj3 = obj4;
        if (iterator.hasNext()) goto _L7; else goto _L6
_L6:
        obj1 = obj2;
        obj3 = obj4;
        if (iqueue.isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = obj2;
        obj3 = obj4;
        obj2 = (WebSocketImpl)iqueue.remove(0);
        obj1 = obj2;
        obj3 = obj4;
        obj6 = (WrappedByteChannel)((WebSocketImpl) (obj2)).channel;
        obj1 = obj2;
        obj3 = obj4;
        obj5 = takeBuffer();
        if (SocketChannelIOHelper.readMore(((ByteBuffer) (obj5)), ((WebSocketImpl) (obj2)), ((WrappedByteChannel) (obj6))))
        {
            iqueue.add(obj2);
        }
        if (!((ByteBuffer) (obj5)).hasRemaining())
        {
            break MISSING_BLOCK_LABEL_1135;
        }
        ((WebSocketImpl) (obj2)).inQueue.put(obj5);
        queue(((WebSocketImpl) (obj2)));
          goto _L6
        IOException ioexception1;
        ioexception1;
        obj1 = obj2;
        obj3 = obj4;
        pushBuffer(((ByteBuffer) (obj5)));
        obj1 = obj2;
        obj3 = obj4;
        throw ioexception1;
_L7:
        obj1 = obj2;
        obj3 = obj4;
        ioexception1 = (SelectionKey)iterator.next();
        obj4 = ioexception1;
        obj1 = obj2;
        obj3 = ioexception1;
        if (!ioexception1.isValid()) goto _L9; else goto _L8
_L8:
        obj1 = obj2;
        obj3 = ioexception1;
        if (!ioexception1.isAcceptable())
        {
            break MISSING_BLOCK_LABEL_760;
        }
        obj1 = obj2;
        obj3 = ioexception1;
        if (onConnect(ioexception1))
        {
            break MISSING_BLOCK_LABEL_555;
        }
        obj1 = obj2;
        obj3 = ioexception1;
        ioexception1.cancel();
        obj4 = ioexception1;
          goto _L9
        obj1;
        if (decoders != null)
        {
            for (obj1 = decoders.iterator(); ((Iterator) (obj1)).hasNext(); ((WebSocketWorker)((Iterator) (obj1)).next()).interrupt())
            {
                break MISSING_BLOCK_LABEL_1144;
            }

        }
        if (server != null)
        {
            try
            {
                server.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                onError(null, ((Exception) (obj1)));
            }
            return;
        }
        break; /* Loop/switch isn't completed */
        obj1 = obj2;
        obj3 = ioexception1;
        obj4 = server.accept();
        obj1 = obj2;
        obj3 = ioexception1;
        ((SocketChannel) (obj4)).configureBlocking(false);
        obj1 = obj2;
        obj3 = ioexception1;
        obj5 = wsf.createWebSocket(this, drafts, ((SocketChannel) (obj4)).socket());
        obj1 = obj2;
        obj3 = ioexception1;
        obj5.key = ((SocketChannel) (obj4)).register(selector, 1, obj5);
        obj1 = obj2;
        obj3 = ioexception1;
        obj5.channel = wsf.wrapChannel(((SocketChannel) (obj4)), ((WebSocketImpl) (obj5)).key);
        obj1 = obj2;
        obj3 = ioexception1;
        iterator.remove();
        obj1 = obj2;
        obj3 = ioexception1;
        allocateBuffers(((WebSocket) (obj5)));
        obj4 = ioexception1;
          goto _L9
        obj2;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_694;
        }
        ((SelectionKey) (obj3)).cancel();
        handleIOException(((SelectionKey) (obj3)), ((WebSocket) (obj1)), ((IOException) (obj2)));
        continue; /* Loop/switch isn't completed */
        obj1;
        handleFatal(null, ((Exception) (obj1)));
        if (decoders != null)
        {
            for (obj1 = decoders.iterator(); ((Iterator) (obj1)).hasNext(); ((WebSocketWorker)((Iterator) (obj1)).next()).interrupt())
            {
                break MISSING_BLOCK_LABEL_1174;
            }

        }
        if (server != null)
        {
            try
            {
                server.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                onError(null, ((Exception) (obj1)));
            }
            return;
        }
        break; /* Loop/switch isn't completed */
        obj1 = obj2;
        obj3 = ioexception1;
        obj5 = obj2;
        if (!ioexception1.isReadable()) goto _L11; else goto _L10
_L10:
        obj1 = obj2;
        obj3 = ioexception1;
        obj2 = (WebSocketImpl)ioexception1.attachment();
        obj1 = obj2;
        obj3 = ioexception1;
        obj4 = takeBuffer();
        if (!SocketChannelIOHelper.read(((ByteBuffer) (obj4)), ((WebSocketImpl) (obj2)), ((WebSocketImpl) (obj2)).channel)) goto _L13; else goto _L12
_L12:
        if (!((ByteBuffer) (obj4)).hasRemaining()) goto _L15; else goto _L14
_L14:
        ((WebSocketImpl) (obj2)).inQueue.put(obj4);
        queue(((WebSocketImpl) (obj2)));
        iterator.remove();
        obj5 = obj2;
        if (!(((WebSocketImpl) (obj2)).channel instanceof WrappedByteChannel)) goto _L11; else goto _L16
_L16:
        obj5 = obj2;
        if (!((WrappedByteChannel)((WebSocketImpl) (obj2)).channel).isNeedRead()) goto _L11; else goto _L17
_L17:
        iqueue.add(obj2);
        obj5 = obj2;
_L11:
        obj2 = obj5;
        obj4 = ioexception1;
        obj1 = obj5;
        obj3 = ioexception1;
        if (!ioexception1.isWritable()) goto _L9; else goto _L18
_L18:
        obj1 = obj5;
        obj3 = ioexception1;
        obj5 = (WebSocketImpl)ioexception1.attachment();
        obj2 = obj5;
        obj4 = ioexception1;
        obj1 = obj5;
        obj3 = ioexception1;
        if (!SocketChannelIOHelper.batch(((WebSocketImpl) (obj5)), ((WebSocketImpl) (obj5)).channel)) goto _L9; else goto _L19
_L19:
        obj2 = obj5;
        obj4 = ioexception1;
        obj1 = obj5;
        obj3 = ioexception1;
        if (!ioexception1.isValid()) goto _L9; else goto _L20
_L20:
        obj1 = obj5;
        obj3 = ioexception1;
        ioexception1.interestOps(1);
        obj2 = obj5;
        obj4 = ioexception1;
          goto _L9
        obj1;
        if (decoders != null)
        {
            for (obj1 = decoders.iterator(); ((Iterator) (obj1)).hasNext(); ((WebSocketWorker)((Iterator) (obj1)).next()).interrupt())
            {
                break MISSING_BLOCK_LABEL_1159;
            }

        }
        if (server != null)
        {
            try
            {
                server.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                onError(null, ((Exception) (obj1)));
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L15:
        pushBuffer(((ByteBuffer) (obj4)));
        obj5 = obj2;
          goto _L11
        obj5;
        obj1 = obj2;
        obj3 = ioexception1;
        pushBuffer(((ByteBuffer) (obj4)));
        obj1 = obj2;
        obj3 = ioexception1;
        throw obj5;
        obj1;
        if (decoders != null)
        {
            for (obj2 = decoders.iterator(); ((Iterator) (obj2)).hasNext(); ((WebSocketWorker)((Iterator) (obj2)).next()).interrupt())
            {
                break MISSING_BLOCK_LABEL_1189;
            }

        }
        if (server != null)
        {
            try
            {
                server.close();
            }
            catch (IOException ioexception)
            {
                onError(null, ioexception);
            }
        }
        throw obj1;
_L13:
        pushBuffer(((ByteBuffer) (obj4)));
        obj5 = obj2;
          goto _L11
        pushBuffer(((ByteBuffer) (obj5)));
          goto _L6
_L5:
        ((WebSocketWorker)((Iterator) (obj1)).next()).interrupt();
        if (true) goto _L22; else goto _L21
_L21:
        return;
        obj1;
        if (true) goto _L24; else goto _L23
_L23:
    }

    public final void setWebSocketFactory(WebSocketServerFactory websocketserverfactory)
    {
        wsf = websocketserverfactory;
    }

    public void start()
    {
        if (selectorthread != null)
        {
            throw new IllegalStateException((new StringBuilder(String.valueOf(getClass().getName()))).append(" can only be started once.").toString());
        } else
        {
            (new Thread(this)).start();
            return;
        }
    }

    public void stop()
        throws IOException, InterruptedException
    {
        stop(0);
    }

    public void stop(int i)
        throws InterruptedException
    {
        if (!isclosed.compareAndSet(false, true))
        {
            return;
        }
        Object obj = connections;
        obj;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList(connections);
        obj;
        JVM INSTR monitorexit ;
        obj = arraylist.iterator();
_L3:
        if (((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (selectorthread != null)
        {
            Thread.currentThread();
            if (selectorthread != Thread.currentThread())
            {
                if (arraylist.size() > 0)
                {
                    selectorthread.join(i);
                }
                selectorthread.interrupt();
                selectorthread.join();
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
_L4:
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        ((WebSocket)((Iterator) (obj)).next()).close(1001);
          goto _L3
        exception;
          goto _L4
    }

    static 
    {
        boolean flag;
        if (!com/mixpanel/android/java_websocket/server/WebSocketServer.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }



    // Unreferenced inner class com/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker$1

/* anonymous class */
    class WebSocketWorker._cls1
        implements Thread.UncaughtExceptionHandler
    {

        final WebSocketWorker this$1;

        public void uncaughtException(Thread thread, Throwable throwable)
        {
            WebSocketWorker.getDefaultUncaughtExceptionHandler().uncaughtException(thread, throwable);
        }

            
            {
                this$1 = WebSocketWorker.this;
                super();
            }
    }

}
