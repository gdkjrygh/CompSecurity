// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

// Referenced classes of package com.google.ads.mediation:
//            AbstractAdViewAdapter

static final class zzaQ extends AdListener
    implements zza
{

    final AbstractAdViewAdapter zzaP;
    final MediationBannerListener zzaQ;

    public void onAdClicked()
    {
        zzaQ.onAdClicked(zzaP);
    }

    public void onAdClosed()
    {
        zzaQ.onAdClosed(zzaP);
    }

    public void onAdFailedToLoad(int i)
    {
        zzaQ.onAdFailedToLoad(zzaP, i);
    }

    public void onAdLeftApplication()
    {
        zzaQ.onAdLeftApplication(zzaP);
    }

    public void onAdLoaded()
    {
        zzaQ.onAdLoaded(zzaP);
    }

    public void onAdOpened()
    {
        zzaQ.onAdOpened(zzaP);
    }

    public rListener(AbstractAdViewAdapter abstractadviewadapter, MediationBannerListener mediationbannerlistener)
    {
        zzaP = abstractadviewadapter;
        zzaQ = mediationbannerlistener;
    }
}
