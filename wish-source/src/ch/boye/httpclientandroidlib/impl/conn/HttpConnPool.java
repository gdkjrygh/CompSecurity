// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.conn.OperatedClientConnection;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.pool.AbstractConnPool;
import ch.boye.httpclientandroidlib.pool.ConnFactory;
import ch.boye.httpclientandroidlib.pool.PoolEntry;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn:
//            HttpPoolEntry, DefaultClientConnection

class HttpConnPool extends AbstractConnPool
{
    static class InternalConnFactory
        implements ConnFactory
    {

        public OperatedClientConnection create(HttpRoute httproute)
            throws IOException
        {
            return new DefaultClientConnection();
        }

        public volatile Object create(Object obj)
            throws IOException
        {
            return create((HttpRoute)obj);
        }

        InternalConnFactory()
        {
        }
    }


    private static AtomicLong COUNTER = new AtomicLong();
    public HttpClientAndroidLog log;
    private final long timeToLive;
    private final TimeUnit tunit;

    public HttpConnPool(HttpClientAndroidLog httpclientandroidlog, int i, int j, long l, TimeUnit timeunit)
    {
        super(new InternalConnFactory(), i, j);
        log = httpclientandroidlog;
        timeToLive = l;
        tunit = timeunit;
    }

    protected HttpPoolEntry createEntry(HttpRoute httproute, OperatedClientConnection operatedclientconnection)
    {
        String s = Long.toString(COUNTER.getAndIncrement());
        return new HttpPoolEntry(log, s, httproute, operatedclientconnection, timeToLive, tunit);
    }

    protected volatile PoolEntry createEntry(Object obj, Object obj1)
    {
        return createEntry((HttpRoute)obj, (OperatedClientConnection)obj1);
    }

}
