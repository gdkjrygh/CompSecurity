// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.conn.ClientConnectionManager;
import ch.boye.httpclientandroidlib.conn.OperatedClientConnection;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.conn.routing.RouteTracker;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn:
//            AbstractClientConnAdapter, AbstractPoolEntry, ConnectionShutdownException

public abstract class AbstractPooledConnAdapter extends AbstractClientConnAdapter
{

    protected volatile AbstractPoolEntry poolEntry;

    protected AbstractPooledConnAdapter(ClientConnectionManager clientconnectionmanager, AbstractPoolEntry abstractpoolentry)
    {
        super(clientconnectionmanager, abstractpoolentry.connection);
        poolEntry = abstractpoolentry;
    }

    protected final void assertAttached()
    {
        if (poolEntry == null)
        {
            throw new ConnectionShutdownException();
        } else
        {
            return;
        }
    }

    protected void assertValid(AbstractPoolEntry abstractpoolentry)
    {
        if (isReleased() || abstractpoolentry == null)
        {
            throw new ConnectionShutdownException();
        } else
        {
            return;
        }
    }

    public void close()
        throws IOException
    {
        Object obj = getPoolEntry();
        if (obj != null)
        {
            ((AbstractPoolEntry) (obj)).shutdownEntry();
        }
        obj = getWrappedConnection();
        if (obj != null)
        {
            ((OperatedClientConnection) (obj)).close();
        }
    }

    protected void detach()
    {
        this;
        JVM INSTR monitorenter ;
        poolEntry = null;
        super.detach();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected AbstractPoolEntry getPoolEntry()
    {
        return poolEntry;
    }

    public HttpRoute getRoute()
    {
        AbstractPoolEntry abstractpoolentry = getPoolEntry();
        assertValid(abstractpoolentry);
        if (abstractpoolentry.tracker == null)
        {
            return null;
        } else
        {
            return abstractpoolentry.tracker.toRoute();
        }
    }

    public Object getState()
    {
        AbstractPoolEntry abstractpoolentry = getPoolEntry();
        assertValid(abstractpoolentry);
        return abstractpoolentry.getState();
    }

    public void layerProtocol(HttpContext httpcontext, HttpParams httpparams)
        throws IOException
    {
        AbstractPoolEntry abstractpoolentry = getPoolEntry();
        assertValid(abstractpoolentry);
        abstractpoolentry.layerProtocol(httpcontext, httpparams);
    }

    public void open(HttpRoute httproute, HttpContext httpcontext, HttpParams httpparams)
        throws IOException
    {
        AbstractPoolEntry abstractpoolentry = getPoolEntry();
        assertValid(abstractpoolentry);
        abstractpoolentry.open(httproute, httpcontext, httpparams);
    }

    public void setState(Object obj)
    {
        AbstractPoolEntry abstractpoolentry = getPoolEntry();
        assertValid(abstractpoolentry);
        abstractpoolentry.setState(obj);
    }

    public void shutdown()
        throws IOException
    {
        Object obj = getPoolEntry();
        if (obj != null)
        {
            ((AbstractPoolEntry) (obj)).shutdownEntry();
        }
        obj = getWrappedConnection();
        if (obj != null)
        {
            ((OperatedClientConnection) (obj)).shutdown();
        }
    }

    public void tunnelProxy(HttpHost httphost, boolean flag, HttpParams httpparams)
        throws IOException
    {
        AbstractPoolEntry abstractpoolentry = getPoolEntry();
        assertValid(abstractpoolentry);
        abstractpoolentry.tunnelProxy(httphost, flag, httpparams);
    }

    public void tunnelTarget(boolean flag, HttpParams httpparams)
        throws IOException
    {
        AbstractPoolEntry abstractpoolentry = getPoolEntry();
        assertValid(abstractpoolentry);
        abstractpoolentry.tunnelTarget(flag, httpparams);
    }
}
