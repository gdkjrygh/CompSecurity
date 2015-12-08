// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;


// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsAttributeValues

public static final class videoCategory extends Enum
{

    private static final MUST_SEE $VALUES[];
    public static final MUST_SEE LOCAL;
    public static final MUST_SEE MUST_SEE;
    public static final MUST_SEE ON_TV;
    private final String videoCategory;

    public static videoCategory valueOf(String s)
    {
        return (videoCategory)Enum.valueOf(com/weather/commons/analytics/LocalyticsAttributeValues$VideoCategory, s);
    }

    public static videoCategory[] values()
    {
        return (videoCategory[])$VALUES.clone();
    }

    public String getAttributeValue()
    {
        return videoCategory;
    }

    static 
    {
        LOCAL = new <init>("LOCAL", 0, "local");
        ON_TV = new <init>("ON_TV", 1, "on tv");
        MUST_SEE = new <init>("MUST_SEE", 2, "must see");
        $VALUES = (new .VALUES[] {
            LOCAL, ON_TV, MUST_SEE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        videoCategory = s1;
    }
}
