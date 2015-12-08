// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal:
//            zzhv, zzhw

public class zzhs
    implements zzhv
{

    private Object zzGK;
    private boolean zzGL;
    private final zzhw zzGM = new zzhw();
    private final Object zzqt = new Object();
    private boolean zzxo;

    public zzhs()
    {
        zzGK = null;
        zzGL = false;
        zzxo = false;
    }

    public boolean cancel(boolean flag)
    {
        if (!flag)
        {
            return false;
        }
        synchronized (zzqt)
        {
            if (!zzGL)
            {
                break MISSING_BLOCK_LABEL_29;
            }
        }
        return false;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzxo = true;
        zzGL = true;
        zzqt.notifyAll();
        zzGM.zzgy();
        obj;
        JVM INSTR monitorexit ;
        return true;
    }

    public Object get()
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = zzGL;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        Exception exception;
        Object obj1;
        try
        {
            zzqt.wait();
        }
        catch (InterruptedException interruptedexception) { }
        if (zzxo)
        {
            throw new CancellationException("CallbackFuture was cancelled.");
        }
        break MISSING_BLOCK_LABEL_45;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj1 = zzGK;
        obj;
        JVM INSTR monitorexit ;
        return obj1;
    }

    public Object get(long l, TimeUnit timeunit)
        throws TimeoutException
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = zzGL;
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
            zzqt.wait(l);
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit) { }
        if (!zzGL)
        {
            throw new TimeoutException("CallbackFuture timed out.");
        }
        break MISSING_BLOCK_LABEL_63;
        timeunit;
        obj;
        JVM INSTR monitorexit ;
        throw timeunit;
        if (zzxo)
        {
            throw new CancellationException("CallbackFuture was cancelled.");
        }
        timeunit = ((TimeUnit) (zzGK));
        obj;
        JVM INSTR monitorexit ;
        return timeunit;
    }

    public boolean isCancelled()
    {
        boolean flag;
        synchronized (zzqt)
        {
            flag = zzxo;
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
        synchronized (zzqt)
        {
            flag = zzGL;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzb(Runnable runnable)
    {
        zzGM.zzb(runnable);
    }

    public void zzf(Object obj)
    {
        Object obj1 = zzqt;
        obj1;
        JVM INSTR monitorenter ;
        if (zzGL)
        {
            throw new IllegalStateException("Provided CallbackFuture with multiple values.");
        }
        break MISSING_BLOCK_LABEL_29;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        zzGL = true;
        zzGK = obj;
        zzqt.notifyAll();
        zzGM.zzgy();
        obj1;
        JVM INSTR monitorexit ;
    }
}
