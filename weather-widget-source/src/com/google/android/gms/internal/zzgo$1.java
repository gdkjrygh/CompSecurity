// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzgo, zzie, zzgq, 
//            zzip

class zzFe
    implements zzdg
{

    final zzgo zzFe;

    public void zza(zzip zzip, Map map)
    {
label0:
        {
            synchronized (zzgo.zza(zzFe))
            {
                if (!com.google.android.gms.internal.zzgo.zzb(zzFe).isDone())
                {
                    break label0;
                }
            }
            return;
        }
        if (zzgo.zzc(zzFe).equals(map.get("request_id")))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        zzip;
        JVM INSTR monitorexit ;
        return;
        map;
        zzip;
        JVM INSTR monitorexit ;
        throw map;
        map = new zzgq(1, map);
        zzb.zzaE((new StringBuilder()).append("Invalid ").append(map.getType()).append(" request error: ").append(map.zzfK()).toString());
        com.google.android.gms.internal.zzgo.zzb(zzFe).zzf(map);
        zzip;
        JVM INSTR monitorexit ;
    }

    l.client.zzb(zzgo zzgo1)
    {
        zzFe = zzgo1;
        super();
    }
}
