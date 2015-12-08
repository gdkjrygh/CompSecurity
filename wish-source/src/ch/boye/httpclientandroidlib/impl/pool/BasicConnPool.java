// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.pool;

import ch.boye.httpclientandroidlib.HttpClientConnection;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.pool.AbstractConnPool;
import ch.boye.httpclientandroidlib.pool.ConnFactory;
import ch.boye.httpclientandroidlib.pool.PoolEntry;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.pool:
//            BasicConnFactory, BasicPoolEntry

public class BasicConnPool extends AbstractConnPool
{

    private static AtomicLong COUNTER = new AtomicLong();

    public BasicConnPool(HttpParams httpparams)
    {
        super(new BasicConnFactory(httpparams), 2, 20);
    }

    public BasicConnPool(ConnFactory connfactory)
    {
        super(connfactory, 2, 20);
    }

    protected BasicPoolEntry createEntry(HttpHost httphost, HttpClientConnection httpclientconnection)
    {
        return new BasicPoolEntry(Long.toString(COUNTER.getAndIncrement()), httphost, httpclientconnection);
    }

    protected volatile PoolEntry createEntry(Object obj, Object obj1)
    {
        return createEntry((HttpHost)obj, (HttpClientConnection)obj1);
    }

}
