// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;


public final class VideoStreamType extends Enum
{

    private static final VideoStreamType $VALUES[];
    public static final VideoStreamType HLS;
    public static final VideoStreamType MP4;

    private VideoStreamType(String s, int i)
    {
        super(s, i);
    }

    public static VideoStreamType valueOf(String s)
    {
        return (VideoStreamType)Enum.valueOf(com/weather/commons/video2/dsx/VideoStreamType, s);
    }

    public static VideoStreamType[] values()
    {
        return (VideoStreamType[])$VALUES.clone();
    }

    static 
    {
        MP4 = new VideoStreamType("MP4", 0);
        HLS = new VideoStreamType("HLS", 1);
        $VALUES = (new VideoStreamType[] {
            MP4, HLS
        });
    }
}
