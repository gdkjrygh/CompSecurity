// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzi, zzbk

class nt extends zzf
{

    final String zzaTI;
    final zzi zzaTJ;
    final String zzqY;

    public Result createFailedResult(Status status)
    {
        return zzba(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzbk)ient);
    }

    protected void zza(zzbk zzbk1)
        throws RemoteException
    {
        zzbk1.zze(this, zzaTI, zzqY);
    }

    public com.google.android.gms.wearable.lApi.OpenChannelResult zzba(Status status)
    {
        return new b(status, null);
    }

    nt(zzi zzi1, GoogleApiClient googleapiclient, String s, String s1)
    {
        zzaTJ = zzi1;
        zzaTI = s;
        zzqY = s1;
        super(googleapiclient);
    }
}
