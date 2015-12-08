// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzh, zzi, zzbn

class nt extends zzh
{

    final String zzaZB;
    final zzi zzaZD;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzbn)b);
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zzs(this, zzaZB);
    }

    protected Result zzb(Status status)
    {
        return zzbl(status);
    }

    protected com.google.android.gms.wearable.lityApi.RemoveLocalCapabilityResult zzbl(Status status)
    {
        return new b(status);
    }

    nt(zzi zzi1, GoogleApiClient googleapiclient, String s)
    {
        zzaZD = zzi1;
        zzaZB = s;
        super(googleapiclient);
    }
}
