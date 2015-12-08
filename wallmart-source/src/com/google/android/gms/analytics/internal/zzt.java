// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlm;
import com.google.android.gms.internal.zzof;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzf, zzaf

abstract class zzt
{

    private static volatile Handler zzMR;
    private final zzf zzLy;
    private volatile long zzMS;
    private boolean zzMT;
    private final Runnable zzx = new Runnable() {

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

            
            {
                zzMU = zzt.this;
                super();
            }
    };

    zzt(zzf zzf1)
    {
        com.google.android.gms.common.internal.zzx.zzv(zzf1);
        zzLy = zzf1;
    }

    private Handler getHandler()
    {
        if (zzMR != null)
        {
            return zzMR;
        }
        com/google/android/gms/analytics/internal/zzt;
        JVM INSTR monitorenter ;
        Handler handler;
        if (zzMR == null)
        {
            zzMR = new Handler(zzLy.getContext().getMainLooper());
        }
        handler = zzMR;
        com/google/android/gms/analytics/internal/zzt;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        com/google/android/gms/analytics/internal/zzt;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static long zza(zzt zzt1, long l)
    {
        zzt1.zzMS = l;
        return l;
    }

    static zzf zza(zzt zzt1)
    {
        return zzt1.zzLy;
    }

    static boolean zzb(zzt zzt1)
    {
        return zzt1.zzMT;
    }

    public void cancel()
    {
        zzMS = 0L;
        getHandler().removeCallbacks(zzx);
    }

    public abstract void run();

    public boolean zzbr()
    {
        return zzMS != 0L;
    }

    public long zzjR()
    {
        if (zzMS == 0L)
        {
            return 0L;
        } else
        {
            return Math.abs(zzLy.zzid().currentTimeMillis() - zzMS);
        }
    }

    public void zzt(long l)
    {
        cancel();
        if (l >= 0L)
        {
            zzMS = zzLy.zzid().currentTimeMillis();
            if (!getHandler().postDelayed(zzx, l))
            {
                zzLy.zzie().zze("Failed to schedule delayed post. time", Long.valueOf(l));
            }
        }
    }

    public void zzu(long l)
    {
        long l1 = 0L;
        if (zzbr())
        {
            if (l < 0L)
            {
                cancel();
                return;
            }
            l -= Math.abs(zzLy.zzid().currentTimeMillis() - zzMS);
            if (l < 0L)
            {
                l = l1;
            }
            getHandler().removeCallbacks(zzx);
            if (!getHandler().postDelayed(zzx, l))
            {
                zzLy.zzie().zze("Failed to adjust delayed post. time", Long.valueOf(l));
                return;
            }
        }
    }
}
