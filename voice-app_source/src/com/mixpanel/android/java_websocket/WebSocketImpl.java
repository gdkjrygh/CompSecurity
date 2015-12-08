// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket;

import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.drafts.Draft_10;
import com.mixpanel.android.java_websocket.drafts.Draft_17;
import com.mixpanel.android.java_websocket.drafts.Draft_75;
import com.mixpanel.android.java_websocket.drafts.Draft_76;
import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.WebsocketNotConnectedException;
import com.mixpanel.android.java_websocket.framing.CloseFrame;
import com.mixpanel.android.java_websocket.framing.CloseFrameBuilder;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.handshake.ClientHandshake;
import com.mixpanel.android.java_websocket.handshake.ClientHandshakeBuilder;
import com.mixpanel.android.java_websocket.handshake.Handshakedata;
import com.mixpanel.android.java_websocket.handshake.ServerHandshake;
import com.mixpanel.android.java_websocket.util.Charsetfunctions;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.mixpanel.android.java_websocket:
//            WebSocket, WebSocketListener

public class WebSocketImpl
    implements WebSocket
{

    static final boolean $assertionsDisabled;
    public static boolean DEBUG = false;
    public static int RCVBUF = 16384;
    public static final List defaultdraftlist;
    public ByteChannel channel;
    private Integer closecode;
    private Boolean closedremotely;
    private String closemessage;
    private com.mixpanel.android.java_websocket.framing.Framedata.Opcode current_continuous_frame_opcode;
    private Draft draft;
    private volatile boolean flushandclosestate;
    private ClientHandshake handshakerequest;
    public final BlockingQueue inQueue;
    public SelectionKey key;
    private List knownDrafts;
    public final BlockingQueue outQueue;
    private WebSocket.READYSTATE readystate;
    private String resourceDescriptor;
    private WebSocket.Role role;
    private ByteBuffer tmpHandshakeBytes;
    public volatile com.mixpanel.android.java_websocket.server.WebSocketServer.WebSocketWorker workerThread;
    private final WebSocketListener wsl;

    public WebSocketImpl(WebSocketListener websocketlistener, Draft draft1)
    {
        flushandclosestate = false;
        readystate = WebSocket.READYSTATE.NOT_YET_CONNECTED;
        draft = null;
        current_continuous_frame_opcode = null;
        tmpHandshakeBytes = ByteBuffer.allocate(0);
        handshakerequest = null;
        closemessage = null;
        closecode = null;
        closedremotely = null;
        resourceDescriptor = null;
        if (websocketlistener == null || draft1 == null && role == WebSocket.Role.SERVER)
        {
            throw new IllegalArgumentException("parameters must not be null");
        }
        outQueue = new LinkedBlockingQueue();
        inQueue = new LinkedBlockingQueue();
        wsl = websocketlistener;
        role = WebSocket.Role.CLIENT;
        if (draft1 != null)
        {
            draft = draft1.copyInstance();
        }
    }

    public WebSocketImpl(WebSocketListener websocketlistener, Draft draft1, Socket socket)
    {
        this(websocketlistener, draft1);
    }

    public WebSocketImpl(WebSocketListener websocketlistener, List list)
    {
        this(websocketlistener, ((Draft) (null)));
        role = WebSocket.Role.SERVER;
        if (list == null || list.isEmpty())
        {
            knownDrafts = defaultdraftlist;
            return;
        } else
        {
            knownDrafts = list;
            return;
        }
    }

    public WebSocketImpl(WebSocketListener websocketlistener, List list, Socket socket)
    {
        this(websocketlistener, list);
    }

    private void close(int i, String s, boolean flag)
    {
label0:
        {
            if (readystate != WebSocket.READYSTATE.CLOSING && readystate != WebSocket.READYSTATE.CLOSED)
            {
                if (readystate != WebSocket.READYSTATE.OPEN)
                {
                    break MISSING_BLOCK_LABEL_190;
                }
                if (i != 1006)
                {
                    break label0;
                }
                if (!$assertionsDisabled && flag)
                {
                    throw new AssertionError();
                }
                readystate = WebSocket.READYSTATE.CLOSING;
                flushAndClose(i, s, false);
            }
            return;
        }
        if (draft.getCloseHandshakeType() == com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType.NONE) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        wsl.onWebsocketCloseInitiated(this, i, s);
_L3:
        sendFrame(new CloseFrameBuilder(i, s));
_L2:
        flushAndClose(i, s, flag);
_L4:
        if (i == 1002)
        {
            flushAndClose(i, s, flag);
        }
        readystate = WebSocket.READYSTATE.CLOSING;
        tmpHandshakeBytes = null;
        return;
        Object obj;
        obj;
        wsl.onWebsocketError(this, ((Exception) (obj)));
          goto _L3
        obj;
        wsl.onWebsocketError(this, ((Exception) (obj)));
        flushAndClose(1006, "generated frame is invalid", false);
          goto _L2
        if (i == -3)
        {
            if (!$assertionsDisabled && !flag)
            {
                throw new AssertionError();
            }
            flushAndClose(-3, s, true);
        } else
        {
            flushAndClose(-1, s, false);
        }
          goto _L4
    }

    private void decodeFrames(ByteBuffer bytebuffer)
    {
        Iterator iterator = draft.translateFrame(bytebuffer).iterator();
_L1:
        if (!iterator.hasNext())
        {
            return;
        }
        Framedata framedata;
        boolean flag;
        framedata = (Framedata)iterator.next();
        if (DEBUG)
        {
            System.out.println((new StringBuilder("matched frame: ")).append(framedata).toString());
        }
        bytebuffer = framedata.getOpcode();
        flag = framedata.isFin();
        if (bytebuffer != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.CLOSING)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        int i;
        i = 1005;
        bytebuffer = "";
label0:
        {
            if (framedata instanceof CloseFrame)
            {
                bytebuffer = (CloseFrame)framedata;
                i = bytebuffer.getCloseCode();
                bytebuffer = bytebuffer.getMessage();
            }
            if (readystate != WebSocket.READYSTATE.CLOSING)
            {
                break label0;
            }
            closeConnection(i, bytebuffer, true);
        }
          goto _L1
label1:
        {
            if (draft.getCloseHandshakeType() != com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType.TWOWAY)
            {
                break label1;
            }
            close(i, bytebuffer, true);
        }
          goto _L1
        try
        {
            flushAndClose(i, bytebuffer, false);
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            wsl.onWebsocketError(this, bytebuffer);
            close(bytebuffer);
            return;
        }
          goto _L1
label2:
        {
            if (bytebuffer != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.PING)
            {
                break label2;
            }
            wsl.onWebsocketPing(this, framedata);
        }
          goto _L1
label3:
        {
            if (bytebuffer != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.PONG)
            {
                break label3;
            }
            wsl.onWebsocketPong(this, framedata);
        }
          goto _L1
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        if (bytebuffer != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.CONTINUOUS)
        {
            break MISSING_BLOCK_LABEL_366;
        }
        if (bytebuffer == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.CONTINUOUS) goto _L3; else goto _L2
_L2:
        if (current_continuous_frame_opcode != null)
        {
            throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
        }
        current_continuous_frame_opcode = bytebuffer;
_L4:
        wsl.onWebsocketMessageFragment(this, framedata);
          goto _L1
        bytebuffer;
        wsl.onWebsocketError(this, bytebuffer);
          goto _L1
_L3:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (current_continuous_frame_opcode == null)
        {
            throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
        }
        current_continuous_frame_opcode = null;
          goto _L4
        if (current_continuous_frame_opcode != null) goto _L4; else goto _L5
_L5:
        throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
        com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode;
        if (current_continuous_frame_opcode != null)
        {
            throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
        }
        opcode = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.TEXT;
        if (bytebuffer != opcode)
        {
            break MISSING_BLOCK_LABEL_435;
        }
        wsl.onWebsocketMessage(this, Charsetfunctions.stringUtf8(framedata.getPayloadData()));
          goto _L1
        bytebuffer;
        wsl.onWebsocketError(this, bytebuffer);
          goto _L1
        opcode = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.BINARY;
        if (bytebuffer != opcode)
        {
            break MISSING_BLOCK_LABEL_480;
        }
        wsl.onWebsocketMessage(this, framedata.getPayloadData());
          goto _L1
        bytebuffer;
        wsl.onWebsocketError(this, bytebuffer);
          goto _L1
        throw new InvalidDataException(1002, "non control or continious frame expected");
    }

    private boolean decodeHandshake(ByteBuffer bytebuffer)
    {
        ByteBuffer bytebuffer1;
        com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState handshakestate;
        com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState handshakestate1;
        if (tmpHandshakeBytes.capacity() == 0)
        {
            bytebuffer1 = bytebuffer;
        } else
        {
            if (tmpHandshakeBytes.remaining() < bytebuffer.remaining())
            {
                bytebuffer1 = ByteBuffer.allocate(tmpHandshakeBytes.capacity() + bytebuffer.remaining());
                tmpHandshakeBytes.flip();
                bytebuffer1.put(tmpHandshakeBytes);
                tmpHandshakeBytes = bytebuffer1;
            }
            tmpHandshakeBytes.put(bytebuffer);
            tmpHandshakeBytes.flip();
            bytebuffer1 = tmpHandshakeBytes;
        }
        bytebuffer1.mark();
        if (draft != null) goto _L2; else goto _L1
_L1:
        handshakestate = isFlashEdgeCase(bytebuffer1);
        handshakestate1 = com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.MATCHED;
        if (handshakestate != handshakestate1) goto _L2; else goto _L3
_L3:
        write(ByteBuffer.wrap(Charsetfunctions.utf8Bytes(wsl.getFlashPolicy(this))));
        close(-3, "");
_L5:
        return false;
        InvalidDataException invaliddataexception;
        invaliddataexception;
        close(1006, "remote peer closed connection before flashpolicy could be transmitted", true);
        if (true) goto _L5; else goto _L4
_L4:
        Object obj;
        obj;
        if (tmpHandshakeBytes.capacity() != 0) goto _L7; else goto _L6
_L6:
        int j;
        bytebuffer1.reset();
        j = ((IncompleteHandshakeException) (obj)).getPreferedSize();
        if (j != 0) goto _L9; else goto _L8
_L8:
        int i = bytebuffer1.capacity() + 16;
_L19:
        tmpHandshakeBytes = ByteBuffer.allocate(i);
        tmpHandshakeBytes.put(bytebuffer);
_L17:
        return false;
_L2:
        if (role != WebSocket.Role.SERVER) goto _L11; else goto _L10
_L10:
        if (draft != null) goto _L13; else goto _L12
_L12:
        obj = knownDrafts.iterator();
_L15:
        if (!((Iterator) (obj)).hasNext())
        {
            if (draft == null)
            {
                close(1002, "no draft matches");
            }
            break MISSING_BLOCK_LABEL_788;
        }
        Object obj1 = ((Draft)((Iterator) (obj)).next()).copyInstance();
        Object obj3;
        ((Draft) (obj1)).setParseMode(role);
        bytebuffer1.reset();
        obj3 = ((Draft) (obj1)).translateHandshake(bytebuffer1);
        if (obj3 instanceof ClientHandshake)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        flushAndClose(1002, "wrong http function", false);
        return false;
        obj3 = (ClientHandshake)obj3;
        if (((Draft) (obj1)).acceptHandshakeAsServer(((ClientHandshake) (obj3))) != com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.MATCHED) goto _L15; else goto _L14
_L14:
        resourceDescriptor = ((ClientHandshake) (obj3)).getResourceDescriptor();
        com.mixpanel.android.java_websocket.handshake.ServerHandshakeBuilder serverhandshakebuilder = wsl.onWebsocketHandshakeReceivedAsServer(this, ((Draft) (obj1)), ((ClientHandshake) (obj3)));
        write(((Draft) (obj1)).createHandshake(((Draft) (obj1)).postProcessHandshakeResponseAsServer(((ClientHandshake) (obj3)), serverhandshakebuilder), role));
        draft = ((Draft) (obj1));
        open(((Handshakedata) (obj3)));
        return true;
        Object obj2;
        obj2;
        flushAndClose(((InvalidDataException) (obj2)).getCloseCode(), ((InvalidDataException) (obj2)).getMessage(), false);
        return false;
        obj2;
        wsl.onWebsocketError(this, ((Exception) (obj2)));
        flushAndClose(-1, ((RuntimeException) (obj2)).getMessage(), false);
        return false;
_L13:
        obj = draft.translateHandshake(bytebuffer1);
        if (obj instanceof ClientHandshake)
        {
            break MISSING_BLOCK_LABEL_491;
        }
        flushAndClose(1002, "wrong http function", false);
        return false;
        obj = (ClientHandshake)obj;
        if (draft.acceptHandshakeAsServer(((ClientHandshake) (obj))) != com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.MATCHED)
        {
            break MISSING_BLOCK_LABEL_517;
        }
        open(((Handshakedata) (obj)));
        return true;
        close(1002, "the handshake did finaly not match");
        return false;
_L11:
        if (role != WebSocket.Role.CLIENT) goto _L17; else goto _L16
_L16:
        draft.setParseMode(role);
        obj = draft.translateHandshake(bytebuffer1);
        if (obj instanceof ServerHandshake)
        {
            break MISSING_BLOCK_LABEL_579;
        }
        flushAndClose(1002, "wrong http function", false);
        return false;
        obj = (ServerHandshake)obj;
        obj2 = draft.acceptHandshakeAsClient(handshakerequest, ((ServerHandshake) (obj)));
        obj3 = com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.MATCHED;
        if (obj2 != obj3)
        {
            break MISSING_BLOCK_LABEL_672;
        }
        wsl.onWebsocketHandshakeReceivedAsClient(this, handshakerequest, ((ServerHandshake) (obj)));
        open(((Handshakedata) (obj)));
        return true;
        obj;
        flushAndClose(((InvalidDataException) (obj)).getCloseCode(), ((InvalidDataException) (obj)).getMessage(), false);
        return false;
        obj;
        wsl.onWebsocketError(this, ((Exception) (obj)));
        flushAndClose(-1, ((RuntimeException) (obj)).getMessage(), false);
        return false;
        close(1002, (new StringBuilder("draft ")).append(draft).append(" refuses handshake").toString());
          goto _L17
        obj;
        close(((InvalidDataException) (obj)));
          goto _L17
_L9:
        i = j;
        if ($assertionsDisabled) goto _L19; else goto _L18
_L18:
        i = j;
        if (((IncompleteHandshakeException) (obj)).getPreferedSize() >= bytebuffer1.remaining()) goto _L19; else goto _L20
_L20:
        throw new AssertionError();
_L7:
        tmpHandshakeBytes.position(tmpHandshakeBytes.limit());
        tmpHandshakeBytes.limit(tmpHandshakeBytes.capacity());
          goto _L17
        obj2;
          goto _L15
        return false;
          goto _L17
    }

    private com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState isFlashEdgeCase(ByteBuffer bytebuffer)
        throws IncompleteHandshakeException
    {
        bytebuffer.mark();
        if (bytebuffer.limit() > Draft.FLASH_POLICY_REQUEST.length)
        {
            return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.NOT_MATCHED;
        }
        if (bytebuffer.limit() < Draft.FLASH_POLICY_REQUEST.length)
        {
            throw new IncompleteHandshakeException(Draft.FLASH_POLICY_REQUEST.length);
        }
        int i = 0;
        do
        {
            if (!bytebuffer.hasRemaining())
            {
                return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.MATCHED;
            }
            if (Draft.FLASH_POLICY_REQUEST[i] != bytebuffer.get())
            {
                bytebuffer.reset();
                return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.NOT_MATCHED;
            }
            i++;
        } while (true);
    }

    private void open(Handshakedata handshakedata)
    {
        if (DEBUG)
        {
            System.out.println((new StringBuilder("open using draft: ")).append(draft.getClass().getSimpleName()).toString());
        }
        readystate = WebSocket.READYSTATE.OPEN;
        try
        {
            wsl.onWebsocketOpen(this, handshakedata);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Handshakedata handshakedata)
        {
            wsl.onWebsocketError(this, handshakedata);
        }
    }

    private void send(Collection collection)
    {
        if (!isOpen())
        {
            throw new WebsocketNotConnectedException();
        }
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                return;
            }
            sendFrame((Framedata)collection.next());
        } while (true);
    }

    private void write(ByteBuffer bytebuffer)
    {
        if (DEBUG)
        {
            PrintStream printstream = System.out;
            StringBuilder stringbuilder = (new StringBuilder("write(")).append(bytebuffer.remaining()).append("): {");
            String s;
            if (bytebuffer.remaining() > 1000)
            {
                s = "too big to display";
            } else
            {
                s = new String(bytebuffer.array());
            }
            printstream.println(stringbuilder.append(s).append("}").toString());
        }
        outQueue.add(bytebuffer);
        wsl.onWriteDemand(this);
    }

    private void write(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                return;
            }
            write((ByteBuffer)list.next());
        } while (true);
    }

    public void close()
    {
        close(1000);
    }

    public void close(int i)
    {
        close(i, "", false);
    }

    public void close(int i, String s)
    {
        close(i, s, false);
    }

    public void close(InvalidDataException invaliddataexception)
    {
        close(invaliddataexception.getCloseCode(), invaliddataexception.getMessage(), false);
    }

    public void closeConnection()
    {
        if (closedremotely == null)
        {
            throw new IllegalStateException("this method must be used in conjuction with flushAndClose");
        } else
        {
            closeConnection(closecode.intValue(), closemessage, closedremotely.booleanValue());
            return;
        }
    }

    public void closeConnection(int i, String s)
    {
        closeConnection(i, s, false);
    }

    protected void closeConnection(int i, String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        WebSocket.READYSTATE readystate1;
        obj = readystate;
        readystate1 = WebSocket.READYSTATE.CLOSED;
        if (obj != readystate1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (key != null)
        {
            key.cancel();
        }
        obj = channel;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        channel.close();
_L3:
        wsl.onWebsocketClose(this, i, s, flag);
_L4:
        if (draft != null)
        {
            draft.reset();
        }
        handshakerequest = null;
        readystate = WebSocket.READYSTATE.CLOSED;
        outQueue.clear();
          goto _L1
        s;
        throw s;
        IOException ioexception;
        ioexception;
        wsl.onWebsocketError(this, ioexception);
          goto _L3
        s;
        wsl.onWebsocketError(this, s);
          goto _L4
    }

    protected void closeConnection(int i, boolean flag)
    {
        closeConnection(i, "", flag);
    }

    public void decode(ByteBuffer bytebuffer)
    {
        if (!$assertionsDisabled && !bytebuffer.hasRemaining())
        {
            throw new AssertionError();
        }
        if (DEBUG)
        {
            PrintStream printstream = System.out;
            StringBuilder stringbuilder = (new StringBuilder("process(")).append(bytebuffer.remaining()).append("): {");
            String s;
            if (bytebuffer.remaining() > 1000)
            {
                s = "too big to display";
            } else
            {
                s = new String(bytebuffer.array(), bytebuffer.position(), bytebuffer.remaining());
            }
            printstream.println(stringbuilder.append(s).append("}").toString());
        }
        if (readystate != WebSocket.READYSTATE.NOT_YET_CONNECTED)
        {
            decodeFrames(bytebuffer);
        } else
        if (decodeHandshake(bytebuffer))
        {
            if (!$assertionsDisabled && tmpHandshakeBytes.hasRemaining() == bytebuffer.hasRemaining() && bytebuffer.hasRemaining())
            {
                throw new AssertionError();
            }
            if (bytebuffer.hasRemaining())
            {
                decodeFrames(bytebuffer);
            } else
            if (tmpHandshakeBytes.hasRemaining())
            {
                decodeFrames(tmpHandshakeBytes);
            }
        }
        if (!$assertionsDisabled && !isClosing() && !isFlushAndClose() && bytebuffer.hasRemaining())
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    public void eot()
    {
        if (getReadyState() == WebSocket.READYSTATE.NOT_YET_CONNECTED)
        {
            closeConnection(-1, true);
            return;
        }
        if (flushandclosestate)
        {
            closeConnection(closecode.intValue(), closemessage, closedremotely.booleanValue());
            return;
        }
        if (draft.getCloseHandshakeType() == com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType.NONE)
        {
            closeConnection(1000, true);
            return;
        }
        if (draft.getCloseHandshakeType() == com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType.ONEWAY)
        {
            if (role == WebSocket.Role.SERVER)
            {
                closeConnection(1006, true);
                return;
            } else
            {
                closeConnection(1000, true);
                return;
            }
        } else
        {
            closeConnection(1006, true);
            return;
        }
    }

    protected void flushAndClose(int i, String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = flushandclosestate;
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        closecode = Integer.valueOf(i);
        closemessage = s;
        closedremotely = Boolean.valueOf(flag);
        flushandclosestate = true;
        wsl.onWriteDemand(this);
        wsl.onWebsocketClosing(this, i, s, flag);
_L4:
        if (draft != null)
        {
            draft.reset();
        }
        handshakerequest = null;
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
        s;
        wsl.onWebsocketError(this, s);
          goto _L4
    }

    public Draft getDraft()
    {
        return draft;
    }

    public InetSocketAddress getLocalSocketAddress()
    {
        return wsl.getLocalSocketAddress(this);
    }

    public WebSocket.READYSTATE getReadyState()
    {
        return readystate;
    }

    public InetSocketAddress getRemoteSocketAddress()
    {
        return wsl.getRemoteSocketAddress(this);
    }

    public String getResourceDescriptor()
    {
        return resourceDescriptor;
    }

    public boolean hasBufferedData()
    {
        return !outQueue.isEmpty();
    }

    public int hashCode()
    {
        return super.hashCode();
    }

    public boolean isClosed()
    {
        return readystate == WebSocket.READYSTATE.CLOSED;
    }

    public boolean isClosing()
    {
        return readystate == WebSocket.READYSTATE.CLOSING;
    }

    public boolean isConnecting()
    {
        if (!$assertionsDisabled && flushandclosestate && readystate != WebSocket.READYSTATE.CONNECTING)
        {
            throw new AssertionError();
        }
        return readystate == WebSocket.READYSTATE.CONNECTING;
    }

    public boolean isFlushAndClose()
    {
        return flushandclosestate;
    }

    public boolean isOpen()
    {
        if (!$assertionsDisabled && readystate == WebSocket.READYSTATE.OPEN && flushandclosestate)
        {
            throw new AssertionError();
        }
        return readystate == WebSocket.READYSTATE.OPEN;
    }

    public void send(String s)
        throws WebsocketNotConnectedException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        Draft draft1 = draft;
        boolean flag;
        if (role == WebSocket.Role.CLIENT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        send(((Collection) (draft1.createFrames(s, flag))));
    }

    public void send(ByteBuffer bytebuffer)
        throws IllegalArgumentException, WebsocketNotConnectedException
    {
        if (bytebuffer == null)
        {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        Draft draft1 = draft;
        boolean flag;
        if (role == WebSocket.Role.CLIENT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        send(((Collection) (draft1.createFrames(bytebuffer, flag))));
    }

    public void send(byte abyte0[])
        throws IllegalArgumentException, WebsocketNotConnectedException
    {
        send(ByteBuffer.wrap(abyte0));
    }

    public void sendFragmentedFrame(com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode, ByteBuffer bytebuffer, boolean flag)
    {
        send(draft.continuousFrame(opcode, bytebuffer, flag));
    }

    public void sendFrame(Framedata framedata)
    {
        if (DEBUG)
        {
            System.out.println((new StringBuilder("send frame: ")).append(framedata).toString());
        }
        write(draft.createBinaryFrame(framedata));
    }

    public void startHandshake(ClientHandshakeBuilder clienthandshakebuilder)
        throws InvalidHandshakeException
    {
        if (!$assertionsDisabled && readystate == WebSocket.READYSTATE.CONNECTING)
        {
            throw new AssertionError("shall only be called once");
        }
        handshakerequest = draft.postProcessHandshakeRequestAsClient(clienthandshakebuilder);
        resourceDescriptor = clienthandshakebuilder.getResourceDescriptor();
        if (!$assertionsDisabled && resourceDescriptor == null)
        {
            throw new AssertionError();
        }
        try
        {
            wsl.onWebsocketHandshakeSentAsClient(this, handshakerequest);
        }
        // Misplaced declaration of an exception variable
        catch (ClientHandshakeBuilder clienthandshakebuilder)
        {
            throw new InvalidHandshakeException("Handshake data rejected by client.");
        }
        // Misplaced declaration of an exception variable
        catch (ClientHandshakeBuilder clienthandshakebuilder)
        {
            wsl.onWebsocketError(this, clienthandshakebuilder);
            throw new InvalidHandshakeException((new StringBuilder("rejected because of")).append(clienthandshakebuilder).toString());
        }
        write(draft.createHandshake(handshakerequest, role));
    }

    public String toString()
    {
        return super.toString();
    }

    static 
    {
        boolean flag;
        if (!com/mixpanel/android/java_websocket/WebSocketImpl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        defaultdraftlist = new ArrayList(4);
        defaultdraftlist.add(new Draft_17());
        defaultdraftlist.add(new Draft_10());
        defaultdraftlist.add(new Draft_76());
        defaultdraftlist.add(new Draft_75());
    }
}
