// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


final class  extends Enum
{

    private static final DISMISS $VALUES[];
    public static final DISMISS DISMISS;
    public static final DISMISS MIN_MAX;
    public static final DISMISS NONE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/ui/WatchWhileLayout$DragMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        MIN_MAX = new <init>("MIN_MAX", 1);
        DISMISS = new <init>("DISMISS", 2);
        $VALUES = (new .VALUES[] {
            NONE, MIN_MAX, DISMISS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
