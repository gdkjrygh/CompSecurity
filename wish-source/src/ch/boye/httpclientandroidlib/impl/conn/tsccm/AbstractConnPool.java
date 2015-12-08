// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn.tsccm;

import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.conn.ConnectionPoolTimeoutException;
import ch.boye.httpclientandroidlib.conn.OperatedClientConnection;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.impl.conn.IdleConnectionHandler;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn.tsccm:
//            PoolEntryRequest, BasicPoolEntry

public abstract class AbstractConnPool
{

    protected IdleConnectionHandler idleConnHandler;
    protected volatile boolean isShutDown;
    protected Set issuedConnections;
    protected Set leasedConnections;
    public HttpClientAndroidLog log;
    protected int numConnections;
    protected final Lock poolLock = new ReentrantLock();
    protected ReferenceQueue refQueue;

    protected AbstractConnPool()
    {
        log = new HttpClientAndroidLog(getClass());
        leasedConnections = new HashSet();
        idleConnHandler = new IdleConnectionHandler();
    }

    protected void closeConnection(OperatedClientConnection operatedclientconnection)
    {
        if (operatedclientconnection == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        operatedclientconnection.close();
        return;
        operatedclientconnection;
        log.debug("I/O error closing connection", operatedclientconnection);
        return;
    }

    public void closeExpiredConnections()
    {
        poolLock.lock();
        idleConnHandler.closeExpiredConnections();
        poolLock.unlock();
        return;
        Exception exception;
        exception;
        poolLock.unlock();
        throw exception;
    }

    public void closeIdleConnections(long l, TimeUnit timeunit)
    {
        if (timeunit == null)
        {
            throw new IllegalArgumentException("Time unit must not be null.");
        }
        poolLock.lock();
        idleConnHandler.closeIdleConnections(timeunit.toMillis(l));
        poolLock.unlock();
        return;
        timeunit;
        poolLock.unlock();
        throw timeunit;
    }

    public abstract void deleteClosedConnections();

    public void enableConnectionGC()
        throws IllegalStateException
    {
    }

    public abstract void freeEntry(BasicPoolEntry basicpoolentry, boolean flag, long l, TimeUnit timeunit);

    public final BasicPoolEntry getEntry(HttpRoute httproute, Object obj, long l, TimeUnit timeunit)
        throws ConnectionPoolTimeoutException, InterruptedException
    {
        return requestPoolEntry(httproute, obj).getPoolEntry(l, timeunit);
    }

    protected abstract void handleLostEntry(HttpRoute httproute);

    public void handleReference(Reference reference)
    {
    }

    public abstract PoolEntryRequest requestPoolEntry(HttpRoute httproute, Object obj);

    public void shutdown()
    {
        poolLock.lock();
        boolean flag = isShutDown;
        if (flag)
        {
            poolLock.unlock();
            return;
        }
        BasicPoolEntry basicpoolentry;
        for (Iterator iterator = leasedConnections.iterator(); iterator.hasNext(); closeConnection(basicpoolentry.getConnection()))
        {
            basicpoolentry = (BasicPoolEntry)iterator.next();
            iterator.remove();
        }

        break MISSING_BLOCK_LABEL_86;
        Exception exception;
        exception;
        poolLock.unlock();
        throw exception;
        idleConnHandler.removeAll();
        isShutDown = true;
        poolLock.unlock();
        return;
    }
}
