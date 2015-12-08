// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzdf, zzip

static final class l.client.zzb
    implements zzdg
{

    public void zza(zzip zzip1, Map map)
    {
        map = zzip1.zzgQ();
        if (map != null)
        {
            map.close();
            return;
        }
        zzip1 = zzip1.zzgR();
        if (zzip1 != null)
        {
            zzip1.close();
            return;
        } else
        {
            zzb.zzaE("A GMSG tried to close something that wasn't an overlay.");
            return;
        }
    }

    l.client.zzb()
    {
    }
}
