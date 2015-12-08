// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzde, zzid

public final class zzdd
    implements zzdg
{

    private final zzde zzvU;

    public zzdd(zzde zzde1)
    {
        zzvU = zzde1;
    }

    public void zza(zzid zzid, Map map)
    {
        zzid = (String)map.get("name");
        if (zzid == null)
        {
            zzb.zzaC("App event with no name parameter.");
            return;
        } else
        {
            zzvU.onAppEvent(zzid, (String)map.get("info"));
            return;
        }
    }
}
