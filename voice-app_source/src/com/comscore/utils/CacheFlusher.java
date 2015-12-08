// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.comscore.analytics.Core;

// Referenced classes of package com.comscore.utils:
//            Storage, CSLog

public class CacheFlusher
    implements Runnable
{

    protected Core a;
    protected Handler b;
    protected boolean c;
    protected long d;

    public CacheFlusher(Core core)
    {
        d = -1L;
        a = core;
    }

    protected void a()
    {
        if (!a.getStorage().has("plannedFlushTime").booleanValue())
        {
            break MISSING_BLOCK_LABEL_39;
        }
        d = Long.parseLong(a.getStorage().get("plannedFlushTime"), 10);
        return;
        Exception exception;
        exception;
    }

    protected void a(long l)
    {
        d = l;
        a.getStorage().set("plannedFlushTime", Long.toString(l, 10));
    }

    protected void b()
    {
        if (d < 0L)
        {
            a(SystemClock.uptimeMillis() + a.getCacheFlushingInterval() * 1000L);
        }
        b.postAtTime(this, d);
    }

    protected void c()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        if (a.getCacheFlushingInterval() <= 0L)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        l = SystemClock.uptimeMillis() + a.getCacheFlushingInterval() * 1000L;
_L1:
        a(l);
        if (b != null)
        {
            b.removeCallbacks(this);
            b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        l = -1L;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    protected void d()
    {
        HandlerThread handlerthread = new HandlerThread("CacheFlusher");
        handlerthread.start();
        b = new Handler(handlerthread.getLooper());
        a();
    }

    protected void e()
    {
        if (b != null)
        {
            b.getLooper().quit();
            b = null;
        }
    }

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        CSLog.d(this, "run(): Flushing the cache");
        a.flush(false);
        a(-1L);
        b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void start()
    {
        this;
        JVM INSTR monitorenter ;
        CSLog.d(this, "start()");
        c = true;
        if (b == null && a.getCacheFlushingInterval() > 0L && a.getCustomerC2() != null)
        {
            d();
            b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void stop()
    {
        this;
        JVM INSTR monitorenter ;
        CSLog.d(this, "stop()");
        c = false;
        e();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void update()
    {
        this;
        JVM INSTR monitorenter ;
        if (a.getCacheFlushingInterval() <= 0L || a.getCustomerC2() == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        if (b != null || !c) goto _L2; else goto _L1
_L1:
        a(-1L);
        start();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (b == null) goto _L4; else goto _L3
_L3:
        c();
          goto _L4
        Exception exception;
        exception;
        throw exception;
        a(-1L);
        e();
          goto _L4
    }
}
