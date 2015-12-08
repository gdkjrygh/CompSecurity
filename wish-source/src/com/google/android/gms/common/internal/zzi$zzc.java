// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzi

protected abstract class zzTA
{

    private Object mListener;
    private boolean zzTA;
    final zzi zzTz;

    public void unregister()
    {
        zzmc();
        synchronized (zzi.zzd(zzTz))
        {
            zzi.zzd(zzTz).remove(this);
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract void zzma();

    public void zzmb()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = mListener;
        if (zzTA)
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
                zzo(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                zzma();
                throw obj1;
            }
        } else
        {
            zzma();
        }
        this;
        JVM INSTR monitorenter ;
        zzTA = true;
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

    public void zzmc()
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

    protected abstract void zzo(Object obj);

    public (zzi zzi1, Object obj)
    {
        zzTz = zzi1;
        super();
        mListener = obj;
        zzTA = false;
    }
}
