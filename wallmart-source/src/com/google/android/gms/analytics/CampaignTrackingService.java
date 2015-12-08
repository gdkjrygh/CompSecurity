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
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzof;
import com.google.android.gms.internal.zzqd;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingReceiver

public class CampaignTrackingService extends Service
{

    private static Boolean zzKe;
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

    public static boolean zzW(Context context)
    {
        zzx.zzv(context);
        if (zzKe != null)
        {
            return zzKe.booleanValue();
        } else
        {
            boolean flag = zzam.zza(context, com/google/android/gms/analytics/CampaignTrackingService);
            zzKe = Boolean.valueOf(flag);
            return flag;
        }
    }

    private void zzhr()
    {
        Object obj = CampaignTrackingReceiver.zzpm;
        obj;
        JVM INSTR monitorenter ;
        zzqd zzqd1 = CampaignTrackingReceiver.zzKc;
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
        zzf.zzX(this).zzie().zzaY("CampaignTrackingService is starting up");
    }

    public void onDestroy()
    {
        zzf.zzX(this).zzie().zzaY("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        zzhr();
        zzf zzf1 = zzf.zzX(this);
        zzaf zzaf1 = zzf1.zzie();
        Handler handler = null;
        if (zzf1.zzif().zzjk())
        {
            zzaf1.zzbc("Unexpected installation campaign (package side)");
            intent = handler;
        } else
        {
            intent = intent.getStringExtra("referrer");
        }
        handler = getHandler();
        if (TextUtils.isEmpty(intent))
        {
            if (!zzf1.zzif().zzjk())
            {
                zzaf1.zzbb("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            }
            zzf1.zzig().zzf(new Runnable(zzaf1, handler, j) {

                final int zzKf;
                final zzaf zzKh;
                final CampaignTrackingService zzKo;
                final Handler zzt;

                public void run()
                {
                    zzKo.zza(zzKh, zzt, zzKf);
                }

            
            {
                zzKo = CampaignTrackingService.this;
                zzKh = zzaf1;
                zzt = handler;
                zzKf = i;
                super();
            }
            });
            return 2;
        }
        i = zzf1.zzif().zzjo();
        if (intent.length() > i)
        {
            zzaf1.zzc("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(intent.length()), Integer.valueOf(i));
            intent = intent.substring(0, i);
        }
        zzaf1.zza("CampaignTrackingService called. startId, campaign", Integer.valueOf(j), intent);
        zzf1.zzhz().zza(intent, new Runnable(zzaf1, handler, j) {

            final int zzKf;
            final zzaf zzKh;
            final CampaignTrackingService zzKo;
            final Handler zzt;

            public void run()
            {
                zzKo.zza(zzKh, zzt, zzKf);
            }

            
            {
                zzKo = CampaignTrackingService.this;
                zzKh = zzaf1;
                zzt = handler;
                zzKf = i;
                super();
            }
        });
        return 2;
    }

    protected void zza(zzaf zzaf1, Handler handler, int i)
    {
        handler.post(new Runnable(i, zzaf1) {

            final int zzKf;
            final zzaf zzKh;
            final CampaignTrackingService zzKo;

            public void run()
            {
                boolean flag = zzKo.stopSelfResult(zzKf);
                if (flag)
                {
                    zzKh.zza("Install campaign broadcast processed", Boolean.valueOf(flag));
                }
            }

            
            {
                zzKo = CampaignTrackingService.this;
                zzKf = i;
                zzKh = zzaf1;
                super();
            }
        });
    }
}
