// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationBannerListener;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBannerListener, CustomEventAdapter

static final class zzaQ
    implements CustomEventBannerListener
{

    private final CustomEventAdapter zzJJ;
    private final MediationBannerListener zzaQ;

    public void onAdClicked()
    {
        zzb.zzaC("Custom event adapter called onAdClicked.");
        zzaQ.onAdClicked(zzJJ);
    }

    public void onAdClosed()
    {
        zzb.zzaC("Custom event adapter called onAdClosed.");
        zzaQ.onAdClosed(zzJJ);
    }

    public void onAdFailedToLoad(int i)
    {
        zzb.zzaC("Custom event adapter called onAdFailedToLoad.");
        zzaQ.onAdFailedToLoad(zzJJ, i);
    }

    public void onAdLeftApplication()
    {
        zzb.zzaC("Custom event adapter called onAdLeftApplication.");
        zzaQ.onAdLeftApplication(zzJJ);
    }

    public void onAdLoaded(View view)
    {
        zzb.zzaC("Custom event adapter called onAdLoaded.");
        CustomEventAdapter.zza(zzJJ, view);
        zzaQ.onAdLoaded(zzJJ);
    }

    public void onAdOpened()
    {
        zzb.zzaC("Custom event adapter called onAdOpened.");
        zzaQ.onAdOpened(zzJJ);
    }

    public er(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
    {
        zzJJ = customeventadapter;
        zzaQ = mediationbannerlistener;
    }
}
