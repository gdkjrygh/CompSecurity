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

class zzEi
    implements zzv
{

    final int zzEg;
    final zze zzEh;
    final zzae zzEi;
    final AnalyticsService zzEj;

    public void zzc(Throwable throwable)
    {
        AnalyticsService.zza(zzEj).post(new Runnable() {

            final AnalyticsService._cls1 zzEk;

            public void run()
            {
label0:
                {
                    if (zzEk.zzEj.stopSelfResult(zzEk.zzEg))
                    {
                        if (!zzEk.zzEh.zzgI().zzhO())
                        {
                            break label0;
                        }
                        zzEk.zzEi.zzaF("Device AnalyticsService processed last dispatch request");
                    }
                    return;
                }
                zzEk.zzEi.zzaF("Local AnalyticsService processed last dispatch request");
            }

            
            {
                zzEk = AnalyticsService._cls1.this;
                super();
            }
        });
    }

    _cls1.zzEk(AnalyticsService analyticsservice, int i, zze zze, zzae zzae)
    {
        zzEj = analyticsservice;
        zzEg = i;
        zzEh = zze;
        zzEi = zzae;
        super();
    }
}
