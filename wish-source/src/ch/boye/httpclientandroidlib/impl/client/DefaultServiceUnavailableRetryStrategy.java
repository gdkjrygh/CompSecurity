// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.client.ServiceUnavailableRetryStrategy;
import ch.boye.httpclientandroidlib.protocol.HttpContext;

public class DefaultServiceUnavailableRetryStrategy
    implements ServiceUnavailableRetryStrategy
{

    private final int maxRetries;
    private final long retryInterval;

    public DefaultServiceUnavailableRetryStrategy()
    {
        this(1, 1000);
    }

    public DefaultServiceUnavailableRetryStrategy(int i, int j)
    {
        if (i < 1)
        {
            throw new IllegalArgumentException("MaxRetries must be greater than 1");
        }
        if (j < 1)
        {
            throw new IllegalArgumentException("Retry interval must be greater than 1");
        } else
        {
            maxRetries = i;
            retryInterval = j;
            return;
        }
    }

    public long getRetryInterval()
    {
        return retryInterval;
    }

    public boolean retryRequest(HttpResponse httpresponse, int i, HttpContext httpcontext)
    {
        return i <= maxRetries && httpresponse.getStatusLine().getStatusCode() == 503;
    }
}
