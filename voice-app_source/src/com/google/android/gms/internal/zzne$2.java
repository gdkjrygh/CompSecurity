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
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzne, zzmc, zzng, zzmn

class eApiClient extends c
{

    final zzne zzals;
    final SensorRequest zzalt;
    final zzj zzalu;
    final PendingIntent zzalv;

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
        zzng zzng1 = new zzng(this);
        String s = zzmc1.getContext().getPackageName();
        ((zzmn)zzmc1.zznM()).zza(new SensorRegistrationRequest(zzalt, zzalu, zzalv, zzng1, s));
    }

    protected Status zzb(Status status)
    {
        return status;
    }

    eApiClient(zzne zzne1, GoogleApiClient googleapiclient, SensorRequest sensorrequest, zzj zzj, PendingIntent pendingintent)
    {
        zzals = zzne1;
        zzalt = sensorrequest;
        zzalu = zzj;
        zzalv = pendingintent;
        super(googleapiclient);
    }
}
