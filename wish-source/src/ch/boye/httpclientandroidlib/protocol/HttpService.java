// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.protocol;

import ch.boye.httpclientandroidlib.ConnectionReuseStrategy;
import ch.boye.httpclientandroidlib.HttpEntityEnclosingRequest;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpResponseFactory;
import ch.boye.httpclientandroidlib.HttpServerConnection;
import ch.boye.httpclientandroidlib.HttpVersion;
import ch.boye.httpclientandroidlib.MethodNotSupportedException;
import ch.boye.httpclientandroidlib.ProtocolException;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.UnsupportedHttpVersionException;
import ch.boye.httpclientandroidlib.entity.ByteArrayEntity;
import ch.boye.httpclientandroidlib.params.DefaultedHttpParams;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.util.EncodingUtils;
import ch.boye.httpclientandroidlib.util.EntityUtils;
import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib.protocol:
//            HttpRequestHandlerResolver, HttpRequestHandler, HttpContext, HttpExpectationVerifier, 
//            HttpProcessor

public class HttpService
{

    private volatile ConnectionReuseStrategy connStrategy;
    private volatile HttpExpectationVerifier expectationVerifier;
    private volatile HttpRequestHandlerResolver handlerResolver;
    private volatile HttpParams params;
    private volatile HttpProcessor processor;
    private volatile HttpResponseFactory responseFactory;

    public HttpService(HttpProcessor httpprocessor, ConnectionReuseStrategy connectionreusestrategy, HttpResponseFactory httpresponsefactory)
    {
        params = null;
        processor = null;
        handlerResolver = null;
        connStrategy = null;
        responseFactory = null;
        expectationVerifier = null;
        setHttpProcessor(httpprocessor);
        setConnReuseStrategy(connectionreusestrategy);
        setResponseFactory(httpresponsefactory);
    }

    public HttpService(HttpProcessor httpprocessor, ConnectionReuseStrategy connectionreusestrategy, HttpResponseFactory httpresponsefactory, HttpRequestHandlerResolver httprequesthandlerresolver, HttpParams httpparams)
    {
        this(httpprocessor, connectionreusestrategy, httpresponsefactory, httprequesthandlerresolver, null, httpparams);
    }

