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
//            zzh, zzw, zzbn

class nt extends zzh
{

    final zzw zzbaf;
    final Asset zzbah;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzbn)b);
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zza(this, zzbah);
    }

    protected Result zzb(Status status)
    {
        return zzbs(status);
    }

    protected com.google.android.gms.wearable.i.GetFdForAssetResult zzbs(Status status)
    {
        return new d(status, null);
    }

    nt(zzw zzw1, GoogleApiClient googleapiclient, Asset asset)
    {
        zzbaf = zzw1;
        zzbah = asset;
        super(googleapiclient);
    }
}
