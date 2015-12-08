// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzdd, zzip

public final class zzdc
    implements zzdg
{

    private final zzdd zzwH;

    public zzdc(zzdd zzdd1)
    {
        zzwH = zzdd1;
    }

    public void zza(zzip zzip, Map map)
    {
        zzip = (String)map.get("name");
        if (zzip == null)
        {
            zzb.zzaE("App event with no name parameter.");
            return;
        } else
        {
            zzwH.onAppEvent(zzip, (String)map.get("info"));
            return;
        }
    }
}
