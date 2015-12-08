// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.walmart.android.service:
//            CancellableRunnable

public class JobRunner
{
    private class JobThread extends Thread
    {

        final JobRunner this$0;

        public void run()
        {
            isRunning = true;
_L3:
            if (!isRunning)
            {
                break MISSING_BLOCK_LABEL_99;
            }
            Object obj = mWaitLock;
            obj;
            JVM INSTR monitorenter ;
_L1:
            boolean flag = mQueue.isEmpty();
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_70;
            }
            mWaitLock.wait();
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
                Runnable runnable = (Runnable)mQueue.poll();
                if (runnable == null)
                {
                    break;
                }
                runnable.run();
            } while (true);
            if (true) goto _L3; else goto _L2
_L2:
        }

        private JobThread()
        {
            this$0 = JobRunner.this;
            super();
        }

    }


    private boolean isRunning;
    private JobThread mJobThread;
    private int mMaxSize;
    private ConcurrentLinkedQueue mQueue;
    private Object mWaitLock;

    public JobRunner(int i)
    {
        mWaitLock = new Object();
        mMaxSize = i;
        mQueue = new ConcurrentLinkedQueue();
        mJobThread = new JobThread();
    }

    public void addJob(CancellableRunnable cancellablerunnable)
    {
        Object obj = mWaitLock;
        obj;
        JVM INSTR monitorenter ;
_L1:
        CancellableRunnable cancellablerunnable1;
        do
        {
            if (mQueue.size() <= mMaxSize)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            cancellablerunnable1 = (CancellableRunnable)mQueue.poll();
        } while (cancellablerunnable1 == null);
        cancellablerunnable1.cancel();
          goto _L1
        cancellablerunnable;
        obj;
        JVM INSTR monitorexit ;
        throw cancellablerunnable;
        mQueue.add(cancellablerunnable);
        mWaitLock.notifyAll();
        obj;
        JVM INSTR monitorexit ;
    }

    public void start()
    {
        mJobThread.start();
    }



/*
    static boolean access$102(JobRunner jobrunner, boolean flag)
    {
        jobrunner.isRunning = flag;
        return flag;
    }

*/


}
