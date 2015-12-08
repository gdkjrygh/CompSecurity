// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn;

import ch.boye.httpclientandroidlib.HttpClientConnection;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;

// Referenced classes of package ch.boye.httpclientandroidlib.conn:
//            ConnectionReleaseTrigger, HttpRoutedConnection

public interface ManagedClientConnection
    extends HttpClientConnection, ConnectionReleaseTrigger, HttpRoutedConnection
{

    public abstract HttpRoute getRoute();

    public abstract SSLSession getSSLSession();

    public abstract Object getState();

    public abstract boolean isMarkedReusable();

    public abstract boolean isSecure();

    public abstract void layerProtocol(HttpContext httpcontext, HttpParams httpparams)
        throws IOException;

    public abstract void markReusable();

    public abstract void open(HttpRoute httproute, HttpContext httpcontext, HttpParams httpparams)
        throws IOException;

    public abstract void setIdleDuration(long l, TimeUnit timeunit);

    public abstract void setState(Object obj);

    public abstract void tunnelProxy(HttpHost httphost, boolean flag, HttpParams httpparams)
        throws IOException;

    public abstract void tunnelTarget(boolean flag, HttpParams httpparams)
        throws IOException;

    public abstract void unmarkReusable();
}
