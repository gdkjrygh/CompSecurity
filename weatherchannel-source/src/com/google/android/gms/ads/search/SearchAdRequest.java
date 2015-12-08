// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class SearchAdRequest
{

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
    /* block-local class not found */
    class Builder {}

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

    SearchAdRequest(Builder builder, _cls1 _pcls1)
    {
        this(builder);
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
