// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            zzie, zzih, zzhl

public final class zzht
{

    private static final ExecutorService zzHy = Executors.newFixedThreadPool(10, zzav("Default"));
    private static final ExecutorService zzHz = Executors.newFixedThreadPool(5, zzav("Loader"));

    public static zzih zza(int i, Runnable runnable)
    {
        if (i == 1)
        {
            return zza(zzHz, new Callable(runnable) {

                final Runnable zzHA;

                public Object call()
                    throws Exception
                {
                    return zzgp();
                }

                public Void zzgp()
                {
                    zzHA.run();
                    return null;
                }

            
            {
                zzHA = runnable;
                super();
            }
            });
        } else
        {
            return zza(zzHy, new Callable(runnable) {

                final Runnable zzHA;

                public Object call()
                    throws Exception
                {
                    return zzgp();
                }

                public Void zzgp()
                {
                    zzHA.run();
                    return null;
                }

            
            {
                zzHA = runnable;
                super();
            }
            });
        }
    }

    public static zzih zza(Runnable runnable)
    {
        return zza(0, runnable);
    }

    public static zzih zza(Callable callable)
    {
        return zza(zzHy, callable);
    }

    public static zzih zza(ExecutorService executorservice, Callable callable)
    {
        zzie zzie1 = new zzie();
        try
        {
            executorservice.submit(new Runnable(zzie1, callable) {

                final Callable zzHB;
                final zzie zzrp;

                public void run()
                {
                    try
                    {
                        Process.setThreadPriority(10);
                        zzrp.zzf(zzHB.call());
                        return;
                    }
                    catch (Exception exception)
                    {
                        zzp.zzbA().zzc(exception, true);
                    }
                    zzrp.cancel(true);
                }

            
            {
                zzrp = zzie1;
                zzHB = callable;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (ExecutorService executorservice)
        {
            zzb.zzd("Thread execution is rejected.", executorservice);
            zzie1.cancel(true);
            return zzie1;
        }
        return zzie1;
    }

    private static ThreadFactory zzav(String s)
    {
        return new ThreadFactory(s) {

            private final AtomicInteger zzHC = new AtomicInteger(1);
            final String zzHD;

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder()).append("AdWorker(").append(zzHD).append(") #").append(zzHC.getAndIncrement()).toString());
            }

            
            {
                zzHD = s;
                super();
            }
        };
    }

}
