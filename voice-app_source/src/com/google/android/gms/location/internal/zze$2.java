// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationStatusCodes;

// Referenced classes of package com.google.android.gms.location.internal:
//            zze, zzj

class nt extends a
{

    final PendingIntent zzalz;
    final zze zzayG;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzj)ient);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        com.google.android.gms.location.b b = new com.google.android.gms.location.zze.zzb() {

            final zze._cls2 zzayI;

            public void zza(int i, PendingIntent pendingintent)
            {
                zzayI.setResult(LocationStatusCodes.zzgB(i));
            }

            public void zzb(int i, String as[])
            {
                Log.wtf("GeofencingImpl", "Request ID callback shouldn't have been called");
            }

            
            {
                zzayI = zze._cls2.this;
                super();
            }
        };
        zzj1.zza(zzalz, b);
    }

    nt(zze zze1, GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        zzayG = zze1;
        zzalz = pendingintent;
        super(googleapiclient);
    }
}
