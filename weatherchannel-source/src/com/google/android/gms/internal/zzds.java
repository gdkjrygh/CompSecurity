// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzdq, zzdp, zzid

public class zzds
    implements zzdg
{

    public zzds()
    {
    }

    public void zza(zzid zzid, Map map)
    {
        zzdq zzdq1 = zzo.zzbH();
        if (map.containsKey("abort"))
        {
            if (!zzdq1.zza(zzid))
            {
                zzb.zzaC("Precache abort but no preload task running.");
            }
            return;
        }
        map = (String)map.get("src");
        if (map == null)
        {
            zzb.zzaC("Precache video action is missing the src parameter.");
            return;
        }
        if (zzdq1.zzb(zzid))
        {
            zzb.zzaC("Precache task already running.");
            return;
        } else
        {
            (new zzdp(zzid, map)).zzgi();
            return;
        }
    }
}
