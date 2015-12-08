// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.google.common.base.Function;

public final class LocalyticsBuckets
{
    public static interface Bucket
    {

        public abstract boolean contains(long l);

        public abstract String getBucketString();
    }

    public static class PercentageWatched extends Enum
        implements Bucket
    {

        private static final PercentageWatched $VALUES[];
        public static final PercentageWatched FIFTY_TO_SEVENTY_FOUR_PERCENTAGE;
        public static final PercentageWatched HUNDRED_PERCENT;
        public static final PercentageWatched SEVENTY_FIVE_TO_NINETY_NINE;
        public static final PercentageWatched TWENTY_FIVE_TO_FORTY_NINE_PERCENT;
        public static final PercentageWatched ZERO_TO_TWENTY_FOUR_PERCENT;
        private final long maxValue;
        private final long minValue;
        private final String percent;

        public static String lookup(long l)
        {
            return LocalyticsBuckets.lookupFromBucketList(values(), l);
        }

        public static PercentageWatched valueOf(String s)
        {
            return (PercentageWatched)Enum.valueOf(com/weather/commons/analytics/LocalyticsBuckets$PercentageWatched, s);
        }

        public static PercentageWatched[] values()
        {
            return (PercentageWatched[])$VALUES.clone();
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
            ZERO_TO_TWENTY_FOUR_PERCENT = new PercentageWatched("ZERO_TO_TWENTY_FOUR_PERCENT", 0, "0% to 24%", 0x8000000000000000L, 24L) {

                public boolean contains(long l)
                {
                    return super.contains(l) || l > 100L;
                }

            };
            TWENTY_FIVE_TO_FORTY_NINE_PERCENT = new PercentageWatched("TWENTY_FIVE_TO_FORTY_NINE_PERCENT", 1, "25% to 49%", 25L, 49L);
            FIFTY_TO_SEVENTY_FOUR_PERCENTAGE = new PercentageWatched("FIFTY_TO_SEVENTY_FOUR_PERCENTAGE", 2, "50% to 74%", 50L, 74L);
            SEVENTY_FIVE_TO_NINETY_NINE = new PercentageWatched("SEVENTY_FIVE_TO_NINETY_NINE", 3, "75% to 99%", 75L, 99L);
            HUNDRED_PERCENT = new PercentageWatched("HUNDRED_PERCENT", 4, "100%", 100L, 100L);
            $VALUES = (new PercentageWatched[] {
                ZERO_TO_TWENTY_FOUR_PERCENT, TWENTY_FIVE_TO_FORTY_NINE_PERCENT, FIFTY_TO_SEVENTY_FOUR_PERCENTAGE, SEVENTY_FIVE_TO_NINETY_NINE, HUNDRED_PERCENT
            });
        }

        private PercentageWatched(String s, int i, String s1, long l, long l1)
        {
            super(s, i);
            percent = s1;
            minValue = l;
            maxValue = l1;
        }

        PercentageWatched(String s, int i, String s1, long l, long l1, 
                _cls1 _pcls1)
        {
            this(s, i, s1, l, l1);
        }
    }

