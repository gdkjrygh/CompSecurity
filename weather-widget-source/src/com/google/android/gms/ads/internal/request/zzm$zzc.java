// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzdg;
import com.google.android.gms.internal.zzdl;
import com.google.android.gms.internal.zzip;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzm

public static class _cls9
    implements zzdg
{

    public void zza(zzip zzip, Map map)
    {
        zzip = (String)map.get("request_id");
        map = (String)map.get("errors");
        zzb.zzaE((new StringBuilder()).append("Invalid request: ").append(map).toString());
        zzm.zzfD().zzX(zzip);
    }

    public _cls9()
    {
    }
}
