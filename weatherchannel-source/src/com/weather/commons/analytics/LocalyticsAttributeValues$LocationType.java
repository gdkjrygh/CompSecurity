// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;


// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsAttributeValues

public static final class attributeValue extends Enum
{

    private static final FIXED $VALUES[];
    public static final FIXED FIXED;
    public static final FIXED FOLLOW_ME;
    private final String attributeValue;

    public static attributeValue valueOf(String s)
    {
        return (attributeValue)Enum.valueOf(com/weather/commons/analytics/LocalyticsAttributeValues$LocationType, s);
    }

    public static attributeValue[] values()
    {
        return (attributeValue[])$VALUES.clone();
    }

    public String getAttributeValue()
    {
        return attributeValue;
    }

    static 
    {
        FOLLOW_ME = new <init>("FOLLOW_ME", 0, "follow me location");
        FIXED = new <init>("FIXED", 1, "fixed location");
        $VALUES = (new .VALUES[] {
            FOLLOW_ME, FIXED
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        attributeValue = s1;
    }
}