    public static final class TimeSpentInMilliSeconds extends Enum
        implements Bucket
    {

        private static final TimeSpentInMilliSeconds $VALUES[];
        public static final TimeSpentInMilliSeconds EIGHTEEN_HUNDRED_TO_TWO_THOUSAND_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds EIGHT_HUNDRED_TO_THOUSAND_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds FIFTY_TO_ONE_HUNDRED_MILLI_SECOND;
        public static final TimeSpentInMilliSeconds FOURTEEN_TO_SIXTEEN_HUNDRED_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds FOUR_SECONDS_TO_TEN_SECONDS;
        public static final TimeSpentInMilliSeconds FOUR_TO_SIX_HUNDRED_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds ONE_THOUSAND_TO_TWELEVE_HUNDRED_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds ONE_TO_TWO_HUNDRED_MILLI_SECOND;
        public static final TimeSpentInMilliSeconds SIXTEEN_TO_EIGHTEEN_HUNDRED_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds SIX_TO_EIGHT_HUNDRED_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds TEN_SECONDS_AND_ABOVE;
        public static final TimeSpentInMilliSeconds THIRTY_EIGHT_HUNDRED_MILLI_SECONDS_TO_FOUR_SECONDS;
        public static final TimeSpentInMilliSeconds THIRTY_FOUR_TO_THIRTY_SIX_HUNDRED_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds THIRTY_SIX_TO_THIRTY_EIGHT_HUNDRED_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds THIRTY_TWO_TO_THIRTY_FOUR_HUNDRED_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds THREE_THOUSAND_TO_THIRTY_TWO_HUNDRED_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds TWELVE_HUNDRED_TO_FOURTEEN_HUNDRED_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds TWENTY_EIGHT_HUNDRED_TO_THREE_THOUSAND_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds TWENTY_FOUR_TO_TWENTY_SIX_HUNDRED_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds TWENTY_SIX_TO_TWENTY_EIGHT_HUNDRED_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds TWENTY_TWO_TO_TWENTY_FOUR_HUNDRED_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds TWO_THOUSAND_TO_TWENTY_TWO_HUNDRED_MILLI_SECONDS;
        public static final TimeSpentInMilliSeconds TWO_TO_FOUR_HUNDRED_MILLI_SECOND;
        public static final TimeSpentInMilliSeconds ZERO_TO_FIFTY_MILLI_SECOND;
        private final long maxTime;
        private final long minTime;
        private final String timeSpent;

        public static String lookup(long l)
        {
            return LocalyticsBuckets.lookupFromBucketList(values(), l);
        }

        public static TimeSpentInMilliSeconds valueOf(String s)
        {
            return (TimeSpentInMilliSeconds)Enum.valueOf(com/weather/commons/analytics/LocalyticsBuckets$TimeSpentInMilliSeconds, s);
        }

        public static TimeSpentInMilliSeconds[] values()
        {
            return (TimeSpentInMilliSeconds[])$VALUES.clone();
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
            ZERO_TO_FIFTY_MILLI_SECOND = new TimeSpentInMilliSeconds("ZERO_TO_FIFTY_MILLI_SECOND", 0, "50 milli sec", 0x8000000000000000L, 50L);
            FIFTY_TO_ONE_HUNDRED_MILLI_SECOND = new TimeSpentInMilliSeconds("FIFTY_TO_ONE_HUNDRED_MILLI_SECOND", 1, "51-100 milli sec", 51L, 100L);
            ONE_TO_TWO_HUNDRED_MILLI_SECOND = new TimeSpentInMilliSeconds("ONE_TO_TWO_HUNDRED_MILLI_SECOND", 2, "101-200 milli sec", 101L, 200L);
            TWO_TO_FOUR_HUNDRED_MILLI_SECOND = new TimeSpentInMilliSeconds("TWO_TO_FOUR_HUNDRED_MILLI_SECOND", 3, "201-400 milli sec", 201L, 400L);
            FOUR_TO_SIX_HUNDRED_MILLI_SECONDS = new TimeSpentInMilliSeconds("FOUR_TO_SIX_HUNDRED_MILLI_SECONDS", 4, "401-600 milli  sec", 401L, 600L);
            SIX_TO_EIGHT_HUNDRED_MILLI_SECONDS = new TimeSpentInMilliSeconds("SIX_TO_EIGHT_HUNDRED_MILLI_SECONDS", 5, "601-800 milli sec", 601L, 800L);
            EIGHT_HUNDRED_TO_THOUSAND_MILLI_SECONDS = new TimeSpentInMilliSeconds("EIGHT_HUNDRED_TO_THOUSAND_MILLI_SECONDS", 6, "801-1000 milli sec", 801L, 1000L);
            ONE_THOUSAND_TO_TWELEVE_HUNDRED_MILLI_SECONDS = new TimeSpentInMilliSeconds("ONE_THOUSAND_TO_TWELEVE_HUNDRED_MILLI_SECONDS", 7, "1001-1200 milli sec", 1001L, 1200L);
            TWELVE_HUNDRED_TO_FOURTEEN_HUNDRED_MILLI_SECONDS = new TimeSpentInMilliSeconds("TWELVE_HUNDRED_TO_FOURTEEN_HUNDRED_MILLI_SECONDS", 8, "1201-1400 milli sec", 1201L, 1400L);
            FOURTEEN_TO_SIXTEEN_HUNDRED_MILLI_SECONDS = new TimeSpentInMilliSeconds("FOURTEEN_TO_SIXTEEN_HUNDRED_MILLI_SECONDS", 9, "1401-1600 milli sec", 1401L, 1600L);
            SIXTEEN_TO_EIGHTEEN_HUNDRED_MILLI_SECONDS = new TimeSpentInMilliSeconds("SIXTEEN_TO_EIGHTEEN_HUNDRED_MILLI_SECONDS", 10, "1601-1800 milli sec", 1601L, 1800L);
            EIGHTEEN_HUNDRED_TO_TWO_THOUSAND_MILLI_SECONDS = new TimeSpentInMilliSeconds("EIGHTEEN_HUNDRED_TO_TWO_THOUSAND_MILLI_SECONDS", 11, "1801-2000 milli sec", 1801L, 2000L);
            TWO_THOUSAND_TO_TWENTY_TWO_HUNDRED_MILLI_SECONDS = new TimeSpentInMilliSeconds("TWO_THOUSAND_TO_TWENTY_TWO_HUNDRED_MILLI_SECONDS", 12, "2001-2200 milli sec", 2001L, 2200L);
            TWENTY_TWO_TO_TWENTY_FOUR_HUNDRED_MILLI_SECONDS = new TimeSpentInMilliSeconds("TWENTY_TWO_TO_TWENTY_FOUR_HUNDRED_MILLI_SECONDS", 13, "2201-2400 milli sec", 2201L, 2400L);
            TWENTY_FOUR_TO_TWENTY_SIX_HUNDRED_MILLI_SECONDS = new TimeSpentInMilliSeconds("TWENTY_FOUR_TO_TWENTY_SIX_HUNDRED_MILLI_SECONDS", 14, "2401-2600 milli sec", 2401L, 2600L);
            TWENTY_SIX_TO_TWENTY_EIGHT_HUNDRED_MILLI_SECONDS = new TimeSpentInMilliSeconds("TWENTY_SIX_TO_TWENTY_EIGHT_HUNDRED_MILLI_SECONDS", 15, "2601-2800 milli sec", 2601L, 2800L);
            TWENTY_EIGHT_HUNDRED_TO_THREE_THOUSAND_MILLI_SECONDS = new TimeSpentInMilliSeconds("TWENTY_EIGHT_HUNDRED_TO_THREE_THOUSAND_MILLI_SECONDS", 16, "2801-3000 milli sec", 2801L, 3000L);
            THREE_THOUSAND_TO_THIRTY_TWO_HUNDRED_MILLI_SECONDS = new TimeSpentInMilliSeconds("THREE_THOUSAND_TO_THIRTY_TWO_HUNDRED_MILLI_SECONDS", 17, "3001-3200 milli sec", 3001L, 3200L);
            THIRTY_TWO_TO_THIRTY_FOUR_HUNDRED_MILLI_SECONDS = new TimeSpentInMilliSeconds("THIRTY_TWO_TO_THIRTY_FOUR_HUNDRED_MILLI_SECONDS", 18, "3201-3400 milli sec", 3201L, 3400L);
            THIRTY_FOUR_TO_THIRTY_SIX_HUNDRED_MILLI_SECONDS = new TimeSpentInMilliSeconds("THIRTY_FOUR_TO_THIRTY_SIX_HUNDRED_MILLI_SECONDS", 19, "3401-3600 milli sec", 3401L, 3600L);
            THIRTY_SIX_TO_THIRTY_EIGHT_HUNDRED_MILLI_SECONDS = new TimeSpentInMilliSeconds("THIRTY_SIX_TO_THIRTY_EIGHT_HUNDRED_MILLI_SECONDS", 20, "3601-3800 milli sec", 3601L, 3800L);
            THIRTY_EIGHT_HUNDRED_MILLI_SECONDS_TO_FOUR_SECONDS = new TimeSpentInMilliSeconds("THIRTY_EIGHT_HUNDRED_MILLI_SECONDS_TO_FOUR_SECONDS", 21, "3801 milli sec to 4 sec", 3801L, 4000L);
            FOUR_SECONDS_TO_TEN_SECONDS = new TimeSpentInMilliSeconds("FOUR_SECONDS_TO_TEN_SECONDS", 22, "4 sec to 10 sec", 4001L, 10000L);
            TEN_SECONDS_AND_ABOVE = new TimeSpentInMilliSeconds("TEN_SECONDS_AND_ABOVE", 23, "above 10 sec", 10001L, 0x7fffffffffffffffL);
            $VALUES = (new TimeSpentInMilliSeconds[] {
                ZERO_TO_FIFTY_MILLI_SECOND, FIFTY_TO_ONE_HUNDRED_MILLI_SECOND, ONE_TO_TWO_HUNDRED_MILLI_SECOND, TWO_TO_FOUR_HUNDRED_MILLI_SECOND, FOUR_TO_SIX_HUNDRED_MILLI_SECONDS, SIX_TO_EIGHT_HUNDRED_MILLI_SECONDS, EIGHT_HUNDRED_TO_THOUSAND_MILLI_SECONDS, ONE_THOUSAND_TO_TWELEVE_HUNDRED_MILLI_SECONDS, TWELVE_HUNDRED_TO_FOURTEEN_HUNDRED_MILLI_SECONDS, FOURTEEN_TO_SIXTEEN_HUNDRED_MILLI_SECONDS, 
                SIXTEEN_TO_EIGHTEEN_HUNDRED_MILLI_SECONDS, EIGHTEEN_HUNDRED_TO_TWO_THOUSAND_MILLI_SECONDS, TWO_THOUSAND_TO_TWENTY_TWO_HUNDRED_MILLI_SECONDS, TWENTY_TWO_TO_TWENTY_FOUR_HUNDRED_MILLI_SECONDS, TWENTY_FOUR_TO_TWENTY_SIX_HUNDRED_MILLI_SECONDS, TWENTY_SIX_TO_TWENTY_EIGHT_HUNDRED_MILLI_SECONDS, TWENTY_EIGHT_HUNDRED_TO_THREE_THOUSAND_MILLI_SECONDS, THREE_THOUSAND_TO_THIRTY_TWO_HUNDRED_MILLI_SECONDS, THIRTY_TWO_TO_THIRTY_FOUR_HUNDRED_MILLI_SECONDS, THIRTY_FOUR_TO_THIRTY_SIX_HUNDRED_MILLI_SECONDS, 
                THIRTY_SIX_TO_THIRTY_EIGHT_HUNDRED_MILLI_SECONDS, THIRTY_EIGHT_HUNDRED_MILLI_SECONDS_TO_FOUR_SECONDS, FOUR_SECONDS_TO_TEN_SECONDS, TEN_SECONDS_AND_ABOVE
            });
        }

        private TimeSpentInMilliSeconds(String s, int i, String s1, long l, long l1)
        {
            super(s, i);
            timeSpent = s1;
            minTime = l;
            maxTime = l1;
        }
    }

