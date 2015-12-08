// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzax, zzbk

class t extends zzf
{

    final zzax zzaUG;
    final com.google.android.gms.wearable..NodeListener zzaUH;

    public Result createFailedResult(Status status)
    {
        return zzb(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzbk)ent);
    }

    protected void zza(zzbk zzbk1)
        throws RemoteException
    {
        zzbk1.zzb(this, zzaUH);
    }

    public Status zzb(Status status)
    {
        return status;
    }

    t(zzax zzax1, GoogleApiClient googleapiclient, com.google.android.gms.wearable..NodeListener nodelistener)
    {
        zzaUG = zzax1;
        zzaUH = nodelistener;
        super(googleapiclient);
    }
}
