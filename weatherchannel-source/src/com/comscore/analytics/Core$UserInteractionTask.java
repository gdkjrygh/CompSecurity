// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import com.comscore.utils.task.TaskExecutor;

// Referenced classes of package com.comscore.analytics:
//            Core

public class a
    implements Runnable
{

    final Core a;

    public void run()
    {
label0:
        {
            synchronized (a)
            {
                if (Core.a(a))
                {
                    break label0;
                }
            }
            return;
        }
        if (a.Y != null)
        {
            a.f.removeEnqueuedTask(a.Y);
            a.Y = null;
            a.n();
        }
        core;
        JVM INSTR monitorexit ;
        return;
        exception;
        core;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (Core core)
    {
        a = core;
        super();
    }
}
