// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.logs;

import com.weather.dal2.eventlog.batch.BatchedEventReport;
import com.weather.util.time.TimeProvider;
import java.util.concurrent.TimeUnit;

public class WarningLogsBatchedEventReport extends BatchedEventReport
{

    static final String ARRAY_TAG = "warnings";
    static final String EVENT_TYPE = "AndroidWarningLogV2";
    private static final WarningLogsBatchedEventReport INSTANCE = new WarningLogsBatchedEventReport();
    static final long REPORTING_PERIOD;
    static final int VERSION = 2;

    private WarningLogsBatchedEventReport()
    {
        super(REPORTING_PERIOD, "warnings", "AndroidWarningLogV2", 2, new LogBatchedItem.LogBatchedItemFactory());
    }

    WarningLogsBatchedEventReport(TimeProvider timeprovider)
    {
        super(REPORTING_PERIOD, "warnings", "AndroidWarningLogV2", 2, new LogBatchedItem.LogBatchedItemFactory(), timeprovider);
    }

    public static WarningLogsBatchedEventReport getInstance()
    {
        return INSTANCE;
    }

    static 
    {
        REPORTING_PERIOD = TimeUnit.DAYS.toMillis(1L);
    }
}
