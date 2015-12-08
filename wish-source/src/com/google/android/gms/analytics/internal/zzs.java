// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzkk;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zze, zzae

abstract class zzs
{

    private static volatile Handler zzGW;
    private final zze zzFD;
    private volatile long zzGX;
    private boolean zzGY;
    private final Runnable zznB = new Runnable() {

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

            
            {
                zzGZ = zzs.this;
                super();
            }
    };

    zzs(zze zze1)
    {
        zzv.zzr(zze1);
        zzFD = zze1;
    }

    private Handler getHandler()
    {
        if (zzGW != null)
        {
            return zzGW;
        }
        com/google/android/gms/analytics/internal/zzs;
        JVM INSTR monitorenter ;
        Handler handler;
        if (zzGW == null)
        {
            zzGW = new Handler(zzFD.getContext().getMainLooper());
        }
        handler = zzGW;
        com/google/android/gms/analytics/internal/zzs;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        com/google/android/gms/analytics/internal/zzs;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static long zza(zzs zzs1, long l)
    {
        zzs1.zzGX = l;
        return l;
    }

    static zze zza(zzs zzs1)
    {
        return zzs1.zzFD;
    }

    static boolean zzb(zzs zzs1)
    {
        return zzs1.zzGY;
    }

    public void cancel()
    {
        zzGX = 0L;
        getHandler().removeCallbacks(zznB);
    }

    public abstract void run();

    public boolean zzaK()
    {
        return zzGX != 0L;
    }

    public long zziv()
    {
        if (zzGX == 0L)
        {
            return 0L;
        } else
        {
            return Math.abs(zzFD.zzgG().currentTimeMillis() - zzGX);
        }
    }

    public void zzr(long l)
    {
        cancel();
        if (l >= 0L)
        {
            zzGX = zzFD.zzgG().currentTimeMillis();
            if (!getHandler().postDelayed(zznB, l))
            {
                zzFD.zzgH().zze("Failed to schedule delayed post. time", Long.valueOf(l));
            }
        }
    }

    public void zzs(long l)
    {
        long l1 = 0L;
        if (zzaK())
        {
            if (l < 0L)
            {
                cancel();
                return;
            }
            l -= Math.abs(zzFD.zzgG().currentTimeMillis() - zzGX);
            if (l < 0L)
            {
                l = l1;
            }
            getHandler().removeCallbacks(zznB);
            if (!getHandler().postDelayed(zznB, l))
            {
                zzFD.zzgH().zze("Failed to adjust delayed post. time", Long.valueOf(l));
                return;
            }
        }
    }
}
