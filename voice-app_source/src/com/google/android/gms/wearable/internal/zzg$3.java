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

    final zzg zzaTB;
    final String zzaTz;

    protected Result createFailedResult(Status status)
    {
        return zzaY(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzbk)ient);
    }

    protected void zza(zzbk zzbk1)
        throws RemoteException
    {
        zzbk1.zzr(this, zzaTz);
    }

    protected com.google.android.gms.wearable.lityApi.AddLocalCapabilityResult zzaY(Status status)
    {
        return new b(status);
    }

    nt(zzg zzg1, GoogleApiClient googleapiclient, String s)
    {
        zzaTB = zzg1;
        zzaTz = s;
        super(googleapiclient);
    }
}
