// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal:
//            zzih, zzii

public class zzie
    implements zzih
{

    private Object zzID;
    private boolean zzIE;
    private final zzii zzIF = new zzii();
    private final Object zzpc = new Object();
    private boolean zzyg;

    public zzie()
    {
        zzID = null;
        zzIE = false;
        zzyg = false;
    }

    public boolean cancel(boolean flag)
    {
        if (!flag)
        {
            return false;
        }
        synchronized (zzpc)
        {
            if (!zzIE)
            {
                break MISSING_BLOCK_LABEL_29;
            }
        }
        return false;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzyg = true;
        zzIE = true;
        zzpc.notifyAll();
        zzIF.zzgK();
        obj;
        JVM INSTR monitorexit ;
        return true;
    }

    public Object get()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = zzIE;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        Exception exception;
        Object obj1;
        try
        {
            zzpc.wait();
        }
        catch (InterruptedException interruptedexception) { }
        if (zzyg)
        {
            throw new CancellationException("CallbackFuture was cancelled.");
        }
        break MISSING_BLOCK_LABEL_45;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj1 = zzID;
        obj;
        JVM INSTR monitorexit ;
        return obj1;
    }

    public Object get(long l, TimeUnit timeunit)
        throws TimeoutException
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = zzIE;
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
            zzpc.wait(l);
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit) { }
        if (!zzIE)
        {
            throw new TimeoutException("CallbackFuture timed out.");
        }
        break MISSING_BLOCK_LABEL_63;
        timeunit;
        obj;
        JVM INSTR monitorexit ;
        throw timeunit;
        if (zzyg)
        {
            throw new CancellationException("CallbackFuture was cancelled.");
        }
        timeunit = ((TimeUnit) (zzID));
        obj;
        JVM INSTR monitorexit ;
        return timeunit;
    }

    public boolean isCancelled()
    {
        boolean flag;
        synchronized (zzpc)
        {
            flag = zzyg;
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
        synchronized (zzpc)
        {
            flag = zzIE;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzc(Runnable runnable)
    {
        zzIF.zzc(runnable);
    }

    public void zzf(Object obj)
    {
        Object obj1 = zzpc;
        obj1;
        JVM INSTR monitorenter ;
        if (zzIE)
        {
            throw new IllegalStateException("Provided CallbackFuture with multiple values.");
        }
        break MISSING_BLOCK_LABEL_29;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        zzIE = true;
        zzID = obj;
        zzpc.notifyAll();
        zzIF.zzgK();
        obj1;
        JVM INSTR monitorexit ;
    }
}
