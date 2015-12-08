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

        private int zzJN;
        private int zzJO;
        private int zzJP;
        private int zzJQ;
        private int zzJR;
        private int zzJS;
        private int zzJT;
        private String zzJU;
        private int zzJV;
        private String zzJW;
        private int zzJX;
        private int zzJY;
        private String zzJZ;
        private final com.google.android.gms.ads.internal.client.zzx.zza zznO = new com.google.android.gms.ads.internal.client.zzx.zza();
        private int zzvF;

        static int zza(Builder builder)
        {
            return builder.zzJN;
        }

        static int zzb(Builder builder)
        {
            return builder.zzvF;
        }

        static int zzc(Builder builder)
        {
            return builder.zzJO;
        }

        static int zzd(Builder builder)
        {
            return builder.zzJP;
        }

        static int zze(Builder builder)
        {
            return builder.zzJQ;
        }

        static int zzf(Builder builder)
        {
            return builder.zzJR;
        }

        static int zzg(Builder builder)
        {
            return builder.zzJS;
        }

        static int zzh(Builder builder)
        {
            return builder.zzJT;
        }

        static String zzi(Builder builder)
        {
            return builder.zzJU;
        }

        static int zzj(Builder builder)
        {
            return builder.zzJV;
        }

        static String zzk(Builder builder)
        {
            return builder.zzJW;
        }

        static int zzl(Builder builder)
        {
            return builder.zzJX;
        }

        static int zzm(Builder builder)
        {
            return builder.zzJY;
        }

        static String zzn(Builder builder)
        {
            return builder.zzJZ;
        }

        static com.google.android.gms.ads.internal.client.zzx.zza zzo(Builder builder)
        {
            return builder.zznO;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            zznO.zzb(class1, bundle);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkextras)
        {
            zznO.zza(networkextras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            zznO.zza(class1, bundle);
            return this;
        }

        public Builder addTestDevice(String s)
        {
            zznO.zzG(s);
            return this;
        }

        public SearchAdRequest build()
        {
            return new SearchAdRequest(this);
        }

        public Builder setAnchorTextColor(int i)
        {
            zzJN = i;
            return this;
        }

        public Builder setBackgroundColor(int i)
        {
            zzvF = i;
            zzJO = Color.argb(0, 0, 0, 0);
            zzJP = Color.argb(0, 0, 0, 0);
            return this;
        }

        public Builder setBackgroundGradient(int i, int j)
        {
            zzvF = Color.argb(0, 0, 0, 0);
            zzJO = j;
            zzJP = i;
            return this;
        }

        public Builder setBorderColor(int i)
        {
            zzJQ = i;
            return this;
        }

        public Builder setBorderThickness(int i)
        {
            zzJR = i;
            return this;
        }

        public Builder setBorderType(int i)
        {
            zzJS = i;
            return this;
        }

        public Builder setCallButtonColor(int i)
        {
            zzJT = i;
            return this;
        }

        public Builder setCustomChannels(String s)
        {
            zzJU = s;
            return this;
        }

        public Builder setDescriptionTextColor(int i)
        {
            zzJV = i;
            return this;
        }

        public Builder setFontFace(String s)
        {
            zzJW = s;
            return this;
        }

        public Builder setHeaderTextColor(int i)
        {
            zzJX = i;
            return this;
        }

        public Builder setHeaderTextSize(int i)
        {
            zzJY = i;
            return this;
        }

        public Builder setLocation(Location location)
        {
            zznO.zza(location);
            return this;
        }

        public Builder setQuery(String s)
        {
            zzJZ = s;
            return this;
        }

        public Builder setRequestAgent(String s)
        {
            zznO.zzK(s);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            zznO.zzj(flag);
            return this;
        }

        public Builder()
        {
            zzJS = 0;
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
    private final int zzJN;
    private final int zzJO;
    private final int zzJP;
    private final int zzJQ;
    private final int zzJR;
    private final int zzJS;
    private final int zzJT;
    private final String zzJU;
    private final int zzJV;
    private final String zzJW;
    private final int zzJX;
    private final int zzJY;
    private final String zzJZ;
    private final zzx zznN;
    private final int zzvF;

    private SearchAdRequest(Builder builder)
    {
        zzJN = Builder.zza(builder);
        zzvF = Builder.zzb(builder);
        zzJO = Builder.zzc(builder);
        zzJP = Builder.zzd(builder);
        zzJQ = Builder.zze(builder);
        zzJR = Builder.zzf(builder);
        zzJS = Builder.zzg(builder);
        zzJT = Builder.zzh(builder);
        zzJU = Builder.zzi(builder);
        zzJV = Builder.zzj(builder);
        zzJW = Builder.zzk(builder);
        zzJX = Builder.zzl(builder);
        zzJY = Builder.zzm(builder);
        zzJZ = Builder.zzn(builder);
        zznN = new zzx(Builder.zzo(builder), this);
    }


    public int getAnchorTextColor()
    {
        return zzJN;
    }

    public int getBackgroundColor()
    {
        return zzvF;
    }

    public int getBackgroundGradientBottom()
    {
        return zzJO;
    }

    public int getBackgroundGradientTop()
    {
        return zzJP;
    }

    public int getBorderColor()
    {
        return zzJQ;
    }

    public int getBorderThickness()
    {
        return zzJR;
    }

    public int getBorderType()
    {
        return zzJS;
    }

    public int getCallButtonColor()
    {
        return zzJT;
    }

    public String getCustomChannels()
    {
        return zzJU;
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return zznN.getCustomEventExtrasBundle(class1);
    }

    public int getDescriptionTextColor()
    {
        return zzJV;
    }

    public String getFontFace()
    {
        return zzJW;
    }

    public int getHeaderTextColor()
    {
        return zzJX;
    }

    public int getHeaderTextSize()
    {
        return zzJY;
    }

    public Location getLocation()
    {
        return zznN.getLocation();
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return zznN.getNetworkExtras(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return zznN.getNetworkExtrasBundle(class1);
    }

    public String getQuery()
    {
        return zzJZ;
    }

    public boolean isTestDevice(Context context)
    {
        return zznN.isTestDevice(context);
    }

    zzx zzaF()
    {
        return zznN;
    }

    static 
    {
        DEVICE_ID_EMULATOR = zzx.DEVICE_ID_EMULATOR;
    }
}
