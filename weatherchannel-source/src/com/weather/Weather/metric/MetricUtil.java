// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.metric;

import com.google.common.base.Preconditions;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.util.metric.MetricRegistry;
import com.weather.util.metric.TimerMetric;
import java.util.concurrent.atomic.AtomicBoolean;

public final class MetricUtil
{

    private static final AtomicBoolean appLaunchMetricsRecorded = new AtomicBoolean();

    private MetricUtil()
    {
    }

    public static boolean getAppLaunchMetricsRecorderded()
    {
        return appLaunchMetricsRecorded.get();
    }

    public static void recordAppLaunchMetrics(MetricRegistry metricregistry, CurrentWeatherFacade currentweatherfacade)
    {
        if (appLaunchMetricsRecorded.get()) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.com.weather.dal2.dsx.RecordSets.RecordSetsSource[currentweatherfacade.getRecordSetsSource().ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 57
    //                   2 88
    //                   3 105;
           goto _L3 _L4 _L5 _L6
_L3:
        appLaunchMetricsRecorded.getAndSet(true);
_L2:
        return;
_L4:
        metricregistry.timer(com.weather.util.metric.Metric.MetricTag.TIMER_COLDAPPLAUNCH_NETWORK.getMetricName()).stop();
        metricregistry.timer(com.weather.util.metric.Metric.MetricTag.TIMER_APPLAUNCH_NETWORK.getMetricName()).stop();
        continue; /* Loop/switch isn't completed */
_L5:
        metricregistry.timer(com.weather.util.metric.Metric.MetricTag.TIMER_APPLAUNCH_MEMCACHE.getMetricName()).stop();
        continue; /* Loop/switch isn't completed */
_L6:
        metricregistry.timer(com.weather.util.metric.Metric.MetricTag.TIMER_COLDAPPLAUNCH_DISKCACHE.getMetricName()).stop();
        metricregistry.timer(com.weather.util.metric.Metric.MetricTag.TIMER_APPLAUNCH_DISKCACHE.getMetricName()).stop();
        if (true) goto _L3; else goto _L7
_L7:
    }

    public static void resetMetrics(MetricRegistry metricregistry)
    {
        Preconditions.checkNotNull(metricregistry);
        metricregistry.clear();
        setAppLaunchMetricsRecorded(false);
    }

    public static void setAppLaunchMetricsRecorded(boolean flag)
    {
        appLaunchMetricsRecorded.getAndSet(flag);
    }


    /* member class not found */
    class _cls1 {}

}
