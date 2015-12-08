// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class zzer
    implements NativeMediationAdRequest
{

    private final Date zzaT;
    private final Set zzaV;
    private final boolean zzaW;
    private final Location zzaX;
    private final NativeAdOptionsParcel zzoX;
    private final List zzoY;
    private final int zzsW;
    private final int zzyV;

    public zzer(Date date, int i, Set set, Location location, boolean flag, int j, NativeAdOptionsParcel nativeadoptionsparcel, 
            List list)
    {
        zzaT = date;
        zzsW = i;
        zzaV = set;
        zzaX = location;
        zzaW = flag;
        zzyV = j;
        zzoX = nativeadoptionsparcel;
        zzoY = list;
    }

    public Date getBirthday()
    {
        return zzaT;
    }

    public int getGender()
    {
        return zzsW;
    }

    public Set getKeywords()
    {
        return zzaV;
    }

    public Location getLocation()
    {
        return zzaX;
    }

    public NativeAdOptions getNativeAdOptions()
    {
        if (zzoX == null)
        {
            return null;
        } else
        {
            return (new com.google.android.gms.ads.formats.NativeAdOptions.Builder()).setReturnUrlsForImageAssets(zzoX.zzwn).setImageOrientation(zzoX.zzwo).setRequestMultipleImages(zzoX.zzwp).build();
        }
    }

    public boolean isAppInstallAdRequested()
    {
        return zzoY != null && zzoY.contains("2");
    }

    public boolean isContentAdRequested()
    {
        return zzoY != null && zzoY.contains("1");
    }

    public boolean isTesting()
    {
        return zzaW;
    }

    public int taggedForChildDirectedTreatment()
    {
        return zzyV;
    }
}
