// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.common.internal.zzx;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            zzoa, zzob, zzoh, zzok, 
//            zzom, zzoe, zzog

public final class zzof
{
    private class zza extends ThreadPoolExecutor
    {

        final zzof zzaIj;

        protected RunnableFuture newTaskFor(Runnable runnable, Object obj)
        {
            return new FutureTask(this, runnable, obj) {

                final zza zzaIk;

                protected void setException(Throwable throwable)
                {
                    Thread.UncaughtExceptionHandler uncaughtexceptionhandler = zzof.zzb(zzaIk.zzaIj);
                    if (uncaughtexceptionhandler == null) goto _L2; else goto _L1
_L1:
                    uncaughtexceptionhandler.uncaughtException(Thread.currentThread(), throwable);
_L4:
                    super.setException(throwable);
                    return;
_L2:
                    if (Log.isLoggable("GAv4", 6))
                    {
                        Log.e("GAv4", (new StringBuilder()).append("MeasurementExecutor: job failed with ").append(throwable).toString());
                    }
                    if (true) goto _L4; else goto _L3
_L3:
                }

            
            {
                zzaIk = zza1;
                super(runnable, obj);
            }
            };
        }

        public zza()
        {
            zzaIj = zzof.this;
            super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            setThreadFactory(new zzb());
        }
    }

    private static class zzb
        implements ThreadFactory
    {

        private static final AtomicInteger zzaIl = new AtomicInteger();

        public Thread newThread(Runnable runnable)
        {
            return new zzc(runnable, (new StringBuilder()).append("measurement-").append(zzaIl.incrementAndGet()).toString());
        }


        private zzb()
        {
        }

    }

    private static class zzc extends Thread
    {

        public void run()
        {
            Process.setThreadPriority(10);
            super.run();
        }

        zzc(Runnable runnable, String s)
        {
            super(runnable, s);
        }
    }


    private static volatile zzof zzaId;
    private final Context mContext;
    private volatile zzok zzMm;
    private final List zzaIe = new CopyOnWriteArrayList();
    private final zzoa zzaIf = new zzoa();
    private final zza zzaIg = new zza();
    private Thread.UncaughtExceptionHandler zzaIh;

    zzof(Context context)
    {
        context = context.getApplicationContext();
        zzx.zzv(context);
        mContext = context;
    }

    static List zza(zzof zzof1)
    {
        return zzof1.zzaIe;
    }

    static void zza(zzof zzof1, zzob zzob1)
    {
        zzof1.zzb(zzob1);
    }

    public static zzof zzaI(Context context)
    {
        zzx.zzv(context);
        if (zzaId != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/zzof;
        JVM INSTR monitorenter ;
        if (zzaId == null)
        {
            zzaId = new zzof(context);
        }
        com/google/android/gms/internal/zzof;
        JVM INSTR monitorexit ;
_L2:
        return zzaId;
        context;
        com/google/android/gms/internal/zzof;
        JVM INSTR monitorexit ;
        throw context;
    }

    static Thread.UncaughtExceptionHandler zzb(zzof zzof1)
    {
        return zzof1.zzaIh;
    }

    private void zzb(zzob zzob1)
    {
        zzx.zzci("deliver should be called from worker thread");
        zzx.zzb(zzob1.zzxm(), "Measurement must be submitted");
        Object obj = zzob1.zzxj();
        if (!((List) (obj)).isEmpty())
        {
            HashSet hashset = new HashSet();
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                zzoh zzoh1 = (zzoh)((Iterator) (obj)).next();
                android.net.Uri uri = zzoh1.zzhs();
                if (!hashset.contains(uri))
                {
                    hashset.add(uri);
                    zzoh1.zzb(zzob1);
                }
            }
        }
    }

    public static void zzic()
    {
        if (!(Thread.currentThread() instanceof zzc))
        {
            throw new IllegalStateException("Call expected from worker thread");
        } else
        {
            return;
        }
    }

    public Context getContext()
    {
        return mContext;
    }

    public void zza(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        zzaIh = uncaughtexceptionhandler;
    }

    public Future zzb(Callable callable)
    {
        zzx.zzv(callable);
        if (Thread.currentThread() instanceof zzc)
        {
            callable = new FutureTask(callable);
            callable.run();
            return callable;
        } else
        {
            return zzaIg.submit(callable);
        }
    }

    void zze(zzob zzob1)
    {
        if (zzob1.zzxq())
        {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        }
        if (zzob1.zzxm())
        {
            throw new IllegalStateException("Measurement can only be submitted once");
        } else
        {
            zzob1 = zzob1.zzxh();
            zzob1.zzxn();
            zzaIg.execute(new Runnable(zzob1) {

                final zzob zzaIi;
                final zzof zzaIj;

                public void run()
                {
                    zzaIi.zzxo().zza(zzaIi);
                    for (Iterator iterator = zzof.zza(zzaIj).iterator(); iterator.hasNext(); ((zzog)iterator.next()).zza(zzaIi)) { }
                    zzof.zza(zzaIj, zzaIi);
                }

            
            {
                zzaIj = zzof.this;
                zzaIi = zzob1;
                super();
            }
            });
            return;
        }
    }

    public void zzf(Runnable runnable)
    {
        zzx.zzv(runnable);
        zzaIg.submit(runnable);
    }

    public zzok zzxu()
    {
        if (zzMm != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (zzMm != null) goto _L4; else goto _L3
_L3:
        String s1;
        zzok zzok1;
        PackageManager packagemanager;
        zzok1 = new zzok();
        packagemanager = mContext.getPackageManager();
        s1 = mContext.getPackageName();
        zzok1.setAppId(s1);
        zzok1.setAppInstallerId(packagemanager.getInstallerPackageName(s1));
        String s;
        Object obj3;
        obj3 = null;
        s = s1;
        PackageInfo packageinfo = packagemanager.getPackageInfo(mContext.getPackageName(), 0);
        Object obj;
        Object obj2;
        obj2 = obj3;
        obj = s1;
        if (packageinfo == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        s = s1;
        obj2 = packagemanager.getApplicationLabel(packageinfo.applicationInfo);
        obj = s1;
        s = s1;
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        s = s1;
        obj = ((CharSequence) (obj2)).toString();
        s = ((String) (obj));
        obj2 = packageinfo.versionName;
_L5:
        zzok1.setAppName(((String) (obj)));
        zzok1.setAppVersion(((String) (obj2)));
        zzMm = zzok1;
_L4:
        this;
        JVM INSTR monitorexit ;
_L2:
        return zzMm;
        Object obj1;
        obj1;
        Log.e("GAv4", (new StringBuilder()).append("Error retrieving package info: appName set to ").append(s).toString());
        obj2 = obj3;
        obj1 = s;
          goto _L5
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public zzom zzxv()
    {
        DisplayMetrics displaymetrics = mContext.getResources().getDisplayMetrics();
        zzom zzom1 = new zzom();
        zzom1.setLanguage(zzam.zza(Locale.getDefault()));
        zzom1.zzhO(displaymetrics.widthPixels);
        zzom1.zzhP(displaymetrics.heightPixels);
        return zzom1;
    }
}
