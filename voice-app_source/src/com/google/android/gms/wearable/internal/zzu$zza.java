// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzu, zzbk

private static final class ner extends zzf
{

    private com.google.android.gms.wearable.DataListener zzaUj;
    private IntentFilter zzaUk[];

    public Result createFailedResult(Status status)
    {
        return zzb(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.nt nt)
        throws RemoteException
    {
        zza((zzbk)nt);
    }

    protected void zza(zzbk zzbk1)
        throws RemoteException
    {
        zzbk1.zza(this, zzaUj, zzaUk);
        zzaUj = null;
        zzaUk = null;
    }

    public Status zzb(Status status)
    {
        zzaUj = null;
        zzaUk = null;
        return status;
    }

    private (GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataListener datalistener, IntentFilter aintentfilter[])
    {
        super(googleapiclient);
        zzaUj = datalistener;
        zzaUk = aintentfilter;
    }

    ner(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataListener datalistener, IntentFilter aintentfilter[], ner ner)
    {
        this(googleapiclient, datalistener, aintentfilter);
    }
}
