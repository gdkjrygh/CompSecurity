// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.type;


public final class AppStatsPropertyType extends Enum
{

    public static final AppStatsPropertyType PROP_CONTINUOUS_CAPTURE_MODE;
    public static final AppStatsPropertyType PROP_PAGE_DETECT_MODE;
    public static final AppStatsPropertyType PROP_TYPE_LEVEL_PITCH_THRESHOLD;
    public static final AppStatsPropertyType PROP_TYPE_LEVEL_ROLL_THRESHOLD;
    public static final AppStatsPropertyType PROP_TYPE_STABILITY_THRESHOLD;
    public static final AppStatsPropertyType PROP_TYPE_UNUSED;
    private static final String a = "AppStatsInstanceType";
    private static final AppStatsPropertyType c[];
    private final String b;

    private AppStatsPropertyType(String s, int i, String s1)
    {
        super(s, i);
        b = s1;
    }

    public static AppStatsPropertyType valueOf(String s)
    {
        return (AppStatsPropertyType)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/type/AppStatsPropertyType, s);
    }

    public static AppStatsPropertyType[] values()
    {
        return (AppStatsPropertyType[])c.clone();
    }

    public String getPropTypeDescrip()
    {
        return b;
    }

    static 
    {
        PROP_TYPE_UNUSED = new AppStatsPropertyType("PROP_TYPE_UNUSED", 0, "Unused");
        PROP_TYPE_LEVEL_PITCH_THRESHOLD = new AppStatsPropertyType("PROP_TYPE_LEVEL_PITCH_THRESHOLD", 1, "LevelThresholdPitch");
        PROP_TYPE_LEVEL_ROLL_THRESHOLD = new AppStatsPropertyType("PROP_TYPE_LEVEL_ROLL_THRESHOLD", 2, "LevelThresholdRoll");
        PROP_TYPE_STABILITY_THRESHOLD = new AppStatsPropertyType("PROP_TYPE_STABILITY_THRESHOLD", 3, "StabilityThreshold");
        PROP_PAGE_DETECT_MODE = new AppStatsPropertyType("PROP_PAGE_DETECT_MODE", 4, "PageDetectMode");
        PROP_CONTINUOUS_CAPTURE_MODE = new AppStatsPropertyType("PROP_CONTINUOUS_CAPTURE_MODE", 5, "ContinuousCaptureMode");
        c = (new AppStatsPropertyType[] {
            PROP_TYPE_UNUSED, PROP_TYPE_LEVEL_PITCH_THRESHOLD, PROP_TYPE_LEVEL_ROLL_THRESHOLD, PROP_TYPE_STABILITY_THRESHOLD, PROP_PAGE_DETECT_MODE, PROP_CONTINUOUS_CAPTURE_MODE
        });
    }
}
