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
//            zzf, ChannelImpl, zzbk

class zzaTS extends zzf
{

    final Uri zzaGx;
    final ChannelImpl zzaTR;
    final boolean zzaTS;

    public Result createFailedResult(Status status)
    {
        return zzb(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.Impl._cls5 _pcls5)
        throws RemoteException
    {
        zza((zzbk)_pcls5);
    }

    protected void zza(zzbk zzbk1)
        throws RemoteException
    {
        zzbk1.zza(this, ChannelImpl.zza(zzaTR), zzaGx, zzaTS);
    }

    public Status zzb(Status status)
    {
        return status;
    }

    (ChannelImpl channelimpl, GoogleApiClient googleapiclient, Uri uri, boolean flag)
    {
        zzaTR = channelimpl;
        zzaGx = uri;
        zzaTS = flag;
        super(googleapiclient);
    }
}
