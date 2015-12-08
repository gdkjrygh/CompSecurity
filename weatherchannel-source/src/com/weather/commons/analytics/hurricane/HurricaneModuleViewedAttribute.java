// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.hurricane;

import com.weather.commons.analytics.Attribute;

public final class HurricaneModuleViewedAttribute extends Enum
    implements Attribute
{

    private static final HurricaneModuleViewedAttribute $VALUES[];
    public static final HurricaneModuleViewedAttribute BULLETINS_MODULE;
    public static final HurricaneModuleViewedAttribute NEWS_ONE;
    public static final HurricaneModuleViewedAttribute NEWS_THREE;
    public static final HurricaneModuleViewedAttribute NEWS_TWO;
    public static final HurricaneModuleViewedAttribute NWS_ALERT;
    public static final HurricaneModuleViewedAttribute SAFETY;
    public static final HurricaneModuleViewedAttribute STORM_TRACK;
    public static final HurricaneModuleViewedAttribute TROPICAL_OUTLOOKS;
    public static final HurricaneModuleViewedAttribute VIDEO;
    private final String attributeName;

    private HurricaneModuleViewedAttribute(String s, int i, String s1)
    {
        super(s, i);
        attributeName = s1;
    }

    public static HurricaneModuleViewedAttribute valueOf(String s)
    {
        return (HurricaneModuleViewedAttribute)Enum.valueOf(com/weather/commons/analytics/hurricane/HurricaneModuleViewedAttribute, s);
    }

    public static HurricaneModuleViewedAttribute[] values()
    {
        return (HurricaneModuleViewedAttribute[])$VALUES.clone();
    }

    public String getName()
    {
        return attributeName;
    }

    static 
    {
        STORM_TRACK = new HurricaneModuleViewedAttribute("STORM_TRACK", 0, "viewed hc storm track module");
        NWS_ALERT = new HurricaneModuleViewedAttribute("NWS_ALERT", 1, "viewed hc nws module");
        VIDEO = new HurricaneModuleViewedAttribute("VIDEO", 2, "viewed hc video module");
        NEWS_ONE = new HurricaneModuleViewedAttribute("NEWS_ONE", 3, "viewed first hc news module");
        NEWS_TWO = new HurricaneModuleViewedAttribute("NEWS_TWO", 4, "viewed second hc news module");
        NEWS_THREE = new HurricaneModuleViewedAttribute("NEWS_THREE", 5, "viewed third hc news module");
        BULLETINS_MODULE = new HurricaneModuleViewedAttribute("BULLETINS_MODULE", 6, "viewed the hc bulletins module");
        TROPICAL_OUTLOOKS = new HurricaneModuleViewedAttribute("TROPICAL_OUTLOOKS", 7, "viewed the hc tropical outlooks module");
        SAFETY = new HurricaneModuleViewedAttribute("SAFETY", 8, "viewed the hc safety module");
        $VALUES = (new HurricaneModuleViewedAttribute[] {
            STORM_TRACK, NWS_ALERT, VIDEO, NEWS_ONE, NEWS_TWO, NEWS_THREE, BULLETINS_MODULE, TROPICAL_OUTLOOKS, SAFETY
        });
    }
}
