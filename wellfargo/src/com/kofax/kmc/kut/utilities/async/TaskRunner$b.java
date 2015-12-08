// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.async;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.kofax.kmc.kut.utilities.async:
//            TaskRunner

class b
    implements Runnable
{

    final TaskRunner a;
    private a b;
    private Handler c;
    private ErrorInfo d;
    private Object e;
    private skCompletedListener f;

    static Object a(b b1)
    {
        return b1.e;
    }

    private void a(CopyOnWriteArrayList copyonwritearraylist, Long long1)
    {
        Log.i("TaskRunner", (new StringBuilder()).append("TaskWaiter(): Call the TaskCompleted handler on thread id: ").append(Thread.currentThread().getId()).toString());
        for (copyonwritearraylist = copyonwritearraylist.iterator(); copyonwritearraylist.hasNext();)
        {
            f = (skCompletedListener)copyonwritearraylist.next();
            class _cls1
                implements Runnable
            {

                final Long a;
                final TaskRunner.b b;

                public void run()
                {
                    TaskRunner.b.c(b).onTaskCompleted(new TaskRunner.TaskCompletedEvent(b.a, this, a.longValue(), TaskRunner.b.a(b), TaskRunner.b.b(b)));
                }

            _cls1(Long long1)
            {
                b = TaskRunner.b.this;
                a = long1;
                super();
            }
            }

            if (!TaskRunner.a(a).contains(f))
            {
                f.onTaskCompleted(new skCompletedEvent(a, this, long1.longValue(), e, d));
            } else
            {
                c.post(new _cls1(long1));
            }
        }

    }

    static ErrorInfo b(_cls1 _pcls1)
    {
        return _pcls1.d;
    }

    static skCompletedListener c(d d1)
    {
        return d1.f;
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

    skCompletedListener(TaskRunner taskrunner, skCompletedListener skcompletedlistener)
    {
        a = taskrunner;
        super();
        b = null;
        c = new Handler(Looper.getMainLooper());
        d = ErrorInfo.KMC_SUCCESS;
        e = null;
        f = null;
        b = skcompletedlistener;
    }
}
