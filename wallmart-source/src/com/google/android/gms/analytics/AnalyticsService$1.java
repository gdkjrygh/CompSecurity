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

class zzKh
    implements zzw
{

    final int zzKf;
    final zzf zzKg;
    final zzaf zzKh;
    final AnalyticsService zzKi;

    public void zzc(Throwable throwable)
    {
        AnalyticsService.zza(zzKi).post(new Runnable() {

            final AnalyticsService._cls1 zzKj;

            public void run()
            {
label0:
                {
                    if (zzKj.zzKi.stopSelfResult(zzKj.zzKf))
                    {
                        if (!zzKj.zzKg.zzif().zzjk())
                        {
                            break label0;
                        }
                        zzKj.zzKh.zzaY("Device AnalyticsService processed last dispatch request");
                    }
                    return;
                }
                zzKj.zzKh.zzaY("Local AnalyticsService processed last dispatch request");
            }

            
            {
                zzKj = AnalyticsService._cls1.this;
                super();
            }
        });
    }

    _cls1.zzKj(AnalyticsService analyticsservice, int i, zzf zzf, zzaf zzaf)
    {
        zzKi = analyticsservice;
        zzKf = i;
        zzKg = zzf;
        zzKh = zzaf;
        super();
    }
}
