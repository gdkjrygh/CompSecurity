// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            AbstractPendingResult, PendingResult, BatchResult, Status, 
//            Result, GoogleApiClient, BatchResultToken

public final class Batch extends AbstractPendingResult
{
    public static final class Builder
    {

        private List zzWs;
        private Looper zzWt;

        public BatchResultToken add(PendingResult pendingresult)
        {
            BatchResultToken batchresulttoken = new BatchResultToken(zzWs.size());
            zzWs.add(pendingresult);
            return batchresulttoken;
        }

        public Batch build()
        {
            return new Batch(zzWs, zzWt);
        }

        public Builder(GoogleApiClient googleapiclient)
        {
            zzWs = new ArrayList();
            zzWt = googleapiclient.getLooper();
        }
    }


    private int zzWn;
    private boolean zzWo;
    private boolean zzWp;
    private final PendingResult zzWq[];
    private final Object zzqt;

    private Batch(List list, Looper looper)
    {
        super(new AbstractPendingResult.CallbackHandler(looper));
        zzqt = new Object();
        zzWn = list.size();
        zzWq = new PendingResult[zzWn];
        for (int i = 0; i < list.size(); i++)
        {
            looper = (PendingResult)list.get(i);
            zzWq[i] = looper;
            looper.addBatchCallback(new PendingResult.BatchCallback() {

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

            
            {
                zzWr = Batch.this;
                super();
            }
            });
        }

    }


    static Object zza(Batch batch)
    {
        return batch.zzqt;
    }

    static boolean zza(Batch batch, boolean flag)
    {
        batch.zzWp = flag;
        return flag;
    }

    static int zzb(Batch batch)
    {
        int i = batch.zzWn;
        batch.zzWn = i - 1;
        return i;
    }

    static boolean zzb(Batch batch, boolean flag)
    {
        batch.zzWo = flag;
        return flag;
    }

    static int zzc(Batch batch)
    {
        return batch.zzWn;
    }

    static boolean zzd(Batch batch)
    {
        return batch.zzWp;
    }

    static void zze(Batch batch)
    {
        batch.AbstractPendingResult.cancel();
    }

    static boolean zzf(Batch batch)
    {
        return batch.zzWo;
    }

    static PendingResult[] zzg(Batch batch)
    {
        return batch.zzWq;
    }

    public void cancel()
    {
        super.cancel();
        PendingResult apendingresult[] = zzWq;
        int j = apendingresult.length;
        for (int i = 0; i < j; i++)
        {
            apendingresult[i].cancel();
        }

    }

    public BatchResult createFailedResult(Status status)
    {
        return new BatchResult(status, zzWq);
    }

    public volatile Result createFailedResult(Status status)
    {
        return createFailedResult(status);
    }
}
