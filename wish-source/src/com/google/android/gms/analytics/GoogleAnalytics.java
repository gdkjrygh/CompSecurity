// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.analytics.internal.zzad;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzm;
import com.google.android.gms.analytics.internal.zzx;
import com.google.android.gms.common.internal.zzv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            zza, Tracker, Logger

public final class GoogleAnalytics extends zza
{

    private static List zzEw = new ArrayList();
    private boolean zzEA;
    private volatile boolean zzEB;
    private boolean zzEC;
    private boolean zzEx;
    private Set zzEy;
    private boolean zznz;

    public GoogleAnalytics(zze zze1)
    {
        super(zze1);
        zzEy = new HashSet();
    }

    public static GoogleAnalytics getInstance(Context context)
    {
        return zze.zzJ(context).zzgV();
    }

    public static void zzfX()
    {
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        if (zzEw == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        for (Iterator iterator = zzEw.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        break MISSING_BLOCK_LABEL_50;
        Exception exception;
        exception;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        throw exception;
        zzEw = null;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
    }

    private zzb zzfZ()
    {
        return zzfO().zzfZ();
    }

    private zzam zzga()
    {
        return zzfO().zzga();
    }

    public boolean getAppOptOut()
    {
        return zzEB;
    }

    public String getClientId()
    {
        zzv.zzbJ("getClientId can not be called from the main thread");
        return zzfO().zzgY().zzhH();
    }

    public Logger getLogger()
    {
        return zzad.getLogger();
    }

    public boolean isDryRunEnabled()
    {
        return zzEA;
    }

    public boolean isInitialized()
    {
        return zznz && !zzEx;
    }

    public Tracker newTracker(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = new Tracker(zzfO(), s, null);
        s.zzfV();
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void setDryRun(boolean flag)
    {
        zzEA = flag;
    }

    public void setLocalDispatchPeriod(int i)
    {
        zzfZ().setLocalDispatchPeriod(i);
    }

    public void setLogger(Logger logger)
    {
        zzad.setLogger(logger);
        if (!zzEC)
        {
            Log.i((String)zzx.zzHf.get(), (new StringBuilder()).append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append((String)zzx.zzHf.get()).append(" DEBUG").toString());
            zzEC = true;
        }
    }

    public void zzfV()
    {
        zzfW();
        zznz = true;
    }

    void zzfW()
    {
        zzam zzam1 = zzga();
        if (zzam1.zziG())
        {
            getLogger().setLogLevel(zzam1.getLogLevel());
        }
        if (zzam1.zziK())
        {
            setDryRun(zzam1.zziL());
        }
        if (zzam1.zziG())
        {
            Logger logger = zzad.getLogger();
            if (logger != null)
            {
                logger.setLogLevel(zzam1.getLogLevel());
            }
        }
    }

}
