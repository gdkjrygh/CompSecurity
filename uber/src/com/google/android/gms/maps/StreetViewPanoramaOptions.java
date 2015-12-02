// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import avf;
import azz;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public final class StreetViewPanoramaOptions
    implements SafeParcelable
{

    public static final azz CREATOR = new azz();
    private final int a;
    private StreetViewPanoramaCamera b;
    private String c;
    private LatLng d;
    private Integer e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;

    public StreetViewPanoramaOptions()
    {
        f = Boolean.valueOf(true);
        g = Boolean.valueOf(true);
        h = Boolean.valueOf(true);
        i = Boolean.valueOf(true);
        a = 1;
    }

    public StreetViewPanoramaOptions(int k, StreetViewPanoramaCamera streetviewpanoramacamera, String s, LatLng latlng, Integer integer, byte byte0, byte byte1, 
            byte byte2, byte byte3, byte byte4)
    {
        f = Boolean.valueOf(true);
        g = Boolean.valueOf(true);
        h = Boolean.valueOf(true);
        i = Boolean.valueOf(true);
        a = k;
        b = streetviewpanoramacamera;
        d = latlng;
        e = integer;
        c = s;
        f = avf.a(byte0);
        g = avf.a(byte1);
        h = avf.a(byte2);
        i = avf.a(byte3);
        j = avf.a(byte4);
    }

    public final int a()
    {
        return a;
    }

    public final byte b()
    {
        return avf.a(f);
    }

    public final byte c()
    {
        return avf.a(g);
    }

    public final byte d()
    {
        return avf.a(h);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final byte e()
    {
        return avf.a(i);
    }

    public final byte f()
    {
        return avf.a(j);
    }

    public final StreetViewPanoramaCamera g()
    {
        return b;
    }

    public final LatLng h()
    {
        return d;
    }

    public final Integer i()
    {
        return e;
    }

    public final String j()
    {
        return c;
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        azz.a(this, parcel, k);
    }

}
