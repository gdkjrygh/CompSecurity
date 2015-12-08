// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui;


public final class SevereCondition extends Enum
{

    private static final SevereCondition $VALUES[];
    public static final SevereCondition LIGHTNING;
    private final int notificationId;
    private final int svgIconId;

    private SevereCondition(String s, int i, int j, int k)
    {
        super(s, i);
        svgIconId = j;
        notificationId = k;
    }

    public static SevereCondition valueOf(String s)
    {
        return (SevereCondition)Enum.valueOf(com/weather/commons/ui/SevereCondition, s);
    }

    public static SevereCondition[] values()
    {
        return (SevereCondition[])$VALUES.clone();
    }

    public int getNotificationId()
    {
        return notificationId;
    }

    public int getWhiteSvgIconId()
    {
        return svgIconId;
    }

    static 
    {
        LIGHTNING = new SevereCondition("LIGHTNING", 0, com.weather.commons.R.raw.ilightning_white, com.weather.commons.R.drawable.ic_sev_storm_leveled);
        $VALUES = (new SevereCondition[] {
            LIGHTNING
        });
    }
}
