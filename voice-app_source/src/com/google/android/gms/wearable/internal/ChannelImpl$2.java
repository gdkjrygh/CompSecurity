// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, ChannelImpl, zzbk

class zzajs extends zzf
{

    final ChannelImpl zzaTR;
    final int zzajs;

    protected Result createFailedResult(Status status)
    {
        return zzb(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.Impl._cls2 _pcls2)
        throws RemoteException
    {
        zza((zzbk)_pcls2);
    }

    protected void zza(zzbk zzbk1)
        throws RemoteException
    {
        zzbk1.zzh(this, ChannelImpl.zza(zzaTR), zzajs);
    }

    protected Status zzb(Status status)
    {
        return status;
    }

    (ChannelImpl channelimpl, GoogleApiClient googleapiclient, int i)
    {
        zzaTR = channelimpl;
        zzajs = i;
        super(googleapiclient);
    }
}
