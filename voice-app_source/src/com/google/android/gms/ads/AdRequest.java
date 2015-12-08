// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.zzu;
import java.util.Date;
import java.util.Set;

public final class AdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.ads.internal.client.zzx.zza zznL = new com.google.android.gms.ads.internal.client.zzx.zza();

        static com.google.android.gms.ads.internal.client.zzx.zza zza(Builder builder)
        {
            return builder.zznL;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            zznL.zzb(class1, bundle);
            return this;
        }

        public Builder addKeyword(String s)
        {
            zznL.zzE(s);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkextras)
        {
            zznL.zza(networkextras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            zznL.zza(class1, bundle);
            if (class1.equals(com/google/ads/mediation/admob/AdMobAdapter) && bundle.getBoolean("_emulatorLiveAds"))
            {
                zznL.zzG(AdRequest.DEVICE_ID_EMULATOR);
            }
            return this;
        }

        public Builder addTestDevice(String s)
        {
            zznL.zzF(s);
            return this;
        }

        public AdRequest build()
        {
            return new AdRequest(this);
        }

        public Builder setBirthday(Date date)
        {
            zznL.zza(date);
            return this;
        }

        public Builder setContentUrl(String s)
        {
            zzu.zzb(s, "Content URL must be non-null.");
            zzu.zzh(s, "Content URL must be non-empty.");
            boolean flag;
            if (s.length() <= 512)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
                Integer.valueOf(512), Integer.valueOf(s.length())
            });
            zznL.zzH(s);
            return this;
        }

        public Builder setGender(int i)
        {
            zznL.zzm(i);
            return this;
        }

        public Builder setLocation(Location location)
        {
            zznL.zza(location);
            return this;
        }

        public Builder setRequestAgent(String s)
        {
            zznL.zzJ(s);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            zznL.zzk(flag);
            return this;
        }

        public Builder()
        {
            zznL.zzF(AdRequest.DEVICE_ID_EMULATOR);
        }
    }


    public static final String DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    private final zzx zznK;

    private AdRequest(Builder builder)
    {
        zznK = new zzx(Builder.zza(builder));
    }


    public Date getBirthday()
    {
        return zznK.getBirthday();
    }

    public String getContentUrl()
    {
        return zznK.getContentUrl();
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return zznK.getCustomEventExtrasBundle(class1);
    }

    public int getGender()
    {
        return zznK.getGender();
    }

    public Set getKeywords()
    {
        return zznK.getKeywords();
    }

    public Location getLocation()
    {
        return zznK.getLocation();
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return zznK.getNetworkExtras(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return zznK.getNetworkExtrasBundle(class1);
    }

    public boolean isTestDevice(Context context)
    {
        return zznK.isTestDevice(context);
    }

    public zzx zzaF()
    {
        return zznK;
    }

    static 
    {
        DEVICE_ID_EMULATOR = zzx.DEVICE_ID_EMULATOR;
    }
}
