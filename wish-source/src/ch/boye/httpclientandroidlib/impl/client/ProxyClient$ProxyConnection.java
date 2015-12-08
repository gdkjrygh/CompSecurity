// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.conn.HttpRoutedConnection;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.impl.DefaultHttpClientConnection;
import java.net.Socket;
import javax.net.ssl.SSLSession;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            ProxyClient

static class route extends DefaultHttpClientConnection
    implements HttpRoutedConnection
{

    private final HttpRoute route;

    public HttpRoute getRoute()
    {
        return route;
    }

    public SSLSession getSSLSession()
    {
        return null;
    }

    public Socket getSocket()
    {
        return super.getSocket();
    }

    public boolean isSecure()
    {
        return false;
    }

    (HttpRoute httproute)
    {
        route = httproute;
    }
}
