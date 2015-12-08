// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.allergy;

import com.weather.commons.analytics.Attribute;

public final class AllergyFeedScreenTag extends Enum
    implements Attribute
{

    private static final AllergyFeedScreenTag $VALUES[];
    public static final AllergyFeedScreenTag BREATHING;
    public static final AllergyFeedScreenTag MOLD;
    public static final AllergyFeedScreenTag POLLEN;
    private final String attributeName;

    private AllergyFeedScreenTag(String s, int i, String s1)
    {
        super(s, i);
        attributeName = s1;
    }

    public static AllergyFeedScreenTag valueOf(String s)
    {
        return (AllergyFeedScreenTag)Enum.valueOf(com/weather/commons/analytics/allergy/AllergyFeedScreenTag, s);
    }

    public static AllergyFeedScreenTag[] values()
    {
        return (AllergyFeedScreenTag[])$VALUES.clone();
    }

    public String getName()
    {
        return attributeName;
    }

    static 
    {
        POLLEN = new AllergyFeedScreenTag("POLLEN", 0, "viewed pollen");
        BREATHING = new AllergyFeedScreenTag("BREATHING", 1, "viewed breathing");
        MOLD = new AllergyFeedScreenTag("MOLD", 2, "viewed mold");
        $VALUES = (new AllergyFeedScreenTag[] {
            POLLEN, BREATHING, MOLD
        });
    }
}
