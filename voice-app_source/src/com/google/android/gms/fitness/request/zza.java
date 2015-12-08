// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.BleDevice;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.fitness.request:
//            BleScanCallback

public class com.google.android.gms.fitness.request.zza extends zzn.zza
{
    public static class zza
    {

        private static final zza zzalJ = new zza();
        private final Map zzalK = new HashMap();

        public static zza zzqS()
        {
            return zzalJ;
        }

        public com.google.android.gms.fitness.request.zza zza(BleScanCallback blescancallback)
        {
            Map map = zzalK;
            map;
            JVM INSTR monitorenter ;
            com.google.android.gms.fitness.request.zza zza2 = (com.google.android.gms.fitness.request.zza)zzalK.get(blescancallback);
            com.google.android.gms.fitness.request.zza zza1;
            zza1 = zza2;
            if (zza2 != null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            zza1 = new com.google.android.gms.fitness.request.zza(blescancallback);
            zzalK.put(blescancallback, zza1);
            map;
            JVM INSTR monitorexit ;
            return zza1;
            blescancallback;
            map;
            JVM INSTR monitorexit ;
            throw blescancallback;
        }

        public com.google.android.gms.fitness.request.zza zzb(BleScanCallback blescancallback)
        {
            Map map = zzalK;
            map;
            JVM INSTR monitorenter ;
            com.google.android.gms.fitness.request.zza zza1 = (com.google.android.gms.fitness.request.zza)zzalK.get(blescancallback);
            if (zza1 == null)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            map;
            JVM INSTR monitorexit ;
            return zza1;
            blescancallback = new com.google.android.gms.fitness.request.zza(blescancallback);
            map;
            JVM INSTR monitorexit ;
            return blescancallback;
            blescancallback;
            map;
            JVM INSTR monitorexit ;
            throw blescancallback;
        }


        private zza()
        {
        }
    }


    private final BleScanCallback zzalI;

    private com.google.android.gms.fitness.request.zza(BleScanCallback blescancallback)
    {
        zzalI = (BleScanCallback)zzu.zzu(blescancallback);
    }


    public void onDeviceFound(BleDevice bledevice)
        throws RemoteException
    {
        zzalI.onDeviceFound(bledevice);
    }

    public void onScanStopped()
        throws RemoteException
    {
        zzalI.onScanStopped();
    }
}
