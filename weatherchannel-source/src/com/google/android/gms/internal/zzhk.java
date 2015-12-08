// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.google.android.gms.internal:
//            zzhs, zzhv

public final class zzhk
{

    private static final ExecutorService zzGe = Executors.newFixedThreadPool(10, zzas("Default"));
    private static final ExecutorService zzGf = Executors.newFixedThreadPool(5, zzas("Loader"));

    public static zzhv zza(int i, Runnable runnable)
    {
        if (i == 1)
        {
            return zza(zzGf, ((Callable) (new _cls1(runnable))));
        } else
        {
            return zza(zzGe, ((Callable) (new _cls2(runnable))));
        }
    }

    public static zzhv zza(Runnable runnable)
    {
        return zza(0, runnable);
    }

    public static zzhv zza(Callable callable)
    {
        return zza(zzGe, callable);
    }

    public static zzhv zza(ExecutorService executorservice, Callable callable)
    {
        zzhs zzhs1 = new zzhs();
        try
        {
            executorservice.submit(new _cls3(zzhs1, callable));
        }
        // Misplaced declaration of an exception variable
        catch (ExecutorService executorservice)
        {
            zzb.zzd("Thread execution is rejected.", executorservice);
            zzhs1.cancel(true);
            return zzhs1;
        }
        return zzhs1;
    }

    private static ThreadFactory zzas(String s)
    {
        return new _cls4(s);
    }


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}

}
