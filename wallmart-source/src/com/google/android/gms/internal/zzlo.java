// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            zzlm

public final class zzlo
    implements zzlm
{

    private static zzlo zzagd;

    public zzlo()
    {
    }

    public static zzlm zzpN()
    {
        com/google/android/gms/internal/zzlo;
        JVM INSTR monitorenter ;
        zzlo zzlo1;
        if (zzagd == null)
        {
            zzagd = new zzlo();
        }
        zzlo1 = zzagd;
        com/google/android/gms/internal/zzlo;
        JVM INSTR monitorexit ;
        return zzlo1;
        Exception exception;
        exception;
        throw exception;
    }

    public long currentTimeMillis()
    {
        return System.currentTimeMillis();
    }

    public long elapsedRealtime()
    {
        return SystemClock.elapsedRealtime();
    }

    public long nanoTime()
    {
        return System.nanoTime();
    }
}
