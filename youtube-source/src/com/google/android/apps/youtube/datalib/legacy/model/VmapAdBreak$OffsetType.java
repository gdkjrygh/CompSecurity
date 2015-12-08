// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;


public final class Q extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN PERCENTAGE;
    public static final UNKNOWN POSITIONAL;
    public static final UNKNOWN POST_ROLL;
    public static final UNKNOWN PRE_ROLL;
    public static final UNKNOWN TIME;
    public static final UNKNOWN UNKNOWN;

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/VmapAdBreak$OffsetType, s);
    }

    public static Q[] values()
    {
        return (Q[])$VALUES.clone();
    }

    static 
    {
        TIME = new <init>("TIME", 0);
        PERCENTAGE = new <init>("PERCENTAGE", 1);
        PRE_ROLL = new <init>("PRE_ROLL", 2);
        POST_ROLL = new <init>("POST_ROLL", 3);
        POSITIONAL = new <init>("POSITIONAL", 4);
        UNKNOWN = new <init>("UNKNOWN", 5);
        $VALUES = (new .VALUES[] {
            TIME, PERCENTAGE, PRE_ROLL, POST_ROLL, POSITIONAL, UNKNOWN
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}
