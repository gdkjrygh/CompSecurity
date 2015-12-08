// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            RequestWrapper

public class RoutedRequest
{

    protected final RequestWrapper request;
    protected final HttpRoute route;

    public RoutedRequest(RequestWrapper requestwrapper, HttpRoute httproute)
    {
        request = requestwrapper;
        route = httproute;
    }

    public final RequestWrapper getRequest()
    {
        return request;
    }

    public final HttpRoute getRoute()
    {
        return route;
    }
}
