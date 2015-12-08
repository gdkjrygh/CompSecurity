// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.youtube;


final class  extends Enum
{

    private static final VERBOSE $VALUES[];
    public static final VERBOSE DEBUG;
    public static final VERBOSE ERROR;
    public static final VERBOSE INFO;
    public static final VERBOSE VERBOSE;
    public static final VERBOSE WARNING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/ytremote/fork/youtube/L$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ERROR = new <init>("ERROR", 0);
        WARNING = new <init>("WARNING", 1);
        INFO = new <init>("INFO", 2);
        DEBUG = new <init>("DEBUG", 3);
        VERBOSE = new <init>("VERBOSE", 4);
        $VALUES = (new .VALUES[] {
            ERROR, WARNING, INFO, DEBUG, VERBOSE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
