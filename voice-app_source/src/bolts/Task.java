// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package bolts:
//            BoltsExecutors, AndroidExecutors, Continuation, Capture, 
//            CancellationToken, AggregateException

public class Task
{
    public class TaskCompletionSource
    {

        final Task this$0;

        public Task getTask()
        {
            return Task.this;
        }

        public void setCancelled()
        {
            if (!trySetCancelled())
            {
                throw new IllegalStateException("Cannot cancel a completed task.");
            } else
            {
                return;
            }
        }

        public void setError(Exception exception)
        {
            if (!trySetError(exception))
            {
                throw new IllegalStateException("Cannot set the error on a completed task.");
            } else
            {
                return;
            }
        }

        public void setResult(Object obj)
        {
            if (!trySetResult(obj))
            {
                throw new IllegalStateException("Cannot set the result of a completed task.");
            } else
            {
                return;
            }
        }

        public boolean trySetCancelled()
        {
label0:
            {
                synchronized (lock)
                {
                    if (!complete)
                    {
                        break label0;
                    }
                }
                return false;
            }
            complete = true;
            cancelled = true;
            lock.notifyAll();
            runContinuations();
            obj;
            JVM INSTR monitorexit ;
            return true;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean trySetError(Exception exception)
        {
label0:
            {
                synchronized (lock)
                {
                    if (!complete)
                    {
                        break label0;
                    }
                }
                return false;
            }
            complete = true;
            error = exception;
            lock.notifyAll();
            runContinuations();
            obj;
            JVM INSTR monitorexit ;
            return true;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean trySetResult(Object obj)
        {
label0:
            {
                synchronized (lock)
                {
                    if (!complete)
                    {
                        break label0;
                    }
                }
                return false;
            }
            complete = true;
            result = obj;
            lock.notifyAll();
            runContinuations();
            obj1;
            JVM INSTR monitorexit ;
            return true;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        private TaskCompletionSource()
        {
            this$0 = Task.this;
            super();
        }

    }


    public static final ExecutorService BACKGROUND_EXECUTOR = BoltsExecutors.background();
    private static final Executor IMMEDIATE_EXECUTOR = BoltsExecutors.immediate();
    public static final Executor UI_THREAD_EXECUTOR = AndroidExecutors.uiThread();
    private boolean cancelled;
    private boolean complete;
    private List continuations;
    private Exception error;
    private final Object lock = new Object();
    private Object result;

    private Task()
    {
        continuations = new ArrayList();
    }

    public static Task call(Callable callable)
    {
        return call(callable, IMMEDIATE_EXECUTOR, null);
    }

    public static Task call(Callable callable, CancellationToken cancellationtoken)
    {
        return call(callable, IMMEDIATE_EXECUTOR, cancellationtoken);
    }

    public static Task call(Callable callable, Executor executor)
    {
        return call(callable, executor, null);
    }

    public static Task call(Callable callable, Executor executor, CancellationToken cancellationtoken)
    {
        TaskCompletionSource taskcompletionsource = create();
        executor.execute(new Runnable(cancellationtoken, taskcompletionsource, callable) {

            final Callable val$callable;
            final CancellationToken val$ct;
            final TaskCompletionSource val$tcs;

            public void run()
            {
                if (ct != null && ct.isCancellationRequested())
                {
                    tcs.setCancelled();
                    return;
                }
                try
                {
                    tcs.setResult(callable.call());
                    return;
                }
                catch (CancellationException cancellationexception)
                {
                    tcs.setCancelled();
                    return;
                }
                catch (Exception exception)
                {
                    tcs.setError(exception);
                }
            }

            
            {
                ct = cancellationtoken;
                tcs = taskcompletionsource;
                callable = callable1;
                super();
            }
        });
        return taskcompletionsource.getTask();
    }

    public static Task callInBackground(Callable callable)
    {
        return call(callable, BACKGROUND_EXECUTOR, null);
    }

    public static Task callInBackground(Callable callable, CancellationToken cancellationtoken)
    {
        return call(callable, BACKGROUND_EXECUTOR, cancellationtoken);
    }

    public static Task cancelled()
    {
        TaskCompletionSource taskcompletionsource = create();
        taskcompletionsource.setCancelled();
        return taskcompletionsource.getTask();
    }

    private static void completeAfterTask(TaskCompletionSource taskcompletionsource, Continuation continuation, Task task, Executor executor, CancellationToken cancellationtoken)
    {
        executor.execute(new Runnable(cancellationtoken, taskcompletionsource, continuation, task) {

            final Continuation val$continuation;
            final CancellationToken val$ct;
            final Task val$task;
            final TaskCompletionSource val$tcs;

            public void run()
            {
                if (ct != null && ct.isCancellationRequested())
                {
                    tcs.setCancelled();
                    return;
                }
                Object obj = (Task)continuation.then(task);
                if (obj == null)
                {
                    try
                    {
                        tcs.setResult(null);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        tcs.setCancelled();
                        return;
                    }
                    catch (Exception exception)
                    {
                        tcs.setError(exception);
                    }
                    break MISSING_BLOCK_LABEL_87;
                }
                ((Task) (obj)).continueWith(new Continuation() {

                    final _cls14 this$0;

                    public volatile Object then(Task task)
                        throws Exception
                    {
                        return then(task);
                    }

                    public Void then(Task task)
                    {
                        if (ct != null && ct.isCancellationRequested())
                        {
                            tcs.setCancelled();
                            return null;
                        }
                        if (task.isCancelled())
                        {
                            tcs.setCancelled();
                            return null;
                        }
                        if (task.isFaulted())
                        {
                            tcs.setError(task.getError());
                            return null;
                        } else
                        {
                            tcs.setResult(task.getResult());
                            return null;
                        }
                    }

            
            {
                this$0 = _cls14.this;
                super();
            }
                });
                return;
            }

            
            {
                ct = cancellationtoken;
                tcs = taskcompletionsource;
                continuation = continuation1;
                task = task1;
                super();
            }
        });
    }

    private static void completeImmediately(TaskCompletionSource taskcompletionsource, Continuation continuation, Task task, Executor executor, CancellationToken cancellationtoken)
    {
        executor.execute(new Runnable(cancellationtoken, taskcompletionsource, continuation, task) {

            final Continuation val$continuation;
            final CancellationToken val$ct;
            final Task val$task;
            final TaskCompletionSource val$tcs;

            public void run()
            {
                if (ct != null && ct.isCancellationRequested())
                {
                    tcs.setCancelled();
                    return;
                }
                try
                {
                    Object obj = continuation.then(task);
                    tcs.setResult(obj);
                    return;
                }
                catch (CancellationException cancellationexception)
                {
                    tcs.setCancelled();
                    return;
                }
                catch (Exception exception)
                {
                    tcs.setError(exception);
                }
            }

            
            {
                ct = cancellationtoken;
                tcs = taskcompletionsource;
                continuation = continuation1;
                task = task1;
                super();
            }
        });
    }

    public static TaskCompletionSource create()
    {
        Task task = new Task();
        task.getClass();
        return task. new TaskCompletionSource();
    }

    public static Task delay(long l)
    {
        return delay(l, BoltsExecutors.scheduled());
    }

    static Task delay(long l, ScheduledExecutorService scheduledexecutorservice)
    {
        if (l <= 0L)
        {
            return forResult(null);
        } else
        {
            TaskCompletionSource taskcompletionsource = create();
            scheduledexecutorservice.schedule(new Runnable(taskcompletionsource) {

                final TaskCompletionSource val$tcs;

                public void run()
                {
                    tcs.setResult(null);
                }

            
            {
                tcs = taskcompletionsource;
                super();
            }
            }, l, TimeUnit.MILLISECONDS);
            return taskcompletionsource.getTask();
        }
    }

    public static Task forError(Exception exception)
    {
        TaskCompletionSource taskcompletionsource = create();
        taskcompletionsource.setError(exception);
        return taskcompletionsource.getTask();
    }

    public static Task forResult(Object obj)
    {
        TaskCompletionSource taskcompletionsource = create();
        taskcompletionsource.setResult(obj);
        return taskcompletionsource.getTask();
    }

    private void runContinuations()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = continuations.iterator();
_L1:
        Continuation continuation;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        continuation = (Continuation)iterator.next();
        continuation.then(this);
          goto _L1
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        throw new RuntimeException(((Throwable) (obj1)));
        continuations = null;
        obj;
        JVM INSTR monitorexit ;
    }

    public static Task whenAll(Collection collection)
    {
        if (collection.size() == 0)
        {
            return forResult(null);
        }
        TaskCompletionSource taskcompletionsource = create();
        ArrayList arraylist = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicinteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicboolean = new AtomicBoolean(false);
        for (collection = collection.iterator(); collection.hasNext(); ((Task)collection.next()).continueWith(new Continuation(obj, arraylist, atomicboolean, atomicinteger, taskcompletionsource) {

        final TaskCompletionSource val$allFinished;
        final ArrayList val$causes;
        final AtomicInteger val$count;
        final Object val$errorLock;
        final AtomicBoolean val$isCancelled;

        public volatile Object then(Task task)
            throws Exception
        {
            return then(task);
        }

        public Void then(Task task)
        {
            if (task.isFaulted())
            {
                synchronized (errorLock)
                {
                    causes.add(task.getError());
                }
            }
            if (task.isCancelled())
            {
                isCancelled.set(true);
            }
            if (count.decrementAndGet() == 0)
            {
                if (causes.size() == 0)
                {
                    break MISSING_BLOCK_LABEL_143;
                }
                if (causes.size() != 1)
                {
                    break MISSING_BLOCK_LABEL_99;
                }
                allFinished.setError((Exception)causes.get(0));
            }
            return null;
            task;
            obj1;
            JVM INSTR monitorexit ;
            throw task;
            task = new AggregateException(String.format("There were %d exceptions.", new Object[] {
                Integer.valueOf(causes.size())
            }), causes);
            allFinished.setError(task);
            return null;
            if (isCancelled.get())
            {
                allFinished.setCancelled();
                return null;
            } else
            {
                allFinished.setResult(null);
                return null;
            }
        }

            
            {
                errorLock = obj;
                causes = arraylist;
                isCancelled = atomicboolean;
                count = atomicinteger;
                allFinished = taskcompletionsource;
                super();
            }
    })) { }
        return taskcompletionsource.getTask();
    }

    public static Task whenAllResult(Collection collection)
    {
        return whenAll(collection).onSuccess(new Continuation(collection) {

            final Collection val$tasks;

            public volatile Object then(Task task)
                throws Exception
            {
                return then(task);
            }

            public List then(Task task)
                throws Exception
            {
                if (tasks.size() != 0) goto _L2; else goto _L1
_L1:
                task = Collections.emptyList();
_L4:
                return task;
_L2:
                ArrayList arraylist = new ArrayList();
                Iterator iterator = tasks.iterator();
                do
                {
                    task = arraylist;
                    if (!iterator.hasNext())
                    {
                        continue;
                    }
                    arraylist.add(((Task)iterator.next()).getResult());
                } while (true);
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                tasks = collection;
                super();
            }
        });
    }

    public static Task whenAny(Collection collection)
    {
        if (collection.size() == 0)
        {
            return forResult(null);
        }
        TaskCompletionSource taskcompletionsource = create();
        AtomicBoolean atomicboolean = new AtomicBoolean(false);
        for (collection = collection.iterator(); collection.hasNext(); ((Task)collection.next()).continueWith(new Continuation(atomicboolean, taskcompletionsource) {

        final TaskCompletionSource val$firstCompleted;
        final AtomicBoolean val$isAnyTaskComplete;

        public volatile Object then(Task task)
            throws Exception
        {
            return then(task);
        }

        public Void then(Task task)
        {
            if (isAnyTaskComplete.compareAndSet(false, true))
            {
                firstCompleted.setResult(task);
            }
            return null;
        }

            
            {
                isAnyTaskComplete = atomicboolean;
                firstCompleted = taskcompletionsource;
                super();
            }
    })) { }
        return taskcompletionsource.getTask();
    }

    public static Task whenAnyResult(Collection collection)
    {
        if (collection.size() == 0)
        {
            return forResult(null);
        }
        TaskCompletionSource taskcompletionsource = create();
        AtomicBoolean atomicboolean = new AtomicBoolean(false);
        for (collection = collection.iterator(); collection.hasNext(); ((Task)collection.next()).continueWith(new Continuation(atomicboolean, taskcompletionsource) {

        final TaskCompletionSource val$firstCompleted;
        final AtomicBoolean val$isAnyTaskComplete;

        public volatile Object then(Task task)
            throws Exception
        {
            return then(task);
        }

        public Void then(Task task)
        {
            if (isAnyTaskComplete.compareAndSet(false, true))
            {
                firstCompleted.setResult(task);
            }
            return null;
        }

            
            {
                isAnyTaskComplete = atomicboolean;
                firstCompleted = taskcompletionsource;
                super();
            }
    })) { }
        return taskcompletionsource.getTask();
    }

    public Task cast()
    {
        return this;
    }

    public Task continueWhile(Callable callable, Continuation continuation)
    {
        return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, null);
    }

