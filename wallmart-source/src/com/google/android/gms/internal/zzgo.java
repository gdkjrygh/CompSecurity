// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzie, zzip, zzdg, zzgq, 
//            zzhp

public final class zzgo
{

    private String zzBm;
    private String zzEZ;
    private zzie zzFa;
    zzdv.zzd zzFb;
    public final zzdg zzFc = new zzdg() {

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
            if (zzgo.zzc(zzFe).equals(map.get("request_id")))
            {
                break MISSING_BLOCK_LABEL_55;
            }
            zzip1;
            JVM INSTR monitorexit ;
            return;
            map;
            zzip1;
            JVM INSTR monitorexit ;
            throw map;
            map = new zzgq(1, map);
            com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Invalid ").append(map.getType()).append(" request error: ").append(map.zzfK()).toString());
            com.google.android.gms.internal.zzgo.zzb(zzFe).zzf(map);
            zzip1;
            JVM INSTR monitorexit ;
        }

            
            {
                zzFe = zzgo.this;
                super();
            }
    };
    public final zzdg zzFd = new zzdg() {

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
            com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append(zzgq1.getRequestId()).append(" ==== ").append(zzgo.zzc(zzFe)).toString());
            obj;
            JVM INSTR monitorexit ;
            return;
            zzip1;
            obj;
            JVM INSTR monitorexit ;
            throw zzip1;
            String s2 = zzgq1.getUrl();
            if (s2 != null)
            {
                break MISSING_BLOCK_LABEL_120;
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("URL missing in loadAdUrl GMSG.");
            obj;
            JVM INSTR monitorexit ;
            return;
            if (s2.contains("%40mediation_adapters%40"))
            {
                zzip1 = s2.replaceAll("%40mediation_adapters%40", zzhp.zza(zzip1.getContext(), (String)map.get("check_adapters"), zzgo.zzd(zzFe)));
                zzgq1.setUrl(zzip1);
                com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder()).append("Ad request URL modified to ").append(zzip1).toString());
            }
            com.google.android.gms.internal.zzgo.zzb(zzFe).zzf(zzgq1);
            obj;
            JVM INSTR monitorexit ;
        }

            
            {
                zzFe = zzgo.this;
                super();
            }
    };
    zzip zzoL;
    private final Object zzpc = new Object();

    public zzgo(String s, String s1)
    {
        zzFa = new zzie();
        zzEZ = s1;
        zzBm = s;
    }

    static Object zza(zzgo zzgo1)
    {
        return zzgo1.zzpc;
    }

    static zzie zzb(zzgo zzgo1)
    {
        return zzgo1.zzFa;
    }

    static String zzc(zzgo zzgo1)
    {
        return zzgo1.zzBm;
    }

    static String zzd(zzgo zzgo1)
    {
        return zzgo1.zzEZ;
    }

    public void zzb(zzdv.zzd zzd1)
    {
        zzFb = zzd1;
    }

    public void zze(zzip zzip1)
    {
        zzoL = zzip1;
    }

    public zzdv.zzd zzfH()
    {
        return zzFb;
    }

    public Future zzfI()
    {
        return zzFa;
    }

    public void zzfJ()
    {
        if (zzoL != null)
        {
            zzoL.destroy();
            zzoL = null;
        }
    }
}
