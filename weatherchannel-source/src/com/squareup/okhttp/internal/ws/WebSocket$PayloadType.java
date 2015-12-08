// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.ws;


// Referenced classes of package com.squareup.okhttp.internal.ws:
//            WebSocket

public static final class  extends Enum
{

    private static final BINARY $VALUES[];
    public static final BINARY BINARY;
    public static final BINARY TEXT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/squareup/okhttp/internal/ws/WebSocket$PayloadType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TEXT = new <init>("TEXT", 0);
        BINARY = new <init>("BINARY", 1);
        $VALUES = (new .VALUES[] {
            TEXT, BINARY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
