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
//            zzh, zzw, zzbn

private static final class ner extends zzh
{

    private com.google.android.gms.wearable.DataListener zzbak;
    private IntentFilter zzbal[];

    protected volatile void zza(com.google.android.gms.common.api.zw.zza zza1)
        throws RemoteException
    {
        zza((zzbn)zza1);
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zza(this, zzbak, zzbal);
        zzbak = null;
        zzbal = null;
    }

    public Result zzb(Status status)
    {
        return zzd(status);
    }

    public Status zzd(Status status)
    {
        zzbak = null;
        zzbal = null;
        return status;
    }

    private (GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataListener datalistener, IntentFilter aintentfilter[])
    {
        super(googleapiclient);
        zzbak = datalistener;
        zzbal = aintentfilter;
    }

    ner(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataListener datalistener, IntentFilter aintentfilter[], ner ner)
    {
        this(googleapiclient, datalistener, aintentfilter);
    }
}
