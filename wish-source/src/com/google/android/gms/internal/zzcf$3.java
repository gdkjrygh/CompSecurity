// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzcf, zzfr, zzy, 
//            zzgd

class zzui
    implements zzbs
{

    final zzcf zzug;
    final zzfr zzui;

    public void zza(zzgd zzgd, Map map)
    {
        synchronized (zzcf.zza(zzug))
        {
            zzcf.zza(zzug, 1);
            zzb.zzal("Javascript is requesting an update");
            com.google.android.gms.internal.zzcf.zzb(zzug).zzb("/requestReload", (zzbs)zzui.get());
        }
        return;
        map;
        zzgd;
        JVM INSTR monitorexit ;
        throw map;
    }

    l.client.zzb(zzcf zzcf1, zzfr zzfr1)
    {
        zzug = zzcf1;
        zzui = zzfr1;
        super();
    }
}
