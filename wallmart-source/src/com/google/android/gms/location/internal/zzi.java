// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzn, zzg, LocationRequestUpdateData, LocationRequestInternal

public class zzi
{
    private static class zza extends com.google.android.gms.location.zzc.zza
    {

        private Handler zzaCN;

        private void zzb(int i, Object obj)
        {
            if (zzaCN == null)
            {
                Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = i;
                message.obj = obj;
                zzaCN.sendMessage(message);
                return;
            }
        }

        public void onLocationAvailability(LocationAvailability locationavailability)
        {
            zzb(1, locationavailability);
        }

        public void onLocationResult(LocationResult locationresult)
        {
            zzb(0, locationresult);
        }

        public void release()
        {
            zzaCN = null;
        }

        zza(LocationCallback locationcallback, Looper looper)
        {
            Looper looper1 = looper;
            if (looper == null)
            {
                looper1 = Looper.myLooper();
                boolean flag;
                if (looper1 != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zzx.zza(flag, "Can't create handler inside thread that has not called Looper.prepare()");
            }
            zzaCN = new _cls1(this, looper1, locationcallback);
        }
    }

    private static class zzb extends Handler
    {

        private final LocationListener zzaCP;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
                return;

            case 1: // '\001'
                message = new Location((Location)message.obj);
                break;
            }
            zzaCP.onLocationChanged(message);
        }

        public zzb(LocationListener locationlistener)
        {
            zzaCP = locationlistener;
        }

