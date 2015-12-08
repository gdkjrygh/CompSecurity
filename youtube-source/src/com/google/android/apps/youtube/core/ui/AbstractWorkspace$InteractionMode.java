// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;


public final class enableSmoothScroll extends Enum
{

    private static final FLINGABLE_SCROLLING $VALUES[];
    public static final FLINGABLE_SCROLLING FLINGABLE_SCROLLING;
    public static final FLINGABLE_SCROLLING NON_SCROLLING;
    public static final FLINGABLE_SCROLLING SCROLLING;
    public final boolean enableFling;
    public final boolean enableSmoothScroll;

    public static enableSmoothScroll valueOf(String s)
    {
        return (enableSmoothScroll)Enum.valueOf(com/google/android/apps/youtube/core/ui/AbstractWorkspace$InteractionMode, s);
    }

    public static enableSmoothScroll[] values()
    {
        return (enableSmoothScroll[])$VALUES.clone();
    }

    static 
    {
        NON_SCROLLING = new <init>("NON_SCROLLING", 0, false, false);
        SCROLLING = new <init>("SCROLLING", 1, false, true);
        FLINGABLE_SCROLLING = new <init>("FLINGABLE_SCROLLING", 2, true, true);
        $VALUES = (new .VALUES[] {
            NON_SCROLLING, SCROLLING, FLINGABLE_SCROLLING
        });
    }

    private (String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        enableFling = flag;
        enableSmoothScroll = flag1;
    }
}
