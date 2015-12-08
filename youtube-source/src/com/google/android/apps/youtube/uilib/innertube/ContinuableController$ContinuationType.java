// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.innertube;


public final class  extends Enum
{

    private static final RELOAD $VALUES[];
    public static final RELOAD NEXT;
    public static final RELOAD RELOAD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/uilib/innertube/ContinuableController$ContinuationType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NEXT = new <init>("NEXT", 0);
        RELOAD = new <init>("RELOAD", 1);
        $VALUES = (new .VALUES[] {
            NEXT, RELOAD
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
