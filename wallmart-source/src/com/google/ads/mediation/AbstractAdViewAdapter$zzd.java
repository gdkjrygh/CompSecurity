// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.ads.mediation:
//            AbstractAdViewAdapter

static final class zzaR extends AdListener
    implements zza
{

    final AbstractAdViewAdapter zzaP;
    final MediationInterstitialListener zzaR;

    public void onAdClicked()
    {
        zzaR.onAdClicked(zzaP);
    }

    public void onAdClosed()
    {
        zzaR.onAdClosed(zzaP);
    }

    public void onAdFailedToLoad(int i)
    {
        zzaR.onAdFailedToLoad(zzaP, i);
    }

    public void onAdLeftApplication()
    {
        zzaR.onAdLeftApplication(zzaP);
    }

    public void onAdLoaded()
    {
        zzaR.onAdLoaded(zzaP);
    }

    public void onAdOpened()
    {
        zzaR.onAdOpened(zzaP);
    }

    public stitialListener(AbstractAdViewAdapter abstractadviewadapter, MediationInterstitialListener mediationinterstitiallistener)
    {
        zzaP = abstractadviewadapter;
        zzaR = mediationinterstitiallistener;
    }
}
