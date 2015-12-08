// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;


public final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR CLOSED;
    public static final ERROR DATA;
    public static final ERROR ERROR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/ytremote/backend/browserchannel/HttpClientConnection$IncomingItem$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CLOSED = new <init>("CLOSED", 0);
        DATA = new <init>("DATA", 1);
        ERROR = new <init>("ERROR", 2);
        $VALUES = (new .VALUES[] {
            CLOSED, DATA, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
