// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;


public final class A extends Enum
{

    private static final CHROMELESS $VALUES[];
    public static final CHROMELESS CHROMELESS;
    public static final CHROMELESS DEFAULT;
    public static final CHROMELESS MINIMAL;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/google/android/youtube/player/YouTubePlayer$PlayerStyle, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0);
        MINIMAL = new <init>("MINIMAL", 1);
        CHROMELESS = new <init>("CHROMELESS", 2);
        $VALUES = (new .VALUES[] {
            DEFAULT, MINIMAL, CHROMELESS
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
