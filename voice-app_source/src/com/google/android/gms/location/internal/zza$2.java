// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.location.internal:
//            zza, zzj

class nt extends a
{

    final PendingIntent zzayu;
    final zza zzayv;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzj)ient);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        zzj1.zza(zzayu);
        setResult(Status.zzXP);
    }

    nt(zza zza1, GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        zzayv = zza1;
        zzayu = pendingintent;
        super(googleapiclient);
    }
}
