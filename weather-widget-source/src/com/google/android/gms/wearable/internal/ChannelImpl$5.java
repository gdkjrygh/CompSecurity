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

class zzaZT extends zzh
{

    final Uri zzaKy;
    final ChannelImpl zzaZS;
    final boolean zzaZT;

    protected volatile void zza(com.google.android.gms.common.api.Impl._cls5 _pcls5)
        throws RemoteException
    {
        zza((zzbn)_pcls5);
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zza(this, ChannelImpl.zza(zzaZS), zzaKy, zzaZT);
    }

    public Result zzb(Status status)
    {
        return zzd(status);
    }

    public Status zzd(Status status)
    {
        return status;
    }

    (ChannelImpl channelimpl, GoogleApiClient googleapiclient, Uri uri, boolean flag)
    {
        zzaZS = channelimpl;
        zzaKy = uri;
        zzaZT = flag;
        super(googleapiclient);
    }
}
