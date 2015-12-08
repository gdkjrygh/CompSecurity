// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket;


// Referenced classes of package com.mixpanel.android.java_websocket:
//            WebSocket

public static final class  extends Enum
{

    public static final CLOSED CLOSED;
    public static final CLOSED CLOSING;
    public static final CLOSED CONNECTING;
    private static final CLOSED ENUM$VALUES[];
    public static final CLOSED NOT_YET_CONNECTED;
    public static final CLOSED OPEN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/mixpanel/android/java_websocket/WebSocket$READYSTATE, s);
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
        NOT_YET_CONNECTED = new <init>("NOT_YET_CONNECTED", 0);
        CONNECTING = new <init>("CONNECTING", 1);
        OPEN = new <init>("OPEN", 2);
        CLOSING = new <init>("CLOSING", 3);
        CLOSED = new <init>("CLOSED", 4);
        ENUM$VALUES = (new ENUM.VALUES[] {
            NOT_YET_CONNECTED, CONNECTING, OPEN, CLOSING, CLOSED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
