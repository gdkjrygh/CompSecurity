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
//            zzh, LatLng

public final class PolygonOptions
    implements SafeParcelable
{

    public static final zzh CREATOR = new zzh();
    private final int mVersionCode;
    private float zzaGW;
    private int zzaGX;
    private int zzaGY;
    private float zzaGZ;
    private final List zzaHB;
    private final List zzaHC;
    private boolean zzaHD;
    private boolean zzaHa;

    public PolygonOptions()
    {
        zzaGW = 10F;
        zzaGX = 0xff000000;
        zzaGY = 0;
        zzaGZ = 0.0F;
        zzaHa = true;
        zzaHD = false;
        mVersionCode = 1;
        zzaHB = new ArrayList();
        zzaHC = new ArrayList();
    }

    PolygonOptions(int i, List list, List list1, float f, int j, int k, float f1, 
            boolean flag, boolean flag1)
    {
        zzaGW = 10F;
        zzaGX = 0xff000000;
        zzaGY = 0;
        zzaGZ = 0.0F;
        zzaHa = true;
        zzaHD = false;
        mVersionCode = i;
        zzaHB = list;
        zzaHC = list1;
        zzaGW = f;
        zzaGX = j;
        zzaGY = k;
        zzaGZ = f1;
        zzaHa = flag;
        zzaHD = flag1;
    }

    public PolygonOptions add(LatLng latlng)
    {
        zzaHB.add(latlng);
        return this;
    }

    public transient PolygonOptions add(LatLng alatlng[])
    {
        zzaHB.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolygonOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); zzaHB.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public PolygonOptions addHole(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add((LatLng)iterable.next())) { }
        zzaHC.add(arraylist);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public PolygonOptions fillColor(int i)
    {
        zzaGY = i;
        return this;
    }

    public PolygonOptions geodesic(boolean flag)
    {
        zzaHD = flag;
        return this;
    }

    public int getFillColor()
    {
        return zzaGY;
    }

    public List getHoles()
    {
        return zzaHC;
    }

    public List getPoints()
    {
        return zzaHB;
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

    public boolean isGeodesic()
    {
        return zzaHD;
    }

    public boolean isVisible()
    {
        return zzaHa;
    }

    public PolygonOptions strokeColor(int i)
    {
        zzaGX = i;
        return this;
    }

    public PolygonOptions strokeWidth(float f)
    {
        zzaGW = f;
        return this;
    }

    public PolygonOptions visible(boolean flag)
    {
        zzaHa = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public PolygonOptions zIndex(float f)
    {
        zzaGZ = f;
        return this;
    }

    List zzxe()
    {
        return zzaHC;
    }

}
