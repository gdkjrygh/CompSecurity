// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationStatusCodes;
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
                com.google.android.gms.location.zza zza1 = new com.google.android.gms.location.zza(this) {

                    final _cls1 zzayH;

                    public void zza(int i, String as[])
                    {
                        zzayH.setResult(LocationStatusCodes.zzgB(i));
                    }

            
            {
                zzayH = _pcls1;
                super();
            }
                };
                zzj1.zza(zzayF, zzalz, zza1);
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
                com.google.android.gms.location.zzb zzb = new com.google.android.gms.location.zzb(this) {

                    final _cls2 zzayI;

                    public void zza(int i, PendingIntent pendingintent)
                    {
                        zzayI.setResult(LocationStatusCodes.zzgB(i));
                    }

                    public void zzb(int i, String as[])
                    {
                        Log.wtf("GeofencingImpl", "Request ID callback shouldn't have been called");
                    }

            
            {
                zzayI = _pcls2;
                super();
            }
                };
                zzj1.zza(zzalz, zzb);
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
                com.google.android.gms.location.zzb zzb = new com.google.android.gms.location.zzb(this) {

                    final _cls3 zzayK;

                    public void zza(int i, PendingIntent pendingintent)
                    {
                        Log.wtf("GeofencingImpl", "PendingIntent callback shouldn't have been called");
                    }

                    public void zzb(int i, String as[])
                    {
                        zzayK.setResult(LocationStatusCodes.zzgB(i));
                    }

            
            {
                zzayK = _pcls3;
                super();
            }
                };
                zzj1.zza(zzayJ, zzb);
            }

            
            {
                zzayG = zze.this;
                zzayJ = list;
                super(googleapiclient);
            }
        });
    }
}
