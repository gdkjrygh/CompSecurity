// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzdq, zzip, zzdp, 
//            zzdt

public class zzds
    implements zzdg
{

    public zzds()
    {
    }

    public void zza(zzip zzip1, Map map)
    {
        zzdq zzdq1 = zzp.zzbK();
        if (map.containsKey("abort"))
        {
            if (!zzdq1.zza(zzip1))
            {
                zzb.zzaE("Precache abort but no preload task running.");
            }
            return;
        }
        String s = (String)map.get("src");
        if (s == null)
        {
            zzb.zzaE("Precache video action is missing the src parameter.");
            return;
        }
        int i;
        try
        {
            i = Integer.parseInt((String)map.get("player"));
        }
        catch (NumberFormatException numberformatexception)
        {
            i = 0;
        }
        if (map.containsKey("mimetype"))
        {
            map = (String)map.get("mimetype");
        } else
        {
            map = "";
        }
        if (zzdq1.zzb(zzip1))
        {
            zzb.zzaE("Precache task already running.");
            return;
        } else
        {
            com.google.android.gms.common.internal.zzb.zzr(zzip1.zzgP());
            (new zzdp(zzip1, zzip1.zzgP().zzoF.zza(zzip1, i, map), s)).zzgn();
            return;
        }
    }
}
