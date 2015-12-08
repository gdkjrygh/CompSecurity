// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;

import com.weather.util.TwcPreconditions;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.concurrent.Executor;

// Referenced classes of package com.weather.util.metric:
//            MetricRegistry, LogcatMetricReporter, MetricReporter, MetricBuildInfo, 
//            MetricDeviceInfo

public final class MetricReporterFactory
{

    private static MetricReporter metricReporter;

    private MetricReporterFactory()
    {
    }

    public static MetricReporter getReporter(Executor executor, MetricBuildInfo metricbuildinfo, MetricDeviceInfo metricdeviceinfo)
    {
        return getReporter(executor, metricbuildinfo, metricdeviceinfo, false);
    }

    public static MetricReporter getReporter(Executor executor, MetricBuildInfo metricbuildinfo, MetricDeviceInfo metricdeviceinfo, boolean flag)
    {
        TwcPreconditions.checkOnMainThread();
        if (metricReporter == null || flag)
        {
            if (LogUtil.isLoggable(LoggingMetaTags.TWC_METRICS_REPORTER_MIN_REP_WEBSERVICE, 2))
            {
                metricReporter = (new TwcWebServiceMetricReporter.Builder(MetricRegistry.getInstance(), metricbuildinfo, metricdeviceinfo)).setExecutor(executor).build();
            } else
            {
                metricReporter = new LogcatMetricReporter(MetricRegistry.getInstance());
            }
        }
        return metricReporter;
    }
}
