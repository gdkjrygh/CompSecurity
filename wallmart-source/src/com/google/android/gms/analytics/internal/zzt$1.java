// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Looper;
import com.google.android.gms.internal.zzof;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzt, zzf

class zzMU
    implements Runnable
{

    final zzt zzMU;

    public void run()
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            zzt.zza(zzMU).zzig().zzf(this);
        } else
        {
            boolean flag = zzMU.zzbr();
            zzt.zza(zzMU, 0L);
            if (flag && !zzt.zzb(zzMU))
            {
                zzMU.run();
                return;
            }
        }
    }

    (zzt zzt1)
    {
        zzMU = zzt1;
        super();
    }
}
