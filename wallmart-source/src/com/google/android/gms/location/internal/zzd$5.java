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

    final LocationRequest zzaCA;
    final zzd zzaCC;
    final Looper zzaCF;
    final LocationCallback zzaCG;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzj)b);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        zzj1.zza(LocationRequestInternal.zzb(zzaCA), zzaCG, zzaCF);
        zza(((com.google.android.gms.common.api.Result) (Status.zzaaD)));
    }

    nt(zzd zzd1, GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationCallback locationcallback, Looper looper)
    {
        zzaCC = zzd1;
        zzaCA = locationrequest;
        zzaCG = locationcallback;
        zzaCF = looper;
        super(googleapiclient);
    }
}
