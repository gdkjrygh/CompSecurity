// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.GeofencingRequest;

// Referenced classes of package com.google.android.gms.location.internal:
//            zze, zzj

class nt extends a
{

    final PendingIntent zzalz;
    final GeofencingRequest zzayF;
    final zze zzayG;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzj)ient);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
    /* block-local class not found */
    class _cls1 {}

        _cls1 _lcls1 = new _cls1();
        zzj1.zza(zzayF, zzalz, _lcls1);
    }

    nt(zze zze1, GoogleApiClient googleapiclient, GeofencingRequest geofencingrequest, PendingIntent pendingintent)
    {
        zzayG = zze1;
        zzayF = geofencingrequest;
        zzalz = pendingintent;
        super(googleapiclient);
    }
}
