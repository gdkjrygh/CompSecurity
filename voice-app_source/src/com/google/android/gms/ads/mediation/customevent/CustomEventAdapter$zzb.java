// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventInterstitialListener, CustomEventAdapter

class zzaP
    implements CustomEventInterstitialListener
{

    private final CustomEventAdapter zzHJ;
    final CustomEventAdapter zzHK;
    private final MediationInterstitialListener zzaP;

    public void onAdClicked()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onAdClicked.");
        zzaP.onAdClicked(zzHJ);
    }

    public void onAdClosed()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onAdClosed.");
        zzaP.onAdClosed(zzHJ);
    }

    public void onAdFailedToLoad(int i)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onFailedToReceiveAd.");
        zzaP.onAdFailedToLoad(zzHJ, i);
    }

    public void onAdLeftApplication()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onAdLeftApplication.");
        zzaP.onAdLeftApplication(zzHJ);
    }

    public void onAdLoaded()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onReceivedAd.");
        zzaP.onAdLoaded(zzHK);
    }

    public void onAdOpened()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Custom event adapter called onAdOpened.");
        zzaP.onAdOpened(zzHJ);
    }

    public Listener(CustomEventAdapter customeventadapter, CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
    {
        zzHK = customeventadapter;
        super();
        zzHJ = customeventadapter1;
        zzaP = mediationinterstitiallistener;
    }
}
