// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzh, ChannelImpl, zzbn

class zzaZV extends zzh
{

    final Uri zzaKy;
    final ChannelImpl zzaZS;
    final long zzaZU;
    final long zzaZV;

    protected volatile void zza(com.google.android.gms.common.api.Impl._cls6 _pcls6)
        throws RemoteException
    {
        zza((zzbn)_pcls6);
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zza(this, ChannelImpl.zza(zzaZS), zzaKy, zzaZU, zzaZV);
    }

    public Result zzb(Status status)
    {
        return zzd(status);
    }

    public Status zzd(Status status)
    {
        return status;
    }

    (ChannelImpl channelimpl, GoogleApiClient googleapiclient, Uri uri, long l, long l1)
    {
        zzaZS = channelimpl;
        zzaKy = uri;
        zzaZU = l;
        zzaZV = l1;
        super(googleapiclient);
    }
}