    public HttpService(HttpProcessor httpprocessor, ConnectionReuseStrategy connectionreusestrategy, HttpResponseFactory httpresponsefactory, HttpRequestHandlerResolver httprequesthandlerresolver, HttpExpectationVerifier httpexpectationverifier, HttpParams httpparams)
    {
        params = null;
        processor = null;
        handlerResolver = null;
        connStrategy = null;
        responseFactory = null;
        expectationVerifier = null;
        if (httpprocessor == null)
        {
            throw new IllegalArgumentException("HTTP processor may not be null");
        }
        if (connectionreusestrategy == null)
        {
            throw new IllegalArgumentException("Connection reuse strategy may not be null");
        }
        if (httpresponsefactory == null)
        {
            throw new IllegalArgumentException("Response factory may not be null");
        }
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            processor = httpprocessor;
            connStrategy = connectionreusestrategy;
            responseFactory = httpresponsefactory;
            handlerResolver = httprequesthandlerresolver;
            expectationVerifier = httpexpectationverifier;
            params = httpparams;
            return;
        }
    }

    protected void doService(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
        throws HttpException, IOException
    {
        Object obj = null;
        if (handlerResolver != null)
        {
            obj = httprequest.getRequestLine().getUri();
            obj = handlerResolver.lookup(((String) (obj)));
        }
        if (obj != null)
        {
            ((HttpRequestHandler) (obj)).handle(httprequest, httpresponse, httpcontext);
            return;
        } else
        {
            httpresponse.setStatusCode(501);
            return;
        }
    }

    public HttpParams getParams()
    {
        return params;
    }

    protected void handleException(HttpException httpexception, HttpResponse httpresponse)
    {
        String s;
        String s1;
        if (httpexception instanceof MethodNotSupportedException)
        {
            httpresponse.setStatusCode(501);
        } else
        if (httpexception instanceof UnsupportedHttpVersionException)
        {
            httpresponse.setStatusCode(505);
        } else
        if (httpexception instanceof ProtocolException)
        {
            httpresponse.setStatusCode(400);
        } else
        {
            httpresponse.setStatusCode(500);
        }
        s1 = httpexception.getMessage();
        s = s1;
        if (s1 == null)
        {
            s = httpexception.toString();
        }
        httpexception = new ByteArrayEntity(EncodingUtils.getAsciiBytes(s));
        httpexception.setContentType("text/plain; charset=US-ASCII");
        httpresponse.setEntity(httpexception);
    }

    public void handleRequest(HttpServerConnection httpserverconnection, HttpContext httpcontext)
        throws IOException, HttpException
    {
        Object obj1;
        httpcontext.setAttribute("http.connection", httpserverconnection);
        obj1 = null;
        HttpRequest httprequest;
        httprequest = httpserverconnection.receiveRequestHeader();
        httprequest.setParams(new DefaultedHttpParams(httprequest.getParams(), params));
        Object obj = obj1;
        if (!(httprequest instanceof HttpEntityEnclosingRequest)) goto _L2; else goto _L1
_L1:
        if (!((HttpEntityEnclosingRequest)httprequest).expectContinue()) goto _L4; else goto _L3
_L3:
        HttpExpectationVerifier httpexpectationverifier;
        obj = responseFactory.newHttpResponse(HttpVersion.HTTP_1_1, 100, httpcontext);
        ((HttpResponse) (obj)).setParams(new DefaultedHttpParams(((HttpResponse) (obj)).getParams(), params));
        httpexpectationverifier = expectationVerifier;
        obj1 = obj;
        if (httpexpectationverifier == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        expectationVerifier.verify(httprequest, ((HttpResponse) (obj)), httpcontext);
        obj1 = obj;
_L6:
        obj = obj1;
        if (((HttpResponse) (obj1)).getStatusLine().getStatusCode() >= 200) goto _L2; else goto _L5
_L5:
        httpserverconnection.sendResponseHeader(((HttpResponse) (obj1)));
        httpserverconnection.flush();
        obj = null;
        httpserverconnection.receiveRequestEntity((HttpEntityEnclosingRequest)httprequest);
_L2:
        httpcontext.setAttribute("http.request", httprequest);
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        obj1 = responseFactory.newHttpResponse(HttpVersion.HTTP_1_1, 200, httpcontext);
        ((HttpResponse) (obj1)).setParams(new DefaultedHttpParams(((HttpResponse) (obj1)).getParams(), params));
        processor.process(httprequest, httpcontext);
        doService(httprequest, ((HttpResponse) (obj1)), httpcontext);
        obj = obj1;
        if (!(httprequest instanceof HttpEntityEnclosingRequest))
        {
            break MISSING_BLOCK_LABEL_294;
        }
        EntityUtils.consume(((HttpEntityEnclosingRequest)httprequest).getEntity());
        obj = obj1;
_L7:
        httpcontext.setAttribute("http.response", obj);
        processor.process(((HttpResponse) (obj)), httpcontext);
        httpserverconnection.sendResponseHeader(((HttpResponse) (obj)));
        httpserverconnection.sendResponseEntity(((HttpResponse) (obj)));
        httpserverconnection.flush();
        if (!connStrategy.keepAlive(((HttpResponse) (obj)), httpcontext))
        {
            httpserverconnection.close();
        }
        return;
        obj;
        obj1 = responseFactory.newHttpResponse(HttpVersion.HTTP_1_0, 500, httpcontext);
        ((HttpResponse) (obj1)).setParams(new DefaultedHttpParams(((HttpResponse) (obj1)).getParams(), params));
        handleException(((HttpException) (obj)), ((HttpResponse) (obj1)));
          goto _L6
        obj1;
        obj = responseFactory.newHttpResponse(HttpVersion.HTTP_1_0, 500, httpcontext);
        ((HttpResponse) (obj)).setParams(new DefaultedHttpParams(((HttpResponse) (obj)).getParams(), params));
        handleException(((HttpException) (obj1)), ((HttpResponse) (obj)));
          goto _L7
_L4:
        httpserverconnection.receiveRequestEntity((HttpEntityEnclosingRequest)httprequest);
        obj = obj1;
          goto _L2
    }

    public void setConnReuseStrategy(ConnectionReuseStrategy connectionreusestrategy)
    {
        if (connectionreusestrategy == null)
        {
            throw new IllegalArgumentException("Connection reuse strategy may not be null");
        } else
        {
            connStrategy = connectionreusestrategy;
            return;
        }
    }

    public void setExpectationVerifier(HttpExpectationVerifier httpexpectationverifier)
    {
        expectationVerifier = httpexpectationverifier;
    }

    public void setHandlerResolver(HttpRequestHandlerResolver httprequesthandlerresolver)
    {
        handlerResolver = httprequesthandlerresolver;
    }

    public void setHttpProcessor(HttpProcessor httpprocessor)
    {
        if (httpprocessor == null)
        {
            throw new IllegalArgumentException("HTTP processor may not be null");
        } else
        {
            processor = httpprocessor;
            return;
        }
    }

    public void setParams(HttpParams httpparams)
    {
        params = httpparams;
    }

    public void setResponseFactory(HttpResponseFactory httpresponsefactory)
    {
        if (httpresponsefactory == null)
        {
            throw new IllegalArgumentException("Response factory may not be null");
        } else
        {
            responseFactory = httpresponsefactory;
            return;
        }
    }
}
