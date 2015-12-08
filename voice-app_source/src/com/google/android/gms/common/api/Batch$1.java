// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;


// Referenced classes of package com.google.android.gms.common.api:
//            Batch, Status, BatchResult

class zzWr
    implements esult.BatchCallback
{

    final Batch zzWr;

    public void zzs(Status status)
    {
label0:
        {
            synchronized (Batch.zza(zzWr))
            {
                if (!zzWr.isCanceled())
                {
                    break label0;
                }
            }
            return;
        }
        if (!status.isCanceled()) goto _L2; else goto _L1
_L1:
        Batch.zza(zzWr, true);
_L8:
        Batch.zzb(zzWr);
        if (Batch.zzc(zzWr) != 0) goto _L4; else goto _L3
_L3:
        if (!Batch.zzd(zzWr)) goto _L6; else goto _L5
_L5:
        Batch.zze(zzWr);
_L4:
        obj;
        JVM INSTR monitorexit ;
        return;
        status;
        obj;
        JVM INSTR monitorexit ;
        throw status;
_L2:
        if (status.isSuccess()) goto _L8; else goto _L7
_L7:
        Batch.zzb(zzWr, true);
          goto _L8
_L6:
        if (!Batch.zzf(zzWr))
        {
            break MISSING_BLOCK_LABEL_146;
        }
        status = new Status(13);
_L9:
        zzWr.setResult(new BatchResult(status, Batch.zzg(zzWr)));
          goto _L4
        status = Status.zzXP;
          goto _L9
    }

    ult(Batch batch)
    {
        zzWr = batch;
        super();
    }
}
