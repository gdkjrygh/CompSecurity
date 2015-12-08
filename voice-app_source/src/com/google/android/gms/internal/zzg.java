// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            zzk, zzn, zzr, zzf, 
//            zzi, zzs, zzm, zzb

public class zzg extends Thread
{

    private final zzb zzj;
    private final zzn zzk;
    private volatile boolean zzl;
    private final BlockingQueue zzy;
    private final zzf zzz;

    public zzg(BlockingQueue blockingqueue, zzf zzf1, zzb zzb1, zzn zzn1)
    {
        zzl = false;
        zzy = blockingqueue;
        zzz = zzf1;
        zzj = zzb1;
        zzk = zzn1;
    }

    private void zzb(zzk zzk1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(zzk1.zzg());
        }
    }

    private void zzb(zzk zzk1, zzr zzr1)
    {
        zzr1 = zzk1.zzb(zzr1);
        zzk.zza(zzk1, zzr1);
    }

    public void quit()
    {
        zzl = true;
        interrupt();
    }

    public void run()
    {
        Process.setThreadPriority(10);
_L2:
        Object obj;
        long l;
        l = SystemClock.elapsedRealtime();
        zzr zzr1;
        try
        {
            obj = (zzk)zzy.take();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (zzl)
            {
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        ((zzk) (obj)).zzc("network-queue-take");
        if (((zzk) (obj)).isCanceled())
        {
            ((zzk) (obj)).zzd("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        zzb(((zzk) (obj)));
        Object obj1 = zzz.zza(((zzk) (obj)));
        ((zzk) (obj)).zzc("network-http-complete");
        if (((zzi) (obj1)).zzB && ((zzk) (obj)).zzw())
        {
            ((zzk) (obj)).zzd("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((zzk) (obj)).zza(((zzi) (obj1)));
            ((zzk) (obj)).zzc("network-parse-complete");
            if (((zzk) (obj)).zzr() && ((zzm) (obj1)).zzag != null)
            {
                zzj.zza(((zzk) (obj)).zzh(), ((zzm) (obj1)).zzag);
                ((zzk) (obj)).zzc("network-cache-written");
            }
            ((zzk) (obj)).zzv();
            zzk.zza(((zzk) (obj)), ((zzm) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (zzr zzr1)
        {
            zzr1.zza(SystemClock.elapsedRealtime() - l);
            zzb(((zzk) (obj)), zzr1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            zzs.zza(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            obj1 = new zzr(((Throwable) (obj1)));
            ((zzr) (obj1)).zza(SystemClock.elapsedRealtime() - l);
            zzk.zza(((zzk) (obj)), ((zzr) (obj1)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
