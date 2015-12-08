// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.search;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class SearchAdRequest
{
    public static final class Builder
    {

        private int zzHN;
        private int zzHO;
        private int zzHP;
        private int zzHQ;
        private int zzHR;
        private int zzHS;
        private int zzHT;
        private String zzHU;
        private int zzHV;
        private String zzHW;
        private int zzHX;
        private int zzHY;
        private String zzHZ;
        private final com.google.android.gms.ads.internal.client.zzx.zza zznL = new com.google.android.gms.ads.internal.client.zzx.zza();
        private int zzvc;

        static int zza(Builder builder)
        {
            return builder.zzHN;
        }

        static int zzb(Builder builder)
        {
            return builder.zzvc;
        }

        static int zzc(Builder builder)
        {
            return builder.zzHO;
        }

        static int zzd(Builder builder)
        {
            return builder.zzHP;
        }

        static int zze(Builder builder)
        {
            return builder.zzHQ;
        }

        static int zzf(Builder builder)
        {
            return builder.zzHR;
        }

        static int zzg(Builder builder)
        {
            return builder.zzHS;
        }

        static int zzh(Builder builder)
        {
            return builder.zzHT;
        }

        static String zzi(Builder builder)
        {
            return builder.zzHU;
        }

        static int zzj(Builder builder)
        {
            return builder.zzHV;
        }

        static String zzk(Builder builder)
        {
            return builder.zzHW;
        }

        static int zzl(Builder builder)
        {
            return builder.zzHX;
        }

        static int zzm(Builder builder)
        {
            return builder.zzHY;
        }

        static String zzn(Builder builder)
        {
            return builder.zzHZ;
        }

        static com.google.android.gms.ads.internal.client.zzx.zza zzo(Builder builder)
        {
            return builder.zznL;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            zznL.zzb(class1, bundle);
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
            return this;
        }

        public Builder addTestDevice(String s)
        {
            zznL.zzF(s);
            return this;
        }

        public SearchAdRequest build()
        {
            return new SearchAdRequest(this);
        }

        public Builder setAnchorTextColor(int i)
        {
            zzHN = i;
            return this;
        }

        public Builder setBackgroundColor(int i)
        {
            zzvc = i;
            zzHO = Color.argb(0, 0, 0, 0);
            zzHP = Color.argb(0, 0, 0, 0);
            return this;
        }

        public Builder setBackgroundGradient(int i, int j)
        {
            zzvc = Color.argb(0, 0, 0, 0);
            zzHO = j;
            zzHP = i;
            return this;
        }

        public Builder setBorderColor(int i)
        {
            zzHQ = i;
            return this;
        }

        public Builder setBorderThickness(int i)
        {
            zzHR = i;
            return this;
        }

        public Builder setBorderType(int i)
        {
            zzHS = i;
            return this;
        }

        public Builder setCallButtonColor(int i)
        {
            zzHT = i;
            return this;
        }

        public Builder setCustomChannels(String s)
        {
            zzHU = s;
            return this;
        }

        public Builder setDescriptionTextColor(int i)
        {
            zzHV = i;
            return this;
        }

        public Builder setFontFace(String s)
        {
            zzHW = s;
            return this;
        }

        public Builder setHeaderTextColor(int i)
        {
            zzHX = i;
            return this;
        }

        public Builder setHeaderTextSize(int i)
        {
            zzHY = i;
            return this;
        }

        public Builder setLocation(Location location)
        {
            zznL.zza(location);
            return this;
        }

        public Builder setQuery(String s)
        {
            zzHZ = s;
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
            zzHS = 0;
        }
    }


    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    public static final String DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    private final int zzHN;
    private final int zzHO;
    private final int zzHP;
    private final int zzHQ;
    private final int zzHR;
    private final int zzHS;
    private final int zzHT;
    private final String zzHU;
    private final int zzHV;
    private final String zzHW;
    private final int zzHX;
    private final int zzHY;
    private final String zzHZ;
    private final zzx zznK;
    private final int zzvc;

    private SearchAdRequest(Builder builder)
    {
        zzHN = Builder.zza(builder);
        zzvc = Builder.zzb(builder);
        zzHO = Builder.zzc(builder);
        zzHP = Builder.zzd(builder);
        zzHQ = Builder.zze(builder);
        zzHR = Builder.zzf(builder);
        zzHS = Builder.zzg(builder);
        zzHT = Builder.zzh(builder);
        zzHU = Builder.zzi(builder);
        zzHV = Builder.zzj(builder);
        zzHW = Builder.zzk(builder);
        zzHX = Builder.zzl(builder);
        zzHY = Builder.zzm(builder);
        zzHZ = Builder.zzn(builder);
        zznK = new zzx(Builder.zzo(builder), this);
    }


    public int getAnchorTextColor()
    {
        return zzHN;
    }

    public int getBackgroundColor()
    {
        return zzvc;
    }

    public int getBackgroundGradientBottom()
    {
        return zzHO;
    }

    public int getBackgroundGradientTop()
    {
        return zzHP;
    }

    public int getBorderColor()
    {
        return zzHQ;
    }

    public int getBorderThickness()
    {
        return zzHR;
    }

    public int getBorderType()
    {
        return zzHS;
    }

    public int getCallButtonColor()
    {
        return zzHT;
    }

    public String getCustomChannels()
    {
        return zzHU;
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return zznK.getCustomEventExtrasBundle(class1);
    }

    public int getDescriptionTextColor()
    {
        return zzHV;
    }

    public String getFontFace()
    {
        return zzHW;
    }

    public int getHeaderTextColor()
    {
        return zzHX;
    }

    public int getHeaderTextSize()
    {
        return zzHY;
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

    public String getQuery()
    {
        return zzHZ;
    }

    public boolean isTestDevice(Context context)
    {
        return zznK.isTestDevice(context);
    }

    zzx zzaF()
    {
        return zznK;
    }

    static 
    {
        DEVICE_ID_EMULATOR = zzx.DEVICE_ID_EMULATOR;
    }
}
