// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.util.concurrent:
//            MoreExecutors, ListenableFuture, Uninterruptibles, SerializingExecutor, 
//            AsyncSettableFuture, ExecutionError, UncheckedExecutionException, AsyncFunction, 
//            FutureCallback, CheckedFuture, AbstractFuture, FutureFallback, 
//            ListenableFutureTask, AbstractCheckedFuture

public final class Futures
{
    private static class ChainingListenableFuture extends AbstractFuture
        implements Runnable
    {

        private AsyncFunction function;
        private ListenableFuture inputFuture;
        private volatile ListenableFuture outputFuture;

        private void cancel(Future future, boolean flag)
        {
            if (future != null)
            {
                future.cancel(flag);
            }
        }

        public boolean cancel(boolean flag)
        {
            if (super.cancel(flag))
            {
                cancel(((Future) (inputFuture)), flag);
                cancel(((Future) (outputFuture)), flag);
                return true;
            } else
            {
                return false;
            }
        }

        public void run()
        {
            Object obj = Uninterruptibles.getUninterruptibly(inputFuture);
            obj = (ListenableFuture)Preconditions.checkNotNull(function.apply(obj), "AsyncFunction may not return null.");
            outputFuture = ((ListenableFuture) (obj));
            if (!isCancelled())
            {
                break MISSING_BLOCK_LABEL_105;
            }
            ((ListenableFuture) (obj)).cancel(wasInterrupted());
            outputFuture = null;
            function = null;
            inputFuture = null;
            return;
            obj;
            cancel(false);
            function = null;
            inputFuture = null;
            return;
            obj;
            setException(((ExecutionException) (obj)).getCause());
            function = null;
            inputFuture = null;
            return;
            ((ListenableFuture) (obj)).addListener(((_cls1) (obj)). new Runnable() {

                final ChainingListenableFuture this$0;
                final ListenableFuture val$outputFuture;

                public void run()
                {
                    set(Uninterruptibles.getUninterruptibly(outputFuture));
                    ChainingListenableFuture.this.outputFuture = null;
                    return;
                    Object obj;
                    obj;
                    cancel(false);
                    ChainingListenableFuture.this.outputFuture = null;
                    return;
                    obj;
                    setException(((ExecutionException) (obj)).getCause());
                    ChainingListenableFuture.this.outputFuture = null;
                    return;
                    obj;
                    ChainingListenableFuture.this.outputFuture = null;
                    throw obj;
                }

            
            {
                this$0 = final_chaininglistenablefuture;
                outputFuture = ListenableFuture.this;
                super();
            }
            }, MoreExecutors.directExecutor());
            function = null;
            inputFuture = null;
            return;
            Object obj1;
            obj1;
            setException(((UndeclaredThrowableException) (obj1)).getCause());
            function = null;
            inputFuture = null;
            return;
            obj1;
            setException(((Throwable) (obj1)));
            function = null;
            inputFuture = null;
            return;
            obj1;
            function = null;
            inputFuture = null;
            throw obj1;
        }


/*
        static ListenableFuture access$302(ChainingListenableFuture chaininglistenablefuture, ListenableFuture listenablefuture)
        {
            chaininglistenablefuture.outputFuture = listenablefuture;
            return listenablefuture;
        }

*/

        private ChainingListenableFuture(AsyncFunction asyncfunction, ListenableFuture listenablefuture)
        {
            function = (AsyncFunction)Preconditions.checkNotNull(asyncfunction);
            inputFuture = (ListenableFuture)Preconditions.checkNotNull(listenablefuture);
        }

    }

    private static class CombinedFuture extends AbstractFuture
    {

