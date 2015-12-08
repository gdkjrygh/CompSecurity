// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationStatusCodes;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            zze, zzj

class nt extends a
{

    final zze zzayG;
    final List zzayJ;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzj)ient);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        com.google.android.gms.location.b b = new com.google.android.gms.location.zze.zzb() {

            final zze._cls3 zzayK;

            public void zza(int i, PendingIntent pendingintent)
            {
                Log.wtf("GeofencingImpl", "PendingIntent callback shouldn't have been called");
            }

            public void zzb(int i, String as[])
            {
                zzayK.setResult(LocationStatusCodes.zzgB(i));
            }

            
            {
                zzayK = zze._cls3.this;
                super();
            }
        };
        zzj1.zza(zzayJ, b);
    }

    nt(zze zze1, GoogleApiClient googleapiclient, List list)
    {
        zzayG = zze1;
        zzayJ = list;
        super(googleapiclient);
    }
}
