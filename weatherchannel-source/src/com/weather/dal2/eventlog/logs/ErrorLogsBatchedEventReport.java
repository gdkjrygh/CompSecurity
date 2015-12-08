// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.logs;

import com.weather.dal2.eventlog.batch.BatchedEventReport;
import java.util.concurrent.TimeUnit;

public class ErrorLogsBatchedEventReport extends BatchedEventReport
{

    static final String ARRAY_TAG = "errors";
    static final String EVENT_TYPE = "AndroidErrorLogV2";
    static final long REPORTING_PERIOD;
    static final int VERSION = 2;
    private static final ErrorLogsBatchedEventReport report = new ErrorLogsBatchedEventReport();

    private ErrorLogsBatchedEventReport()
    {
        super(REPORTING_PERIOD, "errors", "AndroidErrorLogV2", 2, new LogBatchedItem.LogBatchedItemFactory());
    }

    public static ErrorLogsBatchedEventReport getInstance()
    {
        return report;
    }

    static 
    {
        REPORTING_PERIOD = TimeUnit.DAYS.toMillis(1L);
    }
}
