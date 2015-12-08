// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            Dependency, PriorityProvider, Task, Priority

public class PriorityTask
    implements Dependency, PriorityProvider, Task
{

    private final List dependencies = new ArrayList();
    private final AtomicBoolean hasRun = new AtomicBoolean(false);
    private final AtomicReference throwable = new AtomicReference(null);

    public PriorityTask()
    {
    }

    public static boolean isProperDelegate(Object obj)
    {
        boolean flag1 = false;
        Dependency dependency;
        Task task;
        boolean flag;
        try
        {
            dependency = (Dependency)obj;
            task = (Task)obj;
            obj = (PriorityProvider)obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        flag = flag1;
        if (dependency != null)
        {
            flag = flag1;
            if (task != null)
            {
                flag = flag1;
                if (obj != null)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public void addDependency(Task task)
    {
        this;
        JVM INSTR monitorenter ;
        dependencies.add(task);
        this;
        JVM INSTR monitorexit ;
        return;
        task;
        throw task;
    }

    public volatile void addDependency(Object obj)
    {
        addDependency((Task)obj);
    }

    public boolean areDependenciesMet()
    {
        for (Iterator iterator = getDependencies().iterator(); iterator.hasNext();)
        {
            if (!((Task)iterator.next()).isFinished())
            {
                return false;
            }
        }

        return true;
    }

    public int compareTo(Object obj)
    {
        return Priority.compareTo(this, obj);
    }

    public Collection getDependencies()
    {
        this;
        JVM INSTR monitorenter ;
        Collection collection = Collections.unmodifiableCollection(dependencies);
        this;
        JVM INSTR monitorexit ;
        return collection;
        Exception exception;
        exception;
        throw exception;
    }

    public Throwable getError()
    {
        return (Throwable)throwable.get();
    }

    public Priority getPriority()
    {
        return Priority.NORMAL;
    }

    public boolean isFinished()
    {
        return hasRun.get();
    }

    public void setError(Throwable throwable1)
    {
        throwable.set(throwable1);
    }

    public void setFinished(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        hasRun.set(flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
