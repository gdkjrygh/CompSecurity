// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.Ticker;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.cache:
//            ForwardingCache, LocalCache, CacheBuilder, Cache, 
//            CacheLoader, RemovalListener, Weigher

static class <init> extends ForwardingCache
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    final int concurrencyLevel;
    transient Cache _flddelegate;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final Equivalence keyEquivalence;
    final maxWeight keyStrength;
    final CacheLoader loader;
    final long maxWeight;
    final RemovalListener removalListener;
    final Ticker ticker;
    final Equivalence valueEquivalence;
    final maxWeight valueStrength;
    final Weigher weigher;

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        _flddelegate = recreateCacheBuilder().build();
    }

    private Object readResolve()
    {
        return _flddelegate;
    }

    protected Cache _mthdelegate()
    {
        return _flddelegate;
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    CacheBuilder recreateCacheBuilder()
    {
        CacheBuilder cachebuilder;
        cachebuilder = CacheBuilder.newBuilder().setKeyStrength(keyStrength).setValueStrength(valueStrength).keyEquivalence(keyEquivalence).valueEquivalence(valueEquivalence).concurrencyLevel(concurrencyLevel).removalListener(removalListener);
        cachebuilder.strictParsing = false;
        if (expireAfterWriteNanos > 0L)
        {
            cachebuilder.expireAfterWrite(expireAfterWriteNanos, TimeUnit.NANOSECONDS);
        }
        if (expireAfterAccessNanos > 0L)
        {
            cachebuilder.expireAfterAccess(expireAfterAccessNanos, TimeUnit.NANOSECONDS);
        }
        if (weigher == weigher) goto _L2; else goto _L1
_L1:
        cachebuilder.weigher(weigher);
        if (maxWeight != -1L)
        {
            cachebuilder.maximumWeight(maxWeight);
        }
_L4:
        if (ticker != null)
        {
            cachebuilder.ticker(ticker);
        }
        return cachebuilder;
_L2:
        if (maxWeight != -1L)
        {
            cachebuilder.maximumSize(maxWeight);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private A(A a, A a1, Equivalence equivalence, Equivalence equivalence1, long l, long l1, long l2, Weigher weigher1, int i, RemovalListener removallistener, Ticker ticker1, 
            CacheLoader cacheloader)
    {
label0:
        {
            super();
            keyStrength = a;
            valueStrength = a1;
            keyEquivalence = equivalence;
            valueEquivalence = equivalence1;
            expireAfterWriteNanos = l;
            expireAfterAccessNanos = l1;
            maxWeight = l2;
            weigher = weigher1;
            concurrencyLevel = i;
            removalListener = removallistener;
            if (ticker1 != Ticker.systemTicker())
            {
                a = ticker1;
                if (ticker1 != CacheBuilder.NULL_TICKER)
                {
                    break label0;
                }
            }
            a = null;
        }
        ticker = a;
        loader = cacheloader;
    }

    loader(LocalCache localcache)
    {
        this(localcache.keyStrength, localcache.valueStrength, localcache.keyEquivalence, localcache.valueEquivalence, localcache.expireAfterWriteNanos, localcache.expireAfterAccessNanos, localcache.maxWeight, localcache.weigher, localcache.concurrencyLevel, localcache.removalListener, localcache.ticker, localcache.defaultLoader);
    }
}
