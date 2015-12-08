// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationStatusCodes;
import com.google.android.gms.location.copresence.internal.CopresenceApiOptions;
import com.google.android.gms.location.copresence.internal.zzb;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzb, zzi, zzg, LocationRequestInternal

public class zzj extends com.google.android.gms.location.internal.zzb
{
    private static final class zza extends zzf.zza
    {

        private com.google.android.gms.common.api.zzc.zzb zzaCS;

        public void zza(int i, PendingIntent pendingintent)
        {
            Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
        }

        public void zza(int i, String as[])
        {
            if (zzaCS == null)
            {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            } else
            {
                as = LocationStatusCodes.zzgN(LocationStatusCodes.zzgM(i));
                zzaCS.zzn(as);
                zzaCS = null;
                return;
            }
        }

        public void zzb(int i, String as[])
        {
            Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
        }

        public zza(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            zzaCS = zzb1;
        }
    }

    private static final class zzb extends zzf.zza
    {

        private com.google.android.gms.common.api.zzc.zzb zzaCS;

        private void zzgQ(int i)
        {
            if (zzaCS == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
                return;
            } else
            {
                com.google.android.gms.common.api.Status status = LocationStatusCodes.zzgN(LocationStatusCodes.zzgM(i));
                zzaCS.zzn(status);
                zzaCS = null;
                return;
            }
        }

        public void zza(int i, PendingIntent pendingintent)
        {
            zzgQ(i);
        }

        public void zza(int i, String as[])
        {
            Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
        }

        public void zzb(int i, String as[])
        {
            zzgQ(i);
        }

        public zzb(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            zzaCS = zzb1;
        }
    }

    private static final class zzc extends zzh.zza
    {

        private com.google.android.gms.common.api.zzc.zzb zzaCS;

        public void zza(LocationSettingsResult locationsettingsresult)
            throws RemoteException
        {
            zzaCS.zzn(locationsettingsresult);
            zzaCS = null;
        }

        public zzc(com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            boolean flag;
            if (zzb1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zzb(flag, "listener can't be null.");
            zzaCS = zzb1;
        }
    }


    private final zzi zzaCQ;
    private final com.google.android.gms.location.copresence.internal.zzb zzaCR;

    public zzj(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s)
    {
        this(context, looper, connectioncallbacks, onconnectionfailedlistener, s, com.google.android.gms.common.internal.zzf.zzaj(context));
    }

    public zzj(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, zzf zzf1)
    {
        this(context, looper, connectioncallbacks, onconnectionfailedlistener, s, zzf1, CopresenceApiOptions.zzaCp);
    }

    public zzj(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, zzf zzf1, CopresenceApiOptions copresenceapioptions)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, s, zzf1);
        zzaCQ = new zzi(context, zzaCs);
        zzaCR = com.google.android.gms.location.copresence.internal.zzb.zza(context, zzf1.getAccountName(), zzf1.zzol(), zzaCs, copresenceapioptions);
    }

    public void disconnect()
    {
        zzi zzi1 = zzaCQ;
        zzi1;
        JVM INSTR monitorenter ;
        boolean flag = isConnected();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        zzaCQ.removeAllListeners();
        zzaCQ.zzvR();
_L1:
        super.disconnect();
        zzi1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", ((Throwable) (obj)));
          goto _L1
        obj;
        zzi1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Location getLastLocation()
    {
        return zzaCQ.getLastLocation();
    }

    public void zza(long l, PendingIntent pendingintent)
        throws RemoteException
    {
        zzoz();
        zzx.zzv(pendingintent);
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "detectionIntervalMillis must be >= 0");
        ((zzg)zzoA()).zza(l, true, pendingintent);
    }

    public void zza(PendingIntent pendingintent)
        throws RemoteException
    {
        zzoz();
        zzx.zzv(pendingintent);
        ((zzg)zzoA()).zza(pendingintent);
    }

    public void zza(PendingIntent pendingintent, com.google.android.gms.common.api.zzc.zzb zzb1)
        throws RemoteException
    {
        zzoz();
        zzx.zzb(pendingintent, "PendingIntent must be specified.");
        zzx.zzb(zzb1, "ResultHolder not provided.");
        zzb1 = new zzb(zzb1);
        ((zzg)zzoA()).zza(pendingintent, zzb1, getContext().getPackageName());
    }

    public void zza(GeofencingRequest geofencingrequest, PendingIntent pendingintent, com.google.android.gms.common.api.zzc.zzb zzb1)
        throws RemoteException
    {
        zzoz();
        zzx.zzb(geofencingrequest, "geofencingRequest can't be null.");
        zzx.zzb(pendingintent, "PendingIntent must be specified.");
        zzx.zzb(zzb1, "ResultHolder not provided.");
        zzb1 = new zza(zzb1);
        ((zzg)zzoA()).zza(geofencingrequest, pendingintent, zzb1);
    }

    public void zza(LocationCallback locationcallback)
        throws RemoteException
    {
        zzaCQ.zza(locationcallback);
    }

    public void zza(LocationListener locationlistener)
        throws RemoteException
    {
        zzaCQ.zza(locationlistener);
    }

    public void zza(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
        throws RemoteException
    {
        synchronized (zzaCQ)
        {
            zzaCQ.zza(locationrequest, locationlistener, looper);
        }
        return;
        locationrequest;
        zzi1;
        JVM INSTR monitorexit ;
        throw locationrequest;
    }

    public void zza(LocationSettingsRequest locationsettingsrequest, com.google.android.gms.common.api.zzc.zzb zzb1, String s)
        throws RemoteException
    {
        boolean flag1 = true;
        zzoz();
        boolean flag;
        if (locationsettingsrequest != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "locationSettingsRequest can't be null nor empty.");
        if (zzb1 != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "listener can't be null.");
        zzb1 = new zzc(zzb1);
        ((zzg)zzoA()).zza(locationsettingsrequest, zzb1, s);
    }

    public void zza(LocationRequestInternal locationrequestinternal, LocationCallback locationcallback, Looper looper)
        throws RemoteException
    {
        synchronized (zzaCQ)
        {
            zzaCQ.zza(locationrequestinternal, locationcallback, looper);
        }
        return;
        locationrequestinternal;
        zzi1;
        JVM INSTR monitorexit ;
        throw locationrequestinternal;
    }

    public void zza(List list, com.google.android.gms.common.api.zzc.zzb zzb1)
        throws RemoteException
    {
        zzoz();
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "geofenceRequestIds can't be null nor empty.");
        zzx.zzb(zzb1, "ResultHolder not provided.");
        list = (String[])list.toArray(new String[0]);
        zzb1 = new zzb(zzb1);
        ((zzg)zzoA()).zza(list, zzb1, getContext().getPackageName());
    }

    public void zzag(boolean flag)
        throws RemoteException
    {
        zzaCQ.zzag(flag);
    }

    public void zzb(Location location)
        throws RemoteException
    {
        zzaCQ.zzb(location);
    }

    public void zzb(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
    {
        zzaCQ.zzb(locationrequest, pendingintent);
    }

    public void zzf(PendingIntent pendingintent)
        throws RemoteException
    {
        zzaCQ.zzf(pendingintent);
    }

    public boolean zzoC()
    {
        return true;
    }

    public LocationAvailability zzvQ()
    {
        return zzaCQ.zzvQ();
    }
}
