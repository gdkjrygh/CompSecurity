// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzu, zzbk

class nt extends zzf
{

    final zzu zzaUe;
    final com.google.android.gms.wearable.i.DataListener zzaUi;

    public Result createFailedResult(Status status)
    {
        return zzb(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzbk)ient);
    }

    protected void zza(zzbk zzbk1)
        throws RemoteException
    {
        zzbk1.zza(this, zzaUi);
    }

    public Status zzb(Status status)
    {
        return status;
    }

    nt(zzu zzu1, GoogleApiClient googleapiclient, com.google.android.gms.wearable.i.DataListener datalistener)
    {
        zzaUe = zzu1;
        zzaUi = datalistener;
        super(googleapiclient);
    }
}
