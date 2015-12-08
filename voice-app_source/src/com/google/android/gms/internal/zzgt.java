// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzgs, zzgr, zzgu

public class zzgt extends com.google.android.gms.ads.internal.reward.mediation.client.zza.zza
{

    private zzgu zzEW;
    private zzgr zzFc;
    private zzgs zzFd;

    public zzgt(zzgs zzgs1)
    {
        zzFd = zzgs1;
    }

    public void zza(zzd zzd, RewardItemParcel rewarditemparcel)
    {
        if (zzFd != null)
        {
            zzFd.zza(rewarditemparcel);
        }
    }

    public void zza(zzgr zzgr1)
    {
        zzFc = zzgr1;
    }

    public void zza(zzgu zzgu1)
    {
        zzEW = zzgu1;
    }

    public void zzb(zzd zzd, int i)
    {
        if (zzFc != null)
        {
            zzFc.zzI(i);
        }
    }

    public void zzc(zzd zzd, int i)
    {
        if (zzEW != null)
        {
            zzEW.zzb(com.google.android.gms.dynamic.zze.zzn(zzd).getClass().getName(), i);
        }
    }

    public void zze(zzd zzd)
    {
        if (zzFc != null)
        {
            zzFc.zzfO();
        }
    }

    public void zzf(zzd zzd)
    {
        if (zzEW != null)
        {
            zzEW.zzap(com.google.android.gms.dynamic.zze.zzn(zzd).getClass().getName());
        }
    }

    public void zzg(zzd zzd)
    {
        if (zzFd != null)
        {
            zzFd.onRewardedVideoAdOpened();
        }
    }

    public void zzh(zzd zzd)
    {
        if (zzFd != null)
        {
            zzFd.onRewardedVideoStarted();
        }
    }

    public void zzi(zzd zzd)
    {
        if (zzFd != null)
        {
            zzFd.onRewardedVideoAdClosed();
        }
    }

    public void zzj(zzd zzd)
    {
        if (zzFd != null)
        {
            zzFd.zzfL();
        }
    }

    public void zzk(zzd zzd)
    {
        if (zzFd != null)
        {
            zzFd.onRewardedVideoAdLeftApplication();
        }
    }
}
