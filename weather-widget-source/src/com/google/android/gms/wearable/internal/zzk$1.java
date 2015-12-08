// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzh, zzk, zzbn

class nt extends zzh
{

    final String zzaZK;
    final zzk zzaZL;
    final String zzrr;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzbn)b);
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zze(this, zzaZK, zzrr);
    }

    public Result zzb(Status status)
    {
        return zzbm(status);
    }

    public com.google.android.gms.wearable.lApi.OpenChannelResult zzbm(Status status)
    {
        return new b(status, null);
    }

    nt(zzk zzk1, GoogleApiClient googleapiclient, String s, String s1)
    {
        zzaZL = zzk1;
        zzaZK = s;
        zzrr = s1;
        super(googleapiclient);
    }
}
