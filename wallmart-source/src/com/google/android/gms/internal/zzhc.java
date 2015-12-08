// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzhb, zzha, zzhd

public class zzhc extends com.google.android.gms.ads.internal.reward.mediation.client.zza.zza
{

    private zzhd zzGq;
    private zzha zzGw;
    private zzhb zzGx;

    public zzhc(zzhb zzhb1)
    {
        zzGx = zzhb1;
    }

    public void zza(zzd zzd, RewardItemParcel rewarditemparcel)
    {
        if (zzGx != null)
        {
            zzGx.zza(rewarditemparcel);
        }
    }

    public void zza(zzha zzha1)
    {
        zzGw = zzha1;
    }

    public void zza(zzhd zzhd1)
    {
        zzGq = zzhd1;
    }

    public void zzb(zzd zzd, int i)
    {
        if (zzGw != null)
        {
            zzGw.zzJ(i);
        }
    }

    public void zzc(zzd zzd, int i)
    {
        if (zzGq != null)
        {
            zzGq.zzb(zze.zzp(zzd).getClass().getName(), i);
        }
    }

    public void zzg(zzd zzd)
    {
        if (zzGw != null)
        {
            zzGw.zzfS();
        }
    }

    public void zzh(zzd zzd)
    {
        if (zzGq != null)
        {
            zzGq.zzas(zze.zzp(zzd).getClass().getName());
        }
    }

    public void zzi(zzd zzd)
    {
        if (zzGx != null)
        {
            zzGx.onRewardedVideoAdOpened();
        }
    }

    public void zzj(zzd zzd)
    {
        if (zzGx != null)
        {
            zzGx.onRewardedVideoStarted();
        }
    }

    public void zzk(zzd zzd)
    {
        if (zzGx != null)
        {
            zzGx.onRewardedVideoAdClosed();
        }
    }

    public void zzl(zzd zzd)
    {
        if (zzGx != null)
        {
            zzGx.zzfP();
        }
    }

    public void zzm(zzd zzd)
    {
        if (zzGx != null)
        {
            zzGx.onRewardedVideoAdLeftApplication();
        }
    }
}
