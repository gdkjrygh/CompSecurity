// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;


public final class ThumbnailSize extends Enum
{

    private static final ThumbnailSize $VALUES[];
    public static final ThumbnailSize LARGE;
    public static final ThumbnailSize MEDIUM;

    private ThumbnailSize(String s, int i)
    {
        super(s, i);
    }

    public static ThumbnailSize valueOf(String s)
    {
        return (ThumbnailSize)Enum.valueOf(com/weather/commons/video2/ThumbnailSize, s);
    }

    public static ThumbnailSize[] values()
    {
        return (ThumbnailSize[])$VALUES.clone();
    }

    static 
    {
        MEDIUM = new ThumbnailSize("MEDIUM", 0);
        LARGE = new ThumbnailSize("LARGE", 1);
        $VALUES = (new ThumbnailSize[] {
            MEDIUM, LARGE
        });
    }
}
