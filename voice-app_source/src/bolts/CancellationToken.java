// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.Locale;
import java.util.concurrent.CancellationException;

public class CancellationToken
{

    private boolean cancellationRequested;
    private final Object lock = new Object();

    CancellationToken()
    {
    }

    public boolean isCancellationRequested()
    {
        boolean flag;
        synchronized (lock)
        {
            flag = cancellationRequested;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void throwIfCancellationRequested()
        throws CancellationException
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        if (cancellationRequested)
        {
            throw new CancellationException();
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    public String toString()
    {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[] {
            getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(cancellationRequested)
        });
    }

    boolean tryCancel()
    {
label0:
        {
            synchronized (lock)
            {
                if (!cancellationRequested)
                {
                    break label0;
                }
            }
            return false;
        }
        cancellationRequested = true;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
