// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.ups;

import com.weather.commons.analytics.Attribute;

public final class LocalyticsUpsTag extends Enum
    implements Attribute
{

    private static final LocalyticsUpsTag $VALUES[];
    public static final LocalyticsUpsTag ATTEMPTS;
    public static final LocalyticsUpsTag COMPLETED;
    public static final LocalyticsUpsTag METHOD;
    public static final LocalyticsUpsTag PROVIDED_ADDRESSES;
    public static final LocalyticsUpsTag PROVIDED_GENDER;
    public static final LocalyticsUpsTag REFERRER_SOURCE;
    public static final LocalyticsUpsTag TIME_SPENT;
    private final String attribute;

    private LocalyticsUpsTag(String s, int i, String s1)
    {
        super(s, i);
        attribute = s1;
    }

    public static LocalyticsUpsTag valueOf(String s)
    {
        return (LocalyticsUpsTag)Enum.valueOf(com/weather/commons/analytics/ups/LocalyticsUpsTag, s);
    }

    public static LocalyticsUpsTag[] values()
    {
        return (LocalyticsUpsTag[])$VALUES.clone();
    }

    public String getName()
    {
        return attribute;
    }

    static 
    {
        REFERRER_SOURCE = new LocalyticsUpsTag("REFERRER_SOURCE", 0, "referrer source");
        TIME_SPENT = new LocalyticsUpsTag("TIME_SPENT", 1, "time spent");
        METHOD = new LocalyticsUpsTag("METHOD", 2, "method");
        ATTEMPTS = new LocalyticsUpsTag("ATTEMPTS", 3, "attempts");
        COMPLETED = new LocalyticsUpsTag("COMPLETED", 4, "completed");
        PROVIDED_GENDER = new LocalyticsUpsTag("PROVIDED_GENDER", 5, "provided gender");
        PROVIDED_ADDRESSES = new LocalyticsUpsTag("PROVIDED_ADDRESSES", 6, "provided addresses");
        $VALUES = (new LocalyticsUpsTag[] {
            REFERRER_SOURCE, TIME_SPENT, METHOD, ATTEMPTS, COMPLETED, PROVIDED_GENDER, PROVIDED_ADDRESSES
        });
    }
}
