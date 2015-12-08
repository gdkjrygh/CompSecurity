// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            AsyncTask, Dependency, PriorityProvider, Task, 
//            DelegateProvider, PriorityTask, Priority, PriorityFutureTask

public abstract class PriorityAsyncTask extends AsyncTask
    implements Dependency, PriorityProvider, Task, DelegateProvider
{
    private static class ProxyExecutor
        implements Executor
    {

        private final Executor executor;
        private final PriorityAsyncTask task;

        public void execute(Runnable runnable)
        {
            executor.execute(new PriorityFutureTask(runnable, null) {

                final ProxyExecutor this$0;

                public Dependency getDelegate()
                {
                    return task;
                }

            
            {
                this$0 = ProxyExecutor.this;
                super(runnable, obj);
            }
            });
        }


        public ProxyExecutor(Executor executor1, PriorityAsyncTask priorityasynctask)
        {
            executor = executor1;
            task = priorityasynctask;
        }
    }


    private final PriorityTask priorityTask = new PriorityTask();

    public PriorityAsyncTask()
    {
    }

    public void addDependency(Task task)
    {
        if (getStatus() != AsyncTask.Status.PENDING)
        {
            throw new IllegalStateException("Must not add Dependency after task is running");
        } else
        {
            ((Dependency)(PriorityProvider)getDelegate()).addDependency(task);
            return;
        }
    }

    public volatile void addDependency(Object obj)
    {
        addDependency((Task)obj);
    }

    public boolean areDependenciesMet()
    {
        return ((Dependency)(PriorityProvider)getDelegate()).areDependenciesMet();
    }

    public int compareTo(Object obj)
    {
        return Priority.compareTo(this, obj);
    }

    public final transient void executeOnExecutor(ExecutorService executorservice, Object aobj[])
    {
        super.executeOnExecutor(new ProxyExecutor(executorservice, this), aobj);
    }

    public Dependency getDelegate()
    {
        return priorityTask;
    }

    public Collection getDependencies()
    {
        return ((Dependency)(PriorityProvider)getDelegate()).getDependencies();
    }

    public Throwable getError()
    {
        return ((Task)(PriorityProvider)getDelegate()).getError();
    }

    public Priority getPriority()
    {
        return ((PriorityProvider)getDelegate()).getPriority();
    }

    public boolean isFinished()
    {
        return ((Task)(PriorityProvider)getDelegate()).isFinished();
    }

    public void setError(Throwable throwable)
    {
        ((Task)(PriorityProvider)getDelegate()).setError(throwable);
    }

    public void setFinished(boolean flag)
    {
        ((Task)(PriorityProvider)getDelegate()).setFinished(flag);
    }
}
