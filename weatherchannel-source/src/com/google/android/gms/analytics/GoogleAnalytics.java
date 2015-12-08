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
import com.google.android.gms.common.internal.zzu;
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

        public abstract void zzn(Activity activity);

        public abstract void zzo(Activity activity);
    }

    class zzb
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        final GoogleAnalytics zzIA;

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
            zzIA.zzl(activity);
        }

        public void onActivityStopped(Activity activity)
        {
            zzIA.zzm(activity);
        }

        zzb()
        {
            zzIA = GoogleAnalytics.this;
            super();
        }
    }


    private static List zzIt = new ArrayList();
    private boolean zzIu;
    private Set zzIv;
    private boolean zzIw;
    private boolean zzIx;
    private volatile boolean zzIy;
    private boolean zzIz;
    private boolean zzpb;

    public GoogleAnalytics(zzf zzf1)
    {
        super(zzf1);
        zzIv = new HashSet();
    }

    public static GoogleAnalytics getInstance(Context context)
    {
        return zzf.zzV(context).zzie();
    }

    public static void zzhj()
    {
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        if (zzIt == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        for (Iterator iterator = zzIt.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        break MISSING_BLOCK_LABEL_50;
        Exception exception;
        exception;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        throw exception;
        zzIt = null;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
    }

    private com.google.android.gms.analytics.internal.zzb zzhl()
    {
        return zzhb().zzhl();
    }

    private zzan zzhm()
    {
        return zzhb().zzhm();
    }

    public void dispatchLocalHits()
    {
        zzhl().zzhH();
    }

    public void enableAutoActivityReports(Application application)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && !zzIw)
        {
            application.registerActivityLifecycleCallbacks(new zzb());
            zzIw = true;
        }
    }

    public boolean getAppOptOut()
    {
        return zzIy;
    }

    public String getClientId()
    {
        zzu.zzbZ("getClientId can not be called from the main thread");
        return zzhb().zzih().zziP();
    }

    public Logger getLogger()
    {
        return zzae.getLogger();
    }

    public boolean isDryRunEnabled()
    {
        return zzIx;
    }

    public boolean isInitialized()
    {
        return zzpb && !zzIu;
    }

    public Tracker newTracker(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Tracker tracker = new Tracker(zzhb(), null, null);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        zzal zzal1 = (zzal)(new zzak(zzhb())).zzab(i);
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
        s = new Tracker(zzhb(), s, null);
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
        if (!zzIw)
        {
            zzl(activity);
        }
    }

    public void reportActivityStop(Activity activity)
    {
        if (!zzIw)
        {
            zzm(activity);
        }
    }

    public void setAppOptOut(boolean flag)
    {
        zzIy = flag;
        if (zzIy)
        {
            zzhl().zzhG();
        }
    }

    public void setDryRun(boolean flag)
    {
        zzIx = flag;
    }

    public void setLocalDispatchPeriod(int i)
    {
        zzhl().setLocalDispatchPeriod(i);
    }

    public void setLogger(Logger logger)
    {
        zzae.setLogger(logger);
        if (!zzIz)
        {
            Log.i((String)zzy.zzLb.get(), (new StringBuilder()).append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append((String)zzy.zzLb.get()).append(" DEBUG").toString());
            zzIz = true;
        }
    }

    public void zza()
    {
        zzhi();
        zzpb = true;
    }

    void zza(zza zza1)
    {
        zzIv.add(zza1);
        zza1 = zzhb().getContext();
        if (zza1 instanceof Application)
        {
            enableAutoActivityReports((Application)zza1);
        }
    }

    void zzb(zza zza1)
    {
        zzIv.remove(zza1);
    }

    void zzhi()
    {
        zzan zzan1 = zzhm();
        if (zzan1.zzjO())
        {
            getLogger().setLogLevel(zzan1.getLogLevel());
        }
        if (zzan1.zzjS())
        {
            setDryRun(zzan1.zzjT());
        }
        if (zzan1.zzjO())
        {
            Logger logger = zzae.getLogger();
            if (logger != null)
            {
                logger.setLogLevel(zzan1.getLogLevel());
            }
        }
    }

    void zzhk()
    {
        zzhl().zzhI();
    }

    void zzl(Activity activity)
    {
        for (Iterator iterator = zzIv.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzn(activity)) { }
    }

    void zzm(Activity activity)
    {
        for (Iterator iterator = zzIv.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzo(activity)) { }
    }

}
