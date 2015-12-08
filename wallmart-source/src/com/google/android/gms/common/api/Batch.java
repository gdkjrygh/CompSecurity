// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            zzb, PendingResult, BatchResult, Status, 
//            Result, GoogleApiClient, BatchResultToken

public final class Batch extends zzb
{
    public static final class Builder
    {

        private List zzYU;
        private Looper zzYV;

        public BatchResultToken add(PendingResult pendingresult)
        {
            BatchResultToken batchresulttoken = new BatchResultToken(zzYU.size());
            zzYU.add(pendingresult);
            return batchresulttoken;
        }

        public Batch build()
        {
            return new Batch(zzYU, zzYV);
        }

        public Builder(GoogleApiClient googleapiclient)
        {
            zzYU = new ArrayList();
            zzYV = googleapiclient.getLooper();
        }
    }


    private int zzYP;
    private boolean zzYQ;
    private boolean zzYR;
    private final PendingResult zzYS[];
    private final Object zzpc;

    private Batch(List list, Looper looper)
    {
        super(new zzb.zza(looper));
        zzpc = new Object();
        zzYP = list.size();
        zzYS = new PendingResult[zzYP];
        for (int i = 0; i < list.size(); i++)
        {
            looper = (PendingResult)list.get(i);
            zzYS[i] = looper;
            looper.addBatchCallback(new PendingResult.BatchCallback() {

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

            
            {
                zzYT = Batch.this;
                super();
            }
            });
        }

    }


    static Object zza(Batch batch)
    {
        return batch.zzpc;
    }

    static boolean zza(Batch batch, boolean flag)
    {
        batch.zzYR = flag;
        return flag;
    }

    static int zzb(Batch batch)
    {
        int i = batch.zzYP;
        batch.zzYP = i - 1;
        return i;
    }

    static boolean zzb(Batch batch, boolean flag)
    {
        batch.zzYQ = flag;
        return flag;
    }

    static int zzc(Batch batch)
    {
        return batch.zzYP;
    }

    static boolean zzd(Batch batch)
    {
        return batch.zzYR;
    }

    static void zze(Batch batch)
    {
        batch.zzb.cancel();
    }

    static boolean zzf(Batch batch)
    {
        return batch.zzYQ;
    }

    static PendingResult[] zzg(Batch batch)
    {
        return batch.zzYS;
    }

    public void cancel()
    {
        super.cancel();
        PendingResult apendingresult[] = zzYS;
        int j = apendingresult.length;
        for (int i = 0; i < j; i++)
        {
            apendingresult[i].cancel();
        }

    }

    public BatchResult createFailedResult(Status status)
    {
        return new BatchResult(status, zzYS);
    }

    public Result zzb(Status status)
    {
        return createFailedResult(status);
    }
}
