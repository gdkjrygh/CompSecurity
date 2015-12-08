// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationStatusCodes;

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
        com.google.android.gms.location.a a = new com.google.android.gms.location.zze.zza() {

            final zze._cls1 zzayH;

            public void zza(int i, String as[])
            {
                zzayH.setResult(LocationStatusCodes.zzgB(i));
            }

            
            {
                zzayH = zze._cls1.this;
                super();
            }
        };
        zzj1.zza(zzayF, zzalz, a);
    }

    nt(zze zze1, GoogleApiClient googleapiclient, GeofencingRequest geofencingrequest, PendingIntent pendingintent)
    {
        zzayG = zze1;
        zzayF = geofencingrequest;
        zzalz = pendingintent;
        super(googleapiclient);
    }
}
