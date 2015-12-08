// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.result.SessionStopResult;

// Referenced classes of package com.google.android.gms.internal:
//            zznf, zzmd, zzmo

class eApiClient extends a
{

    final String val$name;
    final zznf zzalC;
    final String zzalD;

    protected Result createFailedResult(Status status)
    {
        return zzH(status);
    }

    protected SessionStopResult zzH(Status status)
    {
        return SessionStopResult.zzP(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzmd)ent);
    }

    protected void zza(zzmd zzmd1)
        throws RemoteException
    {
        b b = new b(this, null);
        String s = zzmd1.getContext().getPackageName();
        ((zzmo)zzmd1.zznM()).zza(new SessionStopRequest(val$name, zzalD, b, s));
    }

    eApiClient(GoogleApiClient googleapiclient, String s, String s1)
    {
        zzalC = final_zznf1;
        val$name = s;
        zzalD = s1;
        super(googleapiclient);
    }
}
