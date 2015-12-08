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

class zzayI
    implements com.google.android.gms.location..zze._cls2._cls1
{

    final es.zzgB zzayI;

    public void zza(int i, PendingIntent pendingintent)
    {
        zzayI.tResult(LocationStatusCodes.zzgB(i));
    }

    public void zzb(int i, String as[])
    {
        Log.wtf("GeofencingImpl", "Request ID callback shouldn't have been called");
    }

    ( )
    {
        zzayI = ;
        super();
    }

    // Unreferenced inner class com/google/android/gms/location/internal/zze$2

/* anonymous class */
    class zze._cls2 extends zze.zza
    {

        final PendingIntent zzalz;
        final zze zzayG;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((zzj)client);
        }

        protected void zza(zzj zzj1)
            throws RemoteException
        {
            zze._cls2._cls1 _lcls1 = new zze._cls2._cls1(this);
            zzj1.zza(zzalz, _lcls1);
        }

            
            {
                zzayG = zze1;
                zzalz = pendingintent;
                super(googleapiclient);
            }
    }

}
