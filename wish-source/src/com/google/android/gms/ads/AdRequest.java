// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzt;
import java.util.Date;

public final class AdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.ads.internal.client.zzt.zza zzlZ = new com.google.android.gms.ads.internal.client.zzt.zza();

        static com.google.android.gms.ads.internal.client.zzt.zza zza(Builder builder)
        {
            return builder.zzlZ;
        }

        public Builder addKeyword(String s)
        {
            zzlZ.zzt(s);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            zzlZ.zza(class1, bundle);
            if (class1.equals(com/google/ads/mediation/admob/AdMobAdapter) && bundle.getBoolean("_emulatorLiveAds"))
            {
                zzlZ.zzv(AdRequest.DEVICE_ID_EMULATOR);
            }
            return this;
        }

        public Builder addTestDevice(String s)
        {
            zzlZ.zzu(s);
            return this;
        }

        public AdRequest build()
        {
            return new AdRequest(this);
        }

        public Builder setBirthday(Date date)
        {
            zzlZ.zza(date);
            return this;
        }

        public Builder setGender(int i)
        {
            zzlZ.zzi(i);
            return this;
        }

        public Builder setLocation(Location location)
        {
            zzlZ.zza(location);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            zzlZ.zzl(flag);
            return this;
        }

        public Builder()
        {
            zzlZ.zzu(AdRequest.DEVICE_ID_EMULATOR);
        }
    }


    public static final String DEVICE_ID_EMULATOR;
    private final zzt zzlY;

    private AdRequest(Builder builder)
    {
        zzlY = new zzt(Builder.zza(builder));
    }


    zzt zzac()
    {
        return zzlY;
    }

    static 
    {
        DEVICE_ID_EMULATOR = zzt.DEVICE_ID_EMULATOR;
    }
}
