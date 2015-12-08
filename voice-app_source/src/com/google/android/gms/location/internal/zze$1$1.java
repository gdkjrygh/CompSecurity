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

class zzayH
    implements com.google.android.gms.location..zze._cls1._cls1
{

    final es.zzgB zzayH;

    public void zza(int i, String as[])
    {
        zzayH.tResult(LocationStatusCodes.zzgB(i));
    }

    ( )
    {
        zzayH = ;
        super();
    }

    // Unreferenced inner class com/google/android/gms/location/internal/zze$1

/* anonymous class */
    class zze._cls1 extends zze.zza
    {

        final PendingIntent zzalz;
        final GeofencingRequest zzayF;
        final zze zzayG;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((zzj)client);
        }

        protected void zza(zzj zzj1)
            throws RemoteException
        {
            zze._cls1._cls1 _lcls1 = new zze._cls1._cls1(this);
            zzj1.zza(zzayF, zzalz, _lcls1);
        }

            
            {
                zzayG = zze1;
                zzayF = geofencingrequest;
                zzalz = pendingintent;
                super(googleapiclient);
            }
    }

}
