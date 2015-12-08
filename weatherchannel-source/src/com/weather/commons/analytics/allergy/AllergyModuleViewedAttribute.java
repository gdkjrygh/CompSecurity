// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.allergy;

import com.weather.commons.analytics.Attribute;

public final class AllergyModuleViewedAttribute extends Enum
    implements Attribute
{

    private static final AllergyModuleViewedAttribute $VALUES[];
    public static final AllergyModuleViewedAttribute ALLERGY_FORECAST;
    public static final AllergyModuleViewedAttribute ALLERGY_HERO;
    public static final AllergyModuleViewedAttribute ALLERGY_MAP;
    public static final AllergyModuleViewedAttribute MOLD_SLIDER_MAP;
    private final String attributeName;

    private AllergyModuleViewedAttribute(String s, int i, String s1)
    {
        super(s, i);
        attributeName = s1;
    }

    public static AllergyModuleViewedAttribute valueOf(String s)
    {
        return (AllergyModuleViewedAttribute)Enum.valueOf(com/weather/commons/analytics/allergy/AllergyModuleViewedAttribute, s);
    }

    public static AllergyModuleViewedAttribute[] values()
    {
        return (AllergyModuleViewedAttribute[])$VALUES.clone();
    }

    public String getName()
    {
        return attributeName;
    }

    static 
    {
        ALLERGY_HERO = new AllergyModuleViewedAttribute("ALLERGY_HERO", 0, "viewed allergy hero module");
        ALLERGY_FORECAST = new AllergyModuleViewedAttribute("ALLERGY_FORECAST", 1, "viewed allergy forecast module");
        ALLERGY_MAP = new AllergyModuleViewedAttribute("ALLERGY_MAP", 2, "viewed allergy map module");
        MOLD_SLIDER_MAP = new AllergyModuleViewedAttribute("MOLD_SLIDER_MAP", 3, "viewed mold slider module");
        $VALUES = (new AllergyModuleViewedAttribute[] {
            ALLERGY_HERO, ALLERGY_FORECAST, ALLERGY_MAP, MOLD_SLIDER_MAP
        });
    }
}
