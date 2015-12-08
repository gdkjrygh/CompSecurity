// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.conn.ClientConnectionRequest;
import ch.boye.httpclientandroidlib.conn.ConnectionPoolTimeoutException;
import ch.boye.httpclientandroidlib.conn.ManagedClientConnection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn:
//            PoolingClientConnectionManager

class val.future
    implements ClientConnectionRequest
{

    final PoolingClientConnectionManager this$0;
    final Future val$future;

    public void abortRequest()
    {
        val$future.cancel(true);
    }

    public ManagedClientConnection getConnection(long l, TimeUnit timeunit)
        throws InterruptedException, ConnectionPoolTimeoutException
    {
        return leaseConnection(val$future, l, timeunit);
    }

    ()
    {
        this$0 = final_poolingclientconnectionmanager;
        val$future = Future.this;
        super();
    }
}
