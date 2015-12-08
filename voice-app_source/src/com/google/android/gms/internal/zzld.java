// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            zzlb

public final class zzld
    implements zzlb
{

    private static zzld zzacK;

    public zzld()
    {
    }

    public static zzlb zzoQ()
    {
        com/google/android/gms/internal/zzld;
        JVM INSTR monitorenter ;
        zzld zzld1;
        if (zzacK == null)
        {
            zzacK = new zzld();
        }
        zzld1 = zzacK;
        com/google/android/gms/internal/zzld;
        JVM INSTR monitorexit ;
        return zzld1;
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
}
