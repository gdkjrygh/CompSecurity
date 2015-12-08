// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlm;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzof;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzg, zzaf, zzr, zze, 
//            zzai, zzan, zzn, zza, 
//            zzk, zzu, zzv, zzb, 
//            zzy, zzd

public class zzf
{

    private static zzf zzLC;
    private final Context mContext;
    private final Context zzLD;
    private final zzr zzLE;
    private final zzaf zzLF;
    private final zzof zzLG;
    private final zzb zzLH;
    private final zzv zzLI;
    private final zzan zzLJ;
    private final zzai zzLK;
    private final GoogleAnalytics zzLL;
    private final zzn zzLM;
    private final zza zzLN;
    private final zzk zzLO;
    private final zzu zzLP;
    private final zzlm zzpO;

    protected zzf(zzg zzg1)
    {
        Object obj = zzg1.getApplicationContext();
        zzx.zzb(obj, "Application context can't be null");
        zzx.zzb(obj instanceof Application, "getApplicationContext didn't return the application");
        Object obj1 = zzg1.zziq();
        zzx.zzv(obj1);
        mContext = ((Context) (obj));
        zzLD = ((Context) (obj1));
        zzpO = zzg1.zzh(this);
        zzLE = zzg1.zzg(this);
        obj1 = zzg1.zzf(this);
        ((zzaf) (obj1)).zza();
        zzLF = ((zzaf) (obj1));
        zzn zzn1;
        zza zza1;
        zzk zzk1;
        zzu zzu1;
        if (zzif().zzjk())
        {
            zzie().zzba((new StringBuilder()).append("Google Analytics ").append(zze.VERSION).append(" is starting up.").toString());
        } else
        {
            zzie().zzba((new StringBuilder()).append("Google Analytics ").append(zze.VERSION).append(" is starting up. ").append("To enable debug logging on a device run:\n").append("  adb shell setprop log.tag.GAv4 DEBUG\n").append("  adb logcat -s GAv4").toString());
        }
        obj1 = zzg1.zzq(this);
        ((zzai) (obj1)).zza();
        zzLK = ((zzai) (obj1));
        obj1 = zzg1.zze(this);
        ((zzan) (obj1)).zza();
        zzLJ = ((zzan) (obj1));
        obj1 = zzg1.zzl(this);
        zzn1 = zzg1.zzd(this);
        zza1 = zzg1.zzc(this);
        zzk1 = zzg1.zzb(this);
        zzu1 = zzg1.zza(this);
        obj = zzg1.zzY(((Context) (obj)));
        ((zzof) (obj)).zza(zzip());
        zzLG = ((zzof) (obj));
        obj = zzg1.zzi(this);
        zzn1.zza();
        zzLM = zzn1;
        zza1.zza();
        zzLN = zza1;
        zzk1.zza();
        zzLO = zzk1;
        zzu1.zza();
        zzLP = zzu1;
        zzg1 = zzg1.zzp(this);
        zzg1.zza();
        zzLI = zzg1;
        ((zzb) (obj1)).zza();
        zzLH = ((zzb) (obj1));
        if (zzif().zzjk())
        {
            zzie().zzb("Device AnalyticsService version", zze.VERSION);
        }
        ((GoogleAnalytics) (obj)).zza();
        zzLL = ((GoogleAnalytics) (obj));
        ((zzb) (obj1)).start();
    }

    public static zzf zzX(Context context)
    {
        zzx.zzv(context);
        if (zzLC != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/analytics/internal/zzf;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        if (zzLC != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        zzlm zzlm1 = zzlo.zzpN();
        l = zzlm1.elapsedRealtime();
        context = new zzf(new zzg(context.getApplicationContext()));
        zzLC = context;
        GoogleAnalytics.zzhx();
        l = zzlm1.elapsedRealtime() - l;
        l1 = ((Long)zzy.zzNO.get()).longValue();
        if (l <= l1)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        context.zzie().zzc("Slow initialization (ms)", Long.valueOf(l), Long.valueOf(l1));
        com/google/android/gms/analytics/internal/zzf;
        JVM INSTR monitorexit ;
_L2:
        return zzLC;
        context;
        com/google/android/gms/analytics/internal/zzf;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void zza(zzd zzd1)
    {
        zzx.zzb(zzd1, "Analytics service not created/initialized");
        zzx.zzb(zzd1.isInitialized(), "Analytics service not initialized");
    }

    public Context getContext()
    {
        return mContext;
    }

    public zzan zzhA()
    {
        zza(zzLJ);
        return zzLJ;
    }

    public zzb zzhz()
    {
        zza(zzLH);
        return zzLH;
    }

    public void zzic()
    {
        zzof.zzic();
    }

    public zzlm zzid()
    {
        return zzpO;
    }

    public zzaf zzie()
    {
        zza(zzLF);
        return zzLF;
    }

    public zzr zzif()
    {
        return zzLE;
    }

    public zzof zzig()
    {
        zzx.zzv(zzLG);
        return zzLG;
    }

    public zzv zzih()
    {
        zza(zzLI);
        return zzLI;
    }

    public zzai zzii()
    {
        zza(zzLK);
        return zzLK;
    }

    public zzk zzil()
    {
        zza(zzLO);
        return zzLO;
    }

    public zzu zzim()
    {
        return zzLP;
    }

    protected Thread.UncaughtExceptionHandler zzip()
    {
        return new Thread.UncaughtExceptionHandler() {

            final zzf zzLQ;

            public void uncaughtException(Thread thread, Throwable throwable)
            {
                thread = zzLQ.zzir();
                if (thread != null)
                {
                    thread.zze("Job execution failed", throwable);
                }
            }

            
            {
                zzLQ = zzf.this;
                super();
            }
        };
    }

    public Context zziq()
    {
        return zzLD;
    }

    public zzaf zzir()
    {
        return zzLF;
    }

    public GoogleAnalytics zzis()
    {
        zzx.zzv(zzLL);
        zzx.zzb(zzLL.isInitialized(), "Analytics instance not initialized");
        return zzLL;
    }

    public zzai zzit()
    {
        if (zzLK == null || !zzLK.isInitialized())
        {
            return null;
        } else
        {
            return zzLK;
        }
    }

    public zza zziu()
    {
        zza(zzLN);
        return zzLN;
    }

    public zzn zziv()
    {
        zza(zzLM);
        return zzLM;
    }
}
