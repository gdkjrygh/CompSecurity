// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.zzaf;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

class zzKh
    implements Runnable
{

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

    (CampaignTrackingService campaigntrackingservice, int i, zzaf zzaf1)
    {
        zzKo = campaigntrackingservice;
        zzKf = i;
        zzKh = zzaf1;
        super();
    }
}
