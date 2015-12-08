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
//            zzh, zzw, zzbn

class nt extends zzh
{

    final Uri zzaKy;
    final zzw zzbaf;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzbn)b);
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zza(this, zzaKy);
    }

    protected Result zzb(Status status)
    {
        return zzbp(status);
    }

    protected com.google.android.gms.wearable.i.DataItemResult zzbp(Status status)
    {
        return new b(status, null);
    }

    nt(zzw zzw1, GoogleApiClient googleapiclient, Uri uri)
    {
        zzbaf = zzw1;
        zzaKy = uri;
        super(googleapiclient);
    }
}
