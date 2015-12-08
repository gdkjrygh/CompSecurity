// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzd, zzj

class nt extends a
{

    final zzd zzayA;
    final Location zzayC;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzj)ient);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        zzj1.zzb(zzayC);
        setResult(Status.zzXP);
    }

    nt(zzd zzd1, GoogleApiClient googleapiclient, Location location)
    {
        zzayA = zzd1;
        zzayC = location;
        super(googleapiclient);
    }
}
