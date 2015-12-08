// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzj, LocationRequestInternal

public class zzd
    implements FusedLocationProviderApi
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


    public zzd()
    {
    }

    public Location getLastLocation(GoogleApiClient googleapiclient)
    {
        googleapiclient = LocationServices.zze(googleapiclient);
        try
        {
            googleapiclient = googleapiclient.getLastLocation();
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            return null;
        }
        return googleapiclient;
    }

    public LocationAvailability getLocationAvailability(GoogleApiClient googleapiclient)
    {
        googleapiclient = LocationServices.zze(googleapiclient);
        try
        {
            googleapiclient = googleapiclient.zzuw();
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            return null;
        }
        return googleapiclient;
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.zzb(new zza(googleapiclient, pendingintent) {

            final zzd zzayA;
            final PendingIntent zzayu;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzj)client);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zzd(zzayu);
                setResult(Status.zzXP);
            }

            
            {
                zzayA = zzd.this;
                zzayu = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationCallback locationcallback)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationcallback) {

            final zzd zzayA;
            final LocationCallback zzayE;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzj)client);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzayE);
                setResult(Status.zzXP);
            }

            
            {
                zzayA = zzd.this;
                zzayE = locationcallback;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationListener locationlistener)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationlistener) {

            final zzd zzayA;
            final LocationListener zzayz;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzj)client);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzayz);
                setResult(Status.zzXP);
            }

            
            {
                zzayA = zzd.this;
                zzayz = locationlistener;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationrequest, pendingintent) {

            final zzd zzayA;
            final PendingIntent zzayu;
            final LocationRequest zzayy;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzj)client);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zzb(zzayy, zzayu);
                setResult(Status.zzXP);
            }

            
            {
                zzayA = zzd.this;
                zzayy = locationrequest;
                zzayu = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationCallback locationcallback, Looper looper)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationrequest, locationcallback, looper) {

            final zzd zzayA;
            final Looper zzayD;
            final LocationCallback zzayE;
            final LocationRequest zzayy;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzj)client);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(LocationRequestInternal.zzb(zzayy), zzayE, zzayD);
                setResult(Status.zzXP);
            }

            
            {
                zzayA = zzd.this;
                zzayy = locationrequest;
                zzayE = locationcallback;
                zzayD = looper;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationrequest, locationlistener) {

            final zzd zzayA;
            final LocationRequest zzayy;
            final LocationListener zzayz;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzj)client);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzayy, zzayz, null);
                setResult(Status.zzXP);
            }

            
            {
                zzayA = zzd.this;
                zzayy = locationrequest;
                zzayz = locationlistener;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationrequest, locationlistener, looper) {

            final zzd zzayA;
            final Looper zzayD;
            final LocationRequest zzayy;
            final LocationListener zzayz;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzj)client);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzayy, zzayz, zzayD);
                setResult(Status.zzXP);
            }

            
            {
                zzayA = zzd.this;
                zzayy = locationrequest;
                zzayz = locationlistener;
                zzayD = looper;
                super(googleapiclient);
            }
        });
    }

    public PendingResult setMockLocation(GoogleApiClient googleapiclient, Location location)
    {
        return googleapiclient.zzb(new zza(googleapiclient, location) {

            final zzd zzayA;
            final Location zzayC;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzj)client);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zzb(zzayC);
                setResult(Status.zzXP);
            }

            
            {
                zzayA = zzd.this;
                zzayC = location;
                super(googleapiclient);
            }
        });
    }

    public PendingResult setMockMode(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.zzb(new zza(googleapiclient, flag) {

            final zzd zzayA;
            final boolean zzayB;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzj)client);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zzac(zzayB);
                setResult(Status.zzXP);
            }

            
            {
                zzayA = zzd.this;
                zzayB = flag;
                super(googleapiclient);
            }
        });
    }
}
