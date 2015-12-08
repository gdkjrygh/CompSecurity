// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaa;
import com.google.android.gms.ads.internal.client.zzab;
import com.google.android.gms.ads.reward.RewardedVideoAd;

public class MobileAds
{
    public static final class Settings
    {

        private final zzab zznR = new zzab();

        public String getTrackingId()
        {
            return zznR.getTrackingId();
        }

        public boolean isGoogleAnalyticsEnabled()
        {
            return zznR.isGoogleAnalyticsEnabled();
        }

        public Settings setGoogleAnalyticsEnabled(boolean flag)
        {
            zznR.zzl(flag);
            return this;
        }

        public Settings setTrackingId(String s)
        {
            zznR.zzN(s);
            return this;
        }

        zzab zzaG()
        {
            return zznR;
        }

        public Settings()
        {
        }
    }


    private MobileAds()
    {
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context)
    {
        return zzaa.zzcP().getRewardedVideoAdInstance(context);
    }

    public static void initialize(Context context, String s)
    {
        initialize(context, s, null);
    }

    public static void initialize(Context context, String s, Settings settings)
    {
        zzaa zzaa1 = zzaa.zzcP();
        if (settings == null)
        {
            settings = null;
        } else
        {
            settings = settings.zzaG();
        }
        zzaa1.zza(context, s, settings);
    }
}
