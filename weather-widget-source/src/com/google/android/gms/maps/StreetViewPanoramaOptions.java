// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//            zzb

public final class StreetViewPanoramaOptions
    implements SafeParcelable
{

    public static final zzb CREATOR = new zzb();
    private final int mVersionCode;
    private Boolean zzaFJ;
    private Boolean zzaFP;
    private Boolean zzaGA;
    private Boolean zzaGB;
    private StreetViewPanoramaCamera zzaGv;
    private String zzaGw;
    private LatLng zzaGx;
    private Integer zzaGy;
    private Boolean zzaGz;

    public StreetViewPanoramaOptions()
    {
        zzaGz = Boolean.valueOf(true);
        zzaFP = Boolean.valueOf(true);
        zzaGA = Boolean.valueOf(true);
        zzaGB = Boolean.valueOf(true);
        mVersionCode = 1;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetviewpanoramacamera, String s, LatLng latlng, Integer integer, byte byte0, byte byte1, 
            byte byte2, byte byte3, byte byte4)
    {
        zzaGz = Boolean.valueOf(true);
        zzaFP = Boolean.valueOf(true);
        zzaGA = Boolean.valueOf(true);
        zzaGB = Boolean.valueOf(true);
        mVersionCode = i;
        zzaGv = streetviewpanoramacamera;
        zzaGx = latlng;
        zzaGy = integer;
        zzaGw = s;
        zzaGz = zza.zza(byte0);
        zzaFP = zza.zza(byte1);
        zzaGA = zza.zza(byte2);
        zzaGB = zza.zza(byte3);
        zzaFJ = zza.zza(byte4);
    }

    public int describeContents()
    {
        return 0;
    }

    public Boolean getPanningGesturesEnabled()
    {
        return zzaGA;
    }

    public String getPanoramaId()
    {
        return zzaGw;
    }

    public LatLng getPosition()
    {
        return zzaGx;
    }

    public Integer getRadius()
    {
        return zzaGy;
    }

    public Boolean getStreetNamesEnabled()
    {
        return zzaGB;
    }

    public StreetViewPanoramaCamera getStreetViewPanoramaCamera()
    {
        return zzaGv;
    }

    public Boolean getUseViewLifecycleInFragment()
    {
        return zzaFJ;
    }

    public Boolean getUserNavigationEnabled()
    {
        return zzaGz;
    }

    int getVersionCode()
    {
        return mVersionCode;
    }

    public Boolean getZoomGesturesEnabled()
    {
        return zzaFP;
    }

    public StreetViewPanoramaOptions panningGesturesEnabled(boolean flag)
    {
        zzaGA = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetviewpanoramacamera)
    {
        zzaGv = streetviewpanoramacamera;
        return this;
    }

    public StreetViewPanoramaOptions panoramaId(String s)
    {
        zzaGw = s;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latlng)
    {
        zzaGx = latlng;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latlng, Integer integer)
    {
        zzaGx = latlng;
        zzaGy = integer;
        return this;
    }

    public StreetViewPanoramaOptions streetNamesEnabled(boolean flag)
    {
        zzaGB = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean flag)
    {
        zzaFJ = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions userNavigationEnabled(boolean flag)
    {
        zzaGz = Boolean.valueOf(flag);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.maps.zzb.zza(this, parcel, i);
    }

    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean flag)
    {
        zzaFP = Boolean.valueOf(flag);
        return this;
    }

    byte zzwF()
    {
        return zza.zze(zzaFJ);
    }

    byte zzwJ()
    {
        return zza.zze(zzaFP);
    }

    byte zzwT()
    {
        return zza.zze(zzaGz);
    }

    byte zzwU()
    {
        return zza.zze(zzaGA);
    }

    byte zzwV()
    {
        return zza.zze(zzaGB);
    }

}
