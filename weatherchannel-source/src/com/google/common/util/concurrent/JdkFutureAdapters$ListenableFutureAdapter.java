// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.common.util.concurrent:
//            ForwardingFuture, ListenableFuture, JdkFutureAdapters, ThreadFactoryBuilder, 
//            ExecutionList, Uninterruptibles

private static class adapterExecutor extends ForwardingFuture
    implements ListenableFuture
{

    private static final Executor defaultAdapterExecutor;
    private static final ThreadFactory threadFactory;
    private final Executor adapterExecutor;
    private final Future _flddelegate;
    private final ExecutionList executionList;
    private final AtomicBoolean hasListeners;

    public void addListener(Runnable runnable, Executor executor)
    {
label0:
        {
            executionList.add(runnable, executor);
            if (hasListeners.compareAndSet(false, true))
            {
                if (!_flddelegate.isDone())
                {
                    break label0;
                }
                executionList.execute();
            }
            return;
        }
        adapterExecutor.execute(new Runnable() {

            final JdkFutureAdapters.ListenableFutureAdapter this$0;

            public void run()
            {
                try
                {
                    Uninterruptibles.getUninterruptibly(_flddelegate);
                }
                catch (Error error)
                {
                    throw error;
                }
                catch (Throwable throwable) { }
                executionList.execute();
            }

            
            {
                this$0 = JdkFutureAdapters.ListenableFutureAdapter.this;
                super();
            }
        });
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Future _mthdelegate()
    {
        return _flddelegate;
    }

    static 
    {
        threadFactory = (new ThreadFactoryBuilder()).setDaemon(true).setNameFormat("ListenableFutureAdapter-thread-%d").build();
        defaultAdapterExecutor = Executors.newCachedThreadPool(threadFactory);
    }



    _cls1.this._cls0(Future future)
    {
        this(future, defaultAdapterExecutor);
    }

    defaultAdapterExecutor(Future future, Executor executor)
    {
        executionList = new ExecutionList();
        hasListeners = new AtomicBoolean(false);
        _flddelegate = (Future)Preconditions.checkNotNull(future);
        adapterExecutor = (Executor)Preconditions.checkNotNull(executor);
    }
}
