// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.async;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskRunner
{

    private static final String a = "TaskRunner";
    private final int b;
    private int c;
    private ExecutorService d;
    private Map e;
    private CopyOnWriteArrayList f;
    private Map g;
    private Map h;
    private long i;
    private long j;

    private TaskRunner()
    {
        b = 50;
        c = 1;
        d = null;
        e = new ConcurrentHashMap();
        f = new CopyOnWriteArrayList();
        g = new ConcurrentHashMap();
        h = new ConcurrentHashMap();
        i = UUID.randomUUID().getLeastSignificantBits() >>> 1;
        j = UUID.randomUUID().getLeastSignificantBits() >>> 1;
    }

    public TaskRunner(int k)
    {
        b = 50;
        c = 1;
        d = null;
        e = new ConcurrentHashMap();
        f = new CopyOnWriteArrayList();
        g = new ConcurrentHashMap();
        h = new ConcurrentHashMap();
        i = UUID.randomUUID().getLeastSignificantBits() >>> 1;
        j = UUID.randomUUID().getLeastSignificantBits() >>> 1;
        if (k <= 0)
        {
            throw new IllegalArgumentException("threads parameter on constructor must be > 0");
        }
        if (k > 50)
        {
            throw new IllegalArgumentException("threads parameter on constructor is > max thread pool size: 50");
        } else
        {
            c = k * 2;
            d = Executors.newFixedThreadPool(c);
            return;
        }
    }

    static CopyOnWriteArrayList a(TaskRunner taskrunner)
    {
        return taskrunner.f;
    }

    static Map b(TaskRunner taskrunner)
    {
        return taskrunner.g;
    }

    static Map c(TaskRunner taskrunner)
    {
        return taskrunner.e;
    }

    static Map d(TaskRunner taskrunner)
    {
        return taskrunner.h;
    }

    public final void addOnTaskCompletedListener(TaskCompletedListener taskcompletedlistener, Callable callable, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!e.containsKey(Integer.valueOf(callable.hashCode())))
        {
            e.put(callable, new CopyOnWriteArrayList());
        }
        if (!((CopyOnWriteArrayList)e.get(callable)).contains(taskcompletedlistener))
        {
            ((CopyOnWriteArrayList)e.get(callable)).add(taskcompletedlistener);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (!f.contains(taskcompletedlistener))
        {
            f.add(taskcompletedlistener);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        taskcompletedlistener;
        throw taskcompletedlistener;
    }

    public boolean awaitTermination(long l, TimeUnit timeunit)
    {
        this;
        JVM INSTR monitorenter ;
        if (d == null) goto _L2; else goto _L1
_L1:
        boolean flag = d.awaitTermination(l, timeunit);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        timeunit;
        throw timeunit;
    }

    public boolean isTerminated()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = isTerminated();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void removeOnTaskCompletedListener(TaskCompletedListener taskcompletedlistener, Callable callable)
    {
        this;
        JVM INSTR monitorenter ;
        if (e.containsKey(callable) && !((CopyOnWriteArrayList)e.get(callable)).contains(taskcompletedlistener))
        {
            ((CopyOnWriteArrayList)e.get(callable)).remove(taskcompletedlistener);
        }
        if (f.contains(taskcompletedlistener))
        {
            f.remove(taskcompletedlistener);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        taskcompletedlistener;
        throw taskcompletedlistener;
    }

    public void shutdown()
    {
        this;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            d.shutdown();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public List shutdownNow()
    {
        this;
        JVM INSTR monitorenter ;
        if (d == null) goto _L2; else goto _L1
_L1:
        List list = d.shutdownNow();
_L4:
        this;
        JVM INSTR monitorexit ;
        return list;
_L2:
        list = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public long submit(Callable callable)
    {
        this;
        JVM INSTR monitorenter ;
        if (callable != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new NullPointerException("'Callable<?> task' parameter passed to submit is null");
        callable;
        this;
        JVM INSTR monitorexit ;
        throw callable;
        long l;
        if (d == null)
        {
            throw new IllegalThreadStateException("submit failure: threadpool has not been created");
        }
        if (!e.containsKey(callable))
        {
            throw new UnsupportedOperationException("submit failure: no Image Captured Listeners have been registered -> addOnImageCapturedListener()");
        }
        if (d.isShutdown())
        {
            d = Executors.newFixedThreadPool(c);
            e.clear();
            g.clear();
            h.clear();
            f.clear();
        }
        Object obj = d.submit(callable);
        l = j;
        j = l + 1L;
        obj = new a(((Future) (obj)), l);
        h.put(callable, Long.valueOf(i));
        g.put(Long.valueOf(((a) (obj)).b), callable);
        d.execute(new b(((a) (obj))));
        l = i;
        i = l + 1L;
        this;
        JVM INSTR monitorexit ;
        return l;
    }

    private class a
    {

        public Future a;
        public long b;
        final TaskRunner c;

        a(Future future, long l)
        {
            c = TaskRunner.this;
            super();
            a = future;
            b = l;
        }
    }


    private class b
        implements Runnable
    {

        final TaskRunner a;
        private a b;
        private Handler c;
        private ErrorInfo d;
        private Object e;
        private TaskCompletedListener f;

        static Object a(b b1)
        {
            return b1.e;
        }

        private void a(CopyOnWriteArrayList copyonwritearraylist, Long long1)
        {
            Log.i("TaskRunner", (new StringBuilder()).append("TaskWaiter(): Call the TaskCompleted handler on thread id: ").append(Thread.currentThread().getId()).toString());
            for (copyonwritearraylist = copyonwritearraylist.iterator(); copyonwritearraylist.hasNext();)
            {
                f = (TaskCompletedListener)copyonwritearraylist.next();
                class _cls1
                    implements Runnable
                {

                    final Long a;
                    final b b;

                    public void run()
                    {
                        b.c(b).onTaskCompleted(b.a. new TaskCompletedEvent(this, a.longValue(), b.a(b), b.b(b)));
                    }

                _cls1(Long long1)
                {
                    b = b.this;
                    a = long1;
                    super();
                }
                }

                if (!TaskRunner.a(a).contains(f))
                {
                    f.onTaskCompleted(a. new TaskCompletedEvent(this, long1.longValue(), e, d));
                } else
                {
                    c.post(new _cls1(long1));
                }
            }

        }

        static ErrorInfo b(b b1)
        {
            return b1.d;
        }

        static TaskCompletedListener c(b b1)
        {
            return b1.f;
        }

        public void run()
        {
            e = b.a.get();
            Object obj2;
            obj2 = (Callable)TaskRunner.b(a).get(Long.valueOf(b.b));
            if (obj2 == null)
            {
                throw new IllegalThreadStateException("TaskWaiter unable to retrieve task from taskCompletedFutures Map");
            }
            break MISSING_BLOCK_LABEL_547;
            InterruptedException interruptedexception;
            interruptedexception;
            d = ErrorInfo.KMC_GN_UNKNOWN_ERROR;
            d.setErrCause(interruptedexception.getCause().getMessage());
            interruptedexception.printStackTrace();
            Object obj;
            Object obj1;
            obj2 = (Callable)TaskRunner.b(a).get(Long.valueOf(b.b));
            ExecutionException executionexception;
            Long long1;
            if (obj2 == null)
            {
                throw new IllegalThreadStateException("TaskWaiter unable to retrieve task from taskCompletedFutures Map");
            }
            obj = (CopyOnWriteArrayList)TaskRunner.c(a).get(obj2);
            if (obj == null)
            {
                throw new IllegalThreadStateException("TaskWaiter unable to retrieve listeners List from taskCompletedListeners Map");
            }
            obj1 = (Long)TaskRunner.d(a).get(obj2);
              goto _L1
            executionexception;
            d = ErrorInfo.KMC_GN_UNKNOWN_ERROR;
            d.setErrCause(executionexception.getCause().getMessage());
            executionexception.printStackTrace();
            break MISSING_BLOCK_LABEL_148;
_L3:
            TaskRunner.b(a).remove(Long.valueOf(b.b));
            TaskRunner.d(a).remove(obj1);
            a(((CopyOnWriteArrayList) (obj2)), long1);
            throw obj;
_L5:
            TaskRunner.b(a).remove(Long.valueOf(b.b));
            TaskRunner.d(a).remove(obj2);
_L6:
            a(((CopyOnWriteArrayList) (obj)), ((Long) (obj1)));
            return;
            obj;
            obj1 = (Callable)TaskRunner.b(a).get(Long.valueOf(b.b));
            if (obj1 == null)
            {
                throw new IllegalThreadStateException("TaskWaiter unable to retrieve task from taskCompletedFutures Map");
            }
            obj2 = (CopyOnWriteArrayList)TaskRunner.c(a).get(obj1);
            if (obj2 == null)
            {
                throw new IllegalThreadStateException("TaskWaiter unable to retrieve listeners List from taskCompletedListeners Map");
            }
            long1 = (Long)TaskRunner.d(a).get(obj1);
            if (long1 != null) goto _L3; else goto _L2
_L2:
            throw new IllegalThreadStateException("TaskWaiter unable to retrieve taskID from taskSubmitted Map");
_L1:
            if (obj1 != null) goto _L5; else goto _L4
_L4:
            throw new IllegalThreadStateException("TaskWaiter unable to retrieve taskID from taskSubmitted Map");
            obj2 = (Callable)TaskRunner.b(a).get(Long.valueOf(b.b));
            if (obj2 == null)
            {
                throw new IllegalThreadStateException("TaskWaiter unable to retrieve task from taskCompletedFutures Map");
            }
            obj = (CopyOnWriteArrayList)TaskRunner.c(a).get(obj2);
            if (obj == null)
            {
                throw new IllegalThreadStateException("TaskWaiter unable to retrieve listeners List from taskCompletedListeners Map");
            }
            obj1 = (Long)TaskRunner.d(a).get(obj2);
            if (obj1 == null)
            {
                throw new IllegalThreadStateException("TaskWaiter unable to retrieve taskID from taskSubmitted Map");
            }
            TaskRunner.b(a).remove(Long.valueOf(b.b));
            TaskRunner.d(a).remove(obj2);
              goto _L6
            obj = (CopyOnWriteArrayList)TaskRunner.c(a).get(obj2);
            if (obj == null)
            {
                throw new IllegalThreadStateException("TaskWaiter unable to retrieve listeners List from taskCompletedListeners Map");
            }
            obj1 = (Long)TaskRunner.d(a).get(obj2);
            if (obj1 == null)
            {
                throw new IllegalThreadStateException("TaskWaiter unable to retrieve taskID from taskSubmitted Map");
            }
            TaskRunner.b(a).remove(Long.valueOf(b.b));
            TaskRunner.d(a).remove(obj2);
              goto _L6
        }

        b(a a1)
        {
            a = TaskRunner.this;
            super();
            b = null;
            c = new Handler(Looper.getMainLooper());
            d = ErrorInfo.KMC_SUCCESS;
            e = null;
            f = null;
            b = a1;
        }

        private class TaskCompletedListener
        {

            public abstract void onTaskCompleted(TaskCompletedEvent taskcompletedevent);
        }


        private class TaskCompletedEvent extends EventObject
        {

            private static final long serialVersionUID = 1L;
            final TaskRunner a;
            private long b;
            private Object c;
            private ErrorInfo d;

            public final ErrorInfo getTaskError()
            {
                return d;
            }

            public final long getTaskID()
            {
                return b;
            }

            public final Object getTaskReturnValue()
            {
                return c;
            }

            public TaskCompletedEvent(Object obj, long l, Object obj1, ErrorInfo errorinfo)
            {
                a = TaskRunner.this;
                super(obj);
                b = l;
                d = errorinfo;
                c = obj1;
            }
        }

    }

}
