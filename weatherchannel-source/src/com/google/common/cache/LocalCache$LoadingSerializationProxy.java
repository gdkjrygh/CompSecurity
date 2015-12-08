// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.cache:
//            LoadingCache, LocalCache, CacheBuilder

static final class init> extends init>
    implements LoadingCache, Serializable
{

    private static final long serialVersionUID = 1L;
    transient LoadingCache autoDelegate;

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        autoDelegate = recreateCacheBuilder().build(loader);
    }

    private Object readResolve()
    {
        return autoDelegate;
    }

    public final Object apply(Object obj)
    {
        return autoDelegate.apply(obj);
    }

    public Object get(Object obj)
        throws ExecutionException
    {
        return autoDelegate.get(obj);
    }

    public ImmutableMap getAll(Iterable iterable)
        throws ExecutionException
    {
        return autoDelegate.getAll(iterable);
    }

    public Object getUnchecked(Object obj)
    {
        return autoDelegate.getUnchecked(obj);
    }

    public void refresh(Object obj)
    {
        autoDelegate.refresh(obj);
    }

    (LocalCache localcache)
    {
        super(localcache);
    }
}
