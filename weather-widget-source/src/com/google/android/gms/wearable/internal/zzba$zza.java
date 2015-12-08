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

private static final class er extends zzh
{

    private com.google.android.gms.wearable.odeListener zzbaL;

    protected volatile void zza(com.google.android.gms.common.api.ba.zza zza1)
        throws RemoteException
    {
        zza((zzbn)zza1);
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zza(this, zzbaL);
        zzbaL = null;
    }

    public Result zzb(Status status)
    {
        return zzd(status);
    }

    public Status zzd(Status status)
    {
        zzbaL = null;
        return status;
    }

    private er(GoogleApiClient googleapiclient, com.google.android.gms.wearable.odeListener odelistener)
    {
        super(googleapiclient);
        zzbaL = odelistener;
    }

    er(GoogleApiClient googleapiclient, com.google.android.gms.wearable.odeListener odelistener, er er)
    {
        this(googleapiclient, odelistener);
    }
}
