// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzdf, DataLayer, zzbg

class zzaj
{

    private static void zza(DataLayer datalayer, com.google.android.gms.internal.zzaf.zzd zzd)
    {
        zzd = zzd.zzhX;
        int j = zzd.length;
        for (int i = 0; i < j; i++)
        {
            datalayer.zzen(zzdf.zzg(zzd[i]));
        }

    }

    public static void zza(DataLayer datalayer, com.google.android.gms.internal.zzaf.zzi zzi)
    {
        if (zzi.zziM == null)
        {
            zzbg.zzaC("supplemental missing experimentSupplemental");
            return;
        } else
        {
            zza(datalayer, zzi.zziM);
            zzb(datalayer, zzi.zziM);
            zzc(datalayer, zzi.zziM);
            return;
        }
    }

    private static void zzb(DataLayer datalayer, com.google.android.gms.internal.zzaf.zzd zzd)
    {
        zzd = zzd.zzhW;
        int j = zzd.length;
        for (int i = 0; i < j; i++)
        {
            Map map = zzc(zzd[i]);
            if (map != null)
            {
                datalayer.push(map);
            }
        }

    }

    private static Map zzc(com.google.android.gms.internal.zzag.zza zza1)
    {
        zza1 = ((com.google.android.gms.internal.zzag.zza) (zzdf.zzl(zza1)));
        if (!(zza1 instanceof Map))
        {
            zzbg.zzaC((new StringBuilder()).append("value: ").append(zza1).append(" is not a map value, ignored.").toString());
            return null;
        } else
        {
            return (Map)zza1;
        }
    }

    private static void zzc(DataLayer datalayer, com.google.android.gms.internal.zzaf.zzd zzd)
    {
        com.google.android.gms.internal.zzaf.zzc azzc[];
        int i;
        int j;
        azzc = zzd.zzhY;
        j = azzc.length;
        i = 0;
_L2:
        com.google.android.gms.internal.zzaf.zzc zzc1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        zzc1 = azzc[i];
        if (zzc1.zzaC != null)
        {
            break; /* Loop/switch isn't completed */
        }
        zzbg.zzaC("GaExperimentRandom: No key");
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            Object obj = datalayer.get(zzc1.zzaC);
            long l;
            long l1;
            if (!(obj instanceof Number))
            {
                zzd = null;
            } else
            {
                zzd = Long.valueOf(((Number)obj).longValue());
            }
            l = zzc1.zzhS;
            l1 = zzc1.zzhT;
            if (!zzc1.zzhU || zzd == null || zzd.longValue() < l || zzd.longValue() > l1)
            {
                if (l > l1)
                {
                    break label0;
                }
                obj = Long.valueOf(Math.round(Math.random() * (double)(l1 - l) + (double)l));
            }
            datalayer.zzen(zzc1.zzaC);
            zzd = datalayer.zzj(zzc1.zzaC, obj);
            if (zzc1.zzhV > 0L)
            {
                if (!zzd.containsKey("gtm"))
                {
                    zzd.put("gtm", DataLayer.mapOf(new Object[] {
                        "lifetime", Long.valueOf(zzc1.zzhV)
                    }));
                } else
                {
                    Object obj1 = zzd.get("gtm");
                    if (obj1 instanceof Map)
                    {
                        ((Map)obj1).put("lifetime", Long.valueOf(zzc1.zzhV));
                    } else
                    {
                        zzbg.zzaC("GaExperimentRandom: gtm not a map");
                    }
                }
            }
            datalayer.push(zzd);
        }
          goto _L3
        zzbg.zzaC("GaExperimentRandom: random range invalid");
          goto _L3
          goto _L3
    }
}
