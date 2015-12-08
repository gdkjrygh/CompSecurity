// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;


public final class  extends Enum
{

    private static final AD_MODULE $VALUES[];
    public static final AD_MODULE AD_MODULE;
    public static final AD_MODULE DEFAULT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/player/CueRange$Priority, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0);
        AD_MODULE = new <init>("AD_MODULE", 1);
        $VALUES = (new .VALUES[] {
            DEFAULT, AD_MODULE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
