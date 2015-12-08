// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.drafts;

import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.framing.CloseFrameBuilder;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.handshake.ClientHandshake;
import com.mixpanel.android.java_websocket.handshake.ClientHandshakeBuilder;
import com.mixpanel.android.java_websocket.handshake.HandshakeBuilder;
import com.mixpanel.android.java_websocket.handshake.Handshakedata;
import com.mixpanel.android.java_websocket.handshake.ServerHandshake;
import com.mixpanel.android.java_websocket.handshake.ServerHandshakeBuilder;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.mixpanel.android.java_websocket.drafts:
//            Draft_75, Draft

public class Draft_76 extends Draft_75
{

    private static final byte closehandshake[];
    private boolean failed;
    private final Random reuseableRandom = new Random();

    public Draft_76()
    {
        failed = false;
    }

    public static byte[] createChallenge(String s, String s1, byte abyte0[])
        throws InvalidHandshakeException
    {
        s = getPart(s);
        s1 = getPart(s1);
        byte byte0 = s[0];
        byte byte1 = s[1];
        byte byte2 = s[2];
        byte byte3 = s[3];
        byte byte4 = s1[0];
        byte byte5 = s1[1];
        byte byte6 = s1[2];
        byte byte7 = s1[3];
        byte byte8 = abyte0[0];
        byte byte9 = abyte0[1];
        byte byte10 = abyte0[2];
        byte byte11 = abyte0[3];
        byte byte12 = abyte0[4];
        byte byte13 = abyte0[5];
        byte byte14 = abyte0[6];
        byte byte15 = abyte0[7];
        try
        {
            s = MessageDigest.getInstance("MD5");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s.digest(new byte[] {
            byte0, byte1, byte2, byte3, byte4, byte5, byte6, byte7, byte8, byte9, 
            byte10, byte11, byte12, byte13, byte14, byte15
        });
    }

    private static String generateKey()
    {
        String s;
        Random random;
        int i;
        int j;
        long l1;
        random = new Random();
        l1 = random.nextInt(12) + 1;
        s = Long.toString((long)(random.nextInt(Math.abs((new Long(0xffffffffL / l1)).intValue())) + 1) * l1);
        j = random.nextInt(12);
        i = 0;
_L3:
        if (i < j + 1) goto _L2; else goto _L1
_L1:
        i = 0;
_L4:
        if ((long)i >= l1)
        {
            return s;
        }
        break MISSING_BLOCK_LABEL_159;
_L2:
        int l = Math.abs(random.nextInt(s.length()));
        char c1 = (char)(random.nextInt(95) + 33);
        char c = c1;
        if (c1 >= '0')
        {
            c = c1;
            if (c1 <= '9')
            {
                c = (char)(c1 - 15);
            }
        }
        s = (new StringBuilder(s)).insert(l, c).toString();
        i++;
          goto _L3
        int k = Math.abs(random.nextInt(s.length() - 1) + 1);
        s = (new StringBuilder(s)).insert(k, " ").toString();
        i++;
          goto _L4
    }

    private static byte[] getPart(String s)
        throws InvalidHandshakeException
    {
        long l;
        long l1;
        try
        {
            l = Long.parseLong(s.replaceAll("[^0-9]", ""));
            l1 = s.split(" ").length - 1;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key1/ or /key2/)");
        }
        if (l1 != 0L)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key2/)");
        l = (new Long(l / l1)).longValue();
        byte byte0 = (byte)(int)(l >> 24);
        byte byte1 = (byte)(int)((l << 8) >> 24);
        byte byte2 = (byte)(int)((l << 16) >> 24);
        byte byte3 = (byte)(int)((l << 24) >> 24);
        return (new byte[] {
            byte0, byte1, byte2, byte3
        });
    }

    public Draft.HandshakeState acceptHandshakeAsClient(ClientHandshake clienthandshake, ServerHandshake serverhandshake)
    {
        if (failed)
        {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        try
        {
            if (!serverhandshake.getFieldValue("Sec-WebSocket-Origin").equals(clienthandshake.getFieldValue("Origin")) || !basicAccept(serverhandshake))
            {
                return Draft.HandshakeState.NOT_MATCHED;
            }
            serverhandshake = serverhandshake.getContent();
        }
        // Misplaced declaration of an exception variable
        catch (ClientHandshake clienthandshake)
        {
            throw new RuntimeException("bad handshakerequest", clienthandshake);
        }
        if (serverhandshake == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        if (serverhandshake.length != 0)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        throw new IncompleteHandshakeException();
        if (Arrays.equals(serverhandshake, createChallenge(clienthandshake.getFieldValue("Sec-WebSocket-Key1"), clienthandshake.getFieldValue("Sec-WebSocket-Key2"), clienthandshake.getContent())))
        {
            return Draft.HandshakeState.MATCHED;
        }
        clienthandshake = Draft.HandshakeState.NOT_MATCHED;
        return clienthandshake;
    }

    public Draft.HandshakeState acceptHandshakeAsServer(ClientHandshake clienthandshake)
    {
        if (clienthandshake.getFieldValue("Upgrade").equals("WebSocket") && clienthandshake.getFieldValue("Connection").contains("Upgrade") && clienthandshake.getFieldValue("Sec-WebSocket-Key1").length() > 0 && !clienthandshake.getFieldValue("Sec-WebSocket-Key2").isEmpty() && clienthandshake.hasFieldValue("Origin"))
        {
            return Draft.HandshakeState.MATCHED;
        } else
        {
            return Draft.HandshakeState.NOT_MATCHED;
        }
    }

    public Draft copyInstance()
    {
        return new Draft_76();
    }

    public ByteBuffer createBinaryFrame(Framedata framedata)
    {
        if (framedata.getOpcode() == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.CLOSING)
        {
            return ByteBuffer.wrap(closehandshake);
        } else
        {
            return super.createBinaryFrame(framedata);
        }
    }

    public Draft.CloseHandshakeType getCloseHandshakeType()
    {
        return Draft.CloseHandshakeType.ONEWAY;
    }

    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clienthandshakebuilder)
    {
        clienthandshakebuilder.put("Upgrade", "WebSocket");
        clienthandshakebuilder.put("Connection", "Upgrade");
        clienthandshakebuilder.put("Sec-WebSocket-Key1", generateKey());
        clienthandshakebuilder.put("Sec-WebSocket-Key2", generateKey());
        if (!clienthandshakebuilder.hasFieldValue("Origin"))
        {
            clienthandshakebuilder.put("Origin", (new StringBuilder("random")).append(reuseableRandom.nextInt()).toString());
        }
        byte abyte0[] = new byte[8];
        reuseableRandom.nextBytes(abyte0);
        clienthandshakebuilder.setContent(abyte0);
        return clienthandshakebuilder;
    }

    public HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clienthandshake, ServerHandshakeBuilder serverhandshakebuilder)
        throws InvalidHandshakeException
    {
        serverhandshakebuilder.setHttpStatusMessage("WebSocket Protocol Handshake");
        serverhandshakebuilder.put("Upgrade", "WebSocket");
        serverhandshakebuilder.put("Connection", clienthandshake.getFieldValue("Connection"));
        serverhandshakebuilder.put("Sec-WebSocket-Origin", clienthandshake.getFieldValue("Origin"));
        serverhandshakebuilder.put("Sec-WebSocket-Location", (new StringBuilder("ws://")).append(clienthandshake.getFieldValue("Host")).append(clienthandshake.getResourceDescriptor()).toString());
        String s = clienthandshake.getFieldValue("Sec-WebSocket-Key1");
        String s1 = clienthandshake.getFieldValue("Sec-WebSocket-Key2");
        clienthandshake = clienthandshake.getContent();
        if (s == null || s1 == null || clienthandshake == null || clienthandshake.length != 8)
        {
            throw new InvalidHandshakeException("Bad keys");
        } else
        {
            serverhandshakebuilder.setContent(createChallenge(s, s1, clienthandshake));
            return serverhandshakebuilder;
        }
    }

    public List translateFrame(ByteBuffer bytebuffer)
        throws InvalidDataException
    {
        bytebuffer.mark();
        List list = super.translateRegularFrame(bytebuffer);
        if (list == null)
        {
            bytebuffer.reset();
            list = readyframes;
            readingState = true;
            if (currentFrame == null)
            {
                currentFrame = ByteBuffer.allocate(2);
                if (bytebuffer.remaining() > currentFrame.remaining())
                {
                    throw new InvalidFrameException();
                }
            } else
            {
                throw new InvalidFrameException();
            }
            currentFrame.put(bytebuffer);
            if (!currentFrame.hasRemaining())
            {
                if (Arrays.equals(currentFrame.array(), closehandshake))
                {
                    list.add(new CloseFrameBuilder(1000));
                    return list;
                } else
                {
                    throw new InvalidFrameException();
                }
            } else
            {
                readyframes = new LinkedList();
                return list;
            }
        } else
        {
            return list;
        }
    }

    public Handshakedata translateHandshake(ByteBuffer bytebuffer)
        throws InvalidHandshakeException
    {
        HandshakeBuilder handshakebuilder = translateHandshakeHttp(bytebuffer, role);
        if ((handshakebuilder.hasFieldValue("Sec-WebSocket-Key1") || role == com.mixpanel.android.java_websocket.WebSocket.Role.CLIENT) && !handshakebuilder.hasFieldValue("Sec-WebSocket-Version"))
        {
            byte abyte0[];
            byte byte0;
            if (role == com.mixpanel.android.java_websocket.WebSocket.Role.SERVER)
            {
                byte0 = 8;
            } else
            {
                byte0 = 16;
            }
            abyte0 = new byte[byte0];
            try
            {
                bytebuffer.get(abyte0);
            }
            catch (BufferUnderflowException bufferunderflowexception)
            {
                throw new IncompleteHandshakeException(bytebuffer.capacity() + 16);
            }
            handshakebuilder.setContent(abyte0);
        }
        return handshakebuilder;
    }

    static 
    {
        byte abyte0[] = new byte[2];
        abyte0[0] = -1;
        closehandshake = abyte0;
    }
}
