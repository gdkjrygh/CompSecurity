// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal:
//            zzfv, zzfw

public class zzfs
    implements zzfv
{

    private Object zzCM;
    private boolean zzCN;
    private final zzfw zzCO = new zzfw();
    private final Object zzoe = new Object();
    private boolean zzun;

    public zzfs()
    {
        zzCM = null;
        zzCN = false;
        zzun = false;
    }

    public boolean cancel(boolean flag)
    {
        if (!flag)
        {
            return false;
        }
        synchronized (zzoe)
        {
            if (!zzCN)
            {
                break MISSING_BLOCK_LABEL_29;
            }
        }
        return false;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzun = true;
        zzCN = true;
        zzoe.notifyAll();
        zzCO.zzfm();
        obj;
        JVM INSTR monitorexit ;
        return true;
    }

    public Object get()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = zzCN;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        Exception exception;
        Object obj1;
        try
        {
            zzoe.wait();
        }
        catch (InterruptedException interruptedexception) { }
        if (zzun)
        {
            throw new CancellationException("CallbackFuture was cancelled.");
        }
        break MISSING_BLOCK_LABEL_45;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj1 = zzCM;
        obj;
        JVM INSTR monitorexit ;
        return obj1;
    }

    public Object get(long l, TimeUnit timeunit)
        throws TimeoutException
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = zzCN;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        l = timeunit.toMillis(l);
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        try
        {
            zzoe.wait(l);
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit) { }
        if (!zzCN)
        {
            throw new TimeoutException("CallbackFuture timed out.");
        }
        break MISSING_BLOCK_LABEL_63;
        timeunit;
        obj;
        JVM INSTR monitorexit ;
        throw timeunit;
        if (zzun)
        {
            throw new CancellationException("CallbackFuture was cancelled.");
        }
        timeunit = ((TimeUnit) (zzCM));
        obj;
        JVM INSTR monitorexit ;
        return timeunit;
    }

    public boolean isCancelled()
    {
        boolean flag;
        synchronized (zzoe)
        {
            flag = zzun;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isDone()
    {
        boolean flag;
        synchronized (zzoe)
        {
            flag = zzCN;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzb(Runnable runnable)
    {
        zzCO.zzb(runnable);
    }

    public void zzc(Object obj)
    {
        Object obj1 = zzoe;
        obj1;
        JVM INSTR monitorenter ;
        if (zzCN)
        {
            throw new IllegalStateException("Provided CallbackFuture with multiple values.");
        }
        break MISSING_BLOCK_LABEL_29;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        zzCN = true;
        zzCM = obj;
        zzoe.notifyAll();
        zzCO.zzfm();
        obj1;
        JVM INSTR monitorexit ;
    }
}
