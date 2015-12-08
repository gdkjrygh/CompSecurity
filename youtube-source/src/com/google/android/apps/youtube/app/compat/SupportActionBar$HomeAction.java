// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;


public final class  extends Enum
{

    private static final DRAWER_TOGGLE $VALUES[];
    public static final DRAWER_TOGGLE DRAWER_TOGGLE;
    public static final DRAWER_TOGGLE NONE;
    public static final DRAWER_TOGGLE UP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/compat/SupportActionBar$HomeAction, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        UP = new <init>("UP", 1);
        DRAWER_TOGGLE = new <init>("DRAWER_TOGGLE", 2);
        $VALUES = (new .VALUES[] {
            NONE, UP, DRAWER_TOGGLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
