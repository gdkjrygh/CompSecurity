// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzak;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzan;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzn;
import com.google.android.gms.analytics.internal.zzy;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            zza, Tracker, Logger

public final class GoogleAnalytics extends com.google.android.gms.analytics.zza
{
    static interface zza
    {

        public abstract void zzo(Activity activity);

        public abstract void zzp(Activity activity);
    }

    class zzb
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        final GoogleAnalytics zzKA;

        public void onActivityCreated(Activity activity, Bundle bundle)
        {
        }

        public void onActivityDestroyed(Activity activity)
        {
        }

        public void onActivityPaused(Activity activity)
        {
        }

        public void onActivityResumed(Activity activity)
        {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
        {
        }

        public void onActivityStarted(Activity activity)
        {
            zzKA.zzm(activity);
        }

        public void onActivityStopped(Activity activity)
        {
            zzKA.zzn(activity);
        }

        zzb()
        {
            zzKA = GoogleAnalytics.this;
            super();
        }
    }


    private static List zzKt = new ArrayList();
    private boolean zzKu;
    private Set zzKv;
    private boolean zzKw;
    private boolean zzKx;
    private volatile boolean zzKy;
    private boolean zzKz;
    private boolean zzpr;

    public GoogleAnalytics(zzf zzf1)
    {
        super(zzf1);
        zzKv = new HashSet();
    }

    public static GoogleAnalytics getInstance(Context context)
    {
        return zzf.zzX(context).zzis();
    }

    private zzan zzhA()
    {
        return zzhp().zzhA();
    }

    public static void zzhx()
    {
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        if (zzKt == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        for (Iterator iterator = zzKt.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        break MISSING_BLOCK_LABEL_50;
        Exception exception;
        exception;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        throw exception;
        zzKt = null;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
    }

    private com.google.android.gms.analytics.internal.zzb zzhz()
    {
        return zzhp().zzhz();
    }

    public void dispatchLocalHits()
    {
        zzhz().zzhV();
    }

    public void enableAutoActivityReports(Application application)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && !zzKw)
        {
            application.registerActivityLifecycleCallbacks(new zzb());
            zzKw = true;
        }
    }

    public boolean getAppOptOut()
    {
        return zzKy;
    }

    public String getClientId()
    {
        zzx.zzci("getClientId can not be called from the main thread");
        return zzhp().zziv().zzjd();
    }

    public Logger getLogger()
    {
        return zzae.getLogger();
    }

    public boolean isDryRunEnabled()
    {
        return zzKx;
    }

    public boolean isInitialized()
    {
        return zzpr && !zzKu;
    }

    public Tracker newTracker(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Tracker tracker = new Tracker(zzhp(), null, null);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        zzal zzal1 = (zzal)(new zzak(zzhp())).zzac(i);
        if (zzal1 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        tracker.zza(zzal1);
        tracker.zza();
        this;
        JVM INSTR monitorexit ;
        return tracker;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Tracker newTracker(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = new Tracker(zzhp(), s, null);
        s.zza();
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void reportActivityStart(Activity activity)
    {
        if (!zzKw)
        {
            zzm(activity);
        }
    }

    public void reportActivityStop(Activity activity)
    {
        if (!zzKw)
        {
            zzn(activity);
        }
    }

    public void setAppOptOut(boolean flag)
    {
        zzKy = flag;
        if (zzKy)
        {
            zzhz().zzhU();
        }
    }

    public void setDryRun(boolean flag)
    {
        zzKx = flag;
    }

    public void setLocalDispatchPeriod(int i)
    {
        zzhz().setLocalDispatchPeriod(i);
    }

    public void setLogger(Logger logger)
    {
        zzae.setLogger(logger);
        if (!zzKz)
        {
            Log.i((String)zzy.zzNa.get(), (new StringBuilder()).append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append((String)zzy.zzNa.get()).append(" DEBUG").toString());
            zzKz = true;
        }
    }

    public void zza()
    {
        zzhw();
        zzpr = true;
    }

    void zza(zza zza1)
    {
        zzKv.add(zza1);
        zza1 = zzhp().getContext();
        if (zza1 instanceof Application)
        {
            enableAutoActivityReports((Application)zza1);
        }
    }

    void zzb(zza zza1)
    {
        zzKv.remove(zza1);
    }

    void zzhw()
    {
        zzan zzan1 = zzhA();
        if (zzan1.zzkc())
        {
            getLogger().setLogLevel(zzan1.getLogLevel());
        }
        if (zzan1.zzkg())
        {
            setDryRun(zzan1.zzkh());
        }
        if (zzan1.zzkc())
        {
            Logger logger = zzae.getLogger();
            if (logger != null)
            {
                logger.setLogLevel(zzan1.getLogLevel());
            }
        }
    }

    void zzhy()
    {
        zzhz().zzhW();
    }

    void zzm(Activity activity)
    {
        for (Iterator iterator = zzKv.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzo(activity)) { }
    }

    void zzn(Activity activity)
    {
        for (Iterator iterator = zzKv.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzp(activity)) { }
    }

}