    public static final class TimeSpentInMinutes extends Enum
        implements Bucket
    {

        private static final TimeSpentInMinutes $VALUES[];
        public static final TimeSpentInMinutes ELVEN_TO_TWENTY_MINUTES;
        public static final TimeSpentInMinutes FOUR_TO_FIVE_MINUTES;
        public static final TimeSpentInMinutes MORE_THAN_SIXTY_MINUTES;
        public static final TimeSpentInMinutes SIX_TO_TEN_MINUTES;
        public static final TimeSpentInMinutes THIRTY_ONE_TO_SIXTY_MINUTES;
        public static final TimeSpentInMinutes TWENTY_ONE_TO_THIRTY_MINUTES;
        public static final TimeSpentInMinutes TWO_TO_THREE_MINUTES;
        public static final TimeSpentInMinutes ZERO_TO_ONE_MINUTE;
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
                        return TimeSpentInMinutes.lookup(long1.longValue());
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
            return LocalyticsBuckets.lookupFromBucketList(values(), l);
        }

        public static TimeSpentInMinutes valueOf(String s)
        {
            return (TimeSpentInMinutes)Enum.valueOf(com/weather/commons/analytics/LocalyticsBuckets$TimeSpentInMinutes, s);
        }

        public static TimeSpentInMinutes[] values()
        {
            return (TimeSpentInMinutes[])$VALUES.clone();
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
            ZERO_TO_ONE_MINUTE = new TimeSpentInMinutes("ZERO_TO_ONE_MINUTE", 0, "0-1 min", 0x8000000000000000L, 1L);
            TWO_TO_THREE_MINUTES = new TimeSpentInMinutes("TWO_TO_THREE_MINUTES", 1, "2-3 min", 2L, 3L);
            FOUR_TO_FIVE_MINUTES = new TimeSpentInMinutes("FOUR_TO_FIVE_MINUTES", 2, "4-5 min", 4L, 5L);
            SIX_TO_TEN_MINUTES = new TimeSpentInMinutes("SIX_TO_TEN_MINUTES", 3, "6-10 min", 6L, 10L);
            ELVEN_TO_TWENTY_MINUTES = new TimeSpentInMinutes("ELVEN_TO_TWENTY_MINUTES", 4, "11-20 min", 11L, 20L);
            TWENTY_ONE_TO_THIRTY_MINUTES = new TimeSpentInMinutes("TWENTY_ONE_TO_THIRTY_MINUTES", 5, "21-30 min", 21L, 30L);
            THIRTY_ONE_TO_SIXTY_MINUTES = new TimeSpentInMinutes("THIRTY_ONE_TO_SIXTY_MINUTES", 6, "31-60 min", 31L, 60L);
            MORE_THAN_SIXTY_MINUTES = new TimeSpentInMinutes("MORE_THAN_SIXTY_MINUTES", 7, "60 min+", 61L, 0x7fffffffffffffffL);
            $VALUES = (new TimeSpentInMinutes[] {
                ZERO_TO_ONE_MINUTE, TWO_TO_THREE_MINUTES, FOUR_TO_FIVE_MINUTES, SIX_TO_TEN_MINUTES, ELVEN_TO_TWENTY_MINUTES, TWENTY_ONE_TO_THIRTY_MINUTES, THIRTY_ONE_TO_SIXTY_MINUTES, MORE_THAN_SIXTY_MINUTES
            });
        }

