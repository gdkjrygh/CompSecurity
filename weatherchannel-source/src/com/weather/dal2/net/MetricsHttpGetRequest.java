// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.net;

import com.google.common.base.Preconditions;
import com.weather.dal2.exceptions.DalException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.metric.MetricRegistry;
import com.weather.util.metric.TimerMetric;

// Referenced classes of package com.weather.dal2.net:
//            HttpGetRequest, Receiver

public class MetricsHttpGetRequest
    implements HttpGetRequest
{

    private static final String TAG = com/weather/dal2/net/MetricsHttpGetRequest.getName();
    private final MetricRegistry registry;
    private final HttpGetRequest request;
    private final com.weather.util.metric.Metric.MetricTag requestTimeMetricTag;

    public MetricsHttpGetRequest(HttpGetRequest httpgetrequest, com.weather.util.metric.Metric.MetricTag metrictag)
    {
        this(httpgetrequest, metrictag, MetricRegistry.getInstance());
    }

    public MetricsHttpGetRequest(HttpGetRequest httpgetrequest, com.weather.util.metric.Metric.MetricTag metrictag, MetricRegistry metricregistry)
    {
        registry = (MetricRegistry)Preconditions.checkNotNull(metricregistry);
        requestTimeMetricTag = (com.weather.util.metric.Metric.MetricTag)Preconditions.checkNotNull(metrictag);
        request = (HttpGetRequest)Preconditions.checkNotNull(httpgetrequest);
    }

    public void asyncFetch(String s, boolean flag, Object obj, Receiver receiver)
    {
        request.asyncFetch(s, flag, obj, receiver);
    }

    public String fetch(String s, boolean flag)
        throws DalException
    {
        TimerMetric timermetric = null;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        TimerMetric timermetric1;
        try
        {
            timermetric1 = registry.timer(requestTimeMetricTag.getMetricName()).reset().start();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (timermetric != null)
            {
                timermetric.reset();
            }
            throw s;
        }
        timermetric = timermetric1;
        LogUtil.d(TAG, LoggingMetaTags.TWC_METRICS, (new StringBuilder()).append("timing data request : ").append(requestTimeMetricTag).toString(), new Object[0]);
        timermetric = timermetric1;
        s = request.fetch(s, flag);
        timermetric = timermetric1;
        timermetric1.stop();
        return s;
        s = request.fetch(s, flag);
        return s;
    }

    public String fetchGoogleTWCUserAgentRequest(String s)
        throws DalException
    {
        return request.fetchGoogleTWCUserAgentRequest(s);
    }

    public int getContentLength()
    {
        return request.getContentLength();
    }

}
