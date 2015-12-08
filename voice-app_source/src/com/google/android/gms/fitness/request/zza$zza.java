// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zza, BleScanCallback

public static class allback
{

    private static final allback zzalJ = new <init>();
    private final Map zzalK = new HashMap();

    public static allback zzqS()
    {
        return zzalJ;
    }

    public zza zza(BleScanCallback blescancallback)
    {
        Map map = zzalK;
        map;
        JVM INSTR monitorenter ;
        zza zza2 = (zza)zzalK.get(blescancallback);
        zza zza1;
        zza1 = zza2;
        if (zza2 != null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        zza1 = new zza(blescancallback, null);
        zzalK.put(blescancallback, zza1);
        map;
        JVM INSTR monitorexit ;
        return zza1;
        blescancallback;
        map;
        JVM INSTR monitorexit ;
        throw blescancallback;
    }

    public zza zzb(BleScanCallback blescancallback)
    {
        Map map = zzalK;
        map;
        JVM INSTR monitorenter ;
        zza zza1 = (zza)zzalK.get(blescancallback);
        if (zza1 == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        map;
        JVM INSTR monitorexit ;
        return zza1;
        blescancallback = new zza(blescancallback, null);
        map;
        JVM INSTR monitorexit ;
        return blescancallback;
        blescancallback;
        map;
        JVM INSTR monitorexit ;
        throw blescancallback;
    }


    private allback()
    {
    }
}
