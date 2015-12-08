// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntry;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheStorage;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheUpdateCallback;
import ch.boye.httpclientandroidlib.client.cache.Resource;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client.cache:
//            CacheMap, CacheConfig, ResourceReference

public class ManagedHttpCacheStorage
    implements HttpCacheStorage
{

    private final CacheMap entries;
    private final ReferenceQueue morque = new ReferenceQueue();
    private final Set resources = new HashSet();
    private volatile boolean shutdown;

    public ManagedHttpCacheStorage(CacheConfig cacheconfig)
    {
        entries = new CacheMap(cacheconfig.getMaxCacheEntries());
    }

    private void ensureValidState()
        throws IllegalStateException
    {
        if (shutdown)
        {
            throw new IllegalStateException("Cache has been shut down");
        } else
        {
            return;
        }
    }

    private void keepResourceReference(HttpCacheEntry httpcacheentry)
    {
        if (httpcacheentry.getResource() != null)
        {
            httpcacheentry = new ResourceReference(httpcacheentry, morque);
            resources.add(httpcacheentry);
        }
    }

    public void cleanResources()
    {
        if (!shutdown) goto _L2; else goto _L1
_L1:
        ResourceReference resourcereference;
        return;
_L2:
        if ((resourcereference = (ResourceReference)morque.poll()) == null)
        {
            break; /* Loop/switch isn't completed */
        }
        this;
        JVM INSTR monitorenter ;
        resources.remove(resourcereference);
        this;
        JVM INSTR monitorexit ;
        resourcereference.getResource().dispose();
        if (true) goto _L2; else goto _L3
_L3:
        if (true) goto _L1; else goto _L4
_L4:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public HttpCacheEntry getEntry(String s)
        throws IOException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("URL may not be null");
        }
        ensureValidState();
        this;
        JVM INSTR monitorenter ;
        s = (HttpCacheEntry)entries.get(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void putEntry(String s, HttpCacheEntry httpcacheentry)
        throws IOException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("URL may not be null");
        }
        if (httpcacheentry == null)
        {
            throw new IllegalArgumentException("Cache entry may not be null");
        }
        ensureValidState();
        this;
        JVM INSTR monitorenter ;
        entries.put(s, httpcacheentry);
        keepResourceReference(httpcacheentry);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void removeEntry(String s)
        throws IOException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("URL may not be null");
        }
        ensureValidState();
        this;
        JVM INSTR monitorenter ;
        entries.remove(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void shutdown()
    {
        if (shutdown)
        {
            return;
        }
        shutdown = true;
        this;
        JVM INSTR monitorenter ;
        entries.clear();
        for (Iterator iterator = resources.iterator(); iterator.hasNext(); ((ResourceReference)iterator.next()).getResource().dispose()) { }
        break MISSING_BLOCK_LABEL_66;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        resources.clear();
        while (morque.poll() != null) ;
        this;
        JVM INSTR monitorexit ;
    }

    public void updateEntry(String s, HttpCacheUpdateCallback httpcacheupdatecallback)
        throws IOException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("URL may not be null");
        }
        if (httpcacheupdatecallback == null)
        {
            throw new IllegalArgumentException("Callback may not be null");
        }
        ensureValidState();
        this;
        JVM INSTR monitorenter ;
        HttpCacheEntry httpcacheentry;
        httpcacheentry = (HttpCacheEntry)entries.get(s);
        httpcacheupdatecallback = httpcacheupdatecallback.update(httpcacheentry);
        entries.put(s, httpcacheupdatecallback);
        if (httpcacheentry == httpcacheupdatecallback)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        keepResourceReference(httpcacheupdatecallback);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }
}
