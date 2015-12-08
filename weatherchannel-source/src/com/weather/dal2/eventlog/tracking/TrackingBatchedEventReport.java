// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.tracking;

import com.weather.dal2.eventlog.batch.LocationUpdateBatchedEventReport;

public class TrackingBatchedEventReport extends LocationUpdateBatchedEventReport
{

    public static final String ARRAY_TAG = "eventData";
    public static final String EVENT_TYPE = "LocationUpdate";
    public static final int VERSION = 3;
    static final TrackingBatchedEventReport report = new TrackingBatchedEventReport();

    private TrackingBatchedEventReport()
    {
        super("eventData", "LocationUpdate", 3);
    }

    public static TrackingBatchedEventReport getInstance()
    {
        return report;
    }

}
