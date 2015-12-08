// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.analytics.internal.zzw;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsService

class zzIj
    implements Runnable
{

    final Ih zzIj;

    public void run()
    {
label0:
        {
            if (zzIj.Ii.stopSelfResult(zzIj.If))
            {
                if (!zzIj.Ig.zzhR().zziW())
                {
                    break label0;
                }
                zzIj.Ih.zzaT("Device AnalyticsService processed last dispatch request");
            }
            return;
        }
        zzIj.Ih.zzaT("Local AnalyticsService processed last dispatch request");
    }

    Ih(Ih ih)
    {
        zzIj = ih;
        super();
    }

    // Unreferenced inner class com/google/android/gms/analytics/AnalyticsService$1

/* anonymous class */
    class AnalyticsService._cls1
        implements zzw
    {

        final int zzIf;
        final zzf zzIg;
        final zzaf zzIh;
        final AnalyticsService zzIi;

        public void zzc(Throwable throwable)
        {
            AnalyticsService.zza(zzIi).post(new AnalyticsService._cls1._cls1(this));
        }

            
            {
                zzIi = analyticsservice;
                zzIf = i;
                zzIg = zzf1;
                zzIh = zzaf1;
                super();
            }
    }

}
