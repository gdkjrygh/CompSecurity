// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzjh, zzjg

private static final class zzQc
    implements com.google.android.gms.appindexing.pi.ActionResult
{

    private zzjh zzQa;
    private PendingResult zzQb;
    private Action zzQc;

    public PendingResult end(GoogleApiClient googleapiclient)
    {
        Object obj = googleapiclient.getContext().getPackageName();
        long l = System.currentTimeMillis();
        obj = zzjg.zza(zzQc, l, ((String) (obj)), 2);
        return zzQa.zza(googleapiclient, new UsageInfo[] {
            obj
        });
    }

    public PendingResult getPendingResult()
    {
        return zzQb;
    }

    (zzjh zzjh1, PendingResult pendingresult, Action action)
    {
        zzQa = zzjh1;
        zzQb = pendingresult;
        zzQc = action;
    }
}
