// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractFuture, Futures, Uninterruptibles, MoreExecutors, 
//            ListenableFuture

private static class init extends AbstractFuture
{

    private static final Logger logger = Logger.getLogger(com/google/common/util/concurrent/Futures$CombinedFuture.getName());
    final boolean allMustSucceed;
    _cls2.val.listenable combiner;
    ImmutableCollection futures;
    final AtomicInteger remaining;
    Set seenExceptions;
    final Object seenExceptionsLock = new Object();
    List values;

    private void setExceptionAndMaybeLog(Throwable throwable)
    {
        boolean flag1 = false;
        boolean flag = true;
        if (allMustSucceed)
        {
            flag1 = super.setException(throwable);
            synchronized (seenExceptionsLock)
            {
                if (seenExceptions == null)
                {
                    seenExceptions = Sets.newHashSet();
                }
                flag = seenExceptions.add(throwable);
            }
        }
        if ((throwable instanceof Error) || allMustSucceed && !flag1 && flag)
        {
            logger.log(Level.SEVERE, "input future failed.", throwable);
        }
        return;
        throwable;
        obj;
        JVM INSTR monitorexit ;
        throw throwable;
    }

    private void setOneValue(int i, Future future)
    {
        List list;
        boolean flag;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        flag6 = true;
        flag7 = true;
        flag8 = true;
        flag9 = true;
        boolean flag5 = true;
        list = values;
        if (isDone() || list == null)
        {
            if (allMustSucceed || isCancelled())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Future was done before all dependencies completed");
        }
        Preconditions.checkState(future.isDone(), "Tried to set value from future which is not done");
        future = ((Future) (Uninterruptibles.getUninterruptibly(future)));
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        list.set(i, Optional.fromNullable(future));
        i = remaining.decrementAndGet();
        if (i >= 0)
        {
            flag = flag5;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Less than 0 remaining futures");
        if (i != 0) goto _L2; else goto _L1
_L1:
        future = combiner;
        if (future == null || list == null) goto _L4; else goto _L3
_L3:
        set(future.combine(list));
_L2:
        return;
_L4:
        Preconditions.checkState(isDone());
        return;
        future;
        if (allMustSucceed)
        {
            cancel(false);
        }
        i = remaining.decrementAndGet();
        boolean flag1;
        if (i >= 0)
        {
            flag1 = flag6;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkState(flag1, "Less than 0 remaining futures");
        if (i != 0) goto _L2; else goto _L5
_L5:
        future = combiner;
        if (future != null && list != null)
        {
            set(future.combine(list));
            return;
        } else
        {
            Preconditions.checkState(isDone());
            return;
        }
        future;
        setExceptionAndMaybeLog(future.getCause());
        i = remaining.decrementAndGet();
        boolean flag2;
        if (i >= 0)
        {
            flag2 = flag7;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkState(flag2, "Less than 0 remaining futures");
        if (i != 0) goto _L2; else goto _L6
_L6:
        future = combiner;
        if (future != null && list != null)
        {
            set(future.combine(list));
            return;
        } else
        {
            Preconditions.checkState(isDone());
            return;
        }
        future;
        setExceptionAndMaybeLog(future);
        i = remaining.decrementAndGet();
        boolean flag3;
        if (i >= 0)
        {
            flag3 = flag8;
        } else
        {
            flag3 = false;
        }
        Preconditions.checkState(flag3, "Less than 0 remaining futures");
        if (i != 0) goto _L2; else goto _L7
_L7:
        future = combiner;
        if (future != null && list != null)
        {
            set(future.combine(list));
            return;
        } else
        {
            Preconditions.checkState(isDone());
            return;
        }
        future;
        i = remaining.decrementAndGet();
        boolean flag4;
        if (i >= 0)
        {
            flag4 = flag9;
        } else
        {
            flag4 = false;
        }
        Preconditions.checkState(flag4, "Less than 0 remaining futures");
        if (i == 0)
        {
            logger logger1 = combiner;
            if (logger1 != null && list != null)
            {
                set(logger1.combine(list));
            } else
            {
                Preconditions.checkState(isDone());
            }
        }
        throw future;
    }

    protected void init(Executor executor)
    {
        addListener(new Runnable() {

            final Futures.CombinedFuture this$0;

            public void run()
            {
                if (isCancelled())
                {
                    for (Iterator iterator1 = futures.iterator(); iterator1.hasNext(); ((ListenableFuture)iterator1.next()).cancel(wasInterrupted())) { }
                }
                futures = null;
                values = null;
                combiner = null;
            }

            
            {
                this$0 = Futures.CombinedFuture.this;
                super();
            }
        }, MoreExecutors.directExecutor());
        if (futures.isEmpty())
        {
            set(combiner.combine(ImmutableList.of()));
        } else
        {
            for (int i = 0; i < futures.size(); i++)
            {
                values.add(null);
            }

            final int index = 0;
            Iterator iterator = futures.iterator();
            while (iterator.hasNext()) 
            {
                final ListenableFuture listenable = (ListenableFuture)iterator.next();
                listenable.addListener(new Runnable() {

                    final Futures.CombinedFuture this$0;
                    final int val$index;
                    final ListenableFuture val$listenable;

                    public void run()
                    {
                        setOneValue(index, listenable);
                    }

            
            {
                this$0 = Futures.CombinedFuture.this;
                index = i;
                listenable = listenablefuture;
                super();
            }
                }, executor);
                index++;
            }
        }
    }



    _cls2.val.listenable(ImmutableCollection immutablecollection, boolean flag, Executor executor, _cls2.val.listenable listenable)
    {
        futures = immutablecollection;
        allMustSucceed = flag;
        remaining = new AtomicInteger(immutablecollection.size());
        combiner = listenable;
        values = Lists.newArrayListWithCapacity(immutablecollection.size());
        init(executor);
    }
}
