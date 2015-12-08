// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzh, zzba, zzbn

class t extends zzh
{

    final zzba zzbaJ;
    final com.google.android.gms.wearable..NodeListener zzbaK;

    protected volatile void zza(com.google.android.gms.common.api. )
        throws RemoteException
    {
        zza((zzbn));
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zzb(this, zzbaK);
    }

    public Result zzb(Status status)
    {
        return zzd(status);
    }

    public Status zzd(Status status)
    {
        return status;
    }

    t(zzba zzba1, GoogleApiClient googleapiclient, com.google.android.gms.wearable..NodeListener nodelistener)
    {
        zzbaJ = zzba1;
        zzbaK = nodelistener;
        super(googleapiclient);
    }
}
