// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.ConnectionReuseStrategy;
import ch.boye.httpclientandroidlib.conn.ClientConnectionManager;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoutePlanner;
import ch.boye.httpclientandroidlib.impl.DefaultConnectionReuseStrategy;
import ch.boye.httpclientandroidlib.impl.NoConnectionReuseStrategy;
import ch.boye.httpclientandroidlib.impl.conn.PoolingClientConnectionManager;
import ch.boye.httpclientandroidlib.impl.conn.ProxySelectorRoutePlanner;
import ch.boye.httpclientandroidlib.impl.conn.SchemeRegistryFactory;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.net.ProxySelector;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            DefaultHttpClient

public class SystemDefaultHttpClient extends DefaultHttpClient
{

    public SystemDefaultHttpClient()
    {
        super(null, null);
    }

    public SystemDefaultHttpClient(HttpParams httpparams)
    {
        super(null, httpparams);
    }

    protected ClientConnectionManager createClientConnectionManager()
    {
        PoolingClientConnectionManager poolingclientconnectionmanager = new PoolingClientConnectionManager(SchemeRegistryFactory.createSystemDefault());
        if ("true".equalsIgnoreCase(System.getProperty("http.keepAlive")))
        {
            int i = Integer.parseInt(System.getProperty("http.maxConnections", "5"));
            poolingclientconnectionmanager.setDefaultMaxPerRoute(i);
            poolingclientconnectionmanager.setMaxTotal(i * 2);
        }
        return poolingclientconnectionmanager;
    }

    protected ConnectionReuseStrategy createConnectionReuseStrategy()
    {
        if ("true".equalsIgnoreCase(System.getProperty("http.keepAlive")))
        {
            return new DefaultConnectionReuseStrategy();
        } else
        {
            return new NoConnectionReuseStrategy();
        }
    }

    protected HttpRoutePlanner createHttpRoutePlanner()
    {
        return new ProxySelectorRoutePlanner(getConnectionManager().getSchemeRegistry(), ProxySelector.getDefault());
    }
}