    public Task continueWhile(Callable callable, Continuation continuation, CancellationToken cancellationtoken)
    {
        return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, cancellationtoken);
    }

    public Task continueWhile(Callable callable, Continuation continuation, Executor executor)
    {
        return continueWhile(callable, continuation, executor, null);
    }

    public Task continueWhile(final Callable predicate, final Continuation continuation, final Executor executor, final CancellationToken ct)
    {
        final Capture predicateContinuation = new Capture();
        predicateContinuation.set(new Continuation() {

            final Task this$0;
            final Continuation val$continuation;
            final CancellationToken val$ct;
            final Executor val$executor;
            final Callable val$predicate;
            final Capture val$predicateContinuation;

            public Task then(Task task)
                throws Exception
            {
                if (ct != null && ct.isCancellationRequested())
                {
                    return Task.cancelled();
                }
                if (((Boolean)predicate.call()).booleanValue())
                {
                    return Task.forResult(null).onSuccessTask(continuation, executor).onSuccessTask((Continuation)predicateContinuation.get(), executor);
                } else
                {
                    return Task.forResult(null);
                }
            }

            public volatile Object then(Task task)
                throws Exception
            {
                return then(task);
            }

            
            {
                this$0 = Task.this;
                ct = cancellationtoken;
                predicate = callable;
                continuation = continuation1;
                executor = executor1;
                predicateContinuation = capture;
                super();
            }
        });
        return makeVoid().continueWithTask((Continuation)predicateContinuation.get(), executor);
    }

