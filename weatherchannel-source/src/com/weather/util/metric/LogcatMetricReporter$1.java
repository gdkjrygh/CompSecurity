// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;

import java.util.Iterator;
import java.util.SortedSet;

// Referenced classes of package com.weather.util.metric:
//            MetricRegistryVisitor, LogcatMetricReporter, TimerMetric

class val.stringBuilder
    implements MetricRegistryVisitor
{

    final LogcatMetricReporter this$0;
    final StringBuilder val$stringBuilder;

    public void visit(SortedSet sortedset)
    {
        if (!sortedset.isEmpty())
        {
            LogcatMetricReporter.access$000(LogcatMetricReporter.this, val$stringBuilder, "TIMERS");
            TimerMetric timermetric;
            for (sortedset = sortedset.iterator(); sortedset.hasNext(); LogcatMetricReporter.access$100(LogcatMetricReporter.this, timermetric, val$stringBuilder))
            {
                timermetric = (TimerMetric)sortedset.next();
            }

        }
    }

    ()
    {
        this$0 = final_logcatmetricreporter;
        val$stringBuilder = StringBuilder.this;
        super();
    }
}
