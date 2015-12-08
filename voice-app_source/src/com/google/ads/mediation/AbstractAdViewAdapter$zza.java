// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

// Referenced classes of package com.google.ads.mediation:
//            AbstractAdViewAdapter

static final class zzaO extends AdListener
    implements zza
{

    final AbstractAdViewAdapter zzaN;
    final MediationBannerListener zzaO;

    public void onAdClicked()
    {
        zzaO.onAdClicked(zzaN);
    }

    public void onAdClosed()
    {
        zzaO.onAdClosed(zzaN);
    }

    public void onAdFailedToLoad(int i)
    {
        zzaO.onAdFailedToLoad(zzaN, i);
    }

    public void onAdLeftApplication()
    {
        zzaO.onAdLeftApplication(zzaN);
    }

    public void onAdLoaded()
    {
        zzaO.onAdLoaded(zzaN);
    }

    public void onAdOpened()
    {
        zzaO.onAdOpened(zzaN);
    }

    public rListener(AbstractAdViewAdapter abstractadviewadapter, MediationBannerListener mediationbannerlistener)
    {
        zzaN = abstractadviewadapter;
        zzaO = mediationbannerlistener;
    }
}