        private TimeSpentInMinutes(String s, int i, String s1, long l, long l1)
        {
            super(s, i);
            timeSpent = s1;
            minTime = l;
            maxTime = l1;
        }
    }

    public static final class TimeSpentInSeconds extends Enum
        implements Bucket
    {

        private static final TimeSpentInSeconds $VALUES[];
        public static final TimeSpentInSeconds ABOVE_NINETY_SECONDS;
        public static final TimeSpentInSeconds ELEVEN_TO_THIRTY_SECONDS;
        public static final TimeSpentInSeconds FORTY_SIX_TO_SIXTY_SECONDS;
        public static final TimeSpentInSeconds SIXTY_ONE_TO_NINETY_SECONDS;
        public static final TimeSpentInSeconds SIX_TO_TEN_SECONDS;
        public static final TimeSpentInSeconds THIRTY_ONE_TO_FORTY_FIVE_SECONDS;
        public static final TimeSpentInSeconds TWO_TO_FIVE_SECONDS;
        public static final TimeSpentInSeconds ZERO_TO_ONE_SECOND;
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
                        return TimeSpentInSeconds.lookup(long1.longValue());
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
            return LocalyticsBuckets.lookupFromBucketList(values(), l);
        }

        public static TimeSpentInSeconds valueOf(String s)
        {
            return (TimeSpentInSeconds)Enum.valueOf(com/weather/commons/analytics/LocalyticsBuckets$TimeSpentInSeconds, s);
        }

        public static TimeSpentInSeconds[] values()
        {
            return (TimeSpentInSeconds[])$VALUES.clone();
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
            ZERO_TO_ONE_SECOND = new TimeSpentInSeconds("ZERO_TO_ONE_SECOND", 0, "0-1 sec", 0x8000000000000000L, 1L);
            TWO_TO_FIVE_SECONDS = new TimeSpentInSeconds("TWO_TO_FIVE_SECONDS", 1, "2-5 sec", 2L, 5L);
            SIX_TO_TEN_SECONDS = new TimeSpentInSeconds("SIX_TO_TEN_SECONDS", 2, "6-10 sec", 6L, 10L);
            ELEVEN_TO_THIRTY_SECONDS = new TimeSpentInSeconds("ELEVEN_TO_THIRTY_SECONDS", 3, "11-30 sec", 11L, 30L);
            THIRTY_ONE_TO_FORTY_FIVE_SECONDS = new TimeSpentInSeconds("THIRTY_ONE_TO_FORTY_FIVE_SECONDS", 4, "31-45 sec", 31L, 45L);
            FORTY_SIX_TO_SIXTY_SECONDS = new TimeSpentInSeconds("FORTY_SIX_TO_SIXTY_SECONDS", 5, "46-60 sec", 46L, 60L);
            SIXTY_ONE_TO_NINETY_SECONDS = new TimeSpentInSeconds("SIXTY_ONE_TO_NINETY_SECONDS", 6, "61-90 sec", 61L, 90L);
            ABOVE_NINETY_SECONDS = new TimeSpentInSeconds("ABOVE_NINETY_SECONDS", 7, "above 90 seconds", 91L, 0x7fffffffffffffffL);
            $VALUES = (new TimeSpentInSeconds[] {
                ZERO_TO_ONE_SECOND, TWO_TO_FIVE_SECONDS, SIX_TO_TEN_SECONDS, ELEVEN_TO_THIRTY_SECONDS, THIRTY_ONE_TO_FORTY_FIVE_SECONDS, FORTY_SIX_TO_SIXTY_SECONDS, SIXTY_ONE_TO_NINETY_SECONDS, ABOVE_NINETY_SECONDS
            });
        }

        private TimeSpentInSeconds(String s, int i, String s1, long l, long l1)
        {
            super(s, i);
            timeSpent = s1;
            minTime = l;
            maxTime = l1;
        }
    }


    public static final String MINUTES = "minutes";
    public static final String PERCENT = "percent";
    public static final String SECONDS = "seconds";
    public static final int TOTAL_PERCENT = 100;

    private LocalyticsBuckets()
    {
    }

    private static String lookupFromBucketList(Bucket abucket[], long l)
    {
        int j = abucket.length;
        for (int i = 0; i < j; i++)
        {
            Bucket bucket = abucket[i];
            if (bucket.contains(l))
            {
                return bucket.getBucketString();
            }
        }

        throw new IllegalArgumentException("Value not covered in any bucket");
    }

}
