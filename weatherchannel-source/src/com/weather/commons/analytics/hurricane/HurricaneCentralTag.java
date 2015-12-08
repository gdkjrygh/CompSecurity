// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.hurricane;

import com.weather.commons.analytics.Attribute;

public final class HurricaneCentralTag extends Enum
    implements Attribute
{

    private static final HurricaneCentralTag $VALUES[];
    public static final HurricaneCentralTag CURRENT_STORM;
    public static final HurricaneCentralTag EXIT_METHOD;
    public static final HurricaneCentralTag OUTLOOKS_EXPANDED;
    public static final HurricaneCentralTag OUTLOOK_BASIN;
    public static final HurricaneCentralTag PREVIOUS_SCREEN;
    public static final HurricaneCentralTag SCROLLED;
    public static final HurricaneCentralTag STORM_CATEGORY;
    public static final HurricaneCentralTag STORM_ID;
    public static final HurricaneCentralTag SWIPE_DESTINATION_STORM;
    public static final HurricaneCentralTag SWIPE_ORIGINATING_STORM;
    public static final HurricaneCentralTag TIME_SPENT;
    private final String attributeName;

    private HurricaneCentralTag(String s, int i, String s1)
    {
        super(s, i);
        attributeName = s1;
    }

    public static HurricaneCentralTag valueOf(String s)
    {
        return (HurricaneCentralTag)Enum.valueOf(com/weather/commons/analytics/hurricane/HurricaneCentralTag, s);
    }

    public static HurricaneCentralTag[] values()
    {
        return (HurricaneCentralTag[])$VALUES.clone();
    }

    public String getName()
    {
        return attributeName;
    }

    static 
    {
        PREVIOUS_SCREEN = new HurricaneCentralTag("PREVIOUS_SCREEN", 0, "previous screen");
        TIME_SPENT = new HurricaneCentralTag("TIME_SPENT", 1, "duration");
        EXIT_METHOD = new HurricaneCentralTag("EXIT_METHOD", 2, "exit method");
        CURRENT_STORM = new HurricaneCentralTag("CURRENT_STORM", 3, "related storm");
        OUTLOOKS_EXPANDED = new HurricaneCentralTag("OUTLOOKS_EXPANDED", 4, "number of reports expanded");
        OUTLOOK_BASIN = new HurricaneCentralTag("OUTLOOK_BASIN", 5, "outlook type");
        SWIPE_ORIGINATING_STORM = new HurricaneCentralTag("SWIPE_ORIGINATING_STORM", 6, "originating storm");
        SWIPE_DESTINATION_STORM = new HurricaneCentralTag("SWIPE_DESTINATION_STORM", 7, "destination storm");
        SCROLLED = new HurricaneCentralTag("SCROLLED", 8, "scrolled");
        STORM_ID = new HurricaneCentralTag("STORM_ID", 9, "storm name");
        STORM_CATEGORY = new HurricaneCentralTag("STORM_CATEGORY", 10, "storm category");
        $VALUES = (new HurricaneCentralTag[] {
            PREVIOUS_SCREEN, TIME_SPENT, EXIT_METHOD, CURRENT_STORM, OUTLOOKS_EXPANDED, OUTLOOK_BASIN, SWIPE_ORIGINATING_STORM, SWIPE_DESTINATION_STORM, SCROLLED, STORM_ID, 
            STORM_CATEGORY
        });
    }
}
