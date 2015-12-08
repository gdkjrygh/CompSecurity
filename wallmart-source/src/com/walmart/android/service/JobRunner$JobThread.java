// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.walmart.android.service:
//            JobRunner

private class <init> extends Thread
{

    final JobRunner this$0;

    public void run()
    {
        JobRunner.access$102(JobRunner.this, true);
_L3:
        if (!JobRunner.access$100(JobRunner.this))
        {
            break MISSING_BLOCK_LABEL_99;
        }
        Object obj = JobRunner.access$200(JobRunner.this);
        obj;
        JVM INSTR monitorenter ;
_L1:
        boolean flag = JobRunner.access$300(JobRunner.this).isEmpty();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        JobRunner.access$200(JobRunner.this).wait();
          goto _L1
        Object obj1;
        obj1;
        ((InterruptedException) (obj1)).printStackTrace();
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        do
        {
            Runnable runnable = (Runnable)JobRunner.access$300(JobRunner.this).poll();
            if (runnable == null)
            {
                break;
            }
            runnable.run();
        } while (true);
        if (true) goto _L3; else goto _L2
_L2:
    }

    private ()
    {
        this$0 = JobRunner.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
