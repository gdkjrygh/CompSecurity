// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.logic;


public final class  extends Enum
{

    private static final CANCELED $VALUES[];
    public static final CANCELED CANCELED;
    public static final CANCELED FAILED;
    public static final CANCELED NOT_CONNECTED;
    public static final CANCELED OK;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/ytremote/backend/logic/CloudService$OnSendMessageResult$SendMessageResult, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        OK = new <init>("OK", 0);
        NOT_CONNECTED = new <init>("NOT_CONNECTED", 1);
        FAILED = new <init>("FAILED", 2);
        CANCELED = new <init>("CANCELED", 3);
        $VALUES = (new .VALUES[] {
            OK, NOT_CONNECTED, FAILED, CANCELED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
