// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            Batch, GoogleApiClient, BatchResultToken, PendingResult

public static final class t.getLooper
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
        return new Batch(zzYU, zzYV, null);
    }

    public t(GoogleApiClient googleapiclient)
    {
        zzYU = new ArrayList();
        zzYV = googleapiclient.getLooper();
    }
}