    public Task continueWith(Continuation continuation)
    {
        return continueWith(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public Task continueWith(Continuation continuation, CancellationToken cancellationtoken)
    {
        return continueWith(continuation, IMMEDIATE_EXECUTOR, cancellationtoken);
    }

    public Task continueWith(Continuation continuation, Executor executor)
    {
        return continueWith(continuation, executor, null);
    }

    public Task continueWith(final Continuation continuation, final Executor executor, final CancellationToken ct)
    {
        final TaskCompletionSource tcs = create();
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = isCompleted();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        continuations.add(new Continuation() {

            final Task this$0;
            final Continuation val$continuation;
            final CancellationToken val$ct;
            final Executor val$executor;
            final TaskCompletionSource val$tcs;

            public volatile Object then(Task task)
                throws Exception
            {
                return then(task);
            }

            public Void then(Task task)
            {
                Task.completeImmediately(tcs, continuation, task, executor, ct);
                return null;
            }

            
            {
                this$0 = Task.this;
                tcs = taskcompletionsource;
                continuation = continuation1;
                executor = executor1;
                ct = cancellationtoken;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            completeImmediately(tcs, continuation, this, executor, ct);
        }
        return tcs.getTask();
        continuation;
        obj;
        JVM INSTR monitorexit ;
        throw continuation;
    }

    public Task continueWithTask(Continuation continuation)
    {
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public Task continueWithTask(Continuation continuation, CancellationToken cancellationtoken)
    {
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, cancellationtoken);
    }

    public Task continueWithTask(Continuation continuation, Executor executor)
    {
        return continueWithTask(continuation, executor, null);
    }

    public Task continueWithTask(final Continuation continuation, final Executor executor, final CancellationToken ct)
    {
        final TaskCompletionSource tcs = create();
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = isCompleted();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        continuations.add(new Continuation() {

            final Task this$0;
            final Continuation val$continuation;
            final CancellationToken val$ct;
            final Executor val$executor;
            final TaskCompletionSource val$tcs;

            public volatile Object then(Task task)
                throws Exception
            {
                return then(task);
            }

            public Void then(Task task)
            {
                Task.completeAfterTask(tcs, continuation, task, executor, ct);
                return null;
            }

            
            {
                this$0 = Task.this;
                tcs = taskcompletionsource;
                continuation = continuation1;
                executor = executor1;
                ct = cancellationtoken;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            completeAfterTask(tcs, continuation, this, executor, ct);
        }
        return tcs.getTask();
        continuation;
        obj;
        JVM INSTR monitorexit ;
        throw continuation;
    }

    public Exception getError()
    {
        Exception exception;
        synchronized (lock)
        {
            exception = error;
        }
        return exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public Object getResult()
    {
        Object obj1;
        synchronized (lock)
        {
            obj1 = result;
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isCancelled()
    {
        boolean flag;
        synchronized (lock)
        {
            flag = cancelled;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isCompleted()
    {
        boolean flag;
        synchronized (lock)
        {
            flag = complete;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isFaulted()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (error != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Task makeVoid()
    {
        return continueWithTask(new Continuation() {

            final Task this$0;

            public Task then(Task task)
                throws Exception
            {
                if (task.isCancelled())
                {
                    return Task.cancelled();
                }
                if (task.isFaulted())
                {
                    return Task.forError(task.getError());
                } else
                {
                    return Task.forResult(null);
                }
            }

            public volatile Object then(Task task)
                throws Exception
            {
                return then(task);
            }

            
            {
                this$0 = Task.this;
                super();
            }
        });
    }

    public Task onSuccess(Continuation continuation)
    {
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public Task onSuccess(Continuation continuation, CancellationToken cancellationtoken)
    {
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, cancellationtoken);
    }

    public Task onSuccess(Continuation continuation, Executor executor)
    {
        return onSuccess(continuation, executor, null);
    }

    public Task onSuccess(final Continuation continuation, Executor executor, final CancellationToken ct)
    {
        return continueWithTask(new Continuation() {

            final Task this$0;
            final Continuation val$continuation;
            final CancellationToken val$ct;

            public Task then(Task task)
            {
                if (ct != null && ct.isCancellationRequested())
                {
                    return Task.cancelled();
                }
                if (task.isFaulted())
                {
                    return Task.forError(task.getError());
                }
                if (task.isCancelled())
                {
                    return Task.cancelled();
                } else
                {
                    return task.continueWith(continuation);
                }
            }

            public volatile Object then(Task task)
                throws Exception
            {
                return then(task);
            }

            
            {
                this$0 = Task.this;
                ct = cancellationtoken;
                continuation = continuation1;
                super();
            }
        }, executor);
    }

    public Task onSuccessTask(Continuation continuation)
    {
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR);
    }

    public Task onSuccessTask(Continuation continuation, CancellationToken cancellationtoken)
    {
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR, cancellationtoken);
    }

    public Task onSuccessTask(Continuation continuation, Executor executor)
    {
        return onSuccessTask(continuation, executor, null);
    }

    public Task onSuccessTask(final Continuation continuation, Executor executor, final CancellationToken ct)
    {
        return continueWithTask(new Continuation() {

            final Task this$0;
            final Continuation val$continuation;
            final CancellationToken val$ct;

            public Task then(Task task)
            {
                if (ct != null && ct.isCancellationRequested())
                {
                    return Task.cancelled();
                }
                if (task.isFaulted())
                {
                    return Task.forError(task.getError());
                }
                if (task.isCancelled())
                {
                    return Task.cancelled();
                } else
                {
                    return task.continueWithTask(continuation);
                }
            }

            public volatile Object then(Task task)
                throws Exception
            {
                return then(task);
            }

            
            {
                this$0 = Task.this;
                ct = cancellationtoken;
                continuation = continuation1;
                super();
            }
        }, executor);
    }

    public void waitForCompletion()
        throws InterruptedException
    {
        synchronized (lock)
        {
            if (!isCompleted())
            {
                lock.wait();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }







/*
    static boolean access$402(Task task, boolean flag)
    {
        task.complete = flag;
        return flag;
    }

*/


/*
    static boolean access$502(Task task, boolean flag)
    {
        task.cancelled = flag;
        return flag;
    }

*/



/*
    static Object access$702(Task task, Object obj)
    {
        task.result = obj;
        return obj;
    }

*/


/*
    static Exception access$802(Task task, Exception exception)
    {
        task.error = exception;
        return exception;
    }

*/
}
