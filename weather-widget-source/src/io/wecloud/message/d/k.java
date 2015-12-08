// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.d;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package io.wecloud.message.d:
//            m, l

public class k
{

    private static HashMap a = null;
    private static final TimeUnit b;
    private ThreadPoolExecutor c;
    private ScheduledExecutorService d;
    private Thread e;
    private Queue f;
    private RejectedExecutionHandler g;
    private Object h;

    private k()
    {
        this(4, 4, 0L, b, false);
    }

    private k(int i, int j, long l1, TimeUnit timeunit, boolean flag)
    {
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = new Object();
        f = new ConcurrentLinkedQueue();
        e = new m(this, null);
        d = Executors.newSingleThreadScheduledExecutor();
        d.scheduleAtFixedRate(e, 0L, 1000L, TimeUnit.MILLISECONDS);
        c();
        Object obj;
        if (flag)
        {
            obj = new PriorityBlockingQueue(16);
        } else
        {
            obj = new LinkedBlockingQueue(16);
        }
        c = new ThreadPoolExecutor(i, j, l1, timeunit, ((BlockingQueue) (obj)), g);
    }

    public static k a(String s)
    {
        io/wecloud/message/d/k;
        JVM INSTR monitorenter ;
        k k1;
        Object obj = null;
        k1 = obj;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        k1 = obj;
        k k2;
        if ("".equals(s.trim()))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (a == null)
        {
            a = new HashMap();
        }
        k2 = (k)a.get(s);
        k1 = k2;
        if (k2 != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        k1 = new k();
        a.put(s, k1);
        io/wecloud/message/d/k;
        JVM INSTR monitorexit ;
        return k1;
        s;
        throw s;
    }

    static Object a(k k1)
    {
        return k1.h;
    }

    static Queue b(k k1)
    {
        return k1.f;
    }

    private void c()
    {
        g = new l(this);
    }

    public void a(Runnable runnable)
    {
        if (c != null && runnable != null)
        {
            c.execute(runnable);
        }
    }

    public boolean a()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (f != null)
        {
            flag = flag1;
            if (!f.isEmpty())
            {
                flag = true;
            }
        }
        return flag;
    }

    public void b()
    {
        Iterator iterator;
        if (c == null || c.isShutdown())
        {
            break MISSING_BLOCK_LABEL_88;
        }
        iterator = c.getQueue().iterator();
_L2:
        if (!iterator.hasNext())
        {
            return;
        }
        Runnable runnable = (Runnable)iterator.next();
        c.remove(runnable);
        if (true) goto _L2; else goto _L1
_L1:
        Throwable throwable;
        throwable;
        Log.e("ThreadPoolManager", (new StringBuilder("removeAllTask ")).append(throwable.getMessage()).toString());
    }

    public void b(Runnable runnable)
    {
        if (runnable != null)
        {
            synchronized (h)
            {
                if (f != null && f.contains(runnable))
                {
                    f.remove(runnable);
                }
            }
            if (c != null)
            {
                c.remove(runnable);
            }
        }
        return;
        runnable;
        obj;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    static 
    {
        b = TimeUnit.SECONDS;
    }
}
