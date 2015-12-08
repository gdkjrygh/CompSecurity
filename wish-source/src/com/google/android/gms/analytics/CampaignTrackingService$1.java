// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.zzae;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

class zzEg
    implements Runnable
{

    final int zzEg;
    final zzae zzEi;
    final Handler zzEq;
    final CampaignTrackingService zzEr;

    public void run()
    {
        zzEr.zza(zzEi, zzEq, zzEg);
    }

    (CampaignTrackingService campaigntrackingservice, zzae zzae, Handler handler, int i)
    {
        zzEr = campaigntrackingservice;
        zzEi = zzae;
        zzEq = handler;
        zzEg = i;
        super();
    }
}
