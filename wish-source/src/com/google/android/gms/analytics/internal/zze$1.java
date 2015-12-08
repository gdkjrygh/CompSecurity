// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zze, zzae

class zzFU
    implements .UncaughtExceptionHandler
{

    final zze zzFU;

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        thread = zzFU.zzgU();
        if (thread != null)
        {
            thread.zze("Job execution failed", throwable);
        }
    }

    (zze zze1)
    {
        zzFU = zze1;
        super();
    }
}
