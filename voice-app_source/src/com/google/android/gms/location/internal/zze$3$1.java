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

class zzayK
    implements com.google.android.gms.location..zze._cls3._cls1
{

    final es.zzgB zzayK;

    public void zza(int i, PendingIntent pendingintent)
    {
        Log.wtf("GeofencingImpl", "PendingIntent callback shouldn't have been called");
    }

    public void zzb(int i, String as[])
    {
        zzayK.tResult(LocationStatusCodes.zzgB(i));
    }

    ( )
    {
        zzayK = ;
        super();
    }

    // Unreferenced inner class com/google/android/gms/location/internal/zze$3

/* anonymous class */
    class zze._cls3 extends zze.zza
    {

        final zze zzayG;
        final List zzayJ;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((zzj)client);
        }

        protected void zza(zzj zzj1)
            throws RemoteException
        {
            zze._cls3._cls1 _lcls1 = new zze._cls3._cls1(this);
            zzj1.zza(zzayJ, _lcls1);
        }

            
            {
                zzayG = zze1;
                zzayJ = list;
                super(googleapiclient);
            }
    }

}
