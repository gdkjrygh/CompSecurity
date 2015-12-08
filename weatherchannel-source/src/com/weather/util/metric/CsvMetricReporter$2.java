// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;

import java.util.SortedSet;

// Referenced classes of package com.weather.util.metric:
//            MetricRegistryVisitor, CsvMetricReporter

class this._cls0
    implements MetricRegistryVisitor
{

    final CsvMetricReporter this$0;

    public void visit(SortedSet sortedset)
    {
        if (!sortedset.isEmpty())
        {
            CsvMetricReporter.access$000(CsvMetricReporter.this, sortedset);
        }
    }

    r()
    {
        this$0 = CsvMetricReporter.this;
        super();
    }
}
