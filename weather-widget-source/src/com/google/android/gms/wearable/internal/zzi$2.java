// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzh, zzi, zzbn

class nt extends zzh
{

    final int zzaZC;
    final zzi zzaZD;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzbn)b);
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zzd(this, zzaZC);
    }

    protected Result zzb(Status status)
    {
        return zzbj(status);
    }

    protected com.google.android.gms.wearable.lityApi.GetAllCapabilitiesResult zzbj(Status status)
    {
        return new d(status, null);
    }

    nt(zzi zzi1, GoogleApiClient googleapiclient, int i)
    {
        zzaZD = zzi1;
        zzaZC = i;
        super(googleapiclient);
    }
}
