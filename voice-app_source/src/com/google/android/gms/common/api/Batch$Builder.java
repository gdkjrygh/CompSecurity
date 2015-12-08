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
        return new Batch(zzWs, zzWt, null);
    }

    public t(GoogleApiClient googleapiclient)
    {
        zzWs = new ArrayList();
        zzWt = googleapiclient.getLooper();
    }
}
