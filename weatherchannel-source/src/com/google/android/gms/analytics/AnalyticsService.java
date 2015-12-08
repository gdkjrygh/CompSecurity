// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.analytics.internal.zzw;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsReceiver

public final class AnalyticsService extends Service
{

    private static Boolean zzIe;
    private final Handler mHandler = new Handler();

    public AnalyticsService()
    {
    }

    public static boolean zzU(Context context)
    {
        zzu.zzu(context);
        if (zzIe != null)
        {
            return zzIe.booleanValue();
        } else
        {
            boolean flag = zzam.zza(context, com/google/android/gms/analytics/AnalyticsService);
            zzIe = Boolean.valueOf(flag);
            return flag;
        }
    }

    static Handler zza(AnalyticsService analyticsservice)
    {
        return analyticsservice.mHandler;
    }

    private void zzhd()
    {
        Object obj = AnalyticsReceiver.zzoW;
        obj;
        JVM INSTR monitorenter ;
        android.os.PowerManager.WakeLock wakelock = AnalyticsReceiver.zzIc;
        if (wakelock == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (wakelock.isHeld())
        {
            wakelock.release();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (SecurityException securityexception)
        {
            return;
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        zzf zzf1 = zzf.zzV(this);
        zzaf zzaf1 = zzf1.zzhQ();
        if (zzf1.zzhR().zziW())
        {
            zzaf1.zzaT("Device AnalyticsService is starting up");
            return;
        } else
        {
            zzaf1.zzaT("Local AnalyticsService is starting up");
            return;
        }
    }

    public void onDestroy()
    {
        zzf zzf1 = zzf.zzV(this);
        zzaf zzaf1 = zzf1.zzhQ();
        if (zzf1.zzhR().zziW())
        {
            zzaf1.zzaT("Device AnalyticsService is shutting down");
        } else
        {
            zzaf1.zzaT("Local AnalyticsService is shutting down");
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        zzhd();
        zzf zzf1 = zzf.zzV(this);
        zzaf zzaf1 = zzf1.zzhQ();
        intent = intent.getAction();
        if (zzf1.zzhR().zziW())
        {
            zzaf1.zza("Device AnalyticsService called. startId, action", Integer.valueOf(j), intent);
        } else
        {
            zzaf1.zza("Local AnalyticsService called. startId, action", Integer.valueOf(j), intent);
        }
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent))
        {
            zzf1.zzhl().zza(new zzw(j, zzf1, zzaf1) {

                final int zzIf;
                final zzf zzIg;
                final zzaf zzIh;
                final AnalyticsService zzIi;

                public void zzc(Throwable throwable)
                {
                    AnalyticsService.zza(zzIi).post(new Runnable(this) {

                        final _cls1 zzIj;

                        public void run()
                        {
label0:
                            {
                                if (zzIj.zzIi.stopSelfResult(zzIj.zzIf))
                                {
                                    if (!zzIj.zzIg.zzhR().zziW())
                                    {
                                        break label0;
                                    }
                                    zzIj.zzIh.zzaT("Device AnalyticsService processed last dispatch request");
                                }
                                return;
                            }
                            zzIj.zzIh.zzaT("Local AnalyticsService processed last dispatch request");
                        }

            
            {
                zzIj = _pcls1;
                super();
            }
                    });
                }

            
            {
                zzIi = AnalyticsService.this;
                zzIf = i;
                zzIg = zzf1;
                zzIh = zzaf1;
                super();
            }
            });
        }
        return 2;
    }
}
