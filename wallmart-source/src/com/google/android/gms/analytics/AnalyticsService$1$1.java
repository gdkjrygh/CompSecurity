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

class zzKj
    implements Runnable
{

    final Kh zzKj;

    public void run()
    {
label0:
        {
            if (zzKj.Ki.stopSelfResult(zzKj.Kf))
            {
                if (!zzKj.Kg.zzif().zzjk())
                {
                    break label0;
                }
                zzKj.Kh.zzaY("Device AnalyticsService processed last dispatch request");
            }
            return;
        }
        zzKj.Kh.zzaY("Local AnalyticsService processed last dispatch request");
    }

    Kh(Kh kh)
    {
        zzKj = kh;
        super();
    }

    // Unreferenced inner class com/google/android/gms/analytics/AnalyticsService$1

/* anonymous class */
    class AnalyticsService._cls1
        implements zzw
    {

        final int zzKf;
        final zzf zzKg;
        final zzaf zzKh;
        final AnalyticsService zzKi;

        public void zzc(Throwable throwable)
        {
            AnalyticsService.zza(zzKi).post(new AnalyticsService._cls1._cls1(this));
        }

            
            {
                zzKi = analyticsservice;
                zzKf = i;
                zzKg = zzf1;
                zzKh = zzaf1;
                super();
            }
    }

}
