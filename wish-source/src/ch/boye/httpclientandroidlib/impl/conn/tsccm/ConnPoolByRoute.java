// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn.tsccm;

import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.conn.ClientConnectionOperator;
import ch.boye.httpclientandroidlib.conn.ConnectionPoolTimeoutException;
import ch.boye.httpclientandroidlib.conn.OperatedClientConnection;
import ch.boye.httpclientandroidlib.conn.params.ConnManagerParams;
import ch.boye.httpclientandroidlib.conn.params.ConnPerRoute;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn.tsccm:
//            AbstractConnPool, BasicPoolEntry, RouteSpecificPool, WaitingThreadAborter, 
//            WaitingThread, PoolEntryRequest

public class ConnPoolByRoute extends AbstractConnPool
{

    protected final ConnPerRoute connPerRoute;
    private final long connTTL;
    private final TimeUnit connTTLTimeUnit;
    protected final Queue freeConnections;
    protected final Set leasedConnections;
    public HttpClientAndroidLog log;
    protected volatile int maxTotalConnections;
    protected volatile int numConnections;
    protected final ClientConnectionOperator operator;
    private final Lock poolLock;
    protected final Map routeToPool;
    protected volatile boolean shutdown;
    protected final Queue waitingThreads;

    public ConnPoolByRoute(ClientConnectionOperator clientconnectionoperator, ConnPerRoute connperroute, int i)
    {
        this(clientconnectionoperator, connperroute, i, -1L, TimeUnit.MILLISECONDS);
    }

    public ConnPoolByRoute(ClientConnectionOperator clientconnectionoperator, ConnPerRoute connperroute, int i, long l, TimeUnit timeunit)
    {
        log = new HttpClientAndroidLog(getClass());
        if (clientconnectionoperator == null)
        {
            throw new IllegalArgumentException("Connection operator may not be null");
        }
        if (connperroute == null)
        {
            throw new IllegalArgumentException("Connections per route may not be null");
        } else
        {
            poolLock = super.poolLock;
            leasedConnections = super.leasedConnections;
            operator = clientconnectionoperator;
            connPerRoute = connperroute;
            maxTotalConnections = i;
            freeConnections = createFreeConnQueue();
            waitingThreads = createWaitingThreadQueue();
            routeToPool = createRouteToPoolMap();
            connTTL = l;
            connTTLTimeUnit = timeunit;
            return;
        }
    }

    public ConnPoolByRoute(ClientConnectionOperator clientconnectionoperator, HttpParams httpparams)
    {
        this(clientconnectionoperator, ConnManagerParams.getMaxConnectionsPerRoute(httpparams), ConnManagerParams.getMaxTotalConnections(httpparams));
    }

