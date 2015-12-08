// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

public class CampaignTrackingReceiver extends BroadcastReceiver
{

    static android.os.PowerManager.WakeLock zzIc;
    static Boolean zzId;
    static Object zzoW = new Object();

    public CampaignTrackingReceiver()
    {
    }

    public static boolean zzT(Context context)
    {
        zzu.zzu(context);
        if (zzId != null)
        {
            return zzId.booleanValue();
        } else
        {
            boolean flag = zzam.zza(context, com/google/android/gms/analytics/CampaignTrackingReceiver, true);
            zzId = Boolean.valueOf(flag);
            return flag;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        zzaf zzaf1;
        Object obj;
        boolean flag;
        obj = zzf.zzV(context);
        zzaf1 = ((zzf) (obj)).zzhQ();
        String s = intent.getStringExtra("referrer");
        intent = intent.getAction();
        zzaf1.zza("CampaignTrackingReceiver received", intent);
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent) || TextUtils.isEmpty(s))
        {
            zzaf1.zzaW("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        flag = CampaignTrackingService.zzU(context);
        if (!flag)
        {
            zzaf1.zzaW("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzaL(s);
        if (((zzf) (obj)).zzhR().zziW())
        {
            zzaf1.zzaX("Received unexpected installation campaign on package side");
            return;
        }
        intent = zzhf();
        zzu.zzu(intent);
        obj = new Intent(context, intent);
        ((Intent) (obj)).putExtra("referrer", s);
        intent = ((Intent) (zzoW));
        intent;
        JVM INSTR monitorenter ;
        context.startService(((Intent) (obj)));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        intent;
        JVM INSTR monitorexit ;
        throw context;
        context = (PowerManager)context.getSystemService("power");
        if (zzIc == null)
        {
            zzIc = context.newWakeLock(1, "Analytics campaign WakeLock");
            zzIc.setReferenceCounted(false);
        }
        zzIc.acquire(1000L);
_L1:
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        zzaf1.zzaW("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          goto _L1
    }

    protected void zzaL(String s)
    {
    }

    protected Class zzhf()
    {
        return com/google/android/gms/analytics/CampaignTrackingService;
    }

}
