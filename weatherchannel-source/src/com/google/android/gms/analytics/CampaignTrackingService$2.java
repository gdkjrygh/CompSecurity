// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.zzaf;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

class zzIf
    implements Runnable
{

    final int zzIf;
    final zzaf zzIh;
    final CampaignTrackingService zzIo;
    final Handler zzt;

    public void run()
    {
        zzIo.zza(zzIh, zzt, zzIf);
    }

    (CampaignTrackingService campaigntrackingservice, zzaf zzaf, Handler handler, int i)
    {
        zzIo = campaigntrackingservice;
        zzIh = zzaf;
        zzt = handler;
        zzIf = i;
        super();
    }
}
