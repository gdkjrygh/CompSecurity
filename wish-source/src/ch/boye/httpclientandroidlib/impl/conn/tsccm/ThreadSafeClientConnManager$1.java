// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn.tsccm;

import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.conn.ClientConnectionRequest;
import ch.boye.httpclientandroidlib.conn.ConnectionPoolTimeoutException;
import ch.boye.httpclientandroidlib.conn.ManagedClientConnection;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import java.util.concurrent.TimeUnit;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn.tsccm:
//            ThreadSafeClientConnManager, PoolEntryRequest, BasicPooledConnAdapter

class val.route
    implements ClientConnectionRequest
{

    final ThreadSafeClientConnManager this$0;
    final PoolEntryRequest val$poolRequest;
    final HttpRoute val$route;

    public void abortRequest()
    {
        val$poolRequest.abortRequest();
    }

    public ManagedClientConnection getConnection(long l, TimeUnit timeunit)
        throws InterruptedException, ConnectionPoolTimeoutException
    {
        if (val$route == null)
        {
            throw new IllegalArgumentException("Route may not be null.");
        }
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Get connection: ").append(val$route).append(", timeout = ").append(l).toString());
        }
        timeunit = val$poolRequest.getPoolEntry(l, timeunit);
        return new BasicPooledConnAdapter(ThreadSafeClientConnManager.this, timeunit);
    }

    ()
    {
        this$0 = final_threadsafeclientconnmanager;
        val$poolRequest = poolentryrequest;
        val$route = HttpRoute.this;
        super();
    }
}
