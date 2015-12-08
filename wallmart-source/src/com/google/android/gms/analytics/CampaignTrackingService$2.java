// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.zzaf;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

class zzKf
    implements Runnable
{

    final int zzKf;
    final zzaf zzKh;
    final CampaignTrackingService zzKo;
    final Handler zzt;

    public void run()
    {
        zzKo.zza(zzKh, zzt, zzKf);
    }

    (CampaignTrackingService campaigntrackingservice, zzaf zzaf, Handler handler, int i)
    {
        zzKo = campaigntrackingservice;
        zzKh = zzaf;
        zzt = handler;
        zzKf = i;
        super();
    }
}
