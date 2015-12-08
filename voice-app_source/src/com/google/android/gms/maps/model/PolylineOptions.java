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

public final class PolylineOptions
    implements SafeParcelable
{

    public static final zzh CREATOR = new zzh();
    private int mColor;
    private final int zzCY;
    private final List zzaDA;
    private boolean zzaDC;
    private float zzaDa;
    private boolean zzaDb;
    private float zzaDf;

    public PolylineOptions()
    {
        zzaDf = 10F;
        mColor = 0xff000000;
        zzaDa = 0.0F;
        zzaDb = true;
        zzaDC = false;
        zzCY = 1;
        zzaDA = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int j, float f1, boolean flag, boolean flag1)
    {
        zzaDf = 10F;
        mColor = 0xff000000;
        zzaDa = 0.0F;
        zzaDb = true;
        zzaDC = false;
        zzCY = i;
        zzaDA = list;
        zzaDf = f;
        mColor = j;
        zzaDa = f1;
        zzaDb = flag;
        zzaDC = flag1;
    }

    public PolylineOptions add(LatLng latlng)
    {
        zzaDA.add(latlng);
        return this;
    }

    public transient PolylineOptions add(LatLng alatlng[])
    {
        zzaDA.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolylineOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); zzaDA.add(latlng))
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
        zzaDC = flag;
        return this;
    }

    public int getColor()
    {
        return mColor;
    }

    public List getPoints()
    {
        return zzaDA;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public float getWidth()
    {
        return zzaDf;
    }

    public float getZIndex()
    {
        return zzaDa;
    }

    public boolean isGeodesic()
    {
        return zzaDC;
    }

    public boolean isVisible()
    {
        return zzaDb;
    }

    public PolylineOptions visible(boolean flag)
    {
        zzaDb = flag;
        return this;
    }

    public PolylineOptions width(float f)
    {
        zzaDf = f;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public PolylineOptions zIndex(float f)
    {
        zzaDa = f;
        return this;
    }

}
