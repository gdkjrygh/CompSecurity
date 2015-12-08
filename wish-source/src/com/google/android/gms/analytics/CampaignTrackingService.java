// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzq;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzkk;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingReceiver

public class CampaignTrackingService extends Service
{

    private static Boolean zzEf;
    private Handler mHandler;

    public CampaignTrackingService()
    {
    }

    private Handler getHandler()
    {
        Handler handler1 = mHandler;
        Handler handler = handler1;
        if (handler1 == null)
        {
            handler = new Handler(getMainLooper());
            mHandler = handler;
        }
        return handler;
    }

    public static boolean zzI(Context context)
    {
        zzv.zzr(context);
        if (zzEf != null)
        {
            return zzEf.booleanValue();
        } else
        {
            boolean flag = zzal.zza(context, com/google/android/gms/analytics/CampaignTrackingService);
            zzEf = Boolean.valueOf(flag);
            return flag;
        }
    }

    private void zzfQ()
    {
        Object obj = CampaignTrackingReceiver.zznu;
        obj;
        JVM INSTR monitorenter ;
        android.os.PowerManager.WakeLock wakelock = CampaignTrackingReceiver.zzEd;
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
        zze.zzJ(this).zzgH().zzaF("CampaignTrackingService is starting up");
    }

    public void onDestroy()
    {
        zze.zzJ(this).zzgH().zzaF("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        zzfQ();
        zze zze1 = zze.zzJ(this);
        zzae zzae1 = zze1.zzgH();
        Handler handler = null;
        if (zze1.zzgI().zzhO())
        {
            zzae1.zzaJ("Unexpected installation campaign (package side)");
            intent = handler;
        } else
        {
            intent = intent.getStringExtra("referrer");
        }
        handler = getHandler();
        if (TextUtils.isEmpty(intent))
        {
            if (!zze1.zzgI().zzhO())
            {
                zzae1.zzaI("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            }
            zze1.zzgJ().zze(new Runnable(zzae1, handler, j) {

                final int zzEg;
                final zzae zzEi;
                final Handler zzEq;
                final CampaignTrackingService zzEr;

                public void run()
                {
                    zzEr.zza(zzEi, zzEq, zzEg);
                }

            
            {
                zzEr = CampaignTrackingService.this;
                zzEi = zzae1;
                zzEq = handler;
                zzEg = i;
                super();
            }
            });
            return 2;
        }
        i = zze1.zzgI().zzhS();
        if (intent.length() > i)
        {
            zzae1.zzc("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(intent.length()), Integer.valueOf(i));
            intent = intent.substring(0, i);
        }
        zzae1.zza("CampaignTrackingService called. startId, campaign", Integer.valueOf(j), intent);
        zze1.zzfZ().zza(intent, new Runnable(zzae1, handler, j) {

            final int zzEg;
            final zzae zzEi;
            final Handler zzEq;
            final CampaignTrackingService zzEr;

            public void run()
            {
                zzEr.zza(zzEi, zzEq, zzEg);
            }

            
            {
                zzEr = CampaignTrackingService.this;
                zzEi = zzae1;
                zzEq = handler;
                zzEg = i;
                super();
            }
        });
        return 2;
    }

    protected void zza(zzae zzae1, Handler handler, int i)
    {
        handler.post(new Runnable(i, zzae1) {

            final int zzEg;
            final zzae zzEi;
            final CampaignTrackingService zzEr;

            public void run()
            {
                boolean flag = zzEr.stopSelfResult(zzEg);
                if (flag)
                {
                    zzEi.zza("Install campaign broadcast processed", Boolean.valueOf(flag));
                }
            }

            
            {
                zzEr = CampaignTrackingService.this;
                zzEg = i;
                zzEi = zzae1;
                super();
            }
        });
    }
}
