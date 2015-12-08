// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.drafts;

import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.LimitExedeedException;
import com.mixpanel.android.java_websocket.framing.FrameBuilder;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.framing.FramedataImpl1;
import com.mixpanel.android.java_websocket.handshake.ClientHandshake;
import com.mixpanel.android.java_websocket.handshake.ClientHandshakeBuilder;
import com.mixpanel.android.java_websocket.handshake.HandshakeBuilder;
import com.mixpanel.android.java_websocket.handshake.HandshakeImpl1Client;
import com.mixpanel.android.java_websocket.handshake.HandshakeImpl1Server;
import com.mixpanel.android.java_websocket.handshake.Handshakedata;
import com.mixpanel.android.java_websocket.handshake.ServerHandshake;
import com.mixpanel.android.java_websocket.handshake.ServerHandshakeBuilder;
import com.mixpanel.android.java_websocket.util.Charsetfunctions;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class Draft
{
    public static final class CloseHandshakeType extends Enum
    {

        private static final CloseHandshakeType ENUM$VALUES[];
        public static final CloseHandshakeType NONE;
        public static final CloseHandshakeType ONEWAY;
        public static final CloseHandshakeType TWOWAY;

        public static CloseHandshakeType valueOf(String s)
        {
            return (CloseHandshakeType)Enum.valueOf(com/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType, s);
        }

        public static CloseHandshakeType[] values()
        {
            CloseHandshakeType aclosehandshaketype[] = ENUM$VALUES;
            int i = aclosehandshaketype.length;
            CloseHandshakeType aclosehandshaketype1[] = new CloseHandshakeType[i];
            System.arraycopy(aclosehandshaketype, 0, aclosehandshaketype1, 0, i);
            return aclosehandshaketype1;
        }

        static 
        {
            NONE = new CloseHandshakeType("NONE", 0);
            ONEWAY = new CloseHandshakeType("ONEWAY", 1);
            TWOWAY = new CloseHandshakeType("TWOWAY", 2);
            ENUM$VALUES = (new CloseHandshakeType[] {
                NONE, ONEWAY, TWOWAY
            });
        }

        private CloseHandshakeType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class HandshakeState extends Enum
    {

        private static final HandshakeState ENUM$VALUES[];
        public static final HandshakeState MATCHED;
        public static final HandshakeState NOT_MATCHED;

        public static HandshakeState valueOf(String s)
        {
            return (HandshakeState)Enum.valueOf(com/mixpanel/android/java_websocket/drafts/Draft$HandshakeState, s);
        }

        public static HandshakeState[] values()
        {
            HandshakeState ahandshakestate[] = ENUM$VALUES;
            int i = ahandshakestate.length;
            HandshakeState ahandshakestate1[] = new HandshakeState[i];
            System.arraycopy(ahandshakestate, 0, ahandshakestate1, 0, i);
            return ahandshakestate1;
        }

        static 
        {
            MATCHED = new HandshakeState("MATCHED", 0);
            NOT_MATCHED = new HandshakeState("NOT_MATCHED", 1);
            ENUM$VALUES = (new HandshakeState[] {
                MATCHED, NOT_MATCHED
            });
        }

        private HandshakeState(String s, int i)
        {
            super(s, i);
        }
    }


    public static final byte FLASH_POLICY_REQUEST[] = Charsetfunctions.utf8Bytes("<policy-file-request/>\0");
    public static int INITIAL_FAMESIZE = 64;
    public static int MAX_FAME_SIZE = 1000;
    protected com.mixpanel.android.java_websocket.framing.Framedata.Opcode continuousFrameType;
    protected com.mixpanel.android.java_websocket.WebSocket.Role role;

    public Draft()
    {
        role = null;
        continuousFrameType = null;
    }

    public static ByteBuffer readLine(ByteBuffer bytebuffer)
    {
        ByteBuffer bytebuffer1 = ByteBuffer.allocate(bytebuffer.remaining());
        byte byte1 = 48;
        byte byte0;
        do
        {
            byte byte2;
            do
            {
                byte2 = byte1;
                if (!bytebuffer.hasRemaining())
                {
                    bytebuffer.position(bytebuffer.position() - bytebuffer1.position());
                    return null;
                }
                byte0 = bytebuffer.get();
                bytebuffer1.put(byte0);
                byte1 = byte0;
            } while (byte2 != 13);
            byte1 = byte0;
        } while (byte0 != 10);
        bytebuffer1.limit(bytebuffer1.position() - 2);
        bytebuffer1.position(0);
        return bytebuffer1;
    }

    public static String readStringLine(ByteBuffer bytebuffer)
    {
        bytebuffer = readLine(bytebuffer);
        if (bytebuffer == null)
        {
            return null;
        } else
        {
            return Charsetfunctions.stringAscii(bytebuffer.array(), 0, bytebuffer.limit());
        }
    }

    public static HandshakeBuilder translateHandshakeHttp(ByteBuffer bytebuffer, com.mixpanel.android.java_websocket.WebSocket.Role role1)
        throws InvalidHandshakeException, IncompleteHandshakeException
    {
        Object obj = readStringLine(bytebuffer);
        if (obj == null)
        {
            throw new IncompleteHandshakeException(bytebuffer.capacity() + 128);
        }
        obj = ((String) (obj)).split(" ", 3);
        if (obj.length != 3)
        {
            throw new InvalidHandshakeException();
        }
        if (role1 == com.mixpanel.android.java_websocket.WebSocket.Role.CLIENT)
        {
            role1 = new HandshakeImpl1Server();
            ServerHandshakeBuilder serverhandshakebuilder = (ServerHandshakeBuilder)role1;
            serverhandshakebuilder.setHttpStatus(Short.parseShort(obj[1]));
            serverhandshakebuilder.setHttpStatusMessage(obj[2]);
        } else
        {
            role1 = new HandshakeImpl1Client();
            role1.setResourceDescriptor(obj[1]);
        }
        obj = readStringLine(bytebuffer);
        do
        {
            if (obj == null || ((String) (obj)).length() <= 0)
            {
                if (obj == null)
                {
                    throw new IncompleteHandshakeException();
                } else
                {
                    return role1;
                }
            }
            obj = ((String) (obj)).split(":", 2);
            if (obj.length != 2)
            {
                throw new InvalidHandshakeException("not an http header");
            }
            role1.put(obj[0], obj[1].replaceFirst("^ +", ""));
            obj = readStringLine(bytebuffer);
        } while (true);
    }

    public abstract HandshakeState acceptHandshakeAsClient(ClientHandshake clienthandshake, ServerHandshake serverhandshake)
        throws InvalidHandshakeException;

    public abstract HandshakeState acceptHandshakeAsServer(ClientHandshake clienthandshake)
        throws InvalidHandshakeException;

    protected boolean basicAccept(Handshakedata handshakedata)
    {
        return handshakedata.getFieldValue("Upgrade").equalsIgnoreCase("websocket") && handshakedata.getFieldValue("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    public int checkAlloc(int i)
        throws LimitExedeedException, InvalidDataException
    {
        if (i < 0)
        {
            throw new InvalidDataException(1002, "Negative count");
        } else
        {
            return i;
        }
    }

    public List continuousFrame(com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode, ByteBuffer bytebuffer, boolean flag)
    {
        if (opcode != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.BINARY && opcode != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.TEXT && opcode != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.TEXT)
        {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        FramedataImpl1 framedataimpl1;
        if (continuousFrameType != null)
        {
            continuousFrameType = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.CONTINUOUS;
        } else
        {
            continuousFrameType = opcode;
        }
        framedataimpl1 = new FramedataImpl1(continuousFrameType);
        try
        {
            framedataimpl1.setPayload(bytebuffer);
        }
        // Misplaced declaration of an exception variable
        catch (com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode)
        {
            throw new RuntimeException(opcode);
        }
        framedataimpl1.setFin(flag);
        if (flag)
        {
            continuousFrameType = null;
        } else
        {
            continuousFrameType = opcode;
        }
        return Collections.singletonList(framedataimpl1);
    }

    public abstract Draft copyInstance();

    public abstract ByteBuffer createBinaryFrame(Framedata framedata);

    public abstract List createFrames(String s, boolean flag);

    public abstract List createFrames(ByteBuffer bytebuffer, boolean flag);

    public List createHandshake(Handshakedata handshakedata, com.mixpanel.android.java_websocket.WebSocket.Role role1)
    {
        return createHandshake(handshakedata, role1, true);
    }

    public List createHandshake(Handshakedata handshakedata, com.mixpanel.android.java_websocket.WebSocket.Role role1, boolean flag)
    {
        role1 = new StringBuilder(100);
        Object obj;
        if (handshakedata instanceof ClientHandshake)
        {
            role1.append("GET ");
            role1.append(((ClientHandshake)handshakedata).getResourceDescriptor());
            role1.append(" HTTP/1.1");
        } else
        if (handshakedata instanceof ServerHandshake)
        {
            role1.append((new StringBuilder("HTTP/1.1 101 ")).append(((ServerHandshake)handshakedata).getHttpStatusMessage()).toString());
        } else
        {
            throw new RuntimeException("unknow role");
        }
        role1.append("\r\n");
        obj = handshakedata.iterateHttpFields();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                role1.append("\r\n");
                role1 = Charsetfunctions.asciiBytes(role1.toString());
                String s;
                String s1;
                int i;
                if (flag)
                {
                    handshakedata = handshakedata.getContent();
                } else
                {
                    handshakedata = null;
                }
                if (handshakedata == null)
                {
                    i = 0;
                } else
                {
                    i = handshakedata.length;
                }
                obj = ByteBuffer.allocate(i + role1.length);
                ((ByteBuffer) (obj)).put(role1);
                if (handshakedata != null)
                {
                    ((ByteBuffer) (obj)).put(handshakedata);
                }
                ((ByteBuffer) (obj)).flip();
                return Collections.singletonList(obj);
            }
            s = (String)((Iterator) (obj)).next();
            s1 = handshakedata.getFieldValue(s);
            role1.append(s);
            role1.append(": ");
            role1.append(s1);
            role1.append("\r\n");
        } while (true);
    }

    public abstract CloseHandshakeType getCloseHandshakeType();

    public com.mixpanel.android.java_websocket.WebSocket.Role getRole()
    {
        return role;
    }

    public abstract ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clienthandshakebuilder)
        throws InvalidHandshakeException;

    public abstract HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clienthandshake, ServerHandshakeBuilder serverhandshakebuilder)
        throws InvalidHandshakeException;

    public abstract void reset();

    public void setParseMode(com.mixpanel.android.java_websocket.WebSocket.Role role1)
    {
        role = role1;
    }

    public abstract List translateFrame(ByteBuffer bytebuffer)
        throws InvalidDataException;

    public Handshakedata translateHandshake(ByteBuffer bytebuffer)
        throws InvalidHandshakeException
    {
        return translateHandshakeHttp(bytebuffer, role);
    }

}
