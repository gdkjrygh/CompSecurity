// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket;

import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;

public interface WebSocket
{
    public static final class READYSTATE extends Enum
    {

        public static final READYSTATE CLOSED;
        public static final READYSTATE CLOSING;
        public static final READYSTATE CONNECTING;
        private static final READYSTATE ENUM$VALUES[];
        public static final READYSTATE NOT_YET_CONNECTED;
        public static final READYSTATE OPEN;

        public static READYSTATE valueOf(String s)
        {
            return (READYSTATE)Enum.valueOf(com/mixpanel/android/java_websocket/WebSocket$READYSTATE, s);
        }

        public static READYSTATE[] values()
        {
            READYSTATE areadystate[] = ENUM$VALUES;
            int i = areadystate.length;
            READYSTATE areadystate1[] = new READYSTATE[i];
            System.arraycopy(areadystate, 0, areadystate1, 0, i);
            return areadystate1;
        }

        static 
        {
            NOT_YET_CONNECTED = new READYSTATE("NOT_YET_CONNECTED", 0);
            CONNECTING = new READYSTATE("CONNECTING", 1);
            OPEN = new READYSTATE("OPEN", 2);
            CLOSING = new READYSTATE("CLOSING", 3);
            CLOSED = new READYSTATE("CLOSED", 4);
            ENUM$VALUES = (new READYSTATE[] {
                NOT_YET_CONNECTED, CONNECTING, OPEN, CLOSING, CLOSED
            });
        }

        private READYSTATE(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Role extends Enum
    {

        public static final Role CLIENT;
        private static final Role ENUM$VALUES[];
        public static final Role SERVER;

        public static Role valueOf(String s)
        {
            return (Role)Enum.valueOf(com/mixpanel/android/java_websocket/WebSocket$Role, s);
        }

        public static Role[] values()
        {
            Role arole[] = ENUM$VALUES;
            int i = arole.length;
            Role arole1[] = new Role[i];
            System.arraycopy(arole, 0, arole1, 0, i);
            return arole1;
        }

        static 
        {
            CLIENT = new Role("CLIENT", 0);
            SERVER = new Role("SERVER", 1);
            ENUM$VALUES = (new Role[] {
                CLIENT, SERVER
            });
        }

        private Role(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int DEFAULT_PORT = 80;
    public static final int DEFAULT_WSS_PORT = 443;

    public abstract void close();

    public abstract void close(int i);

    public abstract void close(int i, String s);

    public abstract void closeConnection(int i, String s);

    public abstract Draft getDraft();

    public abstract InetSocketAddress getLocalSocketAddress();

    public abstract READYSTATE getReadyState();

    public abstract InetSocketAddress getRemoteSocketAddress();

    public abstract String getResourceDescriptor();

    public abstract boolean hasBufferedData();

    public abstract boolean isClosed();

    public abstract boolean isClosing();

    public abstract boolean isConnecting();

    public abstract boolean isFlushAndClose();

    public abstract boolean isOpen();

    public abstract void send(String s)
        throws NotYetConnectedException;

    public abstract void send(ByteBuffer bytebuffer)
        throws IllegalArgumentException, NotYetConnectedException;

    public abstract void send(byte abyte0[])
        throws IllegalArgumentException, NotYetConnectedException;

    public abstract void sendFragmentedFrame(com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode, ByteBuffer bytebuffer, boolean flag);

    public abstract void sendFrame(Framedata framedata);
}
