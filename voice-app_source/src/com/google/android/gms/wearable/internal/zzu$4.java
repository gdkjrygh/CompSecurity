// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemBuffer;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzu, zzbk

class nt extends zzf
{

    final Uri zzaGx;
    final zzu zzaUe;
    final int zzaUf;

    protected Result createFailedResult(Status status)
    {
        return zzbe(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzbk)ient);
    }

    protected void zza(zzbk zzbk1)
        throws RemoteException
    {
        zzbk1.zza(this, zzaGx, zzaUf);
    }

    protected DataItemBuffer zzbe(Status status)
    {
        return new DataItemBuffer(DataHolder.zzbi(status.getStatusCode()));
    }

    nt(zzu zzu1, GoogleApiClient googleapiclient, Uri uri, int i)
    {
        zzaUe = zzu1;
        zzaGx = uri;
        zzaUf = i;
        super(googleapiclient);
    }
}
