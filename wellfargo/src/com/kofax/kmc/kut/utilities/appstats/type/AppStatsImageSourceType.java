// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.type;


public final class AppStatsImageSourceType extends Enum
{

    public static final AppStatsImageSourceType IMAGE_SOURCE_TYPE_IMAGE;
    public static final AppStatsImageSourceType INST_TYPE_IMAGE_CAPTURE;
    public static final AppStatsImageSourceType INST_TYPE_IMAGE_PROCESSOR;
    private static final String a = "AppStatsImageSourceType";
    private static final AppStatsImageSourceType c[];
    private final String b;

    private AppStatsImageSourceType(String s, int i, String s1)
    {
        super(s, i);
        b = s1;
    }

    public static AppStatsImageSourceType valueOf(String s)
    {
        return (AppStatsImageSourceType)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/type/AppStatsImageSourceType, s);
    }

    public static AppStatsImageSourceType[] values()
    {
        return (AppStatsImageSourceType[])c.clone();
    }

    public String getImageSourceDescription()
    {
        return b;
    }

    static 
    {
        IMAGE_SOURCE_TYPE_IMAGE = new AppStatsImageSourceType("IMAGE_SOURCE_TYPE_IMAGE", 0, "Image");
        INST_TYPE_IMAGE_PROCESSOR = new AppStatsImageSourceType("INST_TYPE_IMAGE_PROCESSOR", 1, "ImageProcessor");
        INST_TYPE_IMAGE_CAPTURE = new AppStatsImageSourceType("INST_TYPE_IMAGE_CAPTURE", 2, "ImageCapture");
        c = (new AppStatsImageSourceType[] {
            IMAGE_SOURCE_TYPE_IMAGE, INST_TYPE_IMAGE_PROCESSOR, INST_TYPE_IMAGE_CAPTURE
        });
    }
}
