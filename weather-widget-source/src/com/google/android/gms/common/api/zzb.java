// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            PendingResult, Result, Releasable, Status, 
//            ResultCallback

public abstract class zzb
    implements PendingResult
{
    public static class zza extends Handler
    {

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
                return;

            case 1: // '\001'
                message = (Pair)message.obj;
                zzb((ResultCallback)((Pair) (message)).first, (Result)((Pair) (message)).second);
                return;

            case 2: // '\002'
                ((zzb)message.obj).zzw(Status.zzaaG);
                break;
            }
        }

        public void zza(ResultCallback resultcallback, Result result)
        {
            sendMessage(obtainMessage(1, new Pair(resultcallback, result)));
        }

        public void zza(zzb zzb1, long l)
        {
            sendMessageDelayed(obtainMessage(2, zzb1), l);
        }

        protected void zzb(ResultCallback resultcallback, Result result)
        {
            try
            {
                resultcallback.onResult(result);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ResultCallback resultcallback)
            {
                zzb.zzc(result);
            }
            throw resultcallback;
        }

        public void zzna()
        {
            removeMessages(2);
        }

        public zza()
        {
            this(Looper.getMainLooper());
        }

        public zza(Looper looper)
        {
            super(looper);
        }
    }


    private boolean zzL;
    private final Object zzYD;
    protected final zza zzYE;
    private final ArrayList zzYF;
    private ResultCallback zzYG;
    private volatile Result zzYH;
    private volatile boolean zzYI;
    private boolean zzYJ;
    private zzq zzYK;
    private final CountDownLatch zzoR;

    protected zzb(Looper looper)
    {
        zzYD = new Object();
        zzoR = new CountDownLatch(1);
        zzYF = new ArrayList();
        zzYE = new zza(looper);
    }

    protected zzb(zza zza1)
    {
        zzYD = new Object();
        zzoR = new CountDownLatch(1);
        zzYF = new ArrayList();
        zzYE = (zza)zzx.zzb(zza1, "CallbackHandler must not be null");
    }

    private Result get()
    {
        boolean flag = true;
        Object obj = zzYD;
        obj;
        JVM INSTR monitorenter ;
        Result result;
        if (zzYI)
        {
            flag = false;
        }
        zzx.zza(flag, "Result has already been consumed.");
        zzx.zza(isReady(), "Result is not ready.");
        result = zzYH;
        zzYH = null;
        zzYG = null;
        zzYI = true;
        zzmZ();
        return result;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void zzb(Result result)
    {
        zzYH = result;
        zzYK = null;
        zzoR.countDown();
        result = zzYH.getStatus();
        if (zzYG != null)
        {
            zzYE.zzna();
            if (!zzL)
            {
                zzYE.zza(zzYG, get());
            }
        }
        for (Iterator iterator = zzYF.iterator(); iterator.hasNext(); ((PendingResult.BatchCallback)iterator.next()).onComplete(result)) { }
        zzYF.clear();
    }

    static void zzc(Result result)
    {
        if (!(result instanceof Releasable))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((Releasable)result).release();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("AbstractPendingResult", (new StringBuilder()).append("Unable to release ").append(result).toString(), runtimeexception);
        return;
    }

    public final void addBatchCallback(PendingResult.BatchCallback batchcallback)
    {
        Object obj;
        boolean flag;
        if (!zzYI)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "Result has already been consumed.");
        obj = zzYD;
        obj;
        JVM INSTR monitorenter ;
        if (!isReady())
        {
            break MISSING_BLOCK_LABEL_47;
        }
        batchcallback.onComplete(zzYH.getStatus());
_L2:
        return;
        zzYF.add(batchcallback);
        if (true) goto _L2; else goto _L1
_L1:
        batchcallback;
        obj;
        JVM INSTR monitorexit ;
        throw batchcallback;
    }

    public final Result await()
    {
        boolean flag1 = true;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "await must not be called on the UI thread");
        if (!zzYI)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "Result has already been consumed");
        try
        {
            zzoR.await();
        }
        catch (InterruptedException interruptedexception)
        {
            zzw(Status.zzaaE);
        }
        zzx.zza(isReady(), "Result is not ready.");
        return get();
    }

    public final Result await(long l, TimeUnit timeunit)
    {
        boolean flag1 = true;
        boolean flag;
        if (l <= 0L || Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "await must not be called on the UI thread when time is greater than zero.");
        if (!zzYI)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "Result has already been consumed.");
        try
        {
            if (!zzoR.await(l, timeunit))
            {
                zzw(Status.zzaaG);
            }
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            zzw(Status.zzaaE);
        }
        zzx.zza(isReady(), "Result is not ready.");
        return get();
    }

    public void cancel()
    {
label0:
        {
            synchronized (zzYD)
            {
                if (!zzL && !zzYI)
                {
                    break label0;
                }
            }
            return;
        }
        zzq zzq1 = zzYK;
        if (zzq1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        try
        {
            zzYK.cancel();
        }
        catch (RemoteException remoteexception) { }
        zzc(zzYH);
        zzYG = null;
        zzL = true;
        zzb(zzb(Status.zzaaH));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isCanceled()
    {
        boolean flag;
        synchronized (zzYD)
        {
            flag = zzL;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean isReady()
    {
        return zzoR.getCount() == 0L;
    }

    public final void setResultCallback(ResultCallback resultcallback)
    {
label0:
        {
            boolean flag;
            if (!zzYI)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zza(flag, "Result has already been consumed.");
            synchronized (zzYD)
            {
                if (!isCanceled())
                {
                    break label0;
                }
            }
            return;
        }
        if (!isReady())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        zzYE.zza(resultcallback, get());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        resultcallback;
        obj;
        JVM INSTR monitorexit ;
        throw resultcallback;
        zzYG = resultcallback;
          goto _L1
    }

    public final void setResultCallback(ResultCallback resultcallback, long l, TimeUnit timeunit)
    {
label0:
        {
            boolean flag;
            if (!zzYI)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zza(flag, "Result has already been consumed.");
            synchronized (zzYD)
            {
                if (!isCanceled())
                {
                    break label0;
                }
            }
            return;
        }
        if (!isReady())
        {
            break MISSING_BLOCK_LABEL_66;
        }
        zzYE.zza(resultcallback, get());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        resultcallback;
        obj;
        JVM INSTR monitorexit ;
        throw resultcallback;
        zzYG = resultcallback;
        zzYE.zza(this, timeunit.toMillis(l));
          goto _L1
    }

    public final void zza(Result result)
    {
        boolean flag1;
label0:
        {
            flag1 = true;
            synchronized (zzYD)
            {
                if (!zzYJ && !zzL)
                {
                    break label0;
                }
                zzc(result);
            }
            return;
        }
        boolean flag;
        if (!isReady())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "Results have already been set");
        if (!zzYI)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "Result has already been consumed");
        zzb(result);
        obj;
        JVM INSTR monitorexit ;
        return;
        result;
        obj;
        JVM INSTR monitorexit ;
        throw result;
    }

    protected final void zza(zzq zzq1)
    {
        synchronized (zzYD)
        {
            zzYK = zzq1;
        }
        return;
        zzq1;
        obj;
        JVM INSTR monitorexit ;
        throw zzq1;
    }

    protected abstract Result zzb(Status status);

    protected void zzmZ()
    {
    }

    public final void zzw(Status status)
    {
        synchronized (zzYD)
        {
            if (!isReady())
            {
                zza(zzb(status));
                zzYJ = true;
            }
        }
        return;
        status;
        obj;
        JVM INSTR monitorexit ;
        throw status;
    }
}
