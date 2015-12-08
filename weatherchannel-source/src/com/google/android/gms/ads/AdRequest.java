// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.mediation.NetworkExtras;
import java.util.Date;
import java.util.Set;

public final class AdRequest
{

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
    /* block-local class not found */
    class Builder {}

        zznK = new zzx(Builder.zza(builder));
    }

    AdRequest(Builder builder, _cls1 _pcls1)
    {
        this(builder);
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
