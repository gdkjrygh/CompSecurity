// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzu, zzbk

class nt extends zzf
{

    final zzu zzaUe;
    final Asset zzaUg;

    protected Result createFailedResult(Status status)
    {
        return zzbg(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzbk)ient);
    }

    protected void zza(zzbk zzbk1)
        throws RemoteException
    {
        zzbk1.zza(this, zzaUg);
    }

    protected com.google.android.gms.wearable.i.GetFdForAssetResult zzbg(Status status)
    {
        return new d(status, null);
    }

    nt(zzu zzu1, GoogleApiClient googleapiclient, Asset asset)
    {
        zzaUe = zzu1;
        zzaUg = asset;
        super(googleapiclient);
    }
}
