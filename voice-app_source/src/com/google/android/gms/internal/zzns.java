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
import com.google.android.gms.common.internal.zzu;
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
//            zznn, zzno, zznu, zznx, 
//            zznz, zznr, zznt

public final class zzns
{
    private class zza extends ThreadPoolExecutor
    {

        final zzns zzaEn;

        protected RunnableFuture newTaskFor(Runnable runnable, Object obj)
        {
            return new FutureTask(this, runnable, obj) {

                final zza zzaEo;

                protected void setException(Throwable throwable)
                {
                    Thread.UncaughtExceptionHandler uncaughtexceptionhandler = zzns.zzb(zzaEo.zzaEn);
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
                zzaEo = zza1;
                super(runnable, obj);
            }
            };
        }

        public zza()
        {
            zzaEn = zzns.this;
            super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            setThreadFactory(new zzb());
        }
    }

    private static class zzb
        implements ThreadFactory
    {

        private static final AtomicInteger zzaEp = new AtomicInteger();

        public Thread newThread(Runnable runnable)
        {
            return new zzc(runnable, (new StringBuilder()).append("measurement-").append(zzaEp.incrementAndGet()).toString());
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


    private static volatile zzns zzaEh;
    private final Context mContext;
    private volatile zznx zzKm;
    private final List zzaEi = new CopyOnWriteArrayList();
    private final zznn zzaEj = new zznn();
    private final zza zzaEk = new zza();
    private Thread.UncaughtExceptionHandler zzaEl;

    zzns(Context context)
    {
        context = context.getApplicationContext();
        zzu.zzu(context);
        mContext = context;
    }

    static List zza(zzns zzns1)
    {
        return zzns1.zzaEi;
    }

    static void zza(zzns zzns1, zzno zzno1)
    {
        zzns1.zzb(zzno1);
    }

    public static zzns zzaB(Context context)
    {
        zzu.zzu(context);
        if (zzaEh != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/zzns;
        JVM INSTR monitorenter ;
        if (zzaEh == null)
        {
            zzaEh = new zzns(context);
        }
        com/google/android/gms/internal/zzns;
        JVM INSTR monitorexit ;
_L2:
        return zzaEh;
        context;
        com/google/android/gms/internal/zzns;
        JVM INSTR monitorexit ;
        throw context;
    }

    static Thread.UncaughtExceptionHandler zzb(zzns zzns1)
    {
        return zzns1.zzaEl;
    }

    private void zzb(zzno zzno1)
    {
        zzu.zzbZ("deliver should be called from worker thread");
        zzu.zzb(zzno1.zzvU(), "Measurement must be submitted");
        Object obj = zzno1.zzvR();
        if (!((List) (obj)).isEmpty())
        {
            HashSet hashset = new HashSet();
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                zznu zznu1 = (zznu)((Iterator) (obj)).next();
                android.net.Uri uri = zznu1.zzhe();
                if (!hashset.contains(uri))
                {
                    hashset.add(uri);
                    zznu1.zzb(zzno1);
                }
            }
        }
    }

    public static void zzhO()
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
        zzaEl = uncaughtexceptionhandler;
    }

    public Future zzb(Callable callable)
    {
        zzu.zzu(callable);
        if (Thread.currentThread() instanceof zzc)
        {
            callable = new FutureTask(callable);
            callable.run();
            return callable;
        } else
        {
            return zzaEk.submit(callable);
        }
    }

    void zze(zzno zzno1)
    {
        if (zzno1.zzvY())
        {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        }
        if (zzno1.zzvU())
        {
            throw new IllegalStateException("Measurement can only be submitted once");
        } else
        {
            zzno1 = zzno1.zzvP();
            zzno1.zzvV();
            zzaEk.execute(new Runnable(zzno1) {

                final zzno zzaEm;
                final zzns zzaEn;

                public void run()
                {
                    zzaEm.zzvW().zza(zzaEm);
                    for (Iterator iterator = zzns.zza(zzaEn).iterator(); iterator.hasNext(); ((zznt)iterator.next()).zza(zzaEm)) { }
                    zzns.zza(zzaEn, zzaEm);
                }

            
            {
                zzaEn = zzns.this;
                zzaEm = zzno1;
                super();
            }
            });
            return;
        }
    }

    public void zze(Runnable runnable)
    {
        zzu.zzu(runnable);
        zzaEk.submit(runnable);
    }

    public zznx zzwc()
    {
        if (zzKm != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (zzKm != null) goto _L4; else goto _L3
_L3:
        String s1;
        zznx zznx1;
        PackageManager packagemanager;
        zznx1 = new zznx();
        packagemanager = mContext.getPackageManager();
        s1 = mContext.getPackageName();
        zznx1.setAppId(s1);
        zznx1.setAppInstallerId(packagemanager.getInstallerPackageName(s1));
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
        zznx1.setAppName(((String) (obj)));
        zznx1.setAppVersion(((String) (obj2)));
        zzKm = zznx1;
_L4:
        this;
        JVM INSTR monitorexit ;
_L2:
        return zzKm;
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

    public zznz zzwd()
    {
        DisplayMetrics displaymetrics = mContext.getResources().getDisplayMetrics();
        zznz zznz1 = new zznz();
        zznz1.setLanguage(zzam.zza(Locale.getDefault()));
        zznz1.zzhG(displaymetrics.widthPixels);
        zznz1.zzhH(displaymetrics.heightPixels);
        return zznz1;
    }
}
