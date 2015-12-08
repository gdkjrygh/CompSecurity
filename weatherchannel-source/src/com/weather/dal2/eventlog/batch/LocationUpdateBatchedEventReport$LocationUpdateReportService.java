// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.batch;

import android.app.IntentService;
import android.content.Intent;
import com.weather.dal2.eventlog.post.DsxLog;
import com.weather.dal2.eventlog.tracking.TrackingBatchedEventReport;
import com.weather.util.log.LogUtil;

// Referenced classes of package com.weather.dal2.eventlog.batch:
//            LocationUpdateBatchedEventReport

public static class locationUpdateBatchedEventReport extends IntentService
{

    private static final String TAG = "LocationUpdateReportService";
    private final DsxLog dsxLog;
    private final LocationUpdateBatchedEventReport locationUpdateBatchedEventReport;

    protected void onHandleIntent(Intent intent)
    {
        LogUtil.logToFile("Alarm Service Started");
        locationUpdateBatchedEventReport.send(dsxLog);
    }

    public ()
    {
        this("LocationUpdateReportService", new DsxLog(), ((LocationUpdateBatchedEventReport) (TrackingBatchedEventReport.getInstance())));
    }

    <init>(String s, DsxLog dsxlog, LocationUpdateBatchedEventReport locationupdatebatchedeventreport)
    {
        super(s);
        dsxLog = dsxlog;
        locationUpdateBatchedEventReport = locationupdatebatchedeventreport;
    }
}
