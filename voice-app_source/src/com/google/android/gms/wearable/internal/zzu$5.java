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
//            zzf, zzu, zzbk

class nt extends zzf
{

    final Uri zzaGx;
    final zzu zzaUe;
    final int zzaUf;

    protected Result createFailedResult(Status status)
    {
        return zzbf(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzbk)ient);
    }

    protected void zza(zzbk zzbk1)
        throws RemoteException
    {
        zzbk1.zzb(this, zzaGx, zzaUf);
    }

    protected com.google.android.gms.wearable.i.DeleteDataItemsResult zzbf(Status status)
    {
        return new c(status, 0);
    }

    nt(zzu zzu1, GoogleApiClient googleapiclient, Uri uri, int i)
    {
        zzaUe = zzu1;
        zzaGx = uri;
        zzaUf = i;
        super(googleapiclient);
    }
}
