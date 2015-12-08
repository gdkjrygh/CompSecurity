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

private static final class er extends zzf
{

    private com.google.android.gms.wearable.odeListener zzaUI;

    public Result createFailedResult(Status status)
    {
        return zzb(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.t t)
        throws RemoteException
    {
        zza((zzbk)t);
    }

    protected void zza(zzbk zzbk1)
        throws RemoteException
    {
        zzbk1.zza(this, zzaUI);
        zzaUI = null;
    }

    public Status zzb(Status status)
    {
        zzaUI = null;
        return status;
    }

    private er(GoogleApiClient googleapiclient, com.google.android.gms.wearable.odeListener odelistener)
    {
        super(googleapiclient);
        zzaUI = odelistener;
    }

    er(GoogleApiClient googleapiclient, com.google.android.gms.wearable.odeListener odelistener, er er)
    {
        this(googleapiclient, odelistener);
    }
}
