// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzes, zzfs, zzeu, 
//            zzgd, zzfg

class zzAA
    implements zzbs
{

    final zzes zzAA;

    public void zza(zzgd zzgd1, Map map)
    {
label0:
        {
            synchronized (zzes.zza(zzAA))
            {
                if (!com.google.android.gms.internal.zzes.zzb(zzAA).isDone())
                {
                    break label0;
                }
            }
            return;
        }
        zzeu zzeu1;
        zzeu1 = new zzeu(-2, map);
        if (zzes.zzc(zzAA).equals(zzeu1.getRequestId()))
        {
            break MISSING_BLOCK_LABEL_100;
        }
        zzb.zzan((new StringBuilder()).append(zzeu1.getRequestId()).append(" ==== ").append(zzes.zzc(zzAA)).toString());
        obj;
        JVM INSTR monitorexit ;
        return;
        zzgd1;
        obj;
        JVM INSTR monitorexit ;
        throw zzgd1;
        String s = zzeu1.getUrl();
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        zzb.zzan("URL missing in loadAdUrl GMSG.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (s.contains("%40mediation_adapters%40"))
        {
            zzgd1 = s.replaceAll("%40mediation_adapters%40", zzfg.zza(zzgd1.getContext(), (String)map.get("check_adapters"), zzes.zzd(zzAA)));
            zzeu1.setUrl(zzgd1);
            zzb.zzam((new StringBuilder()).append("Ad request URL modified to ").append(zzgd1).toString());
        }
        com.google.android.gms.internal.zzes.zzb(zzAA).zzc(zzeu1);
        obj;
        JVM INSTR monitorexit ;
    }

    l.client.zzb(zzes zzes1)
    {
        zzAA = zzes1;
        super();
    }
}
