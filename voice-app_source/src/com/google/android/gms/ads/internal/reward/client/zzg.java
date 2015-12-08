// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            zze, zza

public class zzg extends zzd.zza
{

    private final RewardedVideoAdListener zzES;

    public zzg(RewardedVideoAdListener rewardedvideoadlistener)
    {
        zzES = rewardedvideoadlistener;
    }

    public void onRewardedVideoAdClosed()
    {
        if (zzES != null)
        {
            zzES.onRewardedVideoAdClosed();
        }
    }

    public void onRewardedVideoAdFailedToLoad(int i)
    {
        if (zzES != null)
        {
            zzES.onRewardedVideoAdFailedToLoad(i);
        }
    }

    public void onRewardedVideoAdLeftApplication()
    {
        if (zzES != null)
        {
            zzES.onRewardedVideoAdLeftApplication();
        }
    }

    public void onRewardedVideoAdLoaded()
    {
        if (zzES != null)
        {
            zzES.onRewardedVideoAdLoaded();
        }
    }

    public void onRewardedVideoAdOpened()
    {
        if (zzES != null)
        {
            zzES.onRewardedVideoAdOpened();
        }
    }

    public void onRewardedVideoStarted()
    {
        if (zzES != null)
        {
            zzES.onRewardedVideoStarted();
        }
    }

    public void zza(zza zza1)
    {
        if (zzES != null)
        {
            zzES.onRewarded(new zze(zza1));
        }
    }
}
