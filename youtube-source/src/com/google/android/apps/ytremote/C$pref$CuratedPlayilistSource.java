// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote;


public final class  extends Enum
{

    private static final SERVLET $VALUES[];
    public static final SERVLET CONSOLE;
    public static final SERVLET SERVLET;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/ytremote/C$pref$CuratedPlayilistSource, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CONSOLE = new <init>("CONSOLE", 0);
        SERVLET = new <init>("SERVLET", 1);
        $VALUES = (new .VALUES[] {
            CONSOLE, SERVLET
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
