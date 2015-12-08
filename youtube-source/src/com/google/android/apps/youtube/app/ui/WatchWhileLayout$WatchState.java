// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


public final class intValue extends Enum
{

    private static final MINIMIZED $VALUES[];
    public static final MINIMIZED DISMISSED;
    public static final MINIMIZED MAXIMIZED;
    public static final MINIMIZED MINIMIZED;
    public final int intValue;

    public static intValue valueOf(String s)
    {
        return (intValue)Enum.valueOf(com/google/android/apps/youtube/app/ui/WatchWhileLayout$WatchState, s);
    }

    public static intValue[] values()
    {
        return (intValue[])$VALUES.clone();
    }

    static 
    {
        DISMISSED = new <init>("DISMISSED", 0, 0);
        MAXIMIZED = new <init>("MAXIMIZED", 1, 1);
        MINIMIZED = new <init>("MINIMIZED", 2, 2);
        $VALUES = (new .VALUES[] {
            DISMISSED, MAXIMIZED, MINIMIZED
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        intValue = j;
    }
}
