// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzq;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsReceiver

public final class AnalyticsService extends Service
{

    private static Boolean zzEf;
    private final Handler mHandler = new Handler();

    public AnalyticsService()
    {
    }

    public static boolean zzI(Context context)
    {
        zzv.zzr(context);
        if (zzEf != null)
        {
            return zzEf.booleanValue();
        } else
        {
            boolean flag = zzal.zza(context, com/google/android/gms/analytics/AnalyticsService);
            zzEf = Boolean.valueOf(flag);
            return flag;
        }
    }

    static Handler zza(AnalyticsService analyticsservice)
    {
        return analyticsservice.mHandler;
    }

    private void zzfQ()
    {
        Object obj = AnalyticsReceiver.zznu;
        obj;
        JVM INSTR monitorenter ;
        android.os.PowerManager.WakeLock wakelock = AnalyticsReceiver.zzEd;
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
        zze zze1 = zze.zzJ(this);
        zzae zzae1 = zze1.zzgH();
        if (zze1.zzgI().zzhO())
        {
            zzae1.zzaF("Device AnalyticsService is starting up");
            return;
        } else
        {
            zzae1.zzaF("Local AnalyticsService is starting up");
            return;
        }
    }

    public void onDestroy()
    {
        zze zze1 = zze.zzJ(this);
        zzae zzae1 = zze1.zzgH();
        if (zze1.zzgI().zzhO())
        {
            zzae1.zzaF("Device AnalyticsService is shutting down");
        } else
        {
            zzae1.zzaF("Local AnalyticsService is shutting down");
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        zzfQ();
        zze zze1 = zze.zzJ(this);
        zzae zzae1 = zze1.zzgH();
        intent = intent.getAction();
        if (zze1.zzgI().zzhO())
        {
            zzae1.zza("Device AnalyticsService called. startId, action", Integer.valueOf(j), intent);
        } else
        {
            zzae1.zza("Local AnalyticsService called. startId, action", Integer.valueOf(j), intent);
        }
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent))
        {
            zze1.zzfZ().zza(new com.google.android.gms.analytics.internal.zzv(j, zze1, zzae1) {

                final int zzEg;
                final zze zzEh;
                final zzae zzEi;
                final AnalyticsService zzEj;

                public void zzc(Throwable throwable)
                {
                    AnalyticsService.zza(zzEj).post(new Runnable(this) {

                        final _cls1 zzEk;

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
                zzEk = _pcls1;
                super();
            }
                    });
                }

            
            {
                zzEj = AnalyticsService.this;
                zzEg = i;
                zzEh = zze1;
                zzEi = zzae1;
                super();
            }
            });
        }
        return 2;
    }
}
