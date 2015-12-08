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
import com.google.android.gms.common.internal.zzu;
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

        private Handler zzayO;

        private void zzb(int i, Object obj)
        {
            if (zzayO == null)
            {
                Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = i;
                message.obj = obj;
                zzayO.sendMessage(message);
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
            zzayO = null;
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
                zzu.zza(flag, "Can't create handler inside thread that has not called Looper.prepare()");
            }
            zzayO = new _cls1(this, looper1, locationcallback);
        }
    }

    private static class zzb extends Handler
    {

        private final LocationListener zzayQ;

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
            zzayQ.onLocationChanged(message);
        }

        public zzb(LocationListener locationlistener)
        {
            zzayQ = locationlistener;
        }

        public zzb(LocationListener locationlistener, Looper looper)
        {
            super(looper);
            zzayQ = locationlistener;
        }
    }

    private static class zzc extends com.google.android.gms.location.zzd.zza
    {

        private Handler zzayO;

        public void onLocationChanged(Location location)
        {
            if (zzayO == null)
            {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = 1;
                message.obj = location;
                zzayO.sendMessage(message);
                return;
            }
        }

        public void release()
        {
            zzayO = null;
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
                zzu.zza(flag, "Can't create handler inside thread that has not called Looper.prepare()");
            }
            if (looper == null)
            {
                locationlistener = new zzb(locationlistener);
            } else
            {
                locationlistener = new zzb(locationlistener, looper);
            }
            zzayO = locationlistener;
        }
    }


    private final Context mContext;
    private Map zzakE;
    private ContentProviderClient zzayL;
    private boolean zzayM;
    private Map zzayN;
    private final zzn zzayq;

    public zzi(Context context, zzn zzn1)
    {
        zzayL = null;
        zzayM = false;
        zzakE = new HashMap();
        zzayN = new HashMap();
        mContext = context;
        zzayq = zzn1;
    }

    private zza zza(LocationCallback locationcallback, Looper looper)
    {
        Map map = zzakE;
        map;
        JVM INSTR monitorenter ;
        zza zza2 = (zza)zzayN.get(locationcallback);
        zza zza1;
        zza1 = zza2;
        if (zza2 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        zza1 = new zza(locationcallback, looper);
        zzayN.put(locationcallback, zza1);
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
        Map map = zzakE;
        map;
        JVM INSTR monitorenter ;
        zzc zzc2 = (zzc)zzakE.get(locationlistener);
        zzc zzc1;
        zzc1 = zzc2;
        if (zzc2 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        zzc1 = new zzc(locationlistener, looper);
        zzakE.put(locationlistener, zzc1);
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
        zzayq.zznL();
        Location location;
        try
        {
            location = ((zzg)zzayq.zznM()).zzdl(mContext.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }

    public void removeAllListeners()
    {
        Object obj = zzakE;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = zzakE.values().iterator();
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
        ((zzg)zzayq.zznM()).zza(LocationRequestUpdateData.zzb(((com.google.android.gms.location.zzd) (obj1))));
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
        zzakE.clear();
        exception = zzayN.values().iterator();
_L3:
        do
        {
            if (!exception.hasNext())
            {
                break MISSING_BLOCK_LABEL_155;
            }
            obj1 = (zza)exception.next();
        } while (obj1 == null);
        ((zzg)zzayq.zznM()).zza(LocationRequestUpdateData.zza(((com.google.android.gms.location.zzc) (obj1))));
          goto _L3
        zzayN.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public void zza(LocationCallback locationcallback)
        throws RemoteException
    {
        zzayq.zznL();
        zzu.zzb(locationcallback, "Invalid null callback");
        Map map = zzayN;
        map;
        JVM INSTR monitorenter ;
        locationcallback = (zza)zzayN.remove(locationcallback);
        if (locationcallback == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        locationcallback.release();
        ((zzg)zzayq.zznM()).zza(LocationRequestUpdateData.zza(locationcallback));
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
        zzayq.zznL();
        zzu.zzb(locationlistener, "Invalid null listener");
        Map map = zzakE;
        map;
        JVM INSTR monitorenter ;
        locationlistener = (zzc)zzakE.remove(locationlistener);
        if (zzayL != null && zzakE.isEmpty())
        {
            zzayL.release();
            zzayL = null;
        }
        if (locationlistener == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        locationlistener.release();
        ((zzg)zzayq.zznM()).zza(LocationRequestUpdateData.zzb(locationlistener));
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
        zzayq.zznL();
        locationlistener = zza(locationlistener, looper);
        ((zzg)zzayq.zznM()).zza(LocationRequestUpdateData.zzb(LocationRequestInternal.zzb(locationrequest), locationlistener));
    }

    public void zza(LocationRequestInternal locationrequestinternal, LocationCallback locationcallback, Looper looper)
        throws RemoteException
    {
        zzayq.zznL();
        locationcallback = zza(locationcallback, looper);
        ((zzg)zzayq.zznM()).zza(LocationRequestUpdateData.zza(locationrequestinternal, locationcallback));
    }

    public void zzac(boolean flag)
        throws RemoteException
    {
        zzayq.zznL();
        ((zzg)zzayq.zznM()).zzac(flag);
        zzayM = flag;
    }

    public void zzb(Location location)
        throws RemoteException
    {
        zzayq.zznL();
        ((zzg)zzayq.zznM()).zzb(location);
    }

    public void zzb(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
    {
        zzayq.zznL();
        ((zzg)zzayq.zznM()).zza(LocationRequestUpdateData.zzb(LocationRequestInternal.zzb(locationrequest), pendingintent));
    }

    public void zzd(PendingIntent pendingintent)
        throws RemoteException
    {
        zzayq.zznL();
        ((zzg)zzayq.zznM()).zza(LocationRequestUpdateData.zze(pendingintent));
    }

    public LocationAvailability zzuw()
    {
        zzayq.zznL();
        LocationAvailability locationavailability;
        try
        {
            locationavailability = ((zzg)zzayq.zznM()).zzdm(mContext.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return locationavailability;
    }

    public void zzux()
    {
        if (!zzayM)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        zzac(false);
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }

    // Unreferenced inner class com/google/android/gms/location/internal/zzi$zza$1

/* anonymous class */
    class zza._cls1 extends Handler
    {

        final LocationCallback zzayE;
        final zza zzayP;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 0: // '\0'
                zzayE.onLocationResult((LocationResult)message.obj);
                return;

            case 1: // '\001'
                zzayE.onLocationAvailability((LocationAvailability)message.obj);
                break;
            }
        }

            
            {
                zzayP = zza1;
                zzayE = locationcallback;
                super(looper);
            }
    }

}
