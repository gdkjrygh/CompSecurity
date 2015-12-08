// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;

import android.content.Context;

// Referenced classes of package com.weather.util.metric:
//            TwcWebServiceMetricReporter

class val.setTrafficStats
    implements Runnable
{

    final TwcWebServiceMetricReporter this$0;
    final Context val$context;
    final boolean val$setTrafficStats;

    public void run()
    {
        sendMetrics(val$context, val$setTrafficStats);
    }

    ()
    {
        this$0 = final_twcwebservicemetricreporter;
        val$context = context1;
        val$setTrafficStats = Z.this;
        super();
    }
}
