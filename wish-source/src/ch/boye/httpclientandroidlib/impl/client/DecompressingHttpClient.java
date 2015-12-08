// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.HttpEntityEnclosingRequest;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpRequestInterceptor;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpResponseInterceptor;
import ch.boye.httpclientandroidlib.client.ClientProtocolException;
import ch.boye.httpclientandroidlib.client.HttpClient;
import ch.boye.httpclientandroidlib.client.ResponseHandler;
import ch.boye.httpclientandroidlib.client.methods.HttpUriRequest;
import ch.boye.httpclientandroidlib.client.protocol.RequestAcceptEncoding;
import ch.boye.httpclientandroidlib.client.protocol.ResponseContentEncoding;
import ch.boye.httpclientandroidlib.client.utils.URIUtils;
import ch.boye.httpclientandroidlib.conn.ClientConnectionManager;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.protocol.BasicHttpContext;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import ch.boye.httpclientandroidlib.util.EntityUtils;
import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            EntityEnclosingRequestWrapper, RequestWrapper

public class DecompressingHttpClient
    implements HttpClient
{

    private HttpRequestInterceptor acceptEncodingInterceptor;
    private HttpClient backend;
    private HttpResponseInterceptor contentEncodingInterceptor;

    public DecompressingHttpClient(HttpClient httpclient)
    {
        this(httpclient, ((HttpRequestInterceptor) (new RequestAcceptEncoding())), ((HttpResponseInterceptor) (new ResponseContentEncoding())));
    }

    DecompressingHttpClient(HttpClient httpclient, HttpRequestInterceptor httprequestinterceptor, HttpResponseInterceptor httpresponseinterceptor)
    {
        backend = httpclient;
        acceptEncodingInterceptor = httprequestinterceptor;
        contentEncodingInterceptor = httpresponseinterceptor;
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
        throws IOException, ClientProtocolException
    {
        return execute(httphost, httprequest, (HttpContext)null);
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
        throws IOException, ClientProtocolException
    {
        Object obj;
        obj = httpcontext;
        if (httpcontext != null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        obj = new BasicHttpContext();
        if (!(httprequest instanceof HttpEntityEnclosingRequest))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        httprequest = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest)httprequest);
_L1:
        acceptEncodingInterceptor.process(httprequest, ((HttpContext) (obj)));
        httphost = backend.execute(httphost, httprequest, ((HttpContext) (obj)));
        contentEncodingInterceptor.process(httphost, ((HttpContext) (obj)));
        if (!Boolean.TRUE.equals(((HttpContext) (obj)).getAttribute("http.client.response.uncompressed")))
        {
            break MISSING_BLOCK_LABEL_139;
        }
        httphost.removeHeaders("Content-Length");
        httphost.removeHeaders("Content-Encoding");
        httphost.removeHeaders("Content-MD5");
        return httphost;
        try
        {
            httprequest = new RequestWrapper(httprequest);
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost)
        {
            throw new ClientProtocolException(httphost);
        }
          goto _L1
        return httphost;
    }

    public HttpResponse execute(HttpUriRequest httpurirequest)
        throws IOException, ClientProtocolException
    {
        return execute(getHttpHost(httpurirequest), ((HttpRequest) (httpurirequest)), (HttpContext)null);
    }

    public HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
        throws IOException, ClientProtocolException
    {
        return execute(getHttpHost(httpurirequest), ((HttpRequest) (httpurirequest)), httpcontext);
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
        throws IOException, ClientProtocolException
    {
        return execute(httphost, httprequest, responsehandler, null);
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
        throws IOException, ClientProtocolException
    {
        httphost = execute(httphost, httprequest, httpcontext);
        httprequest = ((HttpRequest) (responsehandler.handleResponse(httphost)));
        httphost = httphost.getEntity();
        if (httphost != null)
        {
            EntityUtils.consume(httphost);
        }
        return httprequest;
        httprequest;
        httphost = httphost.getEntity();
        if (httphost != null)
        {
            EntityUtils.consume(httphost);
        }
        throw httprequest;
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
        throws IOException, ClientProtocolException
    {
        return execute(getHttpHost(httpurirequest), ((HttpRequest) (httpurirequest)), responsehandler);
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
        throws IOException, ClientProtocolException
    {
        return execute(getHttpHost(httpurirequest), ((HttpRequest) (httpurirequest)), responsehandler, httpcontext);
    }

    public ClientConnectionManager getConnectionManager()
    {
        return backend.getConnectionManager();
    }

    HttpHost getHttpHost(HttpUriRequest httpurirequest)
    {
        return URIUtils.extractHost(httpurirequest.getURI());
    }

    public HttpParams getParams()
    {
        return backend.getParams();
    }
}
