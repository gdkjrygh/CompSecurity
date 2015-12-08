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
//            zzht

class zzii
{

    private final Object zzIJ = new Object();
    private final List zzIK = new ArrayList();
    private final List zzIL = new ArrayList();
    private boolean zzIM;

    public zzii()
    {
        zzIM = false;
    }

    private void zzd(Runnable runnable)
    {
        com.google.android.gms.internal.zzht.zza(runnable);
    }

    private void zze(Runnable runnable)
    {
        zza.zzIy.post(runnable);
    }

    public void zzc(Runnable runnable)
    {
        Object obj = zzIJ;
        obj;
        JVM INSTR monitorenter ;
        if (!zzIM)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        zzd(runnable);
_L2:
        return;
        zzIK.add(runnable);
        if (true) goto _L2; else goto _L1
_L1:
        runnable;
        obj;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    public void zzgK()
    {
label0:
        {
            synchronized (zzIJ)
            {
                if (!zzIM)
                {
                    break label0;
                }
            }
            return;
        }
        for (Iterator iterator = zzIK.iterator(); iterator.hasNext(); zzd((Runnable)iterator.next())) { }
        break MISSING_BLOCK_LABEL_57;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        for (Iterator iterator1 = zzIL.iterator(); iterator1.hasNext(); zze((Runnable)iterator1.next())) { }
        zzIK.clear();
        zzIL.clear();
        zzIM = true;
        obj;
        JVM INSTR monitorexit ;
    }
}