        public zzb(LocationListener locationlistener, Looper looper)
        {
            super(looper);
            zzaCP = locationlistener;
        }
    }

    private static class zzc extends com.google.android.gms.location.zzd.zza
    {

        private Handler zzaCN;

        public void onLocationChanged(Location location)
        {
            if (zzaCN == null)
            {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = 1;
                message.obj = location;
                zzaCN.sendMessage(message);
                return;
            }
        }

        public void release()
        {
            zzaCN = null;
        }

        zzc(LocationListener locationlistener, Looper looper)
        {
            if (looper == null)
            {
                boolean flag;
                if (Looper.myLooper() != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zzx.zza(flag, "Can't create handler inside thread that has not called Looper.prepare()");
            }
            if (looper == null)
            {
                locationlistener = new zzb(locationlistener);
            } else
            {
                locationlistener = new zzb(locationlistener, looper);
            }
            zzaCN = locationlistener;
        }
    }


    private final Context mContext;
    private ContentProviderClient zzaCK;
    private boolean zzaCL;
    private Map zzaCM;
    private final zzn zzaCs;
    private Map zzaot;

    public zzi(Context context, zzn zzn1)
    {
        zzaCK = null;
        zzaCL = false;
        zzaot = new HashMap();
        zzaCM = new HashMap();
        mContext = context;
        zzaCs = zzn1;
    }

    private zza zza(LocationCallback locationcallback, Looper looper)
    {
        Map map = zzaot;
        map;
        JVM INSTR monitorenter ;
        zza zza2 = (zza)zzaCM.get(locationcallback);
        zza zza1;
        zza1 = zza2;
        if (zza2 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        zza1 = new zza(locationcallback, looper);
        zzaCM.put(locationcallback, zza1);
        map;
        JVM INSTR monitorexit ;
        return zza1;
        locationcallback;
        map;
        JVM INSTR monitorexit ;
        throw locationcallback;
    }

    private zzc zza(LocationListener locationlistener, Looper looper)
    {
        Map map = zzaot;
        map;
        JVM INSTR monitorenter ;
        zzc zzc2 = (zzc)zzaot.get(locationlistener);
        zzc zzc1;
        zzc1 = zzc2;
        if (zzc2 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        zzc1 = new zzc(locationlistener, looper);
        zzaot.put(locationlistener, zzc1);
        map;
        JVM INSTR monitorexit ;
        return zzc1;
        locationlistener;
        map;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public Location getLastLocation()
    {
        zzaCs.zzoz();
        Location location;
        try
        {
            location = ((zzg)zzaCs.zzoA()).zzdw(mContext.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }

    public void removeAllListeners()
    {
        Object obj = zzaot;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = zzaot.values().iterator();
_L2:
        Object obj1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_84;
            }
            obj1 = (zzc)iterator.next();
        } while (obj1 == null);
        ((zzg)zzaCs.zzoA()).zza(LocationRequestUpdateData.zzb(((com.google.android.gms.location.zzd) (obj1))));
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
        zzaot.clear();
        exception = zzaCM.values().iterator();
_L3:
        do
        {
            if (!exception.hasNext())
            {
                break MISSING_BLOCK_LABEL_155;
            }
            obj1 = (zza)exception.next();
        } while (obj1 == null);
        ((zzg)zzaCs.zzoA()).zza(LocationRequestUpdateData.zza(((com.google.android.gms.location.zzc) (obj1))));
          goto _L3
        zzaCM.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public void zza(LocationCallback locationcallback)
        throws RemoteException
    {
        zzaCs.zzoz();
        zzx.zzb(locationcallback, "Invalid null callback");
        Map map = zzaCM;
        map;
        JVM INSTR monitorenter ;
        locationcallback = (zza)zzaCM.remove(locationcallback);
        if (locationcallback == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        locationcallback.release();
        ((zzg)zzaCs.zzoA()).zza(LocationRequestUpdateData.zza(locationcallback));
        map;
        JVM INSTR monitorexit ;
        return;
        locationcallback;
        map;
        JVM INSTR monitorexit ;
        throw locationcallback;
    }

    public void zza(LocationListener locationlistener)
        throws RemoteException
    {
        zzaCs.zzoz();
        zzx.zzb(locationlistener, "Invalid null listener");
        Map map = zzaot;
        map;
        JVM INSTR monitorenter ;
        locationlistener = (zzc)zzaot.remove(locationlistener);
        if (zzaCK != null && zzaot.isEmpty())
        {
            zzaCK.release();
            zzaCK = null;
        }
        if (locationlistener == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        locationlistener.release();
        ((zzg)zzaCs.zzoA()).zza(LocationRequestUpdateData.zzb(locationlistener));
        map;
        JVM INSTR monitorexit ;
        return;
        locationlistener;
        map;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public void zza(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
        throws RemoteException
    {
        zzaCs.zzoz();
        locationlistener = zza(locationlistener, looper);
        ((zzg)zzaCs.zzoA()).zza(LocationRequestUpdateData.zzb(LocationRequestInternal.zzb(locationrequest), locationlistener));
    }

    public void zza(LocationRequestInternal locationrequestinternal, LocationCallback locationcallback, Looper looper)
        throws RemoteException
    {
        zzaCs.zzoz();
        locationcallback = zza(locationcallback, looper);
        ((zzg)zzaCs.zzoA()).zza(LocationRequestUpdateData.zza(locationrequestinternal, locationcallback));
    }

    public void zzag(boolean flag)
        throws RemoteException
    {
        zzaCs.zzoz();
        ((zzg)zzaCs.zzoA()).zzag(flag);
        zzaCL = flag;
    }

    public void zzb(Location location)
        throws RemoteException
    {
        zzaCs.zzoz();
        ((zzg)zzaCs.zzoA()).zzb(location);
    }

    public void zzb(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
    {
        zzaCs.zzoz();
        ((zzg)zzaCs.zzoA()).zza(LocationRequestUpdateData.zzb(LocationRequestInternal.zzb(locationrequest), pendingintent));
    }

    public void zzf(PendingIntent pendingintent)
        throws RemoteException
    {
        zzaCs.zzoz();
        ((zzg)zzaCs.zzoA()).zza(LocationRequestUpdateData.zzg(pendingintent));
    }

    public LocationAvailability zzvQ()
    {
        zzaCs.zzoz();
        LocationAvailability locationavailability;
        try
        {
            locationavailability = ((zzg)zzaCs.zzoA()).zzdx(mContext.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return locationavailability;
    }

    public void zzvR()
    {
        if (!zzaCL)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        zzag(false);
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }

    // Unreferenced inner class com/google/android/gms/location/internal/zzi$zza$1

/* anonymous class */
    class zza._cls1 extends Handler
    {

        final LocationCallback zzaCG;
        final zza zzaCO;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 0: // '\0'
                zzaCG.onLocationResult((LocationResult)message.obj);
                return;

            case 1: // '\001'
                zzaCG.onLocationAvailability((LocationAvailability)message.obj);
                break;
            }
        }

            
            {
                zzaCO = zza1;
                zzaCG = locationcallback;
                super(looper);
            }
    }

}
