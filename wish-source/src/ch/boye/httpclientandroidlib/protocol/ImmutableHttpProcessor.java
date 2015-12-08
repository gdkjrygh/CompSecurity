// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.protocol;

import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpRequestInterceptor;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpResponseInterceptor;
import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib.protocol:
//            HttpProcessor, HttpRequestInterceptorList, HttpResponseInterceptorList, HttpContext

public final class ImmutableHttpProcessor
    implements HttpProcessor
{

    private final HttpRequestInterceptor requestInterceptors[];
    private final HttpResponseInterceptor responseInterceptors[];

    public ImmutableHttpProcessor(HttpRequestInterceptorList httprequestinterceptorlist, HttpResponseInterceptorList httpresponseinterceptorlist)
    {
        if (httprequestinterceptorlist != null)
        {
            int k = httprequestinterceptorlist.getRequestInterceptorCount();
            requestInterceptors = new HttpRequestInterceptor[k];
            for (int i = 0; i < k; i++)
            {
                requestInterceptors[i] = httprequestinterceptorlist.getRequestInterceptor(i);
            }

        } else
        {
            requestInterceptors = new HttpRequestInterceptor[0];
        }
        if (httpresponseinterceptorlist != null)
        {
            int l = httpresponseinterceptorlist.getResponseInterceptorCount();
            responseInterceptors = new HttpResponseInterceptor[l];
            for (int j = 0; j < l; j++)
            {
                responseInterceptors[j] = httpresponseinterceptorlist.getResponseInterceptor(j);
            }

        } else
        {
            responseInterceptors = new HttpResponseInterceptor[0];
        }
    }

    public ImmutableHttpProcessor(HttpRequestInterceptor ahttprequestinterceptor[])
    {
        this(ahttprequestinterceptor, ((HttpResponseInterceptor []) (null)));
    }

    public ImmutableHttpProcessor(HttpRequestInterceptor ahttprequestinterceptor[], HttpResponseInterceptor ahttpresponseinterceptor[])
    {
        if (ahttprequestinterceptor != null)
        {
            int k = ahttprequestinterceptor.length;
            requestInterceptors = new HttpRequestInterceptor[k];
            for (int i = 0; i < k; i++)
            {
                requestInterceptors[i] = ahttprequestinterceptor[i];
            }

        } else
        {
            requestInterceptors = new HttpRequestInterceptor[0];
        }
        if (ahttpresponseinterceptor != null)
        {
            int l = ahttpresponseinterceptor.length;
            responseInterceptors = new HttpResponseInterceptor[l];
            for (int j = 0; j < l; j++)
            {
                responseInterceptors[j] = ahttpresponseinterceptor[j];
            }

        } else
        {
            responseInterceptors = new HttpResponseInterceptor[0];
        }
    }

    public ImmutableHttpProcessor(HttpResponseInterceptor ahttpresponseinterceptor[])
    {
        this(((HttpRequestInterceptor []) (null)), ahttpresponseinterceptor);
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
        throws IOException, HttpException
    {
        for (int i = 0; i < requestInterceptors.length; i++)
        {
            requestInterceptors[i].process(httprequest, httpcontext);
        }

    }

    public void process(HttpResponse httpresponse, HttpContext httpcontext)
        throws IOException, HttpException
    {
        for (int i = 0; i < responseInterceptors.length; i++)
        {
            responseInterceptors[i].process(httpresponse, httpcontext);
        }

    }
}
