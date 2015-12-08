// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public abstract class CacheLoader
{
    private static final class FunctionToCacheLoader extends CacheLoader
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Function computingFunction;

        public Object load(Object obj)
        {
            return computingFunction.apply(Preconditions.checkNotNull(obj));
        }

        public FunctionToCacheLoader(Function function)
        {
            computingFunction = (Function)Preconditions.checkNotNull(function);
        }
    }

    public static final class InvalidCacheLoadException extends RuntimeException
    {

        public InvalidCacheLoadException(String s)
        {
            super(s);
        }
    }

    private static final class SupplierToCacheLoader extends CacheLoader
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Supplier computingSupplier;

        public Object load(Object obj)
        {
            Preconditions.checkNotNull(obj);
            return computingSupplier.get();
        }

        public SupplierToCacheLoader(Supplier supplier)
        {
            computingSupplier = (Supplier)Preconditions.checkNotNull(supplier);
        }
    }

    static final class UnsupportedLoadingOperationException extends UnsupportedOperationException
    {

        UnsupportedLoadingOperationException()
        {
        }
    }


    protected CacheLoader()
    {
    }

    public static CacheLoader asyncReloading(CacheLoader cacheloader, Executor executor)
    {
        Preconditions.checkNotNull(cacheloader);
        Preconditions.checkNotNull(executor);
        return new CacheLoader(cacheloader, executor) {

            final Executor val$executor;
            final CacheLoader val$loader;

            public Object load(Object obj)
                throws Exception
            {
                return loader.load(obj);
            }

            public Map loadAll(Iterable iterable)
                throws Exception
            {
                return loader.loadAll(iterable);
            }

            public ListenableFuture reload(final Object key, Object obj)
                throws Exception
            {
                key = ListenableFutureTask.create(((_cls1) (obj)). new Callable() {

                    final _cls1 this$0;
                    final Object val$key;
                    final Object val$oldValue;

                    public Object call()
                        throws Exception
                    {
                        return loader.reload(key, oldValue).get();
                    }

            
            {
                this$0 = final__pcls1;
                key = obj;
                oldValue = Object.this;
                super();
            }
                });
                executor.execute(((Runnable) (key)));
                return ((ListenableFuture) (key));
            }

            
            {
                loader = cacheloader;
                executor = executor1;
                super();
            }
        };
    }

    public static CacheLoader from(Function function)
    {
        return new FunctionToCacheLoader(function);
    }

    public static CacheLoader from(Supplier supplier)
    {
        return new SupplierToCacheLoader(supplier);
    }

    public abstract Object load(Object obj)
        throws Exception;

    public Map loadAll(Iterable iterable)
        throws Exception
    {
        throw new UnsupportedLoadingOperationException();
    }

    public ListenableFuture reload(Object obj, Object obj1)
        throws Exception
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        return Futures.immediateFuture(load(obj));
    }
}
