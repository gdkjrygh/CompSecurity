// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzh, ChannelImpl, zzbn

class zzamY extends zzh
{

    final ChannelImpl zzaZS;
    final int zzamY;

    protected volatile void zza(com.google.android.gms.common.api.Impl._cls2 _pcls2)
        throws RemoteException
    {
        zza((zzbn)_pcls2);
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zzh(this, ChannelImpl.zza(zzaZS), zzamY);
    }

    protected Result zzb(Status status)
    {
        return zzd(status);
    }

    protected Status zzd(Status status)
    {
        return status;
    }

    (ChannelImpl channelimpl, GoogleApiClient googleapiclient, int i)
    {
        zzaZS = channelimpl;
        zzamY = i;
        super(googleapiclient);
    }
}
