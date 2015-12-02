// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.internal.jr;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.api:
//            PendingResult, Api, Result, Status, 
//            BaseImplementation, ResultCallback

public abstract class 
    implements , PendingResult
{

    private final Object Jp = new Object();
    private final ArrayList Jq = new ArrayList();
    private ResultCallback Jr;
    private volatile Result Js;
    private volatile boolean Jt;
    private boolean Ju;
    private boolean Jv;
    private jr Jw;
    protected final mr mHandler;
    private final CountDownLatch mr = new CountDownLatch(1);

    static void a( )
    {
        .gD();
    }

    private void c(Result result)
    {
        int i = Api.a;
        Js = result;
        Jw = null;
        mr.countDown();
        result = Js.getStatus();
        if (Jr != null)
        {
            mHandler.TimeoutMessages();
            if (!Ju)
            {
                mHandler.sultCallback(Jr, gA());
            }
        }
        Iterator iterator = Jq.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((Jq)iterator.next()).Jq(result);
        } while (i == 0);
        Jq.clear();
    }

    private Result gA()
    {
        Object obj = Jp;
        obj;
        JVM INSTR monitorenter ;
        Result result;
        Exception exception;
        boolean flag;
        if (!Jt)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Result has already been consumed.");
        jx.a(isReady(), "Result is not ready.");
        result = Js;
        gB();
        obj;
        JVM INSTR monitorexit ;
        return result;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void gD()
    {
        synchronized (Jp)
        {
            if (!isReady())
            {
                b(c(Status.Kz));
                Jv = true;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(Result result)
    {
        boolean flag1;
label0:
        {
            flag1 = true;
            synchronized (Jp)
            {
                if (!Jv && !Ju)
                {
                    break label0;
                }
                BaseImplementation.a(result);
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
        jx.a(flag, "Results have already been set");
        if (!Jt)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Result has already been consumed");
        c(result);
        obj;
        JVM INSTR monitorexit ;
        return;
        result;
        obj;
        JVM INSTR monitorexit ;
        throw result;
    }

    protected abstract Result c(Status status);

    public void cancel()
    {
label0:
        {
            synchronized (Jp)
            {
                if (!Ju && !Jt)
                {
                    break label0;
                }
            }
            return;
        }
        jr jr1 = Jw;
        if (jr1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        try
        {
            Jw.cancel();
        }
        catch (RemoteException remoteexception) { }
        BaseImplementation.a(Js);
        Jr = null;
        Ju = true;
        c(c(Status.KA));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void gB()
    {
        Jt = true;
        Js = null;
        Jr = null;
    }

    public final boolean isReady()
    {
        return mr.getCount() == 0L;
    }

    protected (Looper looper)
    {
        mHandler = new (looper);
    }
}
