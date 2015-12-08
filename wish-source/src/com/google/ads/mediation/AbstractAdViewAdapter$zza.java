// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

// Referenced classes of package com.google.ads.mediation:
//            AbstractAdViewAdapter

static final class zzg extends AdListener
    implements zza
{

    final AbstractAdViewAdapter zzf;
    final MediationBannerListener zzg;

    public void onAdClicked()
    {
        zzg.onAdClicked(zzf);
    }

    public void onAdClosed()
    {
        zzg.onAdClosed(zzf);
    }

    public void onAdFailedToLoad(int i)
    {
        zzg.onAdFailedToLoad(zzf, i);
    }

    public void onAdLeftApplication()
    {
        zzg.onAdLeftApplication(zzf);
    }

    public void onAdLoaded()
    {
        zzg.onAdLoaded(zzf);
    }

    public void onAdOpened()
    {
        zzg.onAdOpened(zzf);
    }

    public rListener(AbstractAdViewAdapter abstractadviewadapter, MediationBannerListener mediationbannerlistener)
    {
        zzf = abstractadviewadapter;
        zzg = mediationbannerlistener;
    }
}
