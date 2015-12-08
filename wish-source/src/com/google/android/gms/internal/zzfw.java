// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.zza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzfk

class zzfw
{

    private final Object zzCS = new Object();
    private final List zzCT = new ArrayList();
    private final List zzCU = new ArrayList();
    private boolean zzCV;

    public zzfw()
    {
        zzCV = false;
    }

    private void zzc(Runnable runnable)
    {
        com.google.android.gms.internal.zzfk.zza(runnable);
    }

    private void zzd(Runnable runnable)
    {
        zza.zzCH.post(runnable);
    }

    public void zzb(Runnable runnable)
    {
        Object obj = zzCS;
        obj;
        JVM INSTR monitorenter ;
        if (!zzCV)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        zzc(runnable);
_L2:
        return;
        zzCT.add(runnable);
        if (true) goto _L2; else goto _L1
_L1:
        runnable;
        obj;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    public void zzfm()
    {
label0:
        {
            synchronized (zzCS)
            {
                if (!zzCV)
                {
                    break label0;
                }
            }
            return;
        }
        for (Iterator iterator = zzCT.iterator(); iterator.hasNext(); zzc((Runnable)iterator.next())) { }
        break MISSING_BLOCK_LABEL_57;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        for (Iterator iterator1 = zzCU.iterator(); iterator1.hasNext(); zzd((Runnable)iterator1.next())) { }
        zzCT.clear();
        zzCU.clear();
        zzCV = true;
        obj;
        JVM INSTR monitorexit ;
    }
}