    private void closeConnection(BasicPoolEntry basicpoolentry)
    {
        basicpoolentry = basicpoolentry.getConnection();
        if (basicpoolentry == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        basicpoolentry.close();
        return;
        basicpoolentry;
        log.debug("I/O error closing connection", basicpoolentry);
        return;
    }

    public void closeExpiredConnections()
    {
        long l;
        log.debug("Closing expired connections");
        l = System.currentTimeMillis();
        poolLock.lock();
        Iterator iterator = freeConnections.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            BasicPoolEntry basicpoolentry = (BasicPoolEntry)iterator.next();
            if (basicpoolentry.isExpired(l))
            {
                if (log.isDebugEnabled())
                {
                    log.debug((new StringBuilder()).append("Closing connection expired @ ").append(new Date(basicpoolentry.getExpiry())).toString());
                }
                iterator.remove();
                deleteEntry(basicpoolentry);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_131;
        Exception exception;
        exception;
        poolLock.unlock();
        throw exception;
        poolLock.unlock();
        return;
    }

    public void closeIdleConnections(long l, TimeUnit timeunit)
    {
        long l1;
        if (timeunit == null)
        {
            throw new IllegalArgumentException("Time unit must not be null.");
        }
        l1 = l;
        if (l < 0L)
        {
            l1 = 0L;
        }
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Closing connections idle longer than ").append(l1).append(" ").append(timeunit).toString());
        }
        l = System.currentTimeMillis();
        l1 = timeunit.toMillis(l1);
        poolLock.lock();
        timeunit = freeConnections.iterator();
        do
        {
            if (!timeunit.hasNext())
            {
                break;
            }
            BasicPoolEntry basicpoolentry = (BasicPoolEntry)timeunit.next();
            if (basicpoolentry.getUpdated() <= l - l1)
            {
                if (log.isDebugEnabled())
                {
                    log.debug((new StringBuilder()).append("Closing connection last used @ ").append(new Date(basicpoolentry.getUpdated())).toString());
                }
                timeunit.remove();
                deleteEntry(basicpoolentry);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_210;
        timeunit;
        poolLock.unlock();
        throw timeunit;
        poolLock.unlock();
        return;
    }

    protected BasicPoolEntry createEntry(RouteSpecificPool routespecificpool, ClientConnectionOperator clientconnectionoperator)
    {
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Creating new connection [").append(routespecificpool.getRoute()).append("]").toString());
        }
        clientconnectionoperator = new BasicPoolEntry(clientconnectionoperator, routespecificpool.getRoute(), connTTL, connTTLTimeUnit);
        poolLock.lock();
        routespecificpool.createdEntry(clientconnectionoperator);
        numConnections = numConnections + 1;
        leasedConnections.add(clientconnectionoperator);
        poolLock.unlock();
        return clientconnectionoperator;
        routespecificpool;
        poolLock.unlock();
        throw routespecificpool;
    }

    protected Queue createFreeConnQueue()
    {
        return new LinkedList();
    }

    protected Map createRouteToPoolMap()
    {
        return new HashMap();
    }

    protected Queue createWaitingThreadQueue()
    {
        return new LinkedList();
    }

    public void deleteClosedConnections()
    {
        poolLock.lock();
        Iterator iterator = freeConnections.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            BasicPoolEntry basicpoolentry = (BasicPoolEntry)iterator.next();
            if (!basicpoolentry.getConnection().isOpen())
            {
                iterator.remove();
                deleteEntry(basicpoolentry);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_76;
        Exception exception;
        exception;
        poolLock.unlock();
        throw exception;
        poolLock.unlock();
        return;
    }

    protected void deleteEntry(BasicPoolEntry basicpoolentry)
    {
        HttpRoute httproute;
        httproute = basicpoolentry.getPlannedRoute();
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Deleting connection [").append(httproute).append("][").append(basicpoolentry.getState()).append("]").toString());
        }
        poolLock.lock();
        closeConnection(basicpoolentry);
        RouteSpecificPool routespecificpool = getRoutePool(httproute, true);
        routespecificpool.deleteEntry(basicpoolentry);
        numConnections = numConnections - 1;
        if (routespecificpool.isUnused())
        {
            routeToPool.remove(httproute);
        }
        poolLock.unlock();
        return;
        basicpoolentry;
        poolLock.unlock();
        throw basicpoolentry;
    }

    protected void deleteLeastUsedEntry()
    {
        poolLock.lock();
        BasicPoolEntry basicpoolentry = (BasicPoolEntry)freeConnections.remove();
        if (basicpoolentry == null) goto _L2; else goto _L1
_L1:
        deleteEntry(basicpoolentry);
_L4:
        poolLock.unlock();
        return;
_L2:
        if (!log.isDebugEnabled()) goto _L4; else goto _L3
_L3:
        log.debug("No free connection to delete");
          goto _L4
        Exception exception;
        exception;
        poolLock.unlock();
        throw exception;
    }

    public void freeEntry(BasicPoolEntry basicpoolentry, boolean flag, long l, TimeUnit timeunit)
    {
        HttpRoute httproute;
        httproute = basicpoolentry.getPlannedRoute();
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Releasing connection [").append(httproute).append("][").append(basicpoolentry.getState()).append("]").toString());
        }
        poolLock.lock();
        if (!shutdown)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        closeConnection(basicpoolentry);
        poolLock.unlock();
        return;
        RouteSpecificPool routespecificpool;
        leasedConnections.remove(basicpoolentry);
        routespecificpool = getRoutePool(httproute, true);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (routespecificpool.getCapacity() < 0) goto _L2; else goto _L3
_L3:
        if (!log.isDebugEnabled()) goto _L5; else goto _L4
_L4:
        if (l <= 0L) goto _L7; else goto _L6
_L6:
        String s = (new StringBuilder()).append("for ").append(l).append(" ").append(timeunit).toString();
_L8:
        log.debug((new StringBuilder()).append("Pooling connection [").append(httproute).append("][").append(basicpoolentry.getState()).append("]; keep alive ").append(s).toString());
_L5:
        routespecificpool.freeEntry(basicpoolentry);
        basicpoolentry.updateExpiry(l, timeunit);
        freeConnections.add(basicpoolentry);
_L9:
        notifyWaitingThread(routespecificpool);
        poolLock.unlock();
        return;
_L7:
        s = "indefinitely";
          goto _L8
_L2:
        closeConnection(basicpoolentry);
        routespecificpool.dropEntry();
        numConnections = numConnections - 1;
          goto _L9
        basicpoolentry;
        poolLock.unlock();
        throw basicpoolentry;
          goto _L8
    }

    public int getConnectionsInPool()
    {
        poolLock.lock();
        int i = numConnections;
        poolLock.unlock();
        return i;
        Exception exception;
        exception;
        poolLock.unlock();
        throw exception;
    }

    public int getConnectionsInPool(HttpRoute httproute)
    {
        int i;
        i = 0;
        poolLock.lock();
        httproute = getRoutePool(httproute, false);
        if (httproute == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        i = httproute.getEntryCount();
        poolLock.unlock();
        return i;
        httproute;
        poolLock.unlock();
        throw httproute;
    }

    protected BasicPoolEntry getEntryBlocking(HttpRoute httproute, Object obj, long l, TimeUnit timeunit, WaitingThreadAborter waitingthreadaborter)
        throws ConnectionPoolTimeoutException, InterruptedException
    {
        Date date;
        date = null;
        if (l > 0L)
        {
            date = new Date(System.currentTimeMillis() + timeunit.toMillis(l));
        }
        timeunit = null;
        poolLock.lock();
        RouteSpecificPool routespecificpool = getRoutePool(httproute, true);
        WaitingThread waitingthread = null;
_L1:
        Object obj1;
        obj1 = timeunit;
        if (timeunit != null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        if (shutdown)
        {
            throw new IllegalStateException("Connection pool shut down");
        }
        break MISSING_BLOCK_LABEL_90;
        httproute;
        poolLock.unlock();
        throw httproute;
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("[").append(httproute).append("] total kept alive: ").append(freeConnections.size()).append(", total issued: ").append(leasedConnections.size()).append(", total allocated: ").append(numConnections).append(" out of ").append(maxTotalConnections).toString());
        }
        obj1 = getFreeEntry(routespecificpool, obj);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        poolLock.unlock();
        return ((BasicPoolEntry) (obj1));
        WaitingThread waitingthread1;
        boolean flag;
        boolean flag1;
        if (routespecificpool.getCapacity() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Available capacity: ").append(routespecificpool.getCapacity()).append(" out of ").append(routespecificpool.getMaxEntries()).append(" [").append(httproute).append("][").append(obj).append("]").toString());
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        if (numConnections >= maxTotalConnections)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        timeunit = createEntry(routespecificpool, operator);
          goto _L1
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_381;
        }
        if (freeConnections.isEmpty())
        {
            break MISSING_BLOCK_LABEL_381;
        }
        deleteLeastUsedEntry();
        routespecificpool = getRoutePool(httproute, true);
        timeunit = createEntry(routespecificpool, operator);
          goto _L1
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Need to wait for connection [").append(httproute).append("][").append(obj).append("]").toString());
        }
        waitingthread1 = waitingthread;
        if (waitingthread != null)
        {
            break MISSING_BLOCK_LABEL_466;
        }
        waitingthread1 = newWaitingThread(poolLock.newCondition(), routespecificpool);
        waitingthreadaborter.setWaitingThread(waitingthread1);
        routespecificpool.queueThread(waitingthread1);
        waitingThreads.add(waitingthread1);
        flag1 = waitingthread1.await(date);
        routespecificpool.removeThread(waitingthread1);
        waitingThreads.remove(waitingthread1);
        timeunit = ((TimeUnit) (obj1));
        waitingthread = waitingthread1;
        if (flag1) goto _L1; else goto _L2
_L2:
        timeunit = ((TimeUnit) (obj1));
        waitingthread = waitingthread1;
        if (date == null) goto _L1; else goto _L3
_L3:
        timeunit = ((TimeUnit) (obj1));
        waitingthread = waitingthread1;
        if (date.getTime() > System.currentTimeMillis()) goto _L1; else goto _L4
_L4:
        throw new ConnectionPoolTimeoutException("Timeout waiting for connection");
        httproute;
        routespecificpool.removeThread(waitingthread1);
        waitingThreads.remove(waitingthread1);
        throw httproute;
    }

