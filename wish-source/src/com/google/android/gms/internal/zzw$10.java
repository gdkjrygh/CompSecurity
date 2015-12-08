// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzw, zzu, zzgd

class zzoF
    implements zzbs
{

    final zzw zzoF;

    public void zza(zzgd zzgd, Map map)
    {
        if (!zzoF.zza(map))
        {
            return;
        } else
        {
            zzb.zzaj((new StringBuilder()).append("Received request to untrack: ").append(com.google.android.gms.internal.zzw.zzb(zzoF).zzbf()).toString());
            zzoF.destroy();
            return;
        }
    }

    l.client.zzb(zzw zzw1)
    {
        zzoF = zzw1;
        super();
    }
}
