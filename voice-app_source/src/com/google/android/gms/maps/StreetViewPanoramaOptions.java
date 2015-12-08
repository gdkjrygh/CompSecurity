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
    private final int zzCY;
    private Boolean zzaBJ;
    private Boolean zzaBP;
    private Boolean zzaCA;
    private Boolean zzaCB;
    private StreetViewPanoramaCamera zzaCv;
    private String zzaCw;
    private LatLng zzaCx;
    private Integer zzaCy;
    private Boolean zzaCz;

    public StreetViewPanoramaOptions()
    {
        zzaCz = Boolean.valueOf(true);
        zzaBP = Boolean.valueOf(true);
        zzaCA = Boolean.valueOf(true);
        zzaCB = Boolean.valueOf(true);
        zzCY = 1;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetviewpanoramacamera, String s, LatLng latlng, Integer integer, byte byte0, byte byte1, 
            byte byte2, byte byte3, byte byte4)
    {
        zzaCz = Boolean.valueOf(true);
        zzaBP = Boolean.valueOf(true);
        zzaCA = Boolean.valueOf(true);
        zzaCB = Boolean.valueOf(true);
        zzCY = i;
        zzaCv = streetviewpanoramacamera;
        zzaCx = latlng;
        zzaCy = integer;
        zzaCw = s;
        zzaCz = zza.zza(byte0);
        zzaBP = zza.zza(byte1);
        zzaCA = zza.zza(byte2);
        zzaCB = zza.zza(byte3);
        zzaBJ = zza.zza(byte4);
    }

    public int describeContents()
    {
        return 0;
    }

    public Boolean getPanningGesturesEnabled()
    {
        return zzaCA;
    }

    public String getPanoramaId()
    {
        return zzaCw;
    }

    public LatLng getPosition()
    {
        return zzaCx;
    }

    public Integer getRadius()
    {
        return zzaCy;
    }

    public Boolean getStreetNamesEnabled()
    {
        return zzaCB;
    }

    public StreetViewPanoramaCamera getStreetViewPanoramaCamera()
    {
        return zzaCv;
    }

    public Boolean getUseViewLifecycleInFragment()
    {
        return zzaBJ;
    }

    public Boolean getUserNavigationEnabled()
    {
        return zzaCz;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public Boolean getZoomGesturesEnabled()
    {
        return zzaBP;
    }

    public StreetViewPanoramaOptions panningGesturesEnabled(boolean flag)
    {
        zzaCA = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetviewpanoramacamera)
    {
        zzaCv = streetviewpanoramacamera;
        return this;
    }

    public StreetViewPanoramaOptions panoramaId(String s)
    {
        zzaCw = s;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latlng)
    {
        zzaCx = latlng;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latlng, Integer integer)
    {
        zzaCx = latlng;
        zzaCy = integer;
        return this;
    }

    public StreetViewPanoramaOptions streetNamesEnabled(boolean flag)
    {
        zzaCB = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean flag)
    {
        zzaBJ = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions userNavigationEnabled(boolean flag)
    {
        zzaCz = Boolean.valueOf(flag);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.maps.zzb.zza(this, parcel, i);
    }

    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean flag)
    {
        zzaBP = Boolean.valueOf(flag);
        return this;
    }

    byte zzvA()
    {
        return zza.zze(zzaCB);
    }

    byte zzvk()
    {
        return zza.zze(zzaBJ);
    }

    byte zzvo()
    {
        return zza.zze(zzaBP);
    }

    byte zzvy()
    {
        return zza.zze(zzaCz);
    }

    byte zzvz()
    {
        return zza.zze(zzaCA);
    }

}
