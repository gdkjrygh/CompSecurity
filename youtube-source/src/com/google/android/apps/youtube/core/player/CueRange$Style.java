// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;


public final class  extends Enum
{

    private static final AD_MARKER $VALUES[];
    public static final AD_MARKER AD_MARKER;
    public static final AD_MARKER NOT_DRAWABLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/player/CueRange$Style, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_DRAWABLE = new <init>("NOT_DRAWABLE", 0);
        AD_MARKER = new <init>("AD_MARKER", 1);
        $VALUES = (new .VALUES[] {
            NOT_DRAWABLE, AD_MARKER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
