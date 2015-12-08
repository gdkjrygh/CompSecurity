// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;


public final class  extends Enum
{

    private static final SERVER $VALUES[];
    public static final SERVER CLIENT;
    public static final SERVER SERVER;
    public static final SERVER UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/ytremote/fork/net/async/Connection$ConnectionMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        CLIENT = new <init>("CLIENT", 1);
        SERVER = new <init>("SERVER", 2);
        $VALUES = (new .VALUES[] {
            UNKNOWN, CLIENT, SERVER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
