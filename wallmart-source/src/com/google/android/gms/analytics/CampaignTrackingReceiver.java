// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqd;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

public class CampaignTrackingReceiver extends BroadcastReceiver
{

    static zzqd zzKc;
    static Boolean zzKd;
    static Object zzpm = new Object();

    public CampaignTrackingReceiver()
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
            boolean flag = zzam.zza(context, com/google/android/gms/analytics/CampaignTrackingReceiver, true);
            zzKd = Boolean.valueOf(flag);
            return flag;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        zzaf zzaf1;
        Object obj;
        boolean flag;
        obj = zzf.zzX(context);
        zzaf1 = ((zzf) (obj)).zzie();
        String s = intent.getStringExtra("referrer");
        intent = intent.getAction();
        zzaf1.zza("CampaignTrackingReceiver received", intent);
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent) || TextUtils.isEmpty(s))
        {
            zzaf1.zzbb("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        flag = CampaignTrackingService.zzW(context);
        if (!flag)
        {
            zzaf1.zzbb("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzaQ(s);
        if (((zzf) (obj)).zzif().zzjk())
        {
            zzaf1.zzbc("Received unexpected installation campaign on package side");
            return;
        }
        intent = zzht();
        zzx.zzv(intent);
        obj = new Intent(context, intent);
        ((Intent) (obj)).putExtra("referrer", s);
        intent = ((Intent) (zzpm));
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
        if (zzKc == null)
        {
            zzKc = new zzqd(context, 1, "Analytics campaign WakeLock");
            zzKc.setReferenceCounted(false);
        }
        zzKc.acquire(1000L);
_L1:
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        zzaf1.zzbb("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          goto _L1
    }

    protected void zzaQ(String s)
    {
    }

    protected Class zzht()
    {
        return com/google/android/gms/analytics/CampaignTrackingService;
    }

}
