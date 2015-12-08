// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.logs;

import com.weather.dal2.eventlog.batch.BatchedEventReport;
import com.weather.util.time.TimeProvider;

// Referenced classes of package com.weather.dal2.eventlog.logs:
//            EventLog, LogBatchedItem

static final class val.tr
    implements Runnable
{

    final String val$msg;
    final BatchedEventReport val$report;
    final String val$tag;
    final Throwable val$tr;

    public void run()
    {
        val$report.process(new LogBatchedItem(val$tag, val$msg, val$tr, EventLog.access$100().currentTimeMillis()));
    }

    ntReport(BatchedEventReport batchedeventreport, String s, String s1, Throwable throwable)
    {
        val$report = batchedeventreport;
        val$tag = s;
        val$msg = s1;
        val$tr = throwable;
        super();
    }
}
