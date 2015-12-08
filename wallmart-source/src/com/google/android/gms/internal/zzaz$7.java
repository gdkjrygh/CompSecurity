// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzaz, zzax, zzip

class zzrl
    implements zzdg
{

    final zzaz zzrl;

    public void zza(zzip zzip, Map map)
    {
        if (!zzrl.zzb(map))
        {
            return;
        } else
        {
            zzb.zzaC((new StringBuilder()).append("Received request to untrack: ").append(com.google.android.gms.internal.zzaz.zzb(zzrl).zzbX()).toString());
            zzrl.destroy();
            return;
        }
    }

    l.client.zzb(zzaz zzaz1)
    {
        zzrl = zzaz1;
        super();
    }
}
