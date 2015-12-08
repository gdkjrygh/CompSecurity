// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.client.HttpClient;
import ch.boye.httpclientandroidlib.client.ResponseHandler;
import ch.boye.httpclientandroidlib.client.ServiceUnavailableRetryStrategy;
import ch.boye.httpclientandroidlib.client.methods.HttpUriRequest;
import ch.boye.httpclientandroidlib.conn.ClientConnectionManager;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            DefaultHttpClient, DefaultServiceUnavailableRetryStrategy

public class AutoRetryHttpClient
    implements HttpClient
{

    private final HttpClient backend;
    public HttpClientAndroidLog log;
    private final ServiceUnavailableRetryStrategy retryStrategy;

    public AutoRetryHttpClient()
    {
        this(((HttpClient) (new DefaultHttpClient())), ((ServiceUnavailableRetryStrategy) (new DefaultServiceUnavailableRetryStrategy())));
    }

    public AutoRetryHttpClient(HttpClient httpclient)
    {
        this(httpclient, ((ServiceUnavailableRetryStrategy) (new DefaultServiceUnavailableRetryStrategy())));
    }

    public AutoRetryHttpClient(HttpClient httpclient, ServiceUnavailableRetryStrategy serviceunavailableretrystrategy)
    {
        log = new HttpClientAndroidLog(getClass());
        if (httpclient == null)
        {
            throw new IllegalArgumentException("HttpClient may not be null");
        }
        if (serviceunavailableretrystrategy == null)
        {
            throw new IllegalArgumentException("ServiceUnavailableRetryStrategy may not be null");
        } else
        {
            backend = httpclient;
            retryStrategy = serviceunavailableretrystrategy;
            return;
        }
    }

    public AutoRetryHttpClient(ServiceUnavailableRetryStrategy serviceunavailableretrystrategy)
    {
        this(((HttpClient) (new DefaultHttpClient())), serviceunavailableretrystrategy);
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
        throws IOException
    {
        return execute(httphost, httprequest, ((HttpContext) (null)));
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
        throws IOException
    {
        int i = 1;
        do
        {
            HttpResponse httpresponse = backend.execute(httphost, httprequest, httpcontext);
            if (retryStrategy.retryRequest(httpresponse, i, httpcontext))
            {
                long l = retryStrategy.getRetryInterval();
                try
                {
                    log.trace((new StringBuilder()).append("Wait for ").append(l).toString());
                    Thread.sleep(l);
                }
                // Misplaced declaration of an exception variable
                catch (HttpHost httphost)
                {
                    throw new InterruptedIOException(httphost.getMessage());
                }
                i++;
            } else
            {
                return httpresponse;
            }
        } while (true);
    }

    public HttpResponse execute(HttpUriRequest httpurirequest)
        throws IOException
    {
        return execute(httpurirequest, ((HttpContext) (null)));
    }

    public HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
        throws IOException
    {
        URI uri = httpurirequest.getURI();
        return execute(new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme()), ((HttpRequest) (httpurirequest)), httpcontext);
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
        throws IOException
    {
        return execute(httphost, httprequest, responsehandler, null);
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
        throws IOException
    {
        return responsehandler.handleResponse(execute(httphost, httprequest, httpcontext));
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
        throws IOException
    {
        return execute(httpurirequest, responsehandler, ((HttpContext) (null)));
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
        throws IOException
    {
        return responsehandler.handleResponse(execute(httpurirequest, httpcontext));
    }

    public ClientConnectionManager getConnectionManager()
    {
        return backend.getConnectionManager();
    }

    public HttpParams getParams()
    {
        return backend.getParams();
    }
}
