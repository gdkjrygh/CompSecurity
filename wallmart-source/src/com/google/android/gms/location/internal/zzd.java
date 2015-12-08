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
            googleapiclient = googleapiclient.zzvQ();
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

            final zzd zzaCC;
            final PendingIntent zzaCw;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzj)zzb);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zzf(zzaCw);
                zza(((Result) (Status.zzaaD)));
            }

            
            {
                zzaCC = zzd.this;
                zzaCw = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationCallback locationcallback)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationcallback) {

            final zzd zzaCC;
            final LocationCallback zzaCG;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzj)zzb);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzaCG);
                zza(((Result) (Status.zzaaD)));
            }

            
            {
                zzaCC = zzd.this;
                zzaCG = locationcallback;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationListener locationlistener)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationlistener) {

            final LocationListener zzaCB;
            final zzd zzaCC;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzj)zzb);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzaCB);
                zza(((Result) (Status.zzaaD)));
            }

            
            {
                zzaCC = zzd.this;
                zzaCB = locationlistener;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationrequest, pendingintent) {

            final LocationRequest zzaCA;
            final zzd zzaCC;
            final PendingIntent zzaCw;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzj)zzb);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zzb(zzaCA, zzaCw);
                zza(((Result) (Status.zzaaD)));
            }

            
            {
                zzaCC = zzd.this;
                zzaCA = locationrequest;
                zzaCw = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationCallback locationcallback, Looper looper)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationrequest, locationcallback, looper) {

            final LocationRequest zzaCA;
            final zzd zzaCC;
            final Looper zzaCF;
            final LocationCallback zzaCG;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzj)zzb);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(LocationRequestInternal.zzb(zzaCA), zzaCG, zzaCF);
                zza(((Result) (Status.zzaaD)));
            }

            
            {
                zzaCC = zzd.this;
                zzaCA = locationrequest;
                zzaCG = locationcallback;
                zzaCF = looper;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationrequest, locationlistener) {

            final LocationRequest zzaCA;
            final LocationListener zzaCB;
            final zzd zzaCC;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzj)zzb);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzaCA, zzaCB, null);
                zza(((Result) (Status.zzaaD)));
            }

            
            {
                zzaCC = zzd.this;
                zzaCA = locationrequest;
                zzaCB = locationlistener;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationrequest, locationlistener, looper) {

            final LocationRequest zzaCA;
            final LocationListener zzaCB;
            final zzd zzaCC;
            final Looper zzaCF;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzj)zzb);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzaCA, zzaCB, zzaCF);
                zza(((Result) (Status.zzaaD)));
            }

            
            {
                zzaCC = zzd.this;
                zzaCA = locationrequest;
                zzaCB = locationlistener;
                zzaCF = looper;
                super(googleapiclient);
            }
        });
    }

    public PendingResult setMockLocation(GoogleApiClient googleapiclient, Location location)
    {
        return googleapiclient.zzb(new zza(googleapiclient, location) {

            final zzd zzaCC;
            final Location zzaCE;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzj)zzb);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zzb(zzaCE);
                zza(((Result) (Status.zzaaD)));
            }

            
            {
                zzaCC = zzd.this;
                zzaCE = location;
                super(googleapiclient);
            }
        });
    }

    public PendingResult setMockMode(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.zzb(new zza(googleapiclient, flag) {

            final zzd zzaCC;
            final boolean zzaCD;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzj)zzb);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zzag(zzaCD);
                zza(((Result) (Status.zzaaD)));
            }

            
            {
                zzaCC = zzd.this;
                zzaCD = flag;
                super(googleapiclient);
            }
        });
    }
}
