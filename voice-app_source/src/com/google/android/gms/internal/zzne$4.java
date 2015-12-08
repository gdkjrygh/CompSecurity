// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.zzj;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzne, zzmc, zzmn

class eApiClient extends c
{

    final zzne zzals;
    final a zzalx;
    final zzj zzaly;
    final PendingIntent zzalz;

    protected Result createFailedResult(Status status)
    {
        return zzb(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzmc)ent);
    }

    protected void zza(zzmc zzmc1)
        throws RemoteException
    {
        c c = new c(this, zzalx, null);
        String s = zzmc1.getContext().getPackageName();
        ((zzmn)zzmc1.zznM()).zza(new SensorUnregistrationRequest(zzaly, zzalz, c, s));
    }

    protected Status zzb(Status status)
    {
        return status;
    }

    eApiClient(zzne zzne1, GoogleApiClient googleapiclient, a a, zzj zzj, PendingIntent pendingintent)
    {
        zzals = zzne1;
        zzalx = a;
        zzaly = zzj;
        zzalz = pendingintent;
        super(googleapiclient);
    }
}
