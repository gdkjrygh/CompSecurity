// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.conn.params.ConnRouteParams;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoutePlanner;
import ch.boye.httpclientandroidlib.conn.scheme.Scheme;
import ch.boye.httpclientandroidlib.conn.scheme.SchemeRegistry;
import ch.boye.httpclientandroidlib.protocol.HttpContext;

public class DefaultHttpRoutePlanner
    implements HttpRoutePlanner
{

    protected final SchemeRegistry schemeRegistry;

    public DefaultHttpRoutePlanner(SchemeRegistry schemeregistry)
    {
        if (schemeregistry == null)
        {
            throw new IllegalArgumentException("SchemeRegistry must not be null.");
        } else
        {
            schemeRegistry = schemeregistry;
            return;
        }
    }

    public HttpRoute determineRoute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
        throws HttpException
    {
        if (httprequest == null)
        {
            throw new IllegalStateException("Request must not be null.");
        }
        httpcontext = ConnRouteParams.getForcedRoute(httprequest.getParams());
        if (httpcontext != null)
        {
            return httpcontext;
        }
        if (httphost == null)
        {
            throw new IllegalStateException("Target host must not be null.");
        }
        httpcontext = ConnRouteParams.getLocalAddress(httprequest.getParams());
        httprequest = ConnRouteParams.getDefaultProxy(httprequest.getParams());
        Scheme scheme;
        boolean flag;
        try
        {
            scheme = schemeRegistry.getScheme(httphost.getSchemeName());
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost)
        {
            throw new HttpException(httphost.getMessage());
        }
        flag = scheme.isLayered();
        if (httprequest == null)
        {
            httphost = new HttpRoute(httphost, httpcontext, flag);
        } else
        {
            httphost = new HttpRoute(httphost, httpcontext, httprequest, flag);
        }
        return httphost;
    }
}
