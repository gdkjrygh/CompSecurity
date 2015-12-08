// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationBannerListener;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBannerListener, CustomEventAdapter

static final class zzaO
    implements CustomEventBannerListener
{

    private final CustomEventAdapter zzHJ;
    private final MediationBannerListener zzaO;

    public void onAdClicked()
    {
        zzb.zzay("Custom event adapter called onAdClicked.");
        zzaO.onAdClicked(zzHJ);
    }

    public void onAdClosed()
    {
        zzb.zzay("Custom event adapter called onAdClosed.");
        zzaO.onAdClosed(zzHJ);
    }

    public void onAdFailedToLoad(int i)
    {
        zzb.zzay("Custom event adapter called onAdFailedToLoad.");
        zzaO.onAdFailedToLoad(zzHJ, i);
    }

    public void onAdLeftApplication()
    {
        zzb.zzay("Custom event adapter called onAdLeftApplication.");
        zzaO.onAdLeftApplication(zzHJ);
    }

    public void onAdLoaded(View view)
    {
        zzb.zzay("Custom event adapter called onAdLoaded.");
        CustomEventAdapter.zza(zzHJ, view);
        zzaO.onAdLoaded(zzHJ);
    }

    public void onAdOpened()
    {
        zzb.zzay("Custom event adapter called onAdOpened.");
        zzaO.onAdOpened(zzHJ);
    }

    public er(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
    {
        zzHJ = customeventadapter;
        zzaO = mediationbannerlistener;
    }
}
