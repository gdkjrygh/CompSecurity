// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


public final class  extends Enum
{

    private static final NONE $VALUES[];
    public static final NONE BACK;
    public static final NONE FORWARD;
    public static final NONE NONE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/ui/FlingDynamics$Fling, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BACK = new <init>("BACK", 0);
        FORWARD = new <init>("FORWARD", 1);
        NONE = new <init>("NONE", 2);
        $VALUES = (new .VALUES[] {
            BACK, FORWARD, NONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
