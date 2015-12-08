// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzl, zzo

public final class zzp
{

    private static final zzl zzQW = new zzl("RequestTracker");
    public static final Object zzVr = new Object();
    private long zzTM;
    private long zzVo;
    private long zzVp;
    private zzo zzVq;

    public zzp(long l)
    {
        zzVo = l;
        zzTM = -1L;
        zzVp = 0L;
    }

    private void zzmd()
    {
        zzTM = -1L;
        zzVq = null;
        zzVp = 0L;
    }

    public void clear()
    {
        synchronized (zzVr)
        {
            if (zzTM != -1L)
            {
                zzmd();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzB(long l)
    {
        Object obj = zzVr;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzTM != -1L && zzTM == l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(long l, zzo zzo1)
    {
        zzo zzo2;
        long l1;
        synchronized (zzVr)
        {
            zzo2 = zzVq;
            l1 = zzTM;
            zzTM = l;
            zzVq = zzo1;
            zzVp = SystemClock.elapsedRealtime();
        }
        if (zzo2 != null)
        {
            zzo2.zzy(l1);
        }
        return;
        zzo1;
        obj;
        JVM INSTR monitorexit ;
        throw zzo1;
    }

    public boolean zzc(long l, int i)
    {
        return zzc(l, i, null);
    }

    public boolean zzc(long l, int i, Object obj)
    {
        zzo zzo1;
        boolean flag;
        flag = true;
        zzo1 = null;
        Object obj1 = zzVr;
        obj1;
        JVM INSTR monitorenter ;
        if (zzTM == -1L || zzTM != l)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        zzQW.zzb("request %d completed", new Object[] {
            Long.valueOf(zzTM)
        });
        zzo1 = zzVq;
        zzmd();
_L2:
        if (zzo1 != null)
        {
            zzo1.zza(l, i, obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean zzd(long l, int i)
    {
        long l1;
        boolean flag;
        flag = true;
        l1 = 0L;
        Object obj1 = zzVr;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        if (zzTM == -1L || l - zzVp < zzVo)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        zzQW.zzb("request %d timed out", new Object[] {
            Long.valueOf(zzTM)
        });
        l = zzTM;
        obj = zzVq;
        zzmd();
_L2:
        if (obj != null)
        {
            ((zzo) (obj)).zza(l, i, null);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        flag = false;
        obj = null;
        l = l1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean zzme()
    {
        Object obj = zzVr;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzTM != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
