// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.google.common.base.Function;

// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsBuckets

public static final class maxTime extends Enum
    implements maxTime
{

    private static final MORE_THAN_SIXTY_MINUTES $VALUES[];
    public static final MORE_THAN_SIXTY_MINUTES ELVEN_TO_TWENTY_MINUTES;
    public static final MORE_THAN_SIXTY_MINUTES FOUR_TO_FIVE_MINUTES;
    public static final MORE_THAN_SIXTY_MINUTES MORE_THAN_SIXTY_MINUTES;
    public static final MORE_THAN_SIXTY_MINUTES SIX_TO_TEN_MINUTES;
    public static final MORE_THAN_SIXTY_MINUTES THIRTY_ONE_TO_SIXTY_MINUTES;
    public static final MORE_THAN_SIXTY_MINUTES TWENTY_ONE_TO_THIRTY_MINUTES;
    public static final MORE_THAN_SIXTY_MINUTES TWO_TO_THREE_MINUTES;
    public static final MORE_THAN_SIXTY_MINUTES ZERO_TO_ONE_MINUTE;
    private final long maxTime;
    private final long minTime;
    private final String timeSpent;

    public static Function getMinutesToStringConverter()
    {
        return new Function() {

            public volatile Object apply(Object obj)
            {
                return apply((Long)obj);
            }

            public String apply(Long long1)
            {
                if (long1 == null)
                {
                    return null;
                } else
                {
                    return LocalyticsBuckets.TimeSpentInMinutes.lookup(long1.longValue());
                }
            }

            public String toString()
            {
                return "Minutes to TimeSpentInMinutes";
            }

        };
    }

    public static String lookup(long l)
    {
        return LocalyticsBuckets.access$000(values(), l);
    }

    public static values valueOf(String s)
    {
        return (values)Enum.valueOf(com/weather/commons/analytics/LocalyticsBuckets$TimeSpentInMinutes, s);
    }

    public static values[] values()
    {
        return (values[])$VALUES.clone();
    }

    public boolean contains(long l)
    {
        return l >= minTime && l <= maxTime;
    }

    public String getBucketString()
    {
        return timeSpent;
    }

    static 
    {
        ZERO_TO_ONE_MINUTE = new <init>("ZERO_TO_ONE_MINUTE", 0, "0-1 min", 0x8000000000000000L, 1L);
        TWO_TO_THREE_MINUTES = new <init>("TWO_TO_THREE_MINUTES", 1, "2-3 min", 2L, 3L);
        FOUR_TO_FIVE_MINUTES = new <init>("FOUR_TO_FIVE_MINUTES", 2, "4-5 min", 4L, 5L);
        SIX_TO_TEN_MINUTES = new <init>("SIX_TO_TEN_MINUTES", 3, "6-10 min", 6L, 10L);
        ELVEN_TO_TWENTY_MINUTES = new <init>("ELVEN_TO_TWENTY_MINUTES", 4, "11-20 min", 11L, 20L);
        TWENTY_ONE_TO_THIRTY_MINUTES = new <init>("TWENTY_ONE_TO_THIRTY_MINUTES", 5, "21-30 min", 21L, 30L);
        THIRTY_ONE_TO_SIXTY_MINUTES = new <init>("THIRTY_ONE_TO_SIXTY_MINUTES", 6, "31-60 min", 31L, 60L);
        MORE_THAN_SIXTY_MINUTES = new <init>("MORE_THAN_SIXTY_MINUTES", 7, "60 min+", 61L, 0x7fffffffffffffffL);
        $VALUES = (new .VALUES[] {
            ZERO_TO_ONE_MINUTE, TWO_TO_THREE_MINUTES, FOUR_TO_FIVE_MINUTES, SIX_TO_TEN_MINUTES, ELVEN_TO_TWENTY_MINUTES, TWENTY_ONE_TO_THIRTY_MINUTES, THIRTY_ONE_TO_SIXTY_MINUTES, MORE_THAN_SIXTY_MINUTES
        });
    }

    private _cls1(String s, int i, String s1, long l, long l1)
    {
        super(s, i);
        timeSpent = s1;
        minTime = l;
        maxTime = l1;
    }
}
