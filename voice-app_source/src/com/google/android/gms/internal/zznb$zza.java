// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.fitness.result.DataReadResult;

// Referenced classes of package com.google.android.gms.internal:
//            zznb

private static class  extends 
{

    private final com.google.android.gms.common.api.eadResult zzOs;
    private int zzalm;
    private DataReadResult zzaln;

    public void zza(DataReadResult datareadresult)
    {
        this;
        JVM INSTR monitorenter ;
        Log.v("Fitness", "Received batch result");
        if (zzaln != null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        zzaln = datareadresult;
_L2:
        zzalm = zzalm + 1;
        if (zzalm == zzaln.zzrt())
        {
            zzOs.zm(zzaln);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        zzaln.zzb(datareadresult);
        if (true) goto _L2; else goto _L1
_L1:
        datareadresult;
        this;
        JVM INSTR monitorexit ;
        throw datareadresult;
    }

    private (com.google.android.gms.common.api. )
    {
        zzalm = 0;
        zzaln = null;
        zzOs = ;
    }

    (com.google.android.gms.common.api.Os os,  )
    {
        this(os);
    }
}
