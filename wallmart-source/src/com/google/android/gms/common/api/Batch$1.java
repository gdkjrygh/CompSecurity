// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;


// Referenced classes of package com.google.android.gms.common.api:
//            Batch, Status, BatchResult

class zzYT
    implements esult.BatchCallback
{

    final Batch zzYT;

    public void onComplete(Status status)
    {
label0:
        {
            synchronized (Batch.zza(zzYT))
            {
                if (!zzYT.isCanceled())
                {
                    break label0;
                }
            }
            return;
        }
        if (!status.isCanceled()) goto _L2; else goto _L1
_L1:
        Batch.zza(zzYT, true);
_L8:
        Batch.zzb(zzYT);
        if (Batch.zzc(zzYT) != 0) goto _L4; else goto _L3
_L3:
        if (!Batch.zzd(zzYT)) goto _L6; else goto _L5
_L5:
        Batch.zze(zzYT);
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
        Batch.zzb(zzYT, true);
          goto _L8
_L6:
        if (!Batch.zzf(zzYT))
        {
            break MISSING_BLOCK_LABEL_146;
        }
        status = new Status(13);
_L9:
        zzYT.zza(new BatchResult(status, Batch.zzg(zzYT)));
          goto _L4
        status = Status.zzaaD;
          goto _L9
    }

    ult(Batch batch)
    {
        zzYT = batch;
        super();
    }
}
