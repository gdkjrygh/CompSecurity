// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzj

public class zze
    implements GeofencingApi
{
    private static abstract class zza extends com.google.android.gms.location.LocationServices.zza
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        public zza(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public zze()
    {
    }

    public PendingResult addGeofences(GoogleApiClient googleapiclient, GeofencingRequest geofencingrequest, PendingIntent pendingintent)
    {
        return googleapiclient.zzb(new zza(googleapiclient, geofencingrequest, pendingintent) {

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
            /* block-local class not found */
            class _cls1 {}

                _cls1 _lcls1 = new _cls1();
                zzj1.zza(zzayF, zzalz, _lcls1);
            }

            
            {
                zzayG = zze.this;
                zzayF = geofencingrequest;
                zzalz = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult addGeofences(GoogleApiClient googleapiclient, List list, PendingIntent pendingintent)
    {
        com.google.android.gms.location.GeofencingRequest.Builder builder = new com.google.android.gms.location.GeofencingRequest.Builder();
        builder.addGeofences(list);
        builder.setInitialTrigger(5);
        return addGeofences(googleapiclient, builder.build(), pendingintent);
    }

    public PendingResult removeGeofences(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.zzb(new zza(googleapiclient, pendingintent) {

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
            /* block-local class not found */
            class _cls1 {}

                _cls1 _lcls1 = new _cls1();
                zzj1.zza(zzalz, _lcls1);
            }

            
            {
                zzayG = zze.this;
                zzalz = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeGeofences(GoogleApiClient googleapiclient, List list)
    {
        return googleapiclient.zzb(new zza(googleapiclient, list) {

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
            /* block-local class not found */
            class _cls1 {}

                _cls1 _lcls1 = new _cls1();
                zzj1.zza(zzayJ, _lcls1);
            }

            
            {
                zzayG = zze.this;
                zzayJ = list;
                super(googleapiclient);
            }
        });
    }
}
