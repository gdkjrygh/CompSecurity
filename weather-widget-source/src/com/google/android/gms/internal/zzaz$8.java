// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzaz, zzip

class zzrl
    implements zzdg
{

    final zzaz zzrl;

    public void zza(zzip zzip, Map map)
    {
        while (!zzrl.zzb(map) || !map.containsKey("isVisible")) 
        {
            return;
        }
        boolean flag;
        if ("1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzrl.zzg(Boolean.valueOf(flag).booleanValue());
    }

    (zzaz zzaz1)
    {
        zzrl = zzaz1;
        super();
    }
}
