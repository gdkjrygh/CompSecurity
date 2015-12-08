// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzge, zzgd

private class <init>
    implements zzbs
{

    final zzge zzDn;

    public void zza(zzgd zzgd, Map map)
    {
        if (map.keySet().contains("start"))
        {
            zzge.zza(zzDn);
        } else
        {
            if (map.keySet().contains("stop"))
            {
                zzge.zzb(zzDn);
                return;
            }
            if (map.keySet().contains("cancel"))
            {
                zzge.zzc(zzDn);
                return;
            }
        }
    }

    private (zzge zzge1)
    {
        zzDn = zzge1;
        super();
    }

    zzDn(zzge zzge1, zzDn zzdn)
    {
        this(zzge1);
    }
}
