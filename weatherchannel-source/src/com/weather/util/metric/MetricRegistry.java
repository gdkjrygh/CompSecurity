// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.weather.util.metric:
//            Metric, TimerMetric, MetricRegistryVisitor

public class MetricRegistry
{

    private static final MetricRegistry INSTANCE = new MetricRegistry();
    private final ConcurrentMap metrics = new ConcurrentHashMap();

    public MetricRegistry()
    {
    }

    public static MetricRegistry getInstance()
    {
        return INSTANCE;
    }

    public void clear()
    {
        metrics.clear();
    }

    public void registerMetric(Metric metric)
    {
        metric = (Metric)metrics.putIfAbsent(metric.getName(), metric);
        if (metric != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("A metric named ").append(metric.getName()).append(" already exists").toString());
        } else
        {
            return;
        }
    }

    public int size()
    {
        return metrics.size();
    }

    public TimerMetric timer(String s)
    {
        Metric metric = (Metric)metrics.get(s);
        if (metric == null)
        {
            s = new TimerMetric(s, "");
            registerMetric(s);
            return s;
        }
        if (metric instanceof TimerMetric)
        {
            return (TimerMetric)metric;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Another non-Timer metric exists with the same name ").append(s).toString());
        }
    }

    public void visit(MetricRegistryVisitor metricregistryvisitor)
    {
        TreeSet treeset = new TreeSet();
        Iterator iterator = metrics.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Metric metric = (Metric)iterator.next();
            if (metric instanceof TimerMetric)
            {
                treeset.add((TimerMetric)metric);
            }
        } while (true);
        metricregistryvisitor.visit(Collections.unmodifiableSortedSet(treeset));
    }

}
