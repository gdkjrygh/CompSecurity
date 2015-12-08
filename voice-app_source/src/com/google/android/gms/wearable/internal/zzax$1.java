// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzax, zzbk

class t extends zzf
{

    final zzax zzaUG;

    protected Result createFailedResult(Status status)
    {
        return zzbi(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzbk)ent);
    }

    protected void zza(zzbk zzbk1)
        throws RemoteException
    {
        zzbk1.zzm(this);
    }

    protected com.google.android.gms.wearable..GetLocalNodeResult zzbi(Status status)
    {
        return new c(status, null);
    }

    t(zzax zzax1, GoogleApiClient googleapiclient)
    {
        zzaUG = zzax1;
        super(googleapiclient);
    }
}
