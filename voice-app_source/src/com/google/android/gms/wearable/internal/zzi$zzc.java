// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzi, zzbk

static final class zzaTK extends zzf
{

    private final String zzaTK;
    private com.google.android.gms.wearable.pi.ChannelListener zzaTL;

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
        zzbk1.zzb(this, zzaTL, zzaTK);
        zzaTL = null;
    }

    public Status zzb(Status status)
    {
        zzaTL = null;
        return status;
    }

    (GoogleApiClient googleapiclient, com.google.android.gms.wearable.pi.ChannelListener channellistener, String s)
    {
        super(googleapiclient);
        zzaTL = (com.google.android.gms.wearable.pi.ChannelListener)zzu.zzu(channellistener);
        zzaTK = s;
    }
}
