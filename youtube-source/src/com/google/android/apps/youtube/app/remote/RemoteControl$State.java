// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;


public final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR CONNECTED;
    public static final ERROR CONNECTING;
    public static final ERROR ERROR;
    public static final ERROR OFFLINE;
    public static final ERROR SLEEP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/remote/RemoteControl$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        OFFLINE = new <init>("OFFLINE", 0);
        CONNECTING = new <init>("CONNECTING", 1);
        CONNECTED = new <init>("CONNECTED", 2);
        SLEEP = new <init>("SLEEP", 3);
        ERROR = new <init>("ERROR", 4);
        $VALUES = (new .VALUES[] {
            OFFLINE, CONNECTING, CONNECTED, SLEEP, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
