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
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqd;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsReceiver

public final class AnalyticsService extends Service
{

    private static Boolean zzKe;
    private final Handler mHandler = new Handler();

    public AnalyticsService()
    {
    }

    public static boolean zzW(Context context)
    {
        zzx.zzv(context);
        if (zzKe != null)
        {
            return zzKe.booleanValue();
        } else
        {
            boolean flag = zzam.zza(context, com/google/android/gms/analytics/AnalyticsService);
            zzKe = Boolean.valueOf(flag);
            return flag;
        }
    }

    static Handler zza(AnalyticsService analyticsservice)
    {
        return analyticsservice.mHandler;
    }

    private void zzhr()
    {
        Object obj = AnalyticsReceiver.zzpm;
        obj;
        JVM INSTR monitorenter ;
        zzqd zzqd1 = AnalyticsReceiver.zzKc;
        if (zzqd1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (zzqd1.isHeld())
        {
            zzqd1.release();
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
        zzf zzf1 = zzf.zzX(this);
        zzaf zzaf1 = zzf1.zzie();
        if (zzf1.zzif().zzjk())
        {
            zzaf1.zzaY("Device AnalyticsService is starting up");
            return;
        } else
        {
            zzaf1.zzaY("Local AnalyticsService is starting up");
            return;
        }
    }

    public void onDestroy()
    {
        zzf zzf1 = zzf.zzX(this);
        zzaf zzaf1 = zzf1.zzie();
        if (zzf1.zzif().zzjk())
        {
            zzaf1.zzaY("Device AnalyticsService is shutting down");
        } else
        {
            zzaf1.zzaY("Local AnalyticsService is shutting down");
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        zzhr();
        zzf zzf1 = zzf.zzX(this);
        zzaf zzaf1 = zzf1.zzie();
        intent = intent.getAction();
        if (zzf1.zzif().zzjk())
        {
            zzaf1.zza("Device AnalyticsService called. startId, action", Integer.valueOf(j), intent);
        } else
        {
            zzaf1.zza("Local AnalyticsService called. startId, action", Integer.valueOf(j), intent);
        }
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent))
        {
            zzf1.zzhz().zza(new zzw(j, zzf1, zzaf1) {

                final int zzKf;
                final zzf zzKg;
                final zzaf zzKh;
                final AnalyticsService zzKi;

                public void zzc(Throwable throwable)
                {
                    AnalyticsService.zza(zzKi).post(new Runnable(this) {

                        final _cls1 zzKj;

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
                zzKj = _pcls1;
                super();
            }
                    });
                }

            
            {
                zzKi = AnalyticsService.this;
                zzKf = i;
                zzKg = zzf1;
                zzKh = zzaf1;
                super();
            }
            });
        }
        return 2;
    }
}
