// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzdk, zzip

public class zzdj
    implements zzdg
{

    private final zzdk zzxh;

    public zzdj(zzdk zzdk1)
    {
        zzxh = zzdk1;
    }

    public void zza(zzip zzip, Map map)
    {
        boolean flag = "1".equals(map.get("transparentBackground"));
        zzxh.zzd(flag);
    }
}
