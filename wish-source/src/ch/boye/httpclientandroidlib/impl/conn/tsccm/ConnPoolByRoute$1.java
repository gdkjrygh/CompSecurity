// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn.tsccm;

import ch.boye.httpclientandroidlib.conn.ConnectionPoolTimeoutException;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn.tsccm:
//            PoolEntryRequest, ConnPoolByRoute, WaitingThreadAborter, BasicPoolEntry

class val.state
    implements PoolEntryRequest
{

    final ConnPoolByRoute this$0;
    final WaitingThreadAborter val$aborter;
    final HttpRoute val$route;
    final Object val$state;

    public void abortRequest()
    {
        ConnPoolByRoute.access$000(ConnPoolByRoute.this).lock();
        val$aborter.abort();
        ConnPoolByRoute.access$000(ConnPoolByRoute.this).unlock();
        return;
        Exception exception;
        exception;
        ConnPoolByRoute.access$000(ConnPoolByRoute.this).unlock();
        throw exception;
    }

    public BasicPoolEntry getPoolEntry(long l, TimeUnit timeunit)
        throws InterruptedException, ConnectionPoolTimeoutException
    {
        return getEntryBlocking(val$route, val$state, l, timeunit, val$aborter);
    }

    er()
    {
        this$0 = final_connpoolbyroute;
        val$aborter = waitingthreadaborter;
        val$route = httproute;
        val$state = Object.this;
        super();
    }
}
