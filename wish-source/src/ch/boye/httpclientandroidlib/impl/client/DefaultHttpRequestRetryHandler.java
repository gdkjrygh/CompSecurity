// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.HttpEntityEnclosingRequest;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.client.HttpRequestRetryHandler;
import ch.boye.httpclientandroidlib.client.methods.HttpUriRequest;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            RequestWrapper

public class DefaultHttpRequestRetryHandler
    implements HttpRequestRetryHandler
{

    private final boolean requestSentRetryEnabled;
    private final int retryCount;

    public DefaultHttpRequestRetryHandler()
    {
        this(3, false);
    }

    public DefaultHttpRequestRetryHandler(int i, boolean flag)
    {
        retryCount = i;
        requestSentRetryEnabled = flag;
    }

    public int getRetryCount()
    {
        return retryCount;
    }

    protected boolean handleAsIdempotent(HttpRequest httprequest)
    {
        return !(httprequest instanceof HttpEntityEnclosingRequest);
    }

    public boolean isRequestSentRetryEnabled()
    {
        return requestSentRetryEnabled;
    }

    protected boolean requestIsAborted(HttpRequest httprequest)
    {
        HttpRequest httprequest1 = httprequest;
        if (httprequest instanceof RequestWrapper)
        {
            httprequest1 = ((RequestWrapper)httprequest).getOriginal();
        }
        return (httprequest1 instanceof HttpUriRequest) && ((HttpUriRequest)httprequest1).isAborted();
    }

    public boolean retryRequest(IOException ioexception, int i, HttpContext httpcontext)
    {
        if (ioexception == null)
        {
            throw new IllegalArgumentException("Exception parameter may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        break MISSING_BLOCK_LABEL_28;
        if (i <= retryCount && !(ioexception instanceof InterruptedIOException) && !(ioexception instanceof UnknownHostException) && !(ioexception instanceof ConnectException) && !(ioexception instanceof SSLException))
        {
            ioexception = (HttpRequest)httpcontext.getAttribute("http.request");
            if (!requestIsAborted(ioexception))
            {
                if (handleAsIdempotent(ioexception))
                {
                    return true;
                }
                ioexception = (Boolean)httpcontext.getAttribute("http.request_sent");
                if (ioexception != null && ioexception.booleanValue())
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i == 0 || requestSentRetryEnabled)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
