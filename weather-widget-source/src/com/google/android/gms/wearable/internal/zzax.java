// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzbo, zzbn, zzaw, RemoveListenerRequest, 
//            AddListenerRequest

final class zzax
{
    private static class zza extends zzbm.zzb
    {

        private WeakReference zzbaD;
        private WeakReference zzbaE;

        public void zzc(Status status)
        {
            Map map;
            Object obj;
            map = (Map)zzbaD.get();
            obj = zzbaE.get();
            if (status.getStatus().isSuccess() || map == null || obj == null) goto _L2; else goto _L1
_L1:
            map;
            JVM INSTR monitorenter ;
            obj = (zzbo)map.remove(obj);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ((zzbo) (obj)).clear();
            map;
            JVM INSTR monitorexit ;
_L2:
            zzR(status);
            return;
            status;
            map;
            JVM INSTR monitorexit ;
            throw status;
        }

        zza(Map map, Object obj, com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
            zzbaD = new WeakReference(map);
            zzbaE = new WeakReference(obj);
        }
    }

    private static class zzb extends zzbm.zzb
    {

        private WeakReference zzbaD;
        private WeakReference zzbaE;

        public void zzc(Status status)
        {
            Map map;
            Object obj;
            map = (Map)zzbaD.get();
            obj = zzbaE.get();
            if (status.getStatus().getStatusCode() != 4002 || map == null || obj == null) goto _L2; else goto _L1
_L1:
            map;
            JVM INSTR monitorenter ;
            obj = (zzbo)map.remove(obj);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_61;
            }
            ((zzbo) (obj)).clear();
            map;
            JVM INSTR monitorexit ;
_L2:
            zzR(status);
            return;
            status;
            map;
            JVM INSTR monitorexit ;
            throw status;
        }

        zzb(Map map, Object obj, com.google.android.gms.common.api.zzc.zzb zzb1)
        {
            super(zzb1);
            zzbaD = new WeakReference(map);
            zzbaE = new WeakReference(obj);
        }
    }


    private final Map zzaot = new HashMap();

    zzax()
    {
    }

    public boolean isEmpty()
    {
        boolean flag;
        synchronized (zzaot)
        {
            flag = zzaot.isEmpty();
        }
        return flag;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(zzbn zzbn1, com.google.android.gms.common.api.zzc.zzb zzb1, Object obj)
        throws RemoteException
    {
        Map map = zzaot;
        map;
        JVM INSTR monitorenter ;
        zzbo zzbo1 = (zzbo)zzaot.remove(obj);
        if (zzbo1 != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        zzb1.zzn(new Status(4002));
        map;
        JVM INSTR monitorexit ;
        return;
        zzbo1.clear();
        ((zzaw)zzbn1.zzoA()).zza(new zzb(zzaot, obj, zzb1), new RemoveListenerRequest(zzbo1));
        map;
        JVM INSTR monitorexit ;
        return;
        zzbn1;
        map;
        JVM INSTR monitorexit ;
        throw zzbn1;
    }

    public void zza(zzbn zzbn1, com.google.android.gms.common.api.zzc.zzb zzb1, Object obj, zzbo zzbo1)
        throws RemoteException
    {
label0:
        {
            synchronized (zzaot)
            {
                if (zzaot.get(obj) == null)
                {
                    break label0;
                }
                zzb1.zzn(new Status(4001));
            }
            return;
        }
        zzaot.put(obj, zzbo1);
        ((zzaw)zzbn1.zzoA()).zza(new zza(zzaot, obj, zzb1), new AddListenerRequest(zzbo1));
        map;
        JVM INSTR monitorexit ;
        return;
        zzbn1;
        map;
        JVM INSTR monitorexit ;
        throw zzbn1;
        zzbn1;
        zzaot.remove(obj);
        throw zzbn1;
    }

    public void zzb(zzbn zzbn1)
    {
        Map map = zzaot;
        map;
        JVM INSTR monitorenter ;
        zzbm.zzo zzo;
        Iterator iterator;
        zzo = new zzbm.zzo();
        iterator = zzaot.entrySet().iterator();
_L2:
        java.util.Map.Entry entry;
        zzbo zzbo1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_212;
            }
            entry = (java.util.Map.Entry)iterator.next();
            zzbo1 = (zzbo)entry.getValue();
        } while (zzbo1 == null);
        boolean flag;
        zzbo1.clear();
        flag = zzbn1.isConnected();
        if (!flag) goto _L2; else goto _L1
_L1:
        ((zzaw)zzbn1.zzoA()).zza(zzo, new RemoveListenerRequest(zzbo1));
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder()).append("disconnect: removed: ").append(entry.getKey()).append("/").append(zzbo1).toString());
        }
          goto _L2
        RemoteException remoteexception;
        remoteexception;
        Log.w("WearableClient", (new StringBuilder()).append("disconnect: Didn't remove: ").append(entry.getKey()).append("/").append(zzbo1).toString());
          goto _L2
        zzbn1;
        map;
        JVM INSTR monitorexit ;
        throw zzbn1;
        zzaot.clear();
        map;
        JVM INSTR monitorexit ;
    }

    public void zzeb(IBinder ibinder)
    {
        Map map = zzaot;
        map;
        JVM INSTR monitorenter ;
        zzbm.zzo zzo;
        Iterator iterator;
        ibinder = zzaw.zza.zzea(ibinder);
        zzo = new zzbm.zzo();
        iterator = zzaot.entrySet().iterator();
_L1:
        java.util.Map.Entry entry;
        zzbo zzbo1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_190;
        }
        entry = (java.util.Map.Entry)iterator.next();
        zzbo1 = (zzbo)entry.getValue();
        ibinder.zza(zzo, new AddListenerRequest(zzbo1));
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: added: ").append(entry.getKey()).append("/").append(zzbo1).toString());
        }
          goto _L1
        RemoteException remoteexception;
        remoteexception;
        Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: Didn't add: ").append(entry.getKey()).append("/").append(zzbo1).toString());
          goto _L1
        ibinder;
        map;
        JVM INSTR monitorexit ;
        throw ibinder;
        map;
        JVM INSTR monitorexit ;
    }
}
