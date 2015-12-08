// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zze;

// Referenced classes of package com.google.android.gms.ads.internal.reward.mediation.client:
//            zza, RewardItemParcel

public class zzb
    implements MediationRewardedVideoAdListener
{

    private final zza zzFj;

    public zzb(zza zza1)
    {
        zzFj = zza1;
    }

    public void onAdClicked(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        zzu.zzbY("onAdClicked must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onAdClicked.");
        try
        {
            zzFj.zzj(zze.zzw(mediationrewardedvideoadadapter));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdClicked.", mediationrewardedvideoadadapter);
        }
    }

    public void onAdClosed(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        zzu.zzbY("onAdClosed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onAdClosed.");
        try
        {
            zzFj.zzi(zze.zzw(mediationrewardedvideoadadapter));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdClosed.", mediationrewardedvideoadadapter);
        }
    }

    public void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter, int i)
    {
        zzu.zzbY("onAdFailedToLoad must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onAdFailedToLoad.");
        try
        {
            zzFj.zzc(zze.zzw(mediationrewardedvideoadadapter), i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdFailedToLoad.", mediationrewardedvideoadadapter);
        }
    }

    public void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        zzu.zzbY("onAdLeftApplication must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onAdLeftApplication.");
        try
        {
            zzFj.zzk(zze.zzw(mediationrewardedvideoadadapter));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdLeftApplication.", mediationrewardedvideoadadapter);
        }
    }

    public void onAdLoaded(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        zzu.zzbY("onAdLoaded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onAdLoaded.");
        try
        {
            zzFj.zzf(zze.zzw(mediationrewardedvideoadadapter));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdLoaded.", mediationrewardedvideoadadapter);
        }
    }

    public void onAdOpened(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        zzu.zzbY("onAdOpened must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onAdOpened.");
        try
        {
            zzFj.zzg(zze.zzw(mediationrewardedvideoadadapter));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdOpened.", mediationrewardedvideoadadapter);
        }
    }

    public void onInitializationFailed(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter, int i)
    {
        zzu.zzbY("onInitializationFailed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onInitializationFailed.");
        try
        {
            zzFj.zzb(zze.zzw(mediationrewardedvideoadadapter), i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onInitializationFailed.", mediationrewardedvideoadadapter);
        }
    }

    public void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        zzu.zzbY("onInitializationSucceeded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onInitializationSucceeded.");
        try
        {
            zzFj.zze(zze.zzw(mediationrewardedvideoadadapter));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onInitializationSucceeded.", mediationrewardedvideoadadapter);
        }
    }

    public void onRewarded(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter, RewardItem rewarditem)
    {
        zzu.zzbY("onRewarded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onRewarded.");
        if (rewarditem != null)
        {
            try
            {
                zzFj.zza(zze.zzw(mediationrewardedvideoadadapter), new RewardItemParcel(rewarditem));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onRewarded.", mediationrewardedvideoadadapter);
            }
            break MISSING_BLOCK_LABEL_72;
        }
        zzFj.zza(zze.zzw(mediationrewardedvideoadadapter), new RewardItemParcel(mediationrewardedvideoadadapter.getClass().getName(), 1));
        return;
    }

    public void onVideoStarted(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        zzu.zzbY("onVideoStarted must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onVideoStarted.");
        try
        {
            zzFj.zzh(zze.zzw(mediationrewardedvideoadadapter));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onVideoStarted.", mediationrewardedvideoadadapter);
        }
    }
}
