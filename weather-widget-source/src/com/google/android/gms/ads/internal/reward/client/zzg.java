// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            zze, zza

public class zzg extends zzd.zza
{

    private final RewardedVideoAdListener zzGm;

    public zzg(RewardedVideoAdListener rewardedvideoadlistener)
    {
        zzGm = rewardedvideoadlistener;
    }

    public void onRewardedVideoAdClosed()
    {
        if (zzGm != null)
        {
            zzGm.onRewardedVideoAdClosed();
        }
    }

    public void onRewardedVideoAdFailedToLoad(int i)
    {
        if (zzGm != null)
        {
            zzGm.onRewardedVideoAdFailedToLoad(i);
        }
    }

    public void onRewardedVideoAdLeftApplication()
    {
        if (zzGm != null)
        {
            zzGm.onRewardedVideoAdLeftApplication();
        }
    }

    public void onRewardedVideoAdLoaded()
    {
        if (zzGm != null)
        {
            zzGm.onRewardedVideoAdLoaded();
        }
    }

    public void onRewardedVideoAdOpened()
    {
        if (zzGm != null)
        {
            zzGm.onRewardedVideoAdOpened();
        }
    }

    public void onRewardedVideoStarted()
    {
        if (zzGm != null)
        {
            zzGm.onRewardedVideoStarted();
        }
    }

    public void zza(zza zza1)
    {
        if (zzGm != null)
        {
            zzGm.onRewarded(new zze(zza1));
        }
    }
}
