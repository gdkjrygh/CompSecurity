// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzdf, zzip, zzan, 
//            zzaj

static final class .client.zzb
    implements zzdg
{

    public void zza(zzip zzip1, Map map)
    {
        String s = (String)map.get("tx");
        String s1 = (String)map.get("ty");
        map = (String)map.get("td");
        int i;
        int j;
        int k;
        try
        {
            i = Integer.parseInt(s);
            j = Integer.parseInt(s1);
            k = Integer.parseInt(map);
            zzip1 = zzip1.zzgU();
        }
        // Misplaced declaration of an exception variable
        catch (zzip zzip1)
        {
            zzb.zzaE("Could not parse touch parameters from gmsg.");
            return;
        }
        if (zzip1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        zzip1.zzab().zza(i, j, k);
    }

    .client.zzb()
    {
    }
}
