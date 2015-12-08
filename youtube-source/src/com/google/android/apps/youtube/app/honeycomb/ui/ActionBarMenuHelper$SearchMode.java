// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;


public final class  extends Enum
{

    private static final CUSTOM $VALUES[];
    public static final CUSTOM CUSTOM;
    public static final CUSTOM DISABLED;
    public static final CUSTOM EXPANDED;
    public static final CUSTOM ICONIFIED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/honeycomb/ui/ActionBarMenuHelper$SearchMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DISABLED = new <init>("DISABLED", 0);
        ICONIFIED = new <init>("ICONIFIED", 1);
        EXPANDED = new <init>("EXPANDED", 2);
        CUSTOM = new <init>("CUSTOM", 3);
        $VALUES = (new .VALUES[] {
            DISABLED, ICONIFIED, EXPANDED, CUSTOM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
