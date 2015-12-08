// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.framing;


// Referenced classes of package com.mixpanel.android.java_websocket.framing:
//            Framedata

public static final class  extends Enum
{

    public static final CLOSING BINARY;
    public static final CLOSING CLOSING;
    public static final CLOSING CONTINUOUS;
    private static final CLOSING ENUM$VALUES[];
    public static final CLOSING PING;
    public static final CLOSING PONG;
    public static final CLOSING TEXT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/mixpanel/android/java_websocket/framing/Framedata$Opcode, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        CONTINUOUS = new <init>("CONTINUOUS", 0);
        TEXT = new <init>("TEXT", 1);
        BINARY = new <init>("BINARY", 2);
        PING = new <init>("PING", 3);
        PONG = new <init>("PONG", 4);
        CLOSING = new <init>("CLOSING", 5);
        ENUM$VALUES = (new ENUM.VALUES[] {
            CONTINUOUS, TEXT, BINARY, PING, PONG, CLOSING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
