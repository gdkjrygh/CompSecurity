// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket;


// Referenced classes of package com.mixpanel.android.java_websocket:
//            WebSocket

public static final class  extends Enum
{

    public static final SERVER CLIENT;
    private static final SERVER ENUM$VALUES[];
    public static final SERVER SERVER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/mixpanel/android/java_websocket/WebSocket$Role, s);
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
        CLIENT = new <init>("CLIENT", 0);
        SERVER = new <init>("SERVER", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            CLIENT, SERVER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
