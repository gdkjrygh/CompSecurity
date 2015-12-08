// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Looper;
import com.google.android.gms.internal.zzns;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzt, zzf

class zzKV
    implements Runnable
{

    final zzt zzKV;

    public void run()
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            zzt.zza(zzKV).zzhS().zze(this);
        } else
        {
            boolean flag = zzKV.zzbp();
            zzt.zza(zzKV, 0L);
            if (flag && !zzt.zzb(zzKV))
            {
                zzKV.run();
                return;
            }
        }
    }

    (zzt zzt1)
    {
        zzKV = zzt1;
        super();
    }
}