        private static final Logger logger = Logger.getLogger(com/google/common/util/concurrent/Futures$CombinedFuture.getName());
        final boolean allMustSucceed;
        FutureCombiner combiner;
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
                FutureCombiner futurecombiner = combiner;
                if (futurecombiner != null && list != null)
                {
                    set(futurecombiner.combine(list));
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

                final CombinedFuture this$0;

                public void run()
                {
                    if (isCancelled())
                    {
                        for (Iterator iterator = futures.iterator(); iterator.hasNext(); ((ListenableFuture)iterator.next()).cancel(wasInterrupted())) { }
                    }
                    futures = null;
                    values = null;
                    combiner = null;
                }

            
            {
                this$0 = CombinedFuture.this;
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
                    ListenableFuture listenablefuture = (ListenableFuture)iterator.next();
                    listenablefuture.addListener(listenablefuture. new Runnable() {

                        final CombinedFuture this$0;
                        final int val$index;
                        final ListenableFuture val$listenable;

                        public void run()
                        {
                            setOneValue(index, listenable);
                        }

            
            {
                this$0 = final_combinedfuture;
                index = i;
                listenable = ListenableFuture.this;
                super();
            }
                    }, executor);
                    index++;
                }
            }
        }



        CombinedFuture(ImmutableCollection immutablecollection, boolean flag, Executor executor, FutureCombiner futurecombiner)
        {
            futures = immutablecollection;
            allMustSucceed = flag;
            remaining = new AtomicInteger(immutablecollection.size());
            combiner = futurecombiner;
            values = Lists.newArrayListWithCapacity(immutablecollection.size());
            init(executor);
        }
    }

    private static final class CombinerFuture extends ListenableFutureTask
    {

        ImmutableList futures;

        public boolean cancel(boolean flag)
        {
            Object obj = futures;
            if (super.cancel(flag))
            {
                for (obj = ((ImmutableList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((ListenableFuture)((Iterator) (obj)).next()).cancel(flag)) { }
                return true;
            } else
            {
                return false;
            }
        }

        protected void done()
        {
            super.done();
            futures = null;
        }

        protected void setException(Throwable throwable)
        {
            super.setException(throwable);
        }

        CombinerFuture(Callable callable, ImmutableList immutablelist)
        {
            super(callable);
            futures = immutablelist;
        }
    }

    private static class FallbackFuture extends AbstractFuture
    {

        private volatile ListenableFuture running;

        public boolean cancel(boolean flag)
        {
            if (super.cancel(flag))
            {
                running.cancel(flag);
                return true;
            } else
            {
                return false;
            }
        }



/*
        static ListenableFuture access$102(FallbackFuture fallbackfuture, ListenableFuture listenablefuture)
        {
            fallbackfuture.running = listenablefuture;
            return listenablefuture;
        }

*/

        FallbackFuture(ListenableFuture listenablefuture, FutureFallback futurefallback, Executor executor)
        {
            running = listenablefuture;
            Futures.addCallback(running, futurefallback. new _cls1(), executor);
        }
    }

    private static interface FutureCombiner
    {

        public abstract Object combine(List list);
    }

    private static class ImmediateCancelledFuture extends ImmediateFuture
    {

        private final CancellationException thrown = new CancellationException("Immediate cancelled future.");

        public Object get()
        {
            throw AbstractFuture.cancellationExceptionWithCause("Task was cancelled.", thrown);
        }

        public boolean isCancelled()
        {
            return true;
        }

        ImmediateCancelledFuture()
        {
        }
    }

    private static class ImmediateFailedCheckedFuture extends ImmediateFuture
        implements CheckedFuture
    {

        private final Exception thrown;

        public Object checkedGet()
            throws Exception
        {
            throw thrown;
        }

        public Object checkedGet(long l, TimeUnit timeunit)
            throws Exception
        {
            Preconditions.checkNotNull(timeunit);
            throw thrown;
        }

        public Object get()
            throws ExecutionException
        {
            throw new ExecutionException(thrown);
        }

        ImmediateFailedCheckedFuture(Exception exception)
        {
            thrown = exception;
        }
    }

    private static class ImmediateFailedFuture extends ImmediateFuture
    {

        private final Throwable thrown;

        public Object get()
            throws ExecutionException
        {
            throw new ExecutionException(thrown);
        }

        ImmediateFailedFuture(Throwable throwable)
        {
            thrown = throwable;
        }
    }

    private static abstract class ImmediateFuture
        implements ListenableFuture
    {

        private static final Logger log = Logger.getLogger(com/google/common/util/concurrent/Futures$ImmediateFuture.getName());

        public void addListener(Runnable runnable, Executor executor)
        {
            Preconditions.checkNotNull(runnable, "Runnable was null.");
            Preconditions.checkNotNull(executor, "Executor was null.");
            try
            {
                executor.execute(runnable);
                return;
            }
            catch (RuntimeException runtimeexception)
            {
                Logger logger = log;
                Level level = Level.SEVERE;
                runnable = String.valueOf(String.valueOf(runnable));
                executor = String.valueOf(String.valueOf(executor));
                logger.log(level, (new StringBuilder(runnable.length() + 57 + executor.length())).append("RuntimeException while executing runnable ").append(runnable).append(" with executor ").append(executor).toString(), runtimeexception);
                return;
            }
        }

        public boolean cancel(boolean flag)
        {
            return false;
        }

        public abstract Object get()
            throws ExecutionException;

        public Object get(long l, TimeUnit timeunit)
            throws ExecutionException
        {
            Preconditions.checkNotNull(timeunit);
            return get();
        }

        public boolean isCancelled()
        {
            return false;
        }

        public boolean isDone()
        {
            return true;
        }


        private ImmediateFuture()
        {
        }

    }

    private static class ImmediateSuccessfulCheckedFuture extends ImmediateFuture
        implements CheckedFuture
    {

        private final Object value;

        public Object checkedGet()
        {
            return value;
        }

        public Object checkedGet(long l, TimeUnit timeunit)
        {
            Preconditions.checkNotNull(timeunit);
            return value;
        }

        public Object get()
        {
            return value;
        }

        ImmediateSuccessfulCheckedFuture(Object obj)
        {
            value = obj;
        }
    }

    private static class ImmediateSuccessfulFuture extends ImmediateFuture
    {

        private final Object value;

        public Object get()
        {
            return value;
        }

        ImmediateSuccessfulFuture(Object obj)
        {
            value = obj;
        }
    }

    private static class MappingCheckedFuture extends AbstractCheckedFuture
    {

        final Function mapper;

        protected Exception mapException(Exception exception)
        {
            return (Exception)mapper.apply(exception);
        }

        MappingCheckedFuture(ListenableFuture listenablefuture, Function function)
        {
            super(listenablefuture);
            mapper = (Function)Preconditions.checkNotNull(function);
        }
    }

    private static class NonCancellationPropagatingFuture extends AbstractFuture
    {

        NonCancellationPropagatingFuture(ListenableFuture listenablefuture)
        {
            Preconditions.checkNotNull(listenablefuture);
            Futures.addCallback(listenablefuture, listenablefuture. new _cls1(), MoreExecutors.directExecutor());
        }
    }

    private static final class WrappedCombiner
        implements Callable
    {

        final Callable _flddelegate;
        CombinerFuture outputFuture;

        public Object call()
            throws Exception
        {
            Object obj = _flddelegate.call();
            return obj;
            Object obj1;
            obj1;
            outputFuture.setException(((ExecutionException) (obj1)).getCause());
_L2:
            return null;
            obj1;
            outputFuture.cancel(false);
            if (true) goto _L2; else goto _L1
_L1:
        }

        WrappedCombiner(Callable callable)
        {
            _flddelegate = (Callable)Preconditions.checkNotNull(callable);
        }
    }


    private static final AsyncFunction DEREFERENCER = new AsyncFunction() {

        public ListenableFuture apply(ListenableFuture listenablefuture)
        {
            return listenablefuture;
        }

        public volatile ListenableFuture apply(Object obj)
            throws Exception
        {
            return apply((ListenableFuture)obj);
        }

    };
    private static final Ordering WITH_STRING_PARAM_FIRST = Ordering.natural().onResultOf(new Function() {

        public Boolean apply(Constructor constructor)
        {
            return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(java/lang/String));
        }

        public volatile Object apply(Object obj)
        {
            return apply((Constructor)obj);
        }

    }).reverse();

    private Futures()
    {
    }

    public static void addCallback(ListenableFuture listenablefuture, FutureCallback futurecallback)
    {
        addCallback(listenablefuture, futurecallback, MoreExecutors.directExecutor());
    }

    public static void addCallback(ListenableFuture listenablefuture, FutureCallback futurecallback, Executor executor)
    {
        Preconditions.checkNotNull(futurecallback);
        listenablefuture.addListener(new Runnable(listenablefuture, futurecallback) {

            final FutureCallback val$callback;
            final ListenableFuture val$future;

            public void run()
            {
                Object obj;
                try
                {
                    obj = Uninterruptibles.getUninterruptibly(future);
                }
                catch (ExecutionException executionexception)
                {
                    callback.onFailure(executionexception.getCause());
                    return;
                }
                catch (RuntimeException runtimeexception)
                {
                    callback.onFailure(runtimeexception);
                    return;
                }
                catch (Error error)
                {
                    callback.onFailure(error);
                    return;
                }
                callback.onSuccess(obj);
            }

            
            {
                future = listenablefuture;
                callback = futurecallback;
                super();
            }
        }, executor);
    }

    public static ListenableFuture allAsList(Iterable iterable)
    {
        return listFuture(ImmutableList.copyOf(iterable), true, MoreExecutors.directExecutor());
    }

    public static transient ListenableFuture allAsList(ListenableFuture alistenablefuture[])
    {
        return listFuture(ImmutableList.copyOf(alistenablefuture), true, MoreExecutors.directExecutor());
    }

    private static AsyncFunction asAsyncFunction(Function function)
    {
        return new AsyncFunction(function) {

            final Function val$function;

            public ListenableFuture apply(Object obj)
            {
                return Futures.immediateFuture(function.apply(obj));
            }

            
            {
                function = function1;
                super();
            }
        };
    }

    public static ListenableFuture dereference(ListenableFuture listenablefuture)
    {
        return transform(listenablefuture, DEREFERENCER);
    }

    public static Object get(Future future, long l, TimeUnit timeunit, Class class1)
        throws Exception
    {
        Preconditions.checkNotNull(future);
        Preconditions.checkNotNull(timeunit);
        boolean flag;
        if (!java/lang/RuntimeException.isAssignableFrom(class1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Futures.get exception type (%s) must not be a RuntimeException", new Object[] {
            class1
        });
        try
        {
            future = ((Future) (future.get(l, timeunit)));
        }
        // Misplaced declaration of an exception variable
        catch (Future future)
        {
            Thread.currentThread().interrupt();
            throw newWithCause(class1, future);
        }
        // Misplaced declaration of an exception variable
        catch (Future future)
        {
            throw newWithCause(class1, future);
        }
        // Misplaced declaration of an exception variable
        catch (Future future)
        {
            wrapAndThrowExceptionOrError(future.getCause(), class1);
            throw new AssertionError();
        }
        return future;
    }

    public static Object get(Future future, Class class1)
        throws Exception
    {
        Preconditions.checkNotNull(future);
        boolean flag;
        if (!java/lang/RuntimeException.isAssignableFrom(class1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Futures.get exception type (%s) must not be a RuntimeException", new Object[] {
            class1
        });
        try
        {
            future = ((Future) (future.get()));
        }
        // Misplaced declaration of an exception variable
        catch (Future future)
        {
            Thread.currentThread().interrupt();
            throw newWithCause(class1, future);
        }
        // Misplaced declaration of an exception variable
        catch (Future future)
        {
            wrapAndThrowExceptionOrError(future.getCause(), class1);
            throw new AssertionError();
        }
        return future;
    }

    public static Object getUnchecked(Future future)
    {
        Preconditions.checkNotNull(future);
        try
        {
            future = ((Future) (Uninterruptibles.getUninterruptibly(future)));
        }
        // Misplaced declaration of an exception variable
        catch (Future future)
        {
            wrapAndThrowUnchecked(future.getCause());
            throw new AssertionError();
        }
        return future;
    }

    public static ListenableFuture immediateCancelledFuture()
    {
        return new ImmediateCancelledFuture();
    }

    public static CheckedFuture immediateCheckedFuture(Object obj)
    {
        return new ImmediateSuccessfulCheckedFuture(obj);
    }

    public static CheckedFuture immediateFailedCheckedFuture(Exception exception)
    {
        Preconditions.checkNotNull(exception);
        return new ImmediateFailedCheckedFuture(exception);
    }

    public static ListenableFuture immediateFailedFuture(Throwable throwable)
    {
        Preconditions.checkNotNull(throwable);
        return new ImmediateFailedFuture(throwable);
    }

    public static ListenableFuture immediateFuture(Object obj)
    {
        return new ImmediateSuccessfulFuture(obj);
    }

    public static ImmutableList inCompletionOrder(Iterable iterable)
    {
        ConcurrentLinkedQueue concurrentlinkedqueue = Queues.newConcurrentLinkedQueue();
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        SerializingExecutor serializingexecutor = new SerializingExecutor(MoreExecutors.directExecutor());
        AsyncSettableFuture asyncsettablefuture;
        for (iterable = iterable.iterator(); iterable.hasNext(); builder.add(asyncsettablefuture))
        {
            ListenableFuture listenablefuture = (ListenableFuture)iterable.next();
            asyncsettablefuture = AsyncSettableFuture.create();
            concurrentlinkedqueue.add(asyncsettablefuture);
            listenablefuture.addListener(new Runnable(concurrentlinkedqueue, listenablefuture) {

                final ConcurrentLinkedQueue val$delegates;
                final ListenableFuture val$future;

                public void run()
                {
                    ((AsyncSettableFuture)delegates.remove()).setFuture(future);
                }

            
            {
                delegates = concurrentlinkedqueue;
                future = listenablefuture;
                super();
            }
            }, serializingexecutor);
        }

        return builder.build();
    }

    public static Future lazyTransform(Future future, Function function)
    {
        Preconditions.checkNotNull(future);
        Preconditions.checkNotNull(function);
        return new Future(future, function) {

            final Function val$function;
            final Future val$input;

            private Object applyTransformation(Object obj)
                throws ExecutionException
            {
                try
                {
                    obj = function.apply(obj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw new ExecutionException(((Throwable) (obj)));
                }
                return obj;
            }

            public boolean cancel(boolean flag)
            {
                return input.cancel(flag);
            }

            public Object get()
                throws InterruptedException, ExecutionException
            {
                return applyTransformation(input.get());
            }

            public Object get(long l, TimeUnit timeunit)
                throws InterruptedException, ExecutionException, TimeoutException
            {
                return applyTransformation(input.get(l, timeunit));
            }

            public boolean isCancelled()
            {
                return input.isCancelled();
            }

            public boolean isDone()
            {
                return input.isDone();
            }

            
            {
                input = future;
                function = function1;
                super();
            }
        };
    }

    private static ListenableFuture listFuture(ImmutableList immutablelist, boolean flag, Executor executor)
    {
        return new CombinedFuture(immutablelist, flag, executor, new FutureCombiner() {

            public volatile Object combine(List list)
            {
                return combine(list);
            }

            public List combine(List list)
            {
                java.util.ArrayList arraylist = Lists.newArrayList();
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) 
                {
                    list = (Optional)iterator.next();
                    if (list != null)
                    {
                        list = ((List) (list.orNull()));
                    } else
                    {
                        list = null;
                    }
                    arraylist.add(list);
                }
                return Collections.unmodifiableList(arraylist);
            }

        });
    }

    public static CheckedFuture makeChecked(ListenableFuture listenablefuture, Function function)
    {
        return new MappingCheckedFuture((ListenableFuture)Preconditions.checkNotNull(listenablefuture), function);
    }

    private static Object newFromConstructor(Constructor constructor, Throwable throwable)
    {
label0:
        {
            Object obj1 = null;
            Class aclass[] = constructor.getParameterTypes();
            Object aobj[] = new Object[aclass.length];
            int i = 0;
            Object obj;
            while (i < aclass.length) 
            {
                Class class1 = aclass[i];
                if (class1.equals(java/lang/String))
                {
                    aobj[i] = throwable.toString();
                } else
                {
                    obj = obj1;
                    if (!class1.equals(java/lang/Throwable))
                    {
                        break label0;
                    }
                    aobj[i] = throwable;
                }
                i++;
            }
            try
            {
                obj = constructor.newInstance(aobj);
            }
            // Misplaced declaration of an exception variable
            catch (Constructor constructor)
            {
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Constructor constructor)
            {
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Constructor constructor)
            {
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Constructor constructor)
            {
                return null;
            }
        }
        return obj;
    }

    private static Exception newWithCause(Class class1, Throwable throwable)
    {
        for (Iterator iterator = preferringStrings(Arrays.asList(class1.getConstructors())).iterator(); iterator.hasNext();)
        {
            Exception exception = (Exception)newFromConstructor((Constructor)iterator.next(), throwable);
            if (exception != null)
            {
                if (exception.getCause() == null)
                {
                    exception.initCause(throwable);
                }
                return exception;
            }
        }

        class1 = String.valueOf(String.valueOf(class1));
        throw new IllegalArgumentException((new StringBuilder(class1.length() + 82)).append("No appropriate constructor for exception of type ").append(class1).append(" in response to chained exception").toString(), throwable);
    }

    public static ListenableFuture nonCancellationPropagating(ListenableFuture listenablefuture)
    {
        return new NonCancellationPropagatingFuture(listenablefuture);
    }

    private static List preferringStrings(List list)
    {
        return WITH_STRING_PARAM_FIRST.sortedCopy(list);
    }

    private static Runnable rejectionPropagatingRunnable(AbstractFuture abstractfuture, Runnable runnable, Executor executor)
    {
        return new Runnable(executor, runnable, abstractfuture) {

            final Executor val$delegateExecutor;
            final Runnable val$delegateTask;
            final AbstractFuture val$outputFuture;

            public void run()
            {
                AtomicBoolean atomicboolean = new AtomicBoolean(true);
                delegateExecutor.execute(atomicboolean. new Runnable() {

                    final _cls1 this$0;
                    final AtomicBoolean val$thrownFromDelegate;

                    public void run()
                    {
                        thrownFromDelegate.set(false);
                        delegateTask.run();
                    }

            
            {
                this$0 = final__pcls1;
                thrownFromDelegate = AtomicBoolean.this;
                super();
            }
                });
_L1:
                return;
                RejectedExecutionException rejectedexecutionexception;
                rejectedexecutionexception;
                if (atomicboolean.get())
                {
                    outputFuture.setException(rejectedexecutionexception);
                    return;
                }
                  goto _L1
            }

            
            {
                delegateExecutor = executor;
                delegateTask = runnable;
                outputFuture = abstractfuture;
                super();
            }
        };
    }

    public static ListenableFuture successfulAsList(Iterable iterable)
    {
        return listFuture(ImmutableList.copyOf(iterable), false, MoreExecutors.directExecutor());
    }

    public static transient ListenableFuture successfulAsList(ListenableFuture alistenablefuture[])
    {
        return listFuture(ImmutableList.copyOf(alistenablefuture), false, MoreExecutors.directExecutor());
    }

    public static ListenableFuture transform(ListenableFuture listenablefuture, Function function)
    {
        Preconditions.checkNotNull(function);
        function = new ChainingListenableFuture(asAsyncFunction(function), listenablefuture);
        listenablefuture.addListener(function, MoreExecutors.directExecutor());
        return function;
    }

    public static ListenableFuture transform(ListenableFuture listenablefuture, Function function, Executor executor)
    {
        Preconditions.checkNotNull(function);
        return transform(listenablefuture, asAsyncFunction(function), executor);
    }

    public static ListenableFuture transform(ListenableFuture listenablefuture, AsyncFunction asyncfunction)
    {
        asyncfunction = new ChainingListenableFuture(asyncfunction, listenablefuture);
        listenablefuture.addListener(asyncfunction, MoreExecutors.directExecutor());
        return asyncfunction;
    }

    public static ListenableFuture transform(ListenableFuture listenablefuture, AsyncFunction asyncfunction, Executor executor)
    {
        Preconditions.checkNotNull(executor);
        asyncfunction = new ChainingListenableFuture(asyncfunction, listenablefuture);
        listenablefuture.addListener(rejectionPropagatingRunnable(asyncfunction, asyncfunction, executor), MoreExecutors.directExecutor());
        return asyncfunction;
    }

    public static ListenableFuture withFallback(ListenableFuture listenablefuture, FutureFallback futurefallback)
    {
        return withFallback(listenablefuture, futurefallback, MoreExecutors.directExecutor());
    }

    public static ListenableFuture withFallback(ListenableFuture listenablefuture, FutureFallback futurefallback, Executor executor)
    {
        Preconditions.checkNotNull(futurefallback);
        return new FallbackFuture(listenablefuture, futurefallback, executor);
    }

    private static void wrapAndThrowExceptionOrError(Throwable throwable, Class class1)
        throws Exception
    {
        if (throwable instanceof Error)
        {
            throw new ExecutionError((Error)throwable);
        }
        if (throwable instanceof RuntimeException)
        {
            throw new UncheckedExecutionException(throwable);
        } else
        {
            throw newWithCause(class1, throwable);
        }
    }

    private static void wrapAndThrowUnchecked(Throwable throwable)
    {
        if (throwable instanceof Error)
        {
            throw new ExecutionError((Error)throwable);
        } else
        {
            throw new UncheckedExecutionException(throwable);
        }
    }


    // Unreferenced inner class com/google/common/util/concurrent/Futures$FallbackFuture$1

/* anonymous class */
    class FallbackFuture._cls1
        implements FutureCallback
    {

        final FallbackFuture this$0;
        final FutureFallback val$fallback;

        public void onFailure(Throwable throwable)
        {
            if (isCancelled())
            {
                return;
            }
            try
            {
                running = fallback.create(throwable);
                if (isCancelled())
                {
                    running.cancel(wasInterrupted());
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                setException(throwable);
                return;
            }
            Futures.addCallback(running, new FutureCallback() {

                final FallbackFuture._cls1 this$1;

                public void onFailure(Throwable throwable)
                {
    class FallbackFuture._cls1
        implements FutureCallback
    {
                    if (running.isCancelled())
                    {
                        cancel(false);
                        return;
                    } else
                    {
                        setException(throwable);
                        return;
                    }
                }

                public void onSuccess(Object obj)
                {
                    set(obj);
                }

            
            {
                this$1 = FallbackFuture._cls1.this;
                super();
            }
            }, MoreExecutors.directExecutor());
            return;
        }

        public void onSuccess(Object obj)
        {
            set(obj);
        }

            
            {
                this$0 = final_fallbackfuture;
                fallback = FutureFallback.this;
                super();
            }
    }


    // Unreferenced inner class com/google/common/util/concurrent/Futures$NonCancellationPropagatingFuture$1

/* anonymous class */
    class NonCancellationPropagatingFuture._cls1
        implements FutureCallback
    {

        final NonCancellationPropagatingFuture this$0;
        final ListenableFuture val$delegate;

        public void onFailure(Throwable throwable)
        {
            if (delegate.isCancelled())
            {
                cancel(false);
                return;
            } else
            {
                setException(throwable);
                return;
            }
        }

        public void onSuccess(Object obj)
        {
            set(obj);
        }

            
            {
                this$0 = final_noncancellationpropagatingfuture;
                delegate = ListenableFuture.this;
                super();
            }
    }

}
