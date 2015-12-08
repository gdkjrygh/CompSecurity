// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;


public final class qualityValue extends Enum
{

    private static final HD $VALUES[];
    public static final HD AMODO_ONLY;
    public static final HD HD;
    public static final HD SD;
    private final int qualityValue;

    public static qualityValue valueOf(String s)
    {
        return (qualityValue)Enum.valueOf(com/google/android/apps/youtube/datalib/innertube/model/Offlineability$Format$Type, s);
    }

    public static qualityValue[] values()
    {
        return (qualityValue[])$VALUES.clone();
    }

    public final int getQualityValue()
    {
        return qualityValue;
    }

    static 
    {
        AMODO_ONLY = new <init>("AMODO_ONLY", 0, 0);
        SD = new <init>("SD", 1, 360);
        HD = new <init>("HD", 2, 720);
        $VALUES = (new .VALUES[] {
            AMODO_ONLY, SD, HD
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        qualityValue = j;
    }
}
