// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzj

protected abstract class zzadI
{

    private Object mListener;
    final zzj zzadH;
    private boolean zzadI;

    public void unregister()
    {
        zzoG();
        synchronized (zzj.zzc(zzadH))
        {
            zzj.zzc(zzadH).remove(this);
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract void zzoE();

    public void zzoF()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = mListener;
        if (zzadI)
        {
            Log.w("GmsClient", (new StringBuilder()).append("Callback proxy ").append(this).append(" being reused. This is not safe.").toString());
        }
        this;
        JVM INSTR monitorexit ;
        Object obj1;
        if (obj != null)
        {
            try
            {
                zzs(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                zzoE();
                throw obj1;
            }
        } else
        {
            zzoE();
        }
        this;
        JVM INSTR monitorenter ;
        zzadI = true;
        this;
        JVM INSTR monitorexit ;
        unregister();
        return;
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public void zzoG()
    {
        this;
        JVM INSTR monitorenter ;
        mListener = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract void zzs(Object obj);

    public (zzj zzj1, Object obj)
    {
        zzadH = zzj1;
        super();
        mListener = obj;
        zzadI = false;
    }
}
