// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzie, zzid

private class <init>
    implements zzdg
{

    final zzie zzHm;

    public void zza(zzid zzid, Map map)
    {
        if (map.keySet().contains("start"))
        {
            zzie.zza(zzHm);
        } else
        {
            if (map.keySet().contains("stop"))
            {
                zzie.zzb(zzHm);
                return;
            }
            if (map.keySet().contains("cancel"))
            {
                zzie.zzc(zzHm);
                return;
            }
        }
    }

    private (zzie zzie1)
    {
        zzHm = zzie1;
        super();
    }

    zzHm(zzie zzie1, zzHm zzhm)
    {
        this(zzie1);
    }
}