    protected BasicPoolEntry getFreeEntry(RouteSpecificPool routespecificpool, Object obj)
    {
        BasicPoolEntry basicpoolentry;
        boolean flag;
        basicpoolentry = null;
        poolLock.lock();
        flag = false;
_L2:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        BasicPoolEntry basicpoolentry1 = routespecificpool.allocEntry(obj);
        if (basicpoolentry1 == null)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Getting free connection [").append(routespecificpool.getRoute()).append("][").append(obj).append("]").toString());
        }
        freeConnections.remove(basicpoolentry1);
        if (!basicpoolentry1.isExpired(System.currentTimeMillis()))
        {
            break MISSING_BLOCK_LABEL_202;
        }
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Closing expired free connection [").append(routespecificpool.getRoute()).append("][").append(obj).append("]").toString());
        }
        closeConnection(basicpoolentry1);
        routespecificpool.dropEntry();
        numConnections = numConnections - 1;
        basicpoolentry = basicpoolentry1;
        continue; /* Loop/switch isn't completed */
        routespecificpool;
        poolLock.unlock();
        throw routespecificpool;
        leasedConnections.add(basicpoolentry1);
        flag = true;
        basicpoolentry = basicpoolentry1;
        continue; /* Loop/switch isn't completed */
        boolean flag1;
        flag1 = true;
        flag = flag1;
        basicpoolentry = basicpoolentry1;
        if (!log.isDebugEnabled())
        {
            continue; /* Loop/switch isn't completed */
        }
        log.debug((new StringBuilder()).append("No free connections [").append(routespecificpool.getRoute()).append("][").append(obj).append("]").toString());
        flag = flag1;
        basicpoolentry = basicpoolentry1;
        if (true) goto _L2; else goto _L1
