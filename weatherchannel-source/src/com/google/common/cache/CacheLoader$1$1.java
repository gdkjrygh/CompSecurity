// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.common.cache:
//            CacheLoader

class val.oldValue
    implements Callable
{

    final ableFuture.get this$0;
    final Object val$key;
    final Object val$oldValue;

    public Object call()
        throws Exception
    {
        return loader.reload(val$key, val$oldValue).get();
    }

    t>()
    {
        this$0 = final_t>;
        val$key = obj;
        val$oldValue = Object.this;
        super();
    }

    // Unreferenced inner class com/google/common/cache/CacheLoader$1

/* anonymous class */
    static final class CacheLoader._cls1 extends CacheLoader
    {

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
            key = ListenableFutureTask.create(((CacheLoader._cls1._cls1) (obj)). new CacheLoader._cls1._cls1());
            executor.execute(((Runnable) (key)));
            return ((ListenableFuture) (key));
        }

            
            {
                loader = cacheloader;
                executor = executor1;
                super();
            }
    }

}
