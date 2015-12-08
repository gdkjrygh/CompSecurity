// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.framing;

import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import java.nio.ByteBuffer;

public interface Framedata
{
    public static final class Opcode extends Enum
    {

        public static final Opcode BINARY;
        public static final Opcode CLOSING;
        public static final Opcode CONTINUOUS;
        private static final Opcode ENUM$VALUES[];
        public static final Opcode PING;
        public static final Opcode PONG;
        public static final Opcode TEXT;

        public static Opcode valueOf(String s)
        {
            return (Opcode)Enum.valueOf(com/mixpanel/android/java_websocket/framing/Framedata$Opcode, s);
        }

        public static Opcode[] values()
        {
            Opcode aopcode[] = ENUM$VALUES;
            int i = aopcode.length;
            Opcode aopcode1[] = new Opcode[i];
            System.arraycopy(aopcode, 0, aopcode1, 0, i);
            return aopcode1;
        }

        static 
        {
            CONTINUOUS = new Opcode("CONTINUOUS", 0);
            TEXT = new Opcode("TEXT", 1);
            BINARY = new Opcode("BINARY", 2);
            PING = new Opcode("PING", 3);
            PONG = new Opcode("PONG", 4);
            CLOSING = new Opcode("CLOSING", 5);
            ENUM$VALUES = (new Opcode[] {
                CONTINUOUS, TEXT, BINARY, PING, PONG, CLOSING
            });
        }

        private Opcode(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void append(Framedata framedata)
        throws InvalidFrameException;

    public abstract Opcode getOpcode();

    public abstract ByteBuffer getPayloadData();

    public abstract boolean getTransfereMasked();

    public abstract boolean isFin();
}
