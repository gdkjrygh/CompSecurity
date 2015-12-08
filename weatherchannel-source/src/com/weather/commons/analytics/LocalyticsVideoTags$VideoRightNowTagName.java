// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;


// Referenced classes of package com.weather.commons.analytics:
//            Attribute, LocalyticsVideoTags

public static final class attribute extends Enum
    implements Attribute
{

    private static final VIDEO_CATEGORY $VALUES[];
    public static final VIDEO_CATEGORY VIDEO_CATEGORY;
    public static final VIDEO_CATEGORY VIDEO_TAPPED;
    private final String attribute;

    public static attribute valueOf(String s)
    {
        return (attribute)Enum.valueOf(com/weather/commons/analytics/LocalyticsVideoTags$VideoRightNowTagName, s);
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
        VIDEO_TAPPED = new <init>("VIDEO_TAPPED", 0, "video tapped");
        VIDEO_CATEGORY = new <init>("VIDEO_CATEGORY", 1, "video category");
        $VALUES = (new .VALUES[] {
            VIDEO_TAPPED, VIDEO_CATEGORY
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        attribute = s1;
    }
}
