// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils.task;

import com.comscore.analytics.Core;
import com.comscore.utils.CSLog;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.comscore.utils.task:
//            TaskThread, a

public class TaskExecutor
{

    private static final long b = 50000L;
    Core a;
    private TaskThread c;
    private BlockingQueue d;

    public TaskExecutor(Core core)
    {
        a = core;
        d = new LinkedBlockingQueue();
        c = new TaskThread(this);
        c.start();
    }

    long a()
    {
        Iterator iterator = d.iterator();
        long l;
        for (l = 50000L; iterator.hasNext(); l = Math.min(l, ((a)iterator.next()).a())) { }
        return l;
    }

    void a(a a1)
    {
        d.remove(a1);
    }

    a b()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (a1.f() <= System.currentTimeMillis())
            {
                return a1;
            }
        }

        return null;
    }

    public boolean containsTask(Runnable runnable)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (a1.i() == runnable || (runnable instanceof a) && a1 == runnable)
            {
                return true;
            }
        }

        return false;
    }

    public boolean execute(Runnable runnable, long l)
    {
        return execute(runnable, l, false, 0L);
    }

    public boolean execute(Runnable runnable, long l, boolean flag, long l1)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (a1 != null && a1.i() == runnable)
            {
                return false;
            }
        }

        d.add(new a(runnable, a, l, flag, l1));
        c.c();
        return true;
    }

    public boolean execute(Runnable runnable, boolean flag)
    {
        if (!a.isEnabled())
        {
            return false;
        }
        if (!flag)
        {
            try
            {
                runnable.run();
            }
            // Misplaced declaration of an exception variable
            catch (Runnable runnable)
            {
                CSLog.e(getClass(), "Unexpected error: ");
                CSLog.printStackTrace(runnable);
                return true;
            }
            return true;
        } else
        {
            execute(runnable, 0L);
            return true;
        }
    }

    public void removeAllEnqueuedTasks()
    {
        d.clear();
    }

    public void removeEnqueuedTask(Runnable runnable)
    {
        if (runnable != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a a1;
        Iterator iterator = d.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            a1 = (a)iterator.next();
        } while (a1.i() != runnable);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        d.remove(a1);
        return;
    }

    public int size()
    {
        return d.size();
    }

    public void waitForLastNonDelayedTaskToFinish()
    {
        Object obj = null;
        a aa[] = new a[d.size()];
        d.toArray(aa);
        int i = aa.length - 1;
        do
        {
label0:
            {
                a a1 = obj;
                if (i >= 0)
                {
                    if (aa[i] == null || aa[i].d())
                    {
                        break label0;
                    }
                    a1 = aa[i];
                }
                waitForTaskToFinish(a1, 0L);
                return;
            }
            i--;
        } while (true);
    }

    public void waitForTaskToFinish(Runnable runnable, long l)
    {
        a a2;
        if (!(runnable instanceof a))
        {
            Iterator iterator = d.iterator();
            a a1 = null;
            do
            {
                a2 = a1;
                if (!iterator.hasNext())
                {
                    break;
                }
                a2 = (a)iterator.next();
                if (a2.i() == runnable)
                {
                    a1 = a2;
                }
            } while (true);
        } else
        {
            a2 = (a)runnable;
        }
        if (a2 == null) goto _L2; else goto _L1
_L1:
        long l1 = System.currentTimeMillis();
_L5:
        if (d.contains(a2) && (l <= 0L || System.currentTimeMillis() < l1 + l)) goto _L3; else goto _L2
_L2:
        return;
_L3:
        try
        {
            Thread.sleep(100L);
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable) { }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void waitForTasks()
    {
        do
        {
            if (d.size() == 0)
            {
                return;
            }
            try
            {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedexception) { }
        } while (true);
    }
}
