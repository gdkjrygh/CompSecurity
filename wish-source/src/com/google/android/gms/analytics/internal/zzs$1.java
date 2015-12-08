// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Looper;
import com.google.android.gms.internal.zzkk;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzs, zze

class zzGZ
    implements Runnable
{

    final zzs zzGZ;

    public void run()
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            zzs.zza(zzGZ).zzgJ().zze(this);
        } else
        {
            boolean flag = zzGZ.zzaK();
            zzs.zza(zzGZ, 0L);
            if (flag && !zzs.zzb(zzGZ))
            {
                zzGZ.run();
                return;
            }
        }
    }

    (zzs zzs1)
    {
        zzGZ = zzs1;
        super();
    }
}
