// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzq;
import com.google.android.gms.analytics.internal.zzv;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsService

class zzEk
    implements Runnable
{

    final Ei zzEk;

    public void run()
    {
label0:
        {
            if (zzEk.Ej.stopSelfResult(zzEk.Eg))
            {
                if (!zzEk.Eh.zzgI().zzhO())
                {
                    break label0;
                }
                zzEk.Ei.zzaF("Device AnalyticsService processed last dispatch request");
            }
            return;
        }
        zzEk.Ei.zzaF("Local AnalyticsService processed last dispatch request");
    }

    Ei(Ei ei)
    {
        zzEk = ei;
        super();
    }

    // Unreferenced inner class com/google/android/gms/analytics/AnalyticsService$1

/* anonymous class */
    class AnalyticsService._cls1
        implements zzv
    {

        final int zzEg;
        final zze zzEh;
        final zzae zzEi;
        final AnalyticsService zzEj;

        public void zzc(Throwable throwable)
        {
            AnalyticsService.zza(zzEj).post(new AnalyticsService._cls1._cls1(this));
        }

            
            {
                zzEj = analyticsservice;
                zzEg = i;
                zzEh = zze1;
                zzEi = zzae1;
                super();
            }
    }

}
