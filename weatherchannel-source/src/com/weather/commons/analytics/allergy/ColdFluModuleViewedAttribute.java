// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.allergy;

import com.weather.commons.analytics.Attribute;

public final class ColdFluModuleViewedAttribute extends Enum
    implements Attribute
{

    private static final ColdFluModuleViewedAttribute $VALUES[];
    public static final ColdFluModuleViewedAttribute COLD_FLU_HERO;
    private final String attributeName;

    private ColdFluModuleViewedAttribute(String s, int i, String s1)
    {
        super(s, i);
        attributeName = s1;
    }

    public static ColdFluModuleViewedAttribute valueOf(String s)
    {
        return (ColdFluModuleViewedAttribute)Enum.valueOf(com/weather/commons/analytics/allergy/ColdFluModuleViewedAttribute, s);
    }

    public static ColdFluModuleViewedAttribute[] values()
    {
        return (ColdFluModuleViewedAttribute[])$VALUES.clone();
    }

    public String getName()
    {
        return attributeName;
    }

    static 
    {
        COLD_FLU_HERO = new ColdFluModuleViewedAttribute("COLD_FLU_HERO", 0, "viewed allergy hero module");
        $VALUES = (new ColdFluModuleViewedAttribute[] {
            COLD_FLU_HERO
        });
    }
}
