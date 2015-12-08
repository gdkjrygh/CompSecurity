// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.m2ts;


final class  extends Enum
{

    private static final BACKGROUND_FAILED $VALUES[];
    public static final BACKGROUND_FAILED BACKGROUND_FAILED;
    public static final BACKGROUND_FAILED BACKGROUND_SUCCESS;
    public static final BACKGROUND_FAILED NONE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/m2ts/BackgroundPlaybackDialogs$DialogType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        BACKGROUND_SUCCESS = new <init>("BACKGROUND_SUCCESS", 1);
        BACKGROUND_FAILED = new <init>("BACKGROUND_FAILED", 2);
        $VALUES = (new .VALUES[] {
            NONE, BACKGROUND_SUCCESS, BACKGROUND_FAILED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
