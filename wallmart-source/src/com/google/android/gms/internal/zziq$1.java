// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            zziq, zzip

class zzJi
    implements Runnable
{

    final zziq zzJi;

    public void run()
    {
        zzJi.zzoL.zzgZ();
        zzd zzd1 = zzJi.zzoL.zzgQ();
        if (zzd1 != null)
        {
            zzd1.zzeA();
        }
        if (com.google.android.gms.internal.zziq.zzd(zzJi) != null)
        {
            com.google.android.gms.internal.zziq.zzd(zzJi).zzbf();
            zziq.zza(zzJi, null);
        }
    }

    b(zziq zziq1)
    {
        zzJi = zziq1;
        super();
    }
}
