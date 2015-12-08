// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzu;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, BatchResultToken, PendingResult, Status

public final class BatchResult
    implements Result
{

    private final Status zzOt;
    private final PendingResult zzWq[];

    BatchResult(Status status, PendingResult apendingresult[])
    {
        zzOt = status;
        zzWq = apendingresult;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public Result take(BatchResultToken batchresulttoken)
    {
        boolean flag;
        if (batchresulttoken.mId < zzWq.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "The result token does not belong to this batch");
        return zzWq[batchresulttoken.mId].await(0L, TimeUnit.MILLISECONDS);
    }
}
