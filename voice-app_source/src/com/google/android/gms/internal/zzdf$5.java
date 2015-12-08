// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzdf, zzid

static final class l.client.zzb
    implements zzdg
{

    public void zza(zzid zzid1, Map map)
    {
        map = zzid1.zzgD();
        if (map != null)
        {
            map.close();
            return;
        }
        zzid1 = zzid1.zzgE();
        if (zzid1 != null)
        {
            zzid1.close();
            return;
        } else
        {
            zzb.zzaC("A GMSG tried to close something that wasn't an overlay.");
            return;
        }
    }

    l.client.zzb()
    {
    }
}
