// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzg, zzbk

class nt extends zzf
{

    final int zzaTA;
    final zzg zzaTB;
    final String zzaTz;

    protected Result createFailedResult(Status status)
    {
        return zzaW(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzbk)ient);
    }

    protected void zza(zzbk zzbk1)
        throws RemoteException
    {
        zzbk1.zzg(this, zzaTz, zzaTA);
    }

    protected com.google.android.gms.wearable.lityApi.GetCapabilityResult zzaW(Status status)
    {
        return new e(status, null);
    }

    nt(zzg zzg1, GoogleApiClient googleapiclient, String s, int i)
    {
        zzaTB = zzg1;
        zzaTz = s;
        zzaTA = i;
        super(googleapiclient);
    }
}
