// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.zzae;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

class zzEi
    implements Runnable
{

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

    (CampaignTrackingService campaigntrackingservice, int i, zzae zzae1)
    {
        zzEr = campaigntrackingservice;
        zzEg = i;
        zzEi = zzae1;
        super();
    }
}
