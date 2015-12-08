// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;


// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsBuckets

public static class <init> extends Enum
    implements <init>
{

    private static final HUNDRED_PERCENT $VALUES[];
    public static final HUNDRED_PERCENT FIFTY_TO_SEVENTY_FOUR_PERCENTAGE;
    public static final HUNDRED_PERCENT HUNDRED_PERCENT;
    public static final HUNDRED_PERCENT SEVENTY_FIVE_TO_NINETY_NINE;
    public static final HUNDRED_PERCENT TWENTY_FIVE_TO_FORTY_NINE_PERCENT;
    public static final HUNDRED_PERCENT ZERO_TO_TWENTY_FOUR_PERCENT;
    private final long maxValue;
    private final long minValue;
    private final String percent;

    public static String lookup(long l)
    {
        return LocalyticsBuckets.access$000(values(), l);
    }

    public static values valueOf(String s)
    {
        return (values)Enum.valueOf(com/weather/commons/analytics/LocalyticsBuckets$PercentageWatched, s);
    }

    public static values[] values()
    {
        return (values[])$VALUES.clone();
    }

    public boolean contains(long l)
    {
        return l >= minValue && l <= maxValue;
    }

    public String getBucketString()
    {
        return percent;
    }

    static 
    {
        ZERO_TO_TWENTY_FOUR_PERCENT = new LocalyticsBuckets.PercentageWatched("ZERO_TO_TWENTY_FOUR_PERCENT", 0, "0% to 24%", 0x8000000000000000L, 24L) {

            public boolean contains(long l)
            {
                return contains(l) || l > 100L;
            }

        };
        TWENTY_FIVE_TO_FORTY_NINE_PERCENT = new <init>("TWENTY_FIVE_TO_FORTY_NINE_PERCENT", 1, "25% to 49%", 25L, 49L);
        FIFTY_TO_SEVENTY_FOUR_PERCENTAGE = new <init>("FIFTY_TO_SEVENTY_FOUR_PERCENTAGE", 2, "50% to 74%", 50L, 74L);
        SEVENTY_FIVE_TO_NINETY_NINE = new <init>("SEVENTY_FIVE_TO_NINETY_NINE", 3, "75% to 99%", 75L, 99L);
        HUNDRED_PERCENT = new <init>("HUNDRED_PERCENT", 4, "100%", 100L, 100L);
        $VALUES = (new .VALUES[] {
            ZERO_TO_TWENTY_FOUR_PERCENT, TWENTY_FIVE_TO_FORTY_NINE_PERCENT, FIFTY_TO_SEVENTY_FOUR_PERCENTAGE, SEVENTY_FIVE_TO_NINETY_NINE, HUNDRED_PERCENT
        });
    }

    private _cls1(String s, int i, String s1, long l, long l1)
    {
        super(s, i);
        percent = s1;
        minValue = l;
        maxValue = l1;
    }

    maxValue(String s, int i, String s1, long l, long l1, 
            maxValue maxvalue)
    {
        this(s, i, s1, l, l1);
    }
}
