// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;


public final class  extends Enum
{

    private static final TAP $VALUES[];
    public static final TAP FLING;
    public static final TAP TAP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/ui/AbstractWorkspace$SelectionMethod, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FLING = new <init>("FLING", 0);
        TAP = new <init>("TAP", 1);
        $VALUES = (new .VALUES[] {
            FLING, TAP
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
