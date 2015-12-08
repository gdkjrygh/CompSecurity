// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;

import java.util.SortedSet;

// Referenced classes of package com.weather.util.metric:
//            MetricRegistryVisitor, TwcWebServiceMetricReporter

class this._cls0
    implements MetricRegistryVisitor
{

    final TwcWebServiceMetricReporter this$0;

    public void visit(SortedSet sortedset)
    {
        timers.addAll(sortedset);
    }

    ()
    {
        this$0 = TwcWebServiceMetricReporter.this;
        super();
    }
}
