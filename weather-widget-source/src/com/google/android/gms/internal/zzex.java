// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzhv, zzip

public class zzex
{

    private final zzip zzoL;
    private final boolean zzzD;
    private final String zzzE;

    public zzex(zzip zzip1, Map map)
    {
        zzoL = zzip1;
        zzzE = (String)map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange"))
        {
            zzzD = Boolean.parseBoolean((String)map.get("allowOrientationChange"));
            return;
        } else
        {
            zzzD = true;
            return;
        }
    }

    public void execute()
    {
        if (zzoL == null)
        {
            zzb.zzaE("AdWebView is null");
            return;
        }
        int i;
        if ("portrait".equalsIgnoreCase(zzzE))
        {
            i = zzp.zzbz().zzgw();
        } else
        if ("landscape".equalsIgnoreCase(zzzE))
        {
            i = zzp.zzbz().zzgv();
        } else
        if (zzzD)
        {
            i = -1;
        } else
        {
            i = zzp.zzbz().zzgx();
        }
        zzoL.setRequestedOrientation(i);
    }
}
