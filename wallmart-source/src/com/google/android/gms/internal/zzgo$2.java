// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzgo, zzie, zzgq, 
//            zzip, zzhp

class zzFe
    implements zzdg
{

    final zzgo zzFe;

    public void zza(zzip zzip1, Map map)
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
        zzgq zzgq1;
        zzgq1 = new zzgq(-2, map);
        if (zzgo.zzc(zzFe).equals(zzgq1.getRequestId()))
        {
            break MISSING_BLOCK_LABEL_100;
        }
        zzb.zzaE((new StringBuilder()).append(zzgq1.getRequestId()).append(" ==== ").append(zzgo.zzc(zzFe)).toString());
        obj;
        JVM INSTR monitorexit ;
        return;
        zzip1;
        obj;
        JVM INSTR monitorexit ;
        throw zzip1;
        String s = zzgq1.getUrl();
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        zzb.zzaE("URL missing in loadAdUrl GMSG.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (s.contains("%40mediation_adapters%40"))
        {
            zzip1 = s.replaceAll("%40mediation_adapters%40", zzhp.zza(zzip1.getContext(), (String)map.get("check_adapters"), zzgo.zzd(zzFe)));
            zzgq1.setUrl(zzip1);
            zzb.v((new StringBuilder()).append("Ad request URL modified to ").append(zzip1).toString());
        }
        com.google.android.gms.internal.zzgo.zzb(zzFe).zzf(zzgq1);
        obj;
        JVM INSTR monitorexit ;
    }

    l.client.zzb(zzgo zzgo1)
    {
        zzFe = zzgo1;
        super();
    }
}
