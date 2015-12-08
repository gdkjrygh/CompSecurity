// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzi, LatLng

public final class PolylineOptions
    implements SafeParcelable
{

    public static final zzi CREATOR = new zzi();
    private int mColor;
    private final int mVersionCode;
    private float zzaGZ;
    private final List zzaHB;
    private boolean zzaHD;
    private boolean zzaHa;
    private float zzaHe;

    public PolylineOptions()
    {
        zzaHe = 10F;
        mColor = 0xff000000;
        zzaGZ = 0.0F;
        zzaHa = true;
        zzaHD = false;
        mVersionCode = 1;
        zzaHB = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int j, float f1, boolean flag, boolean flag1)
    {
        zzaHe = 10F;
        mColor = 0xff000000;
        zzaGZ = 0.0F;
        zzaHa = true;
        zzaHD = false;
        mVersionCode = i;
        zzaHB = list;
        zzaHe = f;
        mColor = j;
        zzaGZ = f1;
        zzaHa = flag;
        zzaHD = flag1;
    }

    public PolylineOptions add(LatLng latlng)
    {
        zzaHB.add(latlng);
        return this;
    }

    public transient PolylineOptions add(LatLng alatlng[])
    {
        zzaHB.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolylineOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); zzaHB.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public PolylineOptions color(int i)
    {
        mColor = i;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public PolylineOptions geodesic(boolean flag)
    {
        zzaHD = flag;
        return this;
    }

    public int getColor()
    {
        return mColor;
    }

    public List getPoints()
    {
        return zzaHB;
    }

    int getVersionCode()
    {
        return mVersionCode;
    }

    public float getWidth()
    {
        return zzaHe;
    }

    public float getZIndex()
    {
        return zzaGZ;
    }

    public boolean isGeodesic()
    {
        return zzaHD;
    }

    public boolean isVisible()
    {
        return zzaHa;
    }

    public PolylineOptions visible(boolean flag)
    {
        zzaHa = flag;
        return this;
    }

    public PolylineOptions width(float f)
    {
        zzaHe = f;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

    public PolylineOptions zIndex(float f)
    {
        zzaGZ = f;
        return this;
    }

}
