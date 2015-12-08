// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;


public final class  extends Enum
{

    private static final BROWSE $VALUES[];
    public static final BROWSE BROWSE;
    public static final BROWSE NONE;
    public static final BROWSE SEARCH;
    public static final BROWSE WATCH;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/GuideActivity$IntentType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        WATCH = new <init>("WATCH", 1);
        SEARCH = new <init>("SEARCH", 2);
        BROWSE = new <init>("BROWSE", 3);
        $VALUES = (new .VALUES[] {
            NONE, WATCH, SEARCH, BROWSE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
