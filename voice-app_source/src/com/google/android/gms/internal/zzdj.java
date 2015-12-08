// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzdk, zzid

public class zzdj
    implements zzdg
{

    private final zzdk zzwu;

    public zzdj(zzdk zzdk1)
    {
        zzwu = zzdk1;
    }

    public void zza(zzid zzid, Map map)
    {
        boolean flag = "1".equals(map.get("transparentBackground"));
        zzwu.zzd(flag);
    }
}
