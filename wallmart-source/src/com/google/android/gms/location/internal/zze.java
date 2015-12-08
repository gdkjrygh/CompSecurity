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

        public Result zzb(Status status)
        {
            return zzd(status);
        }

        public Status zzd(Status status)
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

            final GeofencingRequest zzaCH;
            final zze zzaCI;
            final PendingIntent zzapq;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzj)zzb);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzaCH, zzapq, this);
            }

            
            {
                zzaCI = zze.this;
                zzaCH = geofencingrequest;
                zzapq = pendingintent;
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

            final zze zzaCI;
            final PendingIntent zzapq;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzj)zzb);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzapq, this);
            }

            
            {
                zzaCI = zze.this;
                zzapq = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeGeofences(GoogleApiClient googleapiclient, List list)
    {
        return googleapiclient.zzb(new zza(googleapiclient, list) {

            final zze zzaCI;
            final List zzaCJ;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzj)zzb);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzaCJ, this);
            }

            
            {
                zzaCI = zze.this;
                zzaCJ = list;
                super(googleapiclient);
            }
        });
    }
}
