// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;


// Referenced classes of package com.weather.commons.analytics:
//            Attribute, LocalyticsVideoTags

public static final class attribute extends Enum
    implements Attribute
{

    private static final PREVIOUS_SCREEN $VALUES[];
    public static final PREVIOUS_SCREEN PREVIOUS_SCREEN;
    private final String attribute;

    public static attribute valueOf(String s)
    {
        return (attribute)Enum.valueOf(com/weather/commons/analytics/LocalyticsVideoTags$VideoCommonTags, s);
    }

    public static attribute[] values()
    {
        return (attribute[])$VALUES.clone();
    }

    public String getName()
    {
        return attribute;
    }

    static 
    {
        PREVIOUS_SCREEN = new <init>("PREVIOUS_SCREEN", 0, "previous screen");
        $VALUES = (new .VALUES[] {
            PREVIOUS_SCREEN
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        attribute = s1;
    }
}
