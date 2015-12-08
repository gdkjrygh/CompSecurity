// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.protocol;

import ch.boye.httpclientandroidlib.HttpClientConnection;
import ch.boye.httpclientandroidlib.HttpEntityEnclosingRequest;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpVersion;
import ch.boye.httpclientandroidlib.ProtocolException;
import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib.protocol:
//            HttpContext, HttpProcessor

public class HttpRequestExecutor
{

    public HttpRequestExecutor()
    {
    }

    private static final void closeConnection(HttpClientConnection httpclientconnection)
    {
        try
        {
            httpclientconnection.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpClientConnection httpclientconnection)
        {
            return;
        }
    }

    protected boolean canResponseHaveBody(HttpRequest httprequest, HttpResponse httpresponse)
    {
        int i;
        if (!"HEAD".equalsIgnoreCase(httprequest.getRequestLine().getMethod()))
        {
            if ((i = httpresponse.getStatusLine().getStatusCode()) >= 200 && i != 204 && i != 304 && i != 205)
            {
                return true;
            }
        }
        return false;
    }

    protected HttpResponse doReceiveResponse(HttpRequest httprequest, HttpClientConnection httpclientconnection, HttpContext httpcontext)
        throws HttpException, IOException
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpclientconnection == null)
        {
            throw new IllegalArgumentException("HTTP connection may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        httpcontext = null;
        for (int i = 0; httpcontext == null || i < 200; i = httpcontext.getStatusLine().getStatusCode())
        {
            httpcontext = httpclientconnection.receiveResponseHeader();
            if (canResponseHaveBody(httprequest, httpcontext))
            {
                httpclientconnection.receiveResponseEntity(httpcontext);
            }
        }

        return httpcontext;
    }

    protected HttpResponse doSendRequest(HttpRequest httprequest, HttpClientConnection httpclientconnection, HttpContext httpcontext)
        throws IOException, HttpException
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpclientconnection == null)
        {
            throw new IllegalArgumentException("HTTP connection may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        Object obj = null;
        Object obj1 = null;
        httpcontext.setAttribute("http.connection", httpclientconnection);
        httpcontext.setAttribute("http.request_sent", Boolean.FALSE);
        httpclientconnection.sendRequestHeader(httprequest);
        if (httprequest instanceof HttpEntityEnclosingRequest)
        {
            boolean flag = true;
            obj = httprequest.getRequestLine().getProtocolVersion();
            HttpResponse httpresponse = obj1;
            int i = ((flag) ? 1 : 0);
            if (((HttpEntityEnclosingRequest)httprequest).expectContinue())
            {
                httpresponse = obj1;
                i = ((flag) ? 1 : 0);
                if (!((ProtocolVersion) (obj)).lessEquals(HttpVersion.HTTP_1_0))
                {
                    httpclientconnection.flush();
                    httpresponse = obj1;
                    i = ((flag) ? 1 : 0);
                    if (httpclientconnection.isResponseAvailable(httprequest.getParams().getIntParameter("http.protocol.wait-for-continue", 2000)))
                    {
                        httpresponse = httpclientconnection.receiveResponseHeader();
                        if (canResponseHaveBody(httprequest, httpresponse))
                        {
                            httpclientconnection.receiveResponseEntity(httpresponse);
                        }
                        i = httpresponse.getStatusLine().getStatusCode();
                        if (i < 200)
                        {
                            if (i != 100)
                            {
                                throw new ProtocolException((new StringBuilder()).append("Unexpected response: ").append(httpresponse.getStatusLine()).toString());
                            }
                            httpresponse = null;
                            i = ((flag) ? 1 : 0);
                        } else
                        {
                            i = 0;
                        }
                    }
                }
            }
            obj = httpresponse;
            if (i != 0)
            {
                httpclientconnection.sendRequestEntity((HttpEntityEnclosingRequest)httprequest);
                obj = httpresponse;
            }
        }
        httpclientconnection.flush();
        httpcontext.setAttribute("http.request_sent", Boolean.TRUE);
        return ((HttpResponse) (obj));
    }

    public HttpResponse execute(HttpRequest httprequest, HttpClientConnection httpclientconnection, HttpContext httpcontext)
        throws IOException, HttpException
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpclientconnection == null)
        {
            throw new IllegalArgumentException("Client connection may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        HttpResponse httpresponse;
        HttpResponse httpresponse1;
        try
        {
            httpresponse1 = doSendRequest(httprequest, httpclientconnection, httpcontext);
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            closeConnection(httpclientconnection);
            throw httprequest;
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            closeConnection(httpclientconnection);
            throw httprequest;
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            closeConnection(httpclientconnection);
            throw httprequest;
        }
        httpresponse = httpresponse1;
        if (httpresponse1 != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        httpresponse = doReceiveResponse(httprequest, httpclientconnection, httpcontext);
        return httpresponse;
    }

    public void postProcess(HttpResponse httpresponse, HttpProcessor httpprocessor, HttpContext httpcontext)
        throws HttpException, IOException
    {
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        if (httpprocessor == null)
        {
            throw new IllegalArgumentException("HTTP processor may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else
        {
            httpcontext.setAttribute("http.response", httpresponse);
            httpprocessor.process(httpresponse, httpcontext);
            return;
        }
    }

    public void preProcess(HttpRequest httprequest, HttpProcessor httpprocessor, HttpContext httpcontext)
        throws HttpException, IOException
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpprocessor == null)
        {
            throw new IllegalArgumentException("HTTP processor may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else
        {
            httpcontext.setAttribute("http.request", httprequest);
            httpprocessor.process(httprequest, httpcontext);
            return;
        }
    }
}
