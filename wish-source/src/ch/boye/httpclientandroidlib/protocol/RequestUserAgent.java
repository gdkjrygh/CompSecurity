// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.protocol;

import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpRequestInterceptor;
import ch.boye.httpclientandroidlib.params.HttpProtocolParams;
import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib.protocol:
//            HttpContext

public class RequestUserAgent
    implements HttpRequestInterceptor
{

    public RequestUserAgent()
    {
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
        throws HttpException, IOException
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (!httprequest.containsHeader("User-Agent"))
        {
            httpcontext = HttpProtocolParams.getUserAgent(httprequest.getParams());
            if (httpcontext != null)
            {
                httprequest.addHeader("User-Agent", httpcontext);
            }
        }
    }
}
