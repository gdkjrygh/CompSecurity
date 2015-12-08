// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class bitsPerChannel extends Enum
{

    private static final BITDEPTH_COLOR $VALUES[];
    public static final BITDEPTH_COLOR BITDEPTH_BITONAL;
    public static final BITDEPTH_COLOR BITDEPTH_COLOR;
    public static final BITDEPTH_COLOR BITDEPTH_GRAYSCALE;
    private int bitsPerChannel;
    private int bitsPerPixel;
    private int channels;

    public static bitsPerChannel valueOf(String s)
    {
        return (bitsPerChannel)Enum.valueOf(com/kofax/kmc/ken/engines/data/Image$OutputColor, s);
    }

    public static bitsPerChannel[] values()
    {
        return (bitsPerChannel[])$VALUES.clone();
    }

    public int getBitsPerChannel()
    {
        return bitsPerChannel;
    }

    public int getBitsPerPixel()
    {
        return bitsPerPixel;
    }

    public int getChannels()
    {
        return channels;
    }

    static 
    {
        BITDEPTH_BITONAL = new <init>("BITDEPTH_BITONAL", 0, 1, 1);
        BITDEPTH_GRAYSCALE = new <init>("BITDEPTH_GRAYSCALE", 1, 1, 8);
        BITDEPTH_COLOR = new <init>("BITDEPTH_COLOR", 2, 3, 8);
        $VALUES = (new .VALUES[] {
            BITDEPTH_BITONAL, BITDEPTH_GRAYSCALE, BITDEPTH_COLOR
        });
    }

    private (String s, int i, int j, int k)
    {
        super(s, i);
        channels = j;
        bitsPerChannel = k;
        bitsPerPixel = channels * bitsPerChannel;
    }
}
