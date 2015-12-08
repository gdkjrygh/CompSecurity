// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;


// Referenced classes of package com.weather.commons.analytics:
//            Attribute, LocalyticsVideoTags

public static final class attribute extends Enum
    implements Attribute
{

    private static final VIDEO_NUMBER_VIEWED $VALUES[];
    public static final VIDEO_NUMBER_VIEWED SCROLL_ACTION;
    public static final VIDEO_NUMBER_VIEWED TIME_SPENT;
    public static final VIDEO_NUMBER_VIEWED VIDEO_CATEGORY_LOCAL;
    public static final VIDEO_NUMBER_VIEWED VIDEO_CATEGORY_MUST_SEE;
    public static final VIDEO_NUMBER_VIEWED VIDEO_CATEGORY_ON_TV;
    public static final VIDEO_NUMBER_VIEWED VIDEO_NUMBER_VIEWED;
    public static final VIDEO_NUMBER_VIEWED VIDEO_SCROLL_ACTION;
    public static final VIDEO_NUMBER_VIEWED VIDEO_SHARE;
    public static final VIDEO_NUMBER_VIEWED VIDEO_SHARE_TITLE;
    public static final VIDEO_NUMBER_VIEWED VIDEO_TAPPED;
    private final String attribute;

    public static attribute valueOf(String s)
    {
        return (attribute)Enum.valueOf(com/weather/commons/analytics/LocalyticsVideoTags$VideoDetailsTagName, s);
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
        TIME_SPENT = new <init>("TIME_SPENT", 0, "time spent");
        SCROLL_ACTION = new <init>("SCROLL_ACTION", 1, "scroll action");
        VIDEO_TAPPED = new <init>("VIDEO_TAPPED", 2, "video taped");
        VIDEO_CATEGORY_MUST_SEE = new <init>("VIDEO_CATEGORY_MUST_SEE", 3, "must see");
        VIDEO_CATEGORY_ON_TV = new <init>("VIDEO_CATEGORY_ON_TV", 4, "on tv");
        VIDEO_CATEGORY_LOCAL = new <init>("VIDEO_CATEGORY_LOCAL", 5, "local");
        VIDEO_SHARE_TITLE = new <init>("VIDEO_SHARE_TITLE", 6, "video name");
        VIDEO_SHARE = new <init>("VIDEO_SHARE", 7, "video share");
        VIDEO_SCROLL_ACTION = new <init>("VIDEO_SCROLL_ACTION", 8, "scroll action");
        VIDEO_NUMBER_VIEWED = new <init>("VIDEO_NUMBER_VIEWED", 9, "number of videos viewed");
        $VALUES = (new .VALUES[] {
            TIME_SPENT, SCROLL_ACTION, VIDEO_TAPPED, VIDEO_CATEGORY_MUST_SEE, VIDEO_CATEGORY_ON_TV, VIDEO_CATEGORY_LOCAL, VIDEO_SHARE_TITLE, VIDEO_SHARE, VIDEO_SCROLL_ACTION, VIDEO_NUMBER_VIEWED
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        attribute = s1;
    }
}
