// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn.params;

import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.params.HttpAbstractParamBean;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.net.InetAddress;

public class ConnRouteParamBean extends HttpAbstractParamBean
{

    public ConnRouteParamBean(HttpParams httpparams)
    {
        super(httpparams);
    }

    public void setDefaultProxy(HttpHost httphost)
    {
        params.setParameter("http.route.default-proxy", httphost);
    }

    public void setForcedRoute(HttpRoute httproute)
    {
        params.setParameter("http.route.forced-route", httproute);
    }

    public void setLocalAddress(InetAddress inetaddress)
    {
        params.setParameter("http.route.local-address", inetaddress);
    }
}
