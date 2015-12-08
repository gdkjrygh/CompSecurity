// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqd;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsService

public final class AnalyticsReceiver extends BroadcastReceiver
{

    static zzqd zzKc;
    static Boolean zzKd;
    static Object zzpm = new Object();

    public AnalyticsReceiver()
    {
    }

    public static boolean zzV(Context context)
    {
        zzx.zzv(context);
        if (zzKd != null)
        {
            return zzKd.booleanValue();
        } else
        {
            boolean flag = zzam.zza(context, com/google/android/gms/analytics/AnalyticsReceiver, false);
            zzKd = Boolean.valueOf(flag);
            return flag;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        zzaf zzaf1;
        Object obj = zzf.zzX(context);
        zzaf1 = ((zzf) (obj)).zzie();
        intent = intent.getAction();
        boolean flag;
        if (((zzf) (obj)).zzif().zzjk())
        {
            zzaf1.zza("Device AnalyticsReceiver got", intent);
        } else
        {
            zzaf1.zza("Local AnalyticsReceiver got", intent);
        }
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent)) goto _L2; else goto _L1
_L1:
        flag = AnalyticsService.zzW(context);
        obj = new Intent(context, com/google/android/gms/analytics/AnalyticsService);
        ((Intent) (obj)).setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent = ((Intent) (zzpm));
        intent;
        JVM INSTR monitorenter ;
        context.startService(((Intent) (obj)));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        intent;
        JVM INSTR monitorexit ;
_L2:
        return;
        if (zzKc == null)
        {
            zzKc = new zzqd(context, 1, "Analytics WakeLock");
            zzKc.setReferenceCounted(false);
        }
        zzKc.acquire(1000L);
_L3:
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        intent;
        JVM INSTR monitorexit ;
        throw context;
        context;
        zzaf1.zzbb("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          goto _L3
    }

}