_L1:
        poolLock.unlock();
        return basicpoolentry;
    }

    protected Lock getLock()
    {
        return poolLock;
    }

    public int getMaxTotalConnections()
    {
        return maxTotalConnections;
    }

    protected RouteSpecificPool getRoutePool(HttpRoute httproute, boolean flag)
    {
        poolLock.lock();
        RouteSpecificPool routespecificpool1 = (RouteSpecificPool)routeToPool.get(httproute);
        RouteSpecificPool routespecificpool;
        routespecificpool = routespecificpool1;
        if (routespecificpool1 != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        routespecificpool = routespecificpool1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        routespecificpool = newRouteSpecificPool(httproute);
        routeToPool.put(httproute, routespecificpool);
        poolLock.unlock();
        return routespecificpool;
        httproute;
        poolLock.unlock();
        throw httproute;
    }

    protected void handleLostEntry(HttpRoute httproute)
    {
        poolLock.lock();
        RouteSpecificPool routespecificpool = getRoutePool(httproute, true);
        routespecificpool.dropEntry();
        if (routespecificpool.isUnused())
        {
            routeToPool.remove(httproute);
        }
        numConnections = numConnections - 1;
        notifyWaitingThread(routespecificpool);
        poolLock.unlock();
        return;
        httproute;
        poolLock.unlock();
        throw httproute;
    }

    protected RouteSpecificPool newRouteSpecificPool(HttpRoute httproute)
    {
        return new RouteSpecificPool(httproute, connPerRoute);
    }

    protected WaitingThread newWaitingThread(Condition condition, RouteSpecificPool routespecificpool)
    {
        return new WaitingThread(condition, routespecificpool);
    }

    protected void notifyWaitingThread(RouteSpecificPool routespecificpool)
    {
        Object obj;
        obj = null;
        poolLock.lock();
        if (routespecificpool == null) goto _L2; else goto _L1
_L1:
        if (!routespecificpool.hasThread()) goto _L2; else goto _L3
_L3:
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Notifying thread waiting on pool [").append(routespecificpool.getRoute()).append("]").toString());
        }
        routespecificpool = routespecificpool.nextThread();
_L4:
        if (routespecificpool == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        routespecificpool.wakeup();
        poolLock.unlock();
        return;
_L2:
label0:
        {
            if (waitingThreads.isEmpty())
            {
                break label0;
            }
            if (log.isDebugEnabled())
            {
                log.debug("Notifying thread waiting on any pool");
            }
            routespecificpool = (WaitingThread)waitingThreads.remove();
        }
          goto _L4
        routespecificpool = obj;
        if (!log.isDebugEnabled()) goto _L4; else goto _L5
_L5:
        log.debug("Notifying no-one, there are no waiting threads");
        routespecificpool = obj;
          goto _L4
        routespecificpool;
        poolLock.unlock();
        throw routespecificpool;
    }

    public PoolEntryRequest requestPoolEntry(HttpRoute httproute, Object obj)
    {
        return new PoolEntryRequest() {

            final ConnPoolByRoute this$0;
            final WaitingThreadAborter val$aborter;
            final HttpRoute val$route;
            final Object val$state;

            public void abortRequest()
            {
                poolLock.lock();
                aborter.abort();
                poolLock.unlock();
                return;
                Exception exception;
                exception;
                poolLock.unlock();
                throw exception;
            }

            public BasicPoolEntry getPoolEntry(long l, TimeUnit timeunit)
                throws InterruptedException, ConnectionPoolTimeoutException
            {
                return getEntryBlocking(route, state, l, timeunit, aborter);
            }

            
            {
                this$0 = ConnPoolByRoute.this;
                aborter = waitingthreadaborter;
                route = httproute;
                state = obj;
                super();
            }
        };
    }

    public void setMaxTotalConnections(int i)
    {
        poolLock.lock();
        maxTotalConnections = i;
        poolLock.unlock();
        return;
        Exception exception;
        exception;
        poolLock.unlock();
        throw exception;
    }

    public void shutdown()
    {
        poolLock.lock();
        boolean flag = shutdown;
        if (flag)
        {
            poolLock.unlock();
            return;
        }
        shutdown = true;
        BasicPoolEntry basicpoolentry;
        for (Iterator iterator = leasedConnections.iterator(); iterator.hasNext(); closeConnection(basicpoolentry))
        {
            basicpoolentry = (BasicPoolEntry)iterator.next();
            iterator.remove();
        }

        break MISSING_BLOCK_LABEL_88;
        Exception exception;
        exception;
        poolLock.unlock();
        throw exception;
        BasicPoolEntry basicpoolentry1;
        for (Iterator iterator1 = freeConnections.iterator(); iterator1.hasNext(); closeConnection(basicpoolentry1))
        {
            basicpoolentry1 = (BasicPoolEntry)iterator1.next();
            iterator1.remove();
            if (log.isDebugEnabled())
            {
                log.debug((new StringBuilder()).append("Closing connection [").append(basicpoolentry1.getPlannedRoute()).append("][").append(basicpoolentry1.getState()).append("]").toString());
            }
        }

        WaitingThread waitingthread;
        for (Iterator iterator2 = waitingThreads.iterator(); iterator2.hasNext(); waitingthread.wakeup())
        {
            waitingthread = (WaitingThread)iterator2.next();
            iterator2.remove();
        }

        routeToPool.clear();
        poolLock.unlock();
        return;
    }

}
