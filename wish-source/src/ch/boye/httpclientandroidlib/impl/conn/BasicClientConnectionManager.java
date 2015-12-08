// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.conn.ClientConnectionManager;
import ch.boye.httpclientandroidlib.conn.ClientConnectionOperator;
import ch.boye.httpclientandroidlib.conn.ClientConnectionRequest;
import ch.boye.httpclientandroidlib.conn.ManagedClientConnection;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.conn.routing.RouteTracker;
import ch.boye.httpclientandroidlib.conn.scheme.SchemeRegistry;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn:
//            SchemeRegistryFactory, HttpPoolEntry, DefaultClientConnectionOperator, ManagedClientConnectionImpl

public class BasicClientConnectionManager
    implements ClientConnectionManager
{

    private static final AtomicLong COUNTER = new AtomicLong();
    public static final String MISUSE_MESSAGE = "Invalid use of BasicClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    private ManagedClientConnectionImpl conn;
    private final ClientConnectionOperator connOperator;
    public HttpClientAndroidLog log;
    private HttpPoolEntry poolEntry;
    private final SchemeRegistry schemeRegistry;
    private volatile boolean shutdown;

    public BasicClientConnectionManager()
    {
        this(SchemeRegistryFactory.createDefault());
    }

    public BasicClientConnectionManager(SchemeRegistry schemeregistry)
    {
        log = new HttpClientAndroidLog(getClass());
        if (schemeregistry == null)
        {
            throw new IllegalArgumentException("Scheme registry may not be null");
        } else
        {
            schemeRegistry = schemeregistry;
            connOperator = createConnectionOperator(schemeregistry);
            return;
        }
    }

    private void assertNotShutdown()
    {
        if (shutdown)
        {
            throw new IllegalStateException("Connection manager has been shut down");
        } else
        {
            return;
        }
    }

    public void closeExpiredConnections()
    {
        assertNotShutdown();
        this;
        JVM INSTR monitorenter ;
        long l = System.currentTimeMillis();
        if (poolEntry != null && poolEntry.isExpired(l))
        {
            poolEntry.close();
            poolEntry.getTracker().reset();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void closeIdleConnections(long l, TimeUnit timeunit)
    {
        if (timeunit == null)
        {
            throw new IllegalArgumentException("Time unit must not be null.");
        }
        assertNotShutdown();
        this;
        JVM INSTR monitorenter ;
        long l1 = timeunit.toMillis(l);
        l = l1;
        if (l1 < 0L)
        {
            l = 0L;
        }
        long l2 = System.currentTimeMillis();
        if (poolEntry != null && poolEntry.getUpdated() <= l2 - l)
        {
            poolEntry.close();
            poolEntry.getTracker().reset();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        timeunit;
        this;
        JVM INSTR monitorexit ;
        throw timeunit;
    }

    protected ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeregistry)
    {
        return new DefaultClientConnectionOperator(schemeregistry);
    }

    protected void finalize()
        throws Throwable
    {
        shutdown();
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    ManagedClientConnection getConnection(HttpRoute httproute, Object obj)
    {
        if (httproute == null)
        {
            throw new IllegalArgumentException("Route may not be null.");
        }
        assertNotShutdown();
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Get connection for route ").append(httproute).toString());
        }
        this;
        JVM INSTR monitorenter ;
        if (conn != null)
        {
            throw new IllegalStateException("Invalid use of BasicClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.");
        }
        break MISSING_BLOCK_LABEL_78;
        httproute;
        this;
        JVM INSTR monitorexit ;
        throw httproute;
        if (poolEntry != null && !poolEntry.getPlannedRoute().equals(httproute))
        {
            poolEntry.close();
            poolEntry = null;
        }
        if (poolEntry == null)
        {
            obj = Long.toString(COUNTER.getAndIncrement());
            ch.boye.httpclientandroidlib.conn.OperatedClientConnection operatedclientconnection = connOperator.createConnection();
            poolEntry = new HttpPoolEntry(log, ((String) (obj)), httproute, operatedclientconnection, 0L, TimeUnit.MILLISECONDS);
        }
        long l = System.currentTimeMillis();
        if (poolEntry.isExpired(l))
        {
            poolEntry.close();
            poolEntry.getTracker().reset();
        }
        conn = new ManagedClientConnectionImpl(this, connOperator, poolEntry);
        httproute = conn;
        this;
        JVM INSTR monitorexit ;
        return httproute;
    }

    public SchemeRegistry getSchemeRegistry()
    {
        return schemeRegistry;
    }

    public void releaseConnection(ManagedClientConnection managedclientconnection, long l, TimeUnit timeunit)
    {
label0:
        {
            assertNotShutdown();
            if (!(managedclientconnection instanceof ManagedClientConnectionImpl))
            {
                throw new IllegalArgumentException("Connection class mismatch, connection not obtained from this manager");
            }
            if (log.isDebugEnabled())
            {
                log.debug((new StringBuilder()).append("Releasing connection ").append(managedclientconnection).toString());
            }
            synchronized ((ManagedClientConnectionImpl)managedclientconnection)
            {
                if (managedclientconnectionimpl.getPoolEntry() != null)
                {
                    break label0;
                }
            }
            return;
        }
        managedclientconnection = managedclientconnectionimpl.getManager();
        if (managedclientconnection == null || managedclientconnection == this)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        throw new IllegalStateException("Connection not obtained from this manager");
        managedclientconnection;
        managedclientconnectionimpl;
        JVM INSTR monitorexit ;
        throw managedclientconnection;
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!managedclientconnectionimpl.isOpen())
        {
            break MISSING_BLOCK_LABEL_136;
        }
        flag = managedclientconnectionimpl.isMarkedReusable();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        managedclientconnectionimpl.shutdown();
_L6:
        HttpPoolEntry httppoolentry = poolEntry;
        if (timeunit == null) goto _L2; else goto _L1
_L1:
        managedclientconnection = timeunit;
_L7:
        httppoolentry.updateExpiry(l, managedclientconnection);
        if (!log.isDebugEnabled()) goto _L4; else goto _L3
_L3:
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        managedclientconnection = (new StringBuilder()).append("for ").append(l).append(" ").append(timeunit).toString();
_L8:
        log.debug((new StringBuilder()).append("Connection can be kept alive ").append(managedclientconnection).toString());
_L4:
        managedclientconnectionimpl.detach();
        conn = null;
        if (poolEntry.isClosed())
        {
            poolEntry = null;
        }
        this;
        JVM INSTR monitorexit ;
        managedclientconnectionimpl;
        JVM INSTR monitorexit ;
        return;
        managedclientconnection;
        if (!log.isDebugEnabled()) goto _L6; else goto _L5
_L5:
        log.debug("I/O exception shutting down released connection", managedclientconnection);
          goto _L6
        managedclientconnection;
        managedclientconnectionimpl.detach();
        conn = null;
        if (poolEntry.isClosed())
        {
            poolEntry = null;
        }
        throw managedclientconnection;
        managedclientconnection;
        this;
        JVM INSTR monitorexit ;
        throw managedclientconnection;
_L2:
        managedclientconnection = TimeUnit.MILLISECONDS;
          goto _L7
        managedclientconnection = "indefinitely";
          goto _L8
    }

    public final ClientConnectionRequest requestConnection(final HttpRoute route, final Object state)
    {
        return new ClientConnectionRequest() {

            final BasicClientConnectionManager this$0;
            final HttpRoute val$route;
            final Object val$state;

            public void abortRequest()
            {
            }

            public ManagedClientConnection getConnection(long l, TimeUnit timeunit)
            {
                return BasicClientConnectionManager.this.getConnection(route, state);
            }

            
            {
                this$0 = BasicClientConnectionManager.this;
                route = httproute;
                state = obj;
                super();
            }
        };
    }

    public void shutdown()
    {
        shutdown = true;
        this;
        JVM INSTR monitorenter ;
        if (poolEntry != null)
        {
            poolEntry.close();
        }
        poolEntry = null;
        conn = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        poolEntry = null;
        conn = null;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
