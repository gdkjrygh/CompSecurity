// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl;

import ch.boye.httpclientandroidlib.HttpConnectionMetrics;
import ch.boye.httpclientandroidlib.io.HttpTransportMetrics;
import java.util.HashMap;
import java.util.Map;

public class HttpConnectionMetricsImpl
    implements HttpConnectionMetrics
{

    public static final String RECEIVED_BYTES_COUNT = "http.received-bytes-count";
    public static final String REQUEST_COUNT = "http.request-count";
    public static final String RESPONSE_COUNT = "http.response-count";
    public static final String SENT_BYTES_COUNT = "http.sent-bytes-count";
    private final HttpTransportMetrics inTransportMetric;
    private Map metricsCache;
    private final HttpTransportMetrics outTransportMetric;
    private long requestCount;
    private long responseCount;

    public HttpConnectionMetricsImpl(HttpTransportMetrics httptransportmetrics, HttpTransportMetrics httptransportmetrics1)
    {
        requestCount = 0L;
        responseCount = 0L;
        inTransportMetric = httptransportmetrics;
        outTransportMetric = httptransportmetrics1;
    }

    public Object getMetric(String s)
    {
        Object obj = null;
        if (metricsCache != null)
        {
            obj = metricsCache.get(s);
        }
        Object obj1 = obj;
        if (obj == null)
        {
            if ("http.request-count".equals(s))
            {
                obj1 = new Long(requestCount);
            } else
            {
                if ("http.response-count".equals(s))
                {
                    return new Long(responseCount);
                }
                if ("http.received-bytes-count".equals(s))
                {
                    if (inTransportMetric != null)
                    {
                        return new Long(inTransportMetric.getBytesTransferred());
                    } else
                    {
                        return null;
                    }
                }
                obj1 = obj;
                if ("http.sent-bytes-count".equals(s))
                {
                    if (outTransportMetric != null)
                    {
                        return new Long(outTransportMetric.getBytesTransferred());
                    } else
                    {
                        return null;
                    }
                }
            }
        }
        return obj1;
    }

    public long getReceivedBytesCount()
    {
        if (inTransportMetric != null)
        {
            return inTransportMetric.getBytesTransferred();
        } else
        {
            return -1L;
        }
    }

    public long getRequestCount()
    {
        return requestCount;
    }

    public long getResponseCount()
    {
        return responseCount;
    }

    public long getSentBytesCount()
    {
        if (outTransportMetric != null)
        {
            return outTransportMetric.getBytesTransferred();
        } else
        {
            return -1L;
        }
    }

    public void incrementRequestCount()
    {
        requestCount = requestCount + 1L;
    }

    public void incrementResponseCount()
    {
        responseCount = responseCount + 1L;
    }

    public void reset()
    {
        if (outTransportMetric != null)
        {
            outTransportMetric.reset();
        }
        if (inTransportMetric != null)
        {
            inTransportMetric.reset();
        }
        requestCount = 0L;
        responseCount = 0L;
        metricsCache = null;
    }

    public void setMetric(String s, Object obj)
    {
        if (metricsCache == null)
        {
            metricsCache = new HashMap();
        }
        metricsCache.put(s, obj);
    }
}
