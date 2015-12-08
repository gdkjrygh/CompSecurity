// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzbq, zzgd

public final class zzbp
    implements zzbs
{

    private final zzbq zzth;

    public zzbp(zzbq zzbq1)
    {
        zzth = zzbq1;
    }

    public void zza(zzgd zzgd, Map map)
    {
        zzgd = (String)map.get("name");
        if (zzgd == null)
        {
            zzb.zzan("App event with no name parameter.");
            return;
        } else
        {
            zzth.onAppEvent(zzgd, (String)map.get("info"));
            return;
        }
    }
}
