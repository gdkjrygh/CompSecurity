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

    private static final ABOVE_NINETY_SECONDS $VALUES[];
    public static final ABOVE_NINETY_SECONDS ABOVE_NINETY_SECONDS;
    public static final ABOVE_NINETY_SECONDS ELEVEN_TO_THIRTY_SECONDS;
    public static final ABOVE_NINETY_SECONDS FORTY_SIX_TO_SIXTY_SECONDS;
    public static final ABOVE_NINETY_SECONDS SIXTY_ONE_TO_NINETY_SECONDS;
    public static final ABOVE_NINETY_SECONDS SIX_TO_TEN_SECONDS;
    public static final ABOVE_NINETY_SECONDS THIRTY_ONE_TO_FORTY_FIVE_SECONDS;
    public static final ABOVE_NINETY_SECONDS TWO_TO_FIVE_SECONDS;
    public static final ABOVE_NINETY_SECONDS ZERO_TO_ONE_SECOND;
    private final long maxTime;
    private final long minTime;
    private final String timeSpent;

    public static Function getSecondsToStringConverter()
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
                    return LocalyticsBuckets.TimeSpentInSeconds.lookup(long1.longValue());
                }
            }

            public String toString()
            {
                return "Seconds to TimeSpentInSeconds";
            }

        };
    }

    public static String lookup(long l)
    {
        return LocalyticsBuckets.access$000(values(), l);
    }

    public static values valueOf(String s)
    {
        return (values)Enum.valueOf(com/weather/commons/analytics/LocalyticsBuckets$TimeSpentInSeconds, s);
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
        ZERO_TO_ONE_SECOND = new <init>("ZERO_TO_ONE_SECOND", 0, "0-1 sec", 0x8000000000000000L, 1L);
        TWO_TO_FIVE_SECONDS = new <init>("TWO_TO_FIVE_SECONDS", 1, "2-5 sec", 2L, 5L);
        SIX_TO_TEN_SECONDS = new <init>("SIX_TO_TEN_SECONDS", 2, "6-10 sec", 6L, 10L);
        ELEVEN_TO_THIRTY_SECONDS = new <init>("ELEVEN_TO_THIRTY_SECONDS", 3, "11-30 sec", 11L, 30L);
        THIRTY_ONE_TO_FORTY_FIVE_SECONDS = new <init>("THIRTY_ONE_TO_FORTY_FIVE_SECONDS", 4, "31-45 sec", 31L, 45L);
        FORTY_SIX_TO_SIXTY_SECONDS = new <init>("FORTY_SIX_TO_SIXTY_SECONDS", 5, "46-60 sec", 46L, 60L);
        SIXTY_ONE_TO_NINETY_SECONDS = new <init>("SIXTY_ONE_TO_NINETY_SECONDS", 6, "61-90 sec", 61L, 90L);
        ABOVE_NINETY_SECONDS = new <init>("ABOVE_NINETY_SECONDS", 7, "above 90 seconds", 91L, 0x7fffffffffffffffL);
        $VALUES = (new .VALUES[] {
            ZERO_TO_ONE_SECOND, TWO_TO_FIVE_SECONDS, SIX_TO_TEN_SECONDS, ELEVEN_TO_THIRTY_SECONDS, THIRTY_ONE_TO_FORTY_FIVE_SECONDS, FORTY_SIX_TO_SIXTY_SECONDS, SIXTY_ONE_TO_NINETY_SECONDS, ABOVE_NINETY_SECONDS
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
