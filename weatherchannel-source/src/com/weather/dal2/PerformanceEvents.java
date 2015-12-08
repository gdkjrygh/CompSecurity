// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2;


public final class PerformanceEvents extends Enum
{
    public static class WeatherDataPerformanceEvent
    {

        public final long attributeValue;
        public final PerformanceEvents event;

        public WeatherDataPerformanceEvent(PerformanceEvents performanceevents, long l)
        {
            event = performanceevents;
            attributeValue = l;
        }
    }


    private static final PerformanceEvents $VALUES[];
    public static final PerformanceEvents LAUNCH_STARTED;
    public static final PerformanceEvents WX_DATA_PARSING_TIME;
    public static final PerformanceEvents WX_DATA_REQUEST_TIME;
    public static final PerformanceEvents WX_DATA_SIZE_BYTES;
    private final String event;

    private PerformanceEvents(String s, int i, String s1)
    {
        super(s, i);
        event = s1;
    }

    public static PerformanceEvents valueOf(String s)
    {
        return (PerformanceEvents)Enum.valueOf(com/weather/dal2/PerformanceEvents, s);
    }

    public static PerformanceEvents[] values()
    {
        return (PerformanceEvents[])$VALUES.clone();
    }

    public String getEvent()
    {
        return event;
    }

    static 
    {
        LAUNCH_STARTED = new PerformanceEvents("LAUNCH_STARTED", 0, "launch time");
        WX_DATA_REQUEST_TIME = new PerformanceEvents("WX_DATA_REQUEST_TIME", 1, "wx data request time");
        WX_DATA_PARSING_TIME = new PerformanceEvents("WX_DATA_PARSING_TIME", 2, "wx data parsing time");
        WX_DATA_SIZE_BYTES = new PerformanceEvents("WX_DATA_SIZE_BYTES", 3, "wx data size(bytes)");
        $VALUES = (new PerformanceEvents[] {
            LAUNCH_STARTED, WX_DATA_REQUEST_TIME, WX_DATA_PARSING_TIME, WX_DATA_SIZE_BYTES
        });
    }
}
