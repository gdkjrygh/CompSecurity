// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.ads.mediation:
//            AbstractAdViewAdapter

static final class zzh extends AdListener
    implements zza
{

    final AbstractAdViewAdapter zzf;
    final MediationInterstitialListener zzh;

    public void onAdClicked()
    {
        zzh.onAdClicked(zzf);
    }

    public void onAdClosed()
    {
        zzh.onAdClosed(zzf);
    }

    public void onAdFailedToLoad(int i)
    {
        zzh.onAdFailedToLoad(zzf, i);
    }

    public void onAdLeftApplication()
    {
        zzh.onAdLeftApplication(zzf);
    }

    public void onAdLoaded()
    {
        zzh.onAdLoaded(zzf);
    }

    public void onAdOpened()
    {
        zzh.onAdOpened(zzf);
    }

    public stitialListener(AbstractAdViewAdapter abstractadviewadapter, MediationInterstitialListener mediationinterstitiallistener)
    {
        zzf = abstractadviewadapter;
        zzh = mediationinterstitiallistener;
    }
}
