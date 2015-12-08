// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn.params;

import ch.boye.httpclientandroidlib.params.HttpAbstractParamBean;
import ch.boye.httpclientandroidlib.params.HttpParams;

// Referenced classes of package ch.boye.httpclientandroidlib.conn.params:
//            ConnPerRouteBean

public class ConnManagerParamBean extends HttpAbstractParamBean
{

    public ConnManagerParamBean(HttpParams httpparams)
    {
        super(httpparams);
    }

    public void setConnectionsPerRoute(ConnPerRouteBean connperroutebean)
    {
        params.setParameter("http.conn-manager.max-per-route", connperroutebean);
    }

    public void setMaxTotalConnections(int i)
    {
        params.setIntParameter("http.conn-manager.max-total", i);
    }

    public void setTimeout(long l)
    {
        params.setLongParameter("http.conn-manager.timeout", l);
    }
}
