// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzcf, zzfx, zzgd

class zzuf
    implements zzbs
{

    final zzfx zzuf;
    final zzcf zzug;

    public void zza(zzgd zzgd, Map map)
    {
label0:
        {
            synchronized (zzcf.zza(zzug))
            {
                if (zzuf.getStatus() != -1 && zzuf.getStatus() != 1)
                {
                    break label0;
                }
            }
            return;
        }
        zzuf.zzd(zzcf.zzb(zzug));
        zzuf.zza(zzcf.zzc(zzug), new b());
        zzcf.zza(zzug, 0);
        if (zzuf != zzcf.zzd(zzug))
        {
            zzug.zzd(zzcf.zzd(zzug));
        }
        zzcf.zza(zzug, zzuf);
        zzug.zzc(zzcf.zzd(zzug));
        zzgd;
        JVM INSTR monitorexit ;
        return;
        map;
        zzgd;
        JVM INSTR monitorexit ;
        throw map;
    }

    b(zzcf zzcf1, zzfx zzfx1)
    {
        zzug = zzcf1;
        zzuf = zzfx1;
        super();
    }
}
