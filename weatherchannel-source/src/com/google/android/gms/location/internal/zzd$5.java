// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzd, zzj, LocationRequestInternal

class nt extends a
{

    final zzd zzayA;
    final Looper zzayD;
    final LocationCallback zzayE;
    final LocationRequest zzayy;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzj)ient);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        zzj1.zza(LocationRequestInternal.zzb(zzayy), zzayE, zzayD);
        setResult(Status.zzXP);
    }

    nt(zzd zzd1, GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationCallback locationcallback, Looper looper)
    {
        zzayA = zzd1;
        zzayy = locationrequest;
        zzayE = locationcallback;
        zzayD = looper;
        super(googleapiclient);
    }
}
