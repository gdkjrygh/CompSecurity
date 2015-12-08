// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzhs, zzid, zzdg, zzgj, 
//            zzhg

public final class zzgh
{

    private String zzDK;
    private String zzDL;
    private zzhs zzDM;
    zzdt.zzd zzDN;
    public final zzdg zzDO = new zzdg() {

        final zzgh zzDQ;

        public void zza(zzid zzid1, Map map)
        {
label0:
            {
                synchronized (zzgh.zza(zzDQ))
                {
                    if (!com.google.android.gms.internal.zzgh.zzb(zzDQ).isDone())
                    {
                        break label0;
                    }
                }
                return;
            }
            if (zzgh.zzc(zzDQ).equals(map.get("request_id")))
            {
                break MISSING_BLOCK_LABEL_55;
            }
            zzid1;
            JVM INSTR monitorexit ;
            return;
            map;
            zzid1;
            JVM INSTR monitorexit ;
            throw map;
            map = new zzgj(1, map);
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Invalid ").append(map.getType()).append(" request error: ").append(map.zzfG()).toString());
            com.google.android.gms.internal.zzgh.zzb(zzDQ).zzf(map);
            zzid1;
            JVM INSTR monitorexit ;
        }

            
            {
                zzDQ = zzgh.this;
                super();
            }
    };
    public final zzdg zzDP = new zzdg() {

        final zzgh zzDQ;

        public void zza(zzid zzid1, Map map)
        {
label0:
            {
                synchronized (zzgh.zza(zzDQ))
                {
                    if (!com.google.android.gms.internal.zzgh.zzb(zzDQ).isDone())
                    {
                        break label0;
                    }
                }
                return;
            }
            zzgj zzgj1;
            zzgj1 = new zzgj(-2, map);
            if (zzgh.zzc(zzDQ).equals(zzgj1.getRequestId()))
            {
                break MISSING_BLOCK_LABEL_100;
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append(zzgj1.getRequestId()).append(" ==== ").append(zzgh.zzc(zzDQ)).toString());
            obj;
            JVM INSTR monitorexit ;
            return;
            zzid1;
            obj;
            JVM INSTR monitorexit ;
            throw zzid1;
            String s2 = zzgj1.getUrl();
            if (s2 != null)
            {
                break MISSING_BLOCK_LABEL_120;
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("URL missing in loadAdUrl GMSG.");
            obj;
            JVM INSTR monitorexit ;
            return;
            if (s2.contains("%40mediation_adapters%40"))
            {
                zzid1 = s2.replaceAll("%40mediation_adapters%40", zzhg.zza(zzid1.getContext(), (String)map.get("check_adapters"), zzgh.zzd(zzDQ)));
                zzgj1.setUrl(zzid1);
                com.google.android.gms.ads.internal.util.client.zzb.zzaB((new StringBuilder()).append("Ad request URL modified to ").append(zzid1).toString());
            }
            com.google.android.gms.internal.zzgh.zzb(zzDQ).zzf(zzgj1);
            obj;
            JVM INSTR monitorexit ;
        }

            
            {
                zzDQ = zzgh.this;
                super();
            }
    };
    zzid zzoA;
    private final Object zzqt = new Object();

    public zzgh(String s, String s1)
    {
        zzDM = new zzhs();
        zzDL = s1;
        zzDK = s;
    }

    static Object zza(zzgh zzgh1)
    {
        return zzgh1.zzqt;
    }

    static zzhs zzb(zzgh zzgh1)
    {
        return zzgh1.zzDM;
    }

    static String zzc(zzgh zzgh1)
    {
        return zzgh1.zzDK;
    }

    static String zzd(zzgh zzgh1)
    {
        return zzgh1.zzDL;
    }

    public void zzb(zzdt.zzd zzd1)
    {
        zzDN = zzd1;
    }

    public void zze(zzid zzid1)
    {
        zzoA = zzid1;
    }

    public zzdt.zzd zzfD()
    {
        return zzDN;
    }

    public Future zzfE()
    {
        return zzDM;
    }

    public void zzfF()
    {
        if (zzoA != null)
        {
            zzoA.destroy();
            zzoA = null;
        }
    }
}
