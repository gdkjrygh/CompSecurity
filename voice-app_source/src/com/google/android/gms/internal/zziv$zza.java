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
//            zziv, zziu

private static final class zzNU
    implements com.google.android.gms.appindexing.pi.ActionResult
{

    private zziv zzNS;
    private PendingResult zzNT;
    private Action zzNU;

    public PendingResult end(GoogleApiClient googleapiclient)
    {
        Object obj = googleapiclient.getContext().getPackageName();
        long l = System.currentTimeMillis();
        obj = zziu.zza(zzNU, l, ((String) (obj)), 2);
        return zzNS.zza(googleapiclient, new UsageInfo[] {
            obj
        });
    }

    public PendingResult getPendingResult()
    {
        return zzNT;
    }

    (zziv zziv1, PendingResult pendingresult, Action action)
    {
        zzNS = zziv1;
        zzNT = pendingresult;
        zzNU = action;
    }
}
