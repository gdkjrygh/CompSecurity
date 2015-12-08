// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zziq, zzip

private class <init>
    implements zzdg
{

    final zziq zzJi;

    public void zza(zzip zzip, Map map)
    {
        if (map.keySet().contains("start"))
        {
            zziq.zza(zzJi);
        } else
        {
            if (map.keySet().contains("stop"))
            {
                zziq.zzb(zzJi);
                return;
            }
            if (map.keySet().contains("cancel"))
            {
                zziq.zzc(zzJi);
                return;
            }
        }
    }

    private (zziq zziq1)
    {
        zzJi = zziq1;
        super();
    }

    zzJi(zziq zziq1, zzJi zzji)
    {
        this(zziq1);
    }
}
