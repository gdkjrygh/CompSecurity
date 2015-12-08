// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.drafts;

import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.LimitExedeedException;
import com.mixpanel.android.java_websocket.exceptions.NotSendableException;
import com.mixpanel.android.java_websocket.framing.FrameBuilder;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.framing.FramedataImpl1;
import com.mixpanel.android.java_websocket.handshake.ClientHandshake;
import com.mixpanel.android.java_websocket.handshake.ClientHandshakeBuilder;
import com.mixpanel.android.java_websocket.handshake.HandshakeBuilder;
import com.mixpanel.android.java_websocket.handshake.ServerHandshake;
import com.mixpanel.android.java_websocket.handshake.ServerHandshakeBuilder;
import com.mixpanel.android.java_websocket.util.Charsetfunctions;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.mixpanel.android.java_websocket.drafts:
//            Draft

public class Draft_75 extends Draft
{

    public static final byte CR = 13;
    public static final byte END_OF_FRAME = -1;
    public static final byte LF = 10;
    public static final byte START_OF_FRAME = 0;
    protected ByteBuffer currentFrame;
    protected boolean readingState;
    protected List readyframes;
    private final Random reuseableRandom = new Random();

    public Draft_75()
    {
        readingState = false;
        readyframes = new LinkedList();
    }

    public Draft.HandshakeState acceptHandshakeAsClient(ClientHandshake clienthandshake, ServerHandshake serverhandshake)
    {
        if (clienthandshake.getFieldValue("WebSocket-Origin").equals(serverhandshake.getFieldValue("Origin")) && basicAccept(serverhandshake))
        {
            return Draft.HandshakeState.MATCHED;
        } else
        {
            return Draft.HandshakeState.NOT_MATCHED;
        }
    }

    public Draft.HandshakeState acceptHandshakeAsServer(ClientHandshake clienthandshake)
    {
        if (clienthandshake.hasFieldValue("Origin") && basicAccept(clienthandshake))
        {
            return Draft.HandshakeState.MATCHED;
        } else
        {
            return Draft.HandshakeState.NOT_MATCHED;
        }
    }

    public Draft copyInstance()
    {
        return new Draft_75();
    }

    public ByteBuffer createBinaryFrame(Framedata framedata)
    {
        if (framedata.getOpcode() != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.TEXT)
        {
            throw new RuntimeException("only text frames supported");
        } else
        {
            framedata = framedata.getPayloadData();
            ByteBuffer bytebuffer = ByteBuffer.allocate(framedata.remaining() + 2);
            bytebuffer.put((byte)0);
            framedata.mark();
            bytebuffer.put(framedata);
            framedata.reset();
            bytebuffer.put((byte)-1);
            bytebuffer.flip();
            return bytebuffer;
        }
    }

    public ByteBuffer createBuffer()
    {
        return ByteBuffer.allocate(INITIAL_FAMESIZE);
    }

    public List createFrames(String s, boolean flag)
    {
        FramedataImpl1 framedataimpl1 = new FramedataImpl1();
        try
        {
            framedataimpl1.setPayload(ByteBuffer.wrap(Charsetfunctions.utf8Bytes(s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NotSendableException(s);
        }
        framedataimpl1.setFin(true);
        framedataimpl1.setOptcode(com.mixpanel.android.java_websocket.framing.Framedata.Opcode.TEXT);
        framedataimpl1.setTransferemasked(flag);
        return Collections.singletonList(framedataimpl1);
    }

    public List createFrames(ByteBuffer bytebuffer, boolean flag)
    {
        throw new RuntimeException("not yet implemented");
    }

    public Draft.CloseHandshakeType getCloseHandshakeType()
    {
        return Draft.CloseHandshakeType.NONE;
    }

    public ByteBuffer increaseBuffer(ByteBuffer bytebuffer)
        throws LimitExedeedException, InvalidDataException
    {
        bytebuffer.flip();
        ByteBuffer bytebuffer1 = ByteBuffer.allocate(checkAlloc(bytebuffer.capacity() * 2));
        bytebuffer1.put(bytebuffer);
        return bytebuffer1;
    }

    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clienthandshakebuilder)
        throws InvalidHandshakeException
    {
        clienthandshakebuilder.put("Upgrade", "WebSocket");
        clienthandshakebuilder.put("Connection", "Upgrade");
        if (!clienthandshakebuilder.hasFieldValue("Origin"))
        {
            clienthandshakebuilder.put("Origin", (new StringBuilder("random")).append(reuseableRandom.nextInt()).toString());
        }
        return clienthandshakebuilder;
    }

    public HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clienthandshake, ServerHandshakeBuilder serverhandshakebuilder)
        throws InvalidHandshakeException
    {
        serverhandshakebuilder.setHttpStatusMessage("Web Socket Protocol Handshake");
        serverhandshakebuilder.put("Upgrade", "WebSocket");
        serverhandshakebuilder.put("Connection", clienthandshake.getFieldValue("Connection"));
        serverhandshakebuilder.put("WebSocket-Origin", clienthandshake.getFieldValue("Origin"));
        serverhandshakebuilder.put("WebSocket-Location", (new StringBuilder("ws://")).append(clienthandshake.getFieldValue("Host")).append(clienthandshake.getResourceDescriptor()).toString());
        return serverhandshakebuilder;
    }

    public void reset()
    {
        readingState = false;
        currentFrame = null;
    }

    public List translateFrame(ByteBuffer bytebuffer)
        throws InvalidDataException
    {
        bytebuffer = translateRegularFrame(bytebuffer);
        if (bytebuffer == null)
        {
            throw new InvalidDataException(1002);
        } else
        {
            return bytebuffer;
        }
    }

    protected List translateRegularFrame(ByteBuffer bytebuffer)
        throws InvalidDataException
    {
        Object obj1 = null;
_L6:
        if (bytebuffer.hasRemaining()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = readyframes;
        readyframes = new LinkedList();
_L4:
        return ((List) (obj));
_L2:
        byte byte0;
        byte0 = bytebuffer.get();
        if (byte0 == 0)
        {
            if (readingState)
            {
                throw new InvalidFrameException("unexpected START_OF_FRAME");
            }
            readingState = true;
            continue; /* Loop/switch isn't completed */
        }
        if (byte0 == -1)
        {
            if (!readingState)
            {
                throw new InvalidFrameException("unexpected END_OF_FRAME");
            }
            if (currentFrame != null)
            {
                currentFrame.flip();
                obj = new FramedataImpl1();
                ((FramedataImpl1) (obj)).setPayload(currentFrame);
                ((FramedataImpl1) (obj)).setFin(true);
                ((FramedataImpl1) (obj)).setOptcode(com.mixpanel.android.java_websocket.framing.Framedata.Opcode.TEXT);
                readyframes.add(obj);
                currentFrame = null;
                bytebuffer.mark();
            }
            readingState = false;
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (!readingState) goto _L4; else goto _L3
_L3:
        if (currentFrame != null)
        {
            break; /* Loop/switch isn't completed */
        }
        currentFrame = createBuffer();
_L8:
        currentFrame.put(byte0);
        if (true) goto _L6; else goto _L5
_L5:
        if (currentFrame.hasRemaining()) goto _L8; else goto _L7
_L7:
        currentFrame = increaseBuffer(currentFrame);
          goto _L8
    }
}
