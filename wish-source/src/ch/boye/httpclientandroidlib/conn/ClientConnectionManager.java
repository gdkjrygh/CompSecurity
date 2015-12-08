// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn;

import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.conn.scheme.SchemeRegistry;
import java.util.concurrent.TimeUnit;

// Referenced classes of package ch.boye.httpclientandroidlib.conn:
//            ManagedClientConnection, ClientConnectionRequest

public interface ClientConnectionManager
{

    public abstract void closeExpiredConnections();

    public abstract void closeIdleConnections(long l, TimeUnit timeunit);

    public abstract SchemeRegistry getSchemeRegistry();

    public abstract void releaseConnection(ManagedClientConnection managedclientconnection, long l, TimeUnit timeunit);

    public abstract ClientConnectionRequest requestConnection(HttpRoute httproute, Object obj);

    public abstract void shutdown();
}
