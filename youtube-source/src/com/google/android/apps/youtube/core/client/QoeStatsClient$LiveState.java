// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;


public final class value extends Enum
{

    private static final DVR $VALUES[];
    public static final DVR DVR;
    public static final DVR LIVE;
    public static final DVR VOD;
    private final String value;

    public static value fromOrdinal(int i)
    {
        if (i < 0 || i >= values().length)
        {
            return VOD;
        } else
        {
            return values()[i];
        }
    }

    public static values valueOf(String s)
    {
        return (values)Enum.valueOf(com/google/android/apps/youtube/core/client/QoeStatsClient$LiveState, s);
    }

    public static values[] values()
    {
        return (values[])$VALUES.clone();
    }

    public final boolean isLive()
    {
        return this != VOD;
    }

    public final String toString()
    {
        return value;
    }

    static 
    {
        VOD = new <init>("VOD", 0, null);
        LIVE = new <init>("LIVE", 1, "live");
        DVR = new <init>("DVR", 2, "dvr");
        $VALUES = (new .VALUES[] {
            VOD, LIVE, DVR
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
