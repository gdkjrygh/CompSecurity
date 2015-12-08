// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzh, zzk, zzbn

static final class zzaZM extends zzh
{

    private final String zzaZM;
    private com.google.android.gms.wearable.pi.ChannelListener zzaZN;

    protected volatile void zza(com.google.android.gms.common.api.zk.zza zza1)
        throws RemoteException
    {
        zza((zzbn)zza1);
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zza(this, zzaZN, zzaZM);
        zzaZN = null;
    }

    public Result zzb(Status status)
    {
        return zzd(status);
    }

    public Status zzd(Status status)
    {
        zzaZN = null;
        return status;
    }

    (GoogleApiClient googleapiclient, com.google.android.gms.wearable.pi.ChannelListener channellistener, String s)
    {
        super(googleapiclient);
        zzaZN = (com.google.android.gms.wearable.pi.ChannelListener)zzx.zzv(channellistener);
        zzaZM = s;
    }
}
