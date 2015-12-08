// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            DelegateProvider, Dependency, PriorityProvider, Task, 
//            PriorityTask, Priority

public class PriorityFutureTask extends FutureTask
    implements DelegateProvider, Dependency, PriorityProvider, Task
{

    final Object _flddelegate;

    public PriorityFutureTask(Runnable runnable, Object obj)
    {
        super(runnable, obj);
        _flddelegate = checkAndInitDelegate(runnable);
    }

    public PriorityFutureTask(Callable callable)
    {
        super(callable);
        _flddelegate = checkAndInitDelegate(callable);
    }

    public void addDependency(Task task)
    {
        ((Dependency)(PriorityProvider)getDelegate()).addDependency(task);
    }

    public volatile void addDependency(Object obj)
    {
        addDependency((Task)obj);
    }

    public boolean areDependenciesMet()
    {
        return ((Dependency)(PriorityProvider)getDelegate()).areDependenciesMet();
    }

    protected Dependency checkAndInitDelegate(Object obj)
    {
        if (PriorityTask.isProperDelegate(obj))
        {
            return (Dependency)obj;
        } else
        {
            return new PriorityTask();
        }
    }

    public int compareTo(Object obj)
    {
        return ((PriorityProvider)getDelegate()).compareTo(obj);
    }

    public Dependency getDelegate()
    {
        return (Dependency)_flddelegate;
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
