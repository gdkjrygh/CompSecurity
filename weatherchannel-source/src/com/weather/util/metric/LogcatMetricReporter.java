// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;

import com.google.common.base.Preconditions;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.time.SystemTimeProvider;
import com.weather.util.time.TimeProvider;
import java.util.Date;
import java.util.Iterator;
import java.util.SortedSet;

// Referenced classes of package com.weather.util.metric:
//            MetricReporter, MetricRegistry, TimerMetric, MetricRegistryVisitor

public class LogcatMetricReporter
    implements MetricReporter
{

    private static final String REPORT_TITLE = "PERFORMANCE REPORT";
    private static final String REPORT_TITLE_DIVIDER = "##################################################################";
    private static final String SECTION_TITLE_DIVIDER = "------------------------------------------------------------------";
    private static final String TAG = com/weather/util/metric/LogcatMetricReporter.getName();
    private static final String TIMER_SECTION_TITLE = "TIMERS";
    private final MetricRegistry registry;
    private final TimeProvider timeProvider;

    public LogcatMetricReporter(MetricRegistry metricregistry)
    {
        this(metricregistry, ((TimeProvider) (new SystemTimeProvider())));
    }

    public LogcatMetricReporter(MetricRegistry metricregistry, TimeProvider timeprovider)
    {
        registry = (MetricRegistry)Preconditions.checkNotNull(metricregistry);
        timeProvider = (TimeProvider)Preconditions.checkNotNull(timeprovider);
    }

    private void appendReportHeader(StringBuilder stringbuilder)
    {
        stringbuilder.append("\n\n").append("##################################################################").append('\n').append("PERFORMANCE REPORT").append('\n').append(new Date(timeProvider.currentTimeMillis())).append('\n').append("##################################################################").append("\n\n");
    }

    private void appendSectionHeader(StringBuilder stringbuilder, String s)
    {
        stringbuilder.append("------------------------------------------------------------------").append('\n').append(s).append('\n').append("------------------------------------------------------------------").append('\n');
    }

    private void appendTimerDetails(TimerMetric timermetric, StringBuilder stringbuilder)
    {
        if (timermetric.hasFinished())
        {
            stringbuilder.append(timermetric.getName()).append(" - ").append("Start Time: ").append(timermetric.getInitialStartTime()).append(", Elapsed Time ").append(timermetric.getElapsedTime()).append('\n');
        }
    }

    public void report()
    {
        final StringBuilder stringBuilder = new StringBuilder();
        appendReportHeader(stringBuilder);
        registry.visit(new MetricRegistryVisitor() {

            final LogcatMetricReporter this$0;
            final StringBuilder val$stringBuilder;

            public void visit(SortedSet sortedset)
            {
                if (!sortedset.isEmpty())
                {
                    appendSectionHeader(stringBuilder, "TIMERS");
                    TimerMetric timermetric;
                    for (sortedset = sortedset.iterator(); sortedset.hasNext(); appendTimerDetails(timermetric, stringBuilder))
                    {
                        timermetric = (TimerMetric)sortedset.next();
                    }

                }
            }

            
            {
                this$0 = LogcatMetricReporter.this;
                stringBuilder = stringbuilder;
                super();
            }
        });
        LogUtil.d(TAG, LoggingMetaTags.TWC_METRICS, stringBuilder.toString(), new Object[0]);
    }



}
