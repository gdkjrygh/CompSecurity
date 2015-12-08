// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;

import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;

// Referenced classes of package com.weather.util.metric:
//            CsvMetricReporter, TimerMetric, CsvFileLineWriter

class val.file
    implements Runnable
{

    final CsvMetricReporter this$0;
    final File val$file;
    final TimerMetric val$timerMetric;

    public void run()
    {
        if (!val$timerMetric.hasStarted()) goto _L2; else goto _L1
_L1:
        String s = CsvMetricReporter.access$100(CsvMetricReporter.this).format(val$timerMetric.getInitialStartTime());
_L5:
        if (!val$timerMetric.hasStarted() || val$timerMetric.isRunning()) goto _L4; else goto _L3
_L3:
        long l = val$timerMetric.getElapsedTime();
_L6:
        CsvMetricReporter.access$200(CsvMetricReporter.this).writeMetricsToFile(val$file, "name, start,elapsed", "%s, %s,%d%n", new Object[] {
            val$timerMetric.getName(), s, Long.valueOf(l)
        });
        return;
_L2:
        s = "";
          goto _L5
_L4:
        l = 0L;
          goto _L6
        IOException ioexception;
        ioexception;
        LogUtil.w(CsvMetricReporter.access$300(), LoggingMetaTags.TWC_METRICS, (new StringBuilder()).append("Could not create ").append(val$file).append(" due to : ").append(ioexception.getMessage()).toString(), new Object[0]);
        return;
          goto _L5
    }

    ()
    {
        this$0 = final_csvmetricreporter;
        val$timerMetric = timermetric;
        val$file = File.this;
        super();
    }
}
