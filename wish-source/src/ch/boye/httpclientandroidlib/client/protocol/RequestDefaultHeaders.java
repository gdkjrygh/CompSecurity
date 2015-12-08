// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.protocol;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpRequestInterceptor;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public class RequestDefaultHeaders
    implements HttpRequestInterceptor
{

    public RequestDefaultHeaders()
    {
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
        throws HttpException, IOException
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (!httprequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((httpcontext = (Collection)httprequest.getParams().getParameter("http.default-headers")) != null)
        {
            httpcontext = httpcontext.iterator();
            while (httpcontext.hasNext()) 
            {
                httprequest.addHeader((Header)httpcontext.next());
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
