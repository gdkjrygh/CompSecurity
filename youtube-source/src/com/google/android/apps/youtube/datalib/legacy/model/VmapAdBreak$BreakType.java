// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;


public final class val extends Enum
{

    private static final POST_ROLL $VALUES[];
    public static final POST_ROLL MID_ROLL;
    public static final POST_ROLL POST_ROLL;
    public static final POST_ROLL PRE_ROLL;
    private int val;

    public static val valueOf(String s)
    {
        return (val)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/VmapAdBreak$BreakType, s);
    }

    public static val[] values()
    {
        return (val[])$VALUES.clone();
    }

    public final int value()
    {
        return val;
    }

    static 
    {
        PRE_ROLL = new <init>("PRE_ROLL", 0, 1);
        MID_ROLL = new <init>("MID_ROLL", 1, 2);
        POST_ROLL = new <init>("POST_ROLL", 2, 3);
        $VALUES = (new .VALUES[] {
            PRE_ROLL, MID_ROLL, POST_ROLL
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        val = j;
    }
}
