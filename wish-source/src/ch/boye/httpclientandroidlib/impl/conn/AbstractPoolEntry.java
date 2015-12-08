// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.conn.ClientConnectionOperator;
import ch.boye.httpclientandroidlib.conn.OperatedClientConnection;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.conn.routing.RouteTracker;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.io.IOException;
import java.io.InterruptedIOException;

public abstract class AbstractPoolEntry
{

    protected final ClientConnectionOperator connOperator;
    protected final OperatedClientConnection connection;
    protected volatile HttpRoute route;
    protected volatile Object state;
    protected volatile RouteTracker tracker;

    protected AbstractPoolEntry(ClientConnectionOperator clientconnectionoperator, HttpRoute httproute)
    {
        if (clientconnectionoperator == null)
        {
            throw new IllegalArgumentException("Connection operator may not be null");
        } else
        {
            connOperator = clientconnectionoperator;
            connection = clientconnectionoperator.createConnection();
            route = httproute;
            tracker = null;
            return;
        }
    }

    public Object getState()
    {
        return state;
    }

    public void layerProtocol(HttpContext httpcontext, HttpParams httpparams)
        throws IOException
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        if (tracker == null || !tracker.isConnected())
        {
            throw new IllegalStateException("Connection not open.");
        }
        if (!tracker.isTunnelled())
        {
            throw new IllegalStateException("Protocol layering without a tunnel not supported.");
        }
        if (tracker.isLayered())
        {
            throw new IllegalStateException("Multiple protocol layering not supported.");
        } else
        {
            HttpHost httphost = tracker.getTargetHost();
            connOperator.updateSecureConnection(connection, httphost, httpcontext, httpparams);
            tracker.layerProtocol(connection.isSecure());
            return;
        }
    }

    public void open(HttpRoute httproute, HttpContext httpcontext, HttpParams httpparams)
        throws IOException
    {
        if (httproute == null)
        {
            throw new IllegalArgumentException("Route must not be null.");
        }
        if (httpparams == null)
        {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        if (tracker != null && tracker.isConnected())
        {
            throw new IllegalStateException("Connection already open.");
        }
        tracker = new RouteTracker(httproute);
        HttpHost httphost1 = httproute.getProxyHost();
        ClientConnectionOperator clientconnectionoperator = connOperator;
        OperatedClientConnection operatedclientconnection = connection;
        HttpHost httphost;
        if (httphost1 != null)
        {
            httphost = httphost1;
        } else
        {
            httphost = httproute.getTargetHost();
        }
        clientconnectionoperator.openConnection(operatedclientconnection, httphost, httproute.getLocalAddress(), httpcontext, httpparams);
        httproute = tracker;
        if (httproute == null)
        {
            throw new InterruptedIOException("Request aborted");
        }
        if (httphost1 == null)
        {
            httproute.connectTarget(connection.isSecure());
            return;
        } else
        {
            httproute.connectProxy(httphost1, connection.isSecure());
            return;
        }
    }

    public void setState(Object obj)
    {
        state = obj;
    }

    protected void shutdownEntry()
    {
        tracker = null;
        state = null;
    }

    public void tunnelProxy(HttpHost httphost, boolean flag, HttpParams httpparams)
        throws IOException
    {
        if (httphost == null)
        {
            throw new IllegalArgumentException("Next proxy must not be null.");
        }
        if (httpparams == null)
        {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        if (tracker == null || !tracker.isConnected())
        {
            throw new IllegalStateException("Connection not open.");
        } else
        {
            connection.update(null, httphost, flag, httpparams);
            tracker.tunnelProxy(httphost, flag);
            return;
        }
    }

    public void tunnelTarget(boolean flag, HttpParams httpparams)
        throws IOException
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        if (tracker == null || !tracker.isConnected())
        {
            throw new IllegalStateException("Connection not open.");
        }
        if (tracker.isTunnelled())
        {
            throw new IllegalStateException("Connection is already tunnelled.");
        } else
        {
            connection.update(null, tracker.getTargetHost(), flag, httpparams);
            tracker.tunnelTarget(flag);
            return;
        }
    }
}
