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

class zzaZS extends zzh
{

    final ChannelImpl zzaZS;

    protected volatile void zza(com.google.android.gms.common.api.Impl._cls3 _pcls3)
        throws RemoteException
    {
        zza((zzbn)_pcls3);
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zzu(this, ChannelImpl.zza(zzaZS));
    }

    public Result zzb(Status status)
    {
        return zzbn(status);
    }

    public com.google.android.gms.wearable.utStreamResult zzbn(Status status)
    {
        return new a(status, null);
    }

    esult(ChannelImpl channelimpl, GoogleApiClient googleapiclient)
    {
        zzaZS = channelimpl;
        super(googleapiclient);
    }
}
