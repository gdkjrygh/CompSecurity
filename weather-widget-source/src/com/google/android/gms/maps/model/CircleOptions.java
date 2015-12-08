// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzb, LatLng

public final class CircleOptions
    implements SafeParcelable
{

    public static final zzb CREATOR = new zzb();
    private final int mVersionCode;
    private LatLng zzaGU;
    private double zzaGV;
    private float zzaGW;
    private int zzaGX;
    private int zzaGY;
    private float zzaGZ;
    private boolean zzaHa;

    public CircleOptions()
    {
        zzaGU = null;
        zzaGV = 0.0D;
        zzaGW = 10F;
        zzaGX = 0xff000000;
        zzaGY = 0;
        zzaGZ = 0.0F;
        zzaHa = true;
        mVersionCode = 1;
    }

    CircleOptions(int i, LatLng latlng, double d, float f, int j, int k, 
            float f1, boolean flag)
    {
        zzaGU = null;
        zzaGV = 0.0D;
        zzaGW = 10F;
        zzaGX = 0xff000000;
        zzaGY = 0;
        zzaGZ = 0.0F;
        zzaHa = true;
        mVersionCode = i;
        zzaGU = latlng;
        zzaGV = d;
        zzaGW = f;
        zzaGX = j;
        zzaGY = k;
        zzaGZ = f1;
        zzaHa = flag;
    }

    public CircleOptions center(LatLng latlng)
    {
        zzaGU = latlng;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CircleOptions fillColor(int i)
    {
        zzaGY = i;
        return this;
    }

    public LatLng getCenter()
    {
        return zzaGU;
    }

    public int getFillColor()
    {
        return zzaGY;
    }

    public double getRadius()
    {
        return zzaGV;
    }

    public int getStrokeColor()
    {
        return zzaGX;
    }

    public float getStrokeWidth()
    {
        return zzaGW;
    }

    int getVersionCode()
    {
        return mVersionCode;
    }

    public float getZIndex()
    {
        return zzaGZ;
    }

    public boolean isVisible()
    {
        return zzaHa;
    }

    public CircleOptions radius(double d)
    {
        zzaGV = d;
        return this;
    }

    public CircleOptions strokeColor(int i)
    {
        zzaGX = i;
        return this;
    }

    public CircleOptions strokeWidth(float f)
    {
        zzaGW = f;
        return this;
    }

    public CircleOptions visible(boolean flag)
    {
        zzaHa = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public CircleOptions zIndex(float f)
    {
        zzaGZ = f;
        return this;
    }

}
