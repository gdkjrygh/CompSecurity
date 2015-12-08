// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;

// Referenced classes of package com.weather.util.metric:
//            TwcWebServiceMetricReporter, MetricRegistry, MetricBuildInfo, MetricDeviceInfo

public static class deviceInfo
{

    String baseUrl;
    private final MetricBuildInfo buildInfo;
    private final MetricDeviceInfo deviceInfo;
    private Executor executor;
    private final MetricRegistry registry;

    public TwcWebServiceMetricReporter build()
    {
        boolean flag1 = true;
        boolean flag;
        if (registry != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "registry is a required parameter");
        if (executor != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "executor is a required parameter");
        if (buildInfo != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "buildInfo is a required parameter");
        if (deviceInfo != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "deviceInfo is a required parameter");
        return new TwcWebServiceMetricReporter(this);
    }

    public deviceInfo setBaseUrl(String s)
    {
        baseUrl = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public baseUrl setExecutor(Executor executor1)
    {
        executor = (Executor)Preconditions.checkNotNull(executor1);
        return this;
    }





    public A(MetricRegistry metricregistry, MetricBuildInfo metricbuildinfo, MetricDeviceInfo metricdeviceinfo)
    {
        baseUrl = "http://ec2-52-91-207-14.compute-1.amazonaws.com";
        registry = (MetricRegistry)Preconditions.checkNotNull(metricregistry);
        buildInfo = (MetricBuildInfo)Preconditions.checkNotNull(metricbuildinfo);
        deviceInfo = (MetricDeviceInfo)Preconditions.checkNotNull(metricdeviceinfo);
    }
}
