// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzh, zzay, zzbn

class t extends zzh
{

    final zzay zzbaG;
    final com.google.android.gms.wearable.Api.MessageListener zzbaH;

    protected volatile void zza(com.google.android.gms.common.api. )
        throws RemoteException
    {
        zza((zzbn));
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zza(this, zzbaH);
    }

    public Result zzb(Status status)
    {
        return zzd(status);
    }

    public Status zzd(Status status)
    {
        return status;
    }

    t(zzay zzay1, GoogleApiClient googleapiclient, com.google.android.gms.wearable.Api.MessageListener messagelistener)
    {
        zzbaG = zzay1;
        zzbaH = messagelistener;
        super(googleapiclient);
    }
}
